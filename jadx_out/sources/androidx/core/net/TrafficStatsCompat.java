package androidx.core.net;

import android.net.TrafficStats;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

/* loaded from: classes2.dex */
public final class TrafficStatsCompat {

    @RequiresApi(24)
    /* loaded from: classes2.dex */
    static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static void tagDatagramSocket(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.tagDatagramSocket(datagramSocket);
        }

        @DoNotInline
        static void untagDatagramSocket(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.untagDatagramSocket(datagramSocket);
        }
    }

    private TrafficStatsCompat() {
    }

    @Deprecated
    public static void clearThreadStatsTag() {
        TrafficStats.clearThreadStatsTag();
    }

    @Deprecated
    public static int getThreadStatsTag() {
        return TrafficStats.getThreadStatsTag();
    }

    @Deprecated
    public static void incrementOperationCount(int i5) {
        TrafficStats.incrementOperationCount(i5);
    }

    @Deprecated
    public static void setThreadStatsTag(int i5) {
        TrafficStats.setThreadStatsTag(i5);
    }

    public static void tagDatagramSocket(@NonNull DatagramSocket datagramSocket) throws SocketException {
        Api24Impl.tagDatagramSocket(datagramSocket);
    }

    @Deprecated
    public static void tagSocket(Socket socket2) throws SocketException {
        TrafficStats.tagSocket(socket2);
    }

    public static void untagDatagramSocket(@NonNull DatagramSocket datagramSocket) throws SocketException {
        Api24Impl.untagDatagramSocket(datagramSocket);
    }

    @Deprecated
    public static void untagSocket(Socket socket2) throws SocketException {
        TrafficStats.untagSocket(socket2);
    }

    @Deprecated
    public static void incrementOperationCount(int i5, int i6) {
        TrafficStats.incrementOperationCount(i5, i6);
    }
}
