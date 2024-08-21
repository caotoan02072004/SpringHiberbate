<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" />
</head>
<body>
	<!-- Main -->
	<div class="app-main__inner">
		<div class="app-page-title">
			<div class="page-title-wrapper">
				<div class="page-title-heading">
					<div>
						Level
						<div class="page-title-subheading">View, create, update,
							delete and manage.</div>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-md-12">
				<div class="main-card mb-3 card">
					<div class="card-body">
						<form method="post"
							action="${pageContext.request.contextPath}/admin/level/insert">
							<div class="position-relative row form-group">
								<label for="name" class="col-md-3 text-md-right col-form-label">Name</label>
								<div class="col-md-9 col-xl-8">
									<input name="name" placeholder="name" type="text"
										class="form-control">
								</div>
							</div>
							
							<div class="position-relative row form-group">
								<label for="status" class="col-md-3 text-md-right col-form-label">Status</label></br>
								<div class="form-group" style="margin: 8px 15px;">
									<div class="form-check form-check-inline">
										<label class="form-check-label"> <input
											class="form-check-input" type="radio" checked name="status"
											value="1"> Hiển Thị
										</label>
									</div>
									<div class="form-check form-check-inline">
										<label class="form-check-label"> <input
											class="form-check-input" type="radio" name="status" value="0">
											Ẩn
										</label>
									</div>
								</div>
							</div>
							
							<div class="position-relative row form-group mb-1">
								<div class="col-md-9 col-xl-8 offset-md-2">
									<a href="#" class="border-0 btn btn-outline-danger mr-1"> <span
										class="btn-icon-wrapper pr-1 opacity-8"> <i
											class="fa fa-times fa-w-20"></i>
									</span> <span>Cancel</span>
									</a>

									<button type="submit"
										class="btn-shadow btn-hover-shine btn btn-primary">
										<span class="btn-icon-wrapper pr-2 opacity-8"> <i
											class="fa fa-download fa-w-20"></i>
										</span> <span>Save</span>
									</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End Main -->
</body>
</html>