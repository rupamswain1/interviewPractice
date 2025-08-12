const findPrime = (num) => {
  if (num <= 1) return num;
  if (num == 2) return true;
  if (num % 2 == 0) return false;
  for (let i = 3; i < Math.sqrt(num); i += 2) {
    if (num % i == 0) {
      return false;
    }
  }
  return true;
};

console.log(findPrime(2));
console.log(findPrime(5));
console.log(findPrime(100));
