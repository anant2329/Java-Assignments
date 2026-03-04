package com.anant.social_media;

public abstract class Login {
    private final String name;
    private final String username;
    private final String password;

    public Login(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public abstract boolean createLogin ();
    public boolean isValid() {
        if (!username.matches("^[a-z]{6,18}$")) {
            return false;
        }
        if (password.length() < 8) {
            return false;
        }
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }
        if (!password.matches(".*[0-9].*")) {
            return false;
        }
        if (!password.matches(".*[^a-zA-Z0-9].*")) {
            return false;
        }
        return true;
    }
}
