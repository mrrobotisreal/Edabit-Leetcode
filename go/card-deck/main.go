package main

import "fmt"

func main() {
	cards := newDeck()
	hand, remainingCards := deal(cards, 5)
	fmt.Println("This is your hand:")
	hand.print()
	fmt.Println("These are the remaining cards")
	remainingCards.print()
}