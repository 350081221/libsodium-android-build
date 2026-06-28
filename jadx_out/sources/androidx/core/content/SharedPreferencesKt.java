package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import kotlin.i0;
import kotlin.r2;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\b¨\u0006\t"}, d2 = {"Landroid/content/SharedPreferences;", "", "commit", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "Lkotlin/r2;", "Lkotlin/u;", "action", "edit", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SharedPreferencesKt {
    @SuppressLint({"ApplySharedPref"})
    public static final void edit(@p4.l SharedPreferences sharedPreferences, boolean z4, @p4.l v3.l<? super SharedPreferences.Editor, r2> lVar) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        lVar.invoke(edit);
        if (z4) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public static /* synthetic */ void edit$default(SharedPreferences sharedPreferences, boolean z4, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        lVar.invoke(edit);
        if (z4) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
