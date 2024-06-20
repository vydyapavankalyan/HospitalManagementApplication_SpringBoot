<body bgcolor="pink">
    <center>
       <h1 style="color:rgb(0, 42, 255)"> Patient Registration Form</h1>
       <form action="/register"  method="POST">
        <table>
          <tr>
            <td></td>
            <td><form:hidden path="id"/></td>
        </tr>
          <tr>
            <td>FirstName:</td>
            <td><input type="text" name="firstName" required/></td>
          </tr><p></p>
          <tr>
            <td>LastName:</td>
            <td><input type="text" name="lastName" required/></td>
          </tr><p></p>
          <tr>
            <td>Age:</td>
            <td><input type="text" name="age" required/></td>
          </tr><p></p>
          <tr>
            <td>gender:</td>
           
            <td><input type="radio" id="gender" name="gender" value="male" required> Male
         <input type="radio" id="gender" name="gender" value="female" required> Female</td>
          </tr><p></p>

          <tr>
            <td>BloodType:</td>
            <td><input type="text" name="bloodType" required/></td>
          </tr><p></p>
         
          <tr>
            <td>HealthCardNumber:</td>
            <td><input type="text" name="healthCardNumber" required/></td>
          </tr><p></p>
          <tr>
            <td>Email:</td>
            <td><input type="email" name="email" required/></td>
          </tr><p></p>
          <tr>
            <td>MobileNo:</td>
            <td><input type="number" name="phoneNumber" required/></td>
          </tr><p></p>
          <tr>
            <td>Address:</td>
            <td><textarea name="address" required></textarea></td>
          </tr><p></p>
          <tr>

            <td>Date:</td>
            <td>
              <input type="date" name="joindate" required/>
            </td>
          </tr>
             <tr>

              <td>Disease:</td>
              <td>
                  <select name="doctors" required>
                    <option value=""></option>
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
            <td><input type="submit" value="submit"/>
            <input type="submit" value="Clear"/></td>
        </tr>
       </form>
    </table>
    <a href="/"><input class="btn btn-primary" type="button" value="Back"></a>
    </center>
    </body>



