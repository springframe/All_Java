package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.registrationCommand;

public class StudentInsertValidator implements Validator
{

	@Override
	public boolean supports(Class<?> clazz) 
	{
		
		return clazz.isAssignableFrom(registrationCommand.class);
	}

	@Override
	public void validate(Object command, Errors errors) 
	{
		//type casting
		registrationCommand cmd=(registrationCommand)command;
		//Form validation
		if(cmd.getSno()<=0)
		{
			errors.rejectValue("sno","sno.invalid");
		}
		if(cmd.getSname().equals("")|| cmd.getSname()==null)
		{
			errors.rejectValue("sname","sname.required");
		}
		
	}

}
