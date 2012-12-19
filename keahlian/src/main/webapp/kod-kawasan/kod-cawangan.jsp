<%@ page import="java.util.List, com.umno.model.Negeri, com.umno.model.KodDun, com.umno.model.KodParlimen, com.umno.model.KodCawangan" %>
<%
KodCawangan kodCawangan = (KodCawangan)request.getAttribute("kodCawangan");
List<KodDun> kodDunList = (List<KodDun>)request.getAttribute("kodDunList");
List<KodParlimen> kodParlimenList = (List<KodParlimen>)request.getAttribute("kodParlimenList");
List<Negeri> negeriList = (List<Negeri>)request.getAttribute("negeriList");
%>
<h3>Penyelenggaraan Kod Cawangan</h3>
<table>
<tbody>
<tr>
	<td class="label">Negeri *</td>
	<td>
		<select style="width:200px" name="negeri">
			<% for(Negeri negeri : negeriList) { %>
			<option value="<%=negeri.getKod()%>"><%=negeri.getNama()%></option>
			<% } %>
		</select>
	</td>
</tr>
<tr>
	<td class="label">Parlimen / Bahagian *</td>
	<td>
		<select style="width:200px" name="negeri">
			<% for(KodParlimen kodParlimen : kodParlimenList) { %>
			<option value="<%=kodParlimen.getKod()%>"><%=kodParlimen.getNama()%></option>
			<% } %>
		</select>
	</td>
</tr>
<tr>
	<td class="label">DUN *</td>
	<td>
		<select style="width:200px" name="negeri">
			<% for(KodDun kodDun : kodDunList) { %>
			<option value="<%=kodDun.getKod()%>"><%=kodDun.getNama()%></option>
			<% } %>
		</select>
	</td>
</tr>
<tr>
	<td class="label">Cawangan *</td>
	<td><input type="text" size="60" name="nama" value="<%=(kodCawangan != null)?kodCawangan.getNama():""%>"></td>
</tr>
<tr>
	<td class="label">Kod Cawangan *</td>
	<td><input type="text" size="30" name="kod" value="<%=(kodCawangan != null)?kodCawangan.getKod():""%>"></td>
</tr>
</tbody>
<tfoot>
<tr>
	<td colspan="10">
		<button>Tambah</button>
		<button>Ubah</button>
		<button>Hapus</button>
	</td>
</tr>
</tfoot>
</table>
