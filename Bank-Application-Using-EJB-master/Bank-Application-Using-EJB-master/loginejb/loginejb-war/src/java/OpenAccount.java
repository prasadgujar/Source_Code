import com.projlogin.BankRemote;
import com.projlogin.loginexRemote;
import java.io.IOException;  
import static java.lang.System.out;
import javax.ejb.EJB;  
import javax.naming.InitialContext;  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/OpenAccount")  
public class OpenAccount extends HttpServlet {  
    //@EJB(mappedName="stateful123")  
    //BankRemote b;  
      @EJB
    private loginexRemote loginex;
    String username,password,result;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                throws ServletException, IOException {  
        try{
            
            username = request.getParameter("username");
        password = request.getParameter("pass");
        result = loginex.validUser(username, password);
        out.println(result);
        
       
            InitialContext context=new InitialContext();  
            BankRemote b=(BankRemote)context.lookup("stateful123");  
              
            request.getSession().setAttribute("remote",b);  
            request.getRequestDispatcher("/operation.jsp").forward(request, response);  
        
              
            
        
        }
        catch(Exception e){System.out.println(e);}  
        }
        }
    
