<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Login</title>
    <s:head />
  </head>
  <body>
      <h2>Login Failed. Please try again</h2>
      <h3><s:text name="greeting" /></h3>

      <s:form action="login">
        <s:textfield key="username" />
        <s:password key="password" />
        <s:submit />
      </s:form>
  </body>
</html>