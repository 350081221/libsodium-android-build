package com.huawei.hms.analytics.framework.e;

import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.framework.b.c;
import com.tendcloud.tenddata.ab;
import java.util.Calendar;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public long f8272a = 1800000;

    /* renamed from: b, reason: collision with root package name */
    public long f8273b = ab.aa;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f8274c = false;

    /* renamed from: d, reason: collision with root package name */
    public volatile long f8275d = 0;

    /* renamed from: e, reason: collision with root package name */
    private a f8276e = null;

    /* loaded from: classes3.dex */
    class a {

        /* renamed from: a, reason: collision with root package name */
        String f8277a = UUID.randomUUID().toString().replace("-", "");

        /* renamed from: b, reason: collision with root package name */
        boolean f8278b;

        /* renamed from: d, reason: collision with root package name */
        private long f8280d;

        a(long j5) {
            this.f8277a += "_" + j5;
            this.f8280d = j5;
            this.f8278b = true;
            b.this.f8274c = false;
        }

        private void a(long j5) {
            HiLog.i("SessionKeeper", "getNewSession() session is flush!");
            String uuid = UUID.randomUUID().toString();
            this.f8277a = uuid;
            this.f8277a = uuid.replace("-", "");
            this.f8277a += "_" + j5;
            this.f8280d = j5;
            this.f8278b = true;
        }

        private static boolean a(long j5, long j6) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j5);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j6);
            return (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) ? false : true;
        }

        private boolean b(long j5, long j6) {
            return j6 - j5 >= b.this.f8272a;
        }

        final void a(String str, long j5) {
            c b5 = com.huawei.hms.analytics.framework.b.b.a().b(str);
            if (b5 != null && b5.f8208a) {
                b5.f8208a = false;
                a(j5);
                return;
            }
            if (b.this.f8274c) {
                long j6 = j5 - b.this.f8275d;
                b bVar = b.this;
                if (j6 > bVar.f8273b) {
                    bVar.f8274c = false;
                    b.this.f8275d = 0L;
                    a(j5);
                    return;
                }
            }
            if (b(this.f8280d, j5) || a(this.f8280d, j5)) {
                a(j5);
            } else {
                this.f8280d = j5;
                this.f8278b = false;
            }
        }
    }

    public final String a() {
        a aVar = this.f8276e;
        if (aVar != null) {
            return aVar.f8277a;
        }
        HiLog.w("SessionKeeper", "getSessionName(): session not prepared. onEvent() must be called first.");
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, long j5) {
        a aVar = this.f8276e;
        if (aVar != null) {
            aVar.a(str, j5);
        } else {
            HiLog.i("SessionKeeper", "Session is first flush");
            this.f8276e = new a(j5);
        }
    }

    public final boolean b() {
        a aVar = this.f8276e;
        if (aVar != null) {
            return aVar.f8278b;
        }
        HiLog.w("SessionKeeper", "isFirstEvent(): session not prepared. onEvent() must be called first.");
        return false;
    }
}
