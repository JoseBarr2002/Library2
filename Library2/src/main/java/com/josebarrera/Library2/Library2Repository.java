package com.josebarrera.Library2;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Library2Repository extends MongoRepository<Library2, ObjectId> {

    Optional<Library2> findLibrary2ByLibraryId(String libraryId);
}
