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
@RequestMapping("/")
public class RegisterController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getAddRgisterPage(ModelMap model) 
	{

		return "index";

	}

	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public String getAddRegisterPage(ModelMap model)
	{

		return "add";

	}
	
	

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView add(HttpServletRequest request, ModelMap model) 
	{

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String Address = request.getParameter("Address");
		String date =  request.getParameter("date");
		String key = request.getParameter("key");
		String Mobile= request.getParameter("Mobile");
		String Gender= request.getParameter("Gender");
		String City= request.getParameter("City");
		String AccountType= request.getParameter("AccountTye");
		String AadharNumber=request.getParameter("AadharNumber");
		String AccountNumber= request.getParameter("AccountNumber");
		String DateOfBirth= request.getParameter("DateOfBirth");
		String Occupation= request.getParameter("Occupation");
		
		Register c = new Register();
		c.setname(name);
		c.setemail(email);
		c.setAddress(Address);
		c.setDate(new Date());
		c.setMobile(Mobile);
		c.setGender(Gender);
		c.setCity(City);
		c.setAccountType(AccountType);
		c.setAadharNumber(AadharNumber);
		c.setAccountNumber(AccountNumber);
		c.setDataOfBirth(DateOfBirth);
		c.setOccupation(Occupation);
		

		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			pm.makePersistent(c);
		} finally {
			pm.close();
		}

	    Key customerKey = KeyFactory.createKey("Customer", "your name");
	    Entity customer = new Entity("Customer", customerKey);
	    customer.setProperty("name", "your name");
	    customer.setProperty("email", "your email");
	    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	    datastore.put(customer); //save it
		return new ModelAndView("redirect:/index");
	

	}

	@RequestMapping(value = "/update/{name}", method = RequestMethod.GET)
	public String getUpdateRegisterPage(@PathVariable String name,
		HttpServletRequest request, ModelMap model) {

		PersistenceManager pm = PMF.get().getPersistenceManager();

		Query q = pm.newQuery(Register.class);
		q.setFilter("name == nameParameter");
		q.setOrdering("date desc");
		q.declareParameters("String nameParameter");

		try {
			List<Register> results = (List<Register>) q.execute(name);

			if (results.isEmpty()) {
				model.addAttribute("register", null);
			} else {
				model.addAttribute("register", results.get(0));
			}
		} finally {
			q.closeAll();
			pm.close();
		}

		return "update";

	}

	@RequestMapping(value = "/loginController", method = RequestMethod.POST)
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
	/*@RequestMapping(value = "/deposit", method = RequestMethod.POST)
	//public String deposit(HttpServletRequest request, ModelMap model)
	{
		String AccountNumber1 = request.getParameter("AccountNumber");
		String name2 = request.getParameter("name");
		String Mobile1 = request.getParameter("Mobile");
		String Amount1=request.getParameter("Amount");
		String Balance1=request.getParameter("Balance");
		System.out.println(name2);
		
		PersistenceManager pm = PMF.get().getPersistenceManager();	
		
		Query q = pm.newQuery(Register.class);
		q.setFilter("AccountNumber==AccountNumberParameter && name == nameParameter && Mobile == MobileParameter");
		q.declareParameters("String AccountNumberParameter,String nameParameter, String MobileParameter");
		//double Balance1=Amount1+Balance1;
		//List<Register> Balance1 = (List<Register>) q.execute(AccountNumber1,name2,Mobile1);
		
		System.out.println("hello"+Balance1);
		//return deposit1;
	}*/
			
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(HttpServletRequest request, ModelMap model) {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String Address =request.getParameter("Address");
		String date =  request.getParameter("date");
		String key = request.getParameter("key");
		String Mobile= request.getParameter("Mobile");
		String Gender= request.getParameter("Gender");
		String City= request.getParameter("City");
		String AccountType= request.getParameter("AccountTye");
		String AadharNumber=request.getParameter("AadharNumber");
		String AccountNumber= request.getParameter("AccountNumber");
		String DateOfBirth= request.getParameter("DateOfBirth");
		String Occupation= request.getParameter("Occupation");
		String Income= request.getParameter("Income");
		String Balance= request.getParameter("Balance");

		PersistenceManager pm = PMF.get().getPersistenceManager();

		try {

			Register c = pm.getObjectById(Register.class, key);

			c.setname(name);
			c.setemail(email);
			c.setAddress(Address);
			c.setDate(new Date());
			//c.setkey(key);
			c.setMobile(Mobile);
			c.setGender(Gender);
			c.setCity(City);
			c.setAccountType(AccountType);
			c.setAadharNumber(AadharNumber);
			c.setAccountNumber(AccountNumber);
			c.setDataOfBirth(DateOfBirth);
			c.setOccupation(Occupation);
			//c.setIncome(Income);
			//c.setBalance(Balance);

		} finally {

			pm.close();
		}

		// return to list
		return new ModelAndView("redirect:/list");

	}

	@RequestMapping(value = "/delete/{key}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable String key,
			HttpServletRequest request, ModelMap model) {

		PersistenceManager pm = PMF.get().getPersistenceManager();

		try {

			Register c = pm.getObjectById(Register.class, key);
			pm.deletePersistent(c);

		} finally {
			pm.close();
		}

		// return to list
		return new ModelAndView("redirect:../list");

	}

	// get all customers
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listRegister(ModelMap model,HttpServletRequest req) {

		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(Register.class);
		q.setOrdering("date desc");

		List<Register> results = null;

		try {
			results = (List<Register>) q.execute();

			if (results.isEmpty()) {
			
				model.addAttribute("RegisterList", null);
			} else {
				req.setAttribute("RegisterList", results);
				model.addAttribute("RegisterList", results);
			}

		} finally {
			q.closeAll();
			pm.close();
		}

		return "list";

	}

}