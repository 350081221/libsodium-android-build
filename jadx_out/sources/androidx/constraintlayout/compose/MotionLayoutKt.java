package androidx.constraintlayout.compose;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import java.util.EnumSet;
import java.util.List;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import org.intellij.lang.annotations.d;
import p4.l;
import p4.m;
import v3.q;

@i0(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a{\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u001e\b\u0004\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001ag\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u001e\b\u0004\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0018\u001a\u008d\u0001\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u001b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\n\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001d2\u001e\b\u0004\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u001f\u001a\u0087\u0001\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u001e\b\u0004\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\"\u001a\u008d\u0001\u0010#\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u001b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\n\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001d2\u001e\b\u0004\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0081\bø\u0001\u0000¢\u0006\u0004\b#\u0010\u001f\u001ag\u0010#\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u001e\b\u0004\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0081\bø\u0001\u0000¢\u0006\u0004\b#\u0010\u0018\u001a\u0087\u0001\u0010#\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u001e\b\u0004\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0081\bø\u0001\u0000¢\u0006\u0004\b#\u0010\"\u001a\u0019\u0010$\u001a\u00020\u00162\b\b\u0001\u0010\u0013\u001a\u00020\u0019H\u0007¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010&\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0019H\u0007¢\u0006\u0004\b&\u0010'\u001a]\u00100\u001a\u00020/2\u0006\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050,2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101\"\u0014\u00103\u001a\u0002028\u0002X\u0082D¢\u0006\u0006\n\u0004\b3\u00104\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00065"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintSet;", "start", "end", "Landroidx/constraintlayout/compose/Transition;", "transition", "", "progress", "Ljava/util/EnumSet;", "Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "debug", "Landroidx/compose/ui/Modifier;", "modifier", "", "optimizationLevel", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/MotionLayoutScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "content", "MotionLayout", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;FLjava/util/EnumSet;Landroidx/compose/ui/Modifier;ILv3/q;Landroidx/compose/runtime/Composer;II)V", "Landroidx/constraintlayout/compose/MotionScene;", "motionScene", "(Landroidx/constraintlayout/compose/MotionScene;FLjava/util/EnumSet;Landroidx/compose/ui/Modifier;ILv3/q;Landroidx/compose/runtime/Composer;II)V", "", "constraintSetName", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function0;", "finishedAnimationListener", "(Landroidx/constraintlayout/compose/MotionScene;Ljava/lang/String;Landroidx/compose/animation/core/AnimationSpec;Ljava/util/EnumSet;Landroidx/compose/ui/Modifier;ILv3/a;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "informationReceiver", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;FLjava/util/EnumSet;Landroidx/constraintlayout/compose/LayoutInformationReceiver;Landroidx/compose/ui/Modifier;ILv3/q;Landroidx/compose/runtime/Composer;II)V", "MotionLayoutCore", TypedValues.MotionScene.NAME, "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/constraintlayout/compose/MotionScene;", "Transition", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/constraintlayout/compose/Transition;", "", "needsUpdate", "constraintSetStart", "constraintSetEnd", "Landroidx/compose/runtime/MutableState;", "Landroidx/constraintlayout/compose/MotionMeasurer;", "measurer", "Landroidx/compose/ui/layout/MeasurePolicy;", "rememberMotionLayoutMeasurePolicy", "(ILjava/util/EnumSet;JLandroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;Landroidx/compose/runtime/MutableState;Landroidx/constraintlayout/compose/MotionMeasurer;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "", "DEBUG", "Z", "compose_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class MotionLayoutKt {
    private static final boolean DEBUG = false;

    @Composable
    @ExperimentalMotionApi
    public static final void MotionLayout(@l ConstraintSet start, @l ConstraintSet end, @m Transition transition, float f5, @m EnumSet<MotionLayoutDebugFlags> enumSet, @m Modifier modifier, int i5, @l q<? super MotionLayoutScope, ? super Composer, ? super Integer, r2> content, @m Composer composer, int i6, int i7) {
        EnumSet<MotionLayoutDebugFlags> enumSet2;
        l0.p(start, "start");
        l0.p(end, "end");
        l0.p(content, "content");
        composer.startReplaceableGroup(-1330873847);
        Transition transition2 = (i7 & 4) != 0 ? null : transition;
        if ((i7 & 16) != 0) {
            EnumSet<MotionLayoutDebugFlags> of = EnumSet.of(MotionLayoutDebugFlags.NONE);
            l0.o(of, "of(MotionLayoutDebugFlags.NONE)");
            enumSet2 = of;
        } else {
            enumSet2 = enumSet;
        }
        Modifier modifier2 = (i7 & 32) != 0 ? Modifier.Companion : modifier;
        int i8 = (i7 & 64) != 0 ? 257 : i5;
        int i9 = i6 << 3;
        int i10 = (i9 & 234881024) | (i6 & 14) | 229376 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (i9 & 3670016) | (i9 & 29360128);
        composer.startReplaceableGroup(-1330870962);
        int i11 = (i10 & 14) | 32768 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (i10 & 458752) | (3670016 & i10) | (i10 & 29360128) | (i10 & 234881024);
        composer.startReplaceableGroup(-1401224268);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new MotionMeasurer();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MotionMeasurer motionMeasurer = (MotionMeasurer) rememberedValue;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new MotionLayoutScope(motionMeasurer);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MotionLayoutScope motionLayoutScope = (MotionLayoutScope) rememberedValue2;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue3;
        mutableState.setValue(Float.valueOf(f5));
        int i12 = i11 << 9;
        MeasurePolicy rememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i8, enumSet2, 0L, start, end, transition2, mutableState, motionMeasurer, composer, ((i11 >> 21) & 14) | 18350528 | (i12 & 7168) | (57344 & i12) | (i12 & 458752));
        motionMeasurer.addLayoutInformationReceiver(null);
        float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
        MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
        if (enumSet2.contains(motionLayoutDebugFlags) && Float.isNaN(forcedScaleFactor)) {
            composer.startReplaceableGroup(-1401222327);
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new MotionLayoutKt$MotionLayoutCore$4(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819896774, true, new MotionLayoutKt$MotionLayoutCore$5(content, motionLayoutScope, i11)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1401223142);
            if (!Float.isNaN(forcedScaleFactor)) {
                modifier2 = ScaleKt.scale(modifier2, motionMeasurer.getForcedScaleFactor());
            }
            composer.startReplaceableGroup(-1990474327);
            Modifier.Companion companion2 = Modifier.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(1376089335);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> materializerOf = LayoutKt.materializerOf(companion2);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer m3264constructorimpl = Updater.m3264constructorimpl(composer);
            Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, density, companion3.getSetDensity());
            Updater.m3271setimpl(m3264constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819900388, true, new MotionLayoutKt$MotionLayoutCore$3$2(content, motionLayoutScope, i11)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
            if (!Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-922833881);
                motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922833807);
                composer.endReplaceableGroup();
            }
            if (!enumSet2.contains(motionLayoutDebugFlags)) {
                composer.startReplaceableGroup(-922833740);
                motionMeasurer.drawDebug(boxScopeInstance, composer, 70);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922833689);
                composer.endReplaceableGroup();
            }
            r2 r2Var = r2.f19517a;
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x02d2, code lost:
    
        if ((((java.lang.Number) r4.getValue()).floatValue() == ((java.lang.Number) r21.getValue()).floatValue()) != false) goto L281;
     */
    @androidx.compose.runtime.Composable
    @kotlin.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MotionLayoutCore(@p4.l androidx.constraintlayout.compose.MotionScene r27, @p4.m java.lang.String r28, @p4.m androidx.compose.animation.core.AnimationSpec<java.lang.Float> r29, @p4.m java.util.EnumSet<androidx.constraintlayout.compose.MotionLayoutDebugFlags> r30, @p4.m androidx.compose.ui.Modifier r31, int r32, @p4.m v3.a<kotlin.r2> r33, @p4.l v3.q<? super androidx.constraintlayout.compose.MotionLayoutScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r34, @p4.m androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore(androidx.constraintlayout.compose.MotionScene, java.lang.String, androidx.compose.animation.core.AnimationSpec, java.util.EnumSet, androidx.compose.ui.Modifier, int, v3.a, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: MotionLayoutCore$lambda-11 */
    public static final ConstraintSet m6360MotionLayoutCore$lambda11(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* renamed from: MotionLayoutCore$lambda-16 */
    public static final boolean m6362MotionLayoutCore$lambda16(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* renamed from: MotionLayoutCore$lambda-17 */
    public static final void m6363MotionLayoutCore$lambda17(MutableState<Boolean> mutableState, boolean z4) {
        mutableState.setValue(Boolean.valueOf(z4));
    }

    /* renamed from: MotionLayoutCore$lambda-26 */
    public static final float m6364MotionLayoutCore$lambda26(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* renamed from: MotionLayoutCore$lambda-27 */
    public static final void m6365MotionLayoutCore$lambda27(MutableState<Float> mutableState, float f5) {
        mutableState.setValue(Float.valueOf(f5));
    }

    /* renamed from: MotionLayoutCore$lambda-8 */
    public static final ConstraintSet m6366MotionLayoutCore$lambda8(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    @l
    @Composable
    @SuppressLint({"ComposableNaming"})
    public static final MotionScene MotionScene(@l @d("json5") String content, @m Composer composer, int i5) {
        l0.p(content, "content");
        composer.startReplaceableGroup(1405665503);
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(content);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new JSONMotionScene(content);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        JSONMotionScene jSONMotionScene = (JSONMotionScene) rememberedValue;
        composer.endReplaceableGroup();
        return jSONMotionScene;
    }

    @Composable
    @SuppressLint({"ComposableNaming"})
    @m
    public static final Transition Transition(@l @d("json5") String content, @m Composer composer, int i5) {
        final CLObject cLObject;
        Transition transition;
        l0.p(content, "content");
        composer.startReplaceableGroup(811760201);
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(content);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            try {
                cLObject = CLParser.parse(content);
            } catch (CLParsingException e5) {
                System.err.println(l0.C("Error parsing JSON ", e5));
                cLObject = null;
            }
            if (cLObject != null) {
                transition = new Transition() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$Transition$transition$1$1
                    @Override // androidx.constraintlayout.compose.Transition
                    public void applyTo(@l androidx.constraintlayout.core.state.Transition transition2, int i6) {
                        l0.p(transition2, "transition");
                        try {
                            ConstraintSetParserKt.parseTransition(CLObject.this, transition2);
                        } catch (CLParsingException e6) {
                            System.err.println(l0.C("Error parsing JSON ", e6));
                        }
                    }

                    @Override // androidx.constraintlayout.compose.Transition
                    @l
                    public String getEndConstraintSetId() {
                        String stringOrNull = CLObject.this.getStringOrNull(TypedValues.TransitionType.S_TO);
                        return stringOrNull == null ? "end" : stringOrNull;
                    }

                    @Override // androidx.constraintlayout.compose.Transition
                    @l
                    public String getStartConstraintSetId() {
                        String stringOrNull = CLObject.this.getStringOrNull(TypedValues.TransitionType.S_FROM);
                        return stringOrNull == null ? "start" : stringOrNull;
                    }
                };
            } else {
                transition = null;
            }
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(transition, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MotionLayoutKt$Transition$transition$1$1 motionLayoutKt$Transition$transition$1$1 = (MotionLayoutKt$Transition$transition$1$1) ((MutableState) rememberedValue).getValue();
        composer.endReplaceableGroup();
        return motionLayoutKt$Transition$transition$1$1;
    }

    @l
    @Composable
    @a1
    public static final MeasurePolicy rememberMotionLayoutMeasurePolicy(final int i5, @l EnumSet<MotionLayoutDebugFlags> debug, long j5, @l final ConstraintSet constraintSetStart, @l final ConstraintSet constraintSetEnd, @m final Transition transition, @l final MutableState<Float> progress, @l final MotionMeasurer measurer, @m Composer composer, int i6) {
        l0.p(debug, "debug");
        l0.p(constraintSetStart, "constraintSetStart");
        l0.p(constraintSetEnd, "constraintSetEnd");
        l0.p(progress, "progress");
        l0.p(measurer, "measurer");
        composer.startReplaceableGroup(-1875584384);
        int i7 = 0;
        Object[] objArr = {Integer.valueOf(i5), debug, Long.valueOf(j5), constraintSetStart, constraintSetEnd, transition};
        composer.startReplaceableGroup(-3685570);
        boolean z4 = false;
        while (i7 < 6) {
            Object obj = objArr[i7];
            i7++;
            z4 |= composer.changed(obj);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
            measurer.initWith(constraintSetStart, constraintSetEnd, transition, progress.getValue().floatValue());
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i8) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i8);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i8) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i8);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @l
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo30measure3p2s80s(@l MeasureScope MeasurePolicy, @l List<? extends Measurable> measurables, long j6) {
                    MeasureResult layout$default;
                    l0.p(MeasurePolicy, "$this$MeasurePolicy");
                    l0.p(measurables, "measurables");
                    long m6391performInterpolationMeasureOQbXsTc = MotionMeasurer.this.m6391performInterpolationMeasureOQbXsTc(j6, MeasurePolicy.getLayoutDirection(), constraintSetStart, constraintSetEnd, transition, measurables, i5, progress.getValue().floatValue(), MeasurePolicy);
                    layout$default = MeasureScope.layout$default(MeasurePolicy, IntSize.m6214getWidthimpl(m6391performInterpolationMeasureOQbXsTc), IntSize.m6213getHeightimpl(m6391performInterpolationMeasureOQbXsTc), null, new MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1$measure$1(MotionMeasurer.this, measurables), 4, null);
                    return layout$default;
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i8) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i8);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i8) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i8);
                }
            };
            composer.updateRememberedValue(measurePolicy);
            rememberedValue = measurePolicy;
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy2 = (MeasurePolicy) rememberedValue;
        composer.endReplaceableGroup();
        return measurePolicy2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a0, code lost:
    
        if ((m6364MotionLayoutCore$lambda26(r6) == r23) != false) goto L177;
     */
    @androidx.compose.runtime.Composable
    @androidx.constraintlayout.compose.ExperimentalMotionApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MotionLayout(@p4.l androidx.constraintlayout.compose.MotionScene r22, float r23, @p4.m java.util.EnumSet<androidx.constraintlayout.compose.MotionLayoutDebugFlags> r24, @p4.m androidx.compose.ui.Modifier r25, int r26, @p4.l v3.q<? super androidx.constraintlayout.compose.MotionLayoutScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r27, @p4.m androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionLayoutKt.MotionLayout(androidx.constraintlayout.compose.MotionScene, float, java.util.EnumSet, androidx.compose.ui.Modifier, int, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x017f, code lost:
    
        if ((m6364MotionLayoutCore$lambda26(r3) == r23) != false) goto L177;
     */
    @androidx.compose.runtime.Composable
    @kotlin.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MotionLayoutCore(@p4.l androidx.constraintlayout.compose.MotionScene r22, float r23, @p4.m java.util.EnumSet<androidx.constraintlayout.compose.MotionLayoutDebugFlags> r24, @p4.m androidx.compose.ui.Modifier r25, int r26, @p4.l v3.q<? super androidx.constraintlayout.compose.MotionLayoutScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r27, @p4.m androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore(androidx.constraintlayout.compose.MotionScene, float, java.util.EnumSet, androidx.compose.ui.Modifier, int, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x02f5, code lost:
    
        if ((((java.lang.Number) r4.getValue()).floatValue() == ((java.lang.Number) r26.getValue()).floatValue()) != false) goto L281;
     */
    @androidx.compose.runtime.Composable
    @androidx.constraintlayout.compose.ExperimentalMotionApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MotionLayout(@p4.l androidx.constraintlayout.compose.MotionScene r32, @p4.m java.lang.String r33, @p4.m androidx.compose.animation.core.AnimationSpec<java.lang.Float> r34, @p4.m java.util.EnumSet<androidx.constraintlayout.compose.MotionLayoutDebugFlags> r35, @p4.m androidx.compose.ui.Modifier r36, int r37, @p4.m v3.a<kotlin.r2> r38, @p4.l v3.q<? super androidx.constraintlayout.compose.MotionLayoutScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r39, @p4.m androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 1377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionLayoutKt.MotionLayout(androidx.constraintlayout.compose.MotionScene, java.lang.String, androidx.compose.animation.core.AnimationSpec, java.util.EnumSet, androidx.compose.ui.Modifier, int, v3.a, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @a1
    public static final void MotionLayoutCore(@l ConstraintSet start, @l ConstraintSet end, @m Transition transition, float f5, @m EnumSet<MotionLayoutDebugFlags> enumSet, @m LayoutInformationReceiver layoutInformationReceiver, @m Modifier modifier, int i5, @l q<? super MotionLayoutScope, ? super Composer, ? super Integer, r2> content, @m Composer composer, int i6, int i7) {
        EnumSet<MotionLayoutDebugFlags> enumSet2;
        l0.p(start, "start");
        l0.p(end, "end");
        l0.p(content, "content");
        composer.startReplaceableGroup(-1401224268);
        Transition transition2 = (i7 & 4) != 0 ? null : transition;
        if ((i7 & 16) != 0) {
            EnumSet<MotionLayoutDebugFlags> of = EnumSet.of(MotionLayoutDebugFlags.NONE);
            l0.o(of, "of(MotionLayoutDebugFlags.NONE)");
            enumSet2 = of;
        } else {
            enumSet2 = enumSet;
        }
        LayoutInformationReceiver layoutInformationReceiver2 = (i7 & 32) != 0 ? null : layoutInformationReceiver;
        Modifier modifier2 = (i7 & 64) != 0 ? Modifier.Companion : modifier;
        int i8 = (i7 & 128) != 0 ? 257 : i5;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new MotionMeasurer();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MotionMeasurer motionMeasurer = (MotionMeasurer) rememberedValue;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new MotionLayoutScope(motionMeasurer);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MotionLayoutScope motionLayoutScope = (MotionLayoutScope) rememberedValue2;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue3;
        mutableState.setValue(Float.valueOf(f5));
        int i9 = i6 << 9;
        Modifier modifier3 = modifier2;
        MeasurePolicy rememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i8, enumSet2, 0L, start, end, transition2, mutableState, motionMeasurer, composer, ((i6 >> 21) & 14) | 18350528 | (i9 & 7168) | (57344 & i9) | (i9 & 458752));
        motionMeasurer.addLayoutInformationReceiver(layoutInformationReceiver2);
        float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
        MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
        if (enumSet2.contains(motionLayoutDebugFlags) && Float.isNaN(forcedScaleFactor)) {
            composer.startReplaceableGroup(-1401222327);
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier3, false, new MotionLayoutKt$MotionLayoutCore$4(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819896774, true, new MotionLayoutKt$MotionLayoutCore$5(content, motionLayoutScope, i6)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1401223142);
            Modifier scale = !Float.isNaN(forcedScaleFactor) ? ScaleKt.scale(modifier3, motionMeasurer.getForcedScaleFactor()) : modifier3;
            composer.startReplaceableGroup(-1990474327);
            Modifier.Companion companion2 = Modifier.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(1376089335);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> materializerOf = LayoutKt.materializerOf(companion2);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer m3264constructorimpl = Updater.m3264constructorimpl(composer);
            Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, density, companion3.getSetDensity());
            Updater.m3271setimpl(m3264constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(scale, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819900388, true, new MotionLayoutKt$MotionLayoutCore$3$2(content, motionLayoutScope, i6)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
            if (!Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-922833881);
                motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922833807);
                composer.endReplaceableGroup();
            }
            if (!enumSet2.contains(motionLayoutDebugFlags)) {
                composer.startReplaceableGroup(-922833740);
                motionMeasurer.drawDebug(boxScopeInstance, composer, 70);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922833689);
                composer.endReplaceableGroup();
            }
            r2 r2Var = r2.f19517a;
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ExperimentalMotionApi
    public static final void MotionLayout(@l ConstraintSet start, @l ConstraintSet end, @m Transition transition, float f5, @m EnumSet<MotionLayoutDebugFlags> enumSet, @m LayoutInformationReceiver layoutInformationReceiver, @m Modifier modifier, int i5, @l q<? super MotionLayoutScope, ? super Composer, ? super Integer, r2> content, @m Composer composer, int i6, int i7) {
        EnumSet<MotionLayoutDebugFlags> enumSet2;
        l0.p(start, "start");
        l0.p(end, "end");
        l0.p(content, "content");
        composer.startReplaceableGroup(-1330870962);
        Transition transition2 = (i7 & 4) != 0 ? null : transition;
        if ((i7 & 16) != 0) {
            EnumSet<MotionLayoutDebugFlags> of = EnumSet.of(MotionLayoutDebugFlags.NONE);
            l0.o(of, "of(MotionLayoutDebugFlags.NONE)");
            enumSet2 = of;
        } else {
            enumSet2 = enumSet;
        }
        LayoutInformationReceiver layoutInformationReceiver2 = (i7 & 32) != 0 ? null : layoutInformationReceiver;
        Modifier modifier2 = (i7 & 64) != 0 ? Modifier.Companion : modifier;
        int i8 = (i7 & 128) != 0 ? 257 : i5;
        int i9 = (i6 & 14) | 32768 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 458752) | (3670016 & i6) | (29360128 & i6) | (i6 & 234881024);
        composer.startReplaceableGroup(-1401224268);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new MotionMeasurer();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MotionMeasurer motionMeasurer = (MotionMeasurer) rememberedValue;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new MotionLayoutScope(motionMeasurer);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MotionLayoutScope motionLayoutScope = (MotionLayoutScope) rememberedValue2;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue3;
        mutableState.setValue(Float.valueOf(f5));
        int i10 = i9 << 9;
        Modifier modifier3 = modifier2;
        MeasurePolicy rememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i8, enumSet2, 0L, start, end, transition2, mutableState, motionMeasurer, composer, ((i9 >> 21) & 14) | 18350528 | (i10 & 7168) | (57344 & i10) | (i10 & 458752));
        motionMeasurer.addLayoutInformationReceiver(layoutInformationReceiver2);
        float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
        MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
        if (enumSet2.contains(motionLayoutDebugFlags) && Float.isNaN(forcedScaleFactor)) {
            composer.startReplaceableGroup(-1401222327);
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier3, false, new MotionLayoutKt$MotionLayoutCore$4(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819896774, true, new MotionLayoutKt$MotionLayoutCore$5(content, motionLayoutScope, i9)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1401223142);
            Modifier scale = !Float.isNaN(forcedScaleFactor) ? ScaleKt.scale(modifier3, motionMeasurer.getForcedScaleFactor()) : modifier3;
            composer.startReplaceableGroup(-1990474327);
            Modifier.Companion companion2 = Modifier.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(1376089335);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> materializerOf = LayoutKt.materializerOf(companion2);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer m3264constructorimpl = Updater.m3264constructorimpl(composer);
            Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, density, companion3.getSetDensity());
            Updater.m3271setimpl(m3264constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(scale, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819900388, true, new MotionLayoutKt$MotionLayoutCore$3$2(content, motionLayoutScope, i9)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
            if (!Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-922833881);
                motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922833807);
                composer.endReplaceableGroup();
            }
            if (!enumSet2.contains(motionLayoutDebugFlags)) {
                composer.startReplaceableGroup(-922833740);
                motionMeasurer.drawDebug(boxScopeInstance, composer, 70);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922833689);
                composer.endReplaceableGroup();
            }
            r2 r2Var = r2.f19517a;
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }
}
