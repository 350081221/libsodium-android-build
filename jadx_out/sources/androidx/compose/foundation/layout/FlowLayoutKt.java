package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.CrossAxisAlignment;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.a1;
import kotlin.collections.e0;
import kotlin.collections.s0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aV\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0087\b¢\u0006\u0004\b\u000e\u0010\u000f\u001aV\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001aS\u0010!\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2#\u0010\u001e\u001a\u001f\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001d¢\u0006\u0002\b\f2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002\u001a\u0080\u0001\u0010$\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2#\u0010\u001e\u001a\u001f\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001d¢\u0006\u0002\b\f2#\u0010\"\u001a\u001f\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001d¢\u0006\u0002\b\f2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002\u001aF\u0010)\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002\u001a\u0080\u0001\u0010)\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2#\u0010\u001e\u001a\u001f\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001d¢\u0006\u0002\b\f2#\u0010\"\u001a\u001f\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001d¢\u0006\u0002\b\f2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002\u001a6\u00104\u001a\u000201*\u00020*2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0014\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a\u001c\u00106\u001a\u00020\u0006*\u0002052\u0006\u0010.\u001a\u00020-2\u0006\u0010\"\u001a\u00020\u0006H\u0000\u001a\u001c\u00107\u001a\u00020\u0006*\u0002052\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\u001e\u001a\u00020\u0006*\u0002082\u0006\u0010.\u001a\u00020-H\u0000\u001a\u0014\u0010\"\u001a\u00020\u0006*\u0002082\u0006\u0010.\u001a\u00020-H\u0000\u001a<\u0010<\u001a\u00020\u0006*\u0002052\u0006\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-2\u0014\u00109\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000108\u0012\u0004\u0012\u00020\n0\bH\u0002ø\u0001\u0000¢\u0006\u0004\b:\u0010;\"\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?\"\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "", "maxItemsInEachRow", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowRowScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "content", "FlowRow", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILv3/q;Landroidx/compose/runtime/Composer;II)V", "maxItemsInEachColumn", "Landroidx/compose/foundation/layout/FlowColumnScope;", "FlowColumn", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILv3/q;Landroidx/compose/runtime/Composer;II)V", "maxItemsInMainAxis", "Landroidx/compose/ui/layout/MeasurePolicy;", "rowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "columnMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "children", "Lkotlin/Function3;", "mainAxisSize", "crossAxisAvailable", "mainAxisSpacing", "maxIntrinsicMainAxisSize", "crossAxisSize", "crossAxisSpacing", "minIntrinsicMainAxisSize", "", "mainAxisSizes", "crossAxisSizes", "mainAxisAvailable", "intrinsicCrossAxisSize", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;", "measureHelper", "Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "constraints", "Landroidx/compose/foundation/layout/FlowResult;", "breakDownItems-w1Onq5I", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;Landroidx/compose/foundation/layout/LayoutOrientation;JI)Landroidx/compose/foundation/layout/FlowResult;", "breakDownItems", "Landroidx/compose/ui/layout/Measurable;", "mainAxisMin", "crossAxisMin", "Landroidx/compose/ui/layout/Placeable;", "storePlaceable", "measureAndCache-6m2dt9o", "(Landroidx/compose/ui/layout/Measurable;JLandroidx/compose/foundation/layout/LayoutOrientation;Lv3/l;)I", "measureAndCache", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "CROSS_AXIS_ALIGNMENT_TOP", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "CROSS_AXIS_ALIGNMENT_START", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,757:1\n79#2,11:758\n92#2:789\n79#2,11:790\n92#2:821\n456#3,8:769\n464#3,6:783\n456#3,8:801\n464#3,6:815\n67#3,3:822\n66#3:825\n67#3,3:832\n66#3:835\n3737#4,6:777\n3737#4,6:809\n1116#5,6:826\n1116#5,6:836\n69#6,6:842\n69#6,6:849\n1#7:848\n1208#8:855\n1187#8,2:856\n322#9:858\n321#9:859\n324#9:860\n323#9:861\n321#9:862\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n*L\n72#1:758,11\n72#1:789\n122#1:790,11\n122#1:821\n72#1:769,8\n72#1:783,6\n122#1:801,8\n122#1:815,6\n158#1:822,3\n158#1:825\n179#1:832,3\n179#1:835\n72#1:777,6\n122#1:809,6\n158#1:826,6\n179#1:836,6\n447#1:842,6\n568#1:849,6\n608#1:855\n608#1:856,2\n609#1:858\n610#1:859\n611#1:860\n688#1:861\n689#1:862\n*E\n"})
/* loaded from: classes.dex */
public final class FlowLayoutKt {

