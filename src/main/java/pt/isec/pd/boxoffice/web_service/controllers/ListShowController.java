package pt.isec.pd.boxoffice.web_service.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isec.pd.boxoffice.web_service.database.DataBaseManager;

import java.security.Principal;

@RestController
@RequestMapping("shows")
public class ListShowController {

    @GetMapping("/shows")
    public ResponseEntity shows(Principal principal)
    {
        String shows;
        if(( shows = new DataBaseManager().shows(null, null)) != null){
            return ResponseEntity.ok(shows);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error obtain shows");
    }


}
