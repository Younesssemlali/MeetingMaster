package com.group.meeting.Service;

import com.group.meeting.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public User getUserById(Long id);
    public List<User> getAllUsers();

    public User CreatUser(User user);
    public User UpdateUser(User user);
    public void DeleteById(Long UserId);



}
