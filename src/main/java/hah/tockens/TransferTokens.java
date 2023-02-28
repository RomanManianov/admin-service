package hah.tockens;

import java.util.*;

public class TransferTokens {

    private Map<String, TokenAccount> accountMap = new HashMap<>();

    public void createTokenAccount() {
        String accountNumber = "";
        for (int j = 0; j < 10; j++) {
            Random r = new Random();
            String eng = "abcdefghijklmnopqrstuvwxyz";
            String dig = "0123456789";
            String sum = eng + eng.toUpperCase() +
                    dig;
            char c;
            c = sum.charAt(r.nextInt(sum.length()));
            accountNumber += c;
        }
        Map<String, TokensTransaction> transactions = new HashMap<>();
        TokenAccount tokenAccount = new TokenAccount(accountNumber, 0, false, transactions);
        accountMap.put(accountNumber, tokenAccount);
    }

    public synchronized void transfer(String fromAccountNumber, String toAccountNumber, long amountTokens) {
        if (accountMap.get(fromAccountNumber).isBlocked() == true) {
            System.out.println("Error, token account: " + fromAccountNumber + "is blocked");
        }
        if (accountMap.get(toAccountNumber).isBlocked() == true) {
            System.out.println("Error, token account: " + toAccountNumber + "is blocked");
        }
        if (accountMap.get(fromAccountNumber).getAmountTokens() < amountTokens
                && accountMap.get(fromAccountNumber).isBlocked() == false
                && accountMap.get(toAccountNumber).isBlocked() == false) {
            System.out.println("Error, token balance account: " + fromAccountNumber + " = " + accountMap.get(fromAccountNumber).getAmountTokens());
        }
        if ((accountMap.get(fromAccountNumber).getAmountTokens() > amountTokens
                && accountMap.get(fromAccountNumber).isBlocked() == false
                && accountMap.get(toAccountNumber).isBlocked() == false)) {
            String transactionNum = "";
            Date date = new Date();
            for (int j = 0; j < 10; j++) {
                Random r = new Random();
                String eng = "abcdefghijklmnopqrstuvwxyz";
                String dig = "0123456789";
                String sum = eng + eng.toUpperCase() +
                        dig;
                char c;
                c = sum.charAt(r.nextInt(sum.length()));
                transactionNum += c;
            }

            TokensTransaction tokensTransaction = new TokensTransaction(transactionNum, date, fromAccountNumber, toAccountNumber, amountTokens);
            accountMap.get(fromAccountNumber).setAmountTokens(accountMap.get(fromAccountNumber).getAmountTokens() - amountTokens);
            accountMap.get(fromAccountNumber).getTransactions().put(transactionNum, tokensTransaction);

            System.out.println("transaction: " + transactionNum + "created, balance from: " + fromAccountNumber + " - "
                    + accountMap.get(fromAccountNumber).getAmountTokens() + "\n balance to " + toAccountNumber + " - "
                    + accountMap.get(toAccountNumber).getAmountTokens());

            System.out.println();

            accountMap.get(toAccountNumber).setAmountTokens(accountMap.get(toAccountNumber).getAmountTokens() + amountTokens);
            accountMap.get(toAccountNumber).getTransactions().put(transactionNum, tokensTransaction);
        }
    }

    public synchronized void blockedTokenAccount(String accountNum) {
        if (!accountMap.containsKey(accountNum)) {
            System.out.println("Error, accountNum " + accountNum + " not found");
        } else {
            accountMap.get(accountNum).setBlocked(true);
            System.out.println("account: " + accountNum + " blocked");
        }
    }

    public synchronized void unBlockedTokenAccount(String accountNum) {
        if (!accountMap.containsKey(accountNum)) {
            System.out.println("Error, accountNum " + accountNum + " not found");
        } else {
            accountMap.get(accountNum).setBlocked(false);
            System.out.println("account: " + accountNum + " unlocked");
        }
    }

    public synchronized String getTransactionHistory(String accountNum) {
        if(!accountMap.containsKey(accountNum)) {
            System.out.println("Eror, accountNum " + accountNum + " not found");
        }
        ArrayList<String> keySet = new ArrayList<>();
        String transactionHistory = "";
        for (String key : accountMap.get(accountNum).getTransactions().keySet()) {
            transactionHistory += "Transactions num: " + accountMap.get(accountNum).getTransactions().get(key).getTransactionsNum() + "\n" +
                    "transactions date: " + accountMap.get(accountNum).getTransactions().get(key).getTransactionDate() + "\n" +
                    "transactions from: " + accountMap.get(accountNum).getTransactions().get(key).getFromAccountNum() + "\n" +
                    "transactions to: " + accountMap.get(accountNum).getTransactions().get(key).getToAccountNum() + "\n" +
                    "amount tokens transactions: " + accountMap.get(accountNum).getTransactions().get(key).getAmountTransactionTokens() + "\n" +
                    "-------------------------------------------------------------------------------------------------------";
        }
        return transactionHistory;
    }
}
