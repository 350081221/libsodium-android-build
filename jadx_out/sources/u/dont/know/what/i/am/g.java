package u.dont.know.what.i.am;

import java.lang.reflect.Member;
import java.util.Arrays;
import u.dont.know.what.i.am.q;

/* loaded from: classes3.dex */
public abstract class g extends q {

    /* loaded from: classes3.dex */
    public static final class a extends q.a {

        /* renamed from: c, reason: collision with root package name */
        public Member f22496c;

        /* renamed from: d, reason: collision with root package name */
        public Object f22497d;

        /* renamed from: e, reason: collision with root package name */
        public Object[] f22498e;

        /* renamed from: f, reason: collision with root package name */
        private Object f22499f = null;

        /* renamed from: g, reason: collision with root package name */
        private Throwable f22500g = null;

        /* renamed from: h, reason: collision with root package name */
        public boolean f22501h = false;

        public Object d() {
            return this.f22499f;
        }

        public Object e() throws Throwable {
            Throwable th = this.f22500g;
            if (th == null) {
                return this.f22499f;
            }
            throw th;
        }

        public Throwable f() {
            return this.f22500g;
        }

        public boolean g() {
            return this.f22500g != null;
        }

        public void h(Object obj) {
            this.f22499f = obj;
            this.f22500g = null;
            this.f22501h = true;
        }

        public void i(Throwable th) {
            this.f22500g = th;
            this.f22499f = null;
            this.f22501h = true;
        }

        public String toString() {
            return "MethodHookParam{method=" + this.f22496c + ", thisObject=" + this.f22497d + ", args=" + Arrays.toString(this.f22498e) + ", result=" + this.f22499f + ", throwable=" + this.f22500g + ", returnEarly=" + this.f22501h + '}';
        }
    }

    /* loaded from: classes3.dex */
    public class b implements m<g> {

        /* renamed from: a, reason: collision with root package name */
        private final Member f22502a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Member member) {
            this.f22502a = member;
        }

        @Override // u.dont.know.what.i.am.m
        public void a() {
            j.o(this.f22502a, g.this);
        }

        @Override // u.dont.know.what.i.am.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public g b() {
            return g.this;
        }

        public Member d() {
            return this.f22502a;
        }
    }

    public g() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void afterHookedMethod(a aVar) throws Throwable {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void beforeHookedMethod(a aVar) throws Throwable {
    }

    public void callAfterHookedMethod(a aVar) throws Throwable {
        afterHookedMethod(aVar);
    }

    public void callBeforeHookedMethod(a aVar) throws Throwable {
        beforeHookedMethod(aVar);
    }

    public g(int i5) {
        super(i5);
    }
}
