<html>
<head>
<title>Sistem Keahlian UMNO | DIREKTORI UMNO</title>
<jsp:include page="../import.jsp"/>
</head>
<body>

<table id="page-header">
<tr>
	<td class="left"><button class="go-main-menu">&laquo; Main Menu</button></td>
	<td class="title">DIREKTORI UMNO</td>
	<td class="right">&nbsp;</td>
</tr>
</table>

<table id="layout">
<thead id="header">
<tr>
	<td>
	<h3>Carian Direktori</h3>
	<table>
	<tr>
		<td>Kategori Peringkat</td>
		<td>
			<select>
				<option>UMNO Malaysia</option>
			</select>
		</td>
		<td class="col-2">Kategori 4 Peringkat</td>
		<td>
			<select>
				<option>Pemuda</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>Kategori Negeri</td>
		<td>
			<select>
				<option>Wilayah Persekutuan</option>
			</select>
		</td>
		<td class="col-2">Cawangan</td>
		<td>
			<select>
				<option>Jalan Conlay</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>Kategori Bahagian</td>
		<td>
			<select>
				<option>Bukit Bintang</option>
			</select>
		</td>
	</tr>
	<tr>
		<td></td>
		<td style="text-align:right">
			<input type="submit" id="to-search">
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
		<a href="#">CSV</a>
		| <a href="#">Excel</a>
		| <a href="#">XML</a>
		| <a href="#">PDF</a>
		</div>
	</td>
</tr>
</tfoot>
</table>

</body>

<style>
#layout thead td {font-size:12px;}
#to-search {padding:5px 20px;}
#layout tbody td {font-size:13px;}
#layout thead select {width:240px;}
#layout thead table {margin: 10px 0;}

#layout tfoot td {text-align:right; font-size:12px;}

#layout thead td .col-2 {padding-left:20px;}
#layout thead td select {margin-left:10px;}
</style>

<script>

$(document).ready(function() {
	
});
</script>

</html>
