package JWT.Example.JWT.Example.service;

import JWT.Example.JWT.Example.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store=new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"MaeinuKhan","khanmaeinuddin19@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"naim","naim@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"imran","imran@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"ashraf","ashraf@gmail.com"));

    }


    public List<User> getUsers(){
        return this.store;
    }
}
