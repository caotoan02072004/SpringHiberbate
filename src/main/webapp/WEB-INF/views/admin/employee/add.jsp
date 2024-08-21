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
						Employee
						<div class="page-title-subheading">View, create, update,
							delete and manage.</div>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-md-12">
				<div class="main-card mb-3 card px-5">
					<div class="card-body">
						<form method="post"
							action="${pageContext.request.contextPath}/admin/employee/insert" enctype="multipart/form-data">
							<div class="form-group">
								<label for="image"
									class="col-md-3 col-form-label">Avatar</label>
								<div class="col-md-9 col-xl-8">
									<img style="height: 200px;width: 200px; cursor: pointer;"
										class="thumbnail rounded-circle" data-toggle="tooltip"
										title="Click to change the image" data-placement="bottom"
										src="${pageContext.request.contextPath}/resources/images/add-image-icon.jpg" alt="Avatar">
									<input name="file" type="file" onchange="changeImg(this)"
										class="image form-control-file" style="display: none;" value="">
									<small class="form-text text-muted">
										Click on the image to change (required)
									</small>
								</div>
							</div>
							
							
							<div class="form-group">
							  <label for="name">Name</label>
							  <input type="text" name="name" id="name" class="form-control" placeholder="Enter your ..">
							</div>

							<div class="form-group">
								<label for=birthday>Birth Day</label>
								<input type="date" name="birthday" id="birthday" class="form-control" placeholder="Nhập tên nhân viên...">
							</div>

							<div class="form-group">
								<label for="address">Address</label>
								<input type="text" name="address" id="address" class="form-control" placeholder="Nhập địa chỉ nhân viên...">
							</div>
							  
							<div class="form-group">
								<label for="phone">Phone</label>
								<input type="text" name="phone" id="phone" class="form-control" placeholder="Nhập số điện thoại nhân viên...">
							</div>

							<div class="form-group">
								<label for="rank">Rank</label>
								<input type="text" name="rank" id="rank" class="form-control" placeholder="Nhập bậc nhân viên">
							</div>

							<div class="form-group">
								<label for="salary">Salary</label>
								<input type="text" name="salary" id="salary" class="form-control" placeholder="Nhập lương nhân viên">
							</div>

							<div class="form-group">
								<label for="status" class="col-md-3 col-form-label">Status</label></br>
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

							<div class="form-group">
							  	<label for="department_id">Department</label>
							  	<select class="form-control" name="department_id" id="department_id">
									<option>-----Chọn-----</option>
									<c:forEach var="d" items="${departments}">
										<option value="${d.id }">${d.name }</option>
									</c:forEach>
								</select>
							</div>
							
							<div class="form-group">
							  	<label for="level_id">Level</label>
							  	<select class="form-control" name="level_id" id="level_id">
									<option>-----Chọn-----</option>
									<c:forEach var="l" items="${levels}">
										<option value="${l.id }">${l.name }</option>
									</c:forEach>
								</select>
							</div>

							<div class="form-group">
							  	<label for="certificate_id">Certificate</label>
							  	<select class="form-control" name="certificate_id" id="certificate_id">
									<option>-----Chọn-----</option>
									<c:forEach var="c" items="${certificates}">
										<option value="${c.id }">${c.name }</option>
									</c:forEach>
								</select>
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