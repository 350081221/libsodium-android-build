package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Preconditions;

/* loaded from: classes2.dex */
public class TypefaceCompat {
    private static final LruCache<String, Typeface> sTypefaceCache;
    private static final TypefaceCompatBaseImpl sTypefaceCompatImpl;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes2.dex */
    public static class ResourcesCallbackAdapter extends FontsContractCompat.FontRequestCallback {

        @Nullable
        private ResourcesCompat.FontCallback mFontCallback;

        public ResourcesCallbackAdapter(@Nullable ResourcesCompat.FontCallback fontCallback) {
            this.mFontCallback = fontCallback;
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRequestFailed(int i5) {
            ResourcesCompat.FontCallback fontCallback = this.mFontCallback;
            if (fontCallback != null) {
                fontCallback.lambda$callbackFailAsync$1(i5);
            }
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRetrieved(@NonNull Typeface typeface) {
            ResourcesCompat.FontCallback fontCallback = this.mFontCallback;
            if (fontCallback != null) {
                fontCallback.lambda$callbackSuccessAsync$0(typeface);
            }
        }
    }

    static {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            sTypefaceCompatImpl = new TypefaceCompatApi29Impl();
        } else if (i5 >= 28) {
            sTypefaceCompatImpl = new TypefaceCompatApi28Impl();
        } else if (i5 >= 26) {
            sTypefaceCompatImpl = new TypefaceCompatApi26Impl();
        } else if (TypefaceCompatApi24Impl.isUsable()) {
            sTypefaceCompatImpl = new TypefaceCompatApi24Impl();
        } else {
            sTypefaceCompatImpl = new TypefaceCompatApi21Impl();
        }
        sTypefaceCache = new LruCache<>(16);
    }

    private TypefaceCompat() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @VisibleForTesting
    public static void clearCache() {
        sTypefaceCache.evictAll();
    }

    @NonNull
    public static Typeface create(@NonNull Context context, @Nullable Typeface typeface, int i5) {
        if (context != null) {
            return Typeface.create(typeface, i5);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Typeface createFromFontInfo(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.FontInfo[] fontInfoArr, int i5) {
        return sTypefaceCompatImpl.createFromFontInfo(context, cancellationSignal, fontInfoArr, i5);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface createFromResourcesFamilyXml(@NonNull Context context, @NonNull FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry, @NonNull Resources resources, int i5, @Nullable String str, int i6, int i7, @Nullable ResourcesCompat.FontCallback fontCallback, @Nullable Handler handler, boolean z4) {
        Typeface createFromFontFamilyFilesResourceEntry;
        if (familyResourceEntry instanceof FontResourcesParserCompat.ProviderResourceEntry) {
            FontResourcesParserCompat.ProviderResourceEntry providerResourceEntry = (FontResourcesParserCompat.ProviderResourceEntry) familyResourceEntry;
            Typeface systemFontFamily = getSystemFontFamily(providerResourceEntry.getSystemFontFamilyName());
            if (systemFontFamily != null) {
                if (fontCallback != null) {
                    fontCallback.callbackSuccessAsync(systemFontFamily, handler);
                }
                return systemFontFamily;
            }
            boolean z5 = !z4 ? fontCallback != null : providerResourceEntry.getFetchStrategy() != 0;
            int timeout = z4 ? providerResourceEntry.getTimeout() : -1;
            createFromFontFamilyFilesResourceEntry = FontsContractCompat.requestFont(context, providerResourceEntry.getRequest(), i7, z5, timeout, ResourcesCompat.FontCallback.getHandler(handler), new ResourcesCallbackAdapter(fontCallback));
        } else {
            createFromFontFamilyFilesResourceEntry = sTypefaceCompatImpl.createFromFontFamilyFilesResourceEntry(context, (FontResourcesParserCompat.FontFamilyFilesResourceEntry) familyResourceEntry, resources, i7);
            if (fontCallback != null) {
                if (createFromFontFamilyFilesResourceEntry != null) {
                    fontCallback.callbackSuccessAsync(createFromFontFamilyFilesResourceEntry, handler);
                } else {
                    fontCallback.callbackFailAsync(-3, handler);
                }
            }
        }
        if (createFromFontFamilyFilesResourceEntry != null) {
            sTypefaceCache.put(createResourceUid(resources, i5, str, i6, i7), createFromFontFamilyFilesResourceEntry);
        }
        return createFromFontFamilyFilesResourceEntry;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface createFromResourcesFontFile(@NonNull Context context, @NonNull Resources resources, int i5, String str, int i6, int i7) {
        Typeface createFromResourcesFontFile = sTypefaceCompatImpl.createFromResourcesFontFile(context, resources, i5, str, i7);
        if (createFromResourcesFontFile != null) {
            sTypefaceCache.put(createResourceUid(resources, i5, str, i6, i7), createFromResourcesFontFile);
        }
        return createFromResourcesFontFile;
    }

    private static String createResourceUid(Resources resources, int i5, String str, int i6, int i7) {
        return resources.getResourcePackageName(i5) + '-' + str + '-' + i6 + '-' + i5 + '-' + i7;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface findFromCache(@NonNull Resources resources, int i5, @Nullable String str, int i6, int i7) {
        return sTypefaceCache.get(createResourceUid(resources, i5, str, i6, i7));
    }

    @Nullable
    private static Typeface getBestFontFromFamily(Context context, Typeface typeface, int i5) {
        TypefaceCompatBaseImpl typefaceCompatBaseImpl = sTypefaceCompatImpl;
        FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamily = typefaceCompatBaseImpl.getFontFamily(typeface);
        if (fontFamily == null) {
            return null;
        }
        return typefaceCompatBaseImpl.createFromFontFamilyFilesResourceEntry(context, fontFamily, context.getResources(), i5);
    }

    private static Typeface getSystemFontFamily(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface findFromCache(@NonNull Resources resources, int i5, int i6) {
        return findFromCache(resources, i5, null, 0, i6);
    }

    @NonNull
    public static Typeface create(@NonNull Context context, @Nullable Typeface typeface, @IntRange(from = 1, to = 1000) int i5, boolean z4) {
        if (context != null) {
            Preconditions.checkArgumentInRange(i5, 1, 1000, "weight");
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            return sTypefaceCompatImpl.createWeightStyle(context, typeface, i5, z4);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface createFromResourcesFontFile(@NonNull Context context, @NonNull Resources resources, int i5, String str, int i6) {
        return createFromResourcesFontFile(context, resources, i5, str, 0, i6);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface createFromResourcesFamilyXml(@NonNull Context context, @NonNull FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry, @NonNull Resources resources, int i5, int i6, @Nullable ResourcesCompat.FontCallback fontCallback, @Nullable Handler handler, boolean z4) {
        return createFromResourcesFamilyXml(context, familyResourceEntry, resources, i5, null, 0, i6, fontCallback, handler, z4);
    }
}
