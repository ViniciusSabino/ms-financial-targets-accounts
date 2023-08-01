package ms.financial.targets.accounts.controllers;

import ms.financial.targets.accounts.models.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountsController {

    @GetMapping("/all")
    public List<Account> listAllAccounts() {
        return new ArrayList<Account>();
    }

    @PostMapping("/checking/create")
    public String createCheckingAccount() {
        return "Create Checking Account";
    }
}
