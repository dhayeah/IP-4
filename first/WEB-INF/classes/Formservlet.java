import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class Formservlet extends HttpServlet {
 
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      String title = "Form details";
      String lang[]=request.getParameterValues("language");
       String sal=request.getParameter("s1");
       out.println("Salutation"+ sal+"\n");
         
      out.println(
         "<html>\n" +
            "<body>" +
               "<table>"+
                  "<tr>"+
                   "<td>"+"Name"+"</td>"+
                   "<td>"+request.getParameter("formname")+"</td>"+
                  "</tr>"+
                   "<tr>"+
                   "<td>"+"Phone number"+"</td>"+
                   "<td>"+request.getParameter("fphno")+"</td>"+
                  "</tr>"+
                   "<tr>"+
                   "<td>"+"Username"+"</td>"+
                   "<td>"+request.getParameter("funame")+"</td>"+
                  "</tr>"+
                   "<tr>"+
                   "<td>"+"Password"+"</td>"+
                   "<td>"+request.getParameter("fpass")+"</td>"+
                  "</tr>"+
                   "<tr>"+
                   "<td>"+"Email"+"</td>"+
                   "<td>"+request.getParameter("femail")+"</td>"+
                  "</tr>"+
                   "<tr>"+
                   "<td>"+"Date"+"</td>"+
                   "<td>"+request.getParameter("fdate")+"</td>"+
                  "</tr>"+
                   "<tr>"+
                   "<td>"+"Image"+"</td>"+
                   "<td>"+request.getParameter("fimage")+"</td>"+
                  "</tr>"+
                 "</table>"+
            "</body>"+
         "</html>"
      );

      out.println("Language\n");
      for(int i=0;i<lang.length;i++)
      {
          out.println(lang[i]+" ");
      }
   }
}
