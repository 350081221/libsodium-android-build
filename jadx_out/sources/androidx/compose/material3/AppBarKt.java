package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0081\u0001\u0010\u0011\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0081\u0001\u0010\u0013\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u0081\u0001\u0010\u0014\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0012\u001a\u0081\u0001\u0010\u0015\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0012\u001a\u0081\u0001\u0010\u0016\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0012\u001a\u0083\u0001\u0010!\u001a\u00020\u00012\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u008f\u0001\u0010!\u001a\u00020\u00012\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\"H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001al\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001ax\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\"2\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a-\u0010/\u001a\u00020.2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020*2\b\b\u0002\u0010-\u001a\u00020*H\u0007¢\u0006\u0004\b/\u00100\u001a-\u00102\u001a\u0002012\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020*2\b\b\u0002\u0010-\u001a\u00020*H\u0007¢\u0006\u0004\b2\u00103\u001a \u00104\u001a\u0002012\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020*H\u0007\u001a@\u0010<\u001a\u00020;2\u0006\u00105\u001a\u0002012\u0006\u00106\u001a\u00020*2\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020*\u0018\u0001072\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020*\u0018\u000109H\u0083@¢\u0006\u0004\b<\u0010=\u001a\u0087\u0001\u0010B\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0003¢\u0006\u0004\bB\u0010C\u001aµ\u0001\u0010K\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010?\u001a\u00020>2\u0006\u0010D\u001a\u00020\u001b2\u0011\u0010E\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010F\u001a\u00020>2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010G\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020\u001b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0003ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001a£\u0001\u0010Y\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010L\u001a\u00020*2\u0006\u0010M\u001a\u00020\u00182\u0006\u0010N\u001a\u00020\u00182\u0006\u0010O\u001a\u00020\u00182\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010?\u001a\u00020>2\u0006\u0010P\u001a\u00020*2\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S2\u0006\u0010D\u001a\u00020U2\u0006\u0010V\u001a\u00020@2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a@\u0010Z\u001a\u00020;2\u0006\u00105\u001a\u00020.2\u0006\u00106\u001a\u00020*2\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020*\u0018\u0001072\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020*\u0018\u000109H\u0082@¢\u0006\u0004\bZ\u0010[\"\u0014\u0010\\\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]\"\u001a\u0010^\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b^\u0010]\u001a\u0004\b_\u0010`\"\u0014\u0010a\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010]\"\u0014\u0010b\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010]\"\u001a\u0010d\u001a\u00020c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0014\u0010h\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010]\"\u0014\u0010i\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010]\"\u0014\u0010j\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010]\"\u0014\u0010k\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010]\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006m²\u0006\f\u0010l\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", com.alipay.sdk.m.x.d.f3030v, "Landroidx/compose/ui/Modifier;", "modifier", "navigationIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/u;", "actions", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/material3/TopAppBarColors;", "colors", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "scrollBehavior", "TopAppBar", "(Lv3/p;Landroidx/compose/ui/Modifier;Lv3/p;Lv3/q;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "SmallTopAppBar", "CenterAlignedTopAppBar", "MediumTopAppBar", "LargeTopAppBar", "floatingActionButton", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "BottomAppBar-Snr_uVM", "(Lv3/q;Landroidx/compose/ui/Modifier;Lv3/p;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar", "Landroidx/compose/material3/BottomAppBarScrollBehavior;", "BottomAppBar-qhFBPw4", "(Lv3/q;Landroidx/compose/ui/Modifier;Lv3/p;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/BottomAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "content", "BottomAppBar-1oL4kX8", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar-e-3WI5M", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/BottomAppBarScrollBehavior;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "", "initialHeightOffsetLimit", "initialHeightOffset", "initialContentOffset", "Landroidx/compose/material3/TopAppBarState;", "rememberTopAppBarState", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarState;", "Landroidx/compose/material3/BottomAppBarState;", "rememberBottomAppBarState", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomAppBarState;", "BottomAppBarState", "state", "velocity", "Landroidx/compose/animation/core/DecayAnimationSpec;", "flingAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "Landroidx/compose/ui/unit/Velocity;", "settleAppBarBottom", "(Landroidx/compose/material3/BottomAppBarState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/text/TextStyle;", "titleTextStyle", "", "centeredTitle", "SingleRowTopAppBar", "(Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/ui/text/TextStyle;ZLv3/p;Lv3/q;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "titleBottomPadding", "smallTitle", "smallTitleTextStyle", "maxHeight", "pinnedHeight", "TwoRowsTopAppBar-tjU4iQQ", "(Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/ui/text/TextStyle;FLv3/p;Landroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/q;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;FFLandroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;III)V", "TwoRowsTopAppBar", "heightPx", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "titleAlpha", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "titleVerticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "titleHorizontalArrangement", "", "hideTitleSemantics", "TopAppBarLayout-kXwM9vE", "(Landroidx/compose/ui/Modifier;FJJJLv3/p;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IZLv3/p;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "TopAppBarLayout", "settleAppBar", "(Landroidx/compose/material3/TopAppBarState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;", "BottomAppBarHorizontalPadding", "F", "BottomAppBarVerticalPadding", "getBottomAppBarVerticalPadding", "()F", "FABHorizontalPadding", "FABVerticalPadding", "Landroidx/compose/animation/core/CubicBezierEasing;", "TopTitleAlphaEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "getTopTitleAlphaEasing", "()Landroidx/compose/animation/core/CubicBezierEasing;", "MediumTitleBottomPadding", "LargeTitleBottomPadding", "TopAppBarHorizontalPadding", "TopAppBarTitleInset", "appBarContainerColor", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,2283:1\n1116#2,6:2284\n1116#2,6:2290\n1116#2,6:2296\n1116#2,6:2302\n1116#2,6:2308\n1116#2,6:2316\n1116#2,6:2322\n1116#2,6:2328\n1116#2,6:2335\n1116#2,6:2341\n1116#2,6:2347\n1116#2,6:2353\n74#3:2314\n74#3:2334\n1#4:2315\n78#5,11:2359\n78#5,11:2393\n91#5:2425\n78#5,11:2433\n91#5:2465\n78#5,11:2473\n91#5:2505\n91#5:2510\n456#6,8:2370\n464#6,3:2384\n456#6,8:2404\n464#6,3:2418\n467#6,3:2422\n456#6,8:2444\n464#6,3:2458\n467#6,3:2462\n456#6,8:2484\n464#6,3:2498\n467#6,3:2502\n467#6,3:2507\n3737#7,6:2378\n3737#7,6:2412\n3737#7,6:2452\n3737#7,6:2492\n68#8,6:2387\n74#8:2421\n78#8:2426\n68#8,6:2427\n74#8:2461\n78#8:2466\n68#8,6:2467\n74#8:2501\n78#8:2506\n81#9:2511\n154#10:2512\n154#10:2514\n154#10:2516\n154#10:2518\n154#10:2520\n154#10:2521\n154#10:2522\n154#10:2523\n58#11:2513\n58#11:2515\n58#11:2517\n58#11:2519\n58#11:2524\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt\n*L\n590#1:2284,6\n593#1:2290,6\n616#1:2296,6\n1053#1:2302,6\n1374#1:2308,6\n1641#1:2316,6\n1671#1:2322,6\n1674#1:2328,6\n1759#1:2335,6\n1792#1:2341,6\n1795#1:2347,6\n1937#1:2353,6\n1640#1:2314\n1751#1:2334\n1901#1:2359,11\n1903#1:2393,11\n1903#1:2425\n1913#1:2433,11\n1913#1:2465\n1925#1:2473,11\n1925#1:2505\n1901#1:2510\n1901#1:2370,8\n1901#1:2384,3\n1903#1:2404,8\n1903#1:2418,3\n1903#1:2422,3\n1913#1:2444,8\n1913#1:2458,3\n1913#1:2462,3\n1925#1:2484,8\n1925#1:2498,3\n1925#1:2502,3\n1901#1:2507,3\n1901#1:2378,6\n1903#1:2412,6\n1913#1:2452,6\n1925#1:2492,6\n1903#1:2387,6\n1903#1:2421\n1903#1:2426\n1913#1:2427,6\n1913#1:2461\n1913#1:2466\n1925#1:2467,6\n1925#1:2501\n1925#1:2506\n1653#1:2511\n1609#1:2512\n1610#1:2514\n1613#1:2516\n1614#1:2518\n2276#1:2520\n2277#1:2521\n2278#1:2522\n2282#1:2523\n1609#1:2513\n1610#1:2515\n1613#1:2517\n1614#1:2519\n2282#1:2524\n*E\n"})
/* loaded from: classes.dex */
public final class AppBarKt {
    private static final float BottomAppBarHorizontalPadding;
    private static final float BottomAppBarVerticalPadding;
    private static final float FABHorizontalPadding;
    private static final float FABVerticalPadding;
    private static final float LargeTitleBottomPadding;
    private static final float MediumTitleBottomPadding;
    private static final float TopAppBarHorizontalPadding;
    private static final float TopAppBarTitleInset;

    @p4.l
    private static final CubicBezierEasing TopTitleAlphaEasing;

    static {
        float f5 = 16;
        float f6 = 12;
        float m6044constructorimpl = Dp.m6044constructorimpl(Dp.m6044constructorimpl(f5) - Dp.m6044constructorimpl(f6));
        BottomAppBarHorizontalPadding = m6044constructorimpl;
        float m6044constructorimpl2 = Dp.m6044constructorimpl(Dp.m6044constructorimpl(f5) - Dp.m6044constructorimpl(f6));
        BottomAppBarVerticalPadding = m6044constructorimpl2;
        FABHorizontalPadding = Dp.m6044constructorimpl(Dp.m6044constructorimpl(f5) - m6044constructorimpl);
        FABVerticalPadding = Dp.m6044constructorimpl(Dp.m6044constructorimpl(f6) - m6044constructorimpl2);
        TopTitleAlphaEasing = new CubicBezierEasing(0.8f, 0.0f, 0.8f, 0.15f);
        MediumTitleBottomPadding = Dp.m6044constructorimpl(24);
        LargeTitleBottomPadding = Dp.m6044constructorimpl(28);
        float m6044constructorimpl3 = Dp.m6044constructorimpl(4);
        TopAppBarHorizontalPadding = m6044constructorimpl3;
        TopAppBarTitleInset = Dp.m6044constructorimpl(Dp.m6044constructorimpl(f5) - m6044constructorimpl3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0082  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomAppBar-1oL4kX8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1555BottomAppBar1oL4kX8(@p4.m androidx.compose.ui.Modifier r24, long r25, long r27, float r29, @p4.m androidx.compose.foundation.layout.PaddingValues r30, @p4.m androidx.compose.foundation.layout.WindowInsets r31, @p4.l v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r32, @p4.m androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m1555BottomAppBar1oL4kX8(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00bf  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomAppBar-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1556BottomAppBarSnr_uVM(@p4.l v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r31, @p4.m androidx.compose.ui.Modifier r32, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r33, long r34, long r36, float r38, @p4.m androidx.compose.foundation.layout.PaddingValues r39, @p4.m androidx.compose.foundation.layout.WindowInsets r40, @p4.m androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m1556BottomAppBarSnr_uVM(v3.q, androidx.compose.ui.Modifier, v3.p, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0295  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomAppBar-e-3WI5M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1557BottomAppBare3WI5M(@p4.m androidx.compose.ui.Modifier r37, long r38, long r40, float r42, @p4.m androidx.compose.foundation.layout.PaddingValues r43, @p4.m androidx.compose.foundation.layout.WindowInsets r44, @p4.m androidx.compose.material3.BottomAppBarScrollBehavior r45, @p4.l v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r46, @p4.m androidx.compose.runtime.Composer r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m1557BottomAppBare3WI5M(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.BottomAppBarScrollBehavior, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ae  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomAppBar-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1558BottomAppBarqhFBPw4(@p4.l v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r30, @p4.m androidx.compose.ui.Modifier r31, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r32, long r33, long r35, float r37, @p4.m androidx.compose.foundation.layout.PaddingValues r38, @p4.m androidx.compose.foundation.layout.WindowInsets r39, @p4.m androidx.compose.material3.BottomAppBarScrollBehavior r40, @p4.m androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m1558BottomAppBarqhFBPw4(v3.q, androidx.compose.ui.Modifier, v3.p, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.BottomAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    @p4.l
    @ExperimentalMaterial3Api
    public static final BottomAppBarState BottomAppBarState(float f5, float f6, float f7) {
        return new BottomAppBarStateImpl(f5, f6, f7);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0068  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CenterAlignedTopAppBar(@p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r21, @p4.m androidx.compose.ui.Modifier r22, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r23, @p4.m v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r24, @p4.m androidx.compose.foundation.layout.WindowInsets r25, @p4.m androidx.compose.material3.TopAppBarColors r26, @p4.m androidx.compose.material3.TopAppBarScrollBehavior r27, @p4.m androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.CenterAlignedTopAppBar(v3.p, androidx.compose.ui.Modifier, v3.p, v3.q, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0068  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LargeTopAppBar(@p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r26, @p4.m androidx.compose.ui.Modifier r27, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r28, @p4.m v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r29, @p4.m androidx.compose.foundation.layout.WindowInsets r30, @p4.m androidx.compose.material3.TopAppBarColors r31, @p4.m androidx.compose.material3.TopAppBarScrollBehavior r32, @p4.m androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.LargeTopAppBar(v3.p, androidx.compose.ui.Modifier, v3.p, v3.q, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0068  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MediumTopAppBar(@p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r26, @p4.m androidx.compose.ui.Modifier r27, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r28, @p4.m v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r29, @p4.m androidx.compose.foundation.layout.WindowInsets r30, @p4.m androidx.compose.material3.TopAppBarColors r31, @p4.m androidx.compose.material3.TopAppBarScrollBehavior r32, @p4.m androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.MediumTopAppBar(v3.p, androidx.compose.ui.Modifier, v3.p, v3.q, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void SingleRowTopAppBar(Modifier modifier, v3.p<? super Composer, ? super Integer, r2> pVar, TextStyle textStyle, boolean z4, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.q<? super RowScope, ? super Composer, ? super Integer, r2> qVar, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i5, int i6) {
        Modifier modifier2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Modifier modifier3;
        boolean z5;
        float f5;
        float f6;
        Modifier modifier4;
        boolean z6;
        TopAppBarState state;
        Composer startRestartGroup = composer.startRestartGroup(1841601619);
        int i17 = i6 & 1;
        if (i17 != 0) {
            i7 = i5 | 6;
            modifier2 = modifier;
        } else if ((i5 & 6) == 0) {
            modifier2 = modifier;
            if (startRestartGroup.changed(modifier2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i5;
        } else {
            modifier2 = modifier;
            i7 = i5;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i5 & 48) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        if ((i6 & 4) != 0) {
            i7 |= 384;
        } else if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(textStyle)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i7 |= i10;
        }
        if ((i6 & 8) != 0) {
            i7 |= 3072;
        } else if ((i5 & 3072) == 0) {
            if (startRestartGroup.changed(z4)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i7 |= i11;
        }
        if ((i6 & 16) != 0) {
            i7 |= 24576;
        } else if ((i5 & 24576) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i7 |= i12;
        }
        if ((i6 & 32) != 0) {
            i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i7 |= i13;
        }
        if ((i6 & 64) != 0) {
            i7 |= 1572864;
        } else if ((i5 & 1572864) == 0) {
            if (startRestartGroup.changed(windowInsets)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i7 |= i14;
        }
        if ((i6 & 128) != 0) {
            i7 |= 12582912;
        } else if ((i5 & 12582912) == 0) {
            if (startRestartGroup.changed(topAppBarColors)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i7 |= i15;
        }
        if ((i6 & 256) != 0) {
            i7 |= 100663296;
        } else if ((i5 & 100663296) == 0) {
            if (startRestartGroup.changed(topAppBarScrollBehavior)) {
                i16 = 67108864;
            } else {
                i16 = 33554432;
            }
            i7 |= i16;
        }
        if ((38347923 & i7) == 38347922 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i17 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1841601619, i7, -1, "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:1635)");
            }
            float f7 = -((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo304toPx0680j_4(TopAppBarSmallTokens.INSTANCE.m3189getContainerHeightD9Ej5fM());
            startRestartGroup.startReplaceableGroup(-1008351447);
            int i18 = i7 & 234881024;
            if (i18 == 67108864) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean changed = z5 | startRestartGroup.changed(f7);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new AppBarKt$SingleRowTopAppBar$1$1(topAppBarScrollBehavior, f7);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((v3.a) rememberedValue, startRestartGroup, 0);
            if (topAppBarScrollBehavior != null && (state = topAppBarScrollBehavior.getState()) != null) {
                f5 = state.getOverlappedFraction();
            } else {
                f5 = 0.0f;
            }
            if (f5 > 0.01f) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            Modifier modifier5 = modifier3;
            State<Color> m96animateColorAsStateeuL9pac = SingleValueAnimationKt.m96animateColorAsStateeuL9pac(topAppBarColors.m2600containerColorvNxB06k$material3_release(f6), AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), null, null, startRestartGroup, 48, 12);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1520880938, true, new AppBarKt$SingleRowTopAppBar$actionsRow$1(qVar));
            startRestartGroup.startReplaceableGroup(-1008350212);
            if (topAppBarScrollBehavior != null && !topAppBarScrollBehavior.isPinned()) {
                Modifier.Companion companion = Modifier.Companion;
                Orientation orientation = Orientation.Vertical;
                startRestartGroup.startReplaceableGroup(-1008350035);
                if (i18 == 67108864) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z6 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new AppBarKt$SingleRowTopAppBar$appBarDragModifier$1$1(topAppBarScrollBehavior);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                boolean z7 = false;
                DraggableState rememberDraggableState = DraggableKt.rememberDraggableState((v3.l) rememberedValue2, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1008349887);
                if (i18 == 67108864) {
                    z7 = true;
                }
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z7 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1(topAppBarScrollBehavior, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                modifier4 = DraggableKt.draggable$default(companion, rememberDraggableState, orientation, false, null, false, null, (v3.q) rememberedValue3, false, 188, null);
            } else {
                modifier4 = Modifier.Companion;
            }
            startRestartGroup.endReplaceableGroup();
            SurfaceKt.m2304SurfaceT9BRK9s(modifier5.then(modifier4), null, SingleRowTopAppBar$lambda$7(m96animateColorAsStateeuL9pac), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, 376925230, true, new AppBarKt$SingleRowTopAppBar$2(windowInsets, topAppBarColors, pVar, textStyle, z4, pVar2, composableLambda, topAppBarScrollBehavior)), startRestartGroup, 12582912, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier5;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AppBarKt$SingleRowTopAppBar$3(modifier2, pVar, textStyle, z4, pVar2, qVar, windowInsets, topAppBarColors, topAppBarScrollBehavior, i5, i6));
        }
    }

    private static final long SingleRowTopAppBar$lambda$7(State<Color> state) {
        return state.getValue().m3744unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0068  */
    @kotlin.k(level = kotlin.m.WARNING, message = "Use TopAppBar instead.", replaceWith = @kotlin.b1(expression = "TopAppBar(title, modifier, navigationIcon, actions, windowInsets, colors, scrollBehavior)", imports = {}))
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SmallTopAppBar(@p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r19, @p4.m androidx.compose.ui.Modifier r20, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r21, @p4.m v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r22, @p4.m androidx.compose.foundation.layout.WindowInsets r23, @p4.m androidx.compose.material3.TopAppBarColors r24, @p4.m androidx.compose.material3.TopAppBarScrollBehavior r25, @p4.m androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.SmallTopAppBar(v3.p, androidx.compose.ui.Modifier, v3.p, v3.q, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0068  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TopAppBar(@p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r21, @p4.m androidx.compose.ui.Modifier r22, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r23, @p4.m v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r24, @p4.m androidx.compose.foundation.layout.WindowInsets r25, @p4.m androidx.compose.material3.TopAppBarColors r26, @p4.m androidx.compose.material3.TopAppBarScrollBehavior r27, @p4.m androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.TopAppBar(v3.p, androidx.compose.ui.Modifier, v3.p, v3.q, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: TopAppBarLayout-kXwM9vE, reason: not valid java name */
    public static final void m1559TopAppBarLayoutkXwM9vE(Modifier modifier, final float f5, long j5, long j6, long j7, v3.p<? super Composer, ? super Integer, r2> pVar, TextStyle textStyle, float f6, final Arrangement.Vertical vertical, final Arrangement.Horizontal horizontal, final int i5, boolean z4, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, Composer composer, int i6, int i7) {
        int i8;
        int i9;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Modifier modifier2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Composer startRestartGroup = composer.startRestartGroup(-6794037);
        if ((i6 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i8 = i20 | i6;
        } else {
            i8 = i6;
        }
        int i21 = 16;
        if ((i6 & 48) == 0) {
            if (startRestartGroup.changed(f5)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i8 |= i19;
        }
        int i22 = 256;
        if ((i6 & 384) == 0) {
            if (startRestartGroup.changed(j5)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i8 |= i18;
        }
        int i23 = 2048;
        if ((i6 & 3072) == 0) {
            if (startRestartGroup.changed(j6)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i8 |= i17;
        }
        if ((i6 & 24576) == 0) {
            if (startRestartGroup.changed(j7)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i8 |= i16;
        }
        if ((196608 & i6) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i8 |= i15;
        }
        if ((1572864 & i6) == 0) {
            if (startRestartGroup.changed(textStyle)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i8 |= i14;
        }
        if ((i6 & 12582912) == 0) {
            if (startRestartGroup.changed(f6)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i8 |= i13;
        }
        if ((i6 & 100663296) == 0) {
            if (startRestartGroup.changed(vertical)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i8 |= i12;
        }
        if ((i6 & 805306368) == 0) {
            if (startRestartGroup.changed(horizontal)) {
                i11 = 536870912;
            } else {
                i11 = 268435456;
            }
            i8 |= i11;
        }
        if ((i7 & 6) == 0) {
            if (startRestartGroup.changed(i5)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i9 = i7 | i10;
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            if (startRestartGroup.changed(z4)) {
                i21 = 32;
            }
            i9 |= i21;
        }
        if ((i7 & 384) == 0) {
            if (!startRestartGroup.changedInstance(pVar2)) {
                i22 = 128;
            }
            i9 |= i22;
        }
        if ((i7 & 3072) == 0) {
            if (!startRestartGroup.changedInstance(pVar3)) {
                i23 = 1024;
            }
            i9 |= i23;
        }
        int i24 = i9;
        if ((i8 & 306783379) == 306783378 && (i24 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-6794037, i8, i24, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:1899)");
            }
            startRestartGroup.startReplaceableGroup(1019460550);
            if ((i8 & 112) == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((1879048192 & i8) == 536870912) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z9 = z5 | z6;
            if ((234881024 & i8) == 67108864) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z10 = z9 | z7;
            if ((i24 & 14) == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z11 = z10 | z8;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1

                    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    /* renamed from: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1$1, reason: invalid class name */
                    /* loaded from: classes.dex */
                    static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
                        final /* synthetic */ Placeable $actionIconsPlaceable;
                        final /* synthetic */ long $constraints;
                        final /* synthetic */ int $layoutHeight;
                        final /* synthetic */ Placeable $navigationIconPlaceable;
                        final /* synthetic */ MeasureScope $this_Layout;
                        final /* synthetic */ int $titleBaseline;
                        final /* synthetic */ int $titleBottomPadding;
                        final /* synthetic */ Arrangement.Horizontal $titleHorizontalArrangement;
                        final /* synthetic */ Placeable $titlePlaceable;
                        final /* synthetic */ Arrangement.Vertical $titleVerticalArrangement;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(Placeable placeable, int i5, Placeable placeable2, Arrangement.Horizontal horizontal, long j5, Placeable placeable3, MeasureScope measureScope, Arrangement.Vertical vertical, int i6, int i7) {
                            super(1);
                            this.$navigationIconPlaceable = placeable;
                            this.$layoutHeight = i5;
                            this.$titlePlaceable = placeable2;
                            this.$titleHorizontalArrangement = horizontal;
                            this.$constraints = j5;
                            this.$actionIconsPlaceable = placeable3;
                            this.$this_Layout = measureScope;
                            this.$titleVerticalArrangement = vertical;
                            this.$titleBottomPadding = i6;
                            this.$titleBaseline = i7;
                        }

                        @Override // v3.l
                        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return r2.f19517a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
                            float f5;
                            int max;
                            int i5;
                            int height;
                            int max2;
                            int i6;
                            int m6000getMaxWidthimpl;
                            Placeable placeable = this.$navigationIconPlaceable;
                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (this.$layoutHeight - placeable.getHeight()) / 2, 0.0f, 4, null);
                            Placeable placeable2 = this.$titlePlaceable;
                            Arrangement.Horizontal horizontal = this.$titleHorizontalArrangement;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            if (kotlin.jvm.internal.l0.g(horizontal, arrangement.getCenter())) {
                                max = (Constraints.m6000getMaxWidthimpl(this.$constraints) - this.$titlePlaceable.getWidth()) / 2;
                                if (max < this.$navigationIconPlaceable.getWidth()) {
                                    m6000getMaxWidthimpl = this.$navigationIconPlaceable.getWidth() - max;
                                } else if (this.$titlePlaceable.getWidth() + max > Constraints.m6000getMaxWidthimpl(this.$constraints) - this.$actionIconsPlaceable.getWidth()) {
                                    m6000getMaxWidthimpl = (Constraints.m6000getMaxWidthimpl(this.$constraints) - this.$actionIconsPlaceable.getWidth()) - (this.$titlePlaceable.getWidth() + max);
                                }
                                max += m6000getMaxWidthimpl;
                            } else if (kotlin.jvm.internal.l0.g(horizontal, arrangement.getEnd())) {
                                max = (Constraints.m6000getMaxWidthimpl(this.$constraints) - this.$titlePlaceable.getWidth()) - this.$actionIconsPlaceable.getWidth();
                            } else {
                                MeasureScope measureScope = this.$this_Layout;
                                f5 = AppBarKt.TopAppBarTitleInset;
                                max = Math.max(measureScope.mo298roundToPx0680j_4(f5), this.$navigationIconPlaceable.getWidth());
                            }
                            int i7 = max;
                            Arrangement.Vertical vertical = this.$titleVerticalArrangement;
                            if (kotlin.jvm.internal.l0.g(vertical, arrangement.getCenter())) {
                                i6 = (this.$layoutHeight - this.$titlePlaceable.getHeight()) / 2;
                            } else if (kotlin.jvm.internal.l0.g(vertical, arrangement.getBottom())) {
                                if (this.$titleBottomPadding == 0) {
                                    height = this.$layoutHeight;
                                    max2 = this.$titlePlaceable.getHeight();
                                } else {
                                    height = this.$layoutHeight - this.$titlePlaceable.getHeight();
                                    max2 = Math.max(0, (this.$titleBottomPadding - this.$titlePlaceable.getHeight()) + this.$titleBaseline);
                                }
                                i6 = height - max2;
                            } else {
                                i5 = 0;
                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i7, i5, 0.0f, 4, null);
                                Placeable.PlacementScope.placeRelative$default(placementScope, this.$actionIconsPlaceable, Constraints.m6000getMaxWidthimpl(this.$constraints) - this.$actionIconsPlaceable.getWidth(), (this.$layoutHeight - this.$actionIconsPlaceable.getHeight()) / 2, 0.0f, 4, null);
                            }
                            i5 = i6;
                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i7, i5, 0.0f, 4, null);
                            Placeable.PlacementScope.placeRelative$default(placementScope, this.$actionIconsPlaceable, Constraints.m6000getMaxWidthimpl(this.$constraints) - this.$actionIconsPlaceable.getWidth(), (this.$layoutHeight - this.$actionIconsPlaceable.getHeight()) / 2, 0.0f, 4, null);
                        }
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @p4.l
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo30measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends Measurable> list, long j8) {
                        int u4;
                        int i25;
                        int size = list.size();
                        int i26 = 0;
                        for (int i27 = 0; i27 < size; i27++) {
                            Measurable measurable = list.get(i27);
                            if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable), "navigationIcon")) {
                                Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j8, 0, 0, 0, 0, 14, null));
                                int size2 = list.size();
                                for (int i28 = 0; i28 < size2; i28++) {
                                    Measurable measurable2 = list.get(i28);
                                    if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable2), "actionIcons")) {
                                        Placeable mo4998measureBRTryo02 = measurable2.mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j8, 0, 0, 0, 0, 14, null));
                                        if (Constraints.m6000getMaxWidthimpl(j8) == Integer.MAX_VALUE) {
                                            u4 = Constraints.m6000getMaxWidthimpl(j8);
                                        } else {
                                            u4 = kotlin.ranges.u.u((Constraints.m6000getMaxWidthimpl(j8) - mo4998measureBRTryo0.getWidth()) - mo4998measureBRTryo02.getWidth(), 0);
                                        }
                                        int i29 = u4;
                                        int size3 = list.size();
                                        for (int i30 = 0; i30 < size3; i30++) {
                                            Measurable measurable3 = list.get(i30);
                                            if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable3), com.alipay.sdk.m.x.d.f3030v)) {
                                                Placeable mo4998measureBRTryo03 = measurable3.mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j8, 0, i29, 0, 0, 12, null));
                                                if (mo4998measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) != Integer.MIN_VALUE) {
                                                    i25 = mo4998measureBRTryo03.get(AlignmentLineKt.getLastBaseline());
                                                } else {
                                                    i25 = 0;
                                                }
                                                if (!Float.isNaN(f5)) {
                                                    i26 = kotlin.math.d.L0(f5);
                                                }
                                                int i31 = i26;
                                                return MeasureScope.layout$default(measureScope, Constraints.m6000getMaxWidthimpl(j8), i31, null, new AnonymousClass1(mo4998measureBRTryo0, i31, mo4998measureBRTryo03, horizontal, j8, mo4998measureBRTryo02, measureScope, vertical, i5, i25), 4, null);
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            int i25 = ((((i8 << 3) & 112) << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i25 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier layoutId = LayoutIdKt.layoutId(companion2, "navigationIcon");
            float f7 = TopAppBarHorizontalPadding;
            Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(layoutId, f7, 0.0f, 0.0f, 0.0f, 14, null);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor2 = companion.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl2 = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl2, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ProvidedValue<Color> provides = ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(j5));
            int i26 = ProvidedValue.$stable;
            CompositionLocalKt.CompositionLocalProvider(provides, pVar2, startRestartGroup, i26 | 0 | ((i24 >> 3) & 112));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier m555paddingVpY3zN4$default = PaddingKt.m555paddingVpY3zN4$default(LayoutIdKt.layoutId(companion2, com.alipay.sdk.m.x.d.f3030v), f7, 0.0f, 2, null);
            if (z4) {
                modifier2 = SemanticsModifierKt.clearAndSetSemantics(companion2, AppBarKt$TopAppBarLayout$1$2.INSTANCE);
            } else {
                modifier2 = companion2;
            }
            Modifier m3894graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m3894graphicsLayerAp8cVGQ$default(m555paddingVpY3zN4$default.then(modifier2), 0.0f, 0.0f, f6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131067, null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor3 = companion.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m3894graphicsLayerAp8cVGQ$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl3 = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl3, rememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl3.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            int i27 = i8 >> 9;
            ProvideContentColorTextStyleKt.m2091ProvideContentColorTextStyle3JVO9M(j6, textStyle, pVar, startRestartGroup, ((i8 >> 15) & 112) | (i27 & 14) | (i27 & 896));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier m557paddingqDBjuR0$default2 = PaddingKt.m557paddingqDBjuR0$default(LayoutIdKt.layoutId(companion2, "actionIcons"), 0.0f, 0.0f, f7, 0.0f, 11, null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor4 = companion.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl4 = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl4, rememberBoxMeasurePolicy3, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl4, currentCompositionLocalMap4, companion.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash4 = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl4.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m3264constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m3264constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            modifierMaterializerOf4.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(j7)), pVar3, startRestartGroup, ((i24 >> 6) & 112) | i26 | 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AppBarKt$TopAppBarLayout$3(modifier, f5, j5, j6, j7, pVar, textStyle, f6, vertical, horizontal, i5, z4, pVar2, pVar3, i6, i7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b7  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: TwoRowsTopAppBar-tjU4iQQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1560TwoRowsTopAppBartjU4iQQ(androidx.compose.ui.Modifier r41, v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r42, androidx.compose.ui.text.TextStyle r43, float r44, v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r45, androidx.compose.ui.text.TextStyle r46, v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r47, v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r48, androidx.compose.foundation.layout.WindowInsets r49, androidx.compose.material3.TopAppBarColors r50, float r51, float r52, androidx.compose.material3.TopAppBarScrollBehavior r53, androidx.compose.runtime.Composer r54, int r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m1560TwoRowsTopAppBartjU4iQQ(androidx.compose.ui.Modifier, v3.p, androidx.compose.ui.text.TextStyle, float, v3.p, androidx.compose.ui.text.TextStyle, v3.p, v3.q, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, float, float, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final float getBottomAppBarVerticalPadding() {
        return BottomAppBarVerticalPadding;
    }

    @p4.l
    public static final CubicBezierEasing getTopTitleAlphaEasing() {
        return TopTitleAlphaEasing;
    }

    @p4.l
    @Composable
    @ExperimentalMaterial3Api
    public static final BottomAppBarState rememberBottomAppBarState(float f5, float f6, float f7, @p4.m Composer composer, int i5, int i6) {
        boolean z4;
        boolean z5;
        composer.startReplaceableGroup(1420874240);
        if ((i6 & 1) != 0) {
            f5 = -3.4028235E38f;
        }
        if ((i6 & 2) != 0) {
            f6 = 0.0f;
        }
        if ((i6 & 4) != 0) {
            f7 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1420874240, i5, -1, "androidx.compose.material3.rememberBottomAppBarState (AppBar.kt:1372)");
        }
        boolean z6 = false;
        Object[] objArr = new Object[0];
        Saver<BottomAppBarState, ?> saver = BottomAppBarState.Companion.getSaver();
        composer.startReplaceableGroup(647586024);
        if ((((i5 & 14) ^ 6) > 4 && composer.changed(f5)) || (i5 & 6) == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((((i5 & 112) ^ 48) > 32 && composer.changed(f6)) || (i5 & 48) == 32) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean z7 = z4 | z5;
        if ((((i5 & 896) ^ 384) > 256 && composer.changed(f7)) || (i5 & 384) == 256) {
            z6 = true;
        }
        boolean z8 = z7 | z6;
        Object rememberedValue = composer.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new AppBarKt$rememberBottomAppBarState$1$1(f5, f6, f7);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        BottomAppBarState bottomAppBarState = (BottomAppBarState) RememberSaveableKt.m3351rememberSaveable(objArr, (Saver) saver, (String) null, (v3.a) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomAppBarState;
    }

    @p4.l
    @Composable
    @ExperimentalMaterial3Api
    public static final TopAppBarState rememberTopAppBarState(float f5, float f6, float f7, @p4.m Composer composer, int i5, int i6) {
        boolean z4;
        boolean z5;
        composer.startReplaceableGroup(1801969826);
        if ((i6 & 1) != 0) {
            f5 = -3.4028235E38f;
        }
        if ((i6 & 2) != 0) {
            f6 = 0.0f;
        }
        if ((i6 & 4) != 0) {
            f7 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1801969826, i5, -1, "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:1051)");
        }
        boolean z6 = false;
        Object[] objArr = new Object[0];
        Saver<TopAppBarState, ?> saver = TopAppBarState.Companion.getSaver();
        composer.startReplaceableGroup(1171243704);
        if ((((i5 & 14) ^ 6) > 4 && composer.changed(f5)) || (i5 & 6) == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((((i5 & 112) ^ 48) > 32 && composer.changed(f6)) || (i5 & 48) == 32) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean z7 = z4 | z5;
        if ((((i5 & 896) ^ 384) > 256 && composer.changed(f7)) || (i5 & 384) == 256) {
            z6 = true;
        }
        boolean z8 = z7 | z6;
        Object rememberedValue = composer.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new AppBarKt$rememberTopAppBarState$1$1(f5, f6, f7);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TopAppBarState topAppBarState = (TopAppBarState) RememberSaveableKt.m3351rememberSaveable(objArr, (Saver) saver, (String) null, (v3.a) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object settleAppBar(androidx.compose.material3.TopAppBarState r22, float r23, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r24, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r25, kotlin.coroutines.d<? super androidx.compose.ui.unit.Velocity> r26) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.settleAppBar(androidx.compose.material3.TopAppBarState, float, androidx.compose.animation.core.DecayAnimationSpec, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object settleAppBarBottom(androidx.compose.material3.BottomAppBarState r22, float r23, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r24, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r25, kotlin.coroutines.d<? super androidx.compose.ui.unit.Velocity> r26) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.settleAppBarBottom(androidx.compose.material3.BottomAppBarState, float, androidx.compose.animation.core.DecayAnimationSpec, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.d):java.lang.Object");
    }
}
