
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //注销，清除自己的访问信息
    session.invalidate();
    response.sendRedirect("login.jsp");

%>
