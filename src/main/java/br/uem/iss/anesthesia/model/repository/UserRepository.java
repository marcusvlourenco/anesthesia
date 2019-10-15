package br.uem.iss.anesthesia.model.repository;

import br.uem.iss.anesthesia.model.entity.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {

    Optional<UserModel> findByLogin(String login);
}