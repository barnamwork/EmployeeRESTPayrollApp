package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.stereotype.Service;

@Service
public class AddressBookService implements IAddressBookService {

    @Override
    public AddressBookData create(AddressBookDTO dto) {
        return new AddressBookData(1, dto);
    }
}