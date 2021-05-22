import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Discount", value = "/Discount")
public class Discount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //sai getparameter vs thieu the html trong printwriter
       //codesai
//         PrintWriter writer = response.getWriter();
//         String namesp = request.getParameter("tensp");
//         double price;
//                 price = Double.parseDouble(request.getParameter("prince"));

//         double saleoff;
//                 saleoff = Double.parseDouble(request.getParameter("saleoff"));
// //        if (namesp != null) {
//             double discountAmount = price * saleoff * 0.01;
//             double discountPrice = price - discountAmount;
//             writer.println("Tên SP: " + namesp);
//             writer.println("DiscountAmount: " + discountAmount);
//             writer.println("DiscountPrice: " + discountPrice);
//        }
        //code dung 
         String namesp = request.getParameter("tensp");
        double price = Double.parseDouble(request.getParameter("price"));
        double saleoff = Double.parseDouble(request.getParameter("saleoff"));

        double discountamout = price * saleoff * 0.01;
        double discountPrice = price - discountamout;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Tensp: " + namesp+ "</h1>");
        writer.println("<h1>DiscountAmount: " + discountamout+ "</h1>");
        writer.println("<h1>DiscountPrice: " + discountPrice+ "</h1>");
        writer.println("</html>");
        // a tham khao nhe
    }
}
