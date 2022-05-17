def findDiscount(price, discount):
  return round(price - (price * discount) / 100, 2)

print(findDiscount(1500, 50)) # 750.0
print(findDiscount(33, 33)) # 22.11