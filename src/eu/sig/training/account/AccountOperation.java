package eu.sig.training.account;

public abstract class AccountOperation {

    public final Transfer makeTransfer(String counterAccount, Money amount)
            throws BusinessException {
        AccountNumberValidator.validate(counterAccount);
        preValidation(counterAccount, amount);
        return doTransfer(counterAccount, amount);
    }

    protected abstract void preValidation(String counterAccount, Money amount) throws BusinessException;

    protected abstract Transfer doTransfer(String counterAccount, Money amount) throws BusinessException;

}
