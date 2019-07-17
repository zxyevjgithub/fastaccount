package mainpackage;

import mainpackage.pool.ThreadPoolFactory;
import model.AccountBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import sync.AccountThread;
import sync.SyncHandler;

import java.util.concurrent.ExecutorService;

@Service
public class AccountCommhandler implements BaseProcessHandler {

    @Autowired
    SyncHandler snycCommHandler;

    @Override
    public AccountBO doProcess(AccountBO o) {

        AccountBO bo = o;
        ThreadPoolFactory.tradepool.submit(new AccountThread(bo, snycCommHandler));
        return bo;
    }
}
