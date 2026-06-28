package androidx.constraintlayout.compose;

import android.annotation.SuppressLint;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
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
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.lody.virtual.client.hook.providers.DownloadProviderHook;
import java.util.EnumSet;
import java.util.List;
import kotlin.a1;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.q1;
import kotlin.r2;
import kotlin.u0;
import kotlinx.coroutines.channels.o;
import org.intellij.lang.annotations.d;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001e\b\u0004\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aG\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00140\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001ap\u0010\n\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0010\b\n\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00142\u0013\b\b\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00060\u0014¢\u0006\u0002\b\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u001e\u001a5\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0015\u0010!\u001a\b\u0010#\u001a\u00020\"H\u0000\u001a\u001f\u0010*\u001a\u00020'*\u00020$2\u0006\u0010&\u001a\u00020%ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b(\u0010)\u001a\u001f\u0010.\u001a\u00020+*\u00020$2\u0006\u0010&\u001a\u00020%ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b,\u0010-\u001a!\u00102\u001a\u00020/*\u00020+2\u0006\u0010&\u001a\u00020%H\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b0\u00101\u001a\u001f\u0010*\u001a\u00020/*\u00020+2\u0006\u0010&\u001a\u00020%ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b(\u00101\u001a\u001f\u0010.\u001a\u00020/*\u00020'2\u0006\u0010&\u001a\u00020%ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b,\u00103\u001a%\u00106\u001a\u00020\u00172\b\b\u0001\u0010\t\u001a\u0002042\n\b\u0003\u00105\u001a\u0004\u0018\u000104H\u0007¢\u0006\u0004\b6\u00107\u001a\u0010\u00106\u001a\u00020\u00172\b\b\u0001\u00108\u001a\u000204\u001a\u0018\u00106\u001a\u00020\u00172\u0006\u00109\u001a\u00020\u00172\b\b\u0001\u00108\u001a\u000204\u001a\u001f\u00106\u001a\u00020\u00172\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\b\u001a'\u00106\u001a\u00020\u00172\u0006\u00109\u001a\u00020\u00172\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\b\u001a\u001e\u0010A\u001a\u00020\u00062\u0006\u0010=\u001a\u00020<2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>H\u0000\u001a\f\u0010C\u001a\u000204*\u00020BH\u0002\u001a\f\u0010C\u001a\u000204*\u00020DH\u0002\"\u0014\u0010E\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\bE\u0010F\"\u0015\u00102\u001a\u00020'*\u00020$8F¢\u0006\u0006\u001a\u0004\bG\u0010H\"\u0015\u0010K\u001a\u00020+*\u00020$8F¢\u0006\u0006\u001a\u0004\bI\u0010J\"\u0015\u00102\u001a\u00020/*\u00020+8F¢\u0006\u0006\u001a\u0004\bG\u0010L\"\u0015\u0010K\u001a\u00020/*\u00020'8F¢\u0006\u0006\u001a\u0004\bI\u0010M*\f\b\u0000\u0010O\"\u00020N2\u00020N*\f\b\u0000\u0010Q\"\u00020P2\u00020P*\f\b\u0000\u0010S\"\u00020R2\u00020R*\f\b\u0000\u0010U\"\u00020T2\u00020T\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006V"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "optimizationLevel", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "content", "ConstraintLayout", "(Landroidx/compose/ui/Modifier;ILv3/q;Landroidx/compose/runtime/Composer;II)V", "scope", "Landroidx/compose/runtime/MutableState;", "", "remeasureRequesterState", "Landroidx/constraintlayout/compose/Measurer;", "measurer", "Lkotlin/u0;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Lkotlin/Function0;", "rememberConstraintLayoutMeasurePolicy", "(ILandroidx/constraintlayout/compose/ConstraintLayoutScope;Landroidx/compose/runtime/MutableState;Landroidx/constraintlayout/compose/Measurer;Landroidx/compose/runtime/Composer;I)Lkotlin/u0;", "Landroidx/constraintlayout/compose/ConstraintSet;", "constraintSet", "animateChanges", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "finishedAnimationListener", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/compose/ui/Modifier;IZLandroidx/compose/animation/core/AnimationSpec;Lv3/a;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "", "needsUpdate", "(ILandroidx/compose/runtime/MutableState;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Measurer;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "", "createId", "Landroidx/constraintlayout/compose/Dimension$Coercible;", "Landroidx/compose/ui/unit/Dp;", "dp", "Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "atLeast-3ABfNKs", "(Landroidx/constraintlayout/compose/Dimension$Coercible;F)Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "atLeast", "Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "atMost-3ABfNKs", "(Landroidx/constraintlayout/compose/Dimension$Coercible;F)Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "atMost", "Landroidx/constraintlayout/compose/Dimension;", "atLeastWrapContent-3ABfNKs", "(Landroidx/constraintlayout/compose/Dimension$MinCoercible;F)Landroidx/constraintlayout/compose/Dimension;", "atLeastWrapContent", "(Landroidx/constraintlayout/compose/Dimension$MaxCoercible;F)Landroidx/constraintlayout/compose/Dimension;", "", "overrideVariables", "ConstraintSet", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/constraintlayout/compose/ConstraintSet;", "jsonContent", "extendConstraintSet", "Landroidx/constraintlayout/compose/ConstraintSetScope;", DownloadProviderHook.COLUMN_DESCRIPTION, "Landroidx/constraintlayout/compose/State;", "state", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "buildMapping", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "toDebugString", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;", "DEBUG", "Z", "getAtLeastWrapContent", "(Landroidx/constraintlayout/compose/Dimension$Coercible;)Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "getAtMostWrapContent", "(Landroidx/constraintlayout/compose/Dimension$Coercible;)Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "atMostWrapContent", "(Landroidx/constraintlayout/compose/Dimension$MinCoercible;)Landroidx/constraintlayout/compose/Dimension;", "(Landroidx/constraintlayout/compose/Dimension$MaxCoercible;)Landroidx/constraintlayout/compose/Dimension;", "Landroidx/constraintlayout/core/state/State$Chain;", "SolverChain", "Landroidx/constraintlayout/core/state/Dimension;", "SolverDimension", "Landroidx/constraintlayout/core/state/State$Direction;", "SolverDirection", "Landroidx/constraintlayout/core/state/State;", "SolverState", "compose_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ConstraintLayoutKt {
    private static final boolean DEBUG = false;

    @Composable
    public static final void ConstraintLayout(@m Modifier modifier, int i5, @l q<? super ConstraintLayoutScope, ? super Composer, ? super Integer, r2> content, @m Composer composer, int i6, int i7) {
        l0.p(content, "content");
        composer.startReplaceableGroup(-270267587);
        if ((i7 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i7 & 2) != 0) {
            i5 = 257;
        }
        int i8 = i5;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new Measurer();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Measurer measurer = (Measurer) rememberedValue;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new ConstraintLayoutScope();
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue2;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        u0<MeasurePolicy, v3.a<r2>> rememberConstraintLayoutMeasurePolicy = rememberConstraintLayoutMeasurePolicy(i8, constraintLayoutScope, (MutableState<Boolean>) rememberedValue3, measurer, composer, ((i6 >> 3) & 14) | 4544);
        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier, false, new ConstraintLayoutKt$ConstraintLayout$1(measurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new ConstraintLayoutKt$ConstraintLayout$2(constraintLayoutScope, content, i6, rememberConstraintLayoutMeasurePolicy.component2())), rememberConstraintLayoutMeasurePolicy.component1(), composer, 48, 0);
        composer.endReplaceableGroup();
    }

    /* renamed from: ConstraintLayout$lambda-6 */
    public static final ConstraintSet m6336ConstraintLayout$lambda6(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* renamed from: ConstraintLayout$lambda-9 */
    public static final ConstraintSet m6338ConstraintLayout$lambda9(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    @l
    @Composable
    @SuppressLint({"ComposableNaming"})
    public static final ConstraintSet ConstraintSet(@l @d("json5") String content, @d("json5") @m String str, @m Composer composer, int i5, int i6) {
        l0.p(content, "content");
        composer.startReplaceableGroup(1704604894);
        if ((i6 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        composer.startReplaceableGroup(-3686552);
        boolean changed = composer.changed(content) | composer.changed(str2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new JSONConstraintSet(content, str2, null, 4, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        JSONConstraintSet jSONConstraintSet = (JSONConstraintSet) rememberedValue;
        composer.endReplaceableGroup();
        return jSONConstraintSet;
    }

    @l
    /* renamed from: atLeast-3ABfNKs */
    public static final Dimension.MaxCoercible m6343atLeast3ABfNKs(@l Dimension.Coercible atLeast, float f5) {
        l0.p(atLeast, "$this$atLeast");
        DimensionDescription dimensionDescription = (DimensionDescription) atLeast;
        dimensionDescription.m6354setMinYLDhkOg(Dp.m6042boximpl(f5));
        return dimensionDescription;
    }

    @l
    @k(message = "Unintended method name, use atLeast(dp) instead", replaceWith = @b1(expression = "this.atLeast(dp)", imports = {"androidx.constraintlayout.compose.atLeast"}))
    /* renamed from: atLeastWrapContent-3ABfNKs */
    public static final Dimension m6345atLeastWrapContent3ABfNKs(@l Dimension.MinCoercible atLeastWrapContent, float f5) {
        l0.p(atLeastWrapContent, "$this$atLeastWrapContent");
        DimensionDescription dimensionDescription = (DimensionDescription) atLeastWrapContent;
        dimensionDescription.m6354setMinYLDhkOg(Dp.m6042boximpl(f5));
        return dimensionDescription;
    }

    @l
    /* renamed from: atMost-3ABfNKs */
    public static final Dimension.MinCoercible m6346atMost3ABfNKs(@l Dimension.Coercible atMost, float f5) {
        l0.p(atMost, "$this$atMost");
        DimensionDescription dimensionDescription = (DimensionDescription) atMost;
        dimensionDescription.m6353setMaxYLDhkOg(Dp.m6042boximpl(f5));
        return dimensionDescription;
    }

    public static final void buildMapping(@l State state, @l List<? extends Measurable> measurables) {
        l0.p(state, "state");
        l0.p(measurables, "measurables");
        int size = measurables.size() - 1;
        if (size >= 0) {
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                Measurable measurable = measurables.get(i5);
                Object layoutId = LayoutIdKt.getLayoutId(measurable);
                if (layoutId == null && (layoutId = ConstraintLayoutTagKt.getConstraintLayoutId(measurable)) == null) {
                    layoutId = createId();
                }
                state.map(layoutId, measurable);
                Object constraintLayoutTag = ConstraintLayoutTagKt.getConstraintLayoutTag(measurable);
                if (constraintLayoutTag != null && (constraintLayoutTag instanceof String) && (layoutId instanceof String)) {
                    state.setTag((String) layoutId, (String) constraintLayoutTag);
                }
                if (i6 <= size) {
                    i5 = i6;
                } else {
                    return;
                }
            }
        }
    }

    @l
    public static final Object createId() {
        return new Object() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$createId$1
        };
    }

    @l
    public static final Dimension.MaxCoercible getAtLeastWrapContent(@l Dimension.Coercible coercible) {
        l0.p(coercible, "<this>");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.setMinSymbol(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
        return dimensionDescription;
    }

    @l
    public static final Dimension.MinCoercible getAtMostWrapContent(@l Dimension.Coercible coercible) {
        l0.p(coercible, "<this>");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.setMaxSymbol(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
        return dimensionDescription;
    }

    @l
    @Composable
    @a1
    public static final u0<MeasurePolicy, v3.a<r2>> rememberConstraintLayoutMeasurePolicy(final int i5, @l ConstraintLayoutScope scope, @l final MutableState<Boolean> remeasureRequesterState, @l final Measurer measurer, @m Composer composer, int i6) {
        l0.p(scope, "scope");
        l0.p(remeasureRequesterState, "remeasureRequesterState");
        l0.p(measurer, "measurer");
        composer.startReplaceableGroup(-441911751);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new ConstraintSetForInlineDsl(scope);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) rememberedValue;
        Integer valueOf = Integer.valueOf(i5);
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(valueOf);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = q1.a(new MeasurePolicy() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i7) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i7);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i7) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i7);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @l
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo30measure3p2s80s(@l MeasureScope MeasurePolicy, @l List<? extends Measurable> measurables, long j5) {
                    MeasureResult layout$default;
                    l0.p(MeasurePolicy, "$this$MeasurePolicy");
                    l0.p(measurables, "measurables");
                    long m6359performMeasureDjhGOtQ = Measurer.this.m6359performMeasureDjhGOtQ(j5, MeasurePolicy.getLayoutDirection(), constraintSetForInlineDsl, measurables, i5, MeasurePolicy);
                    remeasureRequesterState.getValue();
                    layout$default = MeasureScope.layout$default(MeasurePolicy, IntSize.m6214getWidthimpl(m6359performMeasureDjhGOtQ), IntSize.m6213getHeightimpl(m6359performMeasureDjhGOtQ), null, new ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1$measure$1(Measurer.this, measurables), 4, null);
                    return layout$default;
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i7) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i7);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i7) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i7);
                }
            }, new ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$onHelpersChanged$1(remeasureRequesterState, constraintSetForInlineDsl));
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        u0<MeasurePolicy, v3.a<r2>> u0Var = (u0) rememberedValue2;
        composer.endReplaceableGroup();
        return u0Var;
    }

    public static final String toDebugString(ConstraintWidget constraintWidget) {
        return ((Object) constraintWidget.getDebugName()) + " width " + constraintWidget.getWidth() + " minWidth " + constraintWidget.getMinWidth() + " maxWidth " + constraintWidget.getMaxWidth() + " height " + constraintWidget.getHeight() + " minHeight " + constraintWidget.getMinHeight() + " maxHeight " + constraintWidget.getMaxHeight() + " HDB " + constraintWidget.getHorizontalDimensionBehaviour() + " VDB " + constraintWidget.getVerticalDimensionBehaviour() + " MCW " + constraintWidget.mMatchConstraintDefaultWidth + " MCH " + constraintWidget.mMatchConstraintDefaultHeight + " percentW " + constraintWidget.mMatchConstraintPercentWidth + " percentH " + constraintWidget.mMatchConstraintPercentHeight;
    }

    public static final String toDebugString(BasicMeasure.Measure measure) {
        return "measure strategy is ";
    }

    @l
    /* renamed from: atLeast-3ABfNKs */
    public static final Dimension m6344atLeast3ABfNKs(@l Dimension.MinCoercible atLeast, float f5) {
        l0.p(atLeast, "$this$atLeast");
        DimensionDescription dimensionDescription = (DimensionDescription) atLeast;
        dimensionDescription.m6354setMinYLDhkOg(Dp.m6042boximpl(f5));
        return dimensionDescription;
    }

    @l
    /* renamed from: atMost-3ABfNKs */
    public static final Dimension m6347atMost3ABfNKs(@l Dimension.MaxCoercible atMost, float f5) {
        l0.p(atMost, "$this$atMost");
        DimensionDescription dimensionDescription = (DimensionDescription) atMost;
        dimensionDescription.m6353setMaxYLDhkOg(Dp.m6042boximpl(f5));
        return dimensionDescription;
    }

    @l
    public static final Dimension getAtLeastWrapContent(@l Dimension.MinCoercible minCoercible) {
        l0.p(minCoercible, "<this>");
        DimensionDescription dimensionDescription = (DimensionDescription) minCoercible;
        dimensionDescription.setMinSymbol(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
        return dimensionDescription;
    }

    @l
    public static final Dimension getAtMostWrapContent(@l Dimension.MaxCoercible maxCoercible) {
        l0.p(maxCoercible, "<this>");
        DimensionDescription dimensionDescription = (DimensionDescription) maxCoercible;
        dimensionDescription.setMaxSymbol(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
        return dimensionDescription;
    }

    @l
    public static final ConstraintSet ConstraintSet(@l @d("json5") String jsonContent) {
        l0.p(jsonContent, "jsonContent");
        return new JSONConstraintSet(jsonContent, null, null, 6, null);
    }

    @l
    public static final ConstraintSet ConstraintSet(@l ConstraintSet extendConstraintSet, @l @d("json5") String jsonContent) {
        l0.p(extendConstraintSet, "extendConstraintSet");
        l0.p(jsonContent, "jsonContent");
        return new JSONConstraintSet(jsonContent, null, extendConstraintSet, 2, null);
    }

    @l
    public static final ConstraintSet ConstraintSet(@l v3.l<? super ConstraintSetScope, r2> description) {
        l0.p(description, "description");
        return new DslConstraintSet(description, null, 2, null);
    }

    @l
    public static final ConstraintSet ConstraintSet(@l ConstraintSet extendConstraintSet, @l v3.l<? super ConstraintSetScope, r2> description) {
        l0.p(extendConstraintSet, "extendConstraintSet");
        l0.p(description, "description");
        return new DslConstraintSet(description, extendConstraintSet);
    }

    @l
    @Composable
    @a1
    public static final MeasurePolicy rememberConstraintLayoutMeasurePolicy(final int i5, @l MutableState<Long> needsUpdate, @l final ConstraintSet constraintSet, @l final Measurer measurer, @m Composer composer, int i6) {
        l0.p(needsUpdate, "needsUpdate");
        l0.p(constraintSet, "constraintSet");
        l0.p(measurer, "measurer");
        composer.startReplaceableGroup(-441904452);
        Integer valueOf = Integer.valueOf(i5);
        Long value = needsUpdate.getValue();
        composer.startReplaceableGroup(-3686095);
        boolean changed = composer.changed(value) | composer.changed(valueOf) | composer.changed(constraintSet);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            measurer.parseDesignElements(constraintSet);
            rememberedValue = new MeasurePolicy() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$2$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i7) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i7);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i7) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i7);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @l
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo30measure3p2s80s(@l MeasureScope MeasurePolicy, @l List<? extends Measurable> measurables, long j5) {
                    MeasureResult layout$default;
                    l0.p(MeasurePolicy, "$this$MeasurePolicy");
                    l0.p(measurables, "measurables");
                    long m6359performMeasureDjhGOtQ = Measurer.this.m6359performMeasureDjhGOtQ(j5, MeasurePolicy.getLayoutDirection(), constraintSet, measurables, i5, MeasurePolicy);
                    layout$default = MeasureScope.layout$default(MeasurePolicy, IntSize.m6214getWidthimpl(m6359performMeasureDjhGOtQ), IntSize.m6213getHeightimpl(m6359performMeasureDjhGOtQ), null, new ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$2$1$measure$1(Measurer.this, measurables), 4, null);
                    return layout$default;
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i7) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i7);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i7) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i7);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    public static final void ConstraintLayout(@l ConstraintSet constraintSet, @m Modifier modifier, int i5, boolean z4, @m AnimationSpec<Float> animationSpec, @m v3.a<r2> aVar, @l p<? super Composer, ? super Integer, r2> content, @m Composer composer, int i6, int i7) {
        l0.p(constraintSet, "constraintSet");
        l0.p(content, "content");
        composer.startReplaceableGroup(-270262697);
        Modifier modifier2 = (i7 & 2) != 0 ? Modifier.Companion : modifier;
        int i8 = (i7 & 4) != 0 ? 257 : i5;
        boolean z5 = (i7 & 8) != 0 ? false : z4;
        AnimationSpec<Float> tween$default = (i7 & 16) != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : animationSpec;
        v3.a<r2> aVar2 = (i7 & 32) != 0 ? null : aVar;
        if (z5) {
            composer.startReplaceableGroup(-270262314);
            composer.startReplaceableGroup(-3687241);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            composer.startReplaceableGroup(-3687241);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) rememberedValue2;
            composer.startReplaceableGroup(-3687241);
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            Animatable animatable = (Animatable) rememberedValue3;
            composer.startReplaceableGroup(-3687241);
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = o.d(-1, null, null, 6, null);
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceableGroup();
            kotlinx.coroutines.channels.l lVar = (kotlinx.coroutines.channels.l) rememberedValue4;
            composer.startReplaceableGroup(-3687241);
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);
                composer.updateRememberedValue(rememberedValue5);
            }
            composer.endReplaceableGroup();
            EffectsKt.SideEffect(new ConstraintLayoutKt$ConstraintLayout$3(lVar, constraintSet), composer, 0);
            EffectsKt.LaunchedEffect(lVar, new ConstraintLayoutKt$ConstraintLayout$4(lVar, (MutableState) rememberedValue5, animatable, tween$default, aVar2, mutableState, mutableState2, null), composer, 8);
            ConstraintSet m6336ConstraintLayout$lambda6 = m6336ConstraintLayout$lambda6(mutableState);
            ConstraintSet m6338ConstraintLayout$lambda9 = m6338ConstraintLayout$lambda9(mutableState2);
            float floatValue = ((Number) animatable.getValue()).floatValue();
            int i9 = (i6 << 12) & 458752;
            composer.startReplaceableGroup(-1330873847);
            MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
            EnumSet of = EnumSet.of(motionLayoutDebugFlags);
            l0.o(of, "of(MotionLayoutDebugFlags.NONE)");
            int i10 = (i9 & 7168) | (i9 & 14) | 229376 | (i9 & 112) | (i9 & 896);
            int i11 = i9 << 3;
            int i12 = (i11 & 234881024) | i10 | (i11 & 3670016) | (i11 & 29360128);
            composer.startReplaceableGroup(-1330870962);
            int i13 = (i12 & 14) | 32768 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024);
            composer.startReplaceableGroup(-1401224268);
            composer.startReplaceableGroup(-3687241);
            Object rememberedValue6 = composer.rememberedValue();
            if (rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = new MotionMeasurer();
                composer.updateRememberedValue(rememberedValue6);
            }
            composer.endReplaceableGroup();
            MotionMeasurer motionMeasurer = (MotionMeasurer) rememberedValue6;
            composer.startReplaceableGroup(-3687241);
            Object rememberedValue7 = composer.rememberedValue();
            if (rememberedValue7 == companion.getEmpty()) {
                rememberedValue7 = new MotionLayoutScope(motionMeasurer);
                composer.updateRememberedValue(rememberedValue7);
            }
            composer.endReplaceableGroup();
            MotionLayoutScope motionLayoutScope = (MotionLayoutScope) rememberedValue7;
            composer.startReplaceableGroup(-3687241);
            Object rememberedValue8 = composer.rememberedValue();
            if (rememberedValue8 == companion.getEmpty()) {
                rememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composer.updateRememberedValue(rememberedValue8);
            }
            composer.endReplaceableGroup();
            MutableState mutableState3 = (MutableState) rememberedValue8;
            mutableState3.setValue(Float.valueOf(floatValue));
            int i14 = i13 << 9;
            MeasurePolicy rememberMotionLayoutMeasurePolicy = MotionLayoutKt.rememberMotionLayoutMeasurePolicy(257, of, 0L, m6336ConstraintLayout$lambda6, m6338ConstraintLayout$lambda9, null, mutableState3, motionMeasurer, composer, ((i13 >> 21) & 14) | 18350528 | (i14 & 7168) | (57344 & i14) | (i14 & 458752));
            motionMeasurer.addLayoutInformationReceiver(null);
            float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
            if (of.contains(motionLayoutDebugFlags) && Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-1401222327);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new MotionLayoutKt$MotionLayoutCore$4(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819896774, true, new ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayout$2(motionLayoutScope, i13, content, i6)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
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
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819900388, true, new ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayout$1(motionLayoutScope, i13, content, i6)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
                if (!Float.isNaN(forcedScaleFactor)) {
                    composer.startReplaceableGroup(-922833881);
                    motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-922833807);
                    composer.endReplaceableGroup();
                }
                if (!of.contains(motionLayoutDebugFlags)) {
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
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-270260906);
            composer.startReplaceableGroup(-3687241);
            Object rememberedValue9 = composer.rememberedValue();
            Composer.Companion companion4 = Composer.Companion;
            if (rememberedValue9 == companion4.getEmpty()) {
                rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
                composer.updateRememberedValue(rememberedValue9);
            }
            composer.endReplaceableGroup();
            MutableState<Long> mutableState4 = (MutableState) rememberedValue9;
            composer.startReplaceableGroup(-3687241);
            Object rememberedValue10 = composer.rememberedValue();
            if (rememberedValue10 == companion4.getEmpty()) {
                rememberedValue10 = new Measurer();
                composer.updateRememberedValue(rememberedValue10);
            }
            composer.endReplaceableGroup();
            Measurer measurer = (Measurer) rememberedValue10;
            Modifier modifier3 = modifier2;
            MeasurePolicy rememberConstraintLayoutMeasurePolicy = rememberConstraintLayoutMeasurePolicy(i8, mutableState4, constraintSet, measurer, composer, ((i6 >> 6) & 14) | 4144 | ((i6 << 6) & 896));
            if (constraintSet instanceof EditableJSONLayout) {
                ((EditableJSONLayout) constraintSet).setUpdateFlag(mutableState4);
            }
            measurer.addLayoutInformationReceiver(constraintSet instanceof LayoutInformationReceiver ? (LayoutInformationReceiver) constraintSet : null);
            float forcedScaleFactor2 = measurer.getForcedScaleFactor();
            if (!Float.isNaN(forcedScaleFactor2)) {
                composer.startReplaceableGroup(-270260292);
                Modifier scale = ScaleKt.scale(modifier3, measurer.getForcedScaleFactor());
                composer.startReplaceableGroup(-1990474327);
                Modifier.Companion companion5 = Modifier.Companion;
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(1376089335);
                Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                v3.a<ComposeUiNode> constructor2 = companion6.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> materializerOf2 = LayoutKt.materializerOf(companion5);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer m3264constructorimpl2 = Updater.m3264constructorimpl(composer);
                Updater.m3271setimpl(m3264constructorimpl2, rememberBoxMeasurePolicy2, companion6.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl2, density2, companion6.getSetDensity());
                Updater.m3271setimpl(m3264constructorimpl2, layoutDirection2, companion6.getSetLayoutDirection());
                composer.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                composer.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(scale, false, new ConstraintLayoutKt$ConstraintLayout$6$1(measurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819900598, true, new ConstraintLayoutKt$ConstraintLayout$6$2(measurer, content, i6)), rememberConstraintLayoutMeasurePolicy, composer, 48, 0);
                measurer.drawDebugBounds(boxScopeInstance2, forcedScaleFactor2, composer, 518);
                r2 r2Var2 = r2.f19517a;
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-270259702);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier3, false, new ConstraintLayoutKt$ConstraintLayout$7(measurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819901122, true, new ConstraintLayoutKt$ConstraintLayout$8(measurer, content, i6)), rememberConstraintLayoutMeasurePolicy, composer, 48, 0);
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
    }
}
