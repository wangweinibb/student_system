<%@ page isELIgnored="false" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>index.html</title>

    <meta name="keywords" content="keyword1,keyword2,keyword3">
    <meta name="description" content="this is my page">
    <meta name="content-type" content="text/html; charset=GBK">
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/back/statics/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/back/statics/js/jquery-1.8.3.min.js"></script>
</head>

<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-12">
            <h1 class="text-center">用户登录</h1>
        </div>
    </div>
    <div class="row" style="margin-top: 30px;">
        <div class="col-sm-4 col-sm-offset-4">
            <form action="${pageContext.request.contextPath}/load/login" method="post">
                <div class="form-group">
                    <label>用户名:</label>
                    <input type="text" class="form-control" name="name">
                </div>
                <div class="form-group">
                    <label >密&nbsp;&nbsp;码:</label>
                    <input type="password" name="pwd" class="form-control">
                </div>
                <div class="form-group">
                    <label >验证码:</label>
                    <div>
                        <input type="text" name="code" class="form-control" style="width: 65%;height:40px;float: left">
                        <img id="num" src="${pageContext.request.contextPath}/load/code" onclick="this.src='${pageContext.request.contextPath}/load/code?'+Math.random()" style="cursor:pointer;float: right;height: 40px;width: 30%;" />
                    </div>
                </div>
                <div class="clearfix"></div>
                <div style="margin-top: 10px;">
                    <input class="btn btn-success btn-block" type="submit" value="登录"/>
                    <input class="btn btn-info btn-block" onclick="location.href='${pageContext.request.contextPath}/back/regist.jsp'" type="button" value="还没有账号,点我去注册"/>
                    <h5 style="color: red">${requestScope.message}</h5>
                </div>
                <div c:if="${param.msg}!=null" style="margin-top: 10px;">
                    <p class="bg-danger">${param.msg}</p>
                </div>
            </form>

        </div>
    </div>
</div>
</body>
</html>
<script>
    $(function(){
        $("#img").click(function () {
            var src  = "${pageContext.request.contextPath}/user/getImgCode?code="+Math.random();
            $(this).attr("src",src);

        });
    })
</script>