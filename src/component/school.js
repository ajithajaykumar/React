import React from 'react'
import Fun from './Fun'
function School() {
  return (
    <>
    <div className='sch'><h1>School</h1>
      <h3>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Hic, pariatur! Corporis ex, natus adipisci aspernatur dolorem maiores saepe eius molestias veniam, maxime voluptates rerum alias. Tenetur dignissimos pariatur distinctio voluptate.</h3>
      <div className='commonDiv'>
        <center><input type='text' placeholder='Enter Name' /><br></br>
          <input type='password' placeholder='Enter Pass' />
          <br></br>
          <button>Submit</button>
          <Fun />
        </center>
      </div></div>
      </>

  )
}
export default School
