<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "org.jsoup.Jsoup;"%>
<%@page import= "org.jsoup.nodes.Document;"%>
<%@page import= "org.jsoup.nodes.Element;"%>
<%@page import= "org.jsoup.select.Elements;"%>
<html>
    <head>
        <link rel = "stylesheet" type = "text/css" href = "newscss.css" />
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Indian Chronical</title>
    <h1 style="font-family: 'Playfair Display', serif;font-weight: 900;font-size: 90px;text-align: center;margin-bottom: 5px;margin-top: 5px;">INDIAN CHRONICAL</h1>
<hr>
<marquee behavior="scroll"  loop="-1" width="100%" id="dtText">
</marquee> 
<hr>
<div class="topnav" id="myTopnav" style="margin-top:-10px; align-content: center;">
  <a href="home.jsp">HOME</a>
  <a href="#news">ENTERTAINMENT</a>
  <a href="#contact">POLITICS</a>
  <a href="#about">WORLD</a>
  <a href="#about">BUSINESS</a>
  <a href="IPL2017.jsp">IPL 2017</a>
  <a href="#about">TECH2</a>
</div>

<style>
body {margin:0;}

.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: white;
  color: black;
}

.topnav .icon {
  display: none;
}

@media screen and (max-width: 600px) {
  .topnav a:not(:first-child) {display: none;}
  .topnav a.icon {
    float: right;
    display: block;
  }
}

@media screen and (max-width: 600px) {
  .topnav.responsive {position: relative;}
  .topnav.responsive .icon {
    position: absolute;
    right: 0;
    top: 0;
  }
  .topnav.responsive a {
    float: none;
    display: block;
    text-align: left;
  }

}

</style>

</head>


<body style="background-color: #f5f5f5">  

    <div class="column2">
        
         <% 
             Document doc1 = Jsoup.connect("http://www.skysports.com/football").get();  
             Elements t1 = doc1.select("a.news-top-story__headline-link,p");
%><h1 style="text-align: center"><u>FOOTBALL</u></h1><%
                 
           for(Element link : t1) 
            {  
              %><br><br><%
                   
                  out.println(link.text());
                   
                  
            }%>
    </div>
    <div class="column">
        
          <% Document doc2 = Jsoup.connect("http://www.espn.in/tennis/").get();  
             Elements t2 = doc2.select("h1,id,p");
          %><h1 style="text-align: center"><u>TENNIS</u></h1><%
                   for(Element link : t2) 
            {  
              %><br><br><%out.println(link.text()); 
            }%>
    </div>
    <div class="column">
        
          <% Document doc3 = Jsoup.connect("http://www.firstpost.com/category/entertainment").get();  
             Elements t3 = doc3.select("h1,div.news-item,div.news-title,h3.panel-title,p");
             %><h1 style="text-align: center"><u>Entertainment</u></h1><%
                   for(Element link : t3) 
            {  
              %><br><br><%//out.println(link.text()); 
            }%>
    </div>
    <div class="column">
        
          <% Document doc4 = Jsoup.connect("http://www.firstpost.com/category/business").get();  
             Elements t4 = doc4.select("h1,div.news-item,div.news-title,h3.panel-title,p");
          %><h1 style="text-align: center"><u>Business</u></h1><%
                   for(Element link : t4) 
            {  
              %><br><br><%//out.println(link.text()); 
            }%>
    </div> 
    <div class="column">
        
          <% Document doc5 = Jsoup.connect("http://www.firstpost.com/category/world").get();  
             Elements t5 = doc5.select("h1,div.news-item,div.news-title,h3.panel-title,p");
             %><h1 style="text-align: center"><u>World</u></h1><%
                   for(Element link : t5) 
            {  
              %><br><br><%//out.println(link.text()); 
            }%>
    </div>   
 </body>
 
<script language="javascript">
var today = new Date();
document.getElementById('dtText').innerHTML=today;
</script>

</html>
