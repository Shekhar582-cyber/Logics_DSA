import React from 'react';
import { render, screen, fireEvent } from '@testing-library/react';
import ShoppingCart from './ShoppingCart';

describe('ShoppingCart', () => {
  const mockOnRemoveFromCart = jest.fn();

  beforeEach(() => {
    jest.clearAllMocks();
  });

  test('displays empty cart message when cart is empty', () => {
    render(<ShoppingCart cart={[]} onRemoveFromCart={mockOnRemoveFromCart} />);
    
    expect(screen.getByText('Your cart is empty')).toBeInTheDocument();
  });

  test('calculates total price correctly', () => {
    const cart = [
      { id: 1, name: 'Laptop', price: 1200, quantity: 1 },
      { id: 2, name: 'T-Shirt', price: 25, quantity: 2 }
    ];
    
    render(<ShoppingCart cart={cart} onRemoveFromCart={mockOnRemoveFromCart} />);
    
    expect(screen.getByText('Total: $1250.00')).toBeInTheDocument();
  });

  test('calls onRemoveFromCart when Remove button is clicked', () => {
    const cart = [
      { id: 1, name: 'Laptop', price: 1200, quantity: 1 }
    ];
    
    render(<ShoppingCart cart={cart} onRemoveFromCart={mockOnRemoveFromCart} />);
    
    const removeButton = screen.getByText('Remove');
    fireEvent.click(removeButton);
    
    expect(mockOnRemoveFromCart).toHaveBeenCalledWith(1);
  });
});
