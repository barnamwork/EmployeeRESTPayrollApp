package com.bridgelabz.addressbookapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @GetMapping("/")
    public String getAll() {
        return "Get all contacts";
    }

    @GetMapping("/get/{id}")
    public String getById(@PathVariable int id) {
        return "Get contact: " + id;
    }

    @PostMapping("/create")
    public String create() {
        return "Created contact";
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable int id) {
        return "Updated contact: " + id;
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return "Deleted contact: " + id;
    }
}