package ms.financial.targets.accounts.services;

import lombok.RequiredArgsConstructor;
import ms.financial.targets.accounts.models.Account;
import ms.financial.targets.accounts.repositories.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AccountService {

    private final AccountRepository repository;

    public List<Account> listAllAccounts() {
      return repository.listAllAccounts();
    }
}
