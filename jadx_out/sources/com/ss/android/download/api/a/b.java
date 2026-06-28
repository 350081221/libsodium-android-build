package com.ss.android.download.api.a;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.ss.android.download.api.config.i;
import com.ss.android.download.api.config.t;

/* loaded from: classes3.dex */
public class b implements i {

    /* renamed from: a, reason: collision with root package name */
    private t f9396a;

    @Override // com.ss.android.download.api.config.i
    public void a(@NonNull Activity activity, @NonNull String[] strArr, t tVar) {
        this.f9396a = tVar;
        activity.requestPermissions(strArr, 1);
    }

    @Override // com.ss.android.download.api.config.i
    public boolean a(@Nullable Context context, @NonNull String str) {
        return context != null && ContextCompat.checkSelfPermission(context, str) == 0;
    }

    @Override // com.ss.android.download.api.config.i
    public void a(@NonNull Activity activity, int i5, @NonNull String[] strArr, @NonNull int[] iArr) {
        t tVar;
        if (iArr.length <= 0 || (tVar = this.f9396a) == null) {
            return;
        }
        int i6 = iArr[0];
        if (i6 == -1) {
            tVar.a(strArr[0]);
        } else if (i6 == 0) {
            tVar.a();
        }
    }
}
