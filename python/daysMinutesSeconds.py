daysAlive = 0
minutesAlive = 0
secondsAlive =  0

yearsAlive = int(input("How many years have you been alive: "))

daysAlive = yearsAlive * 365
minutesAlive = yearsAlive * 525600
secondsAlive =  yearsAlive * 3153600

print ("You've been alive for " + str(daysAlive) + " days, " + str(minutesAlive) + " minutes, and " + str(secondsAlive) + " seconds")