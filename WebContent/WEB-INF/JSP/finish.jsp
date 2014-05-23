<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>登録完了</title>
    </head>
<body>
    <center>
        <h1>登録完了</h1>
        <hr>
        以下の内容で登録します。<br> 名 前 :
        <%=(String) session.getAttribute("name")%><br> <br>
        ニックネーム :
        <%=(String) session.getAttribute("nickname")%><br> <br>
        メールアドレス:
        <%=(String) session.getAttribute("address")%><br> <br>
        パスワード :
        <%=(String) session.getAttribute("password")%><br> <br>

        <a href="register">Topに戻る</a>;
    </center>
</body>
</html>