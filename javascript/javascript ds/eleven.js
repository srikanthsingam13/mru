let numbers=[1,2,3,4,5];
console.log(numbers[0]);
console.log(numbers[1]);
console.log(numbers[2]);
console.log(numbers[3]);
console.log(numbers.length);
numbers.push(6);
console.log(numbers[5]);
numbers.pop();
for(let i=0;i<=4;i++)
{
    console.log(numbers[i]);
}

for(let number of numbers)
{
    console.log(number);
}