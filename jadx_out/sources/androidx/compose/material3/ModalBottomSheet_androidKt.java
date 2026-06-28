package androidx.compose.material3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.UUID;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a¹\u0001\u0010\u001c\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a/\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001d0\u0016H\u0007¢\u0006\u0004\b!\u0010\"\u001a0\u0010'\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010$\u001a\u00020\u001dH\u0003ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010*\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(H\u0003\u001a@\u0010+\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0004\b+\u0010,\u001a\f\u0010.\u001a\u00020\u001d*\u00020-H\u0002\u001a\u0014\u00101\u001a\u00020\u001d*\u00020/2\u0006\u00100\u001a\u00020\u001dH\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064²\u0006\f\u00102\u001a\u00020(8\nX\u008a\u0084\u0002²\u0006\u0017\u00103\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00108\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/SheetState;", "sheetState", "Landroidx/compose/ui/unit/Dp;", "sheetMaxWidth", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "tonalElevation", "scrimColor", "Landroidx/compose/runtime/Composable;", "dragHandle", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/material3/ModalBottomSheetProperties;", "properties", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/u;", "content", "ModalBottomSheet-dYc4hso", "(Lv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLv3/p;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/ModalBottomSheetProperties;Lv3/q;Landroidx/compose/runtime/Composer;III)V", "ModalBottomSheet", "", "skipPartiallyExpanded", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "rememberModalBottomSheetState", "(ZLv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", TypedValues.Custom.S_COLOR, "visible", "Scrim-3J-VO9M", "(JLv3/a;ZLandroidx/compose/runtime/Composer;I)V", "Scrim", "", "fullHeight", "modalBottomSheetAnchors", "ModalBottomSheetPopup", "(Landroidx/compose/material3/ModalBottomSheetProperties;Lv3/a;Landroidx/compose/foundation/layout/WindowInsets;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "Landroid/view/View;", "isFlagSecureEnabled", "Landroidx/compose/ui/window/SecureFlagPolicy;", "isSecureFlagSetOnParent", "shouldApplySecureFlag", "alpha", "currentContent", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,702:1\n74#2:703\n74#2:762\n74#2:763\n1116#3,6:704\n1116#3,3:715\n1119#3,3:721\n1116#3,6:725\n1116#3,6:731\n1116#3,6:737\n1116#3,6:743\n1116#3,6:750\n1116#3,6:756\n1116#3,6:764\n1116#3,6:770\n487#4,4:710\n491#4,2:718\n495#4:724\n25#5:714\n487#6:720\n646#7:749\n81#8:776\n81#8:777\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt\n*L\n153#1:703\n438#1:762\n442#1:763\n154#1:704,6\n157#1:715,3\n157#1:721,3\n158#1:725,6\n167#1:731,6\n175#1:737,6\n281#1:743,6\n379#1:750,6\n392#1:756,6\n443#1:764,6\n471#1:770,6\n157#1:710,4\n157#1:718,2\n157#1:724\n157#1:714\n157#1:720\n372#1:749\n373#1:776\n441#1:777\n*E\n"})
/* loaded from: classes.dex */
public final class ModalBottomSheet_androidKt {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecureFlagPolicy.values().length];
            try {
                iArr[SecureFlagPolicy.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecureFlagPolicy.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SecureFlagPolicy.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b4  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ModalBottomSheet-dYc4hso, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1999ModalBottomSheetdYc4hso(@p4.l v3.a<kotlin.r2> r42, @p4.m androidx.compose.ui.Modifier r43, @p4.m androidx.compose.material3.SheetState r44, float r45, @p4.m androidx.compose.ui.graphics.Shape r46, long r47, long r49, float r51, long r52, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r54, @p4.m androidx.compose.foundation.layout.WindowInsets r55, @p4.m androidx.compose.material3.ModalBottomSheetProperties r56, @p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r57, @p4.m androidx.compose.runtime.Composer r58, int r59, int r60, int r61) {
        /*
            Method dump skipped, instructions count: 1266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheet_androidKt.m1999ModalBottomSheetdYc4hso(v3.a, androidx.compose.ui.Modifier, androidx.compose.material3.SheetState, float, androidx.compose.ui.graphics.Shape, long, long, float, long, v3.p, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.ModalBottomSheetProperties, v3.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ModalBottomSheetPopup(@p4.l ModalBottomSheetProperties modalBottomSheetProperties, @p4.l v3.a<r2> aVar, @p4.l WindowInsets windowInsets, @p4.l v3.p<? super Composer, ? super Integer, r2> pVar, @p4.m Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(738805080);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(modalBottomSheetProperties)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i6 = i10 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i6 |= i9;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(windowInsets)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i6 |= i8;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i6 |= i7;
        }
        int i11 = i6;
        if ((i11 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(738805080, i11, -1, "androidx.compose.material3.ModalBottomSheetPopup (ModalBottomSheet.android.kt:436)");
            }
            View view = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            UUID uuid = (UUID) RememberSaveableKt.m3351rememberSaveable(new Object[0], (Saver) null, (String) null, (v3.a) ModalBottomSheet_androidKt$ModalBottomSheetPopup$id$1.INSTANCE, startRestartGroup, 3072, 6);
            CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(pVar, startRestartGroup, (i11 >> 9) & 14);
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            startRestartGroup.startReplaceableGroup(173201889);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            Object obj = rememberedValue;
            if (rememberedValue == companion.getEmpty()) {
                ModalBottomSheetWindow modalBottomSheetWindow = new ModalBottomSheetWindow(modalBottomSheetProperties, aVar, view, uuid);
                modalBottomSheetWindow.setCustomContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(-114385661, true, new ModalBottomSheet_androidKt$ModalBottomSheetPopup$modalBottomSheetWindow$1$1$1(windowInsets, rememberUpdatedState)));
                startRestartGroup.updateRememberedValue(modalBottomSheetWindow);
                obj = modalBottomSheetWindow;
            }
            ModalBottomSheetWindow modalBottomSheetWindow2 = (ModalBottomSheetWindow) obj;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(173202877);
            boolean changedInstance = startRestartGroup.changedInstance(modalBottomSheetWindow2) | startRestartGroup.changed(layoutDirection);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new ModalBottomSheet_androidKt$ModalBottomSheetPopup$1$1(modalBottomSheetWindow2, layoutDirection);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(modalBottomSheetWindow2, (v3.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ModalBottomSheet_androidKt$ModalBottomSheetPopup$2(modalBottomSheetProperties, aVar, windowInsets, pVar, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v3.p<Composer, Integer, r2> ModalBottomSheetPopup$lambda$8(State<? extends v3.p<? super Composer, ? super Integer, r2>> state) {
        return (v3.p) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m2000Scrim3JVO9M(long j5, v3.a<r2> aVar, boolean z4, Composer composer, int i5) {
        int i6;
        boolean z5;
        float f5;
        Modifier modifier;
        boolean z6;
        boolean z7;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(1053897700);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(j5)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i9 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(z4)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
        }
        int i10 = i6;
        if ((i10 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1053897700, i10, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.android.kt:370)");
            }
            if (j5 != Color.Companion.m3770getUnspecified0d7_KjU()) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (z4) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.0f;
                }
                State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f5, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
                startRestartGroup.startReplaceableGroup(-1858718943);
                if (z4) {
                    Modifier.Companion companion = Modifier.Companion;
                    startRestartGroup.startReplaceableGroup(-1858718859);
                    if ((i10 & 112) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z7 || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1(aVar, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    modifier = SemanticsModifierKt.clearAndSetSemantics(SuspendingPointerInputFilterKt.pointerInput(companion, aVar, (v3.p<? super PointerInputScope, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue), ModalBottomSheet_androidKt$Scrim$dismissSheet$2.INSTANCE);
                } else {
                    modifier = Modifier.Companion;
                }
                startRestartGroup.endReplaceableGroup();
                Modifier then = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifier);
                startRestartGroup.startReplaceableGroup(-1858718531);
                if ((i10 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean changed = startRestartGroup.changed(animateFloatAsState) | z6;
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new ModalBottomSheet_androidKt$Scrim$1$1(j5, animateFloatAsState);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(then, (v3.l) rememberedValue2, startRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ModalBottomSheet_androidKt$Scrim$2(j5, aVar, z4, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isFlagSecureEnabled(View view) {
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

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalMaterial3Api
    public static final Modifier modalBottomSheetAnchors(Modifier modifier, SheetState sheetState, float f5) {
        return OnRemeasuredModifierKt.onSizeChanged(modifier, new ModalBottomSheet_androidKt$modalBottomSheetAnchors$1(sheetState, f5));
    }

    @p4.l
    @Composable
    @ExperimentalMaterial3Api
    public static final SheetState rememberModalBottomSheetState(boolean z4, @p4.m v3.l<? super SheetValue, Boolean> lVar, @p4.m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-1261794383);
        if ((i6 & 1) != 0) {
            z4 = false;
        }
        boolean z5 = z4;
        if ((i6 & 2) != 0) {
            lVar = ModalBottomSheet_androidKt$rememberModalBottomSheetState$1.INSTANCE;
        }
        v3.l<? super SheetValue, Boolean> lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1261794383, i5, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.android.kt:363)");
        }
        SheetState rememberSheetState = SheetDefaultsKt.rememberSheetState(z5, lVar2, SheetValue.Hidden, false, composer, (i5 & 14) | 384 | (i5 & 112), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberSheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldApplySecureFlag(SecureFlagPolicy secureFlagPolicy, boolean z4) {
        int i5 = WhenMappings.$EnumSwitchMapping$0[secureFlagPolicy.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                return true;
            }
            if (i5 != 3) {
                throw new kotlin.j0();
            }
            return z4;
        }
        return false;
    }
}
