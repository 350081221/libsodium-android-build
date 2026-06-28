package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Px;

@kotlin.i0(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a2\u0010\u0007\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u001a2\u0010\b\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u001a2\u0010\n\u001a\u00020\t*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u001a2\u0010\u000b\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u001a2\u0010\f\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u001a5\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\r2\b\b\u0003\u0010\u0010\u001a\u00020\r2\b\b\u0003\u0010\u0011\u001a\u00020\rH\u0086\b\u001a5\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u0013\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\r2\b\b\u0003\u0010\u0014\u001a\u00020\r2\b\b\u0003\u0010\u0011\u001a\u00020\rH\u0086\b\u001a\u0017\u0010\u0017\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\rH\u0086\b\u001a%\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0086\b\u001a \u0010\u001d\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a\u001a\u0014\u0010!\u001a\u00020 *\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u001a&\u0010%\u001a\u00020\u0005*\u00020\u00002\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b#H\u0086\b\u001a9\u0010%\u001a\u00020\u0005\"\n\b\u0000\u0010&\u0018\u0001*\u00020\"*\u00020\u00002\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b#H\u0087\b¢\u0006\u0004\b'\u0010(\"*\u0010+\u001a\u00020)*\u00020\u00002\u0006\u0010*\u001a\u00020)8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\"*\u0010/\u001a\u00020)*\u00020\u00002\u0006\u0010*\u001a\u00020)8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.\"*\u00101\u001a\u00020)*\u00020\u00002\u0006\u0010*\u001a\u00020)8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.\"\u0016\u00105\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b3\u00104\"\u0016\u00107\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b6\u00104\"\u0016\u00109\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b8\u00104\"\u0016\u0010;\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b:\u00104\"\u0016\u0010=\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b<\u00104\"\u0016\u0010?\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b>\u00104\"\u001b\u0010D\u001a\b\u0012\u0004\u0012\u00020A0@*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bB\u0010C\"\u001b\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00000@*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bE\u0010C¨\u0006G"}, d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "view", "Lkotlin/r2;", "action", "doOnNextLayout", "doOnLayout", "Landroidx/core/view/OneShotPreDrawListener;", "doOnPreDraw", "doOnAttach", "doOnDetach", "", "start", "top", "end", "bottom", "updatePaddingRelative", "left", "right", "updatePadding", "size", "setPadding", "", "delayInMillis", "Lkotlin/Function0;", "Ljava/lang/Runnable;", "postDelayed", "postOnAnimationDelayed", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "drawToBitmap", "Landroid/view/ViewGroup$LayoutParams;", "Lkotlin/u;", "block", "updateLayoutParams", "T", "updateLayoutParamsTyped", "(Landroid/view/View;Lv3/l;)V", "", t0.b.f22420d, "isVisible", "(Landroid/view/View;)Z", "setVisible", "(Landroid/view/View;Z)V", "isInvisible", "setInvisible", "isGone", "setGone", "getMarginLeft", "(Landroid/view/View;)I", "marginLeft", "getMarginTop", "marginTop", "getMarginRight", "marginRight", "getMarginBottom", "marginBottom", "getMarginStart", "marginStart", "getMarginEnd", "marginEnd", "Lkotlin/sequences/m;", "Landroid/view/ViewParent;", "getAncestors", "(Landroid/view/View;)Lkotlin/sequences/m;", "ancestors", "getAllViews", "allViews", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,414:1\n37#1:415\n53#1:416\n326#1,4:420\n43#2,3:417\n*S KotlinDebug\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n*L\n68#1:415\n68#1:416\n310#1:420,4\n232#1:417,3\n*E\n"})
/* loaded from: classes2.dex */
public final class ViewKt {
    public static final void doOnAttach(@p4.l final View view, @p4.l final v3.l<? super View, kotlin.r2> lVar) {
        if (view.isAttachedToWindow()) {
            lVar.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@p4.l View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    lVar.invoke(view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@p4.l View view2) {
                }
            });
        }
    }

    public static final void doOnDetach(@p4.l final View view, @p4.l final v3.l<? super View, kotlin.r2> lVar) {
        if (!view.isAttachedToWindow()) {
            lVar.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@p4.l View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@p4.l View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    lVar.invoke(view2);
                }
            });
        }
    }

    public static final void doOnLayout(@p4.l View view, @p4.l final v3.l<? super View, kotlin.r2> lVar) {
        if (view.isLaidOut() && !view.isLayoutRequested()) {
            lVar.invoke(view);
        } else {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt$doOnLayout$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@p4.l View view2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                    view2.removeOnLayoutChangeListener(this);
                    v3.l.this.invoke(view2);
                }
            });
        }
    }

    public static final void doOnNextLayout(@p4.l View view, @p4.l final v3.l<? super View, kotlin.r2> lVar) {
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@p4.l View view2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                view2.removeOnLayoutChangeListener(this);
                lVar.invoke(view2);
            }
        });
    }

    @p4.l
    public static final OneShotPreDrawListener doOnPreDraw(@p4.l final View view, @p4.l final v3.l<? super View, kotlin.r2> lVar) {
        return OneShotPreDrawListener.add(view, new Runnable() { // from class: androidx.core.view.ViewKt$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                lVar.invoke(view);
            }
        });
    }

    @p4.l
    public static final Bitmap drawToBitmap(@p4.l View view, @p4.l Bitmap.Config config) {
        if (view.isLaidOut()) {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-view.getScrollX(), -view.getScrollY());
            view.draw(canvas);
            return createBitmap;
        }
        throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
    }

    public static /* synthetic */ Bitmap drawToBitmap$default(View view, Bitmap.Config config, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return drawToBitmap(view, config);
    }

    @p4.l
    public static final kotlin.sequences.m<View> getAllViews(@p4.l View view) {
        kotlin.sequences.m<View> b5;
        b5 = kotlin.sequences.q.b(new ViewKt$allViews$1(view, null));
        return b5;
    }

    @p4.l
    public static final kotlin.sequences.m<ViewParent> getAncestors(@p4.l View view) {
        kotlin.sequences.m<ViewParent> l5;
        l5 = kotlin.sequences.s.l(view.getParent(), ViewKt$ancestors$1.INSTANCE);
        return l5;
    }

    public static final int getMarginBottom(@p4.l View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int getMarginEnd(@p4.l View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        }
        return 0;
    }

    public static final int getMarginLeft(@p4.l View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int getMarginRight(@p4.l View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int getMarginStart(@p4.l View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        }
        return 0;
    }

    public static final int getMarginTop(@p4.l View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final boolean isGone(@p4.l View view) {
        return view.getVisibility() == 8;
    }

    public static final boolean isInvisible(@p4.l View view) {
        return view.getVisibility() == 4;
    }

    public static final boolean isVisible(@p4.l View view) {
        return view.getVisibility() == 0;
    }

    @p4.l
    public static final Runnable postDelayed(@p4.l View view, long j5, @p4.l final v3.a<kotlin.r2> aVar) {
        Runnable runnable = new Runnable() { // from class: androidx.core.view.ViewKt$postDelayed$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                aVar.invoke();
            }
        };
        view.postDelayed(runnable, j5);
        return runnable;
    }

    @p4.l
    public static final Runnable postOnAnimationDelayed(@p4.l View view, long j5, @p4.l final v3.a<kotlin.r2> aVar) {
        Runnable runnable = new Runnable() { // from class: androidx.core.view.j2
            @Override // java.lang.Runnable
            public final void run() {
                v3.a.this.invoke();
            }
        };
        view.postOnAnimationDelayed(runnable, j5);
        return runnable;
    }

    public static final void setGone(@p4.l View view, boolean z4) {
        view.setVisibility(z4 ? 8 : 0);
    }

    public static final void setInvisible(@p4.l View view, boolean z4) {
        view.setVisibility(z4 ? 4 : 0);
    }

    public static final void setPadding(@p4.l View view, @Px int i5) {
        view.setPadding(i5, i5, i5, i5);
    }

    public static final void setVisible(@p4.l View view, boolean z4) {
        view.setVisibility(z4 ? 0 : 8);
    }

    public static final void updateLayoutParams(@p4.l View view, @p4.l v3.l<? super ViewGroup.LayoutParams, kotlin.r2> lVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            lVar.invoke(layoutParams);
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @u3.h(name = "updateLayoutParamsTyped")
    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void updateLayoutParamsTyped(View view, v3.l<? super T, kotlin.r2> lVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.l0.y(1, "T");
        lVar.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final void updatePadding(@p4.l View view, @Px int i5, @Px int i6, @Px int i7, @Px int i8) {
        view.setPadding(i5, i6, i7, i8);
    }

    public static /* synthetic */ void updatePadding$default(View view, int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i5 = view.getPaddingLeft();
        }
        if ((i9 & 2) != 0) {
            i6 = view.getPaddingTop();
        }
        if ((i9 & 4) != 0) {
            i7 = view.getPaddingRight();
        }
        if ((i9 & 8) != 0) {
            i8 = view.getPaddingBottom();
        }
        view.setPadding(i5, i6, i7, i8);
    }

    public static final void updatePaddingRelative(@p4.l View view, @Px int i5, @Px int i6, @Px int i7, @Px int i8) {
        view.setPaddingRelative(i5, i6, i7, i8);
    }

    public static /* synthetic */ void updatePaddingRelative$default(View view, int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i5 = view.getPaddingStart();
        }
        if ((i9 & 2) != 0) {
            i6 = view.getPaddingTop();
        }
        if ((i9 & 4) != 0) {
            i7 = view.getPaddingEnd();
        }
        if ((i9 & 8) != 0) {
            i8 = view.getPaddingBottom();
        }
        view.setPaddingRelative(i5, i6, i7, i8);
    }
}
