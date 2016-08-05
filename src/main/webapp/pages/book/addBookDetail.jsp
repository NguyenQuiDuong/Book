<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s"   uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Add Customer</h2>
<s:form action="bookAction" >
  <s:textfield name="name" label="Name" value="" />
  <s:if test="bookTypeList.size() >0">
  	  <s:select list="bookTypeList" value="" name="List Book Type"></s:select>
  </s:if>
  <s:if test="bookTypeList.size() == 0">
    <h1>abch</h1>
</s:if>
  
  <s:textarea name="address" label="Address" value="" cols="50" rows="5" />
  <s:submit />
</s:form>
</body>
</html>