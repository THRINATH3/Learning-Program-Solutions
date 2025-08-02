import BlogDetails from './components/BlogDetails';
import BookDetails from './components/BookDetails';
import CourseDetails from './components/CourseDetails';
import logo from './logo.svg';
import './App.css'

function App() {
  return (
    <div style={{display:'flex',columnGap:'100px',padding:'50px',justifyContent:'center',marginTop:'100px'}}>
      <div className='border'>
        <CourseDetails />
      </div>
      <div className='border'>
        <BookDetails />
      </div>
      <div>
          <BlogDetails />
      </div>
    </div>
  );
}

export default App;
