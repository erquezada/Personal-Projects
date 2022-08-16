from select import select

def add(num1,num2):
    return num1 + num2

def subtract(num1,num2):
    return num1 - num2

def multiply(num1,num2):
    return num1 * num2

def divide(num1, num2):
    return num1 / num2 

print("Please choose a valid operation")
print("Enter + for addition:")
print("Enter - for subtraction:")
print("Enter * for multiplication:")
print("Enter / for division:")

select = input("Select an operator from +, -, *, / :")
print("Enter two numbers")
number_1 = int(input())
number_2 = int(input())

if select == "+":
    print("The result is: ",add(number_1,number_2))

elif select == "-":
    print("The result is: ", subtract(number_1,number_2))

elif select == "*":
    print("The result is: ", multiply(number_1,number_2))

elif select == "/":
    print(divide("The result is: ",number_1,number_2))

else:
    print("Invalid input")
