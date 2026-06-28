package okhttp3.internal.cache;

import com.bytedance.android.live.base.api.push.ILivePush;
import java.io.IOException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import okio.l1;
import okio.w;
import p4.l;

@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Lokio/w;", "Lokio/l;", "source", "", "byteCount", "Lkotlin/r2;", "write", "flush", ILivePush.ClickType.CLOSE, "Lkotlin/Function1;", "Ljava/io/IOException;", "onException", "Lv3/l;", "getOnException", "()Lv3/l;", "", "hasErrors", "Z", "Lokio/l1;", "delegate", "<init>", "(Lokio/l1;Lv3/l;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public class FaultHidingSink extends w {
    private boolean hasErrors;

    @l
    private final v3.l<IOException, r2> onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(@l l1 delegate, @l v3.l<? super IOException, r2> onException) {
        super(delegate);
        l0.p(delegate, "delegate");
        l0.p(onException, "onException");
        this.onException = onException;
    }

    @Override // okio.w, okio.l1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e5) {
            this.hasErrors = true;
            this.onException.invoke(e5);
        }
    }

    @Override // okio.w, okio.l1, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e5) {
            this.hasErrors = true;
            this.onException.invoke(e5);
        }
    }

    @l
    public final v3.l<IOException, r2> getOnException() {
        return this.onException;
    }

    @Override // okio.w, okio.l1
    public void write(@l okio.l source, long j5) {
        l0.p(source, "source");
        if (this.hasErrors) {
            source.skip(j5);
            return;
        }
        try {
            super.write(source, j5);
        } catch (IOException e5) {
            this.hasErrors = true;
            this.onException.invoke(e5);
        }
    }
}
