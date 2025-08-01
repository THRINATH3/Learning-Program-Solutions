import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import LoginButton from './components/LoginButton';
import LogoutButton from './components/LogoutButton';
import Greeting from './components/Greeting';

function App() {
  const [isLoggedIn,setisLoggedIn] = useState(false);
  function onClick(){
      setisLoggedIn(!isLoggedIn);
  }
  return (
    <div className="App">
      <Greeting isLoggedIn={isLoggedIn} />
      {isLoggedIn?(
        <LogoutButton onClick = {onClick} />
      ):(
        <LoginButton onClick = {onClick}/>
      )}
    </div>
  );
}

export default App;
