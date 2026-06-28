package androidx.compose.foundation.pager;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.FinalSnappingItem;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.coroutines.i;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;
import kotlin.u0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u001aØ\u0001\u0010$\u001a\u00020\u001e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u001921\u0010!\u001a-\u0012\u0004\u0012\u00020\u001c\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u001b¢\u0006\u0002\b\u001f¢\u0006\u0002\b H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001aØ\u0001\u0010)\u001a\u00020\u001e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u001921\u0010!\u001a-\u0012\u0004\u0012\u00020\u001c\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u001b¢\u0006\u0002\b\u001f¢\u0006\u0002\b H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a.\u00102\u001a\u0002012\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u00100\u001a\u00020.H\u0002\u001a#\u00104\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0010H\u0001¢\u0006\u0004\b4\u00105\u001a\u0017\u00109\u001a\u00020\u001e2\f\u00108\u001a\b\u0012\u0004\u0012\u00020706H\u0082\b\u001a\f\u0010:\u001a\u00020\u0010*\u00020\u0000H\u0002\u001a\f\u0010;\u001a\u00020.*\u00020\u0000H\u0002\"\u0014\u0010<\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u0010=\"\u0014\u0010>\u001a\u00020\u00108\u0000X\u0080T¢\u0006\u0006\n\u0004\b>\u0010?\"\u0014\u0010@\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010?\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/pager/PageSize;", "pageSize", "", "beyondBoundsPageCount", "Landroidx/compose/ui/unit/Dp;", "pageSpacing", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "flingBehavior", "", "userScrollEnabled", "reverseLayout", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "index", "", DatabaseFileArchive.COLUMN_KEY, "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "pageNestedScrollConnection", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "page", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "pageContent", "HorizontalPager-xYaah8o", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLv3/l;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lv3/r;Landroidx/compose/runtime/Composer;III)V", "HorizontalPager", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "VerticalPager-xYaah8o", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLv3/l;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lv3/r;Landroidx/compose/runtime/Composer;III)V", "VerticalPager", "pagerState", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "pagerSnapDistance", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "snapPositionalThreshold", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "SnapLayoutInfoProvider", "isVertical", "pagerSemantics", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "", "generateMsg", "debugLog", "isScrollingForward", "dragGestureDelta", "LowVelocityAnimationDefaultDuration", "I", "PagerDebugEnable", "Z", "DEBUG", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,970:1\n154#2:971\n154#2:972\n154#2:980\n154#2:981\n36#3:973\n36#3:982\n25#3:993\n1116#4,6:974\n1116#4,6:983\n1116#4,3:994\n1119#4,3:1000\n487#5,4:989\n491#5,2:997\n495#5:1003\n487#6:999\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n*L\n112#1:971\n115#1:972\n192#1:980\n195#1:981\n121#1:973\n201#1:982\n916#1:993\n121#1:974,6\n201#1:983,6\n916#1:994,3\n916#1:1000,3\n916#1:989,4\n916#1:997,2\n916#1:1003\n916#1:999\n*E\n"})
/* loaded from: classes.dex */
public final class PagerKt {
    private static final boolean DEBUG = false;
    private static final int LowVelocityAnimationDefaultDuration = 500;
    public static final boolean PagerDebugEnable = false;

