package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.alipay.sdk.m.x.d;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.i0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.q1;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\"\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\"\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0007\u001a;\u0010\u0010\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\nH\u0007\u001a;\u0010\u0012\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\nH\u0007\u001a6\u0010\u0018\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a6\u0010\u001c\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aQ\u0010\"\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2#\b\u0002\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000b0\nH\u0007\u001aQ\u0010%\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010#\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2#\b\u0002\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000b0\nH\u0007\u001aQ\u0010*\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010\u001e\u001a\u00020&2\b\b\u0002\u0010 \u001a\u00020\u001f2#\b\u0002\u0010)\u001a\u001d\u0012\u0013\u0012\u00110'¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b((\u0012\u0004\u0012\u00020'0\nH\u0007\u001aQ\u0010.\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010\u001e\u001a\u00020+2\b\b\u0002\u0010 \u001a\u00020\u001f2#\b\u0002\u0010-\u001a\u001d\u0012\u0013\u0012\u00110'¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020'0\nH\u0007\u001aQ\u00100\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010#\u001a\u00020&2\b\b\u0002\u0010 \u001a\u00020\u001f2#\b\u0002\u0010/\u001a\u001d\u0012\u0013\u0012\u00110'¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b((\u0012\u0004\u0012\u00020'0\nH\u0007\u001aQ\u00102\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010#\u001a\u00020+2\b\b\u0002\u0010 \u001a\u00020\u001f2#\b\u0002\u00101\u001a\u001d\u0012\u0013\u0012\u00110'¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020'0\nH\u0007\u001a=\u00104\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002#\b\u0002\u00103\u001a\u001d\u0012\u0013\u0012\u00110'¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b((\u0012\u0004\u0012\u00020'0\nH\u0007\u001a=\u00106\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002#\b\u0002\u00105\u001a\u001d\u0012\u0013\u0012\u00110'¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020'0\nH\u0007\u001a=\u00108\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002#\b\u0002\u00107\u001a\u001d\u0012\u0013\u0012\u00110'¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b((\u0012\u0004\u0012\u00020'0\nH\u0007\u001a=\u0010:\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002#\b\u0002\u00109\u001a\u001d\u0012\u0013\u0012\u00110'¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020'0\nH\u0007\u001a \u0010@\u001a\u00020\u00042\u0006\u0010<\u001a\u00020;2\u000e\u0010?\u001a\n\u0012\u0006\b\u0001\u0012\u00020>0=H\u0000\u001a \u0010A\u001a\u00020\u00072\u0006\u0010<\u001a\u00020;2\u000e\u0010?\u001a\n\u0012\u0006\b\u0001\u0012\u00020>0=H\u0000\u001a\f\u0010B\u001a\u00020\u001d*\u00020&H\u0002\u001a\f\u0010B\u001a\u00020\u001d*\u00020+H\u0002\u001a\u001f\u0010C\u001a\f\u0012\u0006\b\u0001\u0012\u00020>\u0018\u00010=*\u00020\u00042\u0006\u0010<\u001a\u00020;H\u0080\u0002\u001a\u001f\u0010C\u001a\f\u0012\u0006\b\u0001\u0012\u00020>\u0018\u00010=*\u00020\u00072\u0006\u0010<\u001a\u00020;H\u0080\u0002\u001a1\u0010K\u001a\u00020J*\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u00072\u0006\u0010I\u001a\u00020HH\u0001¢\u0006\u0004\bK\u0010L\u001a!\u0010M\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010F\u001a\u00020\u0004H\u0001¢\u0006\u0004\bM\u0010N\u001a!\u0010O\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010G\u001a\u00020\u0007H\u0001¢\u0006\u0004\bO\u0010P\u001a1\u0010R\u001a\u00020Q*\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u00072\u0006\u0010I\u001a\u00020HH\u0003¢\u0006\u0004\bR\u0010S\" \u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020U0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010W\"\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00010X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z\"\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\t0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010Z\"\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u000b0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010Z\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006_²\u0006\u000e\u0010]\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010^\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "animationSpec", "initialAlpha", "Landroidx/compose/animation/EnterTransition;", "fadeIn", "targetAlpha", "Landroidx/compose/animation/ExitTransition;", "fadeOut", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/v0;", "name", "fullSize", "initialOffset", "slideIn", "targetOffset", "slideOut", "initialScale", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "scaleIn-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/EnterTransition;", "scaleIn", "targetScale", "scaleOut-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/ExitTransition;", "scaleOut", "Landroidx/compose/ui/Alignment;", "expandFrom", "", "clip", "initialSize", "expandIn", "shrinkTowards", "targetSize", "shrinkOut", "Landroidx/compose/ui/Alignment$Horizontal;", "", "fullWidth", "initialWidth", "expandHorizontally", "Landroidx/compose/ui/Alignment$Vertical;", "fullHeight", "initialHeight", "expandVertically", "targetWidth", "shrinkHorizontally", "targetHeight", "shrinkVertically", "initialOffsetX", "slideInHorizontally", "initialOffsetY", "slideInVertically", "targetOffsetX", "slideOutHorizontally", "targetOffsetY", "slideOutVertically", "", DatabaseFileArchive.COLUMN_KEY, "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/Modifier$Node;", "node", "EnterTransition", "ExitTransition", "toAlignment", "get", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "enter", d.f3034z, "", TTDownloadField.TT_LABEL, "Landroidx/compose/ui/Modifier;", "createModifier", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "trackActiveEnter", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterTransition;", "trackActiveExit", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "createGraphicsLayerBlock", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/animation/core/AnimationVector2D;", "TransformOriginVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/animation/core/SpringSpec;", "DefaultAlphaAndScaleSpring", "Landroidx/compose/animation/core/SpringSpec;", "DefaultOffsetAnimationSpec", "DefaultSizeAnimationSpec", "activeEnter", "activeExit", "animation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1246:1\n25#2:1247\n25#2:1254\n25#2:1261\n36#2:1268\n36#2:1275\n25#2:1282\n25#2:1289\n1116#3,6:1248\n1116#3,6:1255\n1116#3,6:1262\n1116#3,6:1269\n1116#3,6:1276\n1116#3,6:1283\n1116#3,6:1290\n81#4:1296\n107#4,2:1297\n81#4:1299\n107#4,2:1300\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n*L\n865#1:1247\n870#1:1254\n876#1:1261\n900#1:1268\n920#1:1275\n953#1:1282\n959#1:1289\n865#1:1248,6\n870#1:1255,6\n876#1:1262,6\n900#1:1269,6\n920#1:1276,6\n953#1:1283,6\n959#1:1290,6\n900#1:1296\n900#1:1297,2\n920#1:1299\n920#1:1300,2\n*E\n"})
/* loaded from: classes.dex */
public final class EnterExitTransitionKt {

