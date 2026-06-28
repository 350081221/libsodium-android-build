package org.greenrobot.greendao.test;

import android.app.Application;
import android.app.Instrumentation;
import android.database.sqlite.SQLiteDatabase;
import android.test.AndroidTestCase;
import java.util.Random;

/* loaded from: classes4.dex */
public abstract class f extends AndroidTestCase {

    /* renamed from: e, reason: collision with root package name */
    public static final String f21517e = "greendao-unittest-db.temp";

    /* renamed from: a, reason: collision with root package name */
    protected final Random f21518a;

    /* renamed from: b, reason: collision with root package name */
    protected final boolean f21519b;

    /* renamed from: c, reason: collision with root package name */
    protected org.greenrobot.greendao.database.a f21520c;

    /* renamed from: d, reason: collision with root package name */
    private Application f21521d;

    public f() {
        this(true);
    }

    public <T extends Application> T a(Class<T> cls) {
        AndroidTestCase.assertNull("Application already created", this.f21521d);
        try {
            T t5 = (T) Instrumentation.newApplication(cls, getContext());
            t5.onCreate();
            this.f21521d = t5;
            return t5;
        } catch (Exception e5) {
            throw new RuntimeException("Could not create application " + cls, e5);
        }
    }

    protected org.greenrobot.greendao.database.a b() {
        SQLiteDatabase openOrCreateDatabase;
        if (this.f21519b) {
            openOrCreateDatabase = SQLiteDatabase.create(null);
        } else {
            getContext().deleteDatabase(f21517e);
            openOrCreateDatabase = getContext().openOrCreateDatabase(f21517e, 0, null);
        }
        return new org.greenrobot.greendao.database.f(openOrCreateDatabase);
    }

    public <T extends Application> T c() {
        AndroidTestCase.assertNotNull("Application not yet created", this.f21521d);
        return (T) this.f21521d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(String str) {
        org.greenrobot.greendao.database.a aVar = this.f21520c;
        if (aVar instanceof org.greenrobot.greendao.database.f) {
            org.greenrobot.greendao.f.f(((org.greenrobot.greendao.database.f) aVar).c(), str);
            return;
        }
        org.greenrobot.greendao.e.l("Table dump unsupported for " + this.f21520c);
    }

    public void e() {
        AndroidTestCase.assertNotNull("Application not yet created", this.f21521d);
        this.f21521d.onTerminate();
        this.f21521d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setUp() throws Exception {
        super.setUp();
        this.f21520c = b();
    }

    protected void tearDown() throws Exception {
        if (this.f21521d != null) {
            e();
        }
        this.f21520c.close();
        if (!this.f21519b) {
            getContext().deleteDatabase(f21517e);
        }
        super.tearDown();
    }

    public f(boolean z4) {
        this.f21519b = z4;
        this.f21518a = new Random();
    }
}
