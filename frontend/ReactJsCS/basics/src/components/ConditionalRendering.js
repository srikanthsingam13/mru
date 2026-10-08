function ConditionalRendering()
{
    const isLogin=true;
    return (<div>
     {isLogin?<h3>login success</h3>:<h3>login fail</h3>}

    </div>);
}
export default ConditionalRendering;