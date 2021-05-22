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
        PrintWriter writer = response.getWriter();
        String namesp = request.getParameter("tensp");
        double price;
                price = Double.parseDouble(request.getParameter("prince"));

        double saleoff;
                saleoff = Double.parseDouble(request.getParameter("saleoff"));
//        if (namesp != null) {
            double discountAmount = price * saleoff * 0.01;
            double discountPrice = price - discountAmount;
            writer.println("Tên SP: " + namesp);
            writer.println("DiscountAmount: " + discountAmount);
            writer.println("DiscountPrice: " + discountPrice);
//        }
    }
}
