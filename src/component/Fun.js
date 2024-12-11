import React from 'react'
import { useEffect,useState } from 'react'
function Fun() {
  const [data,setData]=useState(null);
    useEffect(()=>{
    fetch('https://jsonplaceholder.typicode.com/posts')
    .then(response => response.json())
    .then((result)=>setData(result))
    .catch((error)=>console.error('Error occured:',error))
    },[]
    )
  return(
<div style={{color:'black'}}>
  {data?(
    <ul>
    {data.map((item)=>(
      <li key={item.id}>{item.name}</li>
  ))}
    </ul>
):(<p>Loding Data....</p>)
}
</div>
  )
}

export default Fun
