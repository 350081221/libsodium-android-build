package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@Stable
@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u000b\u001a\u00020\f*\u00020\u0010H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u000b\u001a\u00020\f*\u00020\u0006H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0016*\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u0016\u0010\u001b\u001a\u00020\r*\u00020\fH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001b\u001a\u00020\r*\u00020\u0010H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010\u001b\u001a\u00020\r*\u00020\u0006H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0001\u0001 ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "measure", "", "Landroidx/compose/ui/layout/Placeable;", "index", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-0kLqBqw", "(IJ)Ljava/util/List;", "toDp", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/TextUnit;", "toDp-GaN1DYA", "(J)F", "", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalFoundationApi
@r1({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,154:1\n1#2:155\n174#3:156\n174#3:157\n473#3:158\n152#4:159\n*S KotlinDebug\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n*L\n74#1:156\n77#1:157\n89#1:158\n96#1:159\n*E\n"})
/* loaded from: classes.dex */
public interface LazyLayoutMeasureScope extends MeasureScope {
    @l
    /* renamed from: measure-0kLqBqw, reason: not valid java name */
    List<Placeable> mo717measure0kLqBqw(int i5, long j5);

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    default float mo299toDpGaN1DYA(long j5) {
        if (TextUnitType.m6263equalsimpl0(TextUnit.m6234getTypeUIouoOA(j5), TextUnitType.Companion.m6268getSpUIouoOA())) {
            return Dp.m6044constructorimpl(TextUnit.m6235getValueimpl(j5) * getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo301toDpu2uoSUM(int i5) {
        return Dp.m6044constructorimpl(i5 / getDensity());
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    default long mo302toDpSizekrfVVM(long j5) {
        boolean z4;
        if (j5 != Size.Companion.m3570getUnspecifiedNHjbRc()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return DpKt.m6066DpSizeYgX7TsA(mo300toDpu2uoSUM(Size.m3562getWidthimpl(j5)), mo300toDpu2uoSUM(Size.m3559getHeightimpl(j5)));
        }
        return DpSize.Companion.m6151getUnspecifiedMYxV2XQ();
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    default long mo305toSizeXkaWNTQ(long j5) {
        boolean z4;
        if (j5 != DpSize.Companion.m6151getUnspecifiedMYxV2XQ()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return SizeKt.Size(mo304toPx0680j_4(DpSize.m6142getWidthD9Ej5fM(j5)), mo304toPx0680j_4(DpSize.m6140getHeightD9Ej5fM(j5)));
        }
        return Size.Companion.m3570getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    default long mo306toSp0xMU5do(float f5) {
        return TextUnitKt.getSp(f5 / getFontScale());
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo307toSpkPz2Gy4(float f5) {
        return TextUnitKt.getSp(f5 / (getFontScale() * getDensity()));
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo308toSpkPz2Gy4(int i5) {
        return TextUnitKt.getSp(i5 / (getFontScale() * getDensity()));
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo300toDpu2uoSUM(float f5) {
        return Dp.m6044constructorimpl(f5 / getDensity());
    }
}
