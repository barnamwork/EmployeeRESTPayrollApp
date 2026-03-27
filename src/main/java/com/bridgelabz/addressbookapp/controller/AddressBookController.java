package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    IAddressBookService service;

    @PostMapping("/create")
    public AddressBookData create(@RequestBody AddressBookDTO dto) {
        return service.create(dto);
    }
}