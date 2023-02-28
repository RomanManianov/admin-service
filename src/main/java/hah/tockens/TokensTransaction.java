package hah.tockens;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
@Data
@AllArgsConstructor
public class TokensTransaction {
    private String transactionsNum;
    private Date transactionDate;
    private String fromAccountNum;
    private String toAccountNum;
    private long amountTransactionTokens;
}
