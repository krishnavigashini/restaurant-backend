//package com.example.demo.Repository;
//
//import com.example.demo.Model.model;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface repository extends JpaRepository<model,Long> {
//}
package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.model;

@Repository
public interface repository extends JpaRepository<model, Integer> {

}