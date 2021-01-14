
$('document').ready(function(){
    $('table #editButton').on('click', function(event){
        // var herf = $(this).attr('href')
        // $.get(href, function(city, status){
        //     $('#idEdit').val(city.cityid);
        //     $('#citynameEdit').val(city.cityname);
        //     $('#citypostalcodeEdit').val(city.citypostalcode);
        // });
        $('#editModal').modal();
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