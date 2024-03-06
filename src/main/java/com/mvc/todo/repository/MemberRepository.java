package com.mvc.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvc.todo.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{
    
}
