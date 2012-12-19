<%@ page import="java.util.List, com.umno.model.KodDun, com.umno.model.KodParlimen, com.umno.model.KodCawangan" %>
<%
List<KodParlimen> kodParlimenList = (List<KodParlimen>)request.getAttribute("kodParlimenList");
List<KodDun> kodDunList = (List<KodDun>)request.getAttribute("kodDunList");
List<KodCawangan> kodCawanganList = (List<KodCawangan>)request.getAttribute("kodCawanganList");
%>
<table>
<tr>
	<td>Parlimen</td>
	<td>DUN</td>
	<td>Cawangan</td>
</tr>
<tr>
	<td>
		<ul id="kod-parlimen">
		<% for(KodParlimen kodParlimen : kodParlimenList) { %>
		<li><a href="#" ref="<%=kodParlimen.getKod()%>"><%=kodParlimen.getNama()%></a></li>
		<% } %>
		</ul>
	</td>
	<td>
		<ul id="kod-dun">
		<% for(KodDun kodDun : kodDunList) { %>
		<li><a href="#" ref="<%=kodDun.getKod()%>"><%=kodDun.getNama()%></a></li>
		<% } %>
		</ul>
	</td>
	<td>
		<ul id="kod-cawangan">
		<% for(KodCawangan kodCawangan : kodCawanganList) { %>
		<li><a href="#" ref="<%=kodCawangan.getKod()%>"><%=kodCawangan.getNama()%></a></li>
		<% } %>
		</ul>
	</td>
</tr>
</table>
