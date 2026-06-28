package kotlinx.coroutines.channels;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import kotlin.a1;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.g2;

@kotlin.i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087@\u0018\u0000  *\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0013 \u001fB\u0016\b\u0001\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019\u0088\u0001\u0017\u0092\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lkotlinx/coroutines/channels/p;", "T", "", bi.aJ, "(Ljava/lang/Object;)Ljava/lang/Object;", "i", "", "f", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "n", "(Ljava/lang/Object;)Ljava/lang/String;", "", "j", "(Ljava/lang/Object;)I", "other", "", "d", "(Ljava/lang/Object;Ljava/lang/Object;)Z", bi.ay, "Ljava/lang/Object;", "getHolder$annotations", "()V", "holder", "m", "(Ljava/lang/Object;)Z", "isSuccess", "l", "isFailure", "k", "isClosed", "c", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@u3.f
/* loaded from: classes4.dex */
public final class p<T> {

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    public static final b f19939b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private static final c f19940c = new c();

    /* renamed from: a, reason: collision with root package name */
    @p4.m
    private final Object f19941a;

    @kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/channels/p$a;", "Lkotlinx/coroutines/channels/p$c;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "", bi.ay, "Ljava/lang/Throwable;", "cause", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        @p4.m
        @u3.e
        public final Throwable f19942a;

        public a(@p4.m Throwable th) {
            this.f19942a = th;
        }

        public boolean equals(@p4.m Object obj) {
            return (obj instanceof a) && l0.g(this.f19942a, ((a) obj).f19942a);
        }

        public int hashCode() {
            Throwable th = this.f19942a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.p.c
        @p4.l
        public String toString() {
            return "Closed(" + this.f19942a + ')';
        }
    }

    @kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u0002H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/p$b;", "", "E", t0.b.f22420d, "Lkotlinx/coroutines/channels/p;", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "", "cause", bi.ay, "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/p$c;", a1.h.f116i, "Lkotlinx/coroutines/channels/p$c;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @g2
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        @g2
        public final <E> Object a(@p4.m Throwable th) {
            return p.c(new a(th));
        }

        @p4.l
        @g2
        public final <E> Object b() {
            return p.c(p.f19940c);
        }

        @p4.l
        @g2
        public final <E> Object c(E e5) {
            return p.c(e5);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/p$c;", "", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static class c {
        @p4.l
        public String toString() {
            return "Failed";
        }
    }

    @a1
    private /* synthetic */ p(Object obj) {
        this.f19941a = obj;
    }

    public static final /* synthetic */ p b(Object obj) {
        return new p(obj);
    }

    @p4.l
    @a1
    public static <T> Object c(@p4.m Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof p) && l0.g(obj, ((p) obj2).o());
    }

    public static final boolean e(Object obj, Object obj2) {
        return l0.g(obj, obj2);
    }

    @p4.m
    public static final Throwable f(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f19942a;
        }
        return null;
    }

    @a1
    public static /* synthetic */ void g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.m
    public static final T h(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T i(Object obj) {
        Throwable th;
        if (!(obj instanceof c)) {
            return obj;
        }
        if ((obj instanceof a) && (th = ((a) obj).f19942a) != null) {
            throw th;
        }
        throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
    }

    public static int j(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean k(Object obj) {
        return obj instanceof a;
    }

    public static final boolean l(Object obj) {
        return obj instanceof c;
    }

    public static final boolean m(Object obj) {
        return !(obj instanceof c);
    }

    @p4.l
    public static String n(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f19941a, obj);
    }

    public int hashCode() {
        return j(this.f19941a);
    }

    public final /* synthetic */ Object o() {
        return this.f19941a;
    }

    @p4.l
    public String toString() {
        return n(this.f19941a);
    }
}
