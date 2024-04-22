package ms.financial.targets.accounts.repositories;

import lombok.RequiredArgsConstructor;
import ms.financial.targets.accounts.enums.Months;
import ms.financial.targets.accounts.models.Documents.Balance;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class BalanceRepository {

    private final IBalanceRepository repository;

    public List<Balance> getBalancesByMonth(Months month) {
        return repository.getBalancesByMonth(month);
    }
}
