<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Student info</h2>
<br>
<form:form action="saveStudent" modelAttribute="student">
    <form:hidden path="id"/>
    Name <form:input path="name"/>
    <br><br>
    MiddleName <form:input path="middlename"/>
    <br><br>
    LastName <form:input path="lastname"/>
    <br><br>
    Birthday <form:input path="birthday"/>
    <br><br>
    GroupNumber <form:input path="groupnumber"/>
    <br><br>
<input type="submit" value="OK">
</form:form>
</body>
</html>
