<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Seller</title>
</head>
<body>
<h1>Пупупу покупочки</h1>
<h4>Покупочки</h4>
<#list products as product>
    <div>
        <p><b>${product.title}</b> ${product.price} руб. | <a href="/product/${product.id}">Подробнее...</a></p>
    </div>
</#list>
<hr>
<h3>Создать новый продуктик</h3>
<form action="/product/create" method="post">
    Название: <input type="text" name="title"/><br><br>
    Описание: <input type="text" name="description"/><br><br>
    Цена: <input type="number" name="price"/><br><br>
    Город: <input type="text" name="city"/><br><br>
    Имя: <input type="text" name="createUser"/><br><br>
    <input type="submit" value="Добавить товар"/>
</form>
</body>
</html>