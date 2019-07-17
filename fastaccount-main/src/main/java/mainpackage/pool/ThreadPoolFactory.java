package mainpackage.pool;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.concurrent.*;

@Service
public class ThreadPoolFactory {

    public static ExecutorService tradepool = null;

    @PostConstruct
    public void init() {
        tradepool = this.getExcutor();

    }


    public static ExecutorService getExcutor() {


        return new ThreadPoolExecutor(10, 30,
                300L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());

    }
}
