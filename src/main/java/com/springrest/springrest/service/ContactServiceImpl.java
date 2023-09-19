package com.springrest.springrest.service;

import com.springrest.springrest.entity.ContactList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    List<ContactList> contactList;

    public ContactServiceImpl() {
        contactList = new ArrayList<>();
        contactList.add(new ContactList(1, "Raju"));

    }

    List<String> contactLists = new ArrayList<>();

    @Override
    public List<String> getContactList() {

        contactLists.add("Ram");
        return contactLists;
    }

    @Override
    public List<String> insertContactList(String contact) {
        contactLists.add(contact);
        return contactLists;
    }

    @Override
    public List<ContactList> getContact(String id) {

        // contactList.get(1);
        return contactList;
    }

    @Override
    public List<ContactList> deleteContact(String id) {

        contactList.remove(id);
        return contactList;
    }

}
