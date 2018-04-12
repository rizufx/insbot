package com.qinsol.insbot.nbapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qinsol.insbot.nbapp.entity.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer>{
}