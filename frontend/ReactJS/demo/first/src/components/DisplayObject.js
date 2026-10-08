function DisplayObject()
{ 
    const student={
        id:101,
        name:"ramu",
        age:20
    }
    return(
<div><h3>Student name:{student.name}</h3>
        <h3>Student id:{student.id}</h3>
        <h3>Student age:{student.age}</h3>
</div>

    );
}
export default DisplayObject;