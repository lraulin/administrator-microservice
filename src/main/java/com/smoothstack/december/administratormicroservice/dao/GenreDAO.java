package com.smoothstack.december.administratormicroservice.dao;

import com.smoothstack.december.administratormicroservice.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GenreDAO extends JpaRepository<Genre, Long> {
}
