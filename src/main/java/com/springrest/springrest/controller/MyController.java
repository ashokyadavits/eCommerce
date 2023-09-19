package com.springrest.springrest.controller;

import com.springrest.springrest.entity.ContactList;
import com.springrest.springrest.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class MyController {

    @Autowired
    ContactService contactService;

    @GetMapping("/home")
    public String home() {
        return "This is home page";
    }

    @GetMapping("/contact")
    public List<String> getContactLists() {

        List<String> contact = contactService.getContactList();
        return contact;
    }

    @PostMapping("/addContact")
    public List<String> insertContactList(@RequestBody String contact) {

        List<String> list = contactService.insertContactList(contact);
        return list;
    }

    @GetMapping("/id/{id}")
    public List<ContactList> getContact(@PathVariable String id) {
        return contactService.getContact(id);
    }

    @DeleteMapping("/delete/{id}")
    public List<ContactList> deleteContact(@PathVariable String id) {

        return contactService.deleteContact(id);
    }
}
