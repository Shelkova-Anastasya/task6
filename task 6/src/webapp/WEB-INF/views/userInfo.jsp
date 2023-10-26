<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User</title>
</head>
<body>
<h1>Users Info</h1>
<br>
<form:form action="saveUser" modelAttribute="users">

    <form:hidden path="id"/>
    Name<form:input path="name" required="required"/>
    <br><br>
    Surname<form:input path="surname" required="required"/>
    <br><br>
    age<form:input path="age" type="number" min="1" max="100"/>
    <br><br>
    <input type="submit" value="OK">

</form:form>

</body>
</html>