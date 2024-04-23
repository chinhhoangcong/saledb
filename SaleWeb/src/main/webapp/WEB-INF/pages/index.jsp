<%-- 
    Document   : index
    Created on : Apr 21, 2024, 10:20:49 PM
    Author     : ACER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bán Hàng</title>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
        <script src="<c:url value="/js/script.js" />"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Sale Web</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="collapsibleNavbar">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link" href="#">Trang chủ</a>
                        </li>
                        <c:forEach items="${category}" var="c">
                            <li class="nav-item">
                                <a class="nav-link" href="#">${c.name}</a>
                            </li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </nav>
        <h1 class="text-center text-info mt-1">QUẢN TRỊ SẢN PHẨM</h1>
        <div>
            <a class="btn btn-success" href="<c:url value="/products" />">Thêm sản phẩm</a>
        </div>
        <section class="container" >
            <table class="table table-striped mt-1">
                <tr>
                    <th></th>
                    <th>Id</th>
                    <th>Tên</th>
                    <th>Giá</th>
                    <th></th>
                </tr>
                <c:forEach items="${products}" var="p">
                    <tr>
                        <td> <img class="card-img-top" src="${p.image}" alt="${p.name}" style="width:200px;"></td>
                        <td>${p.id}</td>
                        <td>${p.name}</td>
                        <td>${String.format("%,d", p.price)} VNĐ</td>
                        <td>

                            <a class="btn btn-info" href="#" />Cập nhật</a>
                            <button  class="btn btn-danger">Xóa</button>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </section>
    </body>
</html>
