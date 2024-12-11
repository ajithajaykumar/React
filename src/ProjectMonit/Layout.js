import Sidebar from './Sidebar'
import Head from './head'
import Foot from './footer'
// import Home from './home'
import './style.css'
import {Outlet} from 'react-router-dom'
function layout(){
    return(
    <>
    <Head />
    <div className='Side'>
    <Sidebar />
    <Outlet />
    </div>
    <Foot />
    </>
    )
}
export default layout