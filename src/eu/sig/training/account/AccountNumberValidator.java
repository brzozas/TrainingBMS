package eu.sig.training;

import eu.sig.training.account.BusinessException;

public class AccountNumberValidator {

    public static void validate(String counterAccount) throws BusinessException {
        int sum = 0;
        for (int i = 0; i < counterAccount.length(); i++) {
            sum = sum + (9-i) * Character.getNumericValue(
                    counterAccount.charAt(i));
        }
        if (sum % 11 == 0) {
            // 3. Look up counter account and make transfer object:
            return;
        } else {
            throw new BusinessException("Invalid account number!");
        }
    }
}
