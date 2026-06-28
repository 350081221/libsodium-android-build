package retrofit2;

import java.io.IOException;
import okhttp3.Request;
import okio.p1;

/* loaded from: classes4.dex */
public interface Call<T> extends Cloneable {
    void cancel();

    Call<T> clone();

    void enqueue(Callback<T> callback);

    Response<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    p1 timeout();
}
