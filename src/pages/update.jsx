import axios from 'axios';
import React,{useEffect,useState} from 'react'
import { useNavigate, useParams } from 'react-router-dom';
function Update(){
    const {loanId}=useParams();
    const [values,setValues]=useState({
        loanId:loanId,
        applicantAadhaar:"",
        applicantAddress:"",
        applicantEmail:"",
        applicantMobile:"",
        applicantName:"",
        applicantPan:"",
        applicantSalary:"",
        loanAmountRequired:"",        
        loanRepaymentMonths:"",   
        loantype:"" 
    })
    useEffect(()=>{
        axios.get('http://localhost:8081/loan/'+loanId)
        .then(res=>{
            setValues({...values,loanId: res.data.loanId,
                applicantAadhaar: res.data.applicantAadhaar,
                applicantAddress: res.data.applicantAddress,
                applicantEmail: res.data.applicantEmail,
                applicantMobile: res.data.applicantMobile,
                applicantName: res.data.applicantName,
                applicantPan: res.data.applicantPan,
                applicantSalary: res.data.applicantSalary,
                loanAmountRequired: res.data.loanAmountRequired,
                loanRepaymentMonths: res.data.loanRepaymentMonths,
                loantype: res.data.loantype
            })
        })
        .catch(err => console.log(err))
    },[])
    const navigate = useNavigate()

    const handleSubmit = (e)=>{
        e.preventDefault();
        axios.put('http://localhost:8081/loan/'+loanId,values)
        .then(res=>{
            navigate('/');
        })
        .catch(err => console.log(err))
    } 
    return(
        <form >
           <div>
            
              <h1>Update</h1>

            <p>Fill in the Information Below</p>
 
            <input type="number"  name="loan id"  placeholder="loan id" value={values.loanId} onChange={e => setValues({...values,loanId: e.target.value})}/>

            <input type="text" name="applicantAadhaar" placeholder="applicantAadhaar" value={values.applicantAadhaar} onChange={e => setValues({...values,applicantAadhaar: e.target.value})}/>
            <input type="text" name="applicantAddress" placeholder="applicantAddress" value={values.applicantAddress} onChange={e => setValues({...values,applicantAddress: e.target.value})}/>
            <input type="text" name="applicantEmail" placeholder="applicantEmail" value={values.applicantEmail} onChange={e => setValues({...values,applicantEmail: e.target.value})}/>
            <input type="text" name="applicantMobile" placeholder="applicantMobile" value={values.applicantMobile} onChange={e => setValues({...values,applicantMobile: e.target.value})}/>
            <input type="text" name="applicantName" placeholder="applicantName" value={values.applicantName} onChange={e => setValues({...values,applicantName: e.target.value})}/>
            <input type="text" name="applicantPan" placeholder="applicantPan" value={values.applicantPan} onChange={e => setValues({...values,applicantPan: e.target.value})}/>
            <input type="text" name="applicantSalary" placeholder="applicantSalary" value={values.applicantSalary} onChange={e => setValues({...values,applicantSalary: e.target.value})}/>
 
 

            <input type="text" name="loanAmountRequired" placeholder="loanAmountRequired" value={values.loanAmountRequired} onChange={e => setValues({...values,loanAmountRequired: e.target.value})}/>
            <input type="text" name="loanRepaymentMonths" placeholder="loanRepaymentMonths" value={values.loanRepaymentMonths} onChange={e => setValues({...values,loanRepaymentMonths: e.target.value})}/>
            <input type="text" name="loantype" placeholder="loantype" value={values.loantype} onChange={e => setValues({...values,loantype: e.target.value})}/>


            <button onClick={handleSubmit}>edit</button>
           </div>
           </form>
    )
    
}
export default Update;