""""

This module contains basic unit tests for math operation.
Their purpose is to show how to use the pytest framework by example
"""

import pytest


# ------------------------
# A most basic test function
# ------------------------

@pytest.mark.math
def test_one_plus_one():
    assert 1 + 1 == 2

# ------------------------
# A test function to show assertion introspection
# ------------------------

@pytest.mark.math
def test_one_plus_two():
    a = 1
    b = 2
    c = 3
    assert a + b == c

# ------------------------
# A test function that verifies an exception
# -------

@pytest.mark.math
def test_divide_by_zero():
    with pytest.raises(ZeroDivisionError) as e:
        num = 1 / 0
    assert 'division by zero' in str(e.value)


# ------------------------
# A test function for multiplication
# -------

# two positives integers
# indentity: multiplying any number by 1
# zero: multiplying any number by 0
# positive by a negative
# positive by a negative
# negative by a positive
# multiply floats

products = [
    (2, 3, 6),                    # postive integers
    (1, 99, 99),                  # identity
    (0, 99, 0),                   # zero
    (3, -4, -12),                 # positive by negative
    (-5, -5, 25),     	          # negative by negative
    (2.5, 6.7, 16.75)             # floats
]

@pytest.mark.parametrize('a, b, product', products)
@pytest.mark.math
def test_multiplication(a, b, product):
  assert a * b == product
