package com.vidhanjodd.jrnlst.controller;

import com.vidhanjodd.jrnlst.entity.JournalEntry;
import com.vidhanjodd.jrnlst.entity.UserEntry;
import com.vidhanjodd.jrnlst.service.JournalEntryService;
import com.vidhanjodd.jrnlst.service.UserEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")

public class UserEntryController {

    @Autowired
    private UserEntryService userEntryService;

    @GetMapping
    public List<UserEntry> getAllUsers(){
        return userEntryService.getAll();
    }
    @PostMapping
    public void createUser(@RequestBody UserEntry userEntry){
        userEntryService.saveEntry(userEntry);
    }
    @PutMapping("/{userName}")
    public ResponseEntity<?> updateUser(@RequestBody UserEntry userEntry , @PathVariable String userName){
        UserEntry userInDB = userEntryService.findByUserName(userName);
        if(userInDB != null){
            userInDB.setUsername(userEntry.getUsername());
            userInDB.setPassword(userEntry.getPassword());
            userEntryService.saveEntry(userInDB);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
