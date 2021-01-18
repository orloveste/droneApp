$('document').ready(function(){
    $('table #editButton').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $.get(href, function(region, status){
            $('#regionidEdit').val(region.regionid);
            $('#dllCityEdit').val(region.cityid);
            $('#regionnameEdit').val(region.regionname);
            $('#regionstreetpostalcodeEdit').val(region.regionstreetpostalcode);
        });
        $('#editModal').modal();
    });
    $('table #detailsButton').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $.get(href, function(region, status){
            $('#regionidDetail').val(region.regionid);
            $('#dllCityDetail').val(region.cityid);
            $('#regionnameDetail').val(region.regionname);
            $('#regionstreetpostalcodeDetail').val(region.regionstreetpostalcode);
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