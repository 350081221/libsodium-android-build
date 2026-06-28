package androidx.compose.ui.text.platform.extensions;

import android.text.style.LocaleSpan;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.x;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods;", "", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "localeSpan", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "textPaint", "Lkotlin/r2;", "setTextLocales", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(24)
@r1({"SMAP\nLocaleExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,51:1\n1549#2:52\n1620#2,3:53\n1549#2:58\n1620#2,3:59\n37#3,2:56\n37#3,2:62\n*S KotlinDebug\n*F\n+ 1 LocaleExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods\n*L\n40#1:52\n40#1:53,3\n47#1:58\n47#1:59,3\n40#1:56,2\n47#1:62,2\n*E\n"})
/* loaded from: classes.dex */
public final class LocaleListHelperMethods {
    public static final int $stable = 0;

    @l
    public static final LocaleListHelperMethods INSTANCE = new LocaleListHelperMethods();

    private LocaleListHelperMethods() {
    }

    @l
    @DoNotInline
    @RequiresApi(24)
    public final Object localeSpan(@l LocaleList localeList) {
        int Y;
        Y = x.Y(localeList, 10);
        ArrayList arrayList = new ArrayList(Y);
        Iterator<Locale> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(LocaleExtensions_androidKt.toJavaLocale(it.next()));
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        return new LocaleSpan(new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    @DoNotInline
    @RequiresApi(24)
    public final void setTextLocales(@l AndroidTextPaint androidTextPaint, @l LocaleList localeList) {
        int Y;
        Y = x.Y(localeList, 10);
        ArrayList arrayList = new ArrayList(Y);
        Iterator<Locale> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(LocaleExtensions_androidKt.toJavaLocale(it.next()));
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        androidTextPaint.setTextLocales(new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
