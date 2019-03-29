import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*;
 
@WebServlet(urlPatterns = {"/PageHitCounter"})
public class PageHitCounter extends HttpServlet  {
    private int hitCount;                    
    public void init()    {
                 hitCount = 0;
                    }         
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException      {        
    response.setContentType("text/html");
    hitCount++;        
    PrintWriter out = response.getWriter();
    String title = "Total Number of Hits"; 
           out.println("<html>\n"+"<head><title>"+title+ "</title></head>\n"+"<body >\n"+"<h1>"+title+"</h1>\n"+"<h2>" + hitCount + "</h2>\n"+"</body></html>");     
       } 
 
   } 
