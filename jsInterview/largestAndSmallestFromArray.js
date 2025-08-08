const arr = [-4, 10, 5, 6, 99, -10, -20];

let largest = arr[0];
let smallest = arr[1];

arr.forEach((a) => {
  if (largest < a) {
    largest = a;
  }
  if (smallest > a) {
    smallest = a;
  }
});

console.log({ largest, smallest });
console.log('using math');
console.log(Math.max(...arr));
console.log(Math.min(...arr));
