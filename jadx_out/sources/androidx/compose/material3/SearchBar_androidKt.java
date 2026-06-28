package androidx.compose.material3;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.Strings;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.profileinstaller.ProfileVerifier;
import com.huawei.hms.actions.SearchIntents;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u009a\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0091\u0002\u0010!\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\r¢\u0006\u0002\b\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0087\u0002\u0010$\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\r¢\u0006\u0002\b\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001aÈ\u0001\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0014\u001a\u00020%2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b&\u0010'\"\u001a\u0010(\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\f\n\u0004\b(\u0010)\u0012\u0004\b*\u0010+\"\u001a\u0010,\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010.\"\u0014\u00100\u001a\u00020/8\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010)\"\u001a\u00101\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b2\u0010.\"\u0014\u00103\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010)\"\u001a\u00104\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u0010.\"\u0014\u00106\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010)\"\u0014\u00108\u001a\u0002078\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00109\"\u0014\u0010:\u001a\u0002078\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u00109\"\u0014\u0010;\u001a\u0002078\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u00109\"\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>\"\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>\"\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020/0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B\"\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020/0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010B\"\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010B\"\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020D0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010B\"\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I\"\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006O²\u0006\f\u0010M\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010N\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"", SearchIntents.EXTRA_QUERY, "Lkotlin/Function1;", "Lkotlin/r2;", "onQueryChange", "onSearch", "", "active", "onActiveChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/SearchBarColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/u;", "content", "SearchBar-WuY5d9Q", "(Ljava/lang/String;Lv3/l;Lv3/l;ZLv3/l;Landroidx/compose/ui/Modifier;ZLv3/p;Lv3/p;Lv3/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/q;Landroidx/compose/runtime/Composer;III)V", "SearchBar", "DockedSearchBar-eWTbjVg", "(Ljava/lang/String;Lv3/l;Lv3/l;ZLv3/l;Landroidx/compose/ui/Modifier;ZLv3/p;Lv3/p;Lv3/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/q;Landroidx/compose/runtime/Composer;III)V", "DockedSearchBar", "Landroidx/compose/material3/TextFieldColors;", "SearchBarInputField", "(Ljava/lang/String;Lv3/l;Lv3/l;ZLv3/l;Landroidx/compose/ui/Modifier;ZLv3/p;Lv3/p;Lv3/p;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "SearchBarCornerRadius", "F", "getSearchBarCornerRadius$annotations", "()V", "DockedActiveTableMinHeight", "getDockedActiveTableMinHeight", "()F", "", "DockedActiveTableMaxHeightScreenRatio", "SearchBarMinWidth", "getSearchBarMinWidth", "SearchBarMaxWidth", "SearchBarVerticalPadding", "getSearchBarVerticalPadding", "SearchBarIconOffsetX", "", "AnimationEnterDurationMillis", "I", "AnimationExitDurationMillis", "AnimationDelayMillis", "Landroidx/compose/animation/core/CubicBezierEasing;", "AnimationEnterEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "AnimationExitEasing", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "AnimationEnterFloatSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "AnimationExitFloatSpec", "Landroidx/compose/ui/unit/IntSize;", "AnimationEnterSizeSpec", "AnimationExitSizeSpec", "Landroidx/compose/animation/EnterTransition;", "DockedEnterTransition", "Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/ExitTransition;", "DockedExitTransition", "Landroidx/compose/animation/ExitTransition;", "useFullScreenShape", "showResults", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,741:1\n1116#2,6:742\n1116#2,6:750\n1116#2,6:756\n1116#2,6:762\n1116#2,6:768\n1116#2,6:774\n1116#2,6:780\n1116#2,6:786\n1116#2,6:792\n1116#2,6:798\n1116#2,6:805\n1116#2,6:811\n1116#2,6:817\n1116#2,6:823\n1116#2,6:834\n1116#2,6:840\n1116#2,6:847\n74#3:748\n74#3:749\n74#3:804\n74#3:831\n74#3:846\n60#4:829\n62#4:830\n658#5:832\n646#5:833\n81#6:853\n75#7:854\n154#8:855\n154#8:856\n154#8:857\n154#8:858\n154#8:859\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt\n*L\n176#1:742,6\n189#1:750,6\n192#1:756,6\n212#1:762,6\n213#1:768,6\n228#1:774,6\n232#1:780,6\n287#1:786,6\n296#1:792,6\n363#1:798,6\n416#1:805,6\n425#1:811,6\n444#1:817,6\n446#1:823,6\n460#1:834,6\n461#1:840,6\n476#1:847,6\n184#1:748\n185#1:749\n366#1:804\n449#1:831\n473#1:846\n447#1:829\n448#1:830\n449#1:832\n449#1:833\n189#1:853\n702#1:854\n703#1:855\n705#1:856\n706#1:857\n707#1:858\n709#1:859\n*E\n"})
/* loaded from: classes.dex */
public final class SearchBar_androidKt {
    private static final int AnimationDelayMillis = 100;
    private static final int AnimationEnterDurationMillis = 600;

