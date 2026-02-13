package com.steffaneleal.lunnar.models;

import lombok.Getter;

@Getter
// Padronização para evitar erros -> salvar outros roles que não sejam exatamente ADMIN ou USER
public enum UserRole {
    ADMIN("admin"),
    USER("user");

    private String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
