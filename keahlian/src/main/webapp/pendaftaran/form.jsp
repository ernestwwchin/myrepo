<html>
<head>
<title>Sistem Keahlian UMNO | PENDAFTARAN AHLI UMNO</title>
<jsp:include page="../import.jsp"/>
</head>
<body>

<table id="page-header">
<tr>
	<td class="left"><button class="go-back">&laquo; Back</button></td>
	<td class="title">PENDAFTARAN AHLI UMNO</td>
	<td class="right">&nbsp;</td>
</tr>
</table>

<table id="layout">
<tr>
	<td>
		<div><jsp:include page="section-a.jsp"/></div>
		<div><jsp:include page="section-b.jsp"/></div>
		<div><jsp:include page="section-e.jsp"/></div>
	</td>
	<td>
		<div><jsp:include page="section-d.jsp"/></div>
		<div><jsp:include page="section-f.jsp"/></div>
		<div><jsp:include page="section-g.jsp"/></div>
		<div><jsp:include page="section-h.jsp"/></div>
		<div><jsp:include page="section-i.jsp"/></div>
	</td>
</tr>
</table>

</body>


<style>

</style>

<script>

$(document).ready(function() {
	$(".go-back").click(function() {
		window.history.go(-1);
	});
	
});
</script>

</html>
