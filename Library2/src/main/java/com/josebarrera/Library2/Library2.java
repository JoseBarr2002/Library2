package com.josebarrera.Library2;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "libraries")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Library2 {

    @Id
    private ObjectId id;
    private String libraryId;
    private String name;
    private List<String> books; // Will be List<Book> books.
    private String user; // Will be User user.

}
