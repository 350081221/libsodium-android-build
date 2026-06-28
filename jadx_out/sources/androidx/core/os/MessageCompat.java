package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Message;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class MessageCompat {
    private static boolean sTryIsAsynchronous = true;
    private static boolean sTrySetAsynchronous = true;

    @RequiresApi(22)
    /* loaded from: classes2.dex */
    static class Api22Impl {
        private Api22Impl() {
        }

        @DoNotInline
        static boolean isAsynchronous(Message message) {
            return message.isAsynchronous();
        }

        @DoNotInline
        static void setAsynchronous(Message message, boolean z4) {
            message.setAsynchronous(z4);
        }
    }

    private MessageCompat() {
    }

    @SuppressLint({"NewApi"})
    public static boolean isAsynchronous(@NonNull Message message) {
        return Api22Impl.isAsynchronous(message);
    }

    @SuppressLint({"NewApi"})
    public static void setAsynchronous(@NonNull Message message, boolean z4) {
        Api22Impl.setAsynchronous(message, z4);
    }
}
