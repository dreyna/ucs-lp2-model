$(document).ready(function () {
    listar();
});
function listar() {
    $.get('rc', {'opc': 1}, function (data) {
        let x = JSON.parse(data);
        $(".table tbody tr").remove();
        for (var i = 0; i < x.length; i++) {
            $(".table").append("<tr><td>" + (i + 1) + "</td><td>" + x[i].idrol + "</td><td>" + x[i].nombre + "</td><td>" + x[i].estado + "</td><td><a href='#' onclick='editar(" + x[i].idrol + ")' class='text-warning'><i class='far fa-edit'></i></a></td><td><a href='#' onclick='eliminar(" + x[i].idrol + ")' class='text-danger'><i class='fas fa-trash-alt'></i></a></td></tr>");
        }
    });
}
$("#guardar").click(function () {
    let rol = $("#rol").val();
    $.post("rc", {'opc': 2, 'rol': rol}, function (data) {
        listar();
        limpliar();
        bootbox.alert('Rol creado Correctamente...!');
    });
    $("#exampleModal").modal('hide');

});
function eliminar(id) {
    bootbox.confirm({
        message: 'Realmente desea Eliminar...!',
        buttons: {
            confirm: {
                label: 'Yes',
                className: 'btn-success'
            },
            cancel: {
                label: 'No',
                className: 'btn-danger'
            }
        },
        callback: function (result) {
            if (result) {
                $.get('rc', {'opc': 3, 'id': id}, function (data) {
                    listar();
                });
            } else {

            }
        }
    });
}
$('#editar').click(function () {

    $('#exampleModal2').modal('hide');

    bootbox.confirm({
        message: 'Realmente desea Modificar...!',
        buttons: {
            confirm: {
                label: 'Yes',
                className: 'btn-success'
            },
            cancel: {
                label: 'No',
                className: 'btn-danger'
            }
        },
        callback: function (result) {
            if (result) {
                let rol = $('#rol_edit').val();
                let id = $('#id_rol_edit').val();
                $.get('rc', {'opc': 5, 'id': id, 'rol': rol}, function (data) {
                    listar();
                    limpliar();
                });
            } else {

            }
        }
    });
});
function editar(id) {
    let nom_rol = $('#rol_edit').val();
    $.get('rc', {'opc': 4, 'id': id, 'rol': nom_rol}, function (data) {
        let x = JSON.parse(data);
        $('#rol_edit').val(x.nombre);
        $('#id_rol_edit').val(x.idrol);
        $('#exampleModal2').modal('show');
    });
}
function limpliar() {
    $('#rol').val(null);
    $('#rol_edit').val(null);
    $('#id_rol_edit').val(null);
}