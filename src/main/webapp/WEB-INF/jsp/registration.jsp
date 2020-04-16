<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
</head>
<body>
    <h1>
        Registration
    </h1>
    <form:form modelAttribute="registration">
        <table>
            <tr>
                <td>
                    <spring:message code="name" />:
                </td>
                <td>
                    <form:input path="name" />
                    <form:errors path="name" element="span" />
                </td>
            </tr>
            <tr>
                <td>
                    <spring:message code="password" />:
                </td>
                <td>
                    <form:password path="password" />
                    <form:errors path="password" element="span" />
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Add Registration" />
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>