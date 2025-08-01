import logo from './logo.svg';
import officeSpace from './picture/officeSpace.jpg'
function App() {
  const ele = "Office Space";
  const imgAtt = <img src={officeSpace} style={{borderRadius:'50px'}} />
  const officeDetails = {name:"DBS",rent:5000,address:'Chennai'};
  const officeList = [
    officeDetails,
    { name: "Tidel Park", rent: 8000000, address: 'Coimbatore' },
    { name: "TechSpace", rent: 1200000, address: 'Hyderabad' }
  ];
  return (
    <div className="App" style={{padding:'50px'}}>
        <div style={{textAlign:'center'}}>
        <h1>{ele} , at Affordable Range</h1>
        {imgAtt}
        </div>
        <div style={{display:'flex',flexWrap:'wrap',columnGap:'50px',justifyContent:'center'}}>
          {officeList.map((office)=>(
              <div>
                <h5>Name : {office.name}</h5>
                {office.rent < 60000 ? (
                  <p style={{color:'red'}} ><b>Rent : </b>{office.rent}</p>
                ):(
                  <p style={{color:'green'}} ><b>Rent : </b>{office.rent}</p>
                )}
                <p><b>Address : </b>{office.address}</p>
              </div>
          ))}
        </div>
    </div>
  );
}

export default App;
