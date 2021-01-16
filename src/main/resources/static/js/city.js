
$('document').ready(function(){
    $('table #editButton').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $.get(href, function(city, status){
            $('#cityidEdit').val(city.cityid);
            $('#citydescriptionEdit').val(city.citydescription);
            $('#citynameEdit').val(city.cityname);
            $('#citypostalcodeEdit').val(city.citypostalcode);
        });
        $('#editModal').modal();
    });
    $('table #detailsButton').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $.get(href, function(city, status){
            $('#cityidDetail').val(city.cityid);
            $('#citydescriptionDetail').val(city.citydescription);
            $('#citynameDetail').val(city.cityname);
            $('#citypostalcodeDetail').val(city.citypostalcode);
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
// event.preventDefault();
// // var href = $(this).attributes('href');
// var href = $(this).attr('href');
// $.get(href, function(city, status){
//     $('#cityidEdit').val(city, id);
//     $('#citynameEdit').val(city, cityname);
//     $('#citypostalcodeEdit').val(city, citypostalcode);
// });