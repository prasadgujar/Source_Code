/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bankexamp.BankTransactLocal;
import com.projlogin.BankRemote;
import com.projlogin.loginexRemote;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author prasad
 */
public class LoginServlet extends HttpServlet {

    
    
    @EJB
    private loginexRemote loginex;
    String username,password,result;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
                username = request.getParameter("username");
        password = request.getParameter("pass");
        result = loginex.validUser(username, password);
        out.println(result);
        String ok  = "valid";
        //if(result.equals(ok))
        //{
         InitialContext context=new InitialContext();  
            BankRemote b=(BankRemote)context.lookup("stateful123");  
              
            request.getSession().setAttribute("remote",b);  
            request.getRequestDispatcher("/operation.jsp").forward(request, response);
        //}
        }
catch(Exception e){System.out.println(e);}  
       
       }
    
    
       
           
        
              
            
        
        
    }

   
 

