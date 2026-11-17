<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<html>

<head>

<title>FORMULÁRIO DE PATRIMÔNIO</title>

</head>
<body>
<h2>Cadastro / Edição de Patrimônio</h2>

<form action="/patrimonios/salvar" method="post">

    <label>Nr Patrimônio</label>
    <input type="text" id="nrPatrimonio" name="nrPatrimonio" value="${patrimonio.nrPatrimonio}" required>

    <label>Descrição</label>
    <input type="text" id="descricao" name="descricao" value="${patrimonio.descricao}" required>

    <label>Local</label>
    <input type="text" id="local" name="local" value="${patrimonio.local}" required>

    <button type="submit">Salvar</button>
    <a href="/patrimonios">Cancelar</a>


</form>

</body>
</html>
