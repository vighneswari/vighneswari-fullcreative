
<%@ page import="java.util.List" %>
<%@ page import="com.vighneswari.Register" %>
<%@ page import="com.google.appengine.api.datastore.KeyFactory" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>hai this online banking example list page</h1>

	Function : <a href="add">Add Customer</a>
	<hr />

	<h2>All Account Holder Details</h2>
	<table border="1">
		<thead>
			<tr>
				<td>name</td>
				<td>email</td>
				<td>Address</td>
				<td>date</td>
				<td>key</td>
				<td>Mobile</td>
				<td>Gender</td>
				<td>City</td>
				<td>AccountType</td>
				<td>AadharNumber</td>
				
				<td>Action</td>
			
			</tr>
		</thead>
		
		<%
			
		if(request.getAttribute("registerList")!=null){
				
			List<Register> M = 
                           (List<Register>)request.getAttribute("registerList");
				
			if(!M.isEmpty()){
				 for(Register c : M){
						 
		%>
				<tr>
				  <td><%=c.getname() %></td>
				  <td><%=c.getemail() %></td>
				   <td><%=c.getAddress() %></td>
				    <td><%=c.getMobile() %></td>
				      <td><%=c.getGender() %></td>
				        <td><%=c.getCity() %></td>
				          <td><%=c.getAccountType() %></td>
				            <td><%=c.getAadharNumber() %></td>
				  <td><%=c.getDate() %></td>
				  <td><a href="update/<%=c.getname()%>">Update</a> | 
                                      <a href="delete/<%=KeyFactory.keyToString(c.getKey()) %>">
                                       Delete</a>
                                  </td>
				</tr>
		<%	
			
				}
		    
			}
			
		   }
		%>
         
        </tr>
     
	</table>
</body>
</html>