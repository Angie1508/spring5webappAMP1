package com.anamarijapoljak.spring5webapp.repositories;

import com.anamarijapoljak.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long>
{

}

