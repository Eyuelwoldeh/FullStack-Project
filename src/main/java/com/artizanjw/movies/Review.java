package com.artizanjw.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@AllArgsConstructor
@NoArgsConstructor
public class Review { // One thing to note here: the lombok data annotation was not working in properly creating the getters and setters to I had t manually create those.
    @Id
    private ObjectId id;
    private String body;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId Id)
    {
        this.id = Id;
    }
    public Review(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
