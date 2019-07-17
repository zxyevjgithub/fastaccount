package sync;

import model.AccountBO;
import org.springframework.stereotype.Service;

@Service
public class SnycCommHandler implements SyncHandler<AccountBO> {
    @Override
    public void sncyProcess(AccountBO accountBO) {

    }
}
