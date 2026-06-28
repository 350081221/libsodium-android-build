package u.dont.know.what.i.am;

import android.content.pm.ApplicationInfo;
import u.dont.know.what.i.am.j;
import u.dont.know.what.i.am.q;

/* loaded from: classes3.dex */
public abstract class p extends q implements c {

    /* loaded from: classes3.dex */
    public static final class a extends q.a {

        /* renamed from: c, reason: collision with root package name */
        public String f22545c;

        /* renamed from: d, reason: collision with root package name */
        public String f22546d;

        /* renamed from: e, reason: collision with root package name */
        public ClassLoader f22547e;

        /* renamed from: f, reason: collision with root package name */
        public ApplicationInfo f22548f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f22549g;

        public a(j.c<p> cVar) {
            super(cVar);
            this.f22545c = com.swift.sandhook.xcompat.a.packageName;
            this.f22546d = com.swift.sandhook.xcompat.a.processName;
            this.f22547e = com.swift.sandhook.xcompat.a.classLoader;
            this.f22548f = com.swift.sandhook.xcompat.a.context.getApplicationInfo();
            this.f22549g = com.swift.sandhook.xcompat.a.isFirstApplication;
        }
    }

    public p() {
    }

    @Override // u.dont.know.what.i.am.q
    protected void call(q.a aVar) throws Throwable {
        if (aVar instanceof a) {
            d((a) aVar);
        }
    }

    public p(int i5) {
        super(i5);
    }
}
