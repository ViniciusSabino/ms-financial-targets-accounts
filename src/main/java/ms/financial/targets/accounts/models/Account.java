package ms.financial.targets.accounts.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import ms.financial.targets.accounts.enums.AccountType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document("accounts")
public class Account {

    @Id
    private String id;

    private String name;

    private AccountType type;

    private boolean isMain;

    private String userId;
}
