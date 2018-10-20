package food.updateservlet;

import Food.Conroller.FoodController;
import Food.Model.Food;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateServlet{
	private static final long serialVersionUID = 1L;

	public UpdateServlet() {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("ono"));
		String fname = request.getParameter("foodname");
		FoodController controller = new FoodController();
		FoodController.updateFood(id, fname);
		List<Food> list = FoodController.findAll();
		request.setAttribute("EMPLIST", list);
		RequestDispatcher rd = request.getRequestDispatcher("list.jsp");
		rd.forward(request, response);
	}
}