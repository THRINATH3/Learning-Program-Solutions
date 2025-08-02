import React from 'react'
import { blog } from './Details'
function BlogDetails() {
   return (
     <div style={{display:'flex',flexDirection:'column',rowGap:'10px'}}>
      <h1>BlogDetails</h1>
       {blog.map((blogDetail)=>(
         <div>
           <h1>{blogDetail.name}</h1>
           <h4>{blogDetail.author}</h4>
           <p>{blogDetail.des}</p>
         </div>
       ))}
     </div>
   )
}

export default BlogDetails