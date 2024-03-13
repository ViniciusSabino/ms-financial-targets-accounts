package ms.financial.targets.accounts.repositories;

import ms.financial.targets.accounts.models.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface IAccountRepository extends MongoRepository<Account, String> {

    @Query
    List<Account> findAll();
}
