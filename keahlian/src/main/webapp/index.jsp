<html>
<head>
<title>Sistem Keahlian UMNO | MAIN MENU</title>
<jsp:include page="import.jsp"/>
</head>
<body>


<table id="main-menu">
<tr id="page-header">
	<td colspan="3" style="font-weight:bold; text-align:center; font-size:28px; padding-bottom: 20px">MAIN MENU</td>
</tr>
<tr>
	<td><button ref="pendaftaran"><img src="img/computer.png"> PROSES PENDAFTARAN AHLI UMNO</button></td>
	<td><button ref="tukar-cawangan"><img src="img/computer.png"> PROSES TUKAR CAWANGAN</button></td>
	<td></td>
</tr>
<tr>
	<td><button ref="kod-kawasan"><img src="img/computer.png"> PENYELENGGARAAN KOD KAWASAN</button></td>
	<td><button ref="perlantikan"><img src="img/computer.png"> PERLANTIKAN / PENJAWATAN</button></td>
	<td><button ref="direktori"><img src="img/computer.png"> DIREKTORI UMNO</button></td>
</tr>
<tr>
	<td><button ref="penghantaran"><img src="img/computer.png"> PENGHANTARAN BORANG</button></td>
	<td><button ref="permohonan"><img src="img/computer.png"> PERMOHONAN BORANG</button></td>
	<td><button ref="laporan"><img src="img/computer.png"> LAPORAN</button></td>
</tr>
</table>

</body>

<style>
#main-menu {margin-left:auto; margin-right:auto; margin-top:80px;}
#main-menu img {}
#main-menu button {width:260px; height: 80px; margin:5px 10px; }
</style>

<script>

$(document).ready(function() {
	$("#main-menu button").click(function() {
		window.location = $(this).attr("ref");
	});
});
</script>

</html>
