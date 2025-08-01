import logo from './logo.svg';
import officeSpace from './picture/officeSpace.jpg'
import officeSpace2 from './picture/officeSpace2.jpg'
import officeSpace3 from './picture/officeSpace3.jpg'
function App() {
  const ele = "Office Space";
  const imgAtt1 = <img src={officeSpace} style={{borderRadius:'50px'}} />
  const imgAtt2 = <img src={officeSpace2} style={{borderRadius:'50px'}} />
  const imgAtt3 = <img src={officeSpace3} style={{borderRadius:'50px'}} />
  const officeDetails = {name:"DBS",rent:5000,address:'Chennai',pic:imgAtt1};
  const officeList = [
    officeDetails,
    { name: "Tidel Park", rent: 8000000, address: 'Coimbatore',pic:imgAtt2},
    { name: "TechSpace", rent: 1200000, address: 'Hyderabad',pic:imgAtt3}
  ];
  return (
    <div className="App" style={{padding:'50px'}}>
        <div style={{textAlign:'center'}}>
        <h1>{ele} , at Affordable Range</h1>
        </div>
        <div style={{display:'flex',flexWrap:'wrap',columnGap:'50px',justifyContent:'center'}}>
          {officeList.map((office)=>(
              <div>
                {office.pic}
                <div style={{textAlign:'center'}}>
                <h5>Name : {office.name}</h5>
                {office.rent < 60000 ? (
                  <p style={{color:'red'}} ><b>Rent : </b>{office.rent}</p>
                ):(
                  <p style={{color:'green'}} ><b>Rent : </b>{office.rent}</p>
                )}
                <p><b>Address : </b>{office.address}</p>
                </div>
              </div>
          ))}
        </div>
    </div>
  );
}

export default App;
