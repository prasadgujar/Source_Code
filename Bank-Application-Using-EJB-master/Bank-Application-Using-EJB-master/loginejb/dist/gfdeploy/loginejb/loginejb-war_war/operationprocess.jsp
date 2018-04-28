<%-- 
    Document   : operationjsp
    Created on : 11 Apr, 2018, 4:57:25 PM
    Author     : prasad
--%>
<%@page import="com.projlogin.BankRemote"%>
<%@ page import="com.projlogin.*" %>  
<%  
BankRemote remote=(BankRemote)session.getAttribute("remote");  
String operation=request.getParameter("operation");  
String amount=request.getParameter("amount");  
  
if(operation!=null){  
      
    if(operation.equals("deposit")){  
        remote.deposit(Integer.parseInt(amount));  
        out.print("Amount successfully deposited!");  
    }else  
        if(operation.equals("withdraw")){  
            boolean status=remote.withdraw(Integer.parseInt(amount));  
            if(status){  
                out.print("Amount successfully withdrawn!");  
            }else{  
                out.println("Enter less amount");  
            }  
        }else{  
            out.println("Current Amount: "+remote.getBalance());  
        }  
}  
%>  
<hr/>  
<jsp:include page="operation.jsp"></jsp:include>  