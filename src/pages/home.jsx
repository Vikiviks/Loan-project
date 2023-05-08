import React, { useState } from "react";
import 'mdb-react-ui-kit/dist/css/mdb.min.css';
import {Link} from 'react-router-dom';
import '../components/home.css'

function Home() {
  // React States
  return (
<div className="bgimg">
<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#" >
    <svg xmlns="http://www.w3.org/2000/svg" width="36" height="36" fill="white" class="bi bi-bank" viewBox="0 0 16 17">
  <path d="m8 0 6.61 3h.89a.5.5 0 0 1 .5.5v2a.5.5 0 0 1-.5.5H15v7a.5.5 0 0 1 .485.38l.5 2a.498.498 0 0 1-.485.62H.5a.498.498 0 0 1-.485-.62l.5-2A.501.501 0 0 1 1 13V6H.5a.5.5 0 0 1-.5-.5v-2A.5.5 0 0 1 .5 3h.89L8 0ZM3.777 3h8.447L8 1 3.777 3ZM2 6v7h1V6H2Zm2 0v7h2.5V6H4Zm3.5 0v7h1V6h-1Zm2 0v7H12V6H9.5ZM13 6v7h1V6h-1Zm2-1V4H1v1h14Zm-.39 9H1.39l-.25 1h13.72l-.25-1Z"/>
  
</svg>
      <div ><h2 id='hed'>Loan</h2></div>
    </a>
    <Link id='but' to='/signup' >Sign up</Link>
    <Link id='log' to='/login'>Login</Link>
  </div>
</nav>
	  
    </div>
  );
}
export default Home;