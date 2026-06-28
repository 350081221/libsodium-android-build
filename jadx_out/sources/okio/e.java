package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;

@kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\n"}, d2 = {"Lokio/-DeprecatedUtf8;", "", "()V", "size", "", TypedValues.Custom.S_STRING, "", "beginIndex", "", "endIndex", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.k(message = "changed in Okio 2.x")
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final e f20882a = new e();

    private e() {
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "string.utf8Size()", imports = {"okio.utf8Size"}))
    public final long a(@p4.l String string) {
        kotlin.jvm.internal.l0.p(string, "string");
        return q1.l(string, 0, 0, 3, null);
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "string.utf8Size(beginIndex, endIndex)", imports = {"okio.utf8Size"}))
    public final long b(@p4.l String string, int i5, int i6) {
        kotlin.jvm.internal.l0.p(string, "string");
        return q1.k(string, i5, i6);
    }
}
