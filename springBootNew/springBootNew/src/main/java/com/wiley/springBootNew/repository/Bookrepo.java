package com.wiley.springBootNew.repository;

import com.wiley.springBootNew.model.Author;

import org.springframework.data.jpa.repository.JpaRepository;


    public interface Bookrepo extends JpaRepository<Author, Long> {


}
