package com.google.android.material.color;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public interface ColorResourcesOverride {
    @Nullable
    static ColorResourcesOverride getInstance() {
        int i5 = Build.VERSION.SDK_INT;
        if (30 <= i5 && i5 <= 33) {
            return ResourcesLoaderColorResourcesOverride.getInstance();
        }
        if (i5 >= 34) {
            return ResourcesLoaderColorResourcesOverride.getInstance();
        }
        return null;
    }

    boolean applyIfPossible(@NonNull Context context, @NonNull Map<Integer, Integer> map);

    @NonNull
    Context wrapContextIfPossible(@NonNull Context context, @NonNull Map<Integer, Integer> map);
}
