# Check if circumference of circle is great than the area of a square
# If circle is greater, return True, otherwise return False
import math

def circle_or_square(rad, area):
	circle = 2 * math.pi * rad
	square = 4 * (math.sqrt(area))
	return True if circle > square else False