
import { useEffect} from 'react'
import { useState } from 'react'
import './style.css'
function Html(){
    const [data,setdata]=useState([])
    useEffect(()=>{
        fetch("https:jsonplaceholder.typicode.com/photos").then(res=>res.json()).then(d=>setdata(d))
    },[])
    return(
        <>
        <div style={{backgroundColor:"red",color:"black",textAlign:"center",width:'fill'}} className='home '>
        <h1>HTML is the standard markup language for Web pages.

With HTML you can create your own Website.

HTML is easy to learn - You will enjoy it!</h1>
       <table className='table'>
        <tr>
            <td>Id</td>
            <td>Title</td>
            <td>URL</td>
            <td>Tumbnailurl</td>
        </tr>
        {data.map((d)=>{
    return(
        <tr>
            <td>{d.id}</td>
            <td>{d.title}</td>
            <td>{d.url}</td>
            <td>{d.thumbnailUrl}</td>
        </tr>
    )
}
)
}
</table>
        </div>
        </>
    )
}
export default Html