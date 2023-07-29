package com.group.meeting.Service;

import com.group.meeting.Entity.User;
import com.group.meeting.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserIMPL implements UserService {

    public UserRepo userRepo;
    @Override
    public User getUserById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User CreatUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User UpdateUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public void DeleteById(Long UserId) {
         userRepo.deleteById(UserId);
    }
}
