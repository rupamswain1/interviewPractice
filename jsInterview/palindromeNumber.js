const findPalindrome = (num) => {
  const temp = num;
  let rev = 0;
  while (num > 0) {
    rev = rev * 10 + parseInt(num % 10);
    num = Math.trunc(num / 10);
  }
  console.log({ rev });
};

console.log(findPalindrome(121) === 121);
