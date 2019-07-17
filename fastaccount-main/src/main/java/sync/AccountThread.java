package sync;

import model.AccountBO;

public class AccountThread implements Runnable {

    private AccountBO accountBO;

    private SyncHandler syncHandler;

    public AccountThread(AccountBO accountBO, SyncHandler syncHandler) {
        this.accountBO = accountBO;
        this.syncHandler = syncHandler;
    }

    @Override
    public void run() {
        syncHandler.sncyProcess(accountBO);
    }
}
