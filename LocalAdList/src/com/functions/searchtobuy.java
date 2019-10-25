package com.functions;

import java.io.IOException;
import java.util.ArrayList;
import org.bson.Document;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.categories.Categories;
import com.categories.ConnectionManager;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

/**
 * Servlet implementation class searchtobuy
 */
@WebServlet("/searchtobuy")
public class searchtobuy extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<Categories>dataList=new ArrayList<Categories>();
	List<Categories>List1;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchtobuy() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MongoClient connection = ConnectionManager.getMongo();
		MongoDatabase db = ConnectionManager.getDb("lib");

		MongoCollection<Document> collection = db.getCollection("Ads");
		dataList=new ArrayList<Categories>();
		MongoCursor<Document> cursor = collection.find().iterator();
		System.out.println("works");
		while (cursor.hasNext()) {
			Document d = (Document) cursor.next();
			
			Categories zip = new Categories(d.getString("choose"),d.getString("postingtitle"), d.getString("city"), d.getString("postalcode"),d.getString("desciption"),d.getString("email"));
			dataList.add(zip);
			
		}
		request.setAttribute("data", dataList);
		request.getRequestDispatcher("buy.jsp").forward(request, response);
		}
		
	
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MongoClient connection = ConnectionManager.getMongo();
		MongoDatabase db = ConnectionManager.getDb("lib");
		List1 = new ArrayList<Categories>();
		MongoCollection<Document> collection = db.getCollection("Ads");
		
		 String srch=request.getParameter("search");
		 MongoCursor <Document> cursor;
		 
		
			if(srch!=null) 
			
			cursor = collection.find(Filters.eq("postingtitle",srch)).limit(30).iterator();
			
			
			
			Document d = (Document) cursor.next();

			Categories zip = new Categories(d.getString("choose"),d.getString("postingtitle"), d.getString("city"), d.getString("postalcode"),d.getString("desciption"),d.getString("email"));
			List1.add(zip);
		
		request.setAttribute("sss", List1);
		request.getRequestDispatcher("buy.jsp").forward(request, response);
	}

}
