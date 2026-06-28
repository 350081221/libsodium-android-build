package u.dont.know.what.i.am;

import android.os.Bundle;
import java.io.Serializable;
import u.dont.know.what.i.am.j;

/* loaded from: classes3.dex */
public abstract class q implements Comparable<q> {
    public static final int PRIORITY_DEFAULT = 50;
    public static final int PRIORITY_HIGHEST = 10000;
    public static final int PRIORITY_LOWEST = -10000;
    public final int priority;

    @Deprecated
    public q() {
        this.priority = 50;
    }

    public static void callAll(a aVar) {
        if (aVar.f22550a != null) {
            int i5 = 0;
            while (true) {
                Object[] objArr = aVar.f22550a;
                if (i5 < objArr.length) {
                    try {
                        ((q) objArr[i5]).call(aVar);
                    } catch (Throwable th) {
                        j.m(th);
                    }
                    i5++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("This object was not created for use with callAll");
        }
    }

    protected void call(a aVar) throws Throwable {
    }

    /* loaded from: classes3.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object[] f22550a;

        /* renamed from: b, reason: collision with root package name */
        private Bundle f22551b;

        /* renamed from: u.dont.know.what.i.am.q$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static class C0663a implements Serializable {
            private static final long serialVersionUID = 1;
            private final Object object;

            public C0663a(Object obj) {
                this.object = obj;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Deprecated
        public a() {
            this.f22550a = null;
        }

        public synchronized Bundle a() {
            if (this.f22551b == null) {
                this.f22551b = new Bundle();
            }
            return this.f22551b;
        }

        public Object b(String str) {
            Serializable serializable = a().getSerializable(str);
            if (serializable instanceof C0663a) {
                return ((C0663a) serializable).object;
            }
            return null;
        }

        public void c(String str, Object obj) {
            a().putSerializable(str, new C0663a(obj));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a(j.c<? extends q> cVar) {
            this.f22550a = cVar.b();
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(q qVar) {
        if (this == qVar) {
            return 0;
        }
        int i5 = qVar.priority;
        int i6 = this.priority;
        return i5 != i6 ? i5 - i6 : System.identityHashCode(this) < System.identityHashCode(qVar) ? -1 : 1;
    }

    public q(int i5) {
        this.priority = i5;
    }
}
