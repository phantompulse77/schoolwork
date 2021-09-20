import time
import random

secretNumber = random.randint(1000,9999)
guess = 0
numOfCorrectDigits = 0

def gameLoop():

    time.sleep(2)

    numOfCorrectDigits = 0

    guess = int(input("Type in your guess. "))
    strGuess = str(guess)

    if guess == secretNumber:
        print ("Your guess is correct! Congratulations!")
    
    if guess != secretNumber:
        if strGuess[-4] == str(secretNumber)[-4]:
                numOfCorrectDigits = numOfCorrectDigits + 1
        if strGuess[-3] == str(secretNumber)[-3]:
                numOfCorrectDigits = numOfCorrectDigits + 1
        if strGuess[-2] == str(secretNumber)[-2]:
                numOfCorrectDigits = numOfCorrectDigits + 1
        if strGuess[-1] == str(secretNumber)[-1]:
                numOfCorrectDigits = numOfCorrectDigits + 1
        print("Your answer is incorrect! " + str(numOfCorrectDigits) + " out of 4 of the digits guessed were correct.")
        gameLoop()
    
                


    

print ("In this game, you must guess a number, of which is 4 digits long.")
time.sleep(2)
gameLoop()