package com.kumar.jpa.repositories;

import com.kumar.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
