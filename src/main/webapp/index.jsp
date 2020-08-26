<!DOCTYPE html>
<html lang="en">
<head>
    <title>Class Room</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="resources/style.css" type="text/css"/>
    <script src="resources/classRoom.js"></script>
</head>
<body onload="connect();" onunload="disconnect()">
<h1> Class Room </h1>
<textarea id="messages" class="panel message-area" readonly></textarea>
<div class="panel input-area">

    <select id="messageInput" class="text-field">
        <option value="Поднял руку">Rise hand up</option>
        <option value="Опустил руку">Rise hand down</option>
    </select>
    <button type="button" onclick="sendMessage();" class="button">Send</button>

</div>
</body>
</html>