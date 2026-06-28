package kotlin.internal;

import kotlin.a0;
import kotlin.a1;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0001\u001a\"\u0010\b\u001a\u0002H\t\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0083\b¢\u0006\u0002\u0010\f\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"IMPLEMENTATIONS", "Lkotlin/internal/PlatformImplementations;", "apiVersionIsAtLeast", "", "major", "", "minor", "patch", "castToBaseType", "T", "", "instance", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final l f19264a = new kotlin.internal.jdk8.d();

    @g1(version = "1.2")
    @a1
    public static final boolean a(int i5, int i6, int i7) {
        return a0.f19080g.j(i5, i6, i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @f
    private static final /* synthetic */ <T> T b(Object obj) {
        try {
            l0.y(1, "T");
            return obj;
        } catch (ClassCastException e5) {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            l0.y(4, "T");
            ClassLoader classLoader2 = Object.class.getClassLoader();
            if (!l0.g(classLoader, classLoader2)) {
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e5);
            }
            throw e5;
        }
    }
}
