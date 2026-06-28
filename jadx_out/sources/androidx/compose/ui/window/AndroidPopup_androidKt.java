package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.IntRect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aU\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aF\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\r\u0010\u0010\u001a*\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a-\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0013\b\b\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0083\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\f\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0000\u001a\f\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002\u001a\u001c\u0010!\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00192\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0011H\u0007\" \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006(²\u0006\u0017\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\t8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/unit/IntOffset;", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/Function0;", "Lkotlin/r2;", "onDismissRequest", "Landroidx/compose/ui/window/PopupProperties;", "properties", "Landroidx/compose/runtime/Composable;", "content", "Popup-K5zGePQ", "(Landroidx/compose/ui/Alignment;JLv3/a;Landroidx/compose/ui/window/PopupProperties;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "Popup", "Landroidx/compose/ui/window/PopupPositionProvider;", "popupPositionProvider", "(Landroidx/compose/ui/window/PopupPositionProvider;Lv3/a;Landroidx/compose/ui/window/PopupProperties;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "", TTDownloadField.TT_TAG, "PopupTestTag", "(Ljava/lang/String;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "SimpleStack", "(Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "Landroid/view/View;", "", "isFlagSecureEnabled", "Landroid/graphics/Rect;", "Landroidx/compose/ui/unit/IntRect;", "toIntBounds", "view", "testTag", "isPopupLayout", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalPopupTestTag", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalPopupTestTag", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "currentContent", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,867:1\n50#2:868\n49#2:869\n25#2:880\n456#2,8:898\n464#2,6:912\n456#2,8:930\n464#2,6:944\n1116#3,6:870\n1116#3,6:881\n74#4:876\n74#4:877\n74#4:878\n74#4:879\n79#5,11:887\n92#5:918\n79#5,11:919\n92#5:950\n3737#6,6:906\n3737#6,6:938\n81#7:951\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n*L\n196#1:868\n196#1:869\n237#1:880\n311#1:898,8\n311#1:912,6\n343#1:930,8\n343#1:944,6\n196#1:870,6\n237#1:881,6\n230#1:876\n231#1:877\n232#1:878\n233#1:879\n311#1:887,11\n311#1:918\n343#1:919,11\n343#1:950\n311#1:906,6\n343#1:938,6\n235#1:951\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidPopup_androidKt {

    @l
    private static final ProvidableCompositionLocal<String> LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default(null, AndroidPopup_androidKt$LocalPopupTestTag$1.INSTANCE, 1, null);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0049  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Popup(@p4.l androidx.compose.ui.window.PopupPositionProvider r35, @p4.m v3.a<kotlin.r2> r36, @p4.m androidx.compose.ui.window.PopupProperties r37, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r38, @p4.m androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.Popup(androidx.compose.ui.window.PopupPositionProvider, v3.a, androidx.compose.ui.window.PopupProperties, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p<Composer, Integer, r2> Popup$lambda$1(State<? extends p<? super Composer, ? super Integer, r2>> state) {
        return (p) state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0067  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Popup-K5zGePQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m6293PopupK5zGePQ(@p4.m androidx.compose.ui.Alignment r25, long r26, @p4.m v3.a<kotlin.r2> r28, @p4.m androidx.compose.ui.window.PopupProperties r29, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r30, @p4.m androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.m6293PopupK5zGePQ(androidx.compose.ui.Alignment, long, v3.a, androidx.compose.ui.window.PopupProperties, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void PopupTestTag(@l String str, @l p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-498879600);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(str)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i6 = i8 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i6 |= i7;
        }
        if ((i6 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-498879600, i6, -1, "androidx.compose.ui.window.PopupTestTag (AndroidPopup.android.kt:333)");
            }
            CompositionLocalKt.CompositionLocalProvider(LocalPopupTestTag.provides(str), pVar, startRestartGroup, (i6 & 112) | ProvidedValue.$stable | 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidPopup_androidKt$PopupTestTag$1(str, pVar, i5));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void SimpleStack(Modifier modifier, p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5) {
        composer.startReplaceableGroup(1406149896);
        AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.INSTANCE;
        int i6 = ((i5 << 3) & 112) | ((i5 >> 3) & 14);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        int i7 = ((i6 << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m3264constructorimpl = Updater.m3264constructorimpl(composer);
        Updater.m3271setimpl(m3264constructorimpl, androidPopup_androidKt$SimpleStack$1, companion.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, Integer.valueOf((i7 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        pVar.invoke(composer, Integer.valueOf((i7 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @l
    public static final ProvidableCompositionLocal<String> getLocalPopupTestTag() {
        return LocalPopupTestTag;
    }

    public static final boolean isFlagSecureEnabled(@l View view) {
        WindowManager.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & 8192) == 0) {
            return false;
        }
        return true;
    }

    @p4.p
    public static final boolean isPopupLayout(@l View view, @m String str) {
        return (view instanceof PopupLayout) && (str == null || l0.g(str, ((PopupLayout) view).getTestTag()));
    }

    public static /* synthetic */ boolean isPopupLayout$default(View view, String str, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str = null;
        }
        return isPopupLayout(view, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect toIntBounds(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }
}
