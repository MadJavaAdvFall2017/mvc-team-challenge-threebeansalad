

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2//EN">

<html>
<head>
    <meta name="generator" content="HTML Tidy, see www.w3.org">
    <link rel="stylesheet" type="text/css" href="css/styles.css">
    <title>Gift List</title>
</head>

<body>
    <div class="container">
        <div class="jumbotron">
            <header>
                <h2>MVC Team Demo - Gift List</h2>
                <h3>Three Bean Salad</h3>
            </header>
        </div>

        <br />


        giftDiagram	

        <br />


        <%@ page import="java.util.*"%>

        <%
            Calendar c = new GregorianCalendar();
            c.set(Calendar.YEAR, 2017);
            c.set(Calendar.MONTH, 11); // 11 = december
            c.set(Calendar.DAY_OF_MONTH, 25);

            Date xmas = c.getTime();
            Date today = new Date();
            long diff = xmas.getTime() - today.getTime();
            diff = diff / (1000L*60L*60L*24L);
        %>

        <h4>Only <%= diff %> shoppings days until Christmas!</h4>

        <br />
        <br />

        </div>
</body>
</html>