    /* JADX WARN: Removed duplicated region for block: B:100:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0274  */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: HorizontalPager-xYaah8o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m781HorizontalPagerxYaah8o(@p4.l androidx.compose.foundation.pager.PagerState r36, @p4.m androidx.compose.ui.Modifier r37, @p4.m androidx.compose.foundation.layout.PaddingValues r38, @p4.m androidx.compose.foundation.pager.PageSize r39, int r40, float r41, @p4.m androidx.compose.ui.Alignment.Vertical r42, @p4.m androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r43, boolean r44, boolean r45, @p4.m v3.l<? super java.lang.Integer, ? extends java.lang.Object> r46, @p4.m androidx.compose.ui.input.nestedscroll.NestedScrollConnection r47, @p4.l v3.r<? super androidx.compose.foundation.pager.PagerScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r48, @p4.m androidx.compose.runtime.Composer r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m781HorizontalPagerxYaah8o(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, boolean, boolean, v3.l, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, v3.r, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(final PagerState pagerState, final PagerSnapDistance pagerSnapDistance, final DecayAnimationSpec<Float> decayAnimationSpec, final float f5) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.pager.PagerKt$SnapLayoutInfoProvider$1
            /* JADX WARN: Incorrect condition in loop: B:21:0x0091 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private final kotlin.u0<java.lang.Float, java.lang.Float> searchForSnappingBounds() {
                /*
                    r19 = this;
                    r0 = r19
                    androidx.compose.foundation.pager.PagerState r1 = androidx.compose.foundation.pager.PagerState.this
                    int r1 = r1.getPageSize$foundation_release()
                    androidx.compose.foundation.pager.PagerState r2 = androidx.compose.foundation.pager.PagerState.this
                    int r2 = r2.getPageSpacing$foundation_release()
                    int r1 = r1 + r2
                    androidx.compose.foundation.pager.PagerState r2 = androidx.compose.foundation.pager.PagerState.this
                    int r2 = r2.getCurrentPage()
                    androidx.compose.foundation.pager.PagerState r3 = androidx.compose.foundation.pager.PagerState.this
                    int r3 = androidx.compose.foundation.pager.PagerMeasurePolicyKt.calculateCurrentPageLayoutOffset(r3, r1)
                    androidx.compose.foundation.pager.PagerLayoutInfo r4 = r19.getLayoutInfo()
                    java.util.List r4 = r4.getVisiblePagesInfo()
                    int r4 = r4.size()
                    int r4 = r4 / 2
                    r5 = -8388608(0xffffffffff800000, float:-Infinity)
                    r6 = 2139095040(0x7f800000, float:Infinity)
                    r14 = r2
                    r15 = r3
                    r16 = r5
                    r17 = r6
                L33:
                    int r7 = r2 - r4
                    r8 = 0
                    int r7 = kotlin.ranges.s.u(r7, r8)
                    r18 = 0
                    if (r14 < r7) goto L80
                    androidx.compose.foundation.pager.PagerLayoutInfo r7 = r19.getLayoutInfo()
                    int r7 = androidx.compose.foundation.pager.PagerLayoutInfoKt.getMainAxisViewportSize(r7)
                    androidx.compose.foundation.pager.PagerLayoutInfo r8 = r19.getLayoutInfo()
                    int r8 = r8.getBeforeContentPadding()
                    androidx.compose.foundation.pager.PagerLayoutInfo r9 = r19.getLayoutInfo()
                    int r9 = r9.getAfterContentPadding()
                    androidx.compose.foundation.pager.PagerLayoutInfo r10 = r19.getLayoutInfo()
                    int r10 = r10.getPageSize()
                    androidx.compose.foundation.gestures.snapping.SnapPositionInLayout r13 = androidx.compose.foundation.pager.PagerStateKt.getSnapAlignmentStartToStart()
                    r11 = r15
                    r12 = r14
                    float r7 = androidx.compose.foundation.gestures.snapping.SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(r7, r8, r9, r10, r11, r12, r13)
                    int r8 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
                    if (r8 > 0) goto L72
                    int r8 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
                    if (r8 <= 0) goto L72
                    r16 = r7
                L72:
                    int r8 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
                    if (r8 < 0) goto L7c
                    int r8 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
                    if (r8 >= 0) goto L7c
                    r17 = r7
                L7c:
                    int r15 = r15 - r1
                    int r14 = r14 + (-1)
                    goto L33
                L80:
                    int r7 = r2 + 1
                    int r3 = r3 + r1
                L83:
                    int r9 = r2 + r4
                    androidx.compose.foundation.pager.PagerState r10 = androidx.compose.foundation.pager.PagerState.this
                    int r10 = r10.getPageCount()
                    r11 = 1
                    int r10 = r10 - r11
                    int r9 = kotlin.ranges.s.B(r9, r10)
                    if (r7 > r9) goto Ld5
                    androidx.compose.foundation.pager.PagerLayoutInfo r9 = r19.getLayoutInfo()
                    int r9 = androidx.compose.foundation.pager.PagerLayoutInfoKt.getMainAxisViewportSize(r9)
                    androidx.compose.foundation.pager.PagerLayoutInfo r10 = r19.getLayoutInfo()
                    int r10 = r10.getBeforeContentPadding()
                    androidx.compose.foundation.pager.PagerLayoutInfo r11 = r19.getLayoutInfo()
                    int r11 = r11.getAfterContentPadding()
                    androidx.compose.foundation.pager.PagerLayoutInfo r12 = r19.getLayoutInfo()
                    int r12 = r12.getPageSize()
                    androidx.compose.foundation.gestures.snapping.SnapPositionInLayout r15 = androidx.compose.foundation.pager.PagerStateKt.getSnapAlignmentStartToStart()
                    r13 = r3
                    r14 = r7
                    float r9 = androidx.compose.foundation.gestures.snapping.SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(r9, r10, r11, r12, r13, r14, r15)
                    int r10 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
                    if (r10 < 0) goto Lc7
                    int r10 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
                    if (r10 >= 0) goto Lc7
                    r17 = r9
                Lc7:
                    int r10 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
                    if (r10 > 0) goto Ld1
                    int r10 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
                    if (r10 <= 0) goto Ld1
                    r16 = r9
                Ld1:
                    int r3 = r3 + r1
                    int r7 = r7 + 1
                    goto L83
                Ld5:
                    int r1 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
                    if (r1 != 0) goto Ldb
                    r1 = r11
                    goto Ldc
                Ldb:
                    r1 = r8
                Ldc:
                    if (r1 == 0) goto Le0
                    r16 = r17
                Le0:
                    int r1 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
                    if (r1 != 0) goto Le5
                    r8 = r11
                Le5:
                    if (r8 == 0) goto Le9
                    r17 = r16
                Le9:
                    java.lang.Float r1 = java.lang.Float.valueOf(r16)
                    java.lang.Float r2 = java.lang.Float.valueOf(r17)
                    kotlin.u0 r1 = kotlin.q1.a(r1, r2)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt$SnapLayoutInfoProvider$1.searchForSnappingBounds():kotlin.u0");
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float f6) {
                int firstVisiblePage$foundation_release;
                int I;
                int I2;
                int u4;
                int pageSize$foundation_release = PagerState.this.getPageSize$foundation_release() + PagerState.this.getPageSpacing$foundation_release();
                float calculateTargetValue = DecayAnimationSpecKt.calculateTargetValue(decayAnimationSpec, 0.0f, f6);
                if (f6 < 0.0f) {
                    firstVisiblePage$foundation_release = PagerState.this.getFirstVisiblePage$foundation_release() + 1;
                } else {
                    firstVisiblePage$foundation_release = PagerState.this.getFirstVisiblePage$foundation_release();
                }
                I = u.I(((int) (calculateTargetValue / pageSize$foundation_release)) + firstVisiblePage$foundation_release, 0, PagerState.this.getPageCount());
                I2 = u.I(pagerSnapDistance.calculateTargetPage(firstVisiblePage$foundation_release, I, f6, PagerState.this.getPageSize$foundation_release(), PagerState.this.getPageSpacing$foundation_release()), 0, PagerState.this.getPageCount());
                u4 = u.u(Math.abs((I2 - firstVisiblePage$foundation_release) * pageSize$foundation_release) - pageSize$foundation_release, 0);
                if (u4 == 0) {
                    return u4;
                }
                return Math.signum(f6) * u4;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnappingOffset(float f6) {
                boolean isScrollingForward;
                float dragGestureDelta;
                u0<Float, Float> searchForSnappingBounds = searchForSnappingBounds();
                float floatValue = searchForSnappingBounds.component1().floatValue();
                float floatValue2 = searchForSnappingBounds.component2().floatValue();
                isScrollingForward = PagerKt.isScrollingForward(PagerState.this);
                dragGestureDelta = PagerKt.dragGestureDelta(PagerState.this);
                float pageSize = (dragGestureDelta / getLayoutInfo().getPageSize()) - ((int) r3);
                int calculateFinalSnappingItem = LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(PagerState.this.getDensity$foundation_release(), f6);
                FinalSnappingItem.Companion companion = FinalSnappingItem.Companion;
                if (!FinalSnappingItem.m421equalsimpl0(calculateFinalSnappingItem, companion.m425getClosestItembbeMdSM())) {
                    if (!FinalSnappingItem.m421equalsimpl0(calculateFinalSnappingItem, companion.m426getNextItembbeMdSM())) {
                        if (!FinalSnappingItem.m421equalsimpl0(calculateFinalSnappingItem, companion.m427getPreviousItembbeMdSM())) {
                            floatValue = 0.0f;
                        }
                    }
                } else {
                    floatValue = Math.abs(pageSize) > f5 ? floatValue2 : floatValue2;
                }
                if (!isValidDistance(floatValue)) {
                    return 0.0f;
                }
                return floatValue;
            }

            @l
            public final PagerLayoutInfo getLayoutInfo() {
                return PagerState.this.getLayoutInfo();
            }

            public final boolean isValidDistance(float f6) {
                if (!(f6 == Float.POSITIVE_INFINITY)) {
                    if (!(f6 == Float.NEGATIVE_INFINITY)) {
                        return true;
                    }
                }
                return false;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0274  */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: VerticalPager-xYaah8o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m782VerticalPagerxYaah8o(@p4.l androidx.compose.foundation.pager.PagerState r36, @p4.m androidx.compose.ui.Modifier r37, @p4.m androidx.compose.foundation.layout.PaddingValues r38, @p4.m androidx.compose.foundation.pager.PageSize r39, int r40, float r41, @p4.m androidx.compose.ui.Alignment.Horizontal r42, @p4.m androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r43, boolean r44, boolean r45, @p4.m v3.l<? super java.lang.Integer, ? extends java.lang.Object> r46, @p4.m androidx.compose.ui.input.nestedscroll.NestedScrollConnection r47, @p4.l v3.r<? super androidx.compose.foundation.pager.PagerScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r48, @p4.m androidx.compose.runtime.Composer r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m782VerticalPagerxYaah8o(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, boolean, boolean, v3.l, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, v3.r, androidx.compose.runtime.Composer, int, int, int):void");
    }

    private static final void debugLog(v3.a<String> aVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float dragGestureDelta(PagerState pagerState) {
        if (pagerState.getLayoutInfo().getOrientation() == Orientation.Horizontal) {
            return Offset.m3493getXimpl(pagerState.m791getUpDownDifferenceF1C5BW0$foundation_release());
        }
        return Offset.m3494getYimpl(pagerState.m791getUpDownDifferenceF1C5BW0$foundation_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isScrollingForward(PagerState pagerState) {
        return dragGestureDelta(pagerState) < 0.0f;
    }

    @l
    @Composable
    public static final Modifier pagerSemantics(@l Modifier modifier, @l PagerState pagerState, boolean z4, @m Composer composer, int i5) {
        composer.startReplaceableGroup(1509835088);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1509835088, i5, -1, "androidx.compose.foundation.pager.pagerSemantics (Pager.kt:914)");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(i.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        Modifier then = modifier.then(SemanticsModifierKt.semantics$default(Modifier.Companion, false, new PagerKt$pagerSemantics$1(z4, pagerState, coroutineScope), 1, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performBackwardPaging(PagerState pagerState, s0 s0Var) {
        if (pagerState.getCanScrollBackward()) {
            k.f(s0Var, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, null), 3, null);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performForwardPaging(PagerState pagerState, s0 s0Var) {
        if (pagerState.getCanScrollForward()) {
            k.f(s0Var, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, null), 3, null);
            return true;
        }
        return false;
    }
}
