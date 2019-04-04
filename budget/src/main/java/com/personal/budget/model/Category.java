package com.personal.budget.model;

import java.util.Date;

public class Category {

    private String name;

    private String description;

    private Date createdDate;

    private Date deletedDate;

    public Category(String name, String description, Date createdDate, Date deletedDate) {
        this.name = name;
        this.description = description;
        this.createdDate = createdDate;
        this.deletedDate = deletedDate;
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Date deletedDate) {
        this.deletedDate = deletedDate;
    }
}
