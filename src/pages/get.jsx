import React from "react";
import {Link} from "react-router-dom";
import axios from "axios";



export default class Get extends React.Component {
  state = {
    posts: [],
  };
  componentDidMount() {
    axios.get(`http://localhost:8081/loan`).then((res) => {
      const posts = res.data;
      this.setState({ posts });
    });
  }

  deleteRow(loanId, e){
    axios.delete(`http://localhost:8081/loan/${loanId}`)
      .then(res => {
        console.log(res);
        console.log(res.data);
        const posts = this.state.posts.filter(item => item.loanId !== loanId);
        this.setState({ posts });
      })

  }

  render() {
    return (
      <div>
        <h1>  Loan Details </h1>

        <table class="table table-striped ">
          <thead  style={{backgroundColor: '#33568b',color:'white',borderRadius:'10px'}}>
            <tr>
              <th>Loan Id</th>
              <th>Applicant Aadhar</th>
              <th>Applicant Address</th>
              <th>Applicant Email</th>
              <th>Applicant Mobile</th>
              <th>Applicant Name</th>
              <th>Applicant Pan</th>
              <th>Applicant Salary</th>
              <th>Loan Amount Required</th>
              <th>Loan Repayment Months</th>
              <th>Loan Type</th>
              <th>Delete</th>
              <th>Update</th>
          
         
            </tr>
          </thead>

          <tbody>
            {this.state.posts.map((post,i) => (
              <tr key={i}>
                <td>{post.loanId}</td>
                <td>{post.applicantAadhaar}</td>
                <td>{post.applicantAddress}</td>
                <td>{post.applicantEmail}</td>
                <td>{post.applicantMobile}</td>
                <td>{post.applicantName}</td>
                <td>{post.applicantPan}</td>
                <td>{post.applicantSalary}</td>
                <td>{post.loanAmountRequired}</td>
                <td>{post.loanRepaymentMonths}</td>
                <td>{post.loantype}</td>
                
                 <td><i onClick={(e) => this.deleteRow(post.loanId, e)} class="fa-solid fa-trash"></i></td>
                <td><Link to={`/update/${post.loanId}`}><i  class="fa-solid fa-pen-to-square"></i></Link></td>

            

              </tr>
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}