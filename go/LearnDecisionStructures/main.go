package main

import "log"

func main() {
	var isTrue bool
	isTrue = true

	if isTrue {
		log.Println("isTrue is", isTrue)
	} else {
		log.Println("isTrue is", isTrue)
	}

	cat := "cat"

	if cat == "cat" {
		log.Println("Cat is cat")
	} else {
		log.Println("Cat is not cat")
	}

	myNum := 100

	if myNum > 99 && !isTrue {
		log.Println("MyNum is greater than 99 and isTrue is false")
	} else if myNum < 99 && !isTrue {
		log.Println("MyNum is less than 99 and isTrue is false")
	} else if myNum > 99  || !isTrue {
		log.Println("Either myNum is > 99 or isTrue is false")
	}

	// myVar := "meow"
	var myVar string

	switch myVar {
	case "meow":
		log.Println("myVar is set to meow")
	case "woof":
		log.Println("myVar is set to woof")
	case "ribbit":
		log.Println("myVar is set to ribbit")
	default:
		log.Println("myVar is set to hello")
	}
}