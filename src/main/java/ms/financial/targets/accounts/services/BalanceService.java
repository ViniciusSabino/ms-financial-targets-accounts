package ms.financial.targets.accounts.services;

import lombok.RequiredArgsConstructor;
import ms.financial.targets.accounts.enums.Months;
import ms.financial.targets.accounts.models.Balance;
import ms.financial.targets.accounts.repositories.BalanceRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class BalanceService {

    private final BalanceRepository repository;

    public List<Balance> getCurrentBalances() {
        LocalDate now = LocalDate.now();

        Months currentMonth = Months.valueOf(now.getMonth().name());

        List<Balance> balances = repository.getBalancesByMonth(currentMonth);

        // TODO: Mapeamento para o formato esperado no front-end;
        // TODO: Filtrar e separar por saldos de contas e investimentos

        return balances;
    }
}
