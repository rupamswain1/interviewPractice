//WAP to find duplicate elements from array

const arr = ['a', 'b', 'c', 'd', 'a', 'b'];

let dupes = arr.filter((s, idx) => arr.indexOf(s) !== idx);
console.log({ dupes });
//with count

const dupeCount = {};

arr.forEach((s) => {
  if (!dupeCount[s]) {
    dupeCount[s] = 1;
  } else {
    dupeCount[s] = dupeCount[s] + 1;
  }
});
console.log({ dupeCount });
console.log(Object.keys(dupeCount).filter((s) => dupeCount[s] > 1));
