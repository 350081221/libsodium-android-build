package com.yuanqi.master.tools;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yuanqi.master.tools.c1;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/yuanqi/master/tools/SizeUtils;", "", "()V", "Companion", "onGetSizeListener", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final a f15065a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f15066b = 0;

    @kotlin.i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004J\u0016\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004J\u0016\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0004¨\u0006\u001b"}, d2 = {"Lcom/yuanqi/master/tools/SizeUtils$Companion;", "", "()V", "applyDimension", "", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", t0.b.f22420d, "unit", "", "dp2px", "dpValue", "forceGetViewSize", "", "view", "Landroid/view/View;", "listener", "Lcom/yuanqi/master/tools/SizeUtils$onGetSizeListener;", "getMeasuredHeight", "getMeasuredWidth", "measureView", "", "px2dp", "pxValue", "px2sp", "sp2px", "spValue", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(b bVar, View view) {
            kotlin.jvm.internal.l0.p(view, "$view");
            if (bVar != null) {
                bVar.a(view);
            }
        }

        public final float b(@p4.l Context context, float f5, int i5) {
            float f6;
            kotlin.jvm.internal.l0.p(context, "context");
            DisplayMetrics displayMetrics = context.getApplicationContext().getResources().getDisplayMetrics();
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 != 4) {
                                if (i5 != 5) {
                                    return 0.0f;
                                }
                                f5 *= displayMetrics.xdpi;
                                f6 = 0.03937008f;
                            } else {
                                f6 = displayMetrics.xdpi;
                            }
                        } else {
                            f5 *= displayMetrics.xdpi;
                            f6 = 0.013888889f;
                        }
                    } else {
                        f6 = displayMetrics.scaledDensity;
                    }
                } else {
                    f6 = displayMetrics.density;
                }
                return f5 * f6;
            }
            return f5;
        }

        public final int c(@p4.l Context context, float f5) {
            kotlin.jvm.internal.l0.p(context, "context");
            return (int) ((f5 * context.getApplicationContext().getResources().getDisplayMetrics().density) + 0.5f);
        }

        public final void d(@p4.l final View view, @p4.m final b bVar) {
            kotlin.jvm.internal.l0.p(view, "view");
            view.post(new Runnable() { // from class: com.yuanqi.master.tools.b1
                @Override // java.lang.Runnable
                public final void run() {
                    c1.a.e(c1.b.this, view);
                }
            });
        }

        public final int f(@p4.l View view) {
            kotlin.jvm.internal.l0.p(view, "view");
            return h(view)[1];
        }

        public final int g(@p4.l View view) {
            kotlin.jvm.internal.l0.p(view, "view");
            return h(view)[0];
        }

        @p4.l
        public final int[] h(@p4.l View view) {
            int makeMeasureSpec;
            kotlin.jvm.internal.l0.p(view, "view");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            }
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
            int i5 = layoutParams.height;
            if (i5 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(childMeasureSpec, makeMeasureSpec);
            return new int[]{view.getMeasuredWidth(), view.getMeasuredHeight()};
        }

        public final int i(@p4.l Context context, float f5) {
            kotlin.jvm.internal.l0.p(context, "context");
            return (int) ((f5 / context.getApplicationContext().getResources().getDisplayMetrics().density) + 0.5f);
        }

        public final int j(@p4.l Context context, float f5) {
            kotlin.jvm.internal.l0.p(context, "context");
            return (int) ((f5 / context.getApplicationContext().getResources().getDisplayMetrics().scaledDensity) + 0.5f);
        }

        public final int k(@p4.l Context context, float f5) {
            kotlin.jvm.internal.l0.p(context, "context");
            return (int) ((f5 * context.getApplicationContext().getResources().getDisplayMetrics().scaledDensity) + 0.5f);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/yuanqi/master/tools/SizeUtils$onGetSizeListener;", "", "onGetSize", "", "view", "Landroid/view/View;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface b {
        void a(@p4.m View view);
    }

    private c1() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }
}
