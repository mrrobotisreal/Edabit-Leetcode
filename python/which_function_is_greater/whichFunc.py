# Determine which functions return value is greater than the other
# If both are equal, return 'neither'
# If f is greater then return 'f' otherwise return 'g'
def f():
  return 25

def g():
  return 25

def whichIsLarger(f, g):
  return 'neither' if f() == g() else 'f' if f() > g() else 'g'

print(whichIsLarger(f, g))