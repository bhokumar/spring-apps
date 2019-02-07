package org.webflux.webfluxapp.domain;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Builder
public class Vendor {
    @Id
    private String id;

    private String firstName;

    private String lasName;

    public Vendor() {
    }

    public Vendor(String id, String firstName, String lasName) {
        this.id = id;
        this.firstName = firstName;
        this.lasName = lasName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }
}
