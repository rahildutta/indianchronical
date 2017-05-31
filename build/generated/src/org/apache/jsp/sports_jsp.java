package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jsoup.Jsoup;;
import org.jsoup.nodes.Document;;
import org.jsoup.nodes.Element;;
import org.jsoup.select.Elements;;

public final class sports_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel = \"stylesheet\" type = \"text/css\" href = \"newscss.css\" />\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Indian Chronical</title>\n");
      out.write("    <h1 style=\"font-family: 'Playfair Display', serif;font-weight: 900;font-size: 90px;text-align: center;margin-bottom: 5px;margin-top: 5px;\">INDIAN CHRONICAL</h1>\n");
      out.write("<hr>\n");
      out.write("<marquee behavior=\"scroll\"  loop=\"-1\" width=\"100%\" id=\"dtText\">\n");
      out.write("</marquee> \n");
      out.write("<hr>\n");
      out.write("<div class=\"topnav\" id=\"myTopnav\" style=\"margin-top:-10px; align-content: center;\">\n");
      out.write("  <a href=\"home.jsp\">HOME</a>\n");
      out.write("  <a href=\"#news\">ENTERTAINMENT</a>\n");
      out.write("  <a href=\"#contact\">POLITICS</a>\n");
      out.write("  <a href=\"#about\">WORLD</a>\n");
      out.write("  <a href=\"#about\">BUSINESS</a>\n");
      out.write("  <a href=\"#about\">IPL 2017</a>\n");
      out.write("  <a href=\"#about\">TECH2</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("body {margin:0;}\n");
      out.write("\n");
      out.write(".topnav {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav a {\n");
      out.write("  float: left;\n");
      out.write("  display: block;\n");
      out.write("  color: #f2f2f2;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 17px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav a:hover {\n");
      out.write("  background-color: white;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav .icon {\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width: 600px) {\n");
      out.write("  .topnav a:not(:first-child) {display: none;}\n");
      out.write("  .topnav a.icon {\n");
      out.write("    float: right;\n");
      out.write("    display: block;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width: 600px) {\n");
      out.write("  .topnav.responsive {position: relative;}\n");
      out.write("  .topnav.responsive .icon {\n");
      out.write("    position: absolute;\n");
      out.write("    right: 0;\n");
      out.write("    top: 0;\n");
      out.write("  }\n");
      out.write("  .topnav.responsive a {\n");
      out.write("    float: none;\n");
      out.write("    display: block;\n");
      out.write("    text-align: left;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body style=\"background-color: #f5f5f5\">  \n");
      out.write("\n");
      out.write("    <div class=\"column2\">\n");
      out.write("        \n");
      out.write("         ");
 
             Document doc1 = Jsoup.connect("http://www.skysports.com/football").get();  
             Elements t1 = doc1.select("a.news-top-story__headline-link,p");

      out.write("<h1 style=\"text-align: center\"><u>FOOTBALL</u></h1>");

                 
           for(Element link : t1) 
            {  
              
      out.write("<br><br>");

                   
                  out.println(link.text());
                   
                  
            }
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"column\">\n");
      out.write("        \n");
      out.write("          ");
 Document doc2 = Jsoup.connect("http://www.espn.in/tennis/").get();  
             Elements t2 = doc2.select("h1,id,p");
          
      out.write("<h1 style=\"text-align: center\"><u>TENNIS</u></h1>");

                   for(Element link : t2) 
            {  
              
      out.write("<br><br>");
out.println(link.text()); 
            }
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"column\">\n");
      out.write("        \n");
      out.write("          ");
 Document doc3 = Jsoup.connect("http://www.firstpost.com/category/entertainment").get();  
             Elements t3 = doc3.select("h1,div.news-item,div.news-title,h3.panel-title,p");
             
      out.write("<h1 style=\"text-align: center\"><u>Entertainment</u></h1>");

                   for(Element link : t3) 
            {  
              
      out.write("<br><br>");
//out.println(link.text()); 
            }
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"column\">\n");
      out.write("        \n");
      out.write("          ");
 Document doc4 = Jsoup.connect("http://www.firstpost.com/category/business").get();  
             Elements t4 = doc4.select("h1,div.news-item,div.news-title,h3.panel-title,p");
          
      out.write("<h1 style=\"text-align: center\"><u>Business</u></h1>");

                   for(Element link : t4) 
            {  
              
      out.write("<br><br>");
//out.println(link.text()); 
            }
      out.write("\n");
      out.write("    </div> \n");
      out.write("    <div class=\"column\">\n");
      out.write("        \n");
      out.write("          ");
 Document doc5 = Jsoup.connect("http://www.firstpost.com/category/world").get();  
             Elements t5 = doc5.select("h1,div.news-item,div.news-title,h3.panel-title,p");
             
      out.write("<h1 style=\"text-align: center\"><u>World</u></h1>");

                   for(Element link : t5) 
            {  
              
      out.write("<br><br>");
//out.println(link.text()); 
            }
      out.write("\n");
      out.write("    </div>   \n");
      out.write(" </body>\n");
      out.write(" \n");
      out.write("<script language=\"javascript\">\n");
      out.write("var today = new Date();\n");
      out.write("document.getElementById('dtText').innerHTML=today;\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
