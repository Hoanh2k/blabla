<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html lang="zxx" class="no-js">
<head>
    <!-- Mobile Specific Meta -->
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Favicon-->
    <link rel="shortcut icon" href="/img/img/fav.png">
    <!-- Author Meta -->
    <meta name="author" content="CodePixar">
    <!-- Meta Description -->
    <meta name="description" content="">
    <!-- Meta Keyword -->
    <meta name="keywords" content="">
    <!-- meta character set -->
    <meta charset="UTF-8">
    <!-- Site Title -->
    <title>Sport Shoes</title>
    <style>

        /* Thêm CSS để tạo biểu tượng giỏ hàng */
        .cart-icon::before {
            content: '\1F6D2'; /* Mã Unicode cho biểu tượng giỏ hàng */
            font-size: 20px;
            display: inline-block;
        }

    </style>
    <!--
        CSS
        ============================================= -->
    <link rel="stylesheet" href="/resources/css/linearicons.css">
    <link rel="stylesheet" href="/resources/css/font-awesome.min.css">
    <link rel="stylesheet" href="/resources/css/themify-icons.css">
    <link rel="stylesheet" href="/resources/css/bootstrap.css">
    <link rel="stylesheet" href="/resources/css/owl.carousel.css">
    <link rel="stylesheet" href="/resources/css/nice-select.css">
    <link rel="stylesheet" href="/resources/css/nouislider.min.css">
    <link rel="stylesheet" href="/resources/css/ion.rangeSlider.css"/>
    <link rel="stylesheet" href="/resources/css/ion.rangeSlider.skinFlat.css"/>
    <link rel="stylesheet" href="/resources/css/magnific-popup.css">
    <link rel="stylesheet" href="/resources/css/main.css">

</head>

<body>

<!-- Start Header Area -->
<header class="header_area sticky-header">
    <div class="main_menu">
        <nav class="navbar navbar-expand-lg navbar-light main_box" style="max-width: 2000px">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <a class="navbar-brand logo_h" href="/TrangChu/listGiayTheThao"><img src="../resources/img/banner/banner-img1.png" alt="" style="float:left;width: 80px; border: 1px solid white; border-radius: 1000px 1500px 700px;"></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse offset" id="navbarSupportedContent">
                    <ul class="nav navbar-nav menu_nav ml-auto" style="margin-right: -450px">
                        <li class="nav-item"><a class="nav-link" href="/TrangChu/listGiayTheThao">Trang chủ</a></li>
                        <li class="nav-item submenu dropdown">
                            <a href="/TrangChu/listGiayTheThao/Details" class="nav-link dropdown-toggle" data-toggle="" role="button" aria-haspopup="true"
                               aria-expanded="true">Cửa hàng</a>
                        </li>
                        <li class="nav-item submenu dropdown">
                            <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button"
                               aria-haspopup="true"
                               aria-expanded="false">Tin tức</a>
                        </li>
                        <li class="nav-item"><a class="nav-link" href="#">Liên hệ</a></li>
                    </ul>
                    <ul class="nav navbar-nav menu_nav ml-auto">
                        <div class="row">
                            <div class="col-4">
                                <a href="/GiayTheThao/NguoiDung/ViewGioHang">
                                    <span style=" margin-top: 10px; margin-left: 40px; width: 60px; font-size: 22px;display: inline-block;color: black" class="fa fa-shopping-cart" ></span>
                                </a>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-4" style="margin-left: 0px;margin-right: 65px">
                                <li class="nav-item submenu dropdown">
                                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button"
                                       aria-haspopup="true"
                                       aria-expanded="false">
                                        <i class="fa fa-user fa-2x" style="color: black;"></i>
                                    </a>
                                    <ul class="dropdown-menu">
                                        <li class="nav-item">
                                            <a href="/KhachHang/loginViewDangNhap">
                                                <p style="color: black;font-weight: bold; margin-left: 15px">
                                                    Đăng Nhập</p>
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                            </div>
                        </div>
                    </ul>
                </div>

                <%--                <div class="row">--%>
                <%--                    <div class="col-12">--%>
                <%--                        <a href="/KhachHang/loginViewDangNhap">--%>
                <%--                            <p style="margin-top: 17px;margin-right: 20px;color: black;font-size: 15px;font-weight: bold">--%>
                <%--                                Đăng Nhập</p>--%>
                <%--                        </a>--%>
                <%--                    </div>--%>
                <%--                </div>--%>
            </div>
        </nav>
    </div>
</header>
<!-- End Header Area -->

<script src="/resources/js/vendor/jquery-2.2.4.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"
        integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
        crossorigin="anonymous"></script>
<script src="/resources/js/vendor/bootstrap.min.js"></script>
<script src="/resources/js/jquery.ajaxchimp.min.js"></script>
<script src="/resources/js/jquery.nice-select.min.js"></script>
<script src="/resources/js/jquery.sticky.js"></script>
<script src="/resources/js/nouislider.min.js"></script>
<script src="/resources/js/countdown.js"></script>
<script src="/resources/js/jquery.magnific-popup.min.js"></script>
<script src="/resources/js/owl.carousel.min.js"></script>
<!-- Google Maps API -->
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCjCGmQ0Uq4exrzdcL6rvxywDDOvfAu6eE"></script>
<script src="/resources/js/gmaps.min.js"></script>
<script src="/resources/js/main.js"></script>
</body>
</html>
