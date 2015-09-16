<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="">
  <meta name="author" content="">

  <!-- Latest compiled and minified CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

  <!-- Custom Fonts -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

  <script src="//code.jquery.com/jquery-1.11.3.min.js"></script>

</head>
<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-5" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Security-Test</a>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-5">
      <p class="navbar-text navbar-right"><i class="fa fa-sign-out">
        <a href="/security-test/j_spring_security_logout" style="margin-right:15px">Logout</a></i>Logado como <sec:authentication property="name"/>
      </p>
    </div>
  </div>
</nav>

<span class="col-md-12">

  <div class="panel panel-default">
    <div class="panel-heading">
      <h3 class="panel-title">Permissoes</h3>
    </div>
    <div class="panel-body">

      <span class="col-md-6">
        <table id="tbPermissoes" class="table table-bordered table-hover">
          <thead>
          <th>Perfil</th>
          <th>Financeiro</th>
          <th>Vendas</th>
          <th>Relatórios</th>
          </thead>
          <tbody>
          <tr>
            <td><a href="alterarPerfil?index=0">Administrador</a></td>
            <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
            <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
            <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
          </tr>
          <tr>
            <td><a href="alterarPerfil?index=1">Vendedor</a></td>
            <td><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></td>
            <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
            <td><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></td>
          </tr>
          <tr>
            <td><a href="alterarPerfil?index=2">Financeiro</a></td>
            <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
            <td><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></td>
            <td><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></td>
          </tr>
          </tbody>
        </table>
      </span>

    </div>
  </div>

</span>

<span class="col-md-1">
  <a href="index" role="button" class="btn btn-primary" >Voltar</a>
</span>

</body>

<script>

  /*$(function() {
    $("#tbPermissoes").find("tbody tr:first").addClass("active");
    $("#tbPermissoes").find("tbody tr").click(function(){
      if(confirm("Deseja mudar para este perfil?")){
        $("#tbPermissoes tbody tr").each(function(){
          $(this).removeClass("active");
        })
        $(this).addClass("active");
      }
    })
  });*/

</script>

</html>