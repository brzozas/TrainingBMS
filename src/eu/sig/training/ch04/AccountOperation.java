package eu.sig.training.ch04;

import eu.sig.training.AccountNumberValidator;
import org.omg.CORBA.TRANSACTION_MODE;

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
