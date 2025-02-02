package JWT.Example.JWT.Example.service;

import JWT.Example.JWT.Example.entities.User;
import JWT.Example.JWT.Example.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class customUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

//        fetch user from db
        User user = userRepo.findByEmail(username).orElseThrow(() -> new RuntimeException("USer not found!"));

        return user;
    }
}
