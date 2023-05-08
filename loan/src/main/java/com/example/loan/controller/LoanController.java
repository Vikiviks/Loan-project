package com.example.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan.model.LoanModel;
import com.example.loan.repository.LoanRepository;
@CrossOrigin("*")
@RestController
public class LoanController {
      @Autowired
      LoanRepository lr;
      @GetMapping("/loan")
 	 public List<LoanModel>getAllDetails(){
 		 return lr.findAll();
 	 }
      @DeleteMapping("/loan/{id}")
   	public String deleteById(@PathVariable int id)
   	{
   		lr.deleteById(id);
   		return "Id details deleted";
   	}
  	@PutMapping("/loan/{id}")
	 public ResponseEntity<LoanModel> updateCar(@PathVariable("id") int id, @RequestBody LoanModel loan){
	   LoanModel b = lr.findById(id).get();
	      if(b.getLoanId()!=0) {
	        b.setLoanId(loan.getLoanId());
	        b.setLoantype(loan.getLoantype());
	        b.setApplicantName(loan.getApplicantName());
	        b.setApplicantAddress(loan.getApplicantAddress());
	        b.setApplicantMobile(loan.getApplicantMobile());
	        b.setApplicantEmail(loan.getApplicantEmail());
	        b.setApplicantAadhaar(loan.getApplicantAadhaar());
	        b.setApplicantPan(loan.getApplicantPan());
	        b.setApplicantSalary(loan.getApplicantSalary());
	        b.setLoanAmountRequired(loan.getLoanAmountRequired());
	        b.setLoanRepaymentMonths(loan.getLoanRepaymentMonths());
	      }
	  return new ResponseEntity<LoanModel>(lr.save(b),HttpStatus.OK);
	}
}
