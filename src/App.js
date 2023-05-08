import Update from './pages/update';
import Home from './pages/home';
import Login from './pages/login';
import Get from './pages/get';
import Signup from './pages/signup';
import './App.css';
import {Routes,Route} from 'react-router-dom';
 
function App() {
  return (
    <div className="App">
    <Routes>
					<Route path="/login" element={<Login/>}></Route>
					<Route path="/get" element={<Get/>}></Route>
					<Route path="/signup" element={<Signup/>}></Route>
          <Route path='/update/:loanId' element={<Update/>}></Route>
			
					
					<Route path="/" element={<Home/>}></Route>
				
    </Routes>
    </div>
  );
}
 
export default App;
