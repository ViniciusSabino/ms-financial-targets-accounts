package ms.financial.targets.accounts.controllers;

import lombok.AllArgsConstructor;
import ms.financial.targets.accounts.models.Account;
import ms.financial.targets.accounts.services.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/accounts")
public class AccountsController {

    private final AccountService service;

    @GetMapping("")
    public List<Account> listAllAccounts() {
        return service.listAllAccounts();
    }
}
