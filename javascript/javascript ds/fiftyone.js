function message(){
    console.log("Welcome");
}

function greet(callback){
    console.log("Hello");
    callback();
}

greet(message);
