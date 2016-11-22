package eu.sig.training.account;

// tag::CheckingAccount[]
public class CheckingAccount extends AccountOperation {
    private int transferLimit = 100;


    private void checkLimit(Money amount) throws BusinessException {
        if (amount.greaterThan(this.transferLimit)) {
            throw new BusinessException("Limit exceeded!");
        }
    }

    @Override
    protected void preValidation(final String counterAccount, final Money amount) throws BusinessException {
        checkLimit(amount);
    }

    @Override
    protected Transfer doTransfer(String counterAccount, Money amount) {
        CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
        Transfer result = new Transfer(this, acct, amount);
        return result;
    }

}
// end::CheckingAccount[]
