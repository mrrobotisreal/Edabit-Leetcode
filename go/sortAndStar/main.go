package main

import (
	"fmt"
	"sort"
)

func main() {
	var outArr []string = {"bitcoin", "will", "take", "over", "the", "World"}
	fmt.Println(TwoSort(outArr))
}

func TwoSort(arr []string) string {
	var asciiArr []int
	for i := 0; i < arr.length; i++ {
		asciiArr = append(asciiArr, int(arr[i]))
	}
	fmt.Println("Before:")
	fmt.Println(asciiArr)
	sort.Ints(asciiArr)
	fmt.Println("After:")
	fmt.Println(asciiArr)
}