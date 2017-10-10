
<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<form:form method="post" commandName="stCmd">
<table align="center">
<tr><td colspan="2" align="center">REISTRATION FORM</td></tr>
<tr><td>SNO<td><form:input path="sno"/></td></tr>
<tr><td>SNAME<td><form:input path="sname"/></td></tr>
<tr><td>SADDRS<td><form:input path="saddrs"/></td></tr>
<tr><td>EMAIL<td><form:input path="email"/></td></tr>
<tr><td colspan="2"><input type="submit" value="click"></td></tr>

</table>
</form:form>
${resultMsg }