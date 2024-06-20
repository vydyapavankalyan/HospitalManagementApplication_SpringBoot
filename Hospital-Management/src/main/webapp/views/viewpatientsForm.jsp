<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<html>
    <title>
        
    </title>
    <head>
        <style>
            
        </style>
    </head>

<body bgcolor="pink">
    <center><table class="tb" border="1"> 
<tr > 
    <th>ID</th> 
    <th>FirstName</th> 
    <th>LastName</th> 
    <th>Age</th> 
    <th>Gender</th> 
    <th>BloodType</th>  
    <th>HealthCardNumber</th> 
    <th>Email</th>
    <th>PhoneNumber</th>
    <th>Address</th>
    <th>Date</th>
    <th>Disease</th>
</tr> 
<c:forEach var="patien" items="${Patient}"> 
    <tr>   
        <td>${patien.id}</td>   
        <td>${patien.firstName}</td>    
        <td>${patien.lastName}</td>  
        <td>${patien.age}</td>  
        <td>${patien.gender}</td>  
        <td>${patien.bloodType}</td>  
        <td>${patien.healthCardNumber}</td>  
        <td>${patien.email}</td>  
        <td>${patien.phoneNumber}</td>
        <td>${patien.address}</td> 
        <td>${patien.joindate}</td> 

        <td>${patien.doctors}</td>   
        <td> 
            <a href="/delete/${patien.id}">Delete</a> 
        </td> 
        <td> 
            <a href="/edit/${patien.id}">Edit</a> 
        </td> 
        </td>  
         </tr>   
</c:forEach> 
</table>   <a href="/"><input class="btn btn-primary" type="button" value="Back"></a>
</center>
 
</body>
</html>