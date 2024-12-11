import Home from './home'
import Layout from './Layout'
import Html from './html'
import Css from './css'
import { BrowserRouter,Routes,Route} from 'react-router-dom';
function Router(){
    return (
        <BrowserRouter>
          <Routes>
              <Route path='/' element={<Layout/>}>
              <Route index element={<Home />}/>
              <Route path='/home' element={<Home />}/>
              <Route path="/html" element={<Html/>} />
              <Route path="/css" element={<Css/>} />
              <Route path="/signin" element={<Css/>} />
              </Route>
          </Routes>
        </BrowserRouter>
      );
}
export default Router