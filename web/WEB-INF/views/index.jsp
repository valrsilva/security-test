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
          <h3 class="panel-title">Sistema de Vendas</h3>
      </div>
      <div class="panel-body">

      <span class="col-md-6">
        <ul class="list-group">
            <li class="list-group-item">
                <a href="#" role="button" class="btn btn-primary <sec:authorize access="!hasRole('ROLE_VENDEDOR')">disabled</sec:authorize>" >Vendas</a>
            </li>
            <li class="list-group-item">
                <a href="#" role="button" class="btn btn-primary <sec:authorize access="!hasRole('ROLE_FINANCEIRO')">disabled</sec:authorize>" >Financeiro</a>
            </li>
            <li class="list-group-item">
                <a href="#" role="button" class="btn btn-primary <sec:authorize access="!hasRole('ROLE_ADMIN')">disabled</sec:authorize>" >Relatorios</a>
            </li>
            <li class="list-group-item">
                <a href="permissoes" role="button" class="btn btn-primary" >Permissoes</a>
            </li>
        </ul>
      </span>

      </div>
  </div>

</span>





</body>
</html>