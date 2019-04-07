<%--
  Created by IntelliJ IDEA.
  User: 1456466514
  Date: 2019/4/7
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--java自带类型--%>
    <%--<a href="param/testParam?username=hehe">请求参数绑定</a>--%>

    <%--封装类型--%>
    <%--<form action="param/saveAccount" method="post">--%>
        <%--姓名：<input type="text" name="username"/><br/>--%>
        <%--密码：<input type="password" name="password"/><br/>--%>
        <%--金额：<input type="text" name="money"/><br/>--%>
        <%--用户姓名：<input type="text" name="user.username"/><br/>--%>
        <%--用户年龄：<input type="text" name="user.age"/><br/>--%>
        <%--<input type="submit" value="提交"/>--%>
    <%--</form>--%>

    <%--&lt;%&ndash;自定义类型转换&ndash;%&gt;--%>
    <%--<form action="param/saveUser" method="post">--%>
        <%--姓名：<input type="text" name="username">--%>
        <%--年龄：<input type="text" name="age">--%>
        <%--日期：<input type="text" name="date">--%>
        <%--<input type="submit" value="提交">--%>
    <%--</form>--%>

    <%--获取原生的servlet中的api--%>
    <a href="param/testServlet">原生api获取</a>
</html>
