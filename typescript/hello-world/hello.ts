// This first example is a very simple and easy
let greeting:string = 'Hello';
let world:string = '世界';

console.log('String 1:');
console.log(`${greeting} ${world}!`);


// This second example demonstrates the same thing,
// but with an interface and template literals
interface WorldGreeting {
  greeting: string,
  name: string
};

const newGreeting: WorldGreeting = {
  greeting: 'Hello',
  name: '世界'
};

console.log('String 2:');
console.log(`${newGreeting.greeting} ${newGreeting.name}!`);