package com.softarex.configurator;

import com.softarex.web.ClassRoomEndPoint;

import javax.websocket.server.ServerEndpointConfig.Configurator;

public class ClassRoomServerEndPointConfigurator extends Configurator {
    private ClassRoomEndPoint chatServer = new ClassRoomEndPoint();

    @Override
    public <T> T getEndpointInstance(Class<T> endpointClass)
            throws InstantiationException {
        return (T) chatServer;

    }
}