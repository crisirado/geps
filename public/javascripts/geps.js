$(document).ready(function () {
    $(".table-link tbody tr").on("click", function () {
       
        //console.log($(this).data("id"));
        
        $.ajax({
            type: "GET",
            url:"detalhes/",
            dataType: "html",
            
            data: {
                usuarioId:  $(this).data("id")
            },
            success: function(dados)
            {                
                $("#modalUsuario").find(".modal-body").html(dados);
                $("#modalUsuario").modal('show');
            },
            error: function(){
                alert("Houve um erro ao tentar visualizar.");
            }
        });
        
    });
});