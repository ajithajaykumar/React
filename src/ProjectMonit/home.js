import './style.css'
// import { Outlet } from 'react-router-dom'
function home(){
    return(
        <>
  <div className="home disableScroll">
        <div>
        <h1>Welcome To MonitPro Learning Portal</h1>
    </div>
    <div>
        <form>
           <center> <div className="card">
                <h4>Login First</h4>
                <h3>First Name *</h3>
                <input type="text" placeHolder="First Name"></input>
                <h3>Last Name *</h3>
                <input type="text" placeHolder="Last Name"></input>
                <button>Next</button>
            </div></center>
        </form>
    </div>
    </div>
    </>
    )
}
export default home