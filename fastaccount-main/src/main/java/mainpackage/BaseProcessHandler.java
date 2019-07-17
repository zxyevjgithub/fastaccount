package mainpackage;

import model.AccountBO;

public interface BaseProcessHandler<D extends AccountBO> {

    AccountBO doProcess(AccountBO accountBO);
}
