<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<h1 align="center">Registration Page </h1>
<form:form method="post" commandName="stCmd">
Number:<form:input path="sno"/><br>
Name:<form:input path="sname"/><br>
Address:<form:input path="sadd"/><br>
<input type="submit" value="Registration"/>

</form:form>