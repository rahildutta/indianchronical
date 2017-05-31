<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "org.jsoup.Jsoup;"%>
<%@page import= "org.jsoup.nodes.Document;"%>
<%@page import= "org.jsoup.nodes.Element;"%>
<%@page import= "org.jsoup.select.Elements;"%>


<!DOCTYPE html>
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
<style>
body {margin:0;}

.column3{
    font-size: 14px;
    line-height: 20px;
    width: 50%;
    display: inline-block;
    padding: 0 1% 0 1%;
    vertical-align: top;
    margin-top: 5px;
    margin-bottom: 50px;
    transition: all .7s;
    border-right: 3px solid #2f2f2f;
    
}

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


  
</style>
<div class="topnav" id="myTopnav" style="margin-top:-10px;">
  <a href="home.jsp">HOME</a>
  <a href="sports.jsp">SPORTS</a>
  <a href="#news">ENTERTAINMENT</a>
  <a href="#contact">POLITICS</a>
  <a href="#about">WORLD</a>
  <a href="#about">TECH2</a>
</div>
</head>
<body style="background-color: #f5f5f5">  

    <div class="column3">
        
         <% 
             Document doc1 = Jsoup.connect("http://www.cricbuzz.com/?utm_source=TOISports_Cricwidget&utm_medium=ABtest&utm_campaign=TOISports").get(); 
         Elements t1 = doc1.select("div.cb-nws-intr,div.crd-cntxt");               
           for(Element link : t1) 
            {  
              %><br><br><%
                   
                  out.println(link.text());
                   
                  
            }%>
    </div>
    <div class="column3">
        
         <% 
             Document doc = Jsoup.connect("http://www.javatpoint.com").get();  
            Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]");                 
            
              %><br><br><%
                   for (Element image : images) {   
                  <img src="<%= image.attr("src") %>;" ></img>
                  
                  
                  
            }%>
    </div>
    
 </body>
<script language="javascript">
var today = new Date();
document.getElementById('dtText').innerHTML=today;
</script>
</html>
