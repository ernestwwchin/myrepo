<h3>Hasil Carian</h3>
<table id="list">
<thead>
<tr>
	<td width="400px">Nama</td>
	<td width="200px">No Kad Pengenalan</td>
	<td width="160px">No Telefon</td>
	<td width="160px">Jawatan</td>
</tr>
</thead>
<tbody>
<% for(int i = 0; i < 10; i++) { %>
<tr class="<%=(i % 2 == 0)?"even":"odd"%>">
	<td><a href="form.jsp">RASMI BINTI MANSURT</a></td>
	<td>841226172</td>
	<td>01228831234</td>
	<td>Ahli Biasa</td>
</tr>
<% } %>
</tbody>
</table>
