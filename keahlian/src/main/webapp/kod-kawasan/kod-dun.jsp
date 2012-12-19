<%@ page import="java.util.List, com.umno.model.Negeri, com.umno.model.KodDun, com.umno.model.KodParlimen" %>
<%
KodDun kodDun = (KodDun)request.getAttribute("kodDun");
List<KodParlimen> kodParlimenList = (List<KodParlimen>)request.getAttribute("kodParlimenList");
List<Negeri> negeriList = (List<Negeri>)request.getAttribute("negeriList");
%>

<h3>Penyelenggaraan Kod DUN</h3>
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
	<td>
		<select style="width:200px" name="kodParlimen">
			<% for(KodParlimen kodParlimen : kodParlimenList) { %>
			<option value="<%=kodParlimen.getKod()%>"><%=kodParlimen.getNama()%></option>
			<% } %>
		</select>
	</td>
</tr>
<tr>
	<td class="label">DUN *</td>
	<td><input type="text" size="50" name="nama" value="<%=(kodDun != null)?kodDun.getNama():""%>"></td>
</tr>
<tr>
	<td class="label">Kod DUN *</td>
	<td><input type="text" size="30" name="kod" value="<%=(kodDun != null)?kodDun.getKod():""%>"></td>
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