    @l
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_START;

    @l
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_TOP;

    static {
        CrossAxisAlignment.Companion companion = CrossAxisAlignment.Companion;
        Alignment.Companion companion2 = Alignment.Companion;
        CROSS_AXIS_ALIGNMENT_TOP = companion.vertical$foundation_layout_release(companion2.getTop());
        CROSS_AXIS_ALIGNMENT_START = companion.horizontal$foundation_layout_release(companion2.getStart());
    }

    @Composable
    @ExperimentalLayoutApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void FlowColumn(@m Modifier modifier, @m Arrangement.Vertical vertical, @m Arrangement.Horizontal horizontal, int i5, @l q<? super FlowColumnScope, ? super Composer, ? super Integer, r2> qVar, @m Composer composer, int i6, int i7) {
        composer.startReplaceableGroup(-310290901);
        if ((i7 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i7 & 2) != 0) {
            vertical = Arrangement.INSTANCE.getTop();
        }
        if ((i7 & 4) != 0) {
            horizontal = Arrangement.INSTANCE.getStart();
        }
        if ((i7 & 8) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        int i8 = i6 >> 3;
        MeasurePolicy columnMeasurementHelper = columnMeasurementHelper(vertical, horizontal, i5, composer, (i8 & 896) | (i8 & 14) | (i8 & 112));
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        int i9 = ((((i6 << 3) & 112) << 9) & 7168) | 6;
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
        Updater.m3271setimpl(m3264constructorimpl, columnMeasurementHelper, companion.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, Integer.valueOf((i9 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        qVar.invoke(FlowColumnScopeInstance.INSTANCE, composer, Integer.valueOf(((i6 >> 9) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @ExperimentalLayoutApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void FlowRow(@m Modifier modifier, @m Arrangement.Horizontal horizontal, @m Arrangement.Vertical vertical, int i5, @l q<? super FlowRowScope, ? super Composer, ? super Integer, r2> qVar, @m Composer composer, int i6, int i7) {
        composer.startReplaceableGroup(1098475987);
        if ((i7 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i7 & 2) != 0) {
            horizontal = Arrangement.INSTANCE.getStart();
        }
        if ((i7 & 4) != 0) {
            vertical = Arrangement.INSTANCE.getTop();
        }
        if ((i7 & 8) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        int i8 = i6 >> 3;
        MeasurePolicy rowMeasurementHelper = rowMeasurementHelper(horizontal, vertical, i5, composer, (i8 & 896) | (i8 & 14) | (i8 & 112));
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        int i9 = ((((i6 << 3) & 112) << 9) & 7168) | 6;
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
        Updater.m3271setimpl(m3264constructorimpl, rowMeasurementHelper, companion.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, Integer.valueOf((i9 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        qVar.invoke(FlowRowScopeInstance.INSTANCE, composer, Integer.valueOf(((i6 >> 9) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @l
    /* renamed from: breakDownItems-w1Onq5I */
    public static final FlowResult m497breakDownItemsw1Onq5I(@l MeasureScope measureScope, @l RowColumnMeasurementHelper rowColumnMeasurementHelper, @l LayoutOrientation layoutOrientation, long j5, int i5) {
        Object T2;
        Integer num;
        Object Pe;
        Object Pe2;
        Object T22;
        Integer num2;
        int i6;
        MutableVector mutableVector = new MutableVector(new RowColumnMeasureHelperResult[16], 0);
        int m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5);
        int m6002getMinWidthimpl = Constraints.m6002getMinWidthimpl(j5);
        int m5999getMaxHeightimpl = Constraints.m5999getMaxHeightimpl(j5);
        List<Measurable> measurables = rowColumnMeasurementHelper.getMeasurables();
        Placeable[] placeables = rowColumnMeasurementHelper.getPlaceables();
        int ceil = (int) Math.ceil(measureScope.mo304toPx0680j_4(rowColumnMeasurementHelper.m581getArrangementSpacingD9Ej5fM()));
        long m520constructorimpl = OrientationIndependentConstraints.m520constructorimpl(m6002getMinWidthimpl, m6000getMaxWidthimpl, 0, m5999getMaxHeightimpl);
        T2 = e0.T2(measurables, 0);
        Measurable measurable = (Measurable) T2;
        if (measurable != null) {
            num = Integer.valueOf(m498measureAndCache6m2dt9o(measurable, m520constructorimpl, layoutOrientation, new FlowLayoutKt$breakDownItems$nextSize$1(placeables)));
        } else {
            num = null;
        }
        Integer[] numArr = new Integer[measurables.size()];
        int size = measurables.size();
        int i7 = m6000getMaxWidthimpl;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i8 < size) {
            l0.m(num);
            int intValue = num.intValue();
            int i12 = i9 + intValue;
            i7 -= intValue;
            int i13 = i8 + 1;
            T22 = e0.T2(measurables, i13);
            Measurable measurable2 = (Measurable) T22;
            int i14 = size;
            if (measurable2 != null) {
                num2 = Integer.valueOf(m498measureAndCache6m2dt9o(measurable2, m520constructorimpl, layoutOrientation, new FlowLayoutKt$breakDownItems$1(placeables, i8)) + ceil);
            } else {
                num2 = null;
            }
            if (i13 < measurables.size() && i13 - i10 < i5) {
                if (num2 != null) {
                    i6 = num2.intValue();
                } else {
                    i6 = 0;
                }
                if (i7 - i6 >= 0) {
                    i8 = i13;
                    size = i14;
                    num = num2;
                    i9 = i12;
                }
            }
            m6002getMinWidthimpl = Math.min(Math.max(m6002getMinWidthimpl, i12), m6000getMaxWidthimpl);
            numArr[i11] = Integer.valueOf(i13);
            i11++;
            if (num2 != null) {
                num2 = Integer.valueOf(num2.intValue() - ceil);
            } else {
                num2 = null;
            }
            i7 = m6000getMaxWidthimpl;
            i10 = i13;
            i12 = 0;
            i8 = i13;
            size = i14;
            num = num2;
            i9 = i12;
        }
        long m535toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m535toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m524copyyUG9Ft0$default(m520constructorimpl, m6002getMinWidthimpl, 0, 0, 0, 14, null), layoutOrientation);
        int i15 = 0;
        Pe = kotlin.collections.p.Pe(numArr, 0);
        int i16 = 0;
        Integer num3 = (Integer) Pe;
        int i17 = m6002getMinWidthimpl;
        int i18 = 0;
        while (num3 != null) {
            Integer[] numArr2 = numArr;
            RowColumnMeasureHelperResult m582measureWithoutPlacing_EkL_Y = rowColumnMeasurementHelper.m582measureWithoutPlacing_EkL_Y(measureScope, m535toBoxConstraintsOenEA2s, i16, num3.intValue());
            i15 += m582measureWithoutPlacing_EkL_Y.getCrossAxisSize();
            i17 = Math.max(i17, m582measureWithoutPlacing_EkL_Y.getMainAxisSize());
            mutableVector.add(m582measureWithoutPlacing_EkL_Y);
            i16 = num3.intValue();
            i18++;
            Pe2 = kotlin.collections.p.Pe(numArr2, i18);
            num3 = (Integer) Pe2;
            numArr = numArr2;
        }
        return new FlowResult(Math.max(i17, Constraints.m6002getMinWidthimpl(j5)), Math.max(i15, Constraints.m6001getMinHeightimpl(j5)), mutableVector);
    }

    @l
    @Composable
    @a1
    public static final MeasurePolicy columnMeasurementHelper(@l Arrangement.Vertical vertical, @l Arrangement.Horizontal horizontal, int i5, @m Composer composer, int i6) {
        composer.startReplaceableGroup(-2013098357);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013098357, i6, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:177)");
        }
        Integer valueOf = Integer.valueOf(i5);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(valueOf) | composer.changed(vertical) | composer.changed(horizontal);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new FlowMeasurePolicy(LayoutOrientation.Vertical, horizontal, vertical, vertical.mo468getSpacingD9Ej5fM(), SizeMode.Wrap, CROSS_AXIS_ALIGNMENT_START, horizontal.mo468getSpacingD9Ej5fM(), i5, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return flowMeasurePolicy;
    }

    public static final int crossAxisMin(@l Measurable measurable, @l LayoutOrientation layoutOrientation, int i5) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return measurable.minIntrinsicHeight(i5);
        }
        return measurable.minIntrinsicWidth(i5);
    }

    public static final int crossAxisSize(@l Placeable placeable, @l LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, int[] iArr, int[] iArr2, int i5, int i6, int i7, int i8) {
        return intrinsicCrossAxisSize(list, new FlowLayoutKt$intrinsicCrossAxisSize$1(iArr), new FlowLayoutKt$intrinsicCrossAxisSize$2(iArr2), i5, i6, i7, i8);
    }

    public static final int mainAxisMin(@l Measurable measurable, @l LayoutOrientation layoutOrientation, int i5) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return measurable.minIntrinsicWidth(i5);
        }
        return measurable.minIntrinsicHeight(i5);
    }

    public static final int mainAxisSize(@l Placeable placeable, @l LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    public static final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, q<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> qVar, int i5, int i6, int i7) {
        int size = list.size();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i8 < size) {
            int intValue = qVar.invoke(list.get(i8), Integer.valueOf(i8), Integer.valueOf(i5)).intValue() + i6;
            int i12 = i8 + 1;
            if (i12 - i10 != i7 && i12 != list.size()) {
                i11 += intValue;
            } else {
                i9 = Math.max(i9, (i11 + intValue) - i6);
                i11 = 0;
                i10 = i8;
            }
            i8 = i12;
        }
        return i9;
    }

    /* renamed from: measureAndCache-6m2dt9o */
    private static final int m498measureAndCache6m2dt9o(Measurable measurable, long j5, LayoutOrientation layoutOrientation, v3.l<? super Placeable, r2> lVar) {
        boolean z4;
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable)) == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(OrientationIndependentConstraints.m535toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m524copyyUG9Ft0$default(j5, 0, 0, 0, 0, 14, null), layoutOrientation));
            lVar.invoke(mo4998measureBRTryo0);
            return mainAxisSize(mo4998measureBRTryo0, layoutOrientation);
        }
        return mainAxisMin(measurable, layoutOrientation, Integer.MAX_VALUE);
    }

    public static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, q<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> qVar, q<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> qVar2, int i5, int i6, int i7, int i8) {
        int aw;
        boolean z4;
        int ue;
        boolean z5;
        int ue2;
        int size = list.size();
        int[] iArr = new int[size];
        for (int i9 = 0; i9 < size; i9++) {
            iArr[i9] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i10 = 0; i10 < size2; i10++) {
            iArr2[i10] = 0;
        }
        int size3 = list.size();
        for (int i11 = 0; i11 < size3; i11++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i11);
            int intValue = qVar.invoke(intrinsicMeasurable, Integer.valueOf(i11), Integer.valueOf(i5)).intValue();
            iArr[i11] = intValue;
            iArr2[i11] = qVar2.invoke(intrinsicMeasurable, Integer.valueOf(i11), Integer.valueOf(intValue)).intValue();
        }
        aw = kotlin.collections.p.aw(iArr);
        if (size2 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            int i12 = iArr2[0];
            ue = kotlin.collections.p.ue(iArr2);
            s0 it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                int i13 = iArr2[it.nextInt()];
                if (i12 < i13) {
                    i12 = i13;
                }
            }
            if (size == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                int i14 = iArr[0];
                ue2 = kotlin.collections.p.ue(iArr);
                s0 it2 = new kotlin.ranges.l(1, ue2).iterator();
                while (it2.hasNext()) {
                    int i15 = iArr[it2.nextInt()];
                    if (i14 < i15) {
                        i14 = i15;
                    }
                }
                int i16 = aw;
                while (i14 < i16) {
                    if (i12 == i5) {
                        return aw;
                    }
                    int i17 = (i14 + i16) / 2;
                    i12 = intrinsicCrossAxisSize(list, iArr, iArr2, i17, i6, i7, i8);
                    if (i12 == i5) {
                        return i17;
                    }
                    if (i12 > i5) {
                        i14 = i17 + 1;
                    } else {
                        i16 = i17 - 1;
                    }
                    aw = i17;
                }
                return aw;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    @l
    @Composable
    @a1
    public static final MeasurePolicy rowMeasurementHelper(@l Arrangement.Horizontal horizontal, @l Arrangement.Vertical vertical, int i5, @m Composer composer, int i6) {
        composer.startReplaceableGroup(1479255111);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1479255111, i6, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:156)");
        }
        Integer valueOf = Integer.valueOf(i5);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(valueOf) | composer.changed(horizontal) | composer.changed(vertical);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new FlowMeasurePolicy(LayoutOrientation.Horizontal, horizontal, vertical, horizontal.mo468getSpacingD9Ej5fM(), SizeMode.Wrap, CROSS_AXIS_ALIGNMENT_TOP, vertical.mo468getSpacingD9Ej5fM(), i5, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return flowMeasurePolicy;
    }

    public static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, q<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> qVar, q<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> qVar2, int i5, int i6, int i7, int i8) {
        Object T2;
        Object T22;
        if (list.isEmpty()) {
            return 0;
        }
        T2 = e0.T2(list, 0);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) T2;
        int intValue = intrinsicMeasurable != null ? qVar2.invoke(intrinsicMeasurable, 0, Integer.valueOf(i5)).intValue() : 0;
        int intValue2 = intrinsicMeasurable != null ? qVar.invoke(intrinsicMeasurable, 0, Integer.valueOf(intValue)).intValue() : 0;
        int size = list.size();
        int i9 = i5;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < size) {
            list.get(i10);
            l0.m(T2);
            i9 -= intValue2;
            int max = Math.max(i12, intValue);
            i10++;
            T22 = e0.T2(list, i10);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) T22;
            int intValue3 = intrinsicMeasurable2 != null ? qVar2.invoke(intrinsicMeasurable2, Integer.valueOf(i10), Integer.valueOf(i5)).intValue() : 0;
            int intValue4 = intrinsicMeasurable2 != null ? qVar.invoke(intrinsicMeasurable2, Integer.valueOf(i10), Integer.valueOf(intValue3)).intValue() + i6 : 0;
            if (i9 >= 0 && i10 != list.size()) {
                if (i10 - i13 != i8 && i9 - intValue4 >= 0) {
                    int i14 = intValue3;
                    i12 = max;
                    T2 = T22;
                    intValue2 = intValue4;
                    intValue = i14;
                }
            }
            i11 += max + i7;
            intValue4 -= i6;
            i9 = i5;
            max = 0;
            i13 = i10;
            int i142 = intValue3;
            i12 = max;
            T2 = T22;
            intValue2 = intValue4;
            intValue = i142;
        }
        return i11 - i7;
    }
}
