package api;

import model.AccountCommonRequest;
import model.AccountCommonResult;

/**
 * 账户记账接口
 */
public interface AccountAPI {


    /**
     * 支持复杂传票处理，复杂流水处理
     * @param accountCommonRequest
     * @return
     */
    public AccountCommonResult doAccount(AccountCommonRequest accountCommonRequest)  ;
}
