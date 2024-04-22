package ms.financial.targets.accounts.models.Documents;

import lombok.AllArgsConstructor;
import lombok.Data;
import ms.financial.targets.accounts.enums.Months;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Data
@AllArgsConstructor
@Document("balances")
public class Balance {
    @Id
    private String id;

    @DocumentReference
    private Account account;

    private Months month;

    private Integer year;

    private float value;
}
