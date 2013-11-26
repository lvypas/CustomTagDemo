<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/customTag.tld" prefix="ct" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>
            Upper Case : 
              <ct:changeCase case="upper">
            Hello World
              </ct:changeCase>
</h2>
<h2>
            Lower Case : 
            <ct:changeCase case="lower">
                Hello World
            </ct:changeCase>
</h2>
        
        <ct:loopText times="5">
                <h3>Loop Text!</h3>
            </ct:loopText>
            
           <ct:today format="MMMM dd, yyyy"/>
        
</body>
</html>