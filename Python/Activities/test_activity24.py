import pytest

@pytest.mark.fixture
@pytest.fixture
def walletamount():
    amount = 0
    return amount

	
@pytest.mark.parametrize("earned, spent, expected", [ (30, 10, 20), (20, 2, 18) ])
def test_transactions(walletamount, earned, spent, expected):
	
    
    walletamount += earned
 
    
    walletamount -= spent
 
    
    assert walletamount == expected