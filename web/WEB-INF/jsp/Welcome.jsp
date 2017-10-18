<%-- 
    Document   : welcome
    Created on : Oct 17, 2017, 10:01:04 AM
    Author     : user
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${msg}</h1>
        <h2>${msg1}</h2>
        <h3>${msg2}</h3>
        <p>
          
        <ul>
            <c:forEach items="${tes.produk}" var="p">
                <table>
                    <tr>  
                        <td style="text-align:  center">
                            <img src="<c:url value="/assets/${p.image}" />" width="100" height="100" /><br/>
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align:  center"> <b>${p.name}</b><br/></td>
                    </tr>
                    <tr>
                        <td style="text-align:  center">  Harga : <b>${p.harga}</b><br/></td>
                    </tr>
                    <tr>
                        <td>  <a href="tambahkan"><img src="<c:url value="/assets/buy.jpg" />"  /></a>
                            <a href="detail/${p.productId}"><img src="<c:url value="/assets/button.png" />"  /></a><br/>
                        </td>
                    </tr>
                    
                
                
                
                <br/><br/><br/><br/>
                </table>
            </c:forEach>
        </ul>
       </p>
       
    </body>
</html>
