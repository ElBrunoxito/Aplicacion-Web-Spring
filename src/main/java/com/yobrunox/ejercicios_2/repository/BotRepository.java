package com.yobrunox.ejercicios_2.repository;

import com.yobrunox.ejercicios_2.modles.Bot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BotRepository extends JpaRepository<Bot,Repository> {

}
