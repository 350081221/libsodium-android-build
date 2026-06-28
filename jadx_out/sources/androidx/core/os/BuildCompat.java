package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import kotlin.b1;
import kotlin.c1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.k;
import p4.l;
import u3.m;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007J\b\u0010\f\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\tH\u0007J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\b\u0010\u0012\u001a\u00020\tH\u0007J\b\u0010\u0013\u001a\u00020\tH\u0007J\b\u0010\u0014\u001a\u00020\tH\u0007J\b\u0010\u0015\u001a\u00020\tH\u0007J\b\u0010\u0016\u001a\u00020\tH\u0007J\b\u0010\u0017\u001a\u00020\tH\u0007J\b\u0010\u0018\u001a\u00020\tH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/core/os/BuildCompat;", "", "()V", "AD_SERVICES_EXTENSION_INT", "", "R_EXTENSION_INT", "S_EXTENSION_INT", "T_EXTENSION_INT", "isAtLeastN", "", "isAtLeastNMR1", "isAtLeastO", "isAtLeastOMR1", "isAtLeastP", "isAtLeastPreReleaseCodename", "codename", "", "buildCodename", "isAtLeastQ", "isAtLeastR", "isAtLeastS", "isAtLeastSv2", "isAtLeastT", "isAtLeastU", "isAtLeastV", "Api30Impl", "PrereleaseSdkCheck", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BuildCompat {

    @ChecksSdkIntAtLeast(extension = 1000000)
    @u3.e
    public static final int AD_SERVICES_EXTENSION_INT;

    @l
    public static final BuildCompat INSTANCE = new BuildCompat();

    @ChecksSdkIntAtLeast(extension = 30)
    @u3.e
    public static final int R_EXTENSION_INT;

    @ChecksSdkIntAtLeast(extension = 31)
    @u3.e
    public static final int S_EXTENSION_INT;

    @ChecksSdkIntAtLeast(extension = 33)
    @u3.e
    public static final int T_EXTENSION_INT;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, d2 = {"Landroidx/core/os/BuildCompat$Api30Impl;", "", "()V", "getExtensionVersion", "", "extension", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresApi(30)
    /* loaded from: classes2.dex */
    private static final class Api30Impl {

        @l
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        @DoNotInline
        public final int getExtensionVersion(int i5) {
            return SdkExtensions.getExtensionVersion(i5);
        }
    }

    @n3.e(n3.a.BINARY)
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/core/os/BuildCompat$PrereleaseSdkCheck;", "", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @c1
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes2.dex */
    public @interface PrereleaseSdkCheck {
    }

    static {
        int i5;
        int i6;
        int i7;
        int i8 = Build.VERSION.SDK_INT;
        int i9 = 0;
        if (i8 >= 30) {
            i5 = Api30Impl.INSTANCE.getExtensionVersion(30);
        } else {
            i5 = 0;
        }
        R_EXTENSION_INT = i5;
        if (i8 >= 30) {
            i6 = Api30Impl.INSTANCE.getExtensionVersion(31);
        } else {
            i6 = 0;
        }
        S_EXTENSION_INT = i6;
        if (i8 >= 30) {
            i7 = Api30Impl.INSTANCE.getExtensionVersion(33);
        } else {
            i7 = 0;
        }
        T_EXTENSION_INT = i7;
        if (i8 >= 30) {
            i9 = Api30Impl.INSTANCE.getExtensionVersion(1000000);
        }
        AD_SERVICES_EXTENSION_INT = i9;
    }

    private BuildCompat() {
    }

    @ChecksSdkIntAtLeast(api = 24)
    @k(message = "Android N is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 24`.", replaceWith = @b1(expression = "android.os.Build.VERSION.SDK_INT >= 24", imports = {}))
    @m
    public static final boolean isAtLeastN() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 25)
    @k(message = "Android N MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 25`.", replaceWith = @b1(expression = "android.os.Build.VERSION.SDK_INT >= 25", imports = {}))
    @m
    public static final boolean isAtLeastNMR1() {
        return Build.VERSION.SDK_INT >= 25;
    }

    @ChecksSdkIntAtLeast(api = 26)
    @k(message = "Android O is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead use `Build.VERSION.SDK_INT >= 26`.", replaceWith = @b1(expression = "android.os.Build.VERSION.SDK_INT >= 26", imports = {}))
    @m
    public static final boolean isAtLeastO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @ChecksSdkIntAtLeast(api = 27)
    @k(message = "Android O MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 27`.", replaceWith = @b1(expression = "android.os.Build.VERSION.SDK_INT >= 27", imports = {}))
    @m
    public static final boolean isAtLeastOMR1() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @ChecksSdkIntAtLeast(api = 28)
    @k(message = "Android P is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 28`.", replaceWith = @b1(expression = "android.os.Build.VERSION.SDK_INT >= 28", imports = {}))
    @m
    public static final boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    @m
    public static final boolean isAtLeastPreReleaseCodename(@l String codename, @l String buildCodename) {
        l0.p(codename, "codename");
        l0.p(buildCodename, "buildCodename");
        if (l0.g("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        l0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        l0.o(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.compareTo(upperCase2) < 0) {
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 29)
    @k(message = "Android Q is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 29`.", replaceWith = @b1(expression = "android.os.Build.VERSION.SDK_INT >= 29", imports = {}))
    @m
    public static final boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @ChecksSdkIntAtLeast(api = 30)
    @k(message = "Android R is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 30`.", replaceWith = @b1(expression = "android.os.Build.VERSION.SDK_INT >= 30", imports = {}))
    @m
    public static final boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @ChecksSdkIntAtLeast(api = 31, codename = "S")
    @k(message = "Android S is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 31`.", replaceWith = @b1(expression = "android.os.Build.VERSION.SDK_INT >= 31", imports = {}))
    @m
    public static final boolean isAtLeastS() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 31) {
            if (i5 >= 30) {
                String CODENAME = Build.VERSION.CODENAME;
                l0.o(CODENAME, "CODENAME");
                if (isAtLeastPreReleaseCodename("S", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 32, codename = "Sv2")
    @k(message = "Android Sv2 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 32`.", replaceWith = @b1(expression = "android.os.Build.VERSION.SDK_INT >= 32", imports = {}))
    @m
    public static final boolean isAtLeastSv2() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 32) {
            if (i5 >= 31) {
                String CODENAME = Build.VERSION.CODENAME;
                l0.o(CODENAME, "CODENAME");
                if (isAtLeastPreReleaseCodename("Sv2", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 33, codename = "Tiramisu")
    @k(message = "Android Tiramisu is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 33`.", replaceWith = @b1(expression = "android.os.Build.VERSION.SDK_INT >= 33", imports = {}))
    @m
    public static final boolean isAtLeastT() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 33) {
            if (i5 >= 32) {
                String CODENAME = Build.VERSION.CODENAME;
                l0.o(CODENAME, "CODENAME");
                if (isAtLeastPreReleaseCodename("Tiramisu", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 34, codename = "UpsideDownCake")
    @k(message = "Android UpsideDownCase is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 34`.", replaceWith = @b1(expression = "android.os.Build.VERSION.SDK_INT >= 34", imports = {}))
    @m
    public static final boolean isAtLeastU() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 34) {
            if (i5 >= 33) {
                String CODENAME = Build.VERSION.CODENAME;
                l0.o(CODENAME, "CODENAME");
                if (isAtLeastPreReleaseCodename("UpsideDownCake", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(codename = "VanillaIceCream")
    @PrereleaseSdkCheck
    @m
    public static final boolean isAtLeastV() {
        if (Build.VERSION.SDK_INT >= 34) {
            String CODENAME = Build.VERSION.CODENAME;
            l0.o(CODENAME, "CODENAME");
            if (isAtLeastPreReleaseCodename("VanillaIceCream", CODENAME)) {
                return true;
            }
        }
        return false;
    }
}
