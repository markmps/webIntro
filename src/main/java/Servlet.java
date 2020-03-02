import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet(name = "Servlet",urlPatterns = {"/Servlet"} )
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String navn = request.getParameter("navn");

        System.out.println(navn);

        request.setAttribute("minAtribut",navn);

        List<String> liste = new ArrayList<>();
        liste.add("Jønke");
        liste.add("blondie");
        liste.add("blondie");
        liste.add("blondie");
        liste.add("Gøgler");
        liste.add("feehar");

        Map<String, String> map = new HashMap<>();
        map.put("Jønke","58");
        map.put("blondie","62");
        map.put("Gøgler","54");
        map.put("feehaar","49");

        Set<String> set = new HashSet<>(liste);

        request.setAttribute("setRockere", set);

        request.setAttribute("mapRockere",map);


        request.setAttribute("rockerListe",liste);


        request.getRequestDispatcher("Velkommen.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }
}
