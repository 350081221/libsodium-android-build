package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Half;
import androidx.annotation.RequiresApi;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\n\n\u0002\u0010\u000e\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0004H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0005H\u0087\b¨\u0006\u0006"}, d2 = {"toHalf", "Landroid/util/Half;", "", "", "", "", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure"})
@r1({"SMAP\nHalf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Half.kt\nandroidx/core/util/HalfKt\n*L\n1#1,60:1\n43#1:61\n*S KotlinDebug\n*F\n+ 1 Half.kt\nandroidx/core/util/HalfKt\n*L\n51#1:61\n*E\n"})
/* loaded from: classes2.dex */
public final class HalfKt {
    @l
    @RequiresApi(26)
    public static final Half toHalf(short s5) {
        Half valueOf;
        valueOf = Half.valueOf(s5);
        return valueOf;
    }

    @l
    @RequiresApi(26)
    public static final Half toHalf(float f5) {
        Half valueOf;
        valueOf = Half.valueOf(f5);
        return valueOf;
    }

    @l
    @RequiresApi(26)
    public static final Half toHalf(@l String str) {
        Half valueOf;
        valueOf = Half.valueOf(str);
        return valueOf;
    }

    @l
    @RequiresApi(26)
    public static final Half toHalf(double d5) {
        Half valueOf;
        valueOf = Half.valueOf((float) d5);
        return valueOf;
    }
}
