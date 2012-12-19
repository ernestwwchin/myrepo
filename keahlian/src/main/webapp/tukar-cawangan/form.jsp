<html>
<head>
<title>Sistem Keahlian UMNO | PERMOHONAN TUKAR CAWANGAN</title>
<jsp:include page="../import.jsp"/>
</head>
<body>

<table id="page-header">
<tr>
	<td class="left"><button class="go-back">&laquo; Back</button></td>
	<td class="title">PERMOHONAN TUKAR CAWANGAN</td>
	<td class="right">&nbsp;</td>
</tr>
</table>

<table id="layout">
<tr>
	<td>
		<div><jsp:include page="section-a.jsp"/></div>
		<div><jsp:include page="section-b.jsp"/></div>
	</td>
	<td>
		<div><jsp:include page="section-c.jsp"/></div>
		<div><jsp:include page="section-e.jsp"/></div>
	</td>
</tr>
<tr>
	<td colspan="2"><jsp:include page="section-d.jsp"/></td>
</tr>
<tr>
	<td colspan="2">
	<table class="section" style="width:99% !important; border:none">
	<tr>
	<td><i>*PASTIKAN PEMOHONAN MENGEPILKAN SALINAN KAD PENGENALAN*</i></td>
	<td>
		Tarikh Proses <input type="text" size="8" value="14/11/2012">
		No Rujukan <input type="text" size="8" value="23377">
	</td>
	</tr>
	</table>
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
