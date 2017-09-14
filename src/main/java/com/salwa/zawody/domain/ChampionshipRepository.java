package com.salwa.zawody.domain;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Piotr Karasiński
 */
@RepositoryRestResource(collectionResourceRel = "championship", path = "championship")
public interface  ChampionshipRepository extends PagingAndSortingRepository<Championship, Long> {
    
    List<Championship> findByName(@Param("name") String name);
}
