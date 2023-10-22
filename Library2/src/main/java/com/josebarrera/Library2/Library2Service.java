package com.josebarrera.Library2;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Library2Service {

    @Autowired // Automaic instantiated (No constructor boilerplate)
    private Library2Repository library2Repository;

    public List<Library2> allLibraries() {
        return library2Repository.findAll();
    }

    public Optional<Library2> singleLibrary2(String libraryId) {
        return library2Repository.findLibrary2ByLibraryId(libraryId);
    }
}
