package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.ViewRootForInspector;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004BI\b\u0002\u0012\u0006\u0010/\u001a\u00020.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105BK\b\u0016\u0012\u0006\u0010/\u001a\u00020.\u0012\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00028\u00000\u001e\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00107J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002R\u0014\u0010\b\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R(\u0010\u001a\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dRB\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001e2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$RB\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001e2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$RB\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001e2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u0014\u0010-\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00068"}, d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Landroid/view/View;", "T", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "Lkotlin/r2;", "registerSaveStateProvider", "unregisterSaveStateProvider", "typedView", "Landroid/view/View;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "getDispatcher", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "saveStateRegistry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "", "compositeKeyHash", "I", "", "saveStateKey", "Ljava/lang/String;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", t0.b.f22420d, "savableRegistryEntry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "setSavableRegistryEntry", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;)V", "Lkotlin/Function1;", "updateBlock", "Lv3/l;", "getUpdateBlock", "()Lv3/l;", "setUpdateBlock", "(Lv3/l;)V", "resetBlock", "getResetBlock", "setResetBlock", "releaseBlock", "getReleaseBlock", "setReleaseBlock", "getViewRoot", "()Landroid/view/View;", "viewRoot", "Landroid/content/Context;", d.X, "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/ui/node/Owner;", "owner", "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;Landroid/view/View;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroidx/compose/runtime/saveable/SaveableStateRegistry;ILandroidx/compose/ui/node/Owner;)V", "factory", "(Landroid/content/Context;Lv3/l;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/saveable/SaveableStateRegistry;ILandroidx/compose/ui/node/Owner;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/ViewFactoryHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,406:1\n1#2:407\n*E\n"})
/* loaded from: classes.dex */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements ViewRootForInspector {
    public static final int $stable = 8;
    private final int compositeKeyHash;

    @l
    private final NestedScrollDispatcher dispatcher;

    @l
    private v3.l<? super T, r2> releaseBlock;

    @l
    private v3.l<? super T, r2> resetBlock;

    @m
    private SaveableStateRegistry.Entry savableRegistryEntry;

    @l
    private final String saveStateKey;

    @m
    private final SaveableStateRegistry saveStateRegistry;

    @l
    private final T typedView;

    @l
    private v3.l<? super T, r2> updateBlock;

    /* synthetic */ ViewFactoryHolder(Context context, CompositionContext compositionContext, View view, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, int i5, Owner owner, int i6, w wVar) {
        this(context, (i6 & 2) != 0 ? null : compositionContext, view, (i6 & 8) != 0 ? new NestedScrollDispatcher() : nestedScrollDispatcher, saveableStateRegistry, i5, owner);
    }

    private final void registerSaveStateProvider() {
        SaveableStateRegistry saveableStateRegistry = this.saveStateRegistry;
        if (saveableStateRegistry != null) {
            setSavableRegistryEntry(saveableStateRegistry.registerProvider(this.saveStateKey, new ViewFactoryHolder$registerSaveStateProvider$1(this)));
        }
    }

    private final void setSavableRegistryEntry(SaveableStateRegistry.Entry entry) {
        SaveableStateRegistry.Entry entry2 = this.savableRegistryEntry;
        if (entry2 != null) {
            entry2.unregister();
        }
        this.savableRegistryEntry = entry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterSaveStateProvider() {
        setSavableRegistryEntry(null);
    }

    @l
    public final NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    @l
    public final v3.l<T, r2> getReleaseBlock() {
        return this.releaseBlock;
    }

    @l
    public final v3.l<T, r2> getResetBlock() {
        return this.resetBlock;
    }

    @l
    public final v3.l<T, r2> getUpdateBlock() {
        return this.updateBlock;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    @l
    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(@l v3.l<? super T, r2> lVar) {
        this.releaseBlock = lVar;
        setRelease(new ViewFactoryHolder$releaseBlock$1(this));
    }

    public final void setResetBlock(@l v3.l<? super T, r2> lVar) {
        this.resetBlock = lVar;
        setReset(new ViewFactoryHolder$resetBlock$1(this));
    }

    public final void setUpdateBlock(@l v3.l<? super T, r2> lVar) {
        this.updateBlock = lVar;
        setUpdate(new ViewFactoryHolder$updateBlock$1(this));
    }

    private ViewFactoryHolder(Context context, CompositionContext compositionContext, T t5, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, int i5, Owner owner) {
        super(context, compositionContext, i5, nestedScrollDispatcher, t5, owner);
        this.typedView = t5;
        this.dispatcher = nestedScrollDispatcher;
        this.saveStateRegistry = saveableStateRegistry;
        this.compositeKeyHash = i5;
        setClipChildren(false);
        String valueOf = String.valueOf(i5);
        this.saveStateKey = valueOf;
        Object consumeRestored = saveableStateRegistry != null ? saveableStateRegistry.consumeRestored(valueOf) : null;
        SparseArray<Parcelable> sparseArray = consumeRestored instanceof SparseArray ? (SparseArray) consumeRestored : null;
        if (sparseArray != null) {
            t5.restoreHierarchyState(sparseArray);
        }
        registerSaveStateProvider();
        this.updateBlock = AndroidView_androidKt.getNoOpUpdate();
        this.resetBlock = AndroidView_androidKt.getNoOpUpdate();
        this.releaseBlock = AndroidView_androidKt.getNoOpUpdate();
    }

    public /* synthetic */ ViewFactoryHolder(Context context, v3.l lVar, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i5, Owner owner, int i6, w wVar) {
        this(context, lVar, (i6 & 4) != 0 ? null : compositionContext, saveableStateRegistry, i5, owner);
    }

    public ViewFactoryHolder(@l Context context, @l v3.l<? super Context, ? extends T> lVar, @m CompositionContext compositionContext, @m SaveableStateRegistry saveableStateRegistry, int i5, @l Owner owner) {
        this(context, compositionContext, lVar.invoke(context), null, saveableStateRegistry, i5, owner, 8, null);
    }
}
