package ms.financial.targets.accounts.controllers;

import lombok.RequiredArgsConstructor;
import ms.financial.targets.accounts.models.Account;
import ms.financial.targets.accounts.services.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/accounts")
public class AccountsController {

    private final AccountService service;

    @GetMapping("/all")
    public List<Account> listAllAccounts() {
        return service.listAllAccounts();
    }

    @PostMapping("/checking/create")
    public String createCheckingAccount() {
        return "Create Checking Account";
    }
}
