<%@ page import="java.util.List, com.umno.model.Negeri, com.umno.model.KodParlimen" %>
<%
KodParlimen kodParlimen = (KodParlimen)request.getAttribute("kodParlimen");
List<Negeri> negeriList = (List<Negeri>)request.getAttribute("negeriList");
%>
<h3>Penyelenggaraan Kod Parlimen</h3>
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
	<td class="label">Parlimen *</td>
	<td><input type="text" size="50" name="nama" value="<%=(kodParlimen != null)?kodParlimen.getNama():""%>"></td>
</tr>
<tr>
	<td class="label">Kod Parlimen *</td>
	<td><input type="text" size="30" name="kod" value="<%=(kodParlimen != null)?kodParlimen.getKod():""%>"></td>
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
