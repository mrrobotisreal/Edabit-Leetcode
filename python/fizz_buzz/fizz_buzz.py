def fizz_buzz(num):
  for x in range(num + 1):
    if x == 0:
      continue
    elif x % 5 == 0 and x % 3 == 0:
      print("FizzBuzz")
    elif x % 5 == 0:
      print("Buzz")
    elif x % 3 == 0:
      print("Fizz")
    else:
      print(x)

# fizz_buzz(30)

def alternate_fizz_buzz(num):
  for x in range(num + 1):
    if x == 0:
      continue
    else:
      print("FizzBuzz") if x % 5 == 0 and x % 3 == 0 else print("Buzz") if x % 5 == 0 else print("Fizz") if x % 3 == 0 else print(x)

# alternate_fizz_buzz(30)

def weird_fizz_buzz(num):
  return "Fizz"*(num%3==0) + "Buzz"*(num%5==0) or str(num)

print(weird_fizz_buzz(18))
