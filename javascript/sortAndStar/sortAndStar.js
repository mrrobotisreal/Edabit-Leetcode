/* Unfinished */

let testArr = ['bitcoin', 'take', 'over', 'the', 'world', 'maybe', 'who', 'knows', 'perhaps'];

function twoSort(s) {
  let asciiArr = [];
  for (let i = 0; i < s.length; i++) {
    asciiArr.push(s[i].charCodeAt())
  }
  console.log('asciiArr be like -> ', asciiArr);
  let asciiArrSort = asciiArr.sort((a, b) => {
    return a - b;
  });
  console.log('sorted asciiArr be like -> ', asciiArrSort);
}

twoSort(testArr);