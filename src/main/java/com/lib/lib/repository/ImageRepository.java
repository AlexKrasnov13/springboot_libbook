package com.lib.lib.repository;

import com.lib.lib.model.Image;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ImageRepository extends CrudRepository<Image,Long>{
    List<Image> findAll();
    Image getById(long id);
    Image save(Image image);
}
