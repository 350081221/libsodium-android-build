package e4;

import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 e4.a, still in use, count: 1, list:
  (r0v1 e4.a) from 0x002c: SPUT (r0v1 e4.a) (LINE:45) e4.a.DEFAULT e4.a
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:238)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Le4/a;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", bi.ay, "SPARSE_ARRAY", "HASH_MAP", "NO_CACHE", "kotlin-android-extensions-runtime"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes4.dex */
public final class a {
    SPARSE_ARRAY,
    HASH_MAP,
    NO_CACHE;


    @l
    private static final a DEFAULT = new a();

    @l
    public static final C0446a Companion = new C0446a(null);

    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Le4/a$a;", "", "Le4/a;", "DEFAULT", "Le4/a;", bi.ay, "()Le4/a;", "<init>", "()V", "kotlin-android-extensions-runtime"}, k = 1, mv = {1, 5, 1})
    /* renamed from: e4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0446a {
        private C0446a() {
        }

        public /* synthetic */ C0446a(w wVar) {
            this();
        }

        @l
        public final a a() {
            return a.DEFAULT;
        }
    }

    static {
    }

    private a() {
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
