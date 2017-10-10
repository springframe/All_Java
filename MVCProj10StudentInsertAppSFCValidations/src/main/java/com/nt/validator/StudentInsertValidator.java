package com.nt.validator;

import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.StudentCommand;

public class StudentInsertValidator implements Validator{

	 public static void main(String[] args) {
		ResourceBundleMessageSource g=new ResourceBundleMessageSource();
	}
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return clazz.isAssignableFrom(StudentCommand.class);
	}
	@Override
	public void validate(Object command, Errors errors) {
		//type casting
		StudentCommand cmd=(StudentCommand)command;
		//form validation
		if(cmd.getSno()<=0)
		{
			errors.rejectValue("sno","sno.invalid");
		}
		if(cmd.getSname().equals("")||cmd.getSname()==null)
			errors.rejectValue("sname","sname.required");
		if(cmd.getSadd().equals("")||cmd.getSadd()==null)
			errors.rejectValue("sadd","sadd.required");
		else
		{
			if(cmd.getSadd().length()<3)
			{
				errors.rejectValue("sadd","sadd.minlength");
			}
		}
		
	}

}
