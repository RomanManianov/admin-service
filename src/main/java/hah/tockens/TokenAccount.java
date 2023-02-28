package hah.tockens;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;
@Data
@AllArgsConstructor
public class TokenAccount {

    private String numberAccount;
    private long amountTokens;
    private boolean isBlocked;
    private Map<String, TokensTransaction> transactions;
}
