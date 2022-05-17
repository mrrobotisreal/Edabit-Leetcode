package main

import "fmt"

func main() {
	// shortcut syntax is preferred
	// but this is the formal way:
	// var greeting string = "Hello"
	greeting := "Hello"
	name := "世界"
	fmt.Println(greeting + " " + name + "!")
}