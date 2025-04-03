package br.com.mutzthec.auth.api.controller;

import br.com.mutzthec.auth.api.request.AuthenticationDTO;
import br.com.mutzthec.auth.api.request.RegisterDTO;
import br.com.mutzthec.auth.api.response.LoginResponseDTO;
import br.com.mutzthec.auth.model.service.AuthorizationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {

    @Autowired
    AuthorizationService authorizationService;

    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody @Valid AuthenticationDTO authenticationDTO){
        return authorizationService.login(authenticationDTO);
    }

    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody RegisterDTO registerDTO){
        return authorizationService.register(registerDTO);
    }
}
