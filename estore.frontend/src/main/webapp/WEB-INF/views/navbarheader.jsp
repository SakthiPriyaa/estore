 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<c:choose>

 <c:when test="${sessionScope['email'] eq null}">
 <%@include file="loginheader.jsp"%>
 </c:when>
 
 <c:when test="${sessionScope['email'] == 'admin@example.com'}">
 <%@include file="supplierheader.jsp"%>
 </c:when>
 
 <c:when test="${sessionScope['email'] ne null}">
  <%@include file="logoutheader.jsp"%>
 </c:when>

</c:choose>