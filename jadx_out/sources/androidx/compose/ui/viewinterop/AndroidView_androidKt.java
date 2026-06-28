package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aM\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a{\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\r\u001a3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a^\u0010!\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u000f0\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u000fH\u0002\"(\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0002\b$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroid/view/View;", "T", "Lkotlin/Function1;", "Landroid/content/Context;", "factory", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/r2;", "update", "AndroidView", "(Lv3/l;Landroidx/compose/ui/Modifier;Lv3/l;Landroidx/compose/runtime/Composer;II)V", "onReset", "onRelease", "(Lv3/l;Landroidx/compose/ui/Modifier;Lv3/l;Lv3/l;Lv3/l;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "createAndroidViewNodeFactory", "(Lv3/l;Landroidx/compose/runtime/Composer;I)Lv3/a;", "Landroidx/compose/runtime/Updater;", "", "compositeKeyHash", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedStateRegistryOwner", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/runtime/CompositionLocalMap;", "compositionLocalMap", "updateViewHolderParams-6NefGtU", "(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;ILandroidx/compose/ui/unit/Density;Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/runtime/CompositionLocalMap;)V", "updateViewHolderParams", "Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "requireViewFactoryHolder", "Lkotlin/u;", "NoOpUpdate", "Lv3/l;", "getNoOpUpdate", "()Lv3/l;", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,406:1\n74#2:407\n74#2:408\n74#2:409\n74#2:410\n74#2:431\n74#2:432\n74#2:433\n286#3,10:411\n251#3,10:421\n3737#4,6:434\n*S KotlinDebug\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n*L\n214#1:407\n215#1:408\n222#1:409\n223#1:410\n268#1:431\n270#1:432\n271#1:433\n226#1:411,10\n244#1:421,10\n308#1:434,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidView_androidKt {

    @l
    private static final v3.l<View, r2> NoOpUpdate = AndroidView_androidKt$NoOpUpdate$1.INSTANCE;

    @Composable
    @UiComposable
    public static final <T extends View> void AndroidView(@l v3.l<? super Context, ? extends T> lVar, @m Modifier modifier, @m v3.l<? super T, r2> lVar2, @m Composer composer, int i5, int i6) {
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-1783766393);
        if ((i6 & 1) != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            i7 = (startRestartGroup.changedInstance(lVar) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        int i8 = i6 & 2;
        if (i8 != 0) {
            i7 |= 48;
        } else if ((i5 & 112) == 0) {
            i7 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i9 = i6 & 4;
        if (i9 != 0) {
            i7 |= 384;
        } else if ((i5 & 896) == 0) {
            i7 |= startRestartGroup.changedInstance(lVar2) ? 256 : 128;
        }
        if ((i7 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i8 != 0) {
                modifier = Modifier.Companion;
            }
            if (i9 != 0) {
                lVar2 = NoOpUpdate;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1783766393, i7, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:106)");
            }
            AndroidView(lVar, modifier, null, NoOpUpdate, lVar2, startRestartGroup, (i7 & 14) | 3072 | (i7 & 112) | ((i7 << 6) & 57344), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        v3.l<? super T, r2> lVar3 = lVar2;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidView_androidKt$AndroidView$1(lVar, modifier2, lVar3, i5, i6));
        }
    }

    @Composable
    private static final <T extends View> v3.a<LayoutNode> createAndroidViewNodeFactory(v3.l<? super Context, ? extends T> lVar, Composer composer, int i5) {
        composer.startReplaceableGroup(2030558801);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2030558801, i5, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:265)");
        }
        AndroidView_androidKt$createAndroidViewNodeFactory$1 androidView_androidKt$createAndroidViewNodeFactory$1 = new AndroidView_androidKt$createAndroidViewNodeFactory$1((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), lVar, ComposablesKt.rememberCompositionContext(composer, 0), (SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry()), ComposablesKt.getCurrentCompositeKeyHash(composer, 0), (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return androidView_androidKt$createAndroidViewNodeFactory$1;
    }

    @l
    public static final v3.l<View, r2> getNoOpUpdate() {
        return NoOpUpdate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends View> ViewFactoryHolder<T> requireViewFactoryHolder(LayoutNode layoutNode) {
        AndroidViewHolder interopViewFactoryHolder$ui_release = layoutNode.getInteropViewFactoryHolder$ui_release();
        if (interopViewFactoryHolder$ui_release == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        l0.n(interopViewFactoryHolder$ui_release, "null cannot be cast to non-null type androidx.compose.ui.viewinterop.ViewFactoryHolder<T of androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder>");
        return (ViewFactoryHolder) interopViewFactoryHolder$ui_release;
    }

    /* renamed from: updateViewHolderParams-6NefGtU, reason: not valid java name */
    private static final <T extends View> void m6291updateViewHolderParams6NefGtU(Composer composer, Modifier modifier, int i5, Density density, LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner, LayoutDirection layoutDirection, CompositionLocalMap compositionLocalMap) {
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Updater.m3271setimpl(composer, compositionLocalMap, companion.getSetResolvedCompositionLocals());
        Updater.m3271setimpl(composer, modifier, AndroidView_androidKt$updateViewHolderParams$1.INSTANCE);
        Updater.m3271setimpl(composer, density, AndroidView_androidKt$updateViewHolderParams$2.INSTANCE);
        Updater.m3271setimpl(composer, lifecycleOwner, AndroidView_androidKt$updateViewHolderParams$3.INSTANCE);
        Updater.m3271setimpl(composer, savedStateRegistryOwner, AndroidView_androidKt$updateViewHolderParams$4.INSTANCE);
        Updater.m3271setimpl(composer, layoutDirection, AndroidView_androidKt$updateViewHolderParams$5.INSTANCE);
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composer.getInserting() || !l0.g(composer.rememberedValue(), Integer.valueOf(i5))) {
            composer.updateRememberedValue(Integer.valueOf(i5));
            composer.apply(Integer.valueOf(i5), setCompositeKeyHash);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0047  */
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.UiComposable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends android.view.View> void AndroidView(@p4.l v3.l<? super android.content.Context, ? extends T> r21, @p4.m androidx.compose.ui.Modifier r22, @p4.m v3.l<? super T, kotlin.r2> r23, @p4.m v3.l<? super T, kotlin.r2> r24, @p4.m v3.l<? super T, kotlin.r2> r25, @p4.m androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(v3.l, androidx.compose.ui.Modifier, v3.l, v3.l, v3.l, androidx.compose.runtime.Composer, int, int):void");
    }
}
