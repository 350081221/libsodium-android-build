package l2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.p1;
import p4.l;
import p4.m;
import socket.g;

@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J:\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J*\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J*\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0016"}, d2 = {"Ll2/c;", "Lcom/lzf/easyfloat/interfaces/c;", "Landroid/view/View;", "view", "Landroid/view/WindowManager$LayoutParams;", "params", "Landroid/view/WindowManager;", "windowManager", "Lm2/b;", "sidePattern", "", "isExit", "Landroid/animation/Animator;", "d", "Lkotlin/p1;", "", g.f22386a, "f", bi.ay, "b", "<init>", "()V", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public class c implements com.lzf.easyfloat.interfaces.c {

    @i0(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20732a;

        static {
            int[] iArr = new int[m2.b.values().length];
            iArr[m2.b.LEFT.ordinal()] = 1;
            iArr[m2.b.RESULT_LEFT.ordinal()] = 2;
            iArr[m2.b.RIGHT.ordinal()] = 3;
            iArr[m2.b.RESULT_RIGHT.ordinal()] = 4;
            iArr[m2.b.TOP.ordinal()] = 5;
            iArr[m2.b.RESULT_TOP.ordinal()] = 6;
            iArr[m2.b.BOTTOM.ordinal()] = 7;
            iArr[m2.b.RESULT_BOTTOM.ordinal()] = 8;
            iArr[m2.b.DEFAULT.ordinal()] = 9;
            iArr[m2.b.AUTO_HORIZONTAL.ordinal()] = 10;
            iArr[m2.b.RESULT_HORIZONTAL.ordinal()] = 11;
            iArr[m2.b.AUTO_VERTICAL.ordinal()] = 12;
            iArr[m2.b.RESULT_VERTICAL.ordinal()] = 13;
            f20732a = iArr;
        }
    }

    private final Animator d(final View view, final WindowManager.LayoutParams layoutParams, final WindowManager windowManager, m2.b bVar, boolean z4) {
        Integer first;
        Integer second;
        final p1<Integer, Integer, Boolean> g5 = g(view, layoutParams, windowManager, bVar);
        if (z4) {
            first = g5.getSecond();
        } else {
            first = g5.getFirst();
        }
        int intValue = first.intValue();
        if (z4) {
            second = g5.getFirst();
        } else {
            second = g5.getSecond();
        }
        final ValueAnimator ofInt = ValueAnimator.ofInt(intValue, second.intValue());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l2.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                c.e(p1.this, layoutParams, windowManager, view, ofInt, valueAnimator);
            }
        });
        l0.o(ofInt, "ofInt(start, end).apply …}\n            }\n        }");
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(p1 triple, WindowManager.LayoutParams params, WindowManager windowManager, View view, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        l0.p(triple, "$triple");
        l0.p(params, "$params");
        l0.p(windowManager, "$windowManager");
        l0.p(view, "$view");
        try {
            Object animatedValue = valueAnimator2.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                if (((Boolean) triple.getThird()).booleanValue()) {
                    params.x = intValue;
                } else {
                    params.y = intValue;
                }
                windowManager.updateViewLayout(view, params);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        } catch (Exception unused) {
            valueAnimator.cancel();
        }
    }

    private final int f(View view, WindowManager.LayoutParams layoutParams) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (iArr[1] == layoutParams.y) {
            return com.lzf.easyfloat.utils.b.f9276a.q(view);
        }
        return 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0032. Please report as an issue. */
    private final p1<Integer, Integer, Boolean> g(View view, WindowManager.LayoutParams layoutParams, WindowManager windowManager, m2.b bVar) {
        int i5;
        int i6;
        int bottom;
        int i7;
        int f5;
        int i8;
        int right;
        Rect rect = new Rect();
        windowManager.getDefaultDisplay().getRectSize(rect);
        int i9 = layoutParams.x;
        int right2 = rect.right - (view.getRight() + i9);
        int i10 = layoutParams.y;
        int bottom2 = rect.bottom - (view.getBottom() + i10);
        int min = Math.min(i9, right2);
        int min2 = Math.min(i10, bottom2);
        boolean z4 = false;
        switch (a.f20732a[bVar.ordinal()]) {
            case 1:
            case 2:
                i5 = layoutParams.x;
                i6 = -view.getRight();
                z4 = true;
                break;
            case 3:
            case 4:
                i5 = layoutParams.x;
                i6 = rect.right;
                z4 = true;
                break;
            case 5:
            case 6:
                i5 = layoutParams.y;
                bottom = view.getBottom();
                i6 = -bottom;
                break;
            case 7:
            case 8:
                i5 = layoutParams.y;
                i7 = rect.bottom;
                f5 = f(view, layoutParams);
                i6 = f5 + i7;
                break;
            case 9:
            case 10:
            case 11:
                i8 = layoutParams.x;
                if (i9 < right2) {
                    right = view.getRight();
                    i6 = -right;
                    i5 = i8;
                    z4 = true;
                    break;
                } else {
                    i6 = rect.right;
                    i5 = i8;
                    z4 = true;
                }
            case 12:
            case 13:
                i5 = layoutParams.y;
                if (i10 < bottom2) {
                    bottom = view.getBottom();
                    i6 = -bottom;
                    break;
                } else {
                    i7 = rect.bottom;
                    f5 = f(view, layoutParams);
                    i6 = f5 + i7;
                    break;
                }
            default:
                if (min <= min2) {
                    i8 = layoutParams.x;
                    if (i9 < right2) {
                        right = view.getRight();
                        i6 = -right;
                        i5 = i8;
                        z4 = true;
                        break;
                    } else {
                        i6 = rect.right;
                        i5 = i8;
                        z4 = true;
                    }
                } else {
                    i5 = layoutParams.y;
                    if (i10 < bottom2) {
                        bottom = view.getBottom();
                        i6 = -bottom;
                        break;
                    } else {
                        i7 = rect.bottom;
                        f5 = f(view, layoutParams);
                        i6 = f5 + i7;
                        break;
                    }
                }
        }
        return new p1<>(Integer.valueOf(i6), Integer.valueOf(i5), Boolean.valueOf(z4));
    }

    @Override // com.lzf.easyfloat.interfaces.c
    @m
    public Animator a(@l View view, @l WindowManager.LayoutParams params, @l WindowManager windowManager, @l m2.b sidePattern) {
        l0.p(view, "view");
        l0.p(params, "params");
        l0.p(windowManager, "windowManager");
        l0.p(sidePattern, "sidePattern");
        return d(view, params, windowManager, sidePattern, false);
    }

    @Override // com.lzf.easyfloat.interfaces.c
    @m
    public Animator b(@l View view, @l WindowManager.LayoutParams params, @l WindowManager windowManager, @l m2.b sidePattern) {
        l0.p(view, "view");
        l0.p(params, "params");
        l0.p(windowManager, "windowManager");
        l0.p(sidePattern, "sidePattern");
        return d(view, params, windowManager, sidePattern, true);
    }
}
