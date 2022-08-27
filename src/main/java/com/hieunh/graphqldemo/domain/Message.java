package com.hieunh.graphqldemo.domain;

import com.hieunh.graphqldemo.repository.entity.MessageEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private Integer id;
    private Integer fromUserId;
    private Integer toUserId;
    private String content;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;

    public Message(MessageEntity entity) {
        if (entity == null) {
            return;
        }

        this.id = entity.getId();
        this.fromUserId = entity.getFromUserId();
        this.toUserId = entity.getToUserId();
        this.content = entity.getContent();
        this.createdTime = entity.getCreatedTime();
        this.updatedTime = entity.getUpdatedTime();
    }
}
