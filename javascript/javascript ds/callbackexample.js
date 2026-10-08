function display(name,callback)
{
    console.log("display method...");
    callback();
}
function show()
{
    console.log("show method");

}
display("ramu",show);

console.log("ordered pizza");
setTimeout(()=>{
    console.log("pizza ready")
},3000);
console.log("waiting...");