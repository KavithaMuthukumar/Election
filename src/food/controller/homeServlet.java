package food.controller;


import Food.Conroller.FoodController;
import Food.Model.Food;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/homeservlet" })
public class homeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public homeServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		FoodController controller = new FoodController();
		List<Food> list = FoodController.findAll();
		for (Food f : list) {
			System.out.println(f);
		}
	}}
