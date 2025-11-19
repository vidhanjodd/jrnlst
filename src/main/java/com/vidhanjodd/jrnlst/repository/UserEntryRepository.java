package com.vidhanjodd.jrnlst.repository;

import com.vidhanjodd.jrnlst.entity.JournalEntry;
import com.vidhanjodd.jrnlst.entity.UserEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserEntryRepository extends MongoRepository<UserEntry, ObjectId> {

}
