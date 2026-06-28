package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Iterator;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.sequences.m;
import kotlin.sequences.s;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u001a\b\u0002\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b,\u0010-J2\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0010\u001a\u00020\rHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\u001b\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\u001a\b\u0002\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003R\u001d\u0010\u0016\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010$\u001a\u0004\b%\u0010\u000fR\u0017\u0010\u0017\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b'\u0010(R)\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b*\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/material/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "Landroidx/compose/ui/unit/DpOffset;", "component1-RKDOV3M", "()J", "component1", "Landroidx/compose/ui/unit/Density;", "component2", "Lkotlin/Function2;", "Lkotlin/r2;", "component3", "contentOffset", "density", "onPositionCalculated", "copy-rOJDEFc", "(JLandroidx/compose/ui/unit/Density;Lv3/p;)Landroidx/compose/material/DropdownMenuPositionProvider;", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "J", "getContentOffset-RKDOV3M", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "Lv3/p;", "getOnPositionCalculated", "()Lv3/p;", "<init>", "(JLandroidx/compose/ui/unit/Density;Lv3/p;Lkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material/DropdownMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,304:1\n1#2:305\n179#3,2:306\n179#3,2:308\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material/DropdownMenuPositionProvider\n*L\n278#1:306,2\n292#1:308,2\n*E\n"})
/* loaded from: classes.dex */
public final class DropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final long contentOffset;

    @l
    private final Density density;

    @l
    private final p<IntRect, IntRect, r2> onPositionCalculated;

    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/unit/IntRect;", "<anonymous parameter 0>", "<anonymous parameter 1>", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.DropdownMenuPositionProvider$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends n0 implements p<IntRect, IntRect, r2> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(IntRect intRect, IntRect intRect2) {
            invoke2(intRect, intRect2);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l IntRect intRect, @l IntRect intRect2) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long j5, Density density, p<? super IntRect, ? super IntRect, r2> pVar) {
        this.contentOffset = j5;
        this.density = density;
        this.onPositionCalculated = pVar;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j5, Density density, p pVar, w wVar) {
        this(j5, density, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-rOJDEFc$default, reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m1333copyrOJDEFc$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j5, Density density, p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = dropdownMenuPositionProvider.contentOffset;
        }
        if ((i5 & 2) != 0) {
            density = dropdownMenuPositionProvider.density;
        }
        if ((i5 & 4) != 0) {
            pVar = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m1335copyrOJDEFc(j5, density, pVar);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo979calculatePositionllwVHH4(@l IntRect intRect, long j5, @l LayoutDirection layoutDirection, long j6) {
        int i5;
        m q5;
        Object obj;
        Object obj2;
        m q6;
        boolean z4;
        boolean z5;
        int mo298roundToPx0680j_4 = this.density.mo298roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
        int mo298roundToPx0680j_42 = this.density.mo298roundToPx0680j_4(DpOffset.m6105getXD9Ej5fM(this.contentOffset));
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        if (layoutDirection == layoutDirection2) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        int i6 = mo298roundToPx0680j_42 * i5;
        int mo298roundToPx0680j_43 = this.density.mo298roundToPx0680j_4(DpOffset.m6107getYD9Ej5fM(this.contentOffset));
        int left = intRect.getLeft() + i6;
        int right = (intRect.getRight() - IntSize.m6214getWidthimpl(j6)) + i6;
        int m6214getWidthimpl = IntSize.m6214getWidthimpl(j5) - IntSize.m6214getWidthimpl(j6);
        if (layoutDirection == layoutDirection2) {
            Integer[] numArr = new Integer[3];
            numArr[0] = Integer.valueOf(left);
            numArr[1] = Integer.valueOf(right);
            if (intRect.getLeft() < 0) {
                m6214getWidthimpl = 0;
            }
            numArr[2] = Integer.valueOf(m6214getWidthimpl);
            q5 = s.q(numArr);
        } else {
            Integer[] numArr2 = new Integer[3];
            numArr2[0] = Integer.valueOf(right);
            numArr2[1] = Integer.valueOf(left);
            if (intRect.getRight() <= IntSize.m6214getWidthimpl(j5)) {
                m6214getWidthimpl = 0;
            }
            numArr2[2] = Integer.valueOf(m6214getWidthimpl);
            q5 = s.q(numArr2);
        }
        Iterator it = q5.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                int intValue = ((Number) obj2).intValue();
                if (intValue >= 0 && intValue + IntSize.m6214getWidthimpl(j6) <= IntSize.m6214getWidthimpl(j5)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            right = num.intValue();
        }
        int max = Math.max(intRect.getBottom() + mo298roundToPx0680j_43, mo298roundToPx0680j_4);
        int top = (intRect.getTop() - IntSize.m6213getHeightimpl(j6)) + mo298roundToPx0680j_43;
        q6 = s.q(Integer.valueOf(max), Integer.valueOf(top), Integer.valueOf((intRect.getTop() - (IntSize.m6213getHeightimpl(j6) / 2)) + mo298roundToPx0680j_43), Integer.valueOf((IntSize.m6213getHeightimpl(j5) - IntSize.m6213getHeightimpl(j6)) - mo298roundToPx0680j_4));
        Iterator it2 = q6.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int intValue2 = ((Number) next).intValue();
            if (intValue2 >= mo298roundToPx0680j_4 && intValue2 + IntSize.m6213getHeightimpl(j6) <= IntSize.m6213getHeightimpl(j5) - mo298roundToPx0680j_4) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                obj = next;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            top = num2.intValue();
        }
        this.onPositionCalculated.invoke(intRect, new IntRect(right, top, IntSize.m6214getWidthimpl(j6) + right, IntSize.m6213getHeightimpl(j6) + top));
        return IntOffsetKt.IntOffset(right, top);
    }

    /* renamed from: component1-RKDOV3M, reason: not valid java name */
    public final long m1334component1RKDOV3M() {
        return this.contentOffset;
    }

    @l
    public final Density component2() {
        return this.density;
    }

    @l
    public final p<IntRect, IntRect, r2> component3() {
        return this.onPositionCalculated;
    }

    @l
    /* renamed from: copy-rOJDEFc, reason: not valid java name */
    public final DropdownMenuPositionProvider m1335copyrOJDEFc(long j5, @l Density density, @l p<? super IntRect, ? super IntRect, r2> pVar) {
        return new DropdownMenuPositionProvider(j5, density, pVar, null);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
        return DpOffset.m6104equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && l0.g(this.density, dropdownMenuPositionProvider.density) && l0.g(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    /* renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m1336getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    @l
    public final Density getDensity() {
        return this.density;
    }

    @l
    public final p<IntRect, IntRect, r2> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public int hashCode() {
        return (((DpOffset.m6109hashCodeimpl(this.contentOffset) * 31) + this.density.hashCode()) * 31) + this.onPositionCalculated.hashCode();
    }

    @l
    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m6112toStringimpl(this.contentOffset)) + ", density=" + this.density + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j5, Density density, p pVar, int i5, w wVar) {
        this(j5, density, (i5 & 4) != 0 ? AnonymousClass1.INSTANCE : pVar, null);
    }
}
