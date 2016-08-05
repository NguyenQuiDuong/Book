<%--
  Created by IntelliJ IDEA.
  User: Ace
  Date: 01-Aug-16
  Time: 3:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s"   uri="/struts-tags" %>
<html>
<head>
    <title>Home page</title>
</head>
<body>
<h1>Trang chủ đây roài mà ko thấy cái list của mình đâu nhỉ</h1>
<s:if test="bookDetailList.size() >0">
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>AuthorId</th>
                <th>TypeId</th>
                <th>StoreId</th>
                <th>Description</th>
                <th>Public Year</th>
                <th>ProductId</th>
            </tr>
        </thead>
        <tbody>
        <s:iterator value="bookDetailList" status="userStatus">
            <tr>
                <td><s:property value="id"/> </td>
                <td><s:property value="name"/> </td>
                <td><s:property value="authorId"/></td>
                <td><s:property value="typeId"/> </td>
                <td><s:property value="storeId"/> </td>
                <td><s:property value="description"/> </td>
                <td><s:property value="publicedYear"/> </td>
                <td><s:property value="productId"/> </td>
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
