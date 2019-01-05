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
              <span>Użytkownik: ${customer.name}</span><br>
              <span>Stan konta: ${bankAccount.balance} ${bankAccount.currency}</span><hr>
              <form method="post" action="/app/incash">
                  <span>Wpłać pieniądze</span><br>
                  <label for="input10">10 x </label>
                  <input id="input10" type="text" name="input10" value="0">
                  <br>
                  <label for="input20">20 x </label>
                  <input id="input20" type="text" name="input20" value="0">
                  <br>
                  <label for="input50">50 x </label>
                  <input id="input50" type="text" name="input50" value="0">
                  <br>
                  <label for="input100">100 x </label>
                  <input id="input100" type="text" name="input100" value="0">
                  <br>
                  <label for="input200">200 x </label>
                  <input id="input200" type="text" name="input200" value="0">
                  <br>
                  <label for="input500">500 x </label>
                  <input id="input500" type="text" name="input500" value="0">
                  <br>
                  <button type="submit" class="btn btn-primary">Wpłać</button>
              </form>
              <hr>
              <form method="post" action="/app/outcash">
                  <span>Wypłać pieniądze</span>
                  <br>
                  <label for="output10">10 x </label>
                  <input id="output10" type="text" name="output10" value="0">
                  <br>
                  <label for="output20">20 x </label>
                  <input id="output20" type="text" name="output20" value="0">
                  <br>
                  <label for="output50">50 x </label>
                  <input id="output50" type="text" name="output50" value="0">
                  <br>
                  <label for="output100">100 x </label>
                  <input id="output100" type="text" name="output100" value="0">
                  <br>
                  <label for="output200">200 x </label>
                  <input id="output200" type="text" name="output200" value="0">
                  <br>
                  <label for="output500">500 x </label>
                  <input id="output500" type="text" name="output500" value="0">
                  <br>
                  <button type="submit" class="btn btn-secondary">Wypłać</button>
              </form>
          </div>
          <div class="card-footer">Aplikacja stworzona przez: Kamil Ulatowski</div>
        </div>
      </div>
  </body>
</html>
