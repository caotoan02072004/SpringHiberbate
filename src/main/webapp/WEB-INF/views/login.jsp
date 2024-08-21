<%@include file="/common/taglib.jsp"%>

<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Login</title>
    <!-- Favicon -->
    <link rel="shortcut icon" href="images/favicon.ico" />
    <!-- Bootstrap CSS -->
	  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" />
      <!-- Typography CSS -->
	  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/typography.css" />
      <!-- Style CSS -->
	  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
      <!-- Responsive CSS -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/responsive.css" />
</head>

<body>
    <!-- loader Start -->
    <!-- <div id="loading">
        <div id="loading-center">
        </div>
    </div> -->
    <!-- loader END -->
    <!-- Sign in Start -->
    <!-- <section class="sign-in-page">
        <div class="container p-0">
           <div class="alert alert-danger alert-dismissible fade show" role="alert">
              <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
             <h4 class="text-center" style="color: red;">${msg}</h4>
            </div>
            
            <script>
              $(".alert").alert();
            </script>
            
            <div class="row no-gutters height-self-center">
                <div class="col-sm-12 align-self-center page-content rounded">
                    <div class="row m-0">
                        <div class="col-sm-12 sign-in-page-data">
                            <div class="sign-in-from bg-primary rounded">
                                <h3 class="mb-0 text-center text-white">Sign in</h3>
                                <p class="text-center text-white">Enter your email address and password to access admin
                                    panel.</p>
                                <form class="mt-4 form-text" name='loginForm' action="<c:url value='loginProcess' />" method='POST'>
                                    <div class="form-group">
                                        <label for="exampleInputEmail1">User Name</label>
                                        <input type="text" name="username" class="form-control mb-0" id="username"
                                            placeholder="Enter username">
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputPassword1">Password</label>
                                        <input type="password" class="form-control mb-0" id="password" name="password"
                                            placeholder="Password">
                                    </div>
                                    <div class="d-inline-block w-100">
                                        <div class="custom-control custom-checkbox d-inline-block mt-2 pt-1">
                                            <input type="checkbox" class="custom-control-input" id="customCheck1">
                                            <label class="custom-control-label" for="customCheck1">Remember Me</label>
                                        </div>
                                    </div>
                                    <div class="sign-info text-center">
                                        <button type="submit" class="btn btn-white d-block w-100 mb-2">Sign in</button>
                                        <span class="text-dark dark-color d-inline-block line-height-2">Don't have an
                                            account? <a href="sign-up.html" class="text-white">Sign up</a></span>
                                    </div>
                                    <input type="hidden" name="${_csrf.parameterName}"	value="${_csrf.token}" />
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section> -->
    <!-- Sign in END -->
    <!-- color-customizer -->
    <!-- <div class="iq-colorbox color-fix">
        <div class="buy-button"> <a class="color-full" href="#"><i class="fa fa-spinner fa-spin"></i></a> </div>
        <div class="clearfix color-picker">
            <h3 class="iq-font-black">Booksto Awesome Color</h3>
            <p>This color combo available inside whole template. You can change on your wish, Even you can create your
                own with limitless possibilities! </p>
            <ul class="iq-colorselect clearfix">
                <li class="color-1 iq-colormark" data-style="color-1"></li>
                <li class="color-2" data-style="iq-color-2"></li>
                <li class="color-3" data-style="iq-color-3"></li>
                <li class="color-4" data-style="iq-color-4"></li>
                <li class="color-5" data-style="iq-color-5"></li>
                <li class="color-6" data-style="iq-color-6"></li>
                <li class="color-7" data-style="iq-color-7"></li>
                <li class="color-8" data-style="iq-color-8"></li>
                <li class="color-9" data-style="iq-color-9"></li>
                <li class="color-10" data-style="iq-color-10"></li>
                <li class="color-11" data-style="iq-color-11"></li>
                <li class="color-12" data-style="iq-color-12"></li>
                <li class="color-13" data-style="iq-color-13"></li>
                <li class="color-14" data-style="iq-color-14"></li>
                <li class="color-15" data-style="iq-color-15"></li>
                <li class="color-16" data-style="iq-color-16"></li>
                <li class="color-17" data-style="iq-color-17"></li>
                <li class="color-18" data-style="iq-color-18"></li>
                <li class="color-19" data-style="iq-color-19"></li>
                <li class="color-20" data-style="iq-color-20"></li>
            </ul>
            <a target="_blank" class="btn btn-primary d-block mt-3" href="">Purchase Now</a>
        </div>
    </div> -->
    <!-- color-customizer END -->
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
     <script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/popper.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.appear.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/countdown.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/waypoints.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.counterup.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/wow.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/apexcharts.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/lottie.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/slick.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/select2.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/owl.carousel.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.magnific-popup.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/smooth-scrollbar.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/style-customizer.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/chart-custom.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/custom.js"></script>





    <div class="app-container app-theme-white body-tabs-shadow">
        <div class="app-container">
            <div class="h-100 bg-plum-plate bg-animation">
                <div class="d-flex h-100 justify-content-center align-items-center">
                    <div class="mx-auto app-login-box col-md-8">
                        <div class="app-logo-inverse mx-auto mb-3"></div>
                        <div class="modal-dialog w-100 mx-auto">
                            <div class="modal-content">
                                <div class="modal-body">
                                    <div class="h5 modal-title text-center">
                                        <h4 class="mt-2">
                                            <div>Welcome back,</div>
                                            <span>Please sign in to your account below.</span>
                                        </h4>
                                    </div>
                                    <form class="">
                                        <div class="form-row">
                                            <div class="col-md-12">
                                                <div class="position-relative form-group">
                                                    <input name="email" id="exampleEmail" placeholder="Email here..."
                                                        type="email" class="form-control">
                                                </div>
                                            </div>
                                            <div class="col-md-12">
                                                <div class="position-relative form-group">
                                                    <input name="password" id="examplePassword"
                                                        placeholder="Password here..." type="password"
                                                        class="form-control">
                                                </div>
                                            </div>
                                        </div>
                                        <div class="position-relative form-check">
                                            <input name="remember" id="exampleCheck" type="checkbox"
                                                class="form-check-input">
                                            <label for="exampleCheck" class="form-check-label">Keep me logged in</label>
                                        </div>
                                    </form>
                                </div>
                                <div class="modal-footer clearfix">
                                    <div class="float-right">
                                        <button class="btn btn-primary btn-lg">Login to Dashboard</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="text-center text-white opacity-8 mt-3">Copyright © CodeLean 2022</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script type="text/javascript" src="./assets/scripts/main.js"></script>
</body>

</html>