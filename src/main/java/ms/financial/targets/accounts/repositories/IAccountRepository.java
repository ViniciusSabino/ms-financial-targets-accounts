package ms.financial.targets.accounts.repositories;

import ms.financial.targets.accounts.models.Documents.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IAccountRepository extends MongoRepository<Account, String> {
}
