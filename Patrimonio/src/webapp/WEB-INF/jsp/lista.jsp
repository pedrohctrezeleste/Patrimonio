<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<html>
<head>
<title>LISTA DE PATRIMONIO</title>
</head>
<body>

<h2> CONTROLE DE PATRIMONIO</h2>

<a href="/patrimonio/novo">Cadastro novo </a>

<table>
<thead>
    <th>ID</th>
    <th>Nr PATRIMONIO</th>
    <th>DESCRIÇÃO</th>
    <th>LOCAL</th>
    <th>AÇÕES</th>
</thead>

<tbody>
<c:forEach var="item" items="${listaPatrimonios}">

<tr>

    <td>${item.id}</td>
    <td>${item.nrPatrimonio}</td>
    <td>${item.descricao}</td>
    <td>${item.local}</td>

<td>
    <a href="/patrimonios/editar/${item.id}">Editar</a>
    <a href="/patrimonios/excluir/${item.id}" onclick="return confirm('Deseja excluir esse patrimônio ?')" >Excluir</a>
</td>

</tr>

</c:forEach>

</tbody>

</table>

<body>
</html>



