package ms.financial.targets.accounts.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import ms.financial.targets.accounts.enums.Months;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document("balances")
public class Balance {
    @Id
    private String id;

    private String account;

    private Months month;

    private Integer year;

    private float value;
}
