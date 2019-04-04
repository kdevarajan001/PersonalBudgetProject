package com.personal.budget.controller;

import com.personal.budget.model.Category;
import com.personal.budget.model.UpdateCategoryRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryController {

    @RequestMapping("/category", method=RequestMethod.POST)
    public void add(@RequestBody Category category){

    }

    @RequestMapping(value = "/category/{id}", method = RequestMethod.DELETE)
    public void delete(@RequestParam("id") long id){

    }

    @RequestMapping(value =  "/category", method = RequestMethod.PUT)
    public void update(@RequestBody Category category){

    }

    @RequestMapping(value = "/category/{id}")
    public void getById(@RequestParam("id") String id){

    }
}
