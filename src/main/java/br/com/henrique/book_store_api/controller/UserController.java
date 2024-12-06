package br.com.henrique.book_store_api.controller;

import br.com.henrique.book_store_api.entity.User;
import br.com.henrique.book_store_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/save")
    public ResponseEntity<User> save(@RequestBody User user){
        return ResponseEntity.ok(userService.save(user));
    }

}
