package com.google.android.material.resources;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class TypefaceUtils {
    private TypefaceUtils() {
    }

    @Nullable
    public static Typeface maybeCopyWithFontWeightAdjustment(@NonNull Context context, @NonNull Typeface typeface) {
        return maybeCopyWithFontWeightAdjustment(context.getResources().getConfiguration(), typeface);
    }

    @Nullable
    public static Typeface maybeCopyWithFontWeightAdjustment(@NonNull Configuration configuration, @NonNull Typeface typeface) {
        int i5;
        int i6;
        int weight;
        int i7;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i5 = configuration.fontWeightAdjustment;
        if (i5 == Integer.MAX_VALUE) {
            return null;
        }
        i6 = configuration.fontWeightAdjustment;
        if (i6 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i7 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, MathUtils.clamp(weight + i7, 1, 1000), typeface.isItalic());
        return create;
    }
}
