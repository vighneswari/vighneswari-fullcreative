package com.vighneswari;
import java.util.Date;
import java.util.List;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.vighneswari.PMF;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.PreparedQuery;
//import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.FilterOperator;


@Controller
@RequestMapping("/login")
public class LoginController 
{
	/*@RequestMapping(value = "/loginController", method = RequestMethod.POST)
	public String log(HttpServletRequest request, ModelMap model)
	{
		String Username1 = request.getParameter("name");
		String Password1 = request.getParameter("Mobile");
		System.out.println(Username1);
		PersistenceManager pm = PMF.get().getPersistenceManager();	
		
		Query q = pm.newQuery(Register.class);
		
		q.setFilter("name == nameParameter && Mobile == MobileParameter");
		q.declareParameters("String nameParameter, String MobileParameter");

		List<Register> results = (List<Register>) q.execute(Username1,Password1);
		System.out.println("hello"+results);
		
		if(results.next())
		{
	
			return "home";
		}
			*/
			@RequestMapping(value = "/log", method = RequestMethod.POST)
			public String reg(HttpServletRequest request, ModelMap model)
			{
				
			return "index";
			
			}
			
			@RequestMapping(value = "/about", method = RequestMethod.GET)
			public String about(HttpServletRequest request, ModelMap model)
			{

				return "about";

			}
			
			@RequestMapping(value = "/withdraw", method = RequestMethod.GET)
			public String withdraw(HttpServletRequest request, ModelMap model)
			{

				return "withdraw";

			}
			@RequestMapping(value = "/deposit", method = RequestMethod.GET)
			public String deposit(HttpServletRequest request, ModelMap model)
			{

				return "deposit";

			}
			
			@RequestMapping(value = "/regi", method = RequestMethod.GET)
			public String regi(HttpServletRequest request, ModelMap model)
			{

				return "index";

			}
			@RequestMapping(value = "/regi2", method = RequestMethod.GET)
			public String regi2(HttpServletRequest request, ModelMap model)
			{

				return "registrationsucess";

			}
			
			
			@RequestMapping(value = "/depositController", method = RequestMethod.POST)
			public String log(HttpServletRequest request, ModelMap model)
			{
			
				
				String Username1 = request.getParameter("name");
				String Password1 = request.getParameter("");
				System.out.println(Username1);
				PersistenceManager pm = PMF.get().getPersistenceManager();	
				
				Query q = pm.newQuery(Register.class);
				
				q.setFilter("name == nameParameter && Mobile == MobileParameter");
				q.declareParameters("String nameParameter, String MobileParameter");
				List<Register> results = (List<Register>) q.execute(Username1,Password1);

				System.out.println("hello"+results);
				if(results.isEmpty())
				{
					System.out.println("vijju");
					return "loginfail";
				}
				else
				{
					System.out.println("not");
				    return "home";
				}
				
				}
	}
	


	