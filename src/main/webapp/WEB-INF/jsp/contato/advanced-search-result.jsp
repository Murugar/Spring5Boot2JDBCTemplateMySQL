<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="page-header">
	<h3>
		Contact Page
	</h3>
</div>
<div class="table-responsive">
	<table class="table table-striped table-bordered table-hover">
		<c:choose>
			<c:when test="${not empty contatos}">
				<thead>
					<tr>
						<!-- <th>#</th> -->
						<th>Name</th>
						<th>E-mail</th>
						<th>Telephone/th>
						<th>Address</th>
						<th colspan="1">Operations</th>
					</tr>
				</thead>
			</c:when>
			<c:when test="${empty contatos }">

				<h4>No Contacts</h4>
			</c:when>
		</c:choose>
		<c:forEach var="contato" items="${contatos}">
			<tr>
				<td>${contato.nome}</td>
				<td>${contato.email}</td>
				<td>${contato.telefone}</td>
				<td>${contato.endereco}</td>
				<td><a class="btn btn-default btn-sm"
					href="/get/${contato.id }" data-toggle2="tooltip"
					data-placement="bottom" title="exibir"><i
						class="fa fa-info-circle" aria-hidden="true"></i></a></td>
			</tr>
		</c:forEach>
	</table>
</div>
<div id="buttons">
	<a id="button" class="btn btn-default" href="javascript:history.back()">Come Back&ensp;<span
		class="fa fa-undo"></span></a><a id="button" class="btn btn-default"
		href="${pageContext.request.contextPath }/new">New&ensp;<span
		class="fa fa-plus"></span></a><a id="button" class="btn btn-default"
		href="${pageContext.request.contextPath }/advanced-search">Advanced Search
		&ensp;<span class="fa fa-search"></span>
	</a>
</div>
