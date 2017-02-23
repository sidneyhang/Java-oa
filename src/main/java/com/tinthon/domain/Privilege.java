package com.tinthon.domain;

import javax.persistence.*;

/**
 * Created by sidney on 2017/2/23.
 */

@Entity(name = "privilege")
public class Privilege {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id")
    private int id;

    @Column(name = "parent_p_id")
    private int parentId;

    @Column(name = "p_name")
    private String name;

    @Column(name = "description")
    private String description;

    public int getId() {
        return id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
