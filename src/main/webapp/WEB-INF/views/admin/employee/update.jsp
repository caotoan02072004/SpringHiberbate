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
				<div class="main-card mb-3 card">
					<div class="card-body">
						<form method="post"
							action="${pageContext.request.contextPath}/admin/employee/update"
							, enctype="multipart/form-data">
							<input type="hidden" name="id" value=${employee.id } />

							<div>
								<label for="image" class="col-form-label">Avatar</label>
								<div class="col-md-10 col-xl-9">
									<img style="height: 200px; width: 200px; cursor: pointer;"
										class="thumbnail rounded-circle" data-toggle="tooltip"
										title="Click to change the image" data-placement="bottom"
										src="${pageContext.request.contextPath}/resources/${employee.image}"
										alt="Avatar"> <input name="file" type="file"
										onchange="changeImg(this)" class="image form-control-file"
										style="display: none;" value=""> <small
										class="form-text text-muted"> Click on the image to
										change (required) </small>
								</div>
							</div>

							<div class="form-group">
								<label for="address">Name</label> <input type="text" name="name"
									id="name" class="form-control"
									placeholder="Nhập tên nhân viên..." value="${employee.name}">
							</div>

							<div class="form-group">
								<label for=birthdayy>BirthDay</label> 
								<input value="<fmt:formatDate value="${employee.birthday}" pattern="yyyy-MM-dd" />" 
										name="birthday" type="date"
										class="form-control" />
							</div>

							<div class="form-group">
								<label for="address">Address</label> <input type="text"
									name="address" id="address" class="form-control"
									placeholder="Nhập địa chỉ nhân viên..."
									value="${employee.address}">
							</div>

							<div class="form-group">
								<label for="phone">Phone</label> <input type="text" name="phone"
									id="phone" class="form-control"
									placeholder="Nhập số điện thoại nhân viên..."
									value="${employee.phone}">
							</div>

							<div class="form-group">
								<label for="rank">Rank</label> <input type="text" name="rank"
									id="rank" class="form-control" placeholder="Nhập bậc nhân viên"
									value="${employee.rank}">
							</div>

							<div class="form-group">
								<label for="salary">Salary</label> <input type="number"
									name="salary" id="salary" class="form-control"
									placeholder="Nhập lương nhân viên" value="${employee.salary}">
							</div>


							<div class="row form-group">
								<label for="status" class="ml-4 col-form-label">Status</label></br>
								<div class="form-group" style="margin: 8px 15px;">
									<div class="form-check form-check-inline">
										<label class="form-check-label"> <input
											class="form-check-input" type="radio" name="status" value="1"
											${employee.status == 1 ? "checked" : "" }> Show
										</label>
									</div>
									<div class="form-check form-check-inline">
										<label class="form-check-label"> <input
											class="form-check-input" type="radio" name="status" value="0"
											${employee.status == 0 ? "checked" : ""}>Hide
										</label>
									</div>
								</div>
							</div>

							<div class="form-group">
								<label for="department_id">Department</label> <select
									class="form-control" name="department_id" id="department_id">
									<option value="${employee.department.id}">${employee.department.name }</option>
								</select>
							</div>

							<div class="form-group">
								<label for="level_id">Level</label> <select class="form-control"
									name="level_id" id="level_id">
									<option value="${employee.level.id }">${employee.level.name}</option>
								</select>
							</div>

							<div class="form-group">
								<label for="certificate_id">Certificate</label> <select
									class="form-control" name="certificate_id" id="certificate_id">
									<option value="${employee.certificate.id}">${employee.certificate.name }</option>
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