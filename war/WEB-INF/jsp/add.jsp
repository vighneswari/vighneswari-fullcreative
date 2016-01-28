<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center><h1>Add NewAccount USER</h1></center>
<!-- <td><a href="register/list">Customers</a></td> -->
	<form action="//add" method="POST">
	
	<body background=" http://www.lawctopus.com/wp-content/uploads/2014/06/Filling-out-form.jpg">
		<center><table>
		 <p>
          <label>Gender</label>            
          <input type = "radio"
                 name = "radSize"
                 id = "sizeSmall"
                 value = "Male"
                 checked = "checked" />
          <label for = "sizeSmall">Female</label>
          
          <input type = "radio"
                 name = "radSize"
                 id = "sizeMed"
                 value = "Female" />
          <label for = "sizeMed">Male</label>
 
         
        </p>
			<tr>
				<td>UserName :</td>
				<td><input type="text" style="width: 185px;""height: 50px"; maxlength="30"
					name="name" id="name" /></span></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="text" style="width: 185px;" maxlength="30"
					name="email" id="email" /></span></td>
			</tr>
			<tr>
				<td>Address :</td>
				<td><input type="text" style="width: 185px;" maxlength="30"
					name="Address" id="Address" /></span></td>
			</tr>
			<tr>
				<td>date :</td>
				<td><input type="text" style="width: 185px;" maxlength="30"
					name="date" id="date" /></span></td>
			</tr>
			<tr>
				<td>Mobile :</td>
				<td><input type="text" style="width: 185px;" maxlength="30"
					name="Mobile" id="Mobile" /></span></td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td><input type="text" style="width: 185px;" maxlength="30"
					name="Gender" id="Gender" /></span></td>
			</tr>
			
			<tr>
				<td>City:</td>
				<td><input type="text" style="width: 185px;" maxlength="30"
					name="City" id="City" /></span></td>
			</tr>
			<tr>
				<td>AccountType :</td>
				<td><input type="text" style="width: 185px;" maxlength="30"
					name="AccountType" id="AccounType" /></span></td>
			</tr>
			<tr>
				<td>AadharNumber :</td>
				<td><input type="text" style="width: 185px;" maxlength="30"
					name="AadharNumber" id="AadharNumber" /></span></td>
			</tr>
			<tr>
				<td>AccountNumber:</td>
				<td><input type="text" style="width: 185px;" maxlength="30"
					name="AccountNumber" id="AccountNumber" /></span></td>
			</tr>
			<tr>
				<td>DateOfBirth:</td>
				<td><input type="text" placeholder="MM-DD-YEAR"style="width: 185px;" maxlength="30"
					name="DateOfBirth" id="DateOfBirth" /></span></td>
			</tr>
			<tr>
				<td>Occupation:</td>
				<td><input type="text"style="width: 185px;" maxlength="30"
					name="Occupation" id="Occupation" /></span></td>
			</tr>
			<tr>
				<td>Amount:</td>
				<td><input type="text" placeholder="Enter digits"style="width: 185px;" maxlength="30"
					name="Income" id="Income" /></span></td>
			</tr>
			<tr>
				<td>Balance:</td>
				<td><input type="text" style="width: 185px;" maxlength="30"
					name="Balance" id="Balance" /></span></td>
			</tr>
			
		</table></center>
		<center><input type="submit" class="save" title="Save" value="Save" /></center>
		
	</form>

</body>
</html>