package br.com.mutzthec.auth.api.request;

import br.com.mutzthec.auth.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
