<%-- 
    Document   : main
    Created on : 21 set. 2024, 19:55:20
    Author     : Docente
--%>

<%@include file="../WEB-INF/template/libreria.jspf" %>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../WEB-INF/template/header.jspf" %>
    </head>
    <body>
        <%@include file="../WEB-INF/template/body.jspf" %>
        <div class="container">
            <h1>Soy Rol</h1>
            <hr>
            <button type="button" class="btn btn-success" data-bs-toggle="modal" data-bs-target="#exampleModal" data-bs-whatever="@mdo"><i class="fa-solid fa-plus"></i></button>

            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">ID</th>
                        <th scope="col">ROL</th>
                        <th scope="col">ESTADO</th>
                        <th scope="col" colspan="2">ACCION</th>
                    </tr>
                </thead>
                <tbody>

                </tbody>
            </table>
        </div>
        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h1 class="modal-title fs-5" id="exampleModalLabel">Nuevo Rol</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form>
                            <div class="mb-3">
                                <label for="recipient-name" class="col-form-label">Rol:</label>
                                <input type="text" class="form-control" name="rol" id="rol">
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary" id="guardar">Guardar</button>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade" id="exampleModal2" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h1 class="modal-title fs-5" id="exampleModalLabel">Editar Rol</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form>
                            <div class="mb-3">
                                <label for="recipient-name" class="col-form-label">Rol:</label>
                                <input type="text" class="form-control" name="rol_edit" id="rol_edit">
                                <input type="hidden" class="form-control" name="id_rol_edit" id="id_rol_edit">
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary" id="editar">Editar</button>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="../WEB-INF/template/footer.jspf" %>
        <script src="assets/js/rol.js"></script>
    </body>
</html>
<%@include file="../WEB-INF/template/final.jspf" %>