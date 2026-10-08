function DisplayArray()
{
    const fruits=["banana","orange","mango","grapes"]

    const isLogin=true;
    return(<div>
        <h3>{fruits[0]}</h3>
        <h3>{fruits[1]}</h3>
        <h3>{fruits[2]}</h3>
        <h3>{fruits[3]}</h3>
           <p>{isLogin?<h3>login successfully!</h3>:<h3>invalid credentials!</h3>}</p> 
    </div>);
}

export default DisplayArray;