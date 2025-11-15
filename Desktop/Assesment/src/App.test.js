import React from 'react';
import { render, screen, fireEvent } from '@testing-library/react';
import App from './App';

describe('App', () => {
  test('adds product to cart when Add to Cart is clicked', () => {
    render(<App />);
    
    const addButtons = screen.getAllByText('Add to Cart');
    fireEvent.click(addButtons[0]);
    
    expect(screen.getByText(/Quantity: 1/)).toBeInTheDocument();
  });

  test('increments quantity when same product is added multiple times', () => {
    render(<App />);
    
    const addButtons = screen.getAllByText('Add to Cart');
    fireEvent.click(addButtons[0]);
    fireEvent.click(addButtons[0]);
    
    expect(screen.getByText(/Quantity: 2/)).toBeInTheDocument();
  });

  test('removes product from cart when Remove is clicked', () => {
    render(<App />);
    
    const addButtons = screen.getAllByText('Add to Cart');
    fireEvent.click(addButtons[0]);
    
    const removeButton = screen.getByText('Remove');
    fireEvent.click(removeButton);
    
    expect(screen.getByText('Your cart is empty')).toBeInTheDocument();
  });

  test('filters products by category', () => {
    render(<App />);
    
    const electronicsButton = screen.getByRole('button', { name: 'Electronics' });
    fireEvent.click(electronicsButton);
    
    expect(screen.getByText('Laptop')).toBeInTheDocument();
    expect(screen.getByText('Smartphone')).toBeInTheDocument();
    expect(screen.queryByText('T-Shirt')).not.toBeInTheDocument();
  });
});
