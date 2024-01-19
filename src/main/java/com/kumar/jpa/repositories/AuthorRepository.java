package com.kumar.jpa.repositories;

import com.kumar.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    // select * from author where first_name = 'kumar'
    List<Author> findAllByFirstName(String fn);

    // select * from author where first_name = 'kumar' & last_name= 'r'
//    List<User> findByFirstNameAndLastName(String fn, String ln);

    // select * from author where first_name = 'kumar'
    List<Author> findAllByFirstNameIgnoreCase(String fn);

    // select * from author where first_name  like '%ku%'
    List<Author> findAllByFirstNameContainingIgnoreCase(String fn);

    // select * from author where first_name  like '%ku'
    List<Author> findAllByFirstNameStartsWithIgnoreCase(String fn);

    // select * from author where first_name  like 'ku%'
    List<Author> findAllByFirstNameEndsWithIgnoreCase(String fn);

    Optional<Author> findByEmail(String email);

    int countAllByAge(int age);

    void deleteAllByAge(int age);

    @Modifying
    @Transactional
    @Query("update Author a set a.age = :age where a.id = :id")
    int updateAuthor(int age, int id);

    @Modifying
    @Transactional
    @Query("update Author a set a.age = :age")
    void updateAllAuthor(int age);
}
