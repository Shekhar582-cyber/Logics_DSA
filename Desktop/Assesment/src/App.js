import React, { useState } from 'react';
import ProductList from './components/ProductList';
import ShoppingCart from './components/ShoppingCart';
import './App.css';

function App() {
  // Initialize cart state as empty array
  const [cart, setCart] = useState([]);
  
  // Initialize selectedCategory state as "All"
  const [selectedCategory, setSelectedCategory] = useState('All');

  // Add product to cart or increment quantity if exists
  const addToCart = (product) => {
    const existingItem = cart.find(item => item.id === product.id);
    
    if (existingItem) {
      // Product exists, increment quantity
      setCart(cart.map(item =>
        item.id === product.id
          ? { ...item, quantity: item.quantity + 1 }
          : item
      ));
    } else {
      // New product, add with quantity 1
      setCart([...cart, { ...product, quantity: 1 }]);
    }
  };

  // Remove product from cart by id
  const removeFromCart = (productId) => {
    setCart(cart.filter(item => item.id !== productId));
  };

  // Update selected category filter
  const handleCategoryChange = (category) => {
    setSelectedCategory(category);
  };

  return (
    <div className="App">
      <h1>Dynamic Product Filter & Cart</h1>
      
      <div className="app-container">
        <ProductList
          selectedCategory={selectedCategory}
          onCategoryChange={handleCategoryChange}
          onAddToCart={addToCart}
        />
        
        <ShoppingCart
          cart={cart}
          onRemoveFromCart={removeFromCart}
        />
      </div>
    </div>
  );
}

export default App;
