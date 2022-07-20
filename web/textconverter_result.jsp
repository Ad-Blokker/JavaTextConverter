<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta charset="utf-8">
		<title>Text converter</title>
                
	</head>
	
	<body>
		<h1>Text Converter</h1>
		<p>Fill in your text here:</p>
		<form action="https://vps.ad-blokker.nl:8443/caseConv/Conv" method="post">
			<textarea rows="10" cols="50" maxlength="500" name="input" required=""><% String input = (String)request.getAttribute("input"); out.print(input);%></textarea><br>
			<% String convtype = (String)request.getAttribute("convtype");%>
                        <label><input type="radio" name="format" value="caps" <% if (convtype.equals("caps")) { out.print("checked"); } %> > ALL CAPS</label><br>
						<label><input type="radio" name="format" value="lower case" <% if (convtype.equals("lowcase")) { out.print("checked"); } %> > lower case</label><br>
			<label><input type="radio" name="format" value="altcase" <% if (convtype.equals("altcase")) { out.print("checked"); } %>> Alternating Case</label><br>
			<label><input type="radio" name="format" value="invaltcase" <% if (convtype.equals("invaltcase")) { out.print("checked"); } %>> Inverted Alternating Case</label><br>
			<label><input type="radio" name="format" value="randomcase" <% if (convtype.equals("randomcase")) { out.print("checked"); } %>> Random Case</label><br>
			<label><input type="radio" name="format" value="leet" <% if (convtype.equals("leet")) { out.print("checked"); } %>> Leetspeak</label><br>
			<br>
			<input type="submit" value="Submit!" style="font-size:20px;width:110px;height:30px;">
                        <br><br>
		</form>
                
                <h2>Result:</h2>
			<div class="resultdiv">
				<% String result = (String)request.getAttribute("result"); out.print(result);%><br>
                        </div>
                                
	</body>
</html>
