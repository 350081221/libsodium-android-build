package androidx.core.os;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class ConfigurationCompat {

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(24)
    /* loaded from: classes2.dex */
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static LocaleList getLocales(Configuration configuration) {
            return configuration.getLocales();
        }

        @DoNotInline
        static void setLocales(@NonNull Configuration configuration, @NonNull LocaleListCompat localeListCompat) {
            configuration.setLocales((LocaleList) localeListCompat.unwrap());
        }
    }

    private ConfigurationCompat() {
    }

    @NonNull
    public static LocaleListCompat getLocales(@NonNull Configuration configuration) {
        return LocaleListCompat.wrap(Api24Impl.getLocales(configuration));
    }

    public static void setLocales(@NonNull Configuration configuration, @NonNull LocaleListCompat localeListCompat) {
        Api24Impl.setLocales(configuration, localeListCompat);
    }
}
