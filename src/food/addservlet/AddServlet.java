package food.addservlet;

import Food.Conroller.FoodController;
import Food.Model.Food;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int orderno = Integer.parseInt(request.getParameter("orderno"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		int amount = Integer.parseInt(request.getParameter("amount"));
		String fooditem = request.getParameter("fooditem");
		String customername = request.getParameter("customername");
		String customeraddress = request.getParameter("customeraddress");
		Food food = new Food(orderno, quantity, amount, fooditem, customername, customeraddress);
		FoodController controller = new FoodController();
		FoodController.addFood(food);
		List<Food> foodlist = FoodController.findAll();
		request.setAttribute("EMPLIST", foodlist);
		RequestDispatcher rd = request.getRequestDispatcher("list.jsp");
		rd.forward(request, response);
	}

}
