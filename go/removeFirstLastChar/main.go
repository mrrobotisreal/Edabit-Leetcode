package main

import (
	"fmt"
)

func main() {
	fmt.Println(remove("eloquent"))
}

func remove(str string) (string) {
	sz := len(str)
	str = str[1:sz - 1]
	return str
}
