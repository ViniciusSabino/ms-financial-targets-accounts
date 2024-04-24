package ms.financial.targets.accounts.controllers;

import lombok.AllArgsConstructor;
import ms.financial.targets.accounts.models.CurrentBalances;
import ms.financial.targets.accounts.services.BalanceService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080")
@AllArgsConstructor
@RestController
@RequestMapping("/balance")
public class BalanceController {

    private final BalanceService balanceService;

    @GetMapping("/current")
    public CurrentBalances getCurrentBalances() {
        return balanceService.getCurrentBalances();
    }
}
