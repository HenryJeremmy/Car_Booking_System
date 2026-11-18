package com.henryjeremiah.user;

import java.util.Objects;
import java.util.UUID;

public class User {
    private UUID userId;
    private String name;

    public User(UUID userID, String name) {
        this.userId = userID;
        this.name = name;
    }

    public UUID getUserID() {
        return userId;
    }

    public void setUserID(UUID userID) {
        this.userId = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                '}' ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name);
    }
}
