e<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<h1><center> Stduent Registration</center></h1>
 
 <form:form method="post" commandName="regCmd">
 <p style="color:red">
   <%-- <form:errors path="*"/> --%>
  </p>
  No : <form:input path="sno"/>  <br>
  Name :<form:input path="sname"/> <br>
  Courses : <form:select path="course">
   <form:options items="${courseList}"/>
    </form:select>
      <input type="submit" value="register"/>  
 </form:form>