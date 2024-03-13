package ms.financial.targets.accounts.repositories;

import lombok.RequiredArgsConstructor;
import ms.financial.targets.accounts.models.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AccountRepository {

    @Autowired
    private IAccountRepository repository;
    public List<Account> listAllAccounts() {
        return repository.findAll();
    }
}
