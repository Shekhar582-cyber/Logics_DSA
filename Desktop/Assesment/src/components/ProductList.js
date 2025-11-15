import React from 'react';
import ProductCard from './ProductCard';
import initialProducts from '../data/products';
import './ProductList.css';

function ProductList({ selectedCategory, onCategoryChange, onAddToCart }) {
  const categories = ['All', 'Electronics', 'Books', 'Clothing'];
  
  const filteredProducts = selectedCategory === 'All'
    ? initialProducts
    : initialProducts.filter(product => product.category === selectedCategory);

  return (
    <div className="product-list">
      <div className="filter-controls">
        {categories.map(category => (
          <button
            key={category}
            className={`filter-btn ${selectedCategory === category ? 'active' : ''}`}
            onClick={() => onCategoryChange(category)}
          >
            {category}
          </button>
        ))}
      </div>
      
      <div className="products-grid">
        {filteredProducts.map(product => (
          <ProductCard
            key={product.id}
            product={product}
            onAddToCart={onAddToCart}
          />
        ))}
      </div>
    </div>
  );
}

export default ProductList;
