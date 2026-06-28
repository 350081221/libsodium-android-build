package okhttp3;

import com.bytedance.android.live.base.api.push.ILivePush;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import kotlin.i0;
import okio.n;
import p4.l;
import p4.m;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0012J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&J\u001a\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0013"}, d2 = {"Lokhttp3/WebSocket;", "", "Lokhttp3/Request;", "request", "", "queueSize", "", "text", "", "send", "Lokio/n;", "bytes", "", PluginConstants.KEY_ERROR_CODE, MediationConstant.KEY_REASON, ILivePush.ClickType.CLOSE, "Lkotlin/r2;", "cancel", "Factory", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface WebSocket {

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lokhttp3/WebSocket$Factory;", "", "newWebSocket", "Lokhttp3/WebSocket;", "request", "Lokhttp3/Request;", "listener", "Lokhttp3/WebSocketListener;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface Factory {
        @l
        WebSocket newWebSocket(@l Request request, @l WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i5, @m String str);

    long queueSize();

    @l
    Request request();

    boolean send(@l String str);

    boolean send(@l n nVar);
}
