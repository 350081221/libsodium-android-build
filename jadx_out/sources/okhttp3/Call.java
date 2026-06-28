package okhttp3;

import java.io.IOException;
import kotlin.i0;
import okio.p1;
import p4.l;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0011J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u0000H&¨\u0006\u0012"}, d2 = {"Lokhttp3/Call;", "", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "execute", "Lokhttp3/Callback;", "responseCallback", "Lkotlin/r2;", "enqueue", "cancel", "", "isExecuted", "isCanceled", "Lokio/p1;", m0.a.Z, "clone", "Factory", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface Call extends Cloneable {

    @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lokhttp3/Call$Factory;", "", "newCall", "Lokhttp3/Call;", "request", "Lokhttp3/Request;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface Factory {
        @l
        Call newCall(@l Request request);
    }

    void cancel();

    @l
    /* renamed from: clone */
    Call mo6431clone();

    void enqueue(@l Callback callback);

    @l
    Response execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    @l
    Request request();

    @l
    p1 timeout();
}
