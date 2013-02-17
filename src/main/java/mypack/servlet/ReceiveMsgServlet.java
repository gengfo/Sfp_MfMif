package mypack.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypack.msghandler.MyMessageReceiver;

public class ReceiveMsgServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res)
			throws IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><head><title>" + "Hello SendMsgServlet!</title></head>");
		out.println("<body><h1>Hello SendMsgServlet!</h1></body></html>");
		
		MyMessageReceiver mr = new MyMessageReceiver();
		mr.receiveMessage();		
		
		out.println("<body><h1>Done!</h1></body></html>");
		
		
	}
}
