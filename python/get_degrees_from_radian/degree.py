from math import pi

def radians_to_degrees(rad):
	deg = rad * (180 / pi)
	return round(deg, 1)

print(radians_to_degrees(1))