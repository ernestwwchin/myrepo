<table id="list">
<thead>
<tr>
	<td width="80px">No Ahli</td>
	<td width="150px">Nama</td>
	<td width="60px">Kp Baru</td>
	<td width="60px">Kp Lama</td>
	<td width="20px" title="Negeri Lama">Neg Lama</td>
	<td width="100px" title="Bahagian Lama">Bah Lama</td>
	<td width="100px" title="Cawangan Lama">Caw Lama</td>
	<td width="20px" title="Negeri Lama">Neg Baru</td>
	<td width="100px" title="Bahagian Lama">Bah Baru</td>
	<td width="100px" title="Cawangan Lama">Caw Baru</td>
	<td>Tarikh</td>
	<td>Kategori</td>
</tr>
</thead>
<tbody>
<% for(int i = 0; i < 4; i++) { %>
<tr class="<%=(i % 2 == 0)?"even":"odd"%>">
	<td><label><input type="checkbox"> 02172928</label></td>
	<td><a href="form.jsp">ERDAWATI BINTI SANKA</a></td>
	<td>570803125152</td>
	<td>H0288013</td>
	<td>S</td>
	<td>LIBARAN</td>
	<td>BATU 12 JALAN LABUK</td>
	<td>S</td>
	<td>SANDAKAN</td>
	<td>Kod tidak wujud</td>
	<td>14/11/2012</td>
	<td>WANITA</td>
</tr>
<% } %>
</tbody>
</table>
