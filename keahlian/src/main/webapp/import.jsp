<link rel="stylesheet" href="http://www.jqwidgets.com/jquery-widgets-documentation/jqwidgets/styles/jqx.base.css" type="text/css"/>
<script type="text/javascript" src="http://www.jqwidgets.com/jquery-widgets-documentation/scripts/jquery-1.6.2.min.js"></script>
<script type="text/javascript" src="http://www.jqwidgets.com/jquery-widgets-documentation/jqwidgets/jqxcore.js"></script>
<script type="text/javascript" src="http://www.jqwidgets.com/jquery-widgets-documentation/jqwidgets/jqxdatetimeinput.js"></script>
<script type="text/javascript" src="http://www.jqwidgets.com/jquery-widgets-documentation/jqwidgets/jqxcalendar.js"></script>
<script type="text/javascript" src="http://www.jqwidgets.com/jquery-widgets-documentation/jqwidgets/jqxtooltip.js"></script>
<script type="text/javascript" src="http://www.jqwidgets.com/jquery-widgets-documentation/jqwidgets/globalization/jquery.global.js"></script>
<script type="text/javascript" src="http://www.jqwidgets.com/jquery-widgets-documentation/jqwidgets/jqxtabs.js"></script>
<script type="text/javascript" src="http://caroufredsel.dev7studios.com/js/jquery/jquery.carouFredSel-6.0.5-packed.js"></script>
<script type="text/javascript" src="https://raw.github.com/phstc/jquery-dateFormat/master/jquery.dateFormat-1.0.js"></script>
<style>
body{ color: #000000; background-color: #FFFFFF; font-family: Arial, "Times New Roman", Times, serif; margin: 0px; min-width: 1024px !important;}
table {border-collapse:collapse; }
input {margin:0}

#layout {margin: 30px}
#layout td {vertical-align:top; }
.section {width:99% !important;}
.section td {vertical-align:middle; }

#page-header {}
#page-header .left {width:400px !important;}
#page-header .right {}
#page-header .title {font-size:22px; font-weight:bold; text-align:center; margin-top:10px;}
#page-header .go-main-menu, #page-header .go-back {padding: 5px;}

.section {border: 1px solid gray; margin:5px; width:550px !important;}
.section td {padding: 2px 5px; font-size:12px;}
.section .code {font-weight:bold; padding:1px 8px; border: 1px solid black; width:26px !important; text-align:center;}
.section .title {background:black; color:white; padding:1px 5px; }
.section input {margin:0 10px 0 8px;}
.section input.small {margin:0 0 0 8px;}

#list {border: 1px solid gray;}
#list thead td {border:1px solid gray; padding: 8px;}
#list tbody td {border-bottom:1px solid gray; padding: 10px;}

.line-bottom td {border-bottom: 1px solid lightgray; padding-bottom: 5px !important;}
</style>
<script>
$(document).ready(function() {
	$(".go-main-menu").live("click", function() {
		window.location = "<%=application.getContextPath()%>";
	});
});
</script>