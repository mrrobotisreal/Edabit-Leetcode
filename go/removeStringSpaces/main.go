package main

import (
	"fmt"
	"strings"
)

func main() {
	fmt.Println(removeStringSpace("M i t c h e l l"))
}

func removeStringSpace(word string) string {
	words := strings.Split(word, " ")
	word = strings.Join(words, "")
	return word
}