package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @PostMapping("/create")
    public AddressBookData create(@RequestBody AddressBookDTO dto) {
        return new AddressBookData(1, dto);
    }
}