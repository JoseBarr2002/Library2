package com.josebarrera.Library2;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/libraries")
public class Library2Controller {

    @Autowired
    private Library2Service library2Service;

    @GetMapping
    public ResponseEntity<List<Library2>> getAllLibraries() {
        return new ResponseEntity<List<Library2>>(library2Service.allLibraries(), HttpStatus.OK);
    }

    @GetMapping("/{libraryId}")
    public ResponseEntity<Optional<Library2>> getSingleLibrary(@PathVariable String libraryId) {
        return new ResponseEntity<Optional<Library2>>(library2Service.singleLibrary2(libraryId), HttpStatus.OK);
    }
}
