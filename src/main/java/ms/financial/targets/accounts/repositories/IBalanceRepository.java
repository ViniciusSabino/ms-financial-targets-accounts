package ms.financial.targets.accounts.repositories;

import ms.financial.targets.accounts.enums.Months;
import ms.financial.targets.accounts.models.Balance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface IBalanceRepository extends MongoRepository<Balance, String> {

    @Query(value = "{ 'month' : ?0 }")
    List<Balance> getBalancesByMonth(Months month);
}