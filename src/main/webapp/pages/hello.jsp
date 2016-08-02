<%--
  Created by IntelliJ IDEA.
  User: Ace
  Date: 01-Aug-16
  Time: 6:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:if test="bookDetailList.size() >0">
    <table>
        <thead>
        <tr>
            <td>ID</td>
            <td>Name</td>
        </tr>
        </thead>
        <tbody>
        <s:iterator value="bookDetailList" status="userStatus">
            <tr>
                <td><s:property value="id"/> </td>
                <td><s:property value="name"/> </td>
            </tr>
        </s:iterator>
        </tbody>
    </table>
</s:if>
<s:if test="bookDetailList.size() == 0">
    <h1>Khong co sach</h1>
</s:if>
</body>
</html>
