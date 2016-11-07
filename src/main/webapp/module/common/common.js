/**
 * dataTable default setting
 * @param settings
 * @returns {{paging: boolean, pageLength: number, lengthChange: boolean, filter: boolean, sort: boolean, info: boolean, autoWidth: boolean, processing: boolean, serverSide: boolean, dom: string, language: {lengthMenu: string, zeroRecords: string, info: string, infoEmpty: string, infoFiltered: string, paginate: {previous: string, next: string}}, ajax: {url: *, type: string, data: ajax."data"}, columns: *}}
 */
var defaultSettings = function (settings) {
    if(!settings||!settings.url||!settings.query||!settings.columns){
        throw new error("settings[url,query,columns] must be set");
    }
    return {
        "paging": true,
        "pageLength": 10, //默认每页数量
        "lengthChange": true, //改变每页显示数据数量
        "filter": true, //过滤功能
        "sort": false, //排序功能
        "info": true, //页脚信息
        "autoWidth": true, //自动宽度
        // "retrieve": true,
        "responsive": true,
        "processing": true,
        "serverSide": true,//服务器端进行分页处理的意思
        // "searching":true,
        "dom": "rtip",
        "language": {
            "lengthMenu": "_MENU_ 条记录每页",
            "zeroRecords": "没有找到记录",
            "info": "第 _PAGE_ 页 ( 总共 _PAGES_ 页 )",
            "infoEmpty": "无记录",
            "infoFiltered": "(从 _MAX_ 条记录过滤)",
            "paginate": {
                "previous": "上一页",
                "next": "下一页"
            }
        },
        "ajax": {
            "url": settings.url,
            "type": 'POST',
            "data": function (data) {
                console.info(data);
                return  {
                    draw: data.draw,
                    start: data.start,
                    length: data.length,
                    query: JSON.stringify(settings.query())
                };
            }
        },
        "columns": settings.columns
    };
};