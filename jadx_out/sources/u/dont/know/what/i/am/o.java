package u.dont.know.what.i.am;

import android.view.View;
import u.dont.know.what.i.am.j;
import u.dont.know.what.i.am.q;

/* loaded from: classes3.dex */
public abstract class o extends q {

    /* loaded from: classes3.dex */
    public static final class a extends q.a {

        /* renamed from: c, reason: collision with root package name */
        public View f22541c;

        public a(j.c<o> cVar) {
            super(cVar);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements m<o> {

        /* renamed from: a, reason: collision with root package name */
        private final String f22542a;

        /* renamed from: b, reason: collision with root package name */
        private final int f22543b;

        public b(String str, int i5) {
            this.f22542a = str;
            this.f22543b = i5;
        }

        @Override // u.dont.know.what.i.am.m
        public void a() {
        }

        @Override // u.dont.know.what.i.am.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public o b() {
            return o.this;
        }

        public int d() {
            return this.f22543b;
        }
    }

    public o() {
    }

    @Override // u.dont.know.what.i.am.q
    protected void call(q.a aVar) throws Throwable {
        if (aVar instanceof a) {
            e((a) aVar);
        }
    }

    public abstract void e(a aVar) throws Throwable;

    public o(int i5) {
        super(i5);
    }
}
