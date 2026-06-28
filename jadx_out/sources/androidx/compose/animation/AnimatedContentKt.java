package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntSize;
import com.alipay.sdk.m.x.d;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000v\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a¶\u0001\u0010\u0016\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001f\b\u0002\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2%\b\u0002\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000421\u0010\u0015\u001a-\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aP\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0019\u001a\u00020\u00182>\b\u0002\u0010\u001e\u001a8\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001d0\u0011\u001a\u0015\u0010$\u001a\u00020\u0006*\u00020!2\u0006\u0010#\u001a\u00020\"H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020\u0006*\u00020!2\u0006\u0010#\u001a\u00020\"H\u0087\u0004\u001a®\u0001\u0010\u0016\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000&2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001f\b\u0002\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072\b\b\u0002\u0010\n\u001a\u00020\t2%\b\u0002\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000421\u0010\u0015\u001a-\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u0016\u0010'¨\u0006("}, d2 = {"S", "targetState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/u;", "transitionSpec", "Landroidx/compose/ui/Alignment;", "contentAlignment", "", TTDownloadField.TT_LABEL, "Lkotlin/v0;", "name", "", "contentKey", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "AnimatedContent", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lv3/l;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lv3/l;Lv3/r;Landroidx/compose/runtime/Composer;II)V", "", "clip", "Landroidx/compose/ui/unit/IntSize;", "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "sizeAnimationSpec", "Landroidx/compose/animation/SizeTransform;", "SizeTransform", "Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/ExitTransition;", d.f3034z, "togetherWith", "with", "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lv3/l;Landroidx/compose/ui/Alignment;Lv3/l;Lv3/r;Landroidx/compose/runtime/Composer;II)V", "animation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,831:1\n74#2:832\n36#3:833\n36#3:840\n36#3:847\n50#3:867\n49#3:868\n25#3:875\n456#3,8:893\n464#3,3:907\n467#3,3:916\n1116#4,6:834\n1116#4,6:841\n1116#4,6:848\n1116#4,6:869\n1116#4,6:876\n350#5,7:854\n33#6,6:861\n33#6,6:910\n79#7,11:882\n92#7:919\n3737#8,6:901\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n*L\n667#1:832\n668#1:833\n672#1:840\n673#1:847\n761#1:867\n761#1:868\n772#1:875\n763#1:893,8\n763#1:907,3\n763#1:916,3\n668#1:834,6\n672#1:841,6\n673#1:848,6\n761#1:869,6\n772#1:876,6\n699#1:854,7\n708#1:861,6\n766#1:910,6\n763#1:882,11\n763#1:919\n763#1:901,6\n*E\n"})
/* loaded from: classes.dex */
public final class AnimatedContentKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0047  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S> void AnimatedContent(S r18, @p4.m androidx.compose.ui.Modifier r19, @p4.m v3.l<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> r20, @p4.m androidx.compose.ui.Alignment r21, @p4.m java.lang.String r22, @p4.m v3.l<? super S, ? extends java.lang.Object> r23, @p4.l v3.r<? super androidx.compose.animation.AnimatedContentScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r24, @p4.m androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(java.lang.Object, androidx.compose.ui.Modifier, v3.l, androidx.compose.ui.Alignment, java.lang.String, v3.l, v3.r, androidx.compose.runtime.Composer, int, int):void");
    }

    @l
    public static final SizeTransform SizeTransform(boolean z4, @l p<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> pVar) {
        return new SizeTransformImpl(z4, pVar);
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z4, p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        if ((i5 & 2) != 0) {
            pVar = AnimatedContentKt$SizeTransform$1.INSTANCE;
        }
        return SizeTransform(z4, pVar);
    }

    @l
    public static final ContentTransform togetherWith(@l EnterTransition enterTransition, @l ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    @l
    @k(message = "Infix fun EnterTransition.with(ExitTransition) has been renamed to togetherWith", replaceWith = @b1(expression = "togetherWith(exit)", imports = {}))
    @ExperimentalAnimationApi
    public static final ContentTransform with(@l EnterTransition enterTransition, @l ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0242 A[LOOP:2: B:130:0x0240->B:131:0x0242, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0295  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S> void AnimatedContent(@p4.l androidx.compose.animation.core.Transition<S> r18, @p4.m androidx.compose.ui.Modifier r19, @p4.m v3.l<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> r20, @p4.m androidx.compose.ui.Alignment r21, @p4.m v3.l<? super S, ? extends java.lang.Object> r22, @p4.l v3.r<? super androidx.compose.animation.AnimatedContentScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r23, @p4.m androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, v3.l, androidx.compose.ui.Alignment, v3.l, v3.r, androidx.compose.runtime.Composer, int, int):void");
    }
}
