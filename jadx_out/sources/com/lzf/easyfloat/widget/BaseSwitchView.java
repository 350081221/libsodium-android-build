package com.lzf.easyfloat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.lzf.easyfloat.interfaces.h;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import u3.i;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\u0010"}, d2 = {"Lcom/lzf/easyfloat/widget/BaseSwitchView;", "Landroid/widget/RelativeLayout;", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "Lcom/lzf/easyfloat/interfaces/h;", "listener", "Lkotlin/r2;", "setTouchRangeListener", "Landroid/content/Context;", d.X, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public abstract class BaseSwitchView extends RelativeLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public BaseSwitchView(@l Context context) {
        this(context, null, 0, 6, null);
        l0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public BaseSwitchView(@l Context context, @m AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        l0.p(context, "context");
    }

    public /* synthetic */ BaseSwitchView(Context context, AttributeSet attributeSet, int i5, int i6, w wVar) {
        this(context, (i6 & 2) != 0 ? null : attributeSet, (i6 & 4) != 0 ? 0 : i5);
    }

    public static /* synthetic */ void setTouchRangeListener$default(BaseSwitchView baseSwitchView, MotionEvent motionEvent, h hVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTouchRangeListener");
        }
        if ((i5 & 2) != 0) {
            hVar = null;
        }
        baseSwitchView.setTouchRangeListener(motionEvent, hVar);
    }

    public void a() {
    }

    public abstract void setTouchRangeListener(@l MotionEvent motionEvent, @m h hVar);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public BaseSwitchView(@l Context context, @m AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        l0.p(context, "context");
    }
}
