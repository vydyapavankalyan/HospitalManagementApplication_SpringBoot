<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body bgcolor="yellow">
   <center><h1>Edit User Details Here</h1>
    <form:form method="GET" action="/editandsave">
        <table>
            <tr>
                <td></td>
                <td><form:hidden path="id"/></td>
            </tr>

            <tr>
                <td>FirstName</td>
                <td><form:input path="firstName"/></td>
            </tr>

            <tr>
                <td>LastName</td>
                <td><form:input path="lastName"/></td>
            </tr>

            <tr>
                <td>Age</td>
                <td><form:input path="age"/></td>
            </tr>

            <tr>
                <td>gender:</td>
               
                <td><input type="radio" id="gender" name="gender" value="male" required> Male
             <input type="radio" id="gender" name="gender" value="female" required> Female</td>
              </tr>

            <tr>
                <td>BloodType</td>
                <td><form:input path="bloodType"/></td>
            </tr>

           

            <tr>
                <td>HealthCardNumber</td>
                <td><form:input path="healthCardNumber"/></td>
            </tr>

            <tr>
                <td>Email</td>
                <td><form:input path="email"/></td>
            </tr>
            <tr>
                <td>PhoneNumber</td>
                <td><form:input path="phoneNumber"/></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><form:input path="address"/></td>
            </tr>
            <td>Date:</td>
            <td>
              <input type="date" name="joindate"/>
            </td>
             <tr>

              <td>Disease:</td>
              <td>
                  <select name="doctors">
                      <option value="pediatrics">Pediatrics</option>
                      <option value="cardiology">Cardiology</option>
                      <option value="dermatology">Dermatology</option>
                      <option value="neurology">Neurology</option>
                      <option value="orthopedics">Orthopedics</option>
                      <option value="urology">Urology</option>
                      <option value="psychiatry">Psychiatry</option>
                  </select>
              </td>
          </tr>
            


            <tr>
                <td></td>
                <td><input type="submit" value="EidtSave"/></td>
            </tr>

        </table>
    </form:form></center> 
</body>