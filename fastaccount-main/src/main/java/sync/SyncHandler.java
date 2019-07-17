package sync;

import model.AccountBO;

public interface SyncHandler<D extends AccountBO> {

    void sncyProcess(D d);

}
