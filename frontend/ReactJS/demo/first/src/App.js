import logo from './logo.svg';
import './App.css';
import Home from './components/Home.js';
import Student from './components/Student.js';
import Add from './components/Add.js';
import DisplayArray from './components/DisplayArray.js';
import DisplayObject from './components/DisplayObject.js';
function App() {
  return (
    <div className="App">
      <h1>welcome to reactjs</h1>
      <Home/>
      <Student/>
      <Add />
      <DisplayArray/>
      <DisplayObject/>
    </div>
  );
}

export default App;
