package ms.financial.targets.accounts.controllers;

import ms.financial.targets.accounts.models.BasicConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public BasicConfig home() {
        return new BasicConfig("Financial Targets - Accounts API", "development", 8085);
    }
}