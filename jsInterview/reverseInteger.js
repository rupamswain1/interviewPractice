//WAP to reverse a intger
let s = 12345;

let reverse = 0;
while (s != 0) {
  reverse = reverse * 10 + (s % 10);
  s = Math.trunc(Math.abs(s / 10));
}
console.log({ reverse });
//
console.log('------');
s = 12345;
reverse = Number(s.toString().split('').reverse().join(''));
console.log({ reverse });
