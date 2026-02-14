// Classe para criação de DTOs
package com.steffaneleal.lunnar.dto;

// substituí o public class por public record porque já vem com os getters automáticos pros parâmetros
public record LoginRequestDTO (String email, String password) {

}
