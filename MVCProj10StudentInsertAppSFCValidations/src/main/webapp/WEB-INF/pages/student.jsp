<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<h1 align="center">Registration Page </h1>
<form:form method="post" commandName="stCmd">
<table border="1">
<tr><td>
Number:<td><form:input path="sno"/></td></tr>
<tr><td>
Name:<td><form:input path="sname"/></td></tr>
<tr><td>
Address:<td><form:input path="sadd"/></td></tr>
<tr><td colspan="2" align="center">
<input type="submit" value="Registration"/></td></tr>
</table>

</form:form>