function StudentObject()
{
    const Student={
        "id":1,
        "name":"ramu",
        "address":"hyderabad"
    }
    return (<div>
            <ol>
                <li><h3>id of student:{Student.id}</h3></li>
                <li><h3>name of student:{Student.name}</h3></li>
                <li><h3>address of student:{Student.address}</h3></li>

            </ol>
    </div>);
}
export default StudentObject;