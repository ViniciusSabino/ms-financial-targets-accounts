package ms.financial.targets.accounts.models;

import ms.financial.targets.accounts.enums.AccountType;

public class Account {
    private Integer id;
    private String name;
    private AccountType type;
    private boolean isMain;
    private String userId;

    public Account(Integer id, String name, AccountType type, boolean isMain, String userId) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.isMain = isMain;
        this.userId = userId;
    }
}
