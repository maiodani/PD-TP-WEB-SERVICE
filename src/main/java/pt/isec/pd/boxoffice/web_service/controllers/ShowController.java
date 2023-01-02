package pt.isec.pd.boxoffice.web_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.isec.pd.boxoffice.web_service.service.ShowService;

@RestController
public class ShowController {
    private ShowService showService;

    @Autowired
    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    //http://localhost:8083/shows?date_start=2021/02/20&date_end=2024/03/10

    @GetMapping("/shows")
    public ResponseEntity showsFilters(@RequestParam(name="date_start",defaultValue="") String date_start,
                                       @RequestParam(name="date_end",defaultValue="") String date_end)
    {

        if((date_start.equals("") && !date_end.equals("")) || (!date_start.equals("") && date_end.equals(""))){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error on params");
        }

        return ResponseEntity.ok(showService.getShows(date_start, date_end));
    }

}
