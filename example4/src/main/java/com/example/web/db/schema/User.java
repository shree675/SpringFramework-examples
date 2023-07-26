package com.example.web.db.schema;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
/*
 * using H2 database
 * 
 * check application.properties for
 * db url and configuration
 */
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long _id;

    @NotNull
    public long id;

    @NotNull
    public String name;

    /*
     * default constructor is mandatory
     * for hibernate
     */
    public User() {

    }

    public User(String name) {
        id = -1;
        this.name = name;
    }

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long get_id() {
        return _id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
