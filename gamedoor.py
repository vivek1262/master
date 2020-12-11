import random

def doorgame():
    life = 5
    while life > 0:
        door = random.randint(1,5)
        print("Door: ",door)
        print("Life: ",life)
        life -=1
        guess = int(input("Enter a guess door:"))
        if guess != door:
            if life > 0:
                print("Guess again!")
                continue
            else:
                print("You lose")
        else:
            print("Well done")
        print("Do you want to play")
        q = input('yes or no').lower()[0]
        if q == "y":
            life = 5
        else:
            life = 0
    else:
        print("Game over")
        print("Thanks for playing")

doorgame()




