<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file = "/WEB-INF/views/admin/layout/header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<div id="main-content-wp" class="add-cat-page">
    <div class="wrap clearfix">
        <%@include file = "/WEB-INF/views/admin/layout/sidebar.jsp" %>
        <div id="content" class="fl-right">
            <div class="section" id="title-page">
                <div class="clearfix">
                    <h3 id="index" class="fl-left">Thêm mới danh mục sản phẩm</h3>
                </div>
            </div>
            <div class="section" id="detail-page">
                <div class="section-detail">
                    <form:form action="" method="POST" modelAttribute="categoryProduct">
                        <label for="title">Tên danh mục</label>
                        <form:input type="text" name="title" id="title" path ="name"/>
                        <label for="slug">Slug ( Friendly_url )</label>
                        <form:input type="text" name="slug" id="slug" path ="slug" />
                        <label for="cat_id">Cat_id</label>
                        <form:input type="text" name="cat_id" id="cat_id" path="cat_id" />
                        <button type="submit" name="btn-submit" id="btn-submit">Cập nhật</button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file = "/WEB-INF/views/admin/layout/footer.jsp" %>