import logo from './logo.svg';
import './App.css';
import Home from './components/Home.js';
import VariableDisplay from './components/VariableDisplay.js';
import Add from './components/Add.js';
import ConditionalRendering from './components/ConditionalRendering.js';
import ArrayDisplay from './components/ArrayDisplay.js';
import StudentObject from './components/StudentObject.js';
function App() {
  return (
    <div className="App">
      <h3>welcome to reactjs</h3>
      <Home/>
      <VariableDisplay/>
      <Add/>
      <ConditionalRendering/>
      <ArrayDisplay/>
      <StudentObject/>
    </div>
  );
}

export default App;
