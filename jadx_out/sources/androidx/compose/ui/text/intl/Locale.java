package androidx.compose.ui.text.intl;

import androidx.compose.runtime.Immutable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0006\u0010\u0016\u001a\u00020\u0003J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u000f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\n¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/intl/Locale;", "", "languageTag", "", "(Ljava/lang/String;)V", "platformLocale", "Landroidx/compose/ui/text/intl/PlatformLocale;", "(Landroidx/compose/ui/text/intl/PlatformLocale;)V", bi.N, "getLanguage", "()Ljava/lang/String;", "getPlatformLocale$ui_text_release", "()Landroidx/compose/ui/text/intl/PlatformLocale;", "region", "getRegion", "script", "getScript", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toLanguageTag", "toString", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
/* loaded from: classes.dex */
public final class Locale {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final PlatformLocale platformLocale;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/intl/Locale$Companion;", "", "()V", "current", "Landroidx/compose/ui/text/intl/Locale;", "getCurrent", "()Landroidx/compose/ui/text/intl/Locale;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Locale getCurrent() {
            return PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent().get(0);
        }
    }

    public Locale(@l PlatformLocale platformLocale) {
        this.platformLocale = platformLocale;
    }

    public boolean equals(@m Object obj) {
        if (obj == null || !(obj instanceof Locale)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return l0.g(toLanguageTag(), ((Locale) obj).toLanguageTag());
    }

    @l
    public final String getLanguage() {
        return this.platformLocale.getLanguage();
    }

    @l
    public final PlatformLocale getPlatformLocale$ui_text_release() {
        return this.platformLocale;
    }

    @l
    public final String getRegion() {
        return this.platformLocale.getRegion();
    }

    @l
    public final String getScript() {
        return this.platformLocale.getScript();
    }

    public int hashCode() {
        return toLanguageTag().hashCode();
    }

    @l
    public final String toLanguageTag() {
        return this.platformLocale.toLanguageTag();
    }

    @l
    public String toString() {
        return toLanguageTag();
    }

    public Locale(@l String str) {
        this(PlatformLocaleKt.getPlatformLocaleDelegate().parseLanguageTag(str));
    }
}
