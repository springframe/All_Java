<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form method="POST" commandName="regCmd">
<table>
<tr><td>
pinCode:<td><form:input path="pinCode"/></td></tr>
<tr><td>
emailId:<td><form:input path="emailId"/></td></tr>
<tr><td colspan="2">
<input type="submit" value="Previous" name="_target0">
<input type="submit" value="Next" name="_target2">
<input type="submit" value="Cancel" name="_cancel">
</td></tr>
</table>
</form:form>