package com.energylook.backend.services;

import com.energylook.backend.models.RowModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class TableManager {
    @Autowired
    private com.energylook.backend.repositories.Repository repository;

    public ArrayList<RowModel> getRows(){
        return repository.getRows();
    }
}
