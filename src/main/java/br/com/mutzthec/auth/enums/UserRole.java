package br.com.mutzthec.auth.enums;

public enum UserRole {

    ADMIN("amin"),
    USER("user");

    private String role;

    private UserRole(String role){
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
