<!DOCTYPE html>
<html lang="en">

<head>

	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="">
	<meta name="author" content="">

	<title>SB Admin 2 - Bootstrap Admin Theme</title>

	<!-- Bootstrap Core CSS -->
	<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">

	<!-- Custom CSS -->
	<link href="resources/css/sb-admin-2.css" rel="stylesheet">

	<!-- Custom Fonts -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

	<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
	<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
	<![endif]-->

</head>

<body>

<div class="container">
	<div class="row">
		<div class="col-md-4 col-md-offset-4">
			<div class="login-panel panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Please Sign In</h3>
				</div>
				<div class="panel-body">
					<form role="form" action="j_spring_security_check" name="f" method="POST">
						<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
						<fieldset>
							<div class="form-group">
								<input class="form-control" placeholder="E-mail" name="j_username" type="email" autofocus>
							</div>
							<div class="form-group">
								<input class="form-control" placeholder="Password" name="j_password" type="password" value="">
							</div>
							<div class="checkbox">
								<label>
									<input name="_spring_security_remember_me" type="checkbox">Remember Me
								</label>
							</div>
							<!-- Change this to a button or input when using this as a form -->
							<input type="submit" class="btn btn-lg btn-success btn-block"/>
						</fieldset>
					</form>
				</div>
				<div class="panel-footer">
					<div style="word-wrap: break-word; color: red">
						${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"]}
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<!-- jQuery -->
<script src="resources/jquery/jquery-1.11.1.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="resources/bootstrap/js/bootstrap.min.js"></script>

<!-- Custom Theme JavaScript -->
<script src="resources/js/sb-admin-2.js"></script>

</body>

</html>
