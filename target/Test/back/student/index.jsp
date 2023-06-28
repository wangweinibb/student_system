<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>学生列表</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/back/statics/css/bootstrap.min.css">
    <style>
        .form-control {
            height: 30px;
        }

        .pagination {
            margin-top: 0px;
        }
    </style>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-12" style="text-align: center">
            <form class="form-inline" action="${pageContext.request.contextPath}/student/selectLike" method="post">
                <div class="form-group">
                    <label>请选择:</label>
                    <select class="form-control" style="height: 30px; width: 100px;" name="colName">
                        <option value="name">姓名</option>
                        <option value="phone">手机</option>
                        <option value="qq">QQ</option>
                    </select>
                    <input type="text" class="form-control" name="colValue" style="height: 30px; width: 300px;">
                </div>
                <button type="submit" class="btn btn-primary btn-sm">搜索</button>
            </form>
        </div>
    </div>
    <div class="row" style="margin-top: 15px;height: 300px">
        <c:if test="${user.role=='管理员'}">
            <div class="col-sm-12" style="margin-bottom: 10px;">${user.name}
                <a href="${pageContext.request.contextPath}/student/getMany" class="btn btn-sm btn-success">添加学生信息</a>
            </div>
        </c:if>
        <div class="col-sm-12">
            <c:if test="${requestScope.total!=0}">
                <table class="table table-hover table-bordered table-striped">
                    <thead>
                    <tr>
                        <th>姓名</th>
                        <th>电话</th>
                        <th>年龄</th>
                        <th>生日</th>
                        <th>星座</th>
                        <th>生肖</th>
                        <th>班级</th>
                        <th>小组</th>
                        <th>就业城市</th>
                        <th>标签</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <c:forEach items="${student}" var="student">
                        <tr>
                            <td>${student.name}</td>
                            <td>${student.phone}</td>
                            <td>${student.age}</td>
                            <td>${student.bir}</td>
                            <td>${student.starts}</td>
                            <td>${student.attr}</td>
                            <td>${student.clazz.name}</td>
                            <td>${student.group.name}</td>
                            <td>${student.city.name}</td>
                            <td>
                                <c:forEach items="${student.tag.name}" var="tag">
                                    ${tag}
                                </c:forEach>
                            </td>
                            <td>
                                <c:if test="${sessionScope.user.role=='管理员'}">
                                    <a href="${pageContext.request.contextPath}/student/changeStudent?id=${student.id}&name=${student.name}&bir=${student.bir}&qq=${student.qq}&phone=${student.phone}&clazz_name=${student.clazz.name}&group_name=${student.group.name}&city_name=${student.city.name}"
                                       class="btn btn-warning btn-sm">修改</a>
                                    <a href="${pageContext.request.contextPath}/student/removeStudent?id=${student.id}" class="btn btn-danger btn-sm">删除</a>
                                </c:if>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </c:if>
        </div>
 
    
    <script>
        var students = document.querySelectorAll("table tr");
        var pageSize = 10;
        var pageCount = Math.ceil(students.length / pageSize);
        var currentPage = 1;
        var start = (currentPage - 1) * pageSize;
        var end = start + pageSize;
        for (var i = 1; i < students.length; i++) {
            if (i < start || i >= end) {
                students[i].style.display = "none";
            } else {
                students[i].style.display = "table-row";
            }
        }
        var pagination = document.createElement("ul");
        pagination.classList.add("pagination");
        var prev = document.createElement("li");
        var prevLink = document.createElement("a");
        prevLink.href = "#";
        prevLink.innerHTML = "上一页";
        prev.appendChild(prevLink);
        pagination.appendChild(prev);
        for (var i = 1; i <= pageCount; i++) {
            var li = document.createElement("li");
            var a = document.createElement("a");
            a.href = "#";
            a.innerHTML = i;
            li.appendChild(a);
            pagination.appendChild(li);
        }
        var next = document.createElement("li");
        var nextLink = document.createElement("a");
        nextLink.href = "#";
        nextLink.innerHTML = "下一页";
        next.appendChild(nextLink);
        pagination.appendChild(next);
        var container = document.querySelector(".container-fluid");
        container.appendChild(pagination);
        var links = document.querySelectorAll(".pagination li a");
        links[0].addEventListener("click", function (event) {
            event.preventDefault();
            if (currentPage > 1) {
                currentPage--;
                start = (currentPage - 1) * pageSize;
                end = start + pageSize;
                for (var i = 1; i < students.length; i++) {
                    if (i < start || i >= end) {
                        students[i].style.display = "none";
                    } else {
                        students[i].style.display = "table-row";
                    }
                }
            }
        });
        links[pageCount + 1].addEventListener("click", function (event) {
            event.preventDefault();
            if (currentPage < pageCount) {
                currentPage++;
                start = (currentPage - 1) * pageSize;
                end = start + pageSize;
                for (var i = 1; i < students.length; i++) {
                    if (i < start || i >= end) {
                        students[i].style.display = "none";
                    } else {
                        students[i].style.display = "table-row";
                    }
                }
            }
        });
        for (var i = 1; i <= pageCount; i++) {
            links[i].addEventListener("click", function (event) {
                event.preventDefault();
                currentPage = parseInt(this.innerHTML);
                start = (currentPage - 1) * pageSize;
                end = start + pageSize;
                for (var i = 1; i < students.length; i++) {
                    if (i < start || i >= end) {
                        students[i].style.display = "none";
                    } else {
                        students[i].style.display = "table-row";
                    }
                }
            });
        }
    </script>



        
    </div>
</div>
</body>
</html>
