package main

import (
	"log"
	"sort"
)

type User struct {
	FirstName string
	LastName string
}

func main() {
	log.Println("---------------------------------------------------------")
	log.Println("--------------------------MAPS---------------------------")
	log.Println("---------------------------------------------------------")
	maps()
	log.Println("---------------------------------------------------------")
	log.Println("-------------------------SLICES--------------------------")
	log.Println("---------------------------------------------------------")
	slices()
}

func maps() {
	myMap := make(map[string]string)

	myMap["dog"] = "Sadie"
	myMap["chicken"] = "Chicky"

	log.Println(myMap["dog"])
	log.Println(myMap["chicken"])
	log.Println(myMap)
	//-----------------------------

	myMap2 := make(map[string]int)

	myMap2["First"] = 1
	myMap2["Second"] = 2
	myMap2["Third"] = 3

	log.Println(myMap2["First"], myMap2["Second"], myMap2["Third"])
	//--------------------------------------------------------------

	myMap3 := make(map[string]User)

	me := User {
		FirstName: "Mitchell",
		LastName: "Wintrow",
	}

	myMap3["me"] = me
	log.Println(myMap3["me"].FirstName)
	//----------------------------------

	myMap4 := make(map[int]int)

	myMap4[1] = 13
	log.Println(myMap4[1])
}

func slices() {
	var mySlice []string

	mySlice = append(mySlice, "Mitchell")
	mySlice = append(mySlice, "Wintrow")
	mySlice = append(mySlice, "is")
	mySlice = append(mySlice, "awesome!")

	log.Println(mySlice)
	//--------------------------------------

	var myIntSlice []int

	myIntSlice = append(myIntSlice, 2)
	myIntSlice = append(myIntSlice, 1)
	myIntSlice = append(myIntSlice, 3)

	log.Println(myIntSlice)

	sort.Ints(myIntSlice)

	log.Println("After sorting", myIntSlice)
	//----------------------------------------

	numbers := []int{1, 2, 3, 4, 5, 6, 7, 8, 9}

	log.Println(numbers)
	log.Println("Only the first 3 numbers are", numbers[:3])
	log.Println("Only the last 3 nubmers are", numbers[len(numbers) - 3:len(numbers)])
}