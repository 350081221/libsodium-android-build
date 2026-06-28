package okhttp3;

import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import okio.n;
import p4.l;
import p4.m;

@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0016J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\"\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0017"}, d2 = {"Lokhttp3/WebSocketListener;", "", "Lokhttp3/WebSocket;", "webSocket", "Lokhttp3/Response;", "response", "Lkotlin/r2;", "onOpen", "", "text", "onMessage", "Lokio/n;", "bytes", "", PluginConstants.KEY_ERROR_CODE, MediationConstant.KEY_REASON, "onClosing", "onClosed", "", bi.aL, "onFailure", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public abstract class WebSocketListener {
    public void onClosed(@l WebSocket webSocket, int i5, @l String reason) {
        l0.p(webSocket, "webSocket");
        l0.p(reason, "reason");
    }

    public void onClosing(@l WebSocket webSocket, int i5, @l String reason) {
        l0.p(webSocket, "webSocket");
        l0.p(reason, "reason");
    }

    public void onFailure(@l WebSocket webSocket, @l Throwable t5, @m Response response) {
        l0.p(webSocket, "webSocket");
        l0.p(t5, "t");
    }

    public void onMessage(@l WebSocket webSocket, @l String text) {
        l0.p(webSocket, "webSocket");
        l0.p(text, "text");
    }

    public void onMessage(@l WebSocket webSocket, @l n bytes) {
        l0.p(webSocket, "webSocket");
        l0.p(bytes, "bytes");
    }

    public void onOpen(@l WebSocket webSocket, @l Response response) {
        l0.p(webSocket, "webSocket");
        l0.p(response, "response");
    }
}
