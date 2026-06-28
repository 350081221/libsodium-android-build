package kotlin;

import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\f\n\u0002\b\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0001H\u0087\b\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {PluginConstants.KEY_ERROR_CODE, "", "", "getCode$annotations", "(C)V", "getCode", "(C)I", "Char", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {
    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {r.class})
    private static final char a(int i5) {
        if (i5 >= 0 && i5 <= 65535) {
            return (char) i5;
        }
        throw new IllegalArgumentException("Invalid Char code: " + i5);
    }

    private static final int b(char c5) {
        return c5;
    }

    @g1(version = "1.5")
    @v2(markerClass = {r.class})
    @kotlin.internal.g
    @kotlin.internal.f
    public static /* synthetic */ void c(char c5) {
    }
}
