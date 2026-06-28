package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\b\u001a\u00020\tH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lokio/SocketAsyncTimeout;", "Lokio/AsyncTimeout;", "socket", "Ljava/net/Socket;", "(Ljava/net/Socket;)V", "newTimeoutException", "Ljava/io/IOException;", "cause", "timedOut", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m1 extends j {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final Socket f20998a;

    public m1(@p4.l Socket socket2) {
        kotlin.jvm.internal.l0.p(socket2, "socket");
        this.f20998a = socket2;
    }

    @Override // okio.j
    @p4.l
    protected IOException newTimeoutException(@p4.m IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(m0.a.Z);
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // okio.j
    protected void timedOut() {
        Logger logger;
        Logger logger2;
        try {
            this.f20998a.close();
        } catch (AssertionError e5) {
            if (y0.l(e5)) {
                logger2 = z0.f21064a;
                logger2.log(Level.WARNING, "Failed to close timed out socket " + this.f20998a, (Throwable) e5);
                return;
            }
            throw e5;
        } catch (Exception e6) {
            logger = z0.f21064a;
            logger.log(Level.WARNING, "Failed to close timed out socket " + this.f20998a, (Throwable) e6);
        }
    }
}
