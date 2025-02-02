package JWT.Example.JWT.Example.service;

import JWT.Example.JWT.Example.entities.User;
import JWT.Example.JWT.Example.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

//    private List<User> store=new ArrayList<>();

//    public UserService() {
//        store.add(new User(UUID.randomUUID().toString(),"MaeinuKhan","khanmaeinuddin19@gmail.com"));
//        store.add(new User(UUID.randomUUID().toString(),"naim","naim@gmail.com"));
//        store.add(new User(UUID.randomUUID().toString(),"imran","imran@gmail.com"));
//        store.add(new User(UUID.randomUUID().toString(),"ashraf","ashraf@gmail.com"));
//
//    }

    @Autowired
    private UserRepo userRepo;


    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<User> getUsers(){

        return userRepo.findAll();
    }

    public User create(User user){
        user.setUserId(UUID.randomUUID().toString());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }
}
