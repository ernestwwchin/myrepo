<html>
<head>
<title>Sistem Keahlian UMNO | PROSES PENDAFTARAN AHLI UMNO</title>
<jsp:include page="../import.jsp"/>
</head>
<body>

<table id="page-header">
<tr>
	<td class="left"><button class="go-main-menu">&laquo; Main Menu</button></td>
	<td class="title">PROSES PERMOHONAN KEAHLIAN</td>
	<td class="right">&nbsp;</td>
</tr>
</table>

<table id="layout">
<thead id="header">
<tr>
	<td>
	<table>
	<tr>
		<td>Pengguna</td><td><input type="text" size="8" value="MAIZATUL"></td>
		<td>Tarikh Proses <input type="text" size="8" value="14/11/2012"></td>
	</tr>
	<tr>
		<td>No Rujukan</td><td><input type="text" size="8" value=""></td>
		<td>No Kp Ahli Online <input type="text" size="8" value=""></td>
	</tr>
	</table>
	</td>
</tr>
</thead>
<tbody>
<tr>
	<td colspan="2"><jsp:include page="list.jsp"/></td>
</tr>
</tbody>
<tfoot>
<tr>
	<td colspan="10">
		<div>
		<button><img src="../img/computer.png"> Proses</button>
		Bilangan Data Untuk Di Proses... 10
		</div>
	</td>
</tr>
</tfoot>
</table>

</body>

<style>
.first-col {width:70px}
#layout td {font-size:12px; padding: 2px 10px; }
#layout #header input {margin: 0 10px 0 0px;}


</style>

<script>

$(document).ready(function() {
	
});
</script>

</html>
