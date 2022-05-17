"""8 kyu Rock Paper Scissors!
Let's play! You have to return which player won! In case of a draw return Draw!.

Examples:

rps('scissors','paper') // Player 1 won!
rps('scissors','rock') // Player 2 won!
rps('paper','paper') // Draw!
"""
def rps(p1, p2):
    """Rock Paper Scissors

    Args:
        p1 (string): Rock Paper Scissors string
        p2 (string): Rock Paper Scissors string

    Returns:
        string: who won
    """
    #your code here
    if p1 == p2:
        return "Draw!"
    elif p1 == "scissors" and p2 == "paper":
        return "Player 1 won!"
    elif p1 == "scissors" and p2 == "rock":
        return "Player 2 won!"
    elif p1 == "rock" and p2 == "scissors":
        return "Player 1 won!"
    elif p1 == "rock" and p2 == "paper":
        return "Player 2 won!"
    elif p1 == "paper" and p2 == "scissors":
        return "Player 2 won!"
    elif p1 == "paper" and p2 == "rock":
        return "Player 1 won!"
      
# mejor solucion
def rps2(p1, p2):
    beats = {'rock': 'scissors', 'scissors': 'paper', 'paper': 'rock'}
    if beats[p1] == p2:
        return "Player 1 won!"
    if beats[p2] == p1:
        return "Player 2 won!"
    return "Draw!"
