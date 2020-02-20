<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
	<h2>Customer Sign up</h2>

	<f:form id="signupForm" modelAttribute="custFormObj" action="customer" method="post">
		<table align="center">
			<tr>
				<td><f:label path="name">Name: </f:label></td>
				<td><f:input path="name" name="name" id="name" />
				</td>
			</tr>
			<tr>
				<td><f:label path="email">Email:</f:label></td>
				<td><f:input path="email" name="email" id="email"/></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><f:button id="signup" name="signup">Sign Up</f:button>
				</td>
			</tr>
			<tr></tr>
		</table>
	</f:form>
</body>
</html>