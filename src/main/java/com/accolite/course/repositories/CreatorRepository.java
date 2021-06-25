package com.accolite.course.repositories;


import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;


import com.accolite.course.entities.Creator;



@Repository
public interface CreatorRepository extends CrudRepository<Creator, Long>{

}
