package com.hieunh.graphqldemo.repository;

import com.hieunh.graphqldemo.repository.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<MessageEntity, Integer>,
        JpaSpecificationExecutor<MessageEntity> {
}
