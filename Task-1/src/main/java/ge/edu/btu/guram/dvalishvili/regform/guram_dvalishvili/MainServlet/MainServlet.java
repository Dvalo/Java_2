package ge.edu.btu.guram.dvalishvili.regform.guram_dvalishvili.MainServlet;

import ge.edu.btu.guram.dvalishvili.regform.guram_dvalishvili.MainClass.Animal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/animal"})
public class MainServlet extends HttpServlet {
    Animal animal = new Animal();
    public static final String ANIMALVIEW = "/animalDisplay.jsp";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("animal", animal);

        RequestDispatcher view = req.getRequestDispatcher(ANIMALVIEW);
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        animal.setName(req.getParameter("name"));
        animal.setBreed(req.getParameter("breed"));
        animal.setGender(req.getParameter("gender"));
        animal.setAge(Integer.parseInt(req.getParameter("age")));

        // Debug
        System.out.println(animal.getName());
        System.out.println(animal.getBreed());
        System.out.println(animal.getGender());
        System.out.println(animal.getAge());

    }
}
