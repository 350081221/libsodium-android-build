package com.lzf.easyfloat.interfaces;

import android.view.MotionEvent;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\f\u001a\u00020\bH&J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH&J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\u0012"}, d2 = {"Lcom/lzf/easyfloat/interfaces/d;", "", "", "isCreated", "", "msg", "Landroid/view/View;", "view", "Lkotlin/r2;", "d", "f", "c", "dismiss", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "e", bi.ay, "b", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public interface d {
    void a(@l View view, @l MotionEvent motionEvent);

    void b(@l View view);

    void c(@l View view);

    void d(boolean z4, @m String str, @m View view);

    void dismiss();

    void e(@l View view, @l MotionEvent motionEvent);

    void f(@l View view);
}
