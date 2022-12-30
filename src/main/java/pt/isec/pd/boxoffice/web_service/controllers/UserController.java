package pt.isec.pd.boxoffice.web_service.controllers;

import com.fasterxml.jackson.core.PrettyPrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pt.isec.pd.boxoffice.web_service.service.UserService;

import java.security.Principal;

@RestController
@RequestMapping("/User")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/paid_reservations")
    public ResponseEntity paidReservations(Principal principal) {
        return ResponseEntity.ok(userService.getPaidReservations(principal.getName()));
    }

    @GetMapping("/wait_paid_reservations")
    public ResponseEntity waitPaidReservations(Principal principal) {
        return ResponseEntity.ok(userService.getWaitPaidReservations(principal.getName()));
    }


}
