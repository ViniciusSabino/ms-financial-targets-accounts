package ms.financial.targets.accounts.models;

import lombok.Builder;
import lombok.Data;
import ms.financial.targets.accounts.enums.Months;

import java.util.List;

@Data
@Builder
public class CurrentBalances {

    private Months month;

    private Integer year;

    private List<Balance> accounts;

    private List<Balance> investments;
}
