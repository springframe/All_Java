package com.nt.controller;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import com.nt.command.StudentCOmmand;
public class DataBindController extends SimpleFormController {
	@Override
 public void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
		// logic
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf);
		//binder.registerCustomEditor(Date.class,new CustomDateEditor(sdf,true));
		binder.registerCustomEditor(Date.class,new CustomDateEditor(sdf, true));
			}
	

	@Override
	public  ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		// TODO Auto-generated method stub
		StudentCOmmand cmd=(StudentCOmmand)command;
		System.out.println("hello");
		ModelAndView mav=new ModelAndView();
		mav.addObject("regCmd",cmd);
		mav.addObject("cmdData",cmd);
		mav.setViewName("result");
		return mav;
		/*return new ModelAndView("result","cmdData",cmd)*/
			}
      
	 
}
