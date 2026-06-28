package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.Owner;
import java.lang.ref.WeakReference;
import kotlin.r2;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010W\u001a\u00020V\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010X\u0012\b\b\u0002\u0010Z\u001a\u00020\u0012¢\u0006\u0004\b[\u0010\\J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u000f\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0014J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0004J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0012H\u0004J7\u0010\"\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0012H\u0010¢\u0006\u0004\b \u0010!J\u0010\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010%\u001a\u00020\u0019H\u0016J\u0010\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0019H\u0016J\u0012\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010'H\u0016J\u001a\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010*\u001a\u00020\u0012H\u0016J\"\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u0012H\u0016J\u001c\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016J$\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010*\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010-H\u0016J$\u0010/\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010*\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010-H\u0014J,\u0010/\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010*\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u00100\u001a\u00020\u0019H\u0014J\b\u00101\u001a\u00020\u0019H\u0016R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R(\u00107\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001058\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b7\u00108\"\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R(\u0010>\u001a\u0004\u0018\u00010\u00042\b\u00106\u001a\u0004\u0018\u00010\u00048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bC\u0010D\u0012\u0004\bE\u0010FR0\u0010G\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u00198F@FX\u0087\u000e¢\u0006\u0018\n\u0004\bG\u0010H\u0012\u0004\bM\u0010F\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010HR\u0016\u0010O\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010HR\u0018\u0010P\u001a\u00020\u0019*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020\u00198TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bR\u0010JR\u0011\u0010U\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bT\u0010J¨\u0006]"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Lkotlin/r2;", "checkAddView", "Landroidx/compose/runtime/CompositionContext;", "cacheIfAlive", "resolveParentCompositionContext", "ensureCompositionCreated", "parent", "setParentCompositionContext", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "strategy", "setViewCompositionStrategy", "Content", "(Landroidx/compose/runtime/Composer;I)V", "createComposition", "disposeComposition", "onAttachedToWindow", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "internalOnMeasure$ui_release", "(II)V", "internalOnMeasure", "", "changed", "left", "top", "right", "bottom", "onLayout", "internalOnLayout$ui_release", "(ZIIII)V", "internalOnLayout", "layoutDirection", "onRtlPropertiesChanged", "isTransitionGroup", "setTransitionGroup", "Landroid/view/View;", "child", "addView", "index", "width", "height", "Landroid/view/ViewGroup$LayoutParams;", "params", "addViewInLayout", "preventRequestLayout", "shouldDelayChildPressedState", "Ljava/lang/ref/WeakReference;", "cachedViewTreeCompositionContext", "Ljava/lang/ref/WeakReference;", "Landroid/os/IBinder;", t0.b.f22420d, "previousAttachedWindowToken", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "Landroidx/compose/runtime/Composition;", "composition", "Landroidx/compose/runtime/Composition;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "setParentContext", "(Landroidx/compose/runtime/CompositionContext;)V", "Lkotlin/Function0;", "disposeViewCompositionStrategy", "Lv3/a;", "getDisposeViewCompositionStrategy$annotations", "()V", "showLayoutBounds", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "creatingComposition", "isTransitionGroupSet", "isAlive", "(Landroidx/compose/runtime/CompositionContext;)Z", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeView.android.kt\nandroidx/compose/ui/platform/AbstractComposeView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,448:1\n1#2:449\n*E\n"})
/* loaded from: classes.dex */
public abstract class AbstractComposeView extends ViewGroup {
    public static final int $stable = 8;

    @p4.m
    private WeakReference<CompositionContext> cachedViewTreeCompositionContext;

    @p4.m
    private Composition composition;
    private boolean creatingComposition;

    @p4.m
    private v3.a<r2> disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;

    @p4.m
    private CompositionContext parentContext;

    @p4.m
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    @u3.i
    public AbstractComposeView(@p4.l Context context) {
        this(context, null, 0, 6, null);
    }

    @u3.i
    public AbstractComposeView(@p4.l Context context, @p4.m AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i5, int i6, kotlin.jvm.internal.w wVar) {
        this(context, (i6 & 2) != 0 ? null : attributeSet, (i6 & 4) != 0 ? 0 : i5);
    }

    private final CompositionContext cacheIfAlive(CompositionContext compositionContext) {
        CompositionContext compositionContext2;
        if (isAlive(compositionContext)) {
            compositionContext2 = compositionContext;
        } else {
            compositionContext2 = null;
        }
        if (compositionContext2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(compositionContext2);
        }
        return compositionContext;
    }

    private final void checkAddView() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void ensureCompositionCreated() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = Wrapper_androidKt.setContent(this, resolveParentCompositionContext(), ComposableLambdaKt.composableLambdaInstance(-656146368, true, new AbstractComposeView$ensureCompositionCreated$1(this)));
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    @InternalComposeUiApi
    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final boolean isAlive(CompositionContext compositionContext) {
        return !(compositionContext instanceof Recomposer) || ((Recomposer) compositionContext).getCurrentState().getValue().compareTo(Recomposer.State.ShuttingDown) > 0;
    }

    private final CompositionContext resolveParentCompositionContext() {
        CompositionContext compositionContext;
        CompositionContext compositionContext2;
        CompositionContext compositionContext3 = this.parentContext;
        if (compositionContext3 == null) {
            CompositionContext findViewTreeCompositionContext = WindowRecomposer_androidKt.findViewTreeCompositionContext(this);
            CompositionContext compositionContext4 = null;
            if (findViewTreeCompositionContext != null) {
                compositionContext = cacheIfAlive(findViewTreeCompositionContext);
            } else {
                compositionContext = null;
            }
            if (compositionContext == null) {
                WeakReference<CompositionContext> weakReference = this.cachedViewTreeCompositionContext;
                if (weakReference != null && (compositionContext2 = weakReference.get()) != null && isAlive(compositionContext2)) {
                    compositionContext4 = compositionContext2;
                }
                CompositionContext compositionContext5 = compositionContext4;
                if (compositionContext5 == null) {
                    return cacheIfAlive(WindowRecomposer_androidKt.getWindowRecomposer(this));
                }
                return compositionContext5;
            }
            return compositionContext;
        }
        return compositionContext3;
    }

    private final void setParentContext(CompositionContext compositionContext) {
        if (this.parentContext != compositionContext) {
            this.parentContext = compositionContext;
            if (compositionContext != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            Composition composition = this.composition;
            if (composition != null) {
                composition.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    ensureCompositionCreated();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    @Composable
    @UiComposable
    public abstract void Content(@p4.m Composer composer, int i5);

    @Override // android.view.ViewGroup
    public void addView(@p4.m View view) {
        checkAddView();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(@p4.m View view, int i5, @p4.m ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        return super.addViewInLayout(view, i5, layoutParams);
    }

    public final void createComposition() {
        boolean z4;
        if (this.parentContext == null && !isAttachedToWindow()) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            ensureCompositionCreated();
            return;
        }
        throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
    }

    public final void disposeComposition() {
        Composition composition = this.composition;
        if (composition != null) {
            composition.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui_release(boolean z4, int i5, int i6, int i7, int i8) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i7 - i5) - getPaddingRight(), (i8 - i6) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui_release(int i5, int i6) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i5, i6);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i5) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i5)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i6) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i6)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            ensureCompositionCreated();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        internalOnLayout$ui_release(z4, i5, i6, i7, i8);
    }

    @Override // android.view.View
    protected final void onMeasure(int i5, int i6) {
        ensureCompositionCreated();
        internalOnMeasure$ui_release(i5, i6);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i5) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i5);
    }

    public final void setParentCompositionContext(@p4.m CompositionContext compositionContext) {
        setParentContext(compositionContext);
    }

    public final void setShowLayoutBounds(boolean z4) {
        this.showLayoutBounds = z4;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z4);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z4) {
        super.setTransitionGroup(z4);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(@p4.l ViewCompositionStrategy viewCompositionStrategy) {
        v3.a<r2> aVar = this.disposeViewCompositionStrategy;
        if (aVar != null) {
            aVar.invoke();
        }
        this.disposeViewCompositionStrategy = viewCompositionStrategy.installFor(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @u3.i
    public AbstractComposeView(@p4.l Context context, @p4.m AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        setClipChildren(false);
        setClipToPadding(false);
        this.disposeViewCompositionStrategy = ViewCompositionStrategy.Companion.getDefault().installFor(this);
    }

    @Override // android.view.ViewGroup
    public void addView(@p4.m View view, int i5) {
        checkAddView();
        super.addView(view, i5);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(@p4.m View view, int i5, @p4.m ViewGroup.LayoutParams layoutParams, boolean z4) {
        checkAddView();
        return super.addViewInLayout(view, i5, layoutParams, z4);
    }

    @Override // android.view.ViewGroup
    public void addView(@p4.m View view, int i5, int i6) {
        checkAddView();
        super.addView(view, i5, i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(@p4.m View view, @p4.m ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(@p4.m View view, int i5, @p4.m ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, i5, layoutParams);
    }
}
