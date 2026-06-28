package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010<\u001a\u00020;¢\u0006\u0004\bQ\u0010RJH\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0096\u0001J\u0017\u0010\u0013\u001a\u00020\u0003*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u0003*\u00020\u0014H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u0017*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u0017*\u00020\u0014H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0097\u0001J(\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0016\u0010)\u001a\u00020\u0010*\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b(\u0010\u001cJ\u0019\u0010)\u001a\u00020\u0010*\u00020\u0003H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0019\u0010)\u001a\u00020\u0010*\u00020\u0017H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010\u0019J\u0019\u0010.\u001a\u00020\u0014*\u00020\u0017H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u0014*\u00020\u0003H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010/J\u0016\u0010.\u001a\u00020\u0014*\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b0\u0010-J\u0016\u00105\u001a\u000202*\u000201H\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0016\u00107\u001a\u000201*\u000202H\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00104R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R<\u0010C\u001a*\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0Aj\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#`B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020\u00178\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020\u00178\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0014\u0010K\u001a\u00020J8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020M8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bN\u0010O\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "Lkotlin/u;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "", "toPx-0680j_4", "(F)F", "toPx", "toPx--R2X_6o", "(J)F", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "index", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "Landroidx/compose/ui/layout/Placeable;", "measure-0kLqBqw", "(IJ)Ljava/util/List;", "measure", "toDp-GaN1DYA", "toDp", "toDp-u2uoSUM", "(I)F", "toSp-kPz2Gy4", "(F)J", "toSp", "(I)J", "toSp-0xMU5do", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toSize-XkaWNTQ", "(J)J", "toSize", "toDpSize-k-rfVVM", "toDpSize", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "itemContentFactory", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "subcomposeMeasureScope", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "placeablesCache", "Ljava/util/HashMap;", "getDensity", "()F", "density", "getFontScale", "fontScale", "", "isLookingAhead", "()Z", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeMeasureScope;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
@r1({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutMeasureScopeImpl implements LazyLayoutMeasureScope, MeasureScope {
    public static final int $stable = 0;

    @l
    private final LazyLayoutItemContentFactory itemContentFactory;

    @l
    private final LazyLayoutItemProvider itemProvider;

    @l
    private final HashMap<Integer, List<Placeable>> placeablesCache = new HashMap<>();

    @l
    private final SubcomposeMeasureScope subcomposeMeasureScope;

    public LazyLayoutMeasureScopeImpl(@l LazyLayoutItemContentFactory lazyLayoutItemContentFactory, @l SubcomposeMeasureScope subcomposeMeasureScope) {
        this.itemContentFactory = lazyLayoutItemContentFactory;
        this.subcomposeMeasureScope = subcomposeMeasureScope;
        this.itemProvider = lazyLayoutItemContentFactory.getItemProvider().invoke();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.subcomposeMeasureScope.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.subcomposeMeasureScope.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    @l
    public LayoutDirection getLayoutDirection() {
        return this.subcomposeMeasureScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.subcomposeMeasureScope.isLookingAhead();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    @l
    public MeasureResult layout(int i5, int i6, @l Map<AlignmentLine, Integer> map, @l v3.l<? super Placeable.PlacementScope, r2> lVar) {
        return this.subcomposeMeasureScope.layout(i5, i6, map, lVar);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    @l
    /* renamed from: measure-0kLqBqw */
    public List<Placeable> mo717measure0kLqBqw(int i5, long j5) {
        List<Placeable> list = this.placeablesCache.get(Integer.valueOf(i5));
        if (list == null) {
            Object key = this.itemProvider.getKey(i5);
            List<Measurable> subcompose = this.subcomposeMeasureScope.subcompose(key, this.itemContentFactory.getContent(i5, key, this.itemProvider.getContentType(i5)));
            int size = subcompose.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.add(subcompose.get(i6).mo4998measureBRTryo0(j5));
            }
            this.placeablesCache.put(Integer.valueOf(i5), arrayList);
            return arrayList;
        }
        return list;
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo297roundToPxR2X_6o(long j5) {
        return this.subcomposeMeasureScope.mo297roundToPxR2X_6o(j5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo298roundToPx0680j_4(float f5) {
        return this.subcomposeMeasureScope.mo298roundToPx0680j_4(f5);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo299toDpGaN1DYA(long j5) {
        return this.subcomposeMeasureScope.mo299toDpGaN1DYA(j5);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo301toDpu2uoSUM(int i5) {
        return this.subcomposeMeasureScope.mo301toDpu2uoSUM(i5);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo302toDpSizekrfVVM(long j5) {
        return this.subcomposeMeasureScope.mo302toDpSizekrfVVM(j5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo303toPxR2X_6o(long j5) {
        return this.subcomposeMeasureScope.mo303toPxR2X_6o(j5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo304toPx0680j_4(float f5) {
        return this.subcomposeMeasureScope.mo304toPx0680j_4(f5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @l
    public Rect toRect(@l DpRect dpRect) {
        return this.subcomposeMeasureScope.toRect(dpRect);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo305toSizeXkaWNTQ(long j5) {
        return this.subcomposeMeasureScope.mo305toSizeXkaWNTQ(j5);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo306toSp0xMU5do(float f5) {
        return this.subcomposeMeasureScope.mo306toSp0xMU5do(f5);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo307toSpkPz2Gy4(float f5) {
        return this.subcomposeMeasureScope.mo307toSpkPz2Gy4(f5);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo300toDpu2uoSUM(float f5) {
        return this.subcomposeMeasureScope.mo300toDpu2uoSUM(f5);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo308toSpkPz2Gy4(int i5) {
        return this.subcomposeMeasureScope.mo308toSpkPz2Gy4(i5);
    }
}
