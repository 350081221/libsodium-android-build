package com.huawei.hms.hatool;

import java.util.Calendar;
import java.util.UUID;

/* loaded from: classes3.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public long f8540a = 1800000;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f8541b = false;

    /* renamed from: c, reason: collision with root package name */
    public a f8542c = null;

    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public String f8543a = UUID.randomUUID().toString().replace("-", "");

        /* renamed from: b, reason: collision with root package name */
        public boolean f8544b;

        /* renamed from: c, reason: collision with root package name */
        public long f8545c;

        public a(long j5) {
            this.f8543a += "_" + j5;
            this.f8545c = j5;
            this.f8544b = true;
            f0.this.f8541b = false;
        }

        public void a(long j5) {
            if (f0.this.f8541b) {
                f0.this.f8541b = false;
                b(j5);
            } else if (b(this.f8545c, j5) || a(this.f8545c, j5)) {
                b(j5);
            } else {
                this.f8545c = j5;
                this.f8544b = false;
            }
        }

        public final boolean a(long j5, long j6) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j5);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j6);
            return (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) ? false : true;
        }

        public final void b(long j5) {
            y.c("hmsSdk", "getNewSession() session is flush!");
            String uuid = UUID.randomUUID().toString();
            this.f8543a = uuid;
            this.f8543a = uuid.replace("-", "");
            this.f8543a += "_" + j5;
            this.f8545c = j5;
            this.f8544b = true;
        }

        public final boolean b(long j5, long j6) {
            return j6 - j5 >= f0.this.f8540a;
        }
    }

    public String a() {
        a aVar = this.f8542c;
        if (aVar != null) {
            return aVar.f8543a;
        }
        y.f("hmsSdk", "getSessionName(): session not prepared. onEvent() must be called first.");
        return "";
    }

    public void a(long j5) {
        a aVar = this.f8542c;
        if (aVar != null) {
            aVar.a(j5);
        } else {
            y.c("hmsSdk", "Session is first flush");
            this.f8542c = new a(j5);
        }
    }

    public boolean b() {
        a aVar = this.f8542c;
        if (aVar != null) {
            return aVar.f8544b;
        }
        y.f("hmsSdk", "isFirstEvent(): session not prepared. onEvent() must be called first.");
        return false;
    }
}
