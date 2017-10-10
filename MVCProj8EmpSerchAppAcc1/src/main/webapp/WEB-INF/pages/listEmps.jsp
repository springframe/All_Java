<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>

<h1 style="background-color:black;color:red;text-align:center">SEARCH RESULT</h1>

<table border="1" align="center" style="background-color:pink;color:red">
<tr><th>EMP NO<th>EMPNAME<th>SALARY<th>DESG<th>DEPTNO<th>MANAGERNO</th></tr>
<c:forEach items="${searchResults}" var="result">
<tr><td><c:out value="${result.no}"/>
     <td><c:out value="${result.name}"/>
     <td><c:out value="${result.salary}"/>
     <td><c:out value="${result.desg}"/>
     <td><c:out value="${result.deptno}"/>
     <td><c:out value="${result.mgmrno}"/>
     </td></tr>
</c:forEach>
</table>
