package com.callanalysis.dwcl;

import javax.servlet.http.*;


public class DayWeeklServlet  extends HttpServlet
{
	  public void doPost(HttpServletRequest req,HttpServletResponse resp)
	  {
		  String s=req.getParameter("id");
		  String s1=req.getParameter("fromnumber");
		  String s2=req.getParameter("Starttime");
		  String s3=req.getParameter("endtime");
		  String s4=req.getParameter("duration");
		  databasee.insertData(s, s1, s2, s3, s4);
	  } 

}
