package com.example.demo.repository;

import com.example.demo.model.Rectangle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RectangleRepo extends CrudRepository<Rectangle, Long> {
}
