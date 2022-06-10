<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Display</title>
</head>
<body>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<ul>
    <c:forEach items="${contact_us_map}" var="map_item">
        <li><p>${map_item.key} > ${map_item.value}</p></li>
    </c:forEach>
</ul>

</body>
</html>