package org.greenrobot.greendao;

import android.database.SQLException;

/* loaded from: classes4.dex */
public class d extends SQLException {
    private static final long serialVersionUID = -5877937327907457779L;

    public d() {
    }

    protected void safeInitCause(Throwable th) {
        try {
            initCause(th);
        } catch (Throwable th2) {
            e.d("Could not set initial cause", th2);
            e.d("Initial cause is:", th);
        }
    }

    public d(String str) {
        super(str);
    }

    public d(String str, Throwable th) {
        super(str);
        safeInitCause(th);
    }

    public d(Throwable th) {
        safeInitCause(th);
    }
}
