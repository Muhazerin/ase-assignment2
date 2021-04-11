<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Web Application - Welcome</title>
  </head>
  <body>
    <h1>Welcome To Student Group 29 ASE Assignment 2!</h1>

    <s:url action="loginInput" var="loginInputLink"/>
    <p>Click <a href="${loginInputLink}">here</a> to login</p>
  </body>
</html>