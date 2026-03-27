package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    private List<AddressBookData> list = new ArrayList<>();
    private int counter = 1;

    @Override
    public List<AddressBookData> getAll() {
        return list;
    }

    @Override
    public AddressBookData getById(int id) {
        return list.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public AddressBookData create(AddressBookDTO dto) {
        AddressBookData data = new AddressBookData(counter++, dto);
        list.add(data);
        return data;
    }

    @Override
    public AddressBookData update(int id, AddressBookDTO dto) {
        AddressBookData data = getById(id);
        if (data != null) {
            list.remove(data);
            AddressBookData updated = new AddressBookData(id, dto);
            list.add(updated);
            return updated;
        }
        return null;
    }

    @Override
    public void delete(int id) {
        list.removeIf(e -> e.getId() == id);
    }
}