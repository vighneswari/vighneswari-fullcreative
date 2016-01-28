
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.event {
	background-color: skyblue;
}ß
deposit
full
</style>
</head>
<body>
<body background="http://www.ecb-s.com/_data/123_deposit-system_offener_Schacht_JPG-1.jpg">
<form action="/login/deposit" method="post">

<p>deposit page</p><center><form name=F1 onSubmit="return dil(this)" action="deposit.jsp">
<table cellspacing="5" cellpadding="3">
<tr><td>ACCOUNT NO:</td>
						<td><input type="text" name="accountno" /></td>
</tr>	<tr><td class="event">User Name:</td><td><input type="text" name="username" /></td></tr>
<tr><td>PASSWORD:</td><td><input type="password" name="password" /></td></tr>
<tr><td>AMOUNT:</td><td><input type="text" name="amount" /></td></tr>

	<!-- Gender:<br/><br/>

Male<input type="radio" name="gender" value="male"> Female<input type="radio" name="gender" value="female"/><br/><br/> -->

<tr><td></td><td><input type="submit" value="Submit" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

				<INPUT TYPE=RESET VALUE="CLEAR"></td>
					</tr>

				</table>
				</form>

		</center>


	</form>



</body>



</html>