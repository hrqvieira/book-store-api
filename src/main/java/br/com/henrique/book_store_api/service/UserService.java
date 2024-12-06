package br.com.henrique.book_store_api.service;

import br.com.henrique.book_store_api.entity.User;
import br.com.henrique.book_store_api.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public User save(User user){
        return userRepository.save(user);
    }

}
