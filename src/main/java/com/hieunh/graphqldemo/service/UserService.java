package com.hieunh.graphqldemo.service;

import com.hieunh.graphqldemo.domain.User;
import com.hieunh.graphqldemo.repository.UserRepository;
import com.hieunh.graphqldemo.repository.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> findAll() {
        List<UserEntity> userEntityList = userRepository.findAll();
        return this.fromEntityList(userEntityList);
    }

    public User findById(Integer id) {
        assert id != null;
        Optional<UserEntity> optionalUserEntity = userRepository.findById(id);
        UserEntity userEntity = optionalUserEntity.orElse(null);
        return this.fromEntity(userEntity);
    }

    private User fromEntity(UserEntity entity) {
        if (entity == null) {
            return null;
        }
        return new User(entity);
    }

    private List<User> fromEntityList(List<UserEntity> entityList) {
        if (entityList == null || entityList.size() == 0) {
            return null;
        }

        return entityList.stream().map(this::fromEntity).collect(Collectors.toList());
    }
}
