package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

public interface IAddressBookService {
    AddressBookData create(AddressBookDTO dto);
}