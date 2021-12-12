<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ page import="java.util.Vector" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <c:set var="cxt" value="${pageContext.request.contextPath}" />

    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<h1>Liste des projet</h1>
<h2>Département : ${departement.nom}  </h2>
<table>
    <th>
    <td>Id</td>
    <td>Nom</td>
    <td>Fonction</td>
    <td></td>

    </th>

    <c:forEach items="${list}" var="projet">
        <tr>
            <td> ${projet.id}</td>
            <td> ${projet.titre}</td>
            <td> ${projet.fonction}</td>
            <td> ><a href="">liste des employes</a></td>

        </tr>
    </c:forEach>
</table>
<a href='${cxt}/ajoutEmploye'>Ajouter un employe</a>


</body>
</html>