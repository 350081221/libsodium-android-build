package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class CursorWindowCompat {

    @RequiresApi(28)
    /* loaded from: classes2.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        static CursorWindow createCursorWindow(String str, long j5) {
            return new CursorWindow(str, j5);
        }
    }

    private CursorWindowCompat() {
    }

    @NonNull
    public static CursorWindow create(@Nullable String str, long j5) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.createCursorWindow(str, j5);
        }
        return new CursorWindow(str);
    }
}
