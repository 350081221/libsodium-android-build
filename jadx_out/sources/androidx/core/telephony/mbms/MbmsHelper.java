package androidx.core.telephony.mbms;

import android.content.Context;
import android.os.Build;
import android.telephony.mbms.ServiceInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public final class MbmsHelper {

    @RequiresApi(28)
    /* loaded from: classes2.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        static CharSequence getBestNameForService(Context context, ServiceInfo serviceInfo) {
            Set namedContentLocales;
            Set namedContentLocales2;
            CharSequence nameForLocale;
            namedContentLocales = serviceInfo.getNamedContentLocales();
            if (namedContentLocales.isEmpty()) {
                return null;
            }
            String[] strArr = new String[namedContentLocales.size()];
            namedContentLocales2 = serviceInfo.getNamedContentLocales();
            Iterator it = namedContentLocales2.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                strArr[i5] = ((Locale) it.next()).toLanguageTag();
                i5++;
            }
            Locale firstMatch = context.getResources().getConfiguration().getLocales().getFirstMatch(strArr);
            if (firstMatch == null) {
                return null;
            }
            nameForLocale = serviceInfo.getNameForLocale(firstMatch);
            return nameForLocale;
        }
    }

    private MbmsHelper() {
    }

    @Nullable
    public static CharSequence getBestNameForService(@NonNull Context context, @NonNull ServiceInfo serviceInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getBestNameForService(context, serviceInfo);
        }
        return null;
    }
}
