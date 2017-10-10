
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page isELIgnored="false"%>

<table border="2" align="center" style="background-color:black;color:red">
<tr><th>ENO<th>ENAME<th>JOB<th>salary</th></tr>
<c:forEach var="emp" items="${emplist }">
<tr><td><c:out value="${emp.no}"/>
 <td><c:out value="${emp.name}"/>
 <td><c:out value="${emp.job}"/>
 <td><c:out value="${emp.salary}"/>
 </td></tr>
</c:forEach>
</table>