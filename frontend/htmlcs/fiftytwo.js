function message()
{
    console.log("hello");
}
function greet(callback)
{
    console.log("greet");
    callback();
}

greet(message);