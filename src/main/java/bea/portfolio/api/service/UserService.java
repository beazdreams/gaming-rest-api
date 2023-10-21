package bea.portfolio.api.service;

import bea.portfolio.api.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
