package androidx.compose.ui.window;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b6\u00107J(\u0010\t\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 RA\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00072\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b\t\u0010&R\"\u0010'\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010-\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00118\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u0014\u00101\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00100¨\u00068"}, d2 = {"Landroidx/compose/ui/window/DialogLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/window/DialogWindowProvider;", "Landroidx/compose/runtime/CompositionContext;", "parent", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Landroidx/compose/runtime/CompositionContext;Lv3/p;)V", "", "widthMeasureSpec", "heightMeasureSpec", "internalOnMeasure$ui_release", "(II)V", "internalOnMeasure", "", "changed", "left", "top", "right", "bottom", "internalOnLayout$ui_release", "(ZIIII)V", "internalOnLayout", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Landroid/view/Window;", "window", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "<set-?>", "content$delegate", "Landroidx/compose/runtime/MutableState;", "getContent", "()Lv3/p;", "(Lv3/p;)V", "usePlatformDefaultWidth", "Z", "getUsePlatformDefaultWidth", "()Z", "setUsePlatformDefaultWidth", "(Z)V", "shouldCreateCompositionOnAttachedToWindow", "getShouldCreateCompositionOnAttachedToWindow", "getDisplayWidth", "()I", "displayWidth", "getDisplayHeight", "displayHeight", "Landroid/content/Context;", d.X, "<init>", "(Landroid/content/Context;Landroid/view/Window;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,466:1\n81#2:467\n107#2,2:468\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n*L\n216#1:467\n216#1:468,2\n*E\n"})
/* loaded from: classes.dex */
public final class DialogLayout extends AbstractComposeView implements DialogWindowProvider {

    @l
    private final MutableState content$delegate;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private boolean usePlatformDefaultWidth;

    @l
    private final Window window;

    public DialogLayout(@l Context context, @l Window window) {
        super(context, null, 0, 6, null);
        MutableState mutableStateOf$default;
        this.window = window;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$AndroidDialog_androidKt.INSTANCE.m6295getLambda1$ui_release(), null, 2, null);
        this.content$delegate = mutableStateOf$default;
    }

    private final p<Composer, Integer, r2> getContent() {
        return (p) this.content$delegate.getValue();
    }

    private final int getDisplayHeight() {
        int L0;
        L0 = kotlin.math.d.L0(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
        return L0;
    }

    private final int getDisplayWidth() {
        int L0;
        L0 = kotlin.math.d.L0(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
        return L0;
    }

    private final void setContent(p<? super Composer, ? super Integer, r2> pVar) {
        this.content$delegate.setValue(pVar);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    public void Content(@m Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(1735448596);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1735448596, i5, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:268)");
        }
        getContent().invoke(startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DialogLayout$Content$4(this, i5));
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    @Override // androidx.compose.ui.window.DialogWindowProvider
    @l
    public Window getWindow() {
        return this.window;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean z4, int i5, int i6, int i7, int i8) {
        View childAt;
        super.internalOnLayout$ui_release(z4, i5, i6, i7, i8);
        if (this.usePlatformDefaultWidth || (childAt = getChildAt(0)) == null) {
            return;
        }
        getWindow().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int i5, int i6) {
        if (this.usePlatformDefaultWidth) {
            super.internalOnMeasure$ui_release(i5, i6);
        } else {
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final void setUsePlatformDefaultWidth(boolean z4) {
        this.usePlatformDefaultWidth = z4;
    }

    public final void setContent(@l CompositionContext compositionContext, @l p<? super Composer, ? super Integer, r2> pVar) {
        setParentCompositionContext(compositionContext);
        setContent(pVar);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }
}
