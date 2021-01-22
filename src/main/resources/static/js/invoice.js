
$('document').ready(function(){
    $('table #editButton').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $.get(href, function(invoice, status){
            $('#invoiceIdEdit').val(invoice.id);
            $('#dllClientEdit').val(invoice.clientid);
            var invoicedate = invoice.invoicedate.substr(0,16);
            $('#invoiceDateEdit').val(invoice.invoicedate);

            $('#invoiceRemarksEdit').val(invoice.remarks);
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
