package ms.financial.targets.accounts.repositories;

import lombok.RequiredArgsConstructor;
import ms.financial.targets.accounts.models.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class AccountRepository {

    private final IAccountRepository repository;

    public List<Account> listAllAccounts() {
        return repository.findAll();
    }
}
