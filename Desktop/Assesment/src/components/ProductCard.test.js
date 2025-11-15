import React from 'react';
import { render, screen, fireEvent } from '@testing-library/react';
import ProductCard from './ProductCard';

describe('ProductCard', () => {
  const mockProduct = {
    id: 1,
    name: 'Laptop',
    category: 'Electronics',
    price: 1200
  };

  const mockOnAddToCart = jest.fn();

  test('renders product details correctly', () => {
    render(<ProductCard product={mockProduct} onAddToCart={mockOnAddToCart} />);
    
    expect(screen.getByText('Laptop')).toBeInTheDocument();
    expect(screen.getByText('Electronics')).toBeInTheDocument();
    expect(screen.getByText('$1200.00')).toBeInTheDocument();
  });

  test('calls onAddToCart when Add to Cart button is clicked', () => {
    render(<ProductCard product={mockProduct} onAddToCart={mockOnAddToCart} />);
    
    const addButton = screen.getByText('Add to Cart');
    fireEvent.click(addButton);
    
    expect(mockOnAddToCart).toHaveBeenCalledWith(mockProduct);
    expect(mockOnAddToCart).toHaveBeenCalledTimes(1);
  });
});
