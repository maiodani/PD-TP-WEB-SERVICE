package pt.isec.pd.boxoffice.web_service.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pt.isec.pd.boxoffice.web_service.service.UserService;

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
}
