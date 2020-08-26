package com.softarex.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.HashMap;
import java.util.Map;

@ManagedBean(name = "User")
@SessionScoped
public class UserMap {
    private Map<String, Boolean> usersMap = new HashMap<>();

    public void addUser(String name) {
        usersMap.put(name, false);
    }

    public boolean getUserByName(String name) {
        return usersMap.containsKey(name);
    }

    public void removeUser(String name) {
        usersMap.remove(name);
    }

    public Map<String, Boolean> getUsersMap() {
        return usersMap;
    }

    @Override
    public String toString() {
        return "UserMap{" +
                "usersMap=" + usersMap +
                '}';
    }

    /*
    private String name;
    private boolean status;

    private static UserMap ourInstance = new UserMap();

    public static UserMap getInstance(){
        return ourInstance;
    }

    private UserMap(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
*/

}