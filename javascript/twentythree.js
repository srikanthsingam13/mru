let numbers=[1,2,3,4,5];
console.log(numbers[0]);
console.log(numbers[1]);
console.log(numbers[2]);
console.log(numbers[3]);
console.log(numbers[4]);
console.log("---------------------");
console.log(numbers.length);


numbers.push(6);
for(let number of numbers)
{
    console.log(number);
}
numbers.pop();
for(let number of numbers)
{
    console.log(number);
}