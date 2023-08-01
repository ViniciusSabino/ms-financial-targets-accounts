package ms.financial.targets.accounts.models;

import ms.financial.targets.accounts.enums.AccountBalanceType;
import ms.financial.targets.accounts.enums.Months;

// TODO: verificar se herdando de Account é a melhor maneira para reaproveitar propriedades de uma Conta
public class AccountBalance {
    private String id;
    private String accountId;
    private String name;
    private AccountBalanceType type;
    private Float value;
    private boolean isMain;
    private Months month;
    private Integer year;

}
