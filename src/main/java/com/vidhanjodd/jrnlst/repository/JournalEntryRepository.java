package com.vidhanjodd.jrnlst.repository;

import com.vidhanjodd.jrnlst.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry , ObjectId> {

}
