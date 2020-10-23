package com.homifyin.nameAPI;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class NameController {

    @GetMapping("/name")
    public String getName(){
        return "M.D is going to install ssl soon! ";
    }
}
