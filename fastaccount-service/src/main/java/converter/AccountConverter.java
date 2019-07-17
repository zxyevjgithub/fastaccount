package converter;

import model.AccountBO;
import model.AccountCommonRequest;

public class AccountConverter {


    public static AccountBO getAccBO(AccountCommonRequest accountCommonRequest) {


        return new AccountBO();
    }
}
