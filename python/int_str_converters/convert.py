# This first function makes use of a library function called str()
# The second function shows us how to convert it in a less-traditional way
def int_to_str(num):
  newNum = str(num)
  return newNum

print(int_to_str(123))
print(type(int_to_str(123)))

def str_to_int(num):
  values = {'0':0, '1':1, '2':2, '3':3, '4':4, '5':5, '6':6, '7':7, '8':8, '9':9}
  result = 0
  for digit in num:
    result = 10 * result + values[digit]
  return result

print(str_to_int('546'))
print(type(str_to_int('546')))