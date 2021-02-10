
$('document').ready(function(){
    $('table #editButton').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $.get(href, function(administrative, status){
            $('#administrativeEnrollDateEdit').val(administrative.enrollDate);
            $('#firstNameEdit').val(administrative.firstname);
            $('#lastNameEdit').val(administrative.lastname);
            // $('#flpImageEdit').val(administrative.photo);
            $('#emailEdit').val(administrative.email);

            $('#txtUsernameEdit').val(administrative.username);
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

    $('.table #photoButton').on('click', function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $('#photoModal #administrativePhoto').attr('src', href);
        $('#photoModal').modal();
    })
});