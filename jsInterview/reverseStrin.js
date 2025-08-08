//WAP to reverse a string

let s = 'Hello';
let rev = '';
for (let i = s.length - 1; i >= 0; i--) {
  rev = rev + s[i];
}
console.log({ rev });

console.log(s.split('').reverse().join(''));
