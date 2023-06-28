package com.aucasa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aucasa.entity.Activity;



public interface ActivityRepository extends JpaRepository<Activity, Long> {

}
