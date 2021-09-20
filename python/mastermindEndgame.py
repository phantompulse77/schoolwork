import time
import random

secretNumber = random.randint(1000,9999)
guess = 0
numOfCorrectDigits = 0
endgameSpoiler = "Iron Man dies"
incorrectTriesNum = 0

def gameLoop():

    time.sleep(1)
    global incorrectTriesNum
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
        incorrectTriesNum = incorrectTriesNum + 1
        
        if incorrectTriesNum == 1:
                print (endgameSpoiler[-13])
        if incorrectTriesNum == 2:
                print (endgameSpoiler[-13] + endgameSpoiler[-12])
        if incorrectTriesNum == 3:
                print (endgameSpoiler[-13] + endgameSpoiler[-12] + endgameSpoiler[-11])
        if incorrectTriesNum == 5:
                print (endgameSpoiler[-13] + endgameSpoiler[-12] + endgameSpoiler[-11] + endgameSpoiler[-10])
        if incorrectTriesNum == 6:
                print (endgameSpoiler[-13] + endgameSpoiler[-12] + endgameSpoiler[-11] + endgameSpoiler[-10] + endgameSpoiler[-9])
        if incorrectTriesNum == 7:
                print (endgameSpoiler[-13] + endgameSpoiler[-12] + endgameSpoiler[-11] + endgameSpoiler[-10] + endgameSpoiler[-9] + endgameSpoiler[-8])
        if incorrectTriesNum == 8:
                print (endgameSpoiler[-13] + endgameSpoiler[-12] + endgameSpoiler[-11] + endgameSpoiler[-10] + endgameSpoiler[-9] + endgameSpoiler[-8] + endgameSpoiler[-7])
        if incorrectTriesNum == 9:
                print (endgameSpoiler[-13] + endgameSpoiler[-12] + endgameSpoiler[-11] + endgameSpoiler[-10] + endgameSpoiler[-9] + endgameSpoiler[-8] + endgameSpoiler[-7] + endgameSpoiler[-6])
        if incorrectTriesNum == 10:
                print (endgameSpoiler[-13] + endgameSpoiler[-12] + endgameSpoiler[-11] + endgameSpoiler[-10] + endgameSpoiler[-9] + endgameSpoiler[-8] + endgameSpoiler[-7] + endgameSpoiler[-6] + endgameSpoiler[-5])
        if incorrectTriesNum == 11:
                print (endgameSpoiler[-13] + endgameSpoiler[-12] + endgameSpoiler[-11] + endgameSpoiler[-10] + endgameSpoiler[-9] + endgameSpoiler[-8] + endgameSpoiler[-7] + endgameSpoiler[-6] + endgameSpoiler[-5] + endgameSpoiler[-4])
        if incorrectTriesNum == 12:
                print (endgameSpoiler[-13] + endgameSpoiler[-12] + endgameSpoiler[-11] + endgameSpoiler[-10] + endgameSpoiler[-9] + endgameSpoiler[-8] + endgameSpoiler[-7] + endgameSpoiler[-6] + endgameSpoiler[-5] + endgameSpoiler[-4] + endgameSpoiler[-3])
        if incorrectTriesNum == 13:
                print (endgameSpoiler[-13] + endgameSpoiler[-12] + endgameSpoiler[-11] + endgameSpoiler[-10] + endgameSpoiler[-9] + endgameSpoiler[-8] + endgameSpoiler[-7] + endgameSpoiler[-6] + endgameSpoiler[-5] + endgameSpoiler[-4] + endgameSpoiler[-3] + endgameSpoiler[-2])
        if incorrectTriesNum == 14:
                print ("Why are you even trying anymore...")
        gameLoop()
    
print ("In this game, you must guess a number, of which is 4 digits long. If you're incorrect, an Endgame spoiler will be slowly revealed to you.")
time.sleep(2)
gameLoop()