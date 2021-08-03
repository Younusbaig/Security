package com.JavaSecurity.JavaSecurity.repository;

import com.JavaSecurity.JavaSecurity.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends JpaRepository<Post,Integer> {

}
