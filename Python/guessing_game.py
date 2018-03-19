import random
 
computer_guess = random.randint(1, 10)
your_guess = int(input("Pick a number between 1-10!\n"))
count = 0
while your_guess != computer_guess:
    count += 1
    if your_guess > computer_guess:
        print("You were too high!")
        your_guess = int(input("Pick another number!\n"))
    else:
        print("You were too low!")
        your_guess = int(input("Pick another number!\n"))
 
print("gj only took u {} guesses".format(count))