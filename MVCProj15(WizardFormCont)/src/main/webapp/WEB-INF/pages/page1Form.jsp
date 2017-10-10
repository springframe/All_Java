<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form method="POST" commandName="regCmd">
<table>
<tr><td>
UserName:<td><form:input path="userName"/></td></tr>
<tr><td>
password:<td><form:input path="password"/></td></tr>
<tr><td colspan="2"><input type="submit" value="Next" name="_target1">
<input type="submit" value="Cancel" name="_cancel">
</td></tr>
</table>

</form:form>