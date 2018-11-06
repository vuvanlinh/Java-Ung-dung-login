<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>

<form:form action="login" method="post" modelAttribute="login">
    <fieldset>
        <h1>Login</h1>
        <hr>
        <table>
            <tr>
                <td><form:label path="account">Account: </form:label></td>
                <td><form:input path="account"/></td>
            </tr>
            <tr>
                <td><form:label path="password">Password: </form:label></td>
                <td><form:input path="password"/></td>
            </tr>
            <td></td>
            <td><form:button>Login</form:button></td>
        </table>
    </fieldset>
</form:form>
</body>
</html>
