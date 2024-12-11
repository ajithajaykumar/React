import './style.css'
import {Link} from 'react-router-dom'
function side(){
    return(
        <>
        <div className="sidebar">
            <ul>
            <li><Link to="/html">HTML</Link></li>
            <li><Link to="/css">Css</Link></li>
            <li>JavaScript</li>
            <li>Bootstrab</li>
            <li>ReactJs</li>
            <li>JSX</li>
            <li>JQuery</li>
            <li>JSON</li>
            <li>Core Java</li>
            <li>JDBC</li>
            <li>Servlet</li>
            <li>JSP</li>
            <li>Spring</li>
            <li>Spring Boot</li>
            <li>HyperNet</li>
            <li>JPA</li>
            <li>Mssql</li>
            <li>Mysql</li>
            <li>Oracle sql</li>
            <li>MangoDB</li>
            </ul>
        </div>      
    </>
    )
}
export default side