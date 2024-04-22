package ms.financial.targets.accounts.services;

import lombok.RequiredArgsConstructor;
import ms.financial.targets.accounts.enums.AccountType;
import ms.financial.targets.accounts.enums.Months;
import ms.financial.targets.accounts.models.CurrentBalances;
import ms.financial.targets.accounts.models.Documents.Balance;
import ms.financial.targets.accounts.repositories.BalanceRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class BalanceService {

    private final BalanceRepository repository;

    public CurrentBalances getCurrentBalances() {
        LocalDate now = LocalDate.now();

        Months currentMonth = Months.valueOf(now.getMonth().name());

        List<Balance> balances = repository.getBalancesByMonth(currentMonth);

        List<Balance> accounts = balances.stream()
                .filter(balance -> balance.getAccount().getType() == AccountType.CHECKING_ACCOUNT)
                .toList();

        List<Balance> investments = balances.stream()
                .filter(balance -> balance.getAccount().getType() == AccountType.INVESTMENT)
                .toList();

        return CurrentBalances.builder()
                .month(currentMonth)
                .year(now.getYear())
                .accounts(accounts)
                .investments(investments)
                .build();
    }
}
