package com.vidhanjodd.jrnlst.service;

import com.vidhanjodd.jrnlst.entity.JournalEntry;
import com.vidhanjodd.jrnlst.entity.UserEntry;
import com.vidhanjodd.jrnlst.repository.JournalEntryRepository;
import com.vidhanjodd.jrnlst.repository.UserEntryRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Slf4j
@Component
public class UserEntryService {
        @Autowired
    private UserEntryRepository userEntryRepository;

        public void saveEntry(UserEntry userEntry){
            userEntryRepository.save(userEntry);
        }
        public List<UserEntry> getAll(){
            return userEntryRepository.findAll();
        }
        public Optional<UserEntry> findById(ObjectId id){
            return userEntryRepository.findById(id);
        }
        public void deleteById(ObjectId id){
            userEntryRepository.deleteById(id);
        }
        public UserEntry findByUserName(String username){
            return userEntryRepository.findByUsername(username);
        }

}
