package pt.isec.pd.boxoffice.web_service.controllers;

import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pt.isec.pd.boxoffice.web_service.model.Utilizador;
import pt.isec.pd.boxoffice.web_service.service.UserService;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private UserService userService;

    public AdminController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("registered_users")
    public ResponseEntity registeredUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }


    @PostMapping
    public ResponseEntity<Utilizador> createUser(@RequestBody Utilizador utilizador)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(utilizador));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Utilizador> deleteUser(@PathVariable("id") Integer id)
    {
        return ResponseEntity.ok().body(userService.deleteUser(id));
    }
}
