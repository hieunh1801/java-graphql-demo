package com.hieunh.graphqldemo.repository;

import com.hieunh.graphqldemo.repository.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<UserEntity, Integer>,
        JpaSpecificationExecutor<UserEntity> {
}
