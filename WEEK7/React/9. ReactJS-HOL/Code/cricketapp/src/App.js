import { useState } from 'react';
import Allplayers from './components/Allplayers';
import ListOfPlayers from './components/ListOfPlayers';

function App() {
  const [flag,setFlag] = useState(true);
  function changeFlag(){
    setFlag(!flag);
  }
  return (
    <div className="App">
      <div style={{textAlign:'center',margin:'30px'}}>
      <button style={{width:'200px',backgroundColor:'skyblue',borderRadius:'50px',padding:'10px',cursor:"pointer"}} onClick={changeFlag}>Change the Flag Value</button>
      <p>Now the falg value is : {flag.toString()}</p>
      </div>
      {flag ? (
        <ListOfPlayers />
      ):(
        <Allplayers />
      )}
      
    </div>
  );
}

export default App;
