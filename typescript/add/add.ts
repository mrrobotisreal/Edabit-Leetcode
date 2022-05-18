// This example is very simple
// It's purpose is to display how to use typescript in a function and with different types

function add(x: number, y: number, name: string) {
  let result: number = x + y;
  return `${name} says the answer is ${result}`;
}
console.log(add(1, 2, 'Mitch'));