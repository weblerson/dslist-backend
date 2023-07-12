package com.lerson.dslist.repositories;

import com.lerson.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListRepository extends JpaRepository<GameList, Long> {
}
