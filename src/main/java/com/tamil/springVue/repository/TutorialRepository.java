package com.tamil.springVue.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tamil.springVue.model.Tutorial;


public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
  List<Tutorial> findByPublished(boolean published);

  List<Tutorial> findByTitleContaining(String title);
}
