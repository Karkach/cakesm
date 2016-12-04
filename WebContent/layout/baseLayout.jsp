<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link type="text/css" rel="stylesheet" href="<%= request.getContextPath()%>/css/style.css"/>
	<link rel="shortcut icon" href="<%= request.getContextPath()%>/images//moroccan_caks.png" type="image/x-icon"/>
	<link rel="icon" href="<%= request.getContextPath()%>/images/moroccan_caks.png" type="image/x-icon"/>
	<title><tiles:insertAttribute name="title"/></title>
</head>
<body>
<div id = "page">
	<header>
		<tiles:insertAttribute name="header"/>
	</header>
	<div class="clear"></div>
	<section id = "body">
		<tiles:insertAttribute name="body" />
	</section>
	<div class="clear"></div>
	<footer>
		<tiles:insertAttribute name="footer"/>
		<sx:datetimepicker></sx:datetimepicker>
	</footer>
</div>
</body>
</html>