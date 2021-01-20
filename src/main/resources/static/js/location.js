$('document').ready(function(){
    $('table #editButton').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $.get(href, function(location, status){
            $('#locationidEdit').val(location.locationid);
            $('#dllCityEdit').val(location.cityid);
            $('#dllRegionEdit').val(location.regionid);
            $('#locationDescriptionEdit').val(location.description);
            $('#locationDetailsEdit').val(location.details);
        });
        $('#editModal').modal();
    });
    $('table #detailsButton').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $.get(href, function(location, status){
            $('#locationidDetail').val(location.locationid);
            $('#dllCityDetail').val(location.cityid);
            $('#dllRegionDetail').val(location.regionid);
            $('#locationDescriptionDetail').val(location.description);
            $('#locationDetailsDetail').val(location.details);
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