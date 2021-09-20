import pandas
import time
import colorama

from colorama import Fore, Back, Style

colorama.init()

amountBorrowed = 0
interestRate = 0
lengthOfLoan = 0
interestAmount = 0
paymentMonthly = 0


def main():
    print ("Welcome to the Loan Payment Calculator!")
    time.sleep(1)
    print ("The program will take input from you, and output a loan payment schedule chart.")
    time.sleep (1)
    amountBorrowed = int(input("Enter in the amount you've borrowed: "))
    time.sleep(1)
    interestRate =  int(input("Enter in the interest the loaner has set (in percent without percent sign): "))
    interestRate = interestRate * 0.01 + 1
    time.sleep(1)
    lengthOfLoan = int (input("Enter in the payment period, the amount of time you must repay your loan in (in years): "))
    lengthOfLoan = lengthOfLoan * 12
    interestAmount = amountBorrowed * interestRate - amountBorrowed
    paymentMonthly = (amountBorrowed + interestAmount) / lengthOfLoan

    if type(paymentMonthly) == float:
            paymentMonthly = round(paymentMonthly, 2)

    print (Fore.GREEN + "In total, you'll be paying back: " + str(amountBorrowed + interestAmount))
    time.sleep(2)
    print (Fore.GREEN + "You'll be paying back for " + str(lengthOfLoan) + " months.")
    time.sleep(1)
    print(Fore.GREEN + "And you'll be paying " + str(paymentMonthly) + " dollars every month.")  
main()