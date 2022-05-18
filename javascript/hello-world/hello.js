// ES6
const greetWorldES6 = (greeting, name) => {
  let greet = greeting;
  let world = name;
  return `${greet} ${world}!`;
};

console.log('ES6 example:');
console.log(greetWorldES6('Hello', '世界'));

// ES5
function greetWorldES5(greeting, name) {
  var greet = greeting;
  var world = name;
  return greet + ' ' + name + '!';
};

console.log('ES5 example:');
console.log(greetWorldES5('Hello', '世界'));