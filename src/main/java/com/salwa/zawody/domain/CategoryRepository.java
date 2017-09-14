package com.salwa.zawody.domain;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Piotr Karasiński
 */
@RepositoryRestResource(collectionResourceRel = "category", path = "category")
public interface  CategoryRepository extends PagingAndSortingRepository<Category, Long> {
    
    List<Category> findByName(@Param("name") String name);
}
