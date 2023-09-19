package com.springrest.springrest.service;

import com.springrest.springrest.entity.ContactList;

import java.util.List;

public interface ContactService {

    public List<String> getContactList();
    public List<String> insertContactList(String contact);
    public List<ContactList> getContact(String id);
    public List<ContactList> deleteContact(String id);
}
