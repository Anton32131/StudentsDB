<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>All Students</h2>
<br>

<table>
    <tr>
        <th>Name</th>
        <th>MiddleName</th>
        <th>LastName</th>
        <th>Birthday</th>
        <th>GroupNumber</th>
    </tr>
    <c:forEach var="std" items="${allStudents}">

        <c:url var="updateButton" value="/updateInfo">
            <c:param name="stdId" value="${std.id}"/>
        </c:url>
        <c:url var="deleteButton" value="/deleteStudent">
            <c:param name="stdId" value="${std.id}"/>
        </c:url>
        <tr>
            <td>${std.name}</td>
            <td>${std.middlename}</td>
            <td>${std.lastname}</td>
            <td>${std.birthday}</td>
            <td>${std.groupnumber}</td>
            <td>
                <input type="button" value="Update"
                onclick="window.location.href = '${updateButton}'"/>

                <input type="button" value="Delete"
                onclick="window.location.href = '${deleteButton}'"/>
            </td>
        </tr>
    </c:forEach>
</table>

<br>
<input type="button" value="Add" onclick="window.location.href='addNewStudent'"/>

</body>
</html>
