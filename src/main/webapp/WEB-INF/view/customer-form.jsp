<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 17-07-2021
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Customer Form</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/add-customer-style.css" />
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/style.css" />
</head>
<body>
<div id="wrapper">
    <div id="header">
        <h2>CRM - CUSTOMER RELATIONSHIP MANAGER</h2>
    </div>
</div>
    <div id="container">
    <h3>Save Customer</h3>

    <form:form action="saveCustomer" modelAttribute="customer" method="post">
        <form:hidden path="ID" />
        <table>
            <tbody>
            <tr>
                <td><label>First Name:</label></td>
                <td><form:input path="firstName" /></td>
            </tr>
            <tr>
                <td><label>Last Name:</label></td>
                <td><form:input path="lastName" /></td>
            </tr>
            <tr>
                <td><label>Email:</label></td>
                <td><form:input path="email" /></td>
            </tr>
            <tr>
                <td><label></label></td>
                <td><input type="submit" value="Save" class="save" /></td>
            </tr>
            </tbody>
        </table>
    </form:form>

        <div style="clear ; both ;" "></div>
            <p>
                <a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
            </p>

</div>

</body>
</html>
