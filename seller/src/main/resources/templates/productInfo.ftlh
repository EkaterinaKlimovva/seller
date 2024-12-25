<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Seller</title>
</head>
<body>
<h1>Пупупу покупочки</h1>
<h4>Товар</h4>
<b>Название: </b>${product.title}<br>
<b>Описание: </b>${product.description}<br>
<b>Цена: </b>${product.price}<br>
<b>Город: </b>${product.city}<br>
<b>Создатель: </b>${product.createUser}<br>
<hr>
<form action="/product/delete/${product.id}" method "post">
    <input type="submit" value="Удалить"/>
</form>
</body>
</html>