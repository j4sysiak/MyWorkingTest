package com.example.demo.repository;

import com.example.demo.model.Rectangle;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RectangleRepo extends CrudRepository<Rectangle, Long> {

    @Query(nativeQuery = true,
            value = "SELECT * FROM RECTANGLE rec WHERE (2*rec.height + 2*rec.weight) >= 20")
    List<Rectangle> getListOfBigRectangles();

    @Query(nativeQuery = true,
            value = "SELECT * FROM RECTANGLE rec WHERE (2*rec.height + 2*rec.weight) < 20")
    List<Rectangle> getListOfSmallRectangles();
}