    @p4.l
    private static final CubicBezierEasing AnimationEnterEasing;

    @p4.l
    private static final FiniteAnimationSpec<Float> AnimationEnterFloatSpec;

    @p4.l
    private static final FiniteAnimationSpec<IntSize> AnimationEnterSizeSpec;
    private static final int AnimationExitDurationMillis = 350;

    @p4.l
    private static final CubicBezierEasing AnimationExitEasing;

    @p4.l
    private static final FiniteAnimationSpec<Float> AnimationExitFloatSpec;

    @p4.l
    private static final FiniteAnimationSpec<IntSize> AnimationExitSizeSpec;
    private static final float DockedActiveTableMaxHeightScreenRatio = 0.6666667f;

    @p4.l
    private static final EnterTransition DockedEnterTransition;

    @p4.l
    private static final ExitTransition DockedExitTransition;
    private static final float SearchBarCornerRadius = Dp.m6044constructorimpl(SearchBarDefaults.INSTANCE.m2120getInputFieldHeightD9Ej5fM() / 2);
    private static final float DockedActiveTableMinHeight = Dp.m6044constructorimpl(240);
    private static final float SearchBarMinWidth = Dp.m6044constructorimpl(360);
    private static final float SearchBarMaxWidth = Dp.m6044constructorimpl(720);
    private static final float SearchBarVerticalPadding = Dp.m6044constructorimpl(8);
    private static final float SearchBarIconOffsetX = Dp.m6044constructorimpl(4);

