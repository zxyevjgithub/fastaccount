package service;

import com.alibaba.dubbo.rpc.RpcResult;
import converter.AccountConverter;
import lombok.extern.slf4j.Slf4j;
import mainpackage.AccountCommhandler;
import model.AccountCommonRequest;
import model.AccountCommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AccountAPIService implements AccountAPI {

    @Autowired
    private AccountCommhandler accountCommhandler;

    @Override
    public AccountCommonResult doAccount(AccountCommonRequest accountCommonRequest) {

        log.info("account begin");
        try {

            accountCommhandler.doProcess(AccountConverter.getAccBO(accountCommonRequest));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
