<html>
<head>
<title>Sistem Keahlian UMNO | PROSES TUKAR CAWANGAN</title>
<jsp:include page="../import.jsp"/>
</head>
<body>

<table id="page-header">
<tr>
	<td class="left"><button class="go-main-menu">&laquo; Main Menu</button></td>
	<td class="title">PROSES TUKAR CAWANGAN</td>
	<td class="right">&nbsp;</td>
</tr>
</table>

<table id="layout">
<thead id="header">
<tr>
	<td>
	<table>
	<tr>
		<td>No Rujukan 
			<input type="text" size="8" value="23377">
			<button><img src="../img/search.png"></button>
		</td>
		<td>
			<div>Bil Tukar Cawangan yang dipohon: 26</div>
			<div>Bil Tukar Cawangan yang telah diproses: 0</div>
			<div>Bil Tukar Cawangan yang dibenarkan: 22</div>
		</td>
		<td>
			<div>31/10/2012</div>
		</td>
	</tr>
	<tr>
		<td>
			No Ahli / No Kp Baru / No Kp Lama
			<div><input type="text" size="30" value=""></div>
		</td>
		<td colspan="2">
			<input type="text" size="50">
			<input type="text" size="10" value="SANDAKAN">
			<input type="text" size="20">
			<input type="text" size="10" value="SABAH">
		</td>
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
		<button><img src="../img/computer.png"> Tukar</button>
		Bilangan Data Untuk Di Proses... 4
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
