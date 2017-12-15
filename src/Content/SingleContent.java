package Content;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

/**
 * Servlet implementation class SingleContent
 */
@WebServlet("/SingleContent")
public class SingleContent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ContentBean lesson; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SingleContent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ContentBean bean = new ContentBean();
		int temp = Integer.parseInt(request.getParameter("lesson_id").trim());
		bean.setLesson_id(temp);
		ArrayList<ContentBean> lesson = new ArrayList<ContentBean>(); 
		lesson = ContentDAO.getSingleLesson(bean);
		Gson gson = new Gson(); 
		JsonElement elem = gson.toJsonTree(lesson, new TypeToken<List<ContentBean>>() {}.getType()); 
		JsonArray jArray = elem.getAsJsonArray(); 
		response.setContentType("application/json");
		response.getWriter().print(jArray);
		System.out.println(jArray);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
