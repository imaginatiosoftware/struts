<%-- 
    Document   : create
    Created on : 10/01/2014, 05:16:05 PM
    Author     : developer
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Person</title>
    </head>
    <body>
        <h1> CREATE </h1>
        <s:form action="create_person" method="execute">
            <s:textfield name="Name" label="New Name"/>
            <s:submit value="Crear"/>
        </s:form>
    </body>
</html>