    static {
        CubicBezierEasing easingEmphasizedDecelerateCubicBezier = MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier();
        AnimationEnterEasing = easingEmphasizedDecelerateCubicBezier;
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.0f, 1.0f, 0.0f, 1.0f);
        AnimationExitEasing = cubicBezierEasing;
        TweenSpec tween = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterFloatSpec = tween;
        TweenSpec tween2 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitFloatSpec = tween2;
        TweenSpec tween3 = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterSizeSpec = tween3;
        TweenSpec tween4 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitSizeSpec = tween4;
        DockedEnterTransition = EnterExitTransitionKt.fadeIn$default(tween, 0.0f, 2, null).plus(EnterExitTransitionKt.expandVertically$default(tween3, null, false, null, 14, null));
        DockedExitTransition = EnterExitTransitionKt.fadeOut$default(tween2, 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkVertically$default(tween4, null, false, null, 14, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03df  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: DockedSearchBar-eWTbjVg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2125DockedSearchBareWTbjVg(@p4.l java.lang.String r44, @p4.l v3.l<? super java.lang.String, kotlin.r2> r45, @p4.l v3.l<? super java.lang.String, kotlin.r2> r46, boolean r47, @p4.l v3.l<? super java.lang.Boolean, kotlin.r2> r48, @p4.m androidx.compose.ui.Modifier r49, boolean r50, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r51, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r52, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r53, @p4.m androidx.compose.ui.graphics.Shape r54, @p4.m androidx.compose.material3.SearchBarColors r55, float r56, float r57, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r58, @p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r59, @p4.m androidx.compose.runtime.Composer r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 1145
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt.m2125DockedSearchBareWTbjVg(java.lang.String, v3.l, v3.l, boolean, v3.l, androidx.compose.ui.Modifier, boolean, v3.p, v3.p, v3.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.foundation.interaction.MutableInteractionSource, v3.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x04af, code lost:
    
        if (r10.changed(r6) == false) goto L289;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x058b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0246  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: SearchBar-WuY5d9Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2126SearchBarWuY5d9Q(@p4.l java.lang.String r45, @p4.l v3.l<? super java.lang.String, kotlin.r2> r46, @p4.l v3.l<? super java.lang.String, kotlin.r2> r47, boolean r48, @p4.l v3.l<? super java.lang.Boolean, kotlin.r2> r49, @p4.m androidx.compose.ui.Modifier r50, boolean r51, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r52, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r53, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r54, @p4.m androidx.compose.ui.graphics.Shape r55, @p4.m androidx.compose.material3.SearchBarColors r56, float r57, float r58, @p4.m androidx.compose.foundation.layout.WindowInsets r59, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r60, @p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r61, @p4.m androidx.compose.runtime.Composer r62, int r63, int r64, int r65) {
        /*
            Method dump skipped, instructions count: 1602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt.m2126SearchBarWuY5d9Q(java.lang.String, v3.l, v3.l, boolean, v3.l, androidx.compose.ui.Modifier, boolean, v3.p, v3.p, v3.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.foundation.interaction.MutableInteractionSource, v3.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void SearchBarInputField(String str, v3.l<? super String, r2> lVar, v3.l<? super String, r2> lVar2, boolean z4, v3.l<? super Boolean, r2> lVar3, Modifier modifier, boolean z5, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i5, int i6, int i7) {
        int i8;
        boolean z6;
        int i9;
        TextFieldColors textFieldColors2;
        MutableInteractionSource mutableInteractionSource2;
        v3.p<? super Composer, ? super Integer, r2> pVar4;
        v3.p<? super Composer, ? super Integer, r2> pVar5;
        Modifier modifier2;
        v3.p<? super Composer, ? super Integer, r2> pVar6;
        boolean z7;
        int i10;
        Composer composer2;
        boolean z8;
        v3.p<? super Composer, ? super Integer, r2> pVar7;
        v3.p<? super Composer, ? super Integer, r2> pVar8;
        v3.p<? super Composer, ? super Integer, r2> pVar9;
        MutableInteractionSource mutableInteractionSource3;
        TextFieldColors textFieldColors3;
        Modifier modifier3;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(496394889);
        if ((i7 & 1) != 0) {
            i8 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i8 = (startRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        if ((i7 & 2) != 0) {
            i8 |= 48;
        } else if ((i5 & 48) == 0) {
            i8 |= startRestartGroup.changedInstance(lVar) ? 32 : 16;
        }
        if ((i7 & 4) != 0) {
            i8 |= 384;
        } else if ((i5 & 384) == 0) {
            i8 |= startRestartGroup.changedInstance(lVar2) ? 256 : 128;
        }
        if ((i7 & 8) != 0) {
            i8 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i8 |= startRestartGroup.changed(z4) ? 2048 : 1024;
        }
        if ((i7 & 16) != 0) {
            i8 |= 24576;
        } else if ((i5 & 24576) == 0) {
            i8 |= startRestartGroup.changedInstance(lVar3) ? 16384 : 8192;
        }
        int i12 = i7 & 32;
        if (i12 != 0) {
            i8 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i8 |= startRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        int i13 = i7 & 64;
        if (i13 != 0) {
            i8 |= 1572864;
            z6 = z5;
        } else {
            z6 = z5;
            if ((i5 & 1572864) == 0) {
                i8 |= startRestartGroup.changed(z6) ? 1048576 : 524288;
            }
        }
        int i14 = i7 & 128;
        if (i14 != 0) {
            i8 |= 12582912;
        } else if ((i5 & 12582912) == 0) {
            i8 |= startRestartGroup.changedInstance(pVar) ? 8388608 : 4194304;
        }
        int i15 = i7 & 256;
        if (i15 != 0) {
            i8 |= 100663296;
        } else if ((i5 & 100663296) == 0) {
            i8 |= startRestartGroup.changedInstance(pVar2) ? 67108864 : 33554432;
        }
        int i16 = i7 & 512;
        if (i16 != 0) {
            i8 |= 805306368;
        } else if ((i5 & 805306368) == 0) {
            i8 |= startRestartGroup.changedInstance(pVar3) ? 536870912 : 268435456;
        }
        if ((i6 & 6) == 0) {
            if ((i7 & 1024) == 0 && startRestartGroup.changed(textFieldColors)) {
                i11 = 4;
                i9 = i6 | i11;
            }
            i11 = 2;
            i9 = i6 | i11;
        } else {
            i9 = i6;
        }
        int i17 = i7 & 2048;
        if (i17 != 0) {
            i9 |= 48;
        } else if ((i6 & 48) == 0) {
            i9 |= startRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
        }
        int i18 = i9;
        if ((i8 & 306783379) == 306783378 && (i18 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier;
            pVar7 = pVar;
            pVar8 = pVar2;
            pVar9 = pVar3;
            textFieldColors3 = textFieldColors;
            mutableInteractionSource3 = mutableInteractionSource;
            composer2 = startRestartGroup;
            z8 = z6;
        } else {
            startRestartGroup.startDefaults();
            if ((i5 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i7 & 1024) != 0) {
                    i18 &= -15;
                }
                modifier2 = modifier;
                pVar5 = pVar;
                pVar6 = pVar2;
                pVar4 = pVar3;
                mutableInteractionSource2 = mutableInteractionSource;
                z7 = z6;
                i10 = i18;
                textFieldColors2 = textFieldColors;
            } else {
                Modifier modifier4 = i12 != 0 ? Modifier.Companion : modifier;
                boolean z9 = i13 != 0 ? true : z6;
                v3.p<? super Composer, ? super Integer, r2> pVar10 = i14 != 0 ? null : pVar;
                v3.p<? super Composer, ? super Integer, r2> pVar11 = i15 != 0 ? null : pVar2;
                v3.p<? super Composer, ? super Integer, r2> pVar12 = i16 != 0 ? null : pVar3;
                if ((i7 & 1024) != 0) {
                    textFieldColors2 = SearchBarDefaults.INSTANCE.m2124inputFieldColorsITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 24576, 16383);
                    i18 &= -15;
                } else {
                    textFieldColors2 = textFieldColors;
                }
                if (i17 != 0) {
                    startRestartGroup.startReplaceableGroup(462567468);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    pVar4 = pVar12;
                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    pVar4 = pVar12;
                }
                pVar5 = pVar10;
                modifier2 = modifier4;
                pVar6 = pVar11;
                z7 = z9;
                i10 = i18;
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(496394889, i8, i10, "androidx.compose.material3.SearchBarInputField (SearchBar.android.kt:444)");
            }
            startRestartGroup.startReplaceableGroup(462567538);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue2;
            startRestartGroup.endReplaceableGroup();
            Strings.Companion companion2 = Strings.Companion;
            String m2294getStringNWtq28 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_search_bar_search), startRestartGroup, 0);
            String m2294getStringNWtq282 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_suggestions_available), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(462567758);
            long m5575getColor0d7_KjU = ((TextStyle) startRestartGroup.consume(TextKt.getLocalTextStyle())).m5575getColor0d7_KjU();
            if (!(m5575getColor0d7_KjU != Color.Companion.m3770getUnspecified0d7_KjU())) {
                m5575getColor0d7_KjU = textFieldColors2.textColor$material3_release(z7, false, mutableInteractionSource2, startRestartGroup, ((i10 << 9) & 7168) | ((i8 >> 18) & 14) | 48 | ((i10 << 3) & 896)).getValue().m3744unboximpl();
            }
            long j5 = m5575getColor0d7_KjU;
            startRestartGroup.endReplaceableGroup();
            Modifier modifier5 = modifier2;
            Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(SizeKt.m588height3ABfNKs(modifier2, SearchBarDefaults.INSTANCE.m2120getInputFieldHeightD9Ej5fM()), 0.0f, 1, null), focusRequester);
            startRestartGroup.startReplaceableGroup(462568122);
            boolean z10 = (57344 & i8) == 16384;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z10 || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new SearchBar_androidKt$SearchBarInputField$2$1(lVar3);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier onFocusChanged = FocusChangedModifierKt.onFocusChanged(focusRequester2, (v3.l) rememberedValue3);
            startRestartGroup.startReplaceableGroup(462568188);
            boolean changed = startRestartGroup.changed(m2294getStringNWtq28) | ((i8 & 7168) == 2048) | startRestartGroup.changed(m2294getStringNWtq282);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new SearchBar_androidKt$SearchBarInputField$3$1(m2294getStringNWtq28, z4, m2294getStringNWtq282, focusRequester);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier semantics$default = SemanticsModifierKt.semantics$default(onFocusChanged, false, (v3.l) rememberedValue4, 1, null);
            TextStyle merge = ((TextStyle) startRestartGroup.consume(TextKt.getLocalTextStyle())).merge(new TextStyle(j5, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (kotlin.jvm.internal.w) null));
            SolidColor solidColor = new SolidColor(textFieldColors2.cursorColor$material3_release(false, startRestartGroup, ((i10 << 3) & 112) | 6).getValue().m3744unboximpl(), null);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, 0, ImeAction.Companion.m5727getSearcheUduSuo(), null, 23, null);
            startRestartGroup.startReplaceableGroup(462568831);
            int i19 = i8 & 14;
            boolean z11 = ((i8 & 896) == 256) | (i19 == 4);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new SearchBar_androidKt$SearchBarInputField$4$1(lVar2, str);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            startRestartGroup.endReplaceableGroup();
            int i20 = i8;
            TextFieldColors textFieldColors4 = textFieldColors2;
            composer2 = startRestartGroup;
            BasicTextFieldKt.BasicTextField(str, lVar, semantics$default, z7, false, merge, keyboardOptions, new KeyboardActions(null, null, null, null, (v3.l) rememberedValue5, null, 47, null), true, 0, 0, (VisualTransformation) null, (v3.l<? super TextLayoutResult, r2>) null, mutableInteractionSource2, (Brush) solidColor, (v3.q<? super v3.p<? super Composer, ? super Integer, r2>, ? super Composer, ? super Integer, r2>) ComposableLambdaKt.composableLambda(startRestartGroup, -951844929, true, new SearchBar_androidKt$SearchBarInputField$5(str, z7, mutableInteractionSource2, pVar5, pVar6, pVar4, textFieldColors2)), composer2, i19 | 102236160 | (i20 & 112) | ((i20 >> 9) & 7168), ((i10 << 6) & 7168) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 7696);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z8 = z7;
            pVar7 = pVar5;
            pVar8 = pVar6;
            pVar9 = pVar4;
            mutableInteractionSource3 = mutableInteractionSource2;
            textFieldColors3 = textFieldColors4;
            modifier3 = modifier5;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SearchBar_androidKt$SearchBarInputField$6(str, lVar, lVar2, z4, lVar3, modifier3, z8, pVar7, pVar8, pVar9, textFieldColors3, mutableInteractionSource3, i5, i6, i7));
        }
    }

    private static final boolean SearchBar_WuY5d9Q$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    public static final float getDockedActiveTableMinHeight() {
        return DockedActiveTableMinHeight;
    }

    private static /* synthetic */ void getSearchBarCornerRadius$annotations() {
    }

    public static final float getSearchBarMinWidth() {
        return SearchBarMinWidth;
    }

    public static final float getSearchBarVerticalPadding() {
        return SearchBarVerticalPadding;
    }
}
