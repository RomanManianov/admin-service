package hah.tockens;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
@Data
@AllArgsConstructor
public class TokensTransaction {
    //todo: переделать согласно задаче, вынести сущность в пакет с сущностями
    private String transactionsNum;
    private Date transactionDate;
    private String fromAccountNum;
    private String toAccountNum;
    private long amountTransactionTokens;
}
