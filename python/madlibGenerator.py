import time
import sys

name = ''
noun1 = ''
verb1 = ''
famousPerson = ''
noun2 = ''
adj = ''
bookTitle = ''
number =  ''
verb2 = ''
letter = ''
noun3 = ''
adj2 = ''
verb3 = ''
noun4 = ''    

def answerProcess():

    print('Welcome to the Madlib Processor!')
    time.sleep(1)
    name = str(input("Enter in the name of a boy or girl in the room: "))
    noun1 = str(input('Enter in a noun: '))
    verb1 = str(input('Enter in a verb (ending with -ing): '))
    famousPerson = str(input('Enter in the name of a famous person: '))
    noun2 = str(input('Enter in a noun: '))
    adj = str(input('Enter in an adjective: '))
    bookTitle = str(input('Enter in a title of a book: '))
    number = str(input('Enter in a number: '))
    verb2 = str(input('Enter in a present tense verb: '))
    letter = str(input('Enter in a letter: '))
    noun3 = str(input('Enter in a noun: '))
    adj2 = str(input('Enter in an adjective: '))
    verb3 = str(input('Enter in a verb: '))
    noun4 = str(input('Enter in a noun: '))
    print ('Teacher: All right, ' + name + '.' + ' The ' + noun1 + ' ran; be quiet, take your seat, and stop ' + verb1 + '!')
    print ("Student: Awww. It wasn't my fault. " + famousPerson + ' started it. They took my ' + noun2 + '.')
    print ("Teacher: Did you do the " + adj + " book report I assigned?")
    print ("No, I read " + bookTitle + " instead.")
    print ('You were supposed to write ' + number + " pages. If you don't " + verb2 + ' harder, I am going to be forced to give you a/an ' + letter + ' in ' + noun3)
    print ("Aww teacher, you're too " + adj2 + ".")
    print ("Just for that, you can stay after school and wash the " + noun4 + '.')

answerProcess()