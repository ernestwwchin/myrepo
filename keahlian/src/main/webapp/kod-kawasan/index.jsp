<html>
<head>
<title>Sistem Keahlian UMNO | PENYELANGGARAAN KOD KAWASAN</title>
<jsp:include page="../import.jsp"/>
</head>
<body>

<table id="page-header">
<tr>
	<td class="left"><button class="go-main-menu">&laquo; Main Menu</button></td>
	<td class="title">PENYELANGGARAAN KOD KAWASAN</td>
	<td class="right">&nbsp;</td>
</tr>
</table>


<table id="layout">
<tr>
	<td id="list"></td>
</tr>
<tr>
	<td id="content"></td>
</tr>
</table>

</body>

<style>

#content button {width:100px; height:40px}
#content tfoot td { padding-top: 20px}
#content .label {width:160px; font-size:14px; }
</style>

<script>

$(document).ready(function() {
	$.get("<%=application.getContextPath()%>/kod-kawasan/list.get", function(response) {
		$("#list").html(response);
	});

	$("#kod-parlimen a").live("click", function() {
		$.ajax({
			url: "<%=application.getContextPath()%>/kod-kawasan/kod-parlimen.get", 
			data: {kod: $(this).attr("ref")},
			success: function(response) {
				$("#content").html(response);
			}
		});
		
		return false;
	});
	
	$("#kod-dun a").live("click", function() {
		$.ajax({
			url: "<%=application.getContextPath()%>/kod-kawasan/kod-dun.get", 
			data: {kod: $(this).attr("ref")},
			success: function(response) {
				$("#content").html(response);
			}
		});
		
		return false;
	});
	
	
	$("#kod-cawangan a").live("click", function() {
		$.ajax({
			url: "<%=application.getContextPath()%>/kod-kawasan/kod-cawangan.get", 
			data: {kod: $(this).attr("ref")},
			success: function(response) {
				$("#content").html(response);
			}
		});
		
		return false;
	});
});
</script>

</html>
