
$('document').ready(function(){
    $('table #editButton').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $.get(href, function(client, status){
            $('#clientidEdit').val(client.clientid);
            $('#nameEdit').val(client.name);
            $('#addressEdit').val(client.address);
            $('#clientcityEdit').val(client.clientcity);
            $('#phoneEdit').val(client.phone);
            $('#emailEdit').val(client.email);
        });
        $('#editModal').modal();
    });
    $('table #detailsButton').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $.get(href, function(client, status){
            $('#clientidDetail').val(client.clientid);
            $('#nameDetail').val(client.name);
            $('#addressDetail').val(client.address);
            $('#clientcityDetail').val(client.clientcity);
            $('#phoneDetail').val(client.phone);
            $('#emailDetail').val(client.email);
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