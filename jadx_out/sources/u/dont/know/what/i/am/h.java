package u.dont.know.what.i.am;

import u.dont.know.what.i.am.g;

/* loaded from: classes3.dex */
public abstract class h extends g {
    public static final h DO_NOTHING = new a(20000);

    /* loaded from: classes3.dex */
    class a extends h {
        a(int i5) {
            super(i5);
        }

        protected Object e(g.a aVar) throws Throwable {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends h {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f22504b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i5, Object obj) {
            super(i5);
            this.f22504b = obj;
        }

        protected Object e(g.a aVar) throws Throwable {
            return this.f22504b;
        }
    }

    public h() {
    }

    public static h returnConstant(Object obj) {
        return returnConstant(50, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u.dont.know.what.i.am.g
    public final void afterHookedMethod(g.a aVar) throws Throwable {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u.dont.know.what.i.am.g
    public final void beforeHookedMethod(g.a aVar) throws Throwable {
        try {
            aVar.h(replaceHookedMethod(aVar));
        } catch (Throwable th) {
            aVar.i(th);
        }
    }

    protected abstract Object replaceHookedMethod(g.a aVar) throws Throwable;

    public h(int i5) {
        super(i5);
    }

    public static h returnConstant(int i5, Object obj) {
        return new b(i5, obj);
    }
}
