temperatureValue = 0
temperatureType = str(input("Fahrenheit (F)? Or Celsius (C)? "))

if temperatureType == "C":
    temperatureValue = int(input("Please enter in your temperature in Celsius: "))
    temperatureValue = temperatureValue * 9/5
    temperatureValue = temperatureValue + 32

if temperatureType == "F":
    temperatureValue = int(input("Please enter in your temperature in Fahrenheit: "))
    temperatureValue =  temperatureValue - 32
    temperatureValue = temperatureValue * 5/9
    

print (temperatureValue)