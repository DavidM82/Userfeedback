<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%><html>
<head>
	<title>Test Form</title>

</head>

<body>

<h2>Feedback Test Form</h2>

<form action="/testform" method="post">
  <label for="name">Name:</label><br>
  <input type="text" id="name" name="name" required><br>
  <label for="rating">Rating:</label><br>
  <input type="number" id="rating" name="rating" required><br>
  <label for="comments">Comment:</label><br>
  <input type="text" id="comments" name="comments" required><br><br>
  <input type="submit" value="Submit" >
</form> 

</body>