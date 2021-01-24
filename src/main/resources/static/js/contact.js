
$('document').ready(function(){
    $('table #editButton').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $.get(href, function(contact, status){
            $('#contactIdEdit').val(contact.id);
            $('#firstNameEdit').val(contact.firstname);
            $('#lastNameEdit').val(contact.lastname);
            $('#emailEdit').val(contact.email);
            $('#phoneEdit').val(contact.phone);
        });
        $('#editModal').modal();
    });


    $('table #deleteButton').on('click', function(event){
        event.preventDefault();
        var href = $(this).attr('href');

        $('#confirmDeleteButton').attr('href', href);
        $('#deleteModal').modal();
    });
});