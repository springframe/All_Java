<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form method="POST" commandName="regCmd">
<table>
<tr><td>
phoneNo:<td><form:input path="phoneNo"/></td></tr>
<tr><td>
city:<td><form:input path="city"/></td></tr>
<tr><td colspan="2">
<input type="submit" value="Previous" name="_target1">
<input type="submit" value="Finish" name="_finish">
<input type="submit" value="Cancel" name="_cancel">
</td></tr>
</table>
</form:form>