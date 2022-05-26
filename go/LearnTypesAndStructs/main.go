package main

import (
	"log"
	"time"
)

type User struct {
	FirstName string
	LastName string
	PhoneNumber string
	Age int
	BirthDate time.Time
}

func main() {
	user := User {
		FirstName: "Mitchell",
		LastName: "Wintrow",
		PhoneNumber: "8675309",
		Age: 31,
	}

	log.Println(user.FirstName, user.LastName, "Age:", user.Age, "BirthDate:", user.BirthDate)
	log.Println(user.PhoneNumber)
}
