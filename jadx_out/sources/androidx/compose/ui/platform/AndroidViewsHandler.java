package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.http.Headers;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.bi;
import java.util.HashMap;
import java.util.Iterator;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J0\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0014J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0017J\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0016\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aJ\u0012\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010 \u001a\u00020\u0005H\u0017J\b\u0010!\u001a\u00020\u0007H\u0016J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0014R3\u0010&\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$0#j\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$`%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R3\u0010*\u001a\u001e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00180#j\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0018`%8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)¨\u00060"}, d2 = {"Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroid/view/ViewGroup;", "", "widthMeasureSpec", "heightMeasureSpec", "Lkotlin/r2;", "onMeasure", "", "changed", "l", bi.aL, "r", "b", "onLayout", "Landroid/view/View;", "child", TypedValues.AttributesType.S_TARGET, "onDescendantInvalidated", "", Headers.LOCATION, "Landroid/graphics/Rect;", "dirty", "", "invalidateChildInParent", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "view", "Landroid/graphics/Canvas;", "canvas", "drawView", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "requestLayout", "shouldDelayChildPressedState", "dispatchDraw", "Ljava/util/HashMap;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/collections/HashMap;", "holderToLayoutNode", "Ljava/util/HashMap;", "getHolderToLayoutNode", "()Ljava/util/HashMap;", "layoutNodeToHolder", "getLayoutNodeToHolder", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "<init>", "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nAndroidViewsHandler.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewsHandler.android.kt\nandroidx/compose/ui/platform/AndroidViewsHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n1#2:106\n1855#3,2:107\n1855#3,2:109\n*S KotlinDebug\n*F\n+ 1 AndroidViewsHandler.android.kt\nandroidx/compose/ui/platform/AndroidViewsHandler\n*L\n56#1:107,2\n63#1:109,2\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidViewsHandler extends ViewGroup {
    public static final int $stable = 8;

    @p4.l
    private final HashMap<AndroidViewHolder, LayoutNode> holderToLayoutNode;

    @p4.l
    private final HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder;

    public AndroidViewsHandler(@p4.l Context context) {
        super(context);
        setClipChildren(false);
        this.holderToLayoutNode = new HashMap<>();
        this.layoutNodeToHolder = new HashMap<>();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@p4.l Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@p4.m MotionEvent motionEvent) {
        return true;
    }

    public final void drawView(@p4.l AndroidViewHolder androidViewHolder, @p4.l Canvas canvas) {
        androidViewHolder.draw(canvas);
    }

    @p4.l
    public final HashMap<AndroidViewHolder, LayoutNode> getHolderToLayoutNode() {
        return this.holderToLayoutNode;
    }

    @p4.l
    public final HashMap<LayoutNode, AndroidViewHolder> getLayoutNodeToHolder() {
        return this.layoutNodeToHolder;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @p4.m
    public Void invalidateChildInParent(@p4.m int[] iArr, @p4.m Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void onDescendantInvalidated(@p4.l View view, @p4.l View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        for (AndroidViewHolder androidViewHolder : this.holderToLayoutNode.keySet()) {
            androidViewHolder.layout(androidViewHolder.getLeft(), androidViewHolder.getTop(), androidViewHolder.getRight(), androidViewHolder.getBottom());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        boolean z4;
        boolean z5 = true;
        if (View.MeasureSpec.getMode(i5) == 1073741824) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (View.MeasureSpec.getMode(i6) != 1073741824) {
                z5 = false;
            }
            if (z5) {
                setMeasuredDimension(View.MeasureSpec.getSize(i5), View.MeasureSpec.getSize(i6));
                Iterator<T> it = this.holderToLayoutNode.keySet().iterator();
                while (it.hasNext()) {
                    ((AndroidViewHolder) it.next()).remeasure();
                }
                return;
            }
            throw new IllegalArgumentException("heightMeasureSpec should be EXACTLY".toString());
        }
        throw new IllegalArgumentException("widthMeasureSpec should be EXACTLY".toString());
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutNode layoutNode = this.holderToLayoutNode.get(childAt);
            if (childAt.isLayoutRequested() && layoutNode != null) {
                LayoutNode.requestRemeasure$ui_release$default(layoutNode, false, false, 3, null);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
