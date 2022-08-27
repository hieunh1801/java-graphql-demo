package com.hieunh.graphqldemo.service;

import com.hieunh.graphqldemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private UserRepository userRepository;

}
