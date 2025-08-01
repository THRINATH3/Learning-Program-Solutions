import { useState } from 'react';
import logo from './logo.svg';
import CurrencyConvertor from './components/CurrencyConvertor';

function App() {
  const [count,setCount] = useState(0);
  function increment(){
      setCount(count+1);
      alert("Hello! Member"+count);
  }
  function decrement(){
      setCount(count-1);
  }
  function welcome(){
    alert("welcome");
  }
  function click(){
    alert("I was clicked");
  }
  return (
    <div className="App" style={{padding:'50px'}}>

      <h2>Count - {count}</h2>
      <div style={{display:'flex',flexDirection:'column',width:'200px',rowGap:'10px'}}>
      <button style={{padding:'10px',backgroundColor:'red',borderRadius:'10px',color:'white',cursor:'pointer'}} onClick={increment}>Increment</button>
      <button style={{padding:'10px',backgroundColor:'darkgreen',borderRadius:'10px',color:'white',cursor:'pointer'}} onClick={decrement}>Decrement</button>
      <button style={{padding:'10px',backgroundColor:'orange',borderRadius:'10px',color:'white',cursor:'pointer'}} onClick={welcome}>Say Welcome</button>
      <button style={{padding:'10px',backgroundColor:'darkslategrey',borderRadius:'10px',color:'white',cursor:'pointer'}} onClick={click}>Click on me</button>
      </div>
      <CurrencyConvertor />
    </div>
  );
}

export default App;
