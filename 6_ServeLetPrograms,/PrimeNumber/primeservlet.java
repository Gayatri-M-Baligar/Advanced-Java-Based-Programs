import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/prime")
public class primeservlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));
            boolean isPrime = true;
            StringBuilder explanation = new StringBuilder();

            if (number <= 1) {
                isPrime = false;
                explanation.append(number)
                           .append(" is not a prime number because it is less than or equal to 1.");
            } else {
                explanation.append("Checking divisibility of ")
                           .append(number)
                           .append(" from 2 to ")
                           .append(number / 2)
                           .append("<br>");

                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        explanation.append(number)
                                   .append(" is divisible by ")
                                   .append(i)
                                   .append(", hence it is not a prime number.");
                        break;
                    }
                }

                if (isPrime) {
                    explanation.append(number)
                               .append(" is not divisible by any number between 2 and ")
                               .append(number / 2)
                               .append(", hence it is a prime number.");
                }
            }

            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Prime Check Result</title></head><body>");
            out.println("<div style='margin:20px; padding:20px; border:1px solid #ccc; border-radius:5px;'>");
            out.println("<h2>Prime Number Checker</h2>");
            out.println("<p>Number Entered: <strong>" + number + "</strong></p>");
            out.println("<p>Result: <strong>" + (isPrime ? "Prime ✅" : "Not Prime ❌") + "</strong></p>");
            out.println("<p>" + explanation.toString() + "</p>");
            out.println("<a href='index2.html'>Check Another Number</a>");
            out.println("</div></body></html>");

        } catch (NumberFormatException e) {
            out.println("<!DOCTYPE html>");
            out.println("<html><body>");
            out.println("<h3 style='color:red;'>Please enter a valid number.</h3>");
            out.println("<a href='index2.html'>Go Back</a>");
            out.println("</body></html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index2.html");
    }
}
