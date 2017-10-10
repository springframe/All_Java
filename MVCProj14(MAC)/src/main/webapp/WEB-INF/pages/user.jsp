<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form action="perform.htm" method="POST">
<table>
<tr><td>Sno:<td><input type="text" name="sno"></td></tr>
<tr><td>Sname:<td><input type="text" name="sname"></td></tr>
<tr><td>Sadd:<td><input type="text" name="sadd"></td></tr>

<tr><td colspan="2"><input type="submit" name="opt" value="insert">
              <input type="submit" name="opt" value="update">
              <input type="submit" name="opt" value="delete">
              <input type="submit" name="opt" value="view">
       </td></tr>
</table>
</form>
<c:if test="${operation ne null }">
<c:out value="${operation}"/>SuccessSpringFramWork
</c:if>