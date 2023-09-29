package mate.academy.service;

import mate.academy.exception.AuthenticationException;
import mate.academy.exception.RegisterException;
import mate.academy.model.User;

public interface AuthenticationService {
    User login(String email, String password) throws AuthenticationException;
    
    void register(String email, String password) throws RegisterException;

}
