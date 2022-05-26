package main

import "log"

func main() {
	//----------Basic for loop-----------
	for i := 0; i <= 5; i++ {
		log.Println("i is currently", i)
	}

	animals := []string{"dog", "fish", "horse", "cat", "cow"}

	// Range loop (for...in from JavaScript)
	// i MUST be used in the loop or it will error
	// to avoid this use _
	for _, animal := range animals {
		log.Println(animal)
	}
	//---------------------------------------------------------
	//---------------------Map Range---------------------------

	animalsMap := make(map[string]string)
	animalsMap["dog"] = "Sadie"
	animalsMap["chicken"] = "chick-chick...chickedee"

	for animalType, animalMap := range animalsMap {
		log.Println(animalType, animalMap)
	}

	//--------------------------------------------------------
	//----------------------String Range-----------------------
	// Important Note:
	// A string is actually a slice of bytes
	// Therefore printing out an individual letter of a string (as seen below),
	// Will actually print out the numerical bytes for the letter
	// To view the actually letter and not the bytes, use string(letter)

	var firstLine = "Once upon a midnight dreary"

	for i, letter := range firstLine {
		log.Println(i, ":", letter)
		log.Println(i, ":", string(letter))
	}

	//---------------------------------------------------------
	//---------------------Struct Range------------------------

	type User struct {
		FirstName string
		LastName string
		Email string
		Age int
		IsAwesome bool
	}

	var users []User
	users = append(users, User{"Mitchell", "Wintrow", "me@email.com", 31, true})
	users = append(users, User{"Llehctim", "Wortniw", "weird@email.com", 33, false})
	users = append(users, User{"Van", "Pham", "beautiful@email.com", 27, true})
	users = append(users, User{"Sadie", "Dog", "woof@email.com", 16, true})


	for _, user := range users {
		log.Println(user.FirstName, user.LastName, user.Age, user.IsAwesome)
	}
}