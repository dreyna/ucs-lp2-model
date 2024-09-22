<%-- 
    Document   : index
    Created on : 21 set. 2024, 19:06:47
    Author     : Docente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UCS</title>
        <link rel="shortcut icon" href="assets/images/icons8-universidad-16.png" />
        <link rel="stylesheet" href="assets/bootsptrap/css/bootstrap.min.css"/>
        <style>
            .max-width{
                width: 100%;
                max-width: 350px;
                padding: 15px;
                margin: 0 auto;
            }
            .box{
                box-shadow:
                    inset 0 -3em 3em rgba(0, 0, 0, 0.1),
                    0 0 0 2px rgb(255, 255, 255),
                    0.3em 0.3em 1em rgba(0, 0, 0, 0.3);
            }
        </style>
    </head>
    <body class="d-flex justify-content-center align-items-center vh-100">
        <div class="border border-2 rounded-4 max-width shadow p-4 mb-5 bg-body rounded">
            <div class="d-flex flex-column align-items-center">
                <img src="assets/images/user-name-15-128.png" width="128" alt="alt"/>
            </div>            
            <form action="lc" method="post">
                <div class="form-group mb-3">
                    <label for="exampleInputUsuario" class="mb-1 fw-bold">Usuario:</label>
                    <input type="text" class="form-control" id="exampleInputUsuario" aria-describedby="emailHelp" placeholder="Usuario" name="username">                    
                </div>
                <div class="form-group mb-3">
                    <label for="exampleInputPassword1" class="mb-1 fw-bold">Password</label>
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="clave">
                </div>
                <button type="submit" class="btn btn-primary">Enviar</button>
            </form>
        </div>
    </body>
</html>
