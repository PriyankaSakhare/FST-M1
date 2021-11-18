player1 =input("enter your pref of player 1")
player2 =input ("enter your pref of player 1")
	
if player1 == player2:
    print("It's a tie!")
elif player1 == 'rock':
    if player2 == 'scissors':
        print("Rock wins!")
    else:
        print("Paper wins!")
elif player1== 'scissors':
    if player2 == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif player1 == 'paper':
    if player2 == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input")