    @l
    private static final TwoWayConverter<TransformOrigin, AnimationVector2D> TransformOriginVectorConverter = VectorConvertersKt.TwoWayConverter(EnterExitTransitionKt$TransformOriginVectorConverter$1.INSTANCE, EnterExitTransitionKt$TransformOriginVectorConverter$2.INSTANCE);

    @l
    private static final SpringSpec<Float> DefaultAlphaAndScaleSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);

    @l
    private static final SpringSpec<IntOffset> DefaultOffsetAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m6163boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);

    @l
    private static final SpringSpec<IntSize> DefaultSizeAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m6206boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);

    @l
    public static final EnterTransition EnterTransition(@l Object obj, @l ModifierNodeElement<? extends Modifier.Node> modifierNodeElement) {
        Map k5;
        k5 = z0.k(q1.a(obj, modifierNodeElement));
        return new EnterTransitionImpl(new TransitionData(null, null, null, null, false, k5, 31, null));
    }

    @l
    public static final ExitTransition ExitTransition(@l Object obj, @l ModifierNodeElement<? extends Modifier.Node> modifierNodeElement) {
        Map k5;
        k5 = z0.k(q1.a(obj, modifierNodeElement));
        return new ExitTransitionImpl(new TransitionData(null, null, null, null, false, k5, 31, null));
    }

    @Composable
    private static final GraphicsLayerBlockForEnterExit createGraphicsLayerBlock(final Transition<EnterExitState> transition, final EnterTransition enterTransition, final ExitTransition exitTransition, String str, Composer composer, int i5) {
        boolean z4;
        boolean z5;
        final Transition.DeferredAnimation deferredAnimation;
        final Transition.DeferredAnimation deferredAnimation2;
        composer.startReplaceableGroup(642253525);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(642253525, i5, -1, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:942)");
        }
        if (enterTransition.getData$animation_release().getFade() == null && exitTransition.getData$animation_release().getFade() == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (enterTransition.getData$animation_release().getScale() == null && exitTransition.getData$animation_release().getScale() == null) {
            z5 = false;
        } else {
            z5 = true;
        }
        composer.startReplaceableGroup(-1158245383);
        Transition.DeferredAnimation deferredAnimation3 = null;
        if (z4) {
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(a0.f19382a);
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = str + " alpha";
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            deferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter, (String) rememberedValue, composer, (i5 & 14) | 448, 0);
        } else {
            deferredAnimation = null;
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-1158245186);
        if (z5) {
            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(a0.f19382a);
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = str + " scale";
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            deferredAnimation2 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter2, (String) rememberedValue2, composer, (i5 & 14) | 448, 0);
        } else {
            deferredAnimation2 = null;
        }
        composer.endReplaceableGroup();
        if (z5) {
            deferredAnimation3 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, TransformOriginVectorConverter, "TransformOriginInterruptionHandling", composer, (i5 & 14) | 448, 0);
        }
        final Transition.DeferredAnimation deferredAnimation4 = deferredAnimation3;
        GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit = new GraphicsLayerBlockForEnterExit() { // from class: androidx.compose.animation.a
            @Override // androidx.compose.animation.GraphicsLayerBlockForEnterExit
            public final v3.l init() {
                v3.l createGraphicsLayerBlock$lambda$11;
                createGraphicsLayerBlock$lambda$11 = EnterExitTransitionKt.createGraphicsLayerBlock$lambda$11(Transition.DeferredAnimation.this, deferredAnimation2, transition, enterTransition, exitTransition, deferredAnimation4);
                return createGraphicsLayerBlock$lambda$11;
            }
        };
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return graphicsLayerBlockForEnterExit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v3.l createGraphicsLayerBlock$lambda$11(Transition.DeferredAnimation deferredAnimation, Transition.DeferredAnimation deferredAnimation2, Transition transition, EnterTransition enterTransition, ExitTransition exitTransition, Transition.DeferredAnimation deferredAnimation3) {
        State state;
        State state2;
        TransformOrigin m4110boximpl;
        State state3 = null;
        if (deferredAnimation != null) {
            state = deferredAnimation.animate(new EnterExitTransitionKt$createGraphicsLayerBlock$1$alpha$1(enterTransition, exitTransition), new EnterExitTransitionKt$createGraphicsLayerBlock$1$alpha$2(enterTransition, exitTransition));
        } else {
            state = null;
        }
        if (deferredAnimation2 != null) {
            state2 = deferredAnimation2.animate(new EnterExitTransitionKt$createGraphicsLayerBlock$1$scale$1(enterTransition, exitTransition), new EnterExitTransitionKt$createGraphicsLayerBlock$1$scale$2(enterTransition, exitTransition));
        } else {
            state2 = null;
        }
        if (transition.getCurrentState() == EnterExitState.PreEnter) {
            Scale scale = enterTransition.getData$animation_release().getScale();
            if (scale != null || (scale = exitTransition.getData$animation_release().getScale()) != null) {
                m4110boximpl = TransformOrigin.m4110boximpl(scale.m93getTransformOriginSzJe1aQ());
            }
            m4110boximpl = null;
        } else {
            Scale scale2 = exitTransition.getData$animation_release().getScale();
            if (scale2 != null || (scale2 = enterTransition.getData$animation_release().getScale()) != null) {
                m4110boximpl = TransformOrigin.m4110boximpl(scale2.m93getTransformOriginSzJe1aQ());
            }
            m4110boximpl = null;
        }
        if (deferredAnimation3 != null) {
            state3 = deferredAnimation3.animate(EnterExitTransitionKt$createGraphicsLayerBlock$1$transformOrigin$1.INSTANCE, new EnterExitTransitionKt$createGraphicsLayerBlock$1$transformOrigin$2(m4110boximpl, enterTransition, exitTransition));
        }
        return new EnterExitTransitionKt$createGraphicsLayerBlock$1$block$1(state, state2, state3);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01cd  */
    @p4.l
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.Modifier createModifier(@p4.l androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r42, @p4.l androidx.compose.animation.EnterTransition r43, @p4.l androidx.compose.animation.ExitTransition r44, @p4.l java.lang.String r45, @p4.m androidx.compose.runtime.Composer r46, int r47) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.createModifier(androidx.compose.animation.core.Transition, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }

    @Stable
    @l
    public static final EnterTransition expandHorizontally(@l FiniteAnimationSpec<IntSize> finiteAnimationSpec, @l Alignment.Horizontal horizontal, boolean z4, @l v3.l<? super Integer, Integer> lVar) {
        return expandIn(finiteAnimationSpec, toAlignment(horizontal), z4, new EnterExitTransitionKt$expandHorizontally$2(lVar));
    }

    public static /* synthetic */ EnterTransition expandHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z4, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m6206boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i5 & 2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        if ((i5 & 4) != 0) {
            z4 = true;
        }
        if ((i5 & 8) != 0) {
            lVar = EnterExitTransitionKt$expandHorizontally$1.INSTANCE;
        }
        return expandHorizontally(finiteAnimationSpec, horizontal, z4, lVar);
    }

    @Stable
    @l
    public static final EnterTransition expandIn(@l FiniteAnimationSpec<IntSize> finiteAnimationSpec, @l Alignment alignment, boolean z4, @l v3.l<? super IntSize, IntSize> lVar) {
        return new EnterTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, lVar, finiteAnimationSpec, z4), null, false, null, 59, null));
    }

    public static /* synthetic */ EnterTransition expandIn$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z4, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m6206boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i5 & 2) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        if ((i5 & 4) != 0) {
            z4 = true;
        }
        if ((i5 & 8) != 0) {
            lVar = EnterExitTransitionKt$expandIn$1.INSTANCE;
        }
        return expandIn(finiteAnimationSpec, alignment, z4, lVar);
    }

    @Stable
    @l
    public static final EnterTransition expandVertically(@l FiniteAnimationSpec<IntSize> finiteAnimationSpec, @l Alignment.Vertical vertical, boolean z4, @l v3.l<? super Integer, Integer> lVar) {
        return expandIn(finiteAnimationSpec, toAlignment(vertical), z4, new EnterExitTransitionKt$expandVertically$2(lVar));
    }

    public static /* synthetic */ EnterTransition expandVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z4, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m6206boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i5 & 2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        if ((i5 & 4) != 0) {
            z4 = true;
        }
        if ((i5 & 8) != 0) {
            lVar = EnterExitTransitionKt$expandVertically$1.INSTANCE;
        }
        return expandVertically(finiteAnimationSpec, vertical, z4, lVar);
    }

    @Stable
    @l
    public static final EnterTransition fadeIn(@l FiniteAnimationSpec<Float> finiteAnimationSpec, float f5) {
        return new EnterTransitionImpl(new TransitionData(new Fade(f5, finiteAnimationSpec), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ EnterTransition fadeIn$default(FiniteAnimationSpec finiteAnimationSpec, float f5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i5 & 2) != 0) {
            f5 = 0.0f;
        }
        return fadeIn(finiteAnimationSpec, f5);
    }

    @Stable
    @l
    public static final ExitTransition fadeOut(@l FiniteAnimationSpec<Float> finiteAnimationSpec, float f5) {
        return new ExitTransitionImpl(new TransitionData(new Fade(f5, finiteAnimationSpec), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ ExitTransition fadeOut$default(FiniteAnimationSpec finiteAnimationSpec, float f5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i5 & 2) != 0) {
            f5 = 0.0f;
        }
        return fadeOut(finiteAnimationSpec, f5);
    }

    @m
    public static final ModifierNodeElement<? extends Modifier.Node> get(@l EnterTransition enterTransition, @l Object obj) {
        return enterTransition.getData$animation_release().getEffectsMap().get(obj);
    }

    @Stable
    @l
    /* renamed from: scaleIn-L8ZKh-E, reason: not valid java name */
    public static final EnterTransition m64scaleInL8ZKhE(@l FiniteAnimationSpec<Float> finiteAnimationSpec, float f5, long j5) {
        return new EnterTransitionImpl(new TransitionData(null, null, null, new Scale(f5, j5, finiteAnimationSpec, null), false, null, 55, null));
    }

    /* renamed from: scaleIn-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ EnterTransition m65scaleInL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f5, long j5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i5 & 2) != 0) {
            f5 = 0.0f;
        }
        if ((i5 & 4) != 0) {
            j5 = TransformOrigin.Companion.m4123getCenterSzJe1aQ();
        }
        return m64scaleInL8ZKhE(finiteAnimationSpec, f5, j5);
    }

    @Stable
    @l
    /* renamed from: scaleOut-L8ZKh-E, reason: not valid java name */
    public static final ExitTransition m66scaleOutL8ZKhE(@l FiniteAnimationSpec<Float> finiteAnimationSpec, float f5, long j5) {
        return new ExitTransitionImpl(new TransitionData(null, null, null, new Scale(f5, j5, finiteAnimationSpec, null), false, null, 55, null));
    }

    /* renamed from: scaleOut-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ ExitTransition m67scaleOutL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f5, long j5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i5 & 2) != 0) {
            f5 = 0.0f;
        }
        if ((i5 & 4) != 0) {
            j5 = TransformOrigin.Companion.m4123getCenterSzJe1aQ();
        }
        return m66scaleOutL8ZKhE(finiteAnimationSpec, f5, j5);
    }

    @Stable
    @l
    public static final ExitTransition shrinkHorizontally(@l FiniteAnimationSpec<IntSize> finiteAnimationSpec, @l Alignment.Horizontal horizontal, boolean z4, @l v3.l<? super Integer, Integer> lVar) {
        return shrinkOut(finiteAnimationSpec, toAlignment(horizontal), z4, new EnterExitTransitionKt$shrinkHorizontally$2(lVar));
    }

    public static /* synthetic */ ExitTransition shrinkHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z4, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m6206boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i5 & 2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        if ((i5 & 4) != 0) {
            z4 = true;
        }
        if ((i5 & 8) != 0) {
            lVar = EnterExitTransitionKt$shrinkHorizontally$1.INSTANCE;
        }
        return shrinkHorizontally(finiteAnimationSpec, horizontal, z4, lVar);
    }

    @Stable
    @l
    public static final ExitTransition shrinkOut(@l FiniteAnimationSpec<IntSize> finiteAnimationSpec, @l Alignment alignment, boolean z4, @l v3.l<? super IntSize, IntSize> lVar) {
        return new ExitTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, lVar, finiteAnimationSpec, z4), null, false, null, 59, null));
    }

    public static /* synthetic */ ExitTransition shrinkOut$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z4, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m6206boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i5 & 2) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        if ((i5 & 4) != 0) {
            z4 = true;
        }
        if ((i5 & 8) != 0) {
            lVar = EnterExitTransitionKt$shrinkOut$1.INSTANCE;
        }
        return shrinkOut(finiteAnimationSpec, alignment, z4, lVar);
    }

    @Stable
    @l
    public static final ExitTransition shrinkVertically(@l FiniteAnimationSpec<IntSize> finiteAnimationSpec, @l Alignment.Vertical vertical, boolean z4, @l v3.l<? super Integer, Integer> lVar) {
        return shrinkOut(finiteAnimationSpec, toAlignment(vertical), z4, new EnterExitTransitionKt$shrinkVertically$2(lVar));
    }

    public static /* synthetic */ ExitTransition shrinkVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z4, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m6206boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i5 & 2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        if ((i5 & 4) != 0) {
            z4 = true;
        }
        if ((i5 & 8) != 0) {
            lVar = EnterExitTransitionKt$shrinkVertically$1.INSTANCE;
        }
        return shrinkVertically(finiteAnimationSpec, vertical, z4, lVar);
    }

    @Stable
    @l
    public static final EnterTransition slideIn(@l FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @l v3.l<? super IntSize, IntOffset> lVar) {
        return new EnterTransitionImpl(new TransitionData(null, new Slide(lVar, finiteAnimationSpec), null, null, false, null, 61, null));
    }

    public static /* synthetic */ EnterTransition slideIn$default(FiniteAnimationSpec finiteAnimationSpec, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m6163boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        return slideIn(finiteAnimationSpec, lVar);
    }

    @Stable
    @l
    public static final EnterTransition slideInHorizontally(@l FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @l v3.l<? super Integer, Integer> lVar) {
        return slideIn(finiteAnimationSpec, new EnterExitTransitionKt$slideInHorizontally$2(lVar));
    }

    public static /* synthetic */ EnterTransition slideInHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m6163boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i5 & 2) != 0) {
            lVar = EnterExitTransitionKt$slideInHorizontally$1.INSTANCE;
        }
        return slideInHorizontally(finiteAnimationSpec, lVar);
    }

    @Stable
    @l
    public static final EnterTransition slideInVertically(@l FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @l v3.l<? super Integer, Integer> lVar) {
        return slideIn(finiteAnimationSpec, new EnterExitTransitionKt$slideInVertically$2(lVar));
    }

    public static /* synthetic */ EnterTransition slideInVertically$default(FiniteAnimationSpec finiteAnimationSpec, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m6163boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i5 & 2) != 0) {
            lVar = EnterExitTransitionKt$slideInVertically$1.INSTANCE;
        }
        return slideInVertically(finiteAnimationSpec, lVar);
    }

    @Stable
    @l
    public static final ExitTransition slideOut(@l FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @l v3.l<? super IntSize, IntOffset> lVar) {
        return new ExitTransitionImpl(new TransitionData(null, new Slide(lVar, finiteAnimationSpec), null, null, false, null, 61, null));
    }

    public static /* synthetic */ ExitTransition slideOut$default(FiniteAnimationSpec finiteAnimationSpec, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m6163boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        return slideOut(finiteAnimationSpec, lVar);
    }

    @Stable
    @l
    public static final ExitTransition slideOutHorizontally(@l FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @l v3.l<? super Integer, Integer> lVar) {
        return slideOut(finiteAnimationSpec, new EnterExitTransitionKt$slideOutHorizontally$2(lVar));
    }

    public static /* synthetic */ ExitTransition slideOutHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m6163boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i5 & 2) != 0) {
            lVar = EnterExitTransitionKt$slideOutHorizontally$1.INSTANCE;
        }
        return slideOutHorizontally(finiteAnimationSpec, lVar);
    }

    @Stable
    @l
    public static final ExitTransition slideOutVertically(@l FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @l v3.l<? super Integer, Integer> lVar) {
        return slideOut(finiteAnimationSpec, new EnterExitTransitionKt$slideOutVertically$2(lVar));
    }

    public static /* synthetic */ ExitTransition slideOutVertically$default(FiniteAnimationSpec finiteAnimationSpec, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m6163boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i5 & 2) != 0) {
            lVar = EnterExitTransitionKt$slideOutVertically$1.INSTANCE;
        }
        return slideOutVertically(finiteAnimationSpec, lVar);
    }

    private static final Alignment toAlignment(Alignment.Horizontal horizontal) {
        Alignment.Companion companion = Alignment.Companion;
        return l0.g(horizontal, companion.getStart()) ? companion.getCenterStart() : l0.g(horizontal, companion.getEnd()) ? companion.getCenterEnd() : companion.getCenter();
    }

    @l
    @Composable
    public static final EnterTransition trackActiveEnter(@l Transition<EnterExitState> transition, @l EnterTransition enterTransition, @m Composer composer, int i5) {
        composer.startReplaceableGroup(21614502);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(21614502, i5, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:894)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(enterTransition, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        if (transition.getCurrentState() == transition.getTargetState() && transition.getCurrentState() == EnterExitState.Visible) {
            if (transition.isSeeking()) {
                mutableState.setValue(enterTransition);
            } else {
                mutableState.setValue(EnterTransition.Companion.getNone());
            }
        } else if (transition.getTargetState() == EnterExitState.Visible) {
            mutableState.setValue(trackActiveEnter$lambda$4(mutableState).plus(enterTransition));
        }
        EnterTransition trackActiveEnter$lambda$4 = trackActiveEnter$lambda$4(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return trackActiveEnter$lambda$4;
    }

    private static final EnterTransition trackActiveEnter$lambda$4(MutableState<EnterTransition> mutableState) {
        return mutableState.getValue();
    }

    @l
    @Composable
    public static final ExitTransition trackActiveExit(@l Transition<EnterExitState> transition, @l ExitTransition exitTransition, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1363864804);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1363864804, i5, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:914)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(exitTransition, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        if (transition.getCurrentState() == transition.getTargetState() && transition.getCurrentState() == EnterExitState.Visible) {
            if (transition.isSeeking()) {
                mutableState.setValue(exitTransition);
            } else {
                mutableState.setValue(ExitTransition.Companion.getNone());
            }
        } else if (transition.getTargetState() != EnterExitState.Visible) {
            mutableState.setValue(trackActiveExit$lambda$7(mutableState).plus(exitTransition));
        }
        ExitTransition trackActiveExit$lambda$7 = trackActiveExit$lambda$7(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return trackActiveExit$lambda$7;
    }

    private static final ExitTransition trackActiveExit$lambda$7(MutableState<ExitTransition> mutableState) {
        return mutableState.getValue();
    }

    @m
    public static final ModifierNodeElement<? extends Modifier.Node> get(@l ExitTransition exitTransition, @l Object obj) {
        return exitTransition.getData$animation_release().getEffectsMap().get(obj);
    }

    private static final Alignment toAlignment(Alignment.Vertical vertical) {
        Alignment.Companion companion = Alignment.Companion;
        return l0.g(vertical, companion.getTop()) ? companion.getTopCenter() : l0.g(vertical, companion.getBottom()) ? companion.getBottomCenter() : companion.getCenter();
    }
}
