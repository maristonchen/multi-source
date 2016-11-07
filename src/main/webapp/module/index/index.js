$(function () {
    $('#side-menu li a').click(function (e) {
        e.preventDefault();
        var url = this.href;
        if (url != null && url.indexOf('#') < 0) {
            $.get(url, function (data) {
                $('#page-wrapper').html(data);
            });
        }
    });
});