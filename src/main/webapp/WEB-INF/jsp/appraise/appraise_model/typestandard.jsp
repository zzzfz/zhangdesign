<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/2/23
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>客户类别维护</title>
    <script src="/js/jquery-3.3.1.js" ></script>
    <link href="/css/bootstrap.css" rel="stylesheet" type="text/css">
    <script src="/js/bootstrap.js"></script>
    <script src="/js/bootstrap-table.js"></script>
    <script src="/js/bootstrap-table-zh-CN.min.js"></script>
    <link href="/css/bootstrap-table.css" rel="stylesheet" type="text/css">

    <script type="text/javascript">
        $(function () {
            initCustomerCategory();
        })
        //客户类别维护
        function initCustomerCategory() {
            $('#customerCategory_table').bootstrapTable({
                url:'${pageContext.request.contextPath}/typeList',
                type:"GET",
                uniqueId:"typecode",
                singleSelect: true,
                locale: 'zh-CN',
                search: true, //搜索
                pagination: true,   //是否显示分页条
                pageSize: 5,   //一页显示的行数
                paginationLoop: false,   //是否开启分页条无限循环，最后一页时点击下一页是否转到第一页
                pageList: [5, 10, 20], //选择每页显示多少行，数据过少时可能会没有效果
                columns:[
                    {
                        checkbox: true,
                        width: 50
                    },
                    {
                        field: 'typecode',
                        title: '分类编码',
                        valign: 'middle',
                        sortable: true,
                        width: 200
                    },
                    {
                        field: 'typename',
                        title: '分类名称',
                        valign: 'middle',
                        sortable: true,
                        width: 200
                    },{
                        field: 'mancount',
                        title: '人数',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    },{
                        field: 'mancountper',
                        title: '人数百分比',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    },{
                        field: 'upperLimit',
                        title: '得分上限',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    },{
                        field: 'downLimit',
                        title: '得分下限',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    },{
                        field: 'pri',
                        title: '序号',
                        sortable: true,
                        valign: 'middle',
                        width: 160
                    }
                ]
            })
        }
    //    添加
        function typeAdd() {
            var options = $("#selTypeName option:selected").text();
            $.ajax({
                url: "${pageContext.request.contextPath }/typeAdd",
                type:"post",
                data: JSON.stringify(
                    {
                        typename: options,
                        typecode:"",
                        mancount: $("#mancount").val(),
                        mancountper: $("#mancountper").val(),
                        upperLimit: $("#upperLimit").val(),
                        downLimit: $("#downLimit").val(),
                        pri: $("#pri").val()
                        // proportion: $("#proportion").val()
                    }
                ),
                contentType: "application/json;charset=UTF-8",
                dataType: "json",
                success: function (data) {
                    if (data!=null){
                        alert("添加成功");
                        window.location.reload();
                    }else {
                        alert("添加失败");
                    }
                }
            });
        }

    //    到修改
        function totypeEdit(){
            var types = $('#customerCategory_table').bootstrapTable('getAllSelections');
            if (types.length !== 0){
                $('#modEdit').modal('show');
            }else {
                alert("请选择要修改的选项！！！");
            }
        }
    //    点击行获取行数据并回填
        $(function () {
            $('#customerCategory_table').on('click-row.bs.table', function (e, row, element)
            {
                $('#selTypeNameEdit').val(row.typename);
                $('#mancountEdit').val(row.mancount);
                $('#typecode').val(row.typecode);
                $('#mancountperEdit').val(row.mancountper);
                $('#upperLimitEdit').val(row.upperLimit);
                $('#downLimitEdit').val(row.downLimit);
                $('#priEdit').val(row.pri);
            });
        })
    //    修改
        function typeEdit() {
            var types = $('#customerCategory_table').bootstrapTable('getAllSelections');
            if (types.length !== 0){
                var options = $("#selTypeNameEdit option:selected").text();
                $.ajax({
                    url: "${pageContext.request.contextPath}/typeEdit",
                    type:"PUT",
                    data: JSON.stringify(
                        {
                            typename: options,
                            typecode: $("#typecode").val(),
                            mancount: $("#mancountEdit").val(),
                            mancountper: $("#mancountperEdit").val(),
                            upperLimit: $("#upperLimitEdit").val(),
                            downLimit: $("#downLimitEdit").val(),
                            pri: $("#priEdit").val()
                        }
                    ),
                    contentType: "application/json;charset=UTF-8",
                    dataType: "json",
                    success: function (data) {
                        if (data!=null){
                            alert("修改成功");
                            window.location.reload();
                        }else {
                            alert("修改失败");
                        }
                    }
                });
            } else {
                alert("请选择要修改的选项！！！")
            }

        }
    //    删除
        function typeDel() {
            var types = $('#customerCategory_table').bootstrapTable('getAllSelections');
            if (types.length !== 0){
                $.ajax({
                    url:"${pageContext.request.contextPath }/typeDel",
                    type:"DELETE",
                    data: JSON.stringify({
                        typecode:types[0].typecode,
                        typename:types[0].typename,
                        mancount:types[0].mancount,
                        mancountper:types[0].mancountper,
                        upperLimit:types[0].upperLimit,
                        downLimit:types[0].downLimit,
                        pri:types[0].pri

                    }),
                    contentType: "application/json;charset=UTF-8",
                    dataType:"JSON",
                    success: function (data) {
                        if (data==200){
                            alert("删除成功");
                            window.location.reload();
                        }else {
                            alert("删除异常");
                        }
                    }

                });
            } else {
                alert("请选择要删除的行！！！")
            }
        }
    </script>
</head>
<body style="background-color: #F7F7F7">
<div style="margin: 25px">
    <!--积分标准维护列表-->
    <form name="frmCustomerCategoryMaintenance" method="post" action="#" id="CustomerCategory_list">
        <h1 style="font-size: 25px;font-weight: bold">客户类别维护</h1>
        <%--btn--%>
        <div style="margin-top: 20px">
            <button type="button" name="btnAdd" class="btn"
                    style="padding: 0px;width: 150px;height: 30px;margin-right: 15px;background-color: #17a2b8"
                    data-toggle="modal" data-target="#modAdd">
                <img src="/img/add.png" style="width: 15px">
                客户类别添加
            </button>
            <button type="button" name="btnEdit" class="btn"
                    style="padding: 0px;width: 150px;height: 30px; margin-right: 15px;background-color: #17a2b8"
                    onclick="totypeEdit()">
                <img src="/img/edit.png" style="width: 15px">
                类别信息更改
            </button>
            <button type="button" name="btnDel" class="btn"
                    style="padding: 0px;width: 150px;height: 30px;margin-right: 50px;background-color: #17a2b8" onclick="typeDel()">
                <img src="/img/del.png" style="width: 15px">
                客户类别注销
            </button>
        </div>
        <div style="height: 328px">
            <table align="center" style="height: 100px" id="customerCategory_table" data-click-to-select="true"></table>
        </div>

        <%--添加模态框--%>
        <div class="modal fade" id="modAdd" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title" id="modLabelAdd">
                            添加
                        </h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                            &times;
                        </button>
                    </div>
                    <div class="modal-body">
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">分类名称</span>
                                </div>
                                <select class="form-control" id="selTypeName">
                                    <option value ="请选择">请选择</option>
                                    <option value ="一类客户">一类客户</option>
                                    <option value ="二类客户">二类客户</option>
                                    <option value ="三类客户">三类客户</option>
                                    <option value ="四类客户">四类客户</option>
                                    <option value ="五类客户">五类客户</option>
                                </select>
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">人数</span>
                                </div>
                                <input type="text" class="form-control" name="txtNumber" id="mancount">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">得分上限</span>
                                </div>
                                <input type="text" class="form-control" name="txtGradeUp"  id="upperLimit">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">得分下限</span>
                                </div>
                                <input type="text" class="form-control" name="txtGradeDown" id="downLimit">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">人数百分比</span>
                                </div>
                                <input type="text" class="form-control" name="txtNumberProportion" id="mancountper">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">序号</span>
                                </div>
                                <input type="text" class="form-control" name="txtSerialNumber" id="pri">
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消
                        </button>
                        <input type="button" class="btn btn-primary" onclick="typeAdd()" value="添加">
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal -->
        </div>
        </div>
        <%--修改模态框--%>
        <div class="modal fade" id="modEdit" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title" id="modLabelEdit">
                            修改
                        </h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                            &times;
                        </button>
                    </div>
                    <div class="modal-body">
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">分类编码</span>
                                </div>
                                <input type="text" class="form-control" name="txtTypeCode" id="typecode" disabled="disabled">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">分类名称</span>
                                </div>
                                <select class="form-control" id="selTypeNameEdit">
                                    <option value ="请选择">请选择</option>
                                    <option value ="一类客户">一类客户</option>
                                    <option value ="二类客户">二类客户</option>
                                    <option value ="三类客户">三类客户</option>
                                    <option value ="四类客户">四类客户</option>
                                    <option value ="五类客户">五类客户</option>
                                </select>
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">人数</span>
                                </div>
                                <input type="text" class="form-control" name="txtNumber" id="mancountEdit">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">得分上限</span>
                                </div>
                                <input type="text" class="form-control" name="txtGradeUp"  id="upperLimitEdit">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">得分下限</span>
                                </div>
                                <input type="text" class="form-control" name="txtGradeDown" id="downLimitEdit">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">人数百分比</span>
                                </div>
                                <input type="text" class="form-control" name="txtNumberProportion" id="mancountperEdit">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">序号</span>
                                </div>
                                <input type="text" class="form-control" name="txtSerialNumber" id="priEdit">
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消
                        </button>
                        <input type="button" class="btn btn-primary" onclick="typeEdit()" value="确认">
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal -->
        </div>
        </div>
        </div>
    </form>
</div>
</body>
</html>
