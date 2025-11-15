import React from 'react';
import { render, screen, fireEvent } from '@testing-library/react';
import ProductList from './ProductList';

describe('ProductList', () => {
  const mockOnCategoryChange = jest.fn();
  const mockOnAddToCart = jest.fn();

  beforeEach(() => {
    jest.clearAllMocks();
  });

  test('displays all products when "All" category is selected', () => {
    render(
      <ProductList
        selectedCategory="All"
        onCategoryChange={mockOnCategoryChange}
        onAddToCart={mockOnAddToCart}
      />
    );
    
    expect(screen.getByText('Laptop')).toBeInTheDocument();
    expect(screen.getByText('T-Shirt')).toBeInTheDocument();
    expect(screen.getByText('The Great Gatsby')).toBeInTheDocument();
    expect(screen.getByText('Smartphone')).toBeInTheDocument();
    expect(screen.getByText('Jeans')).toBeInTheDocument();
    expect(screen.getByText('Sapiens')).toBeInTheDocument();
  });

  test('filters products by Electronics category', () => {
    render(
      <ProductList
        selectedCategory="Electronics"
        onCategoryChange={mockOnCategoryChange}
        onAddToCart={mockOnAddToCart}
      />
    );
    
    expect(screen.getByText('Laptop')).toBeInTheDocument();
    expect(screen.getByText('Smartphone')).toBeInTheDocument();
    expect(screen.queryByText('T-Shirt')).not.toBeInTheDocument();
    expect(screen.queryByText('The Great Gatsby')).not.toBeInTheDocument();
  });

  test('calls onCategoryChange when category button is clicked', () => {
    render(
      <ProductList
        selectedCategory="All"
        onCategoryChange={mockOnCategoryChange}
        onAddToCart={mockOnAddToCart}
      />
    );
    
    const electronicsButton = screen.getByRole('button', { name: 'Electronics' });
    fireEvent.click(electronicsButton);
    
    expect(mockOnCategoryChange).toHaveBeenCalledWith('Electronics');
  });
});
