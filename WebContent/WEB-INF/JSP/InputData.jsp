<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>ユーザー登録</title>
    </head>
    <body>
        <center>
        <h1>ユーザー登録 </h1>
        <hr>

        <br>

        <form action="register" method="POST">
            <%
                String name = (String) session.getAttribute("name");
                out.println("名前を入力してください。");
            %><br>
            <input name="name" type="text" value="<%=(name==null)?"":name%>"><br><br>
            <%
                String nickname = (String) session.getAttribute("nickname");
                out.println("ニックネームを入力してください。");
            %><br>
            <input name="nickname" type="text" value="<%=(nickname==null)?"":nickname%>"><br><br>
            <%
                String address = (String) session.getAttribute("address");
                out.println("メールアドレスを入力してください。");
            %><br>
            <input name="address" type="text" value="<%=(address==null)?"":address%>"><br><br>
            <%
                String password = (String) session.getAttribute("password");
                out.println("パスワードを入力してください。");
            %><br>
            <input name="password" type="text" value="<%=(password==null)?"":password%>"><br><br>

            <input type="submit" value="確認">
        </form>
        </center>
    </body>
</html>