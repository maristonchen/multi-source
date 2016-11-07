<%--
  Created by IntelliJ IDEA.
  User: mariston
  Date: 2016/10/25
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="f" %>
<%
    String path = request.getContextPath(); request.setAttribute("ctx", path);
%>
<input type="hidden" id="ctx" value="${ctx}"/>