package com.hendisantika.springbootrestapipostgresql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hendisantika.springbootrestapipostgresql.entity.Author;

@RepositoryRestResource
public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findByName(String name);
}

// Test