
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/FUN")
public class ZorkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Preprocess request: we actually don't need to do any business stuff, so just display JSP.
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		//doPost(request,response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Postprocess request: gather and validate submitted data and display the result in the same JSP.
		String user_input = request.getParameter("name");
		String room_name ,dir1 ,dir2 ,dir3 ,item;

		DbConnect dbconnect = new DbConnect();
		room room=dbconnect.getRoomDetails(user_input);
		room_name=room.getName();
		dir1=room.getDirection1();
		dir2=room.getDirection2();
		dir3=room.getDirection3();
		item=room.getItem();

	    String log =dbconnect.logfile();
		

		request.setAttribute("Room_Name", room_name);
		request.setAttribute("log_file", log);
		request.setAttribute("Direction1", dir1);
		request.setAttribute("Direction2", dir2);
		request.setAttribute("Direction3", dir3);
		request.setAttribute("Item", item);



		//System.out.println(room.getName()+room.getOption1()+room.getOption2()+room.getOption3()+room.getThings());

		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}