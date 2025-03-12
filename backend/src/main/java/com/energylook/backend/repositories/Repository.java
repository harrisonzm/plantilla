package com.energylook.backend.repositories;

import com.energylook.backend.models.RowModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface Repository extends JpaRepository<RowModel,Long> {
    @Query("SELECT row FROM RowModel row ORDER BY row.id")
    ArrayList<RowModel> getRows();
}
