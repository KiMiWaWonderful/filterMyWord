package javaWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NoteServlet")
public class NoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=utf-8");
	        PrintWriter out = response.getWriter();
	        out.println("��֧��GET��ʽ����");
	        out.close();

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
        out.println("<HTML>");
        out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
        out.println("  <BODY>");

        String name = request.getParameter("name");
        if(name==null || name.trim().length()<=0){
            out.println("���ֲ���Ϊ��!!!");
        }else{
            String words = request.getParameter("note");
            out.println("<br/>"+name+"��������:<br/>"+ words);
        }
        out.println("  </BODY>");
        out.println("</HTML>");
        out.flush();
        out.close();

	}

}
