package androidx.compose.ui.text.intl;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.ArrayList;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/intl/AndroidLocaleDelegateAPI24;", "Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "()V", "current", "Landroidx/compose/ui/text/intl/LocaleList;", "getCurrent", "()Landroidx/compose/ui/text/intl/LocaleList;", "lastLocaleList", "lastPlatformLocaleList", "Landroid/os/LocaleList;", "lock", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "parseLanguageTag", "Landroidx/compose/ui/text/intl/PlatformLocale;", "languageTag", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RequiresApi(api = 24)
/* loaded from: classes.dex */
public final class AndroidLocaleDelegateAPI24 implements PlatformLocaleDelegate {
    public static final int $stable = 8;

    @m
    private LocaleList lastLocaleList;

    @m
    private android.os.LocaleList lastPlatformLocaleList;

    @l
    private final SynchronizedObject lock = Synchronization_jvmKt.createSynchronizedObject();

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    @l
    public LocaleList getCurrent() {
        android.os.LocaleList localeList = android.os.LocaleList.getDefault();
        synchronized (this.lock) {
            LocaleList localeList2 = this.lastLocaleList;
            if (localeList2 != null && localeList == this.lastPlatformLocaleList) {
                return localeList2;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add(new Locale(new AndroidLocale(localeList.get(i5))));
            }
            LocaleList localeList3 = new LocaleList(arrayList);
            this.lastPlatformLocaleList = localeList;
            this.lastLocaleList = localeList3;
            return localeList3;
        }
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    @l
    public PlatformLocale parseLanguageTag(@l String str) {
        return new AndroidLocale(java.util.Locale.forLanguageTag(str));
    }
}
