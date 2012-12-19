<table id="list">
<thead>
<tr>
	<td width="80px">No Ahli</td>
	<td width="150px">Nama</td>
	<td width="60px">Kp Baru</td>
	<td width="60px">Kp Lama</td>
	<td width="20px" title="Negeri">Neg</td>
	<td width="60px" title="Bahagian">Bah</td>
	<td width="120px">Cawangan</td>
	<td width="20px">Tarikh</td>
	<td width="60px">Status</td>
	<td>Umur</td>
	<td>Kategori</td>
	<td>Keputusan</td>
	<td>Nota</td>
</tr>
</thead>
<tbody>
<% for(int i = 0; i < 10; i++) { %>
<tr class="<%=(i % 2 == 0)?"even":"odd"%>">
	<td><label><input type="checkbox"> 05023638</label></td>
	<td><a href="form.jsp">RASMI BINTI MANSURT</a></td>
	<td>841226172</td>
	<td></td>
	<td>S</td>
	<td>SANDAKAN</td>
	<td>KAMPONG MUHIBBAH</td>
	<td>14/11/2012</td>
	<td>DALAM PROSES</td>
	<td>28</td>
	<td>PUTERI</td>
	<td></td>
	<td>BORANG</td>
</tr>
<% } %>
</tbody>
</table>
