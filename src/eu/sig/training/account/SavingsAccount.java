package eu.sig.training.account;

// tag::SavingsAccount[]
public class SavingsAccount extends AccountOperation {
    CheckingAccount registeredCounterAccount;


    @Override
    protected void preValidation(final String counterAccount, final Money amount) throws BusinessException {

    }

    protected Transfer doTransfer(String counterAccount, Money amount) throws BusinessException {
        // 2. Look up counter account and make transfer object:
        CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
        Transfer result = new Transfer(this, acct, amount); // <2>
        // 3. Check whether withdrawal is to registered counter account:
        if (result.getCounterAccount().equals(this.registeredCounterAccount))
        {
            return result;
        } else {
            throw new BusinessException("Counter-account not registered!");
        }
    }
}
// end::SavingsAccount[]
