// Websocket Endpoint url
var host = window.location.host;
var path = window.location.pathname;
var webCtx = path.substring(0, path.indexOf('/', 1));
var endPointURL = "ws://" + window.location.host + webCtx + "/members";

var chatClient = null;
var user;

function connect() {
    chatClient = new WebSocket(endPointURL);
    chatClient.onmessage = function (event) {
        user = document.getElementById("userName");
        if (user === "")
            alert("Please enter your name!");
        /*        var messagesArea = document.getElementById("messages");
                var jsonObj = JSON.parse(event.data);
                var message = jsonObj.user + ": " + jsonObj.message + "\r\n";
                messagesArea.value = messagesArea.value + message;
                messagesArea.scrollTop = messagesArea.scrollHeight;*/
    };
}

function disconnect() {
    chatClient.close();
}

function sendMessage() {
    var messagesArea = document.getElementById("messages");
    var gsonObj = JSON.parse(event.data);
    var messages = gsonObj.user + ": " + gsonObj.message + "\r\n";
    messagesArea.value = messagesArea.value + messages;
    messagesArea.scrollTop = messagesArea.scrollHeight;
    var inputElement = document.getElementById("messageInput");
    var message = inputElement.value.trim();
    if (message !== "") {
        var jsonObj = {"user": user, "message": message};
        chatClient.send(JSON.stringify(jsonObj));
        inputElement.value = "";
    }
    inputElement.focus();
}