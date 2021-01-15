
$('document').ready(function(){
    $('table #editButton').on('click',function(event){
        event.preventDefault();
        // var herf = $(this).attr('href', );
        //
        // $.get(this.href, function(city){
        //     $('#cityidEdit').val(city.cityid);
        //     $('#citynameEdit').val(city.cityname);
        //     $('#citypostalcodeEdit').val(city.citypostalcode);
        // });
        // $('confirmUpdateButton').attr('href', href);
        $('#editModal').modal();
    });
    $('table #deleteButton').on('click', function(event){
        event.preventDefault();
        var href = $(this).attr('href');

        $('#confirmDeleteButton').attr('href', href);
        $('#deleteModal').modal();
    });
});
// event.preventDefault();
// // var href = $(this).attributes('href');
// var href = $(this).attr('href');
// $.get(href, function(city, status){
//     $('#cityidEdit').val(city, id);
//     $('#citynameEdit').val(city, cityname);
//     $('#citypostalcodeEdit').val(city, citypostalcode);
// });