ans = False

high = 100
low = 0

input("enter the number between 1 and 100.please enter the number")

while not ans:
    guess = (high-low)//2 + low
    print(f'it is your number(guess)')

resp = input("""Enter 'h' to indicate high.
                Enter 'l' to indicate low.
                Enter 'c' to indicate guesses correct number.
                Enter answer: """ ).lower()


if resp == 'h':
    high = guess
elif resp == 'l':
    low = guess
elif resp == 'c':
    print("Thanks for playing.")
ans = True



