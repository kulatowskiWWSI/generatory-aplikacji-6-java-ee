<%--
  Created by IntelliJ IDEA.
  User: Kamil
  Date: 22.12.2018
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Generatory aplikacji 6</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  </head>
  <body>
      <div class="container" style="margin-top: 5%">
        <h2>Generatory aplikacji 6</h2>
        <div class="card">
          <div class="card-header">Bankomat</div>
          <div class="card-body">
              <form method="post" action="/app/login">
                  <label for="pin">Podaj PIN:</label>
                  <input id="pin" type="password" name="pin">
                  <br>
                  <br>
                  <button type="submit" class="btn btn-primary">Zatwierdź</button>
              </form>
          </div>
          <div class="card-footer">Aplikacja stworzona przez: Kamil Ulatowski</div>
        </div>
      </div>
  </body>
</html>
