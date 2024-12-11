import React, { useState } from 'react'
import { useEffect } from 'react'

function Css() {
 const [data,setdata]=useState([]) 
 useEffect(()=>{
  fetch('https:jsonplaceholder.typicode.com/users')
  .then(res=>res.json())
  .then(d=>setdata(d))
 },[])
  return (
    <>
<div className="table home">
        <table>
          <tr>
          <th>Id</th>
          <th>Name</th>
          <th>UserName</th>
          <th>Email</th>
          <th>Street</th>
          <th>City</th>
          <th>Phone Number</th>
          <th>ZipCode</th>
          </tr>
          {data.map((d)=>{
            return(
            <tr>
            <td>{d.id}</td>
            <td>{d.name}</td>
            <td>{d.username}</td>
            <td>{d.email}</td>
            <td>{d.address.street}</td>
            <td>{d.address.city}</td>
            <td>{d.phone}</td>
            <td>{d.address.zipcode}</td>
            </tr>
            )
          })}
        </table>
    </div>
    </>
  )
}
export  default Css