const isArmstron = (num) => {
  const temp = num;
  let res = 0;
  while (num > 0) {
    const r = num % 10;
    res = res + r * r * r;
    num = Math.trunc(num / 10);
  }
  return res == temp;
};

console.log(isArmstron(153));
console.log(isArmstron(121));
