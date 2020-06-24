<%--
  Created by IntelliJ IDEA.
  User: raghav
  Date: 24/06/20
  Time: 2:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Customer Form</title>
</head>
<body>
<form method="POST" action="CreateCustomer">
    <h1>Create Customer Form</h1>

    <table>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" placeholder="name"></td>
        </tr>
        <tr>
            <td>Age</td>
            <td><input type="number" name="age" placeholder="age"></td>
        </tr>
        <tr>
            <td>Country</td>
            <td><input type="text" name="country" placeholder="country"></td>
        </tr>
        <tr>
            <td>Address</td>
            <td><textarea rows="3" cols="20" name="address" placeholder="address"></textarea></td>
        </tr>
        <tr>
            <td>Gender</td>
            <td><select name="gender">
                <option value="Male">Male</option>
                <option value="Female">Female</option>
            </select></td>
        </tr>
        <tr>
            <td>Areas of Interest</td>
            <td><input type="text" name="areasOfInterest" placeholder="Areas of interest"></td>
        </tr>
    </table>
    <button type="submit">Create</button>
</form>
</body>
</html>
