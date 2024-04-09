package ms.financial.targets.accounts.controllers;

import lombok.AllArgsConstructor;
import ms.financial.targets.accounts.models.Balance;
import ms.financial.targets.accounts.services.BalanceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/balance")
public class BalanceController {

    private final BalanceService balanceService;

    @GetMapping("/current")
    public List<Balance> getCurrentBalances() {
        return balanceService.getCurrentBalances();
    }
}
