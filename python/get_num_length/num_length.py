# Get the length of a number without using len()
def number_length(num):
  strNum = str(num)
  count = 0
  for digit in strNum:
    count += 1
  return count

print(number_length(5000)) # 4
print(number_length(50)) # 2

# Alternatively, we could more succinctly do it like so:
# def number_length(num):
#   return sum(1 for i in str(num))