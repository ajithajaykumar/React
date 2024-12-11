import './style.css'
// import SideNav from './Sidebar'
import {Link} from 'react-router-dom'
function header(){
    return(
        <>
        <div className="head">
           <ul className="list1">
            <li><Link to='/home'>Home</Link></li>
            <li>Menu</li>
            <li><Link to='/signin'>StudentDetails</Link></li>
            </ul>
            <h1>MonitPro Learning Portal</h1>
            <ul className="list2">
            <li>sign in</li>
            <li>Sign up</li>
            </ul>
        </div>
        {/* <SideNav /> */}
        </>
    )
}
export default header