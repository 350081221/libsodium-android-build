package androidx.viewbinding;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class ViewBindings {
    private ViewBindings() {
    }

    @Nullable
    public static <T extends View> T findChildViewById(View view, @IdRes int i5) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            T t5 = (T) viewGroup.getChildAt(i6).findViewById(i5);
            if (t5 != null) {
                return t5;
            }
        }
        return null;
    }
}
