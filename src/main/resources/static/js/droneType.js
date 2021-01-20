$('document').ready(function(){
    $('table #editButton').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $.get(href, function(droneType, status){
            $('#idEdit').val(droneType.id);
            $('#descriptionEdit').val(droneType.description);
            $('#detailsEdit').val(droneType.details);
        });
        $('#editModal').modal();
    });
    $('table #detailsButton').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $.get(href, function(droneType, status){
            $('#idDetail').val(droneType.id);
            $('#descriptionDetail').val(droneType.description);
            $('#detailsDetail').val(droneType.details);
        });
        $('#detailModal').modal();
    });

    $('table #deleteButton').on('click', function(event){
        event.preventDefault();
        var href = $(this).attr('href');

        $('#confirmDeleteButton').attr('href', href);
        $('#deleteModal').modal();
    });
});