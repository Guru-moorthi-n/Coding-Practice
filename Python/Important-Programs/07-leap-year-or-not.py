year = int(input("Enter year: "))

if (year%400 == 0) or (year%4 == 0 and year%100 != 0):
    print(year, "is Leap year.")
else:
    print(year, "is Not Leap year.")


# Using Calendar module
import calendar

def leapYear(year):
    ans = calendar.isleap(year)
    print("Leap year.") if (ans == True) else print("Not leap year.")
 
leapYear(year)