<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
    href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
    src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
    src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<h1>Welcome to maze</h1>
<body>
    <form action="FUN" method="post">

        <p>
        <p>
            <label for="name">where you want to go, select based on display option?</label>
             <input id="name" name="name"value="${param.name}">
           
 
             <input type="submit" class="btn btn-default"></>

        </p>
    </form>
    <table
        class="table table-striped table-hover table-condensed table-bordered">
        <tr>
            <th>Current Room</th>
            <th>Direction 1</th>
            <th>Direction 2</th>
            <th>Direction 3</th>
            <th>Item Seen</th>
        </tr>
        <tr>
            <td>${Room_Name}</td>
            <td>${Direction1}</td>
            <td>${Direction2}</td>
            <td>${Direction3}</td>
            <td>${ITEM}</td>
           
       
        </tr>
    </table>
    <table
        class="table table-striped table-hover table-condensed table-bordered">
        <tr>
            <th> Room Visited </th>
            <th>Item Seen</th>
        </tr>
      ${log_file}
    </table>


</body>
</html>


<!--  
  <select id="name" name="name"value="${param.name}">
                  <option value="Foyer">Foyer</option>
                  <option value="Front Room">Front Room</option>
                  <option value="Library">Library</option>
                  <option value="kitchen">Kitchen</option>
                  <option value="Dining Room">Dining Room</option>
                  <option value="vault">Vault</option>
                  <option value="parlor">Parlor</option>
                  <option value="secret room">Secret Room</option>
            </select>-->