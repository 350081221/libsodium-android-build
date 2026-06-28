package mirror.android.providers;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.os.IInterface;
import android.provider.Settings;
import mirror.RefClass;
import mirror.RefMethod;
import mirror.RefObject;
import mirror.RefStaticObject;

/* loaded from: classes4.dex */
public class Settings {
    public static Class<?> TYPE = RefClass.load(Settings.class, (Class<?>) android.provider.Settings.class);

    /* loaded from: classes4.dex */
    public static class Config {
        public static Class<?> TYPE = RefClass.load((Class<?>) Config.class, "android.provider.Settings$Config");
        private static RefMethod<Object> getString;

        public static Object getString(ContentResolver contentResolver, String str) {
            RefMethod<Object> refMethod = getString;
            if (refMethod != null) {
                return refMethod.call(new Object[]{contentResolver, str}, new Object[0]);
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static class ContentProviderHolder {
        public static Class<?> TYPE = RefClass.load((Class<?>) ContentProviderHolder.class, "android.provider.Settings$ContentProviderHolder");
        public static RefObject<IInterface> mContentProvider;
    }

    @TargetApi(17)
    /* loaded from: classes4.dex */
    public static class Global {
        public static Class<?> TYPE = RefClass.load(Global.class, (Class<?>) Settings.Global.class);
        public static RefStaticObject<Object> sNameValueCache;
    }

    /* loaded from: classes4.dex */
    public static class NameValueCache {
        public static Class<?> TYPE = RefClass.load((Class<?>) NameValueCache.class, "android.provider.Settings$NameValueCache");
        public static RefObject<Object> mContentProvider;
    }

    /* loaded from: classes4.dex */
    public static class NameValueCacheOreo {
        public static Class<?> TYPE = RefClass.load((Class<?>) NameValueCacheOreo.class, "android.provider.Settings$NameValueCache");
        public static RefObject<Object> mProviderHolder;
    }

    /* loaded from: classes4.dex */
    public static class Secure {
        public static Class<?> TYPE = RefClass.load(Secure.class, (Class<?>) Settings.Secure.class);
        public static RefStaticObject<Object> sNameValueCache;
    }

    /* loaded from: classes4.dex */
    public static class System {
        public static Class<?> TYPE = RefClass.load(System.class, (Class<?>) Settings.System.class);
        public static RefStaticObject<Object> sNameValueCache;
    }
}
