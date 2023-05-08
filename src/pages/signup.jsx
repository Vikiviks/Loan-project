import {  useState } from "react";
import axios from "axios";
 
function Signup() {
  
    const [id, setId] = useState("");
    const [username, setUsername] = useState("");
    const [email, setEmail] = useState("");
    const [mobileNumber, setMobileNumber] = useState("");
    const [password, setPassword] = useState("");
    const [userRoll, setUserRoll] = useState("");
 
 
    async function save(event) {
        event.preventDefault();
        try {
          await axios.post("http://localhost:8081/usesave", {
          id:id,
          username: username,
          email: email,
          mobileNumber:mobileNumber,
          password: password,
          userRoll:userRoll
          });
          alert("User Registation Successfull");
 
        } catch (err) {
          alert(err);
        }
      }
  
    return (
    <div>
    <div class="container mt-4" >
    <div class="card">
            <h1>User Registation</h1>
    
    <form>
        <div class="form-group">
          <label>userid</label>
          <input type="number"  class="form-control" id="userid" placeholder="Enter id"
          
          value={id}
          onChange={(event) => {
            setId(event.target.value);
          }}
          />
          </div>
          <div class="form-group">
          <label>username</label>
          <input type="text"  class="form-control" id="username" placeholder="Enter Name"
          
          value={username}
          onChange={(event) => {
            setUsername(event.target.value);
          }}
          />
 
        </div>
 
        <div class="form-group">
          <label>email</label>
          <input type="text"  class="form-control" id="email" placeholder="Enter Email"
          
          value={email}
          onChange={(event) => {
            setEmail(event.target.value);
          }}
          
          />
        </div>
        <div class="form-group">
          <label>mobileno</label>
          <input type="text"  class="form-control" id="mobileno" placeholder="Enter number"
          
          value={mobileNumber}
          onChange={(event) => {
            setMobileNumber(event.target.value);
          }}
          
          />
        </div>
 
        <div class="form-group">
            <label>password</label>
            <input type="password"  class="form-control" id="password" placeholder="Enter password"
            
            value={password}
            onChange={(event) => {
              setPassword(event.target.value);
            }}
            
            />
          </div>
          <div class="form-group">
          <label>userroll</label>
          <input type="text"  class="form-control" id="age" placeholder="Enter age"
          
          value={userRoll}
          onChange={(event) => {
            setUserRoll(event.target.value);
          }}
          />
          </div>
        <button type="submit" class="btn btn-primary mt-4" onClick={save} >Submit</button>
      
      </form>
    </div>
    </div>
     </div>
    );
  }
  
  export default Signup;