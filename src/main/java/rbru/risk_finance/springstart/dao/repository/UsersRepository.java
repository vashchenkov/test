package rbru.risk_finance.springstart.dao.repository;

import org.springframework.data.repository.CrudRepository;
import rbru.risk_finance.springstart.dao.model.User;

public interface UsersRepository extends CrudRepository<User, Long> {
}
