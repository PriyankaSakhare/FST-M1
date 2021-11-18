import pytest

@pytest.mark.sum
def test_sum():
    num1 =4
    num2 =4
    sum = num1+num2
    assert sum==8

@pytest.mark.diff
def test_diff():
    num1=10
    num2=2
    diff= num1-num2
    assert diff ==8

def test_product():
    num1=2
    num2=2
    product= num1*num2
    assert product ==4

def test_quotient():
    num1=10
    num2=2
    quotient= num1/num2
    assert quotient ==5

