<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<div style="color:red;text-align:center">${cmdData }</div>
<form:form  commandName="regCmd"  method="post">
  <div style="color:red;text-align:center"> <form:errors path="*"/></div>
 <table border="1">
 <tr><th colspan="2">Registration Form</th></tr>
 <tr><td>Name:<td><form:input path="name"/></td></tr>
 <tr><td>DOB:<td><form:input path="dob"/></td></tr>
 <tr><td>DOJ:<td><form:input path="doj"/></td></tr>
 <tr><td>DOM:<td><form:input path="dom"/></td></tr>
 <tr><td colspan="2" align="center">
 <input type="submit" value="Register"/></td></tr>
 </table>
</form:form>