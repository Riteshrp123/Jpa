<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align: center;">Shiirts Details</h1>
        <div style="text-align: center;">
    <form action="shirts" method="post">
       <div>
            <input type="text" placeholder="name" name="name"></label>
            </div><br>
            <div>
                <input type="color" placeholder="color" name="color">
            </div><br>
            <div>
                <input type="price" placeholder="price" name="price">
            </div><br>
            <button type="submit">Save</button>
    
    </form>
    </div>

</body>
</html>