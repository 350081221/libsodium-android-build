package androidx.compose.ui.text.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.PlatformStringDelegate;
import androidx.compose.ui.text.intl.AndroidLocale;
import androidx.compose.ui.text.intl.PlatformLocale;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.text.d;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidStringDelegate;", "Landroidx/compose/ui/text/PlatformStringDelegate;", "()V", "capitalize", "", TypedValues.Custom.S_STRING, "locale", "Landroidx/compose/ui/text/intl/PlatformLocale;", "decapitalize", "toLowerCase", "toUpperCase", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidStringDelegate.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidStringDelegate.android.kt\nandroidx/compose/ui/text/platform/AndroidStringDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidStringDelegate implements PlatformStringDelegate {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    @l
    public String capitalize(@l String str, @l PlatformLocale platformLocale) {
        boolean z4;
        String valueOf;
        if (str.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            StringBuilder sb = new StringBuilder();
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                l0.n(platformLocale, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
                valueOf = d.v(charAt, ((AndroidLocale) platformLocale).getJavaLocale());
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb.append((Object) valueOf);
            String substring = str.substring(1);
            l0.o(substring, "this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            return sb.toString();
        }
        return str;
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    @l
    public String decapitalize(@l String str, @l PlatformLocale platformLocale) {
        String t5;
        if (!(str.length() > 0)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        l0.n(platformLocale, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        t5 = d.t(charAt, ((AndroidLocale) platformLocale).getJavaLocale());
        sb.append((Object) t5);
        String substring = str.substring(1);
        l0.o(substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    @l
    public String toLowerCase(@l String str, @l PlatformLocale platformLocale) {
        l0.n(platformLocale, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        String lowerCase = str.toLowerCase(((AndroidLocale) platformLocale).getJavaLocale());
        l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    @l
    public String toUpperCase(@l String str, @l PlatformLocale platformLocale) {
        l0.n(platformLocale, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        String upperCase = str.toUpperCase(((AndroidLocale) platformLocale).getJavaLocale());
        l0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
