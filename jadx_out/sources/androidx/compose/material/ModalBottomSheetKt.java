package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.b1;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.a;
import v3.p;

@i0(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aH\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\bH\u0007\u001a@\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\bH\u0007\u001aG\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aC\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u0011\u001a;\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u0012\u001a\u0093\u0001\u0010(\u001a\u00020\u00142\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u00140$¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u001c\u0010*\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u0005H\u0002\u001a0\u00100\u001a\u00020\u00142\u0006\u0010+\u001a\u00020 2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140$2\u0006\u0010-\u001a\u00020\bH\u0003ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a\u001c\u00106\u001a\u0002052\n\u00102\u001a\u0006\u0012\u0002\b\u0003012\u0006\u00104\u001a\u000203H\u0002\"\u0014\u00107\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108\"\u0014\u00109\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108\"\u0014\u0010:\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006<²\u0006\f\u0010;\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/ModalBottomSheetValue;", "initialValue", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "isSkipHalfExpanded", "Landroidx/compose/material/ModalBottomSheetState;", "ModalBottomSheetState", "skipHalfExpanded", "rememberModalBottomSheetState", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "confirmStateChange", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "sheetState", "sheetGesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "sheetShape", "Landroidx/compose/ui/unit/Dp;", "sheetElevation", "Landroidx/compose/ui/graphics/Color;", "sheetBackgroundColor", "sheetContentColor", "scrimColor", "Lkotlin/Function0;", "content", "ModalBottomSheetLayout-Gs3lGvM", "(Lv3/q;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;ZLandroidx/compose/ui/graphics/Shape;FJJJLv3/p;Landroidx/compose/runtime/Composer;II)V", "ModalBottomSheetLayout", "fullHeight", "modalBottomSheetAnchors", TypedValues.Custom.S_COLOR, "onDismiss", "visible", "Scrim-3J-VO9M", "(JLv3/a;ZLandroidx/compose/runtime/Composer;I)V", "Scrim", "Landroidx/compose/material/AnchoredDraggableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "ModalBottomSheetPositionalThreshold", "F", "ModalBottomSheetVelocityThreshold", "MaxModalBottomSheetWidth", "alpha", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,817:1\n74#2:818\n74#2:819\n487#3,4:820\n491#3,2:828\n495#3:834\n25#4:824\n1116#5,3:825\n1119#5,3:831\n1116#5,6:836\n1116#5,6:842\n1116#5,6:848\n487#6:830\n646#7:835\n81#8:854\n154#9:855\n154#9:856\n154#9:857\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n*L\n434#1:818\n567#1:819\n571#1:820,4\n571#1:828,2\n571#1:834\n571#1:824\n571#1:825,3\n571#1:831,3\n722#1:836,6\n723#1:842,6\n735#1:848,6\n571#1:830\n714#1:835\n715#1:854\n814#1:855\n815#1:856\n816#1:857\n*E\n"})
/* loaded from: classes.dex */
public final class ModalBottomSheetKt {
    private static final float ModalBottomSheetPositionalThreshold = Dp.m6044constructorimpl(56);
    private static final float ModalBottomSheetVelocityThreshold = Dp.m6044constructorimpl(125);
    private static final float MaxModalBottomSheetWidth = Dp.m6044constructorimpl(640);

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        return new ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState, orientation);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0184  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ModalBottomSheetLayout-Gs3lGvM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1376ModalBottomSheetLayoutGs3lGvM(@p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r36, @p4.m androidx.compose.ui.Modifier r37, @p4.m androidx.compose.material.ModalBottomSheetState r38, boolean r39, @p4.m androidx.compose.ui.graphics.Shape r40, float r41, long r42, long r44, long r46, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r48, @p4.m androidx.compose.runtime.Composer r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt.m1376ModalBottomSheetLayoutGs3lGvM(v3.q, androidx.compose.ui.Modifier, androidx.compose.material.ModalBottomSheetState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    @l
    @ExperimentalMaterialApi
    public static final ModalBottomSheetState ModalBottomSheetState(@l ModalBottomSheetValue modalBottomSheetValue, @l Density density, @l AnimationSpec<Float> animationSpec, @l v3.l<? super ModalBottomSheetValue, Boolean> lVar, boolean z4) {
        ModalBottomSheetState modalBottomSheetState = new ModalBottomSheetState(modalBottomSheetValue, animationSpec, z4, lVar);
        modalBottomSheetState.setDensity$material_release(density);
        return modalBottomSheetState;
    }

    public static /* synthetic */ ModalBottomSheetState ModalBottomSheetState$default(ModalBottomSheetValue modalBottomSheetValue, Density density, AnimationSpec animationSpec, v3.l lVar, boolean z4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            animationSpec = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i5 & 8) != 0) {
            lVar = ModalBottomSheetKt$ModalBottomSheetState$1.INSTANCE;
        }
        if ((i5 & 16) != 0) {
            z4 = false;
        }
        return ModalBottomSheetState(modalBottomSheetValue, density, animationSpec, lVar, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m1377Scrim3JVO9M(long j5, a<r2> aVar, boolean z4, Composer composer, int i5) {
        int i6;
        boolean z5;
        float f5;
        Modifier modifier;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-526532668);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(j5)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i9 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changed(z4)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
        }
        if ((i6 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-526532668, i6, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:712)");
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
                String m1452getString4foXLRw = Strings_androidKt.m1452getString4foXLRw(Strings.Companion.m1446getCloseSheetUdPEhr4(), startRestartGroup, 6);
                if (z4) {
                    Modifier.Companion companion = Modifier.Companion;
                    startRestartGroup.startReplaceableGroup(-1375678423);
                    boolean changedInstance = startRestartGroup.changedInstance(aVar);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(aVar, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, aVar, (p<? super PointerInputScope, ? super d<? super r2>, ? extends Object>) rememberedValue);
                    startRestartGroup.startReplaceableGroup(-1375678333);
                    boolean changed = startRestartGroup.changed(m1452getString4foXLRw) | startRestartGroup.changedInstance(aVar);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new ModalBottomSheetKt$Scrim$dismissModifier$2$1(m1452getString4foXLRw, aVar);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceableGroup();
                    modifier = SemanticsModifierKt.semantics(pointerInput, true, (v3.l) rememberedValue2);
                } else {
                    modifier = Modifier.Companion;
                }
                Modifier then = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifier);
                startRestartGroup.startReplaceableGroup(-1375678045);
                boolean changed2 = startRestartGroup.changed(j5) | startRestartGroup.changed(animateFloatAsState);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new ModalBottomSheetKt$Scrim$1$1(j5, animateFloatAsState);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(then, (v3.l) rememberedValue3, startRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ModalBottomSheetKt$Scrim$2(j5, aVar, z4, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier modalBottomSheetAnchors(Modifier modifier, ModalBottomSheetState modalBottomSheetState, float f5) {
        return OnRemeasuredModifierKt.onSizeChanged(modifier, new ModalBottomSheetKt$modalBottomSheetAnchors$1(modalBottomSheetState, f5));
    }

    @l
    @Composable
    @ExperimentalMaterialApi
    public static final ModalBottomSheetState rememberModalBottomSheetState(@l ModalBottomSheetValue modalBottomSheetValue, @m AnimationSpec<Float> animationSpec, @m v3.l<? super ModalBottomSheetValue, Boolean> lVar, boolean z4, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-126412120);
        AnimationSpec<Float> animationSpec2 = (i6 & 2) != 0 ? AnchoredDraggableDefaults.INSTANCE.getAnimationSpec() : animationSpec;
        v3.l<? super ModalBottomSheetValue, Boolean> lVar2 = (i6 & 4) != 0 ? ModalBottomSheetKt$rememberModalBottomSheetState$1.INSTANCE : lVar;
        boolean z5 = (i6 & 8) != 0 ? false : z4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-126412120, i5, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:432)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startMovableGroup(170051256, modalBottomSheetValue);
        ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) RememberSaveableKt.m3351rememberSaveable(new Object[]{modalBottomSheetValue, animationSpec2, Boolean.valueOf(z5), lVar2, density}, (Saver) ModalBottomSheetState.Companion.Saver(animationSpec2, lVar2, z5, density), (String) null, (a) new ModalBottomSheetKt$rememberModalBottomSheetState$2(modalBottomSheetValue, density, animationSpec2, lVar2, z5), composer, 72, 4);
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modalBottomSheetState;
    }

    @l
    @k(message = "This constructor is deprecated. Density must be provided by the component. Please use the constructor that provides a [Density].", replaceWith = @b1(expression = "\n            ModalBottomSheetState(\n                initialValue = initialValue,\n                density =,\n                animationSpec = animationSpec,\n                isSkipHalfExpanded = isSkipHalfExpanded,\n                confirmStateChange = confirmValueChange\n            )\n            ", imports = {}))
    @ExperimentalMaterialApi
    public static final ModalBottomSheetState ModalBottomSheetState(@l ModalBottomSheetValue modalBottomSheetValue, @l AnimationSpec<Float> animationSpec, @l v3.l<? super ModalBottomSheetValue, Boolean> lVar, boolean z4) {
        return new ModalBottomSheetState(modalBottomSheetValue, animationSpec, z4, lVar);
    }

    public static /* synthetic */ ModalBottomSheetState ModalBottomSheetState$default(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec animationSpec, v3.l lVar, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            animationSpec = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i5 & 4) != 0) {
            lVar = ModalBottomSheetKt$ModalBottomSheetState$3.INSTANCE;
        }
        if ((i5 & 8) != 0) {
            z4 = false;
        }
        return ModalBottomSheetState(modalBottomSheetValue, animationSpec, lVar, z4);
    }

    @k(message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @b1(expression = "rememberModalBottomSheetState(initialValue, animationSpec, confirmStateChange, false)", imports = {}))
    @l
    @Composable
    @ExperimentalMaterialApi
    public static final ModalBottomSheetState rememberModalBottomSheetState(@l ModalBottomSheetValue modalBottomSheetValue, @m AnimationSpec<Float> animationSpec, boolean z4, @l v3.l<? super ModalBottomSheetValue, Boolean> lVar, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-409288536);
        if ((i6 & 2) != 0) {
            animationSpec = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-409288536, i5, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:486)");
        }
        ModalBottomSheetState rememberModalBottomSheetState = rememberModalBottomSheetState(modalBottomSheetValue, animationSpec2, lVar, z4, composer, (i5 & 14) | 64 | ((i5 >> 3) & 896) | ((i5 << 3) & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberModalBottomSheetState;
    }

    @k(message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @b1(expression = "rememberModalBottomSheetState(initialValue, animationSpec, confirmValueChange = confirmStateChange)", imports = {}))
    @l
    @Composable
    @ExperimentalMaterialApi
    public static final ModalBottomSheetState rememberModalBottomSheetState(@l ModalBottomSheetValue modalBottomSheetValue, @m AnimationSpec<Float> animationSpec, @l v3.l<? super ModalBottomSheetValue, Boolean> lVar, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-1928569212);
        if ((i6 & 2) != 0) {
            animationSpec = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1928569212, i5, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:514)");
        }
        ModalBottomSheetState rememberModalBottomSheetState = rememberModalBottomSheetState(modalBottomSheetValue, animationSpec2, lVar, false, composer, (i5 & 14) | 3136 | (i5 & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberModalBottomSheetState;
    }
}
