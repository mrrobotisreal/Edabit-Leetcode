package main

import "fmt"

func main() {
	fmt.Println(smallestIntFinder([]int{34, 15, 88, 2}))
}

func smallestIntFinder(numbers []int) int {
	var smallest int = numbers[0]
	for _, num := range numbers {
		if num < smallest {
			smallest = num
		}
	}
	return smallest
}
