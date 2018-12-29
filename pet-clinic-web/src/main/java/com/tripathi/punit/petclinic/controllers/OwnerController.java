package com.tripathi.punit.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/owners")
public class OwnerController {

    @RequestMapping(value = {"", "/", "index", "index.html"}, method = RequestMethod.GET)
    public String listOwners() {
        return "owners/index";
    }
}
