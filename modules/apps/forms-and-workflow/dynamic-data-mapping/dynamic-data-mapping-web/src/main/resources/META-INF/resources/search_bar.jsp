<%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ include file="/init.jsp" %>

<%
String tabs1 = ParamUtil.getString(request, "tabs1", "structures");

long groupId = ParamUtil.getLong(request, "groupId", themeDisplay.getSiteGroupId());

String scopedLabel = Validator.isNull(scopeTitle) ? "structures" : scopeTitle;
%>

<portlet:renderURL var="portletURL">
	<portlet:param name="mvcPath" value="/view.jsp" />
	<portlet:param name="tabs1" value="<%= tabs1 %>" />
	<portlet:param name="groupId" value="<%= String.valueOf(groupId) %>" />
</portlet:renderURL>

<aui:nav-bar cssClass="collapse-basic-search" markupView="lexicon">
	<aui:nav cssClass="navbar-nav">
		<aui:nav-item label="<%= scopedLabel %>" selected="<%= true %>" />
	</aui:nav>

	<aui:nav-bar-search>
		<aui:form action="<%= portletURL.toString() %>" method="post" name="searchForm">
			<liferay-util:include page="/structure_search.jsp" servletContext="<%= application %>" />
		</aui:form>
	</aui:nav-bar-search>
</aui:nav-bar>