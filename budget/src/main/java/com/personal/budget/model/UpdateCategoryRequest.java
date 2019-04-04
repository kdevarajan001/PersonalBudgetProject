package com.personal.budget.model;

import java.util.List;
import java.util.Map;

public class UpdateCategoryRequest {

    private long id;

    private List<Map<String,String>> updates;

    public UpdateCategoryRequest(long id, List<Map<String, String>> updates) {
        this.id = id;
        this.updates = updates;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Map<String, String>> getUpdates() {
        return updates;
    }

    public void setUpdates(List<Map<String, String>> updates) {
        this.updates = updates;
    }
}
