package com.energylook.backend.controllers;

import com.energylook.backend.models.RowModel;
import com.energylook.backend.services.TableManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller {

    @Autowired
    private TableManager tableManager;
    @GetMapping("/")
    private ArrayList<RowModel> getRows(){
        return tableManager.getRows();
    }
}
