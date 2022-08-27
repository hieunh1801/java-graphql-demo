package com.hieunh.graphqldemo.domain;
import com.hieunh.graphqldemo.repository.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String photoUrl;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;

    public User(UserEntity entity) {
        if (entity == null) {
            return;
        }
        this.id = entity.getId();
        this.name = entity.getName();
        this.photoUrl = entity.getPhotoUrl();
        this.createdTime = entity.getCreatedTime();
        this.updatedTime = entity.getUpdatedTime();
    }
}
