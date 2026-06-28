package androidx.compose.material3;

import androidx.compose.material3.MenuPosition;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\u0006\u0010\u001c\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0013\u00128\b\u0002\u0010\u001e\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0015¢\u0006\u0004\bA\u0010BJ2\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0010\u001a\u00020\rHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0013HÆ\u0003J9\u0010\u001a\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0015HÆ\u0003Jk\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u001328\b\u0002\u0010\u001e\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0015HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\t\u0010#\u001a\u00020\"HÖ\u0001J\t\u0010$\u001a\u00020\u0013HÖ\u0001J\u0013\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003R\u001d\u0010\u001b\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010)\u001a\u0004\b*\u0010\u000fR\u0017\u0010\u001c\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u001d\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001d\u0010.\u001a\u0004\b/\u00100RG\u0010\u001e\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u00158\u0006¢\u0006\f\n\u0004\b\u001e\u00101\u001a\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u00108\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00106R\u0014\u00109\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00106R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010>\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u0014\u0010?\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010<R\u0014\u0010@\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"Landroidx/compose/material3/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "Landroidx/compose/ui/unit/DpOffset;", "component1-RKDOV3M", "()J", "component1", "Landroidx/compose/ui/unit/Density;", "component2", "", "component3", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "menuBounds", "Lkotlin/r2;", "component4", "contentOffset", "density", "verticalMargin", "onPositionCalculated", "copy-uVxBXkw", "(JLandroidx/compose/ui/unit/Density;ILv3/p;)Landroidx/compose/material3/DropdownMenuPositionProvider;", "copy", "", "toString", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "J", "getContentOffset-RKDOV3M", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "I", "getVerticalMargin", "()I", "Lv3/p;", "getOnPositionCalculated", "()Lv3/p;", "Landroidx/compose/material3/MenuPosition$Horizontal;", "startToAnchorStart", "Landroidx/compose/material3/MenuPosition$Horizontal;", "endToAnchorEnd", "leftToWindowLeft", "rightToWindowRight", "Landroidx/compose/material3/MenuPosition$Vertical;", "topToAnchorBottom", "Landroidx/compose/material3/MenuPosition$Vertical;", "bottomToAnchorTop", "centerToAnchorTop", "topToWindowTop", "bottomToWindowBottom", "<init>", "(JLandroidx/compose/ui/unit/Density;ILv3/p;Lkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nMenuPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuPosition.kt\nandroidx/compose/material3/DropdownMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,412:1\n1#2:413\n151#3,3:414\n33#3,4:417\n154#3,2:421\n38#3:423\n156#3:424\n116#3,2:425\n33#3,6:427\n118#3:433\n151#3,3:434\n33#3,4:437\n154#3,2:441\n38#3:443\n156#3:444\n116#3,2:445\n33#3,6:447\n118#3:453\n*S KotlinDebug\n*F\n+ 1 MenuPosition.kt\nandroidx/compose/material3/DropdownMenuPositionProvider\n*L\n371#1:414,3\n371#1:417,4\n371#1:421,2\n371#1:423\n371#1:424\n379#1:425,2\n379#1:427,6\n379#1:433\n392#1:434,3\n392#1:437,4\n392#1:441,2\n392#1:443\n392#1:444\n399#1:445,2\n399#1:447,6\n399#1:453\n*E\n"})
/* loaded from: classes.dex */
public final class DropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;

    @p4.l
    private final MenuPosition.Vertical bottomToAnchorTop;

    @p4.l
    private final MenuPosition.Vertical bottomToWindowBottom;

    @p4.l
    private final MenuPosition.Vertical centerToAnchorTop;
    private final long contentOffset;

    @p4.l
    private final Density density;

    @p4.l
    private final MenuPosition.Horizontal endToAnchorEnd;

    @p4.l
    private final MenuPosition.Horizontal leftToWindowLeft;

    @p4.l
    private final v3.p<IntRect, IntRect, r2> onPositionCalculated;

    @p4.l
    private final MenuPosition.Horizontal rightToWindowRight;

    @p4.l
    private final MenuPosition.Horizontal startToAnchorStart;

    @p4.l
    private final MenuPosition.Vertical topToAnchorBottom;

    @p4.l
    private final MenuPosition.Vertical topToWindowTop;
    private final int verticalMargin;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/unit/IntRect;", "<anonymous parameter 0>", "<anonymous parameter 1>", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.DropdownMenuPositionProvider$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends kotlin.jvm.internal.n0 implements v3.p<IntRect, IntRect, r2> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(2);
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(IntRect intRect, IntRect intRect2) {
            invoke2(intRect, intRect2);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l IntRect intRect, @p4.l IntRect intRect2) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long j5, Density density, int i5, v3.p<? super IntRect, ? super IntRect, r2> pVar) {
        this.contentOffset = j5;
        this.density = density;
        this.verticalMargin = i5;
        this.onPositionCalculated = pVar;
        int mo298roundToPx0680j_4 = density.mo298roundToPx0680j_4(DpOffset.m6105getXD9Ej5fM(j5));
        MenuPosition menuPosition = MenuPosition.INSTANCE;
        this.startToAnchorStart = menuPosition.startToAnchorStart(mo298roundToPx0680j_4);
        this.endToAnchorEnd = menuPosition.endToAnchorEnd(mo298roundToPx0680j_4);
        this.leftToWindowLeft = menuPosition.leftToWindowLeft(0);
        this.rightToWindowRight = menuPosition.rightToWindowRight(0);
        int mo298roundToPx0680j_42 = density.mo298roundToPx0680j_4(DpOffset.m6107getYD9Ej5fM(j5));
        this.topToAnchorBottom = menuPosition.topToAnchorBottom(mo298roundToPx0680j_42);
        this.bottomToAnchorTop = menuPosition.bottomToAnchorTop(mo298roundToPx0680j_42);
        this.centerToAnchorTop = menuPosition.centerToAnchorTop(mo298roundToPx0680j_42);
        this.topToWindowTop = menuPosition.topToWindowTop(i5);
        this.bottomToWindowBottom = menuPosition.bottomToWindowBottom(i5);
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j5, Density density, int i5, v3.p pVar, kotlin.jvm.internal.w wVar) {
        this(j5, density, i5, pVar);
    }

    /* renamed from: copy-uVxBXkw$default, reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m1862copyuVxBXkw$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j5, Density density, int i5, v3.p pVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            j5 = dropdownMenuPositionProvider.contentOffset;
        }
        long j6 = j5;
        if ((i6 & 2) != 0) {
            density = dropdownMenuPositionProvider.density;
        }
        Density density2 = density;
        if ((i6 & 4) != 0) {
            i5 = dropdownMenuPositionProvider.verticalMargin;
        }
        int i7 = i5;
        if ((i6 & 8) != 0) {
            pVar = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m1864copyuVxBXkw(j6, density2, i7, pVar);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo979calculatePositionllwVHH4(@p4.l IntRect intRect, long j5, @p4.l LayoutDirection layoutDirection, long j6) {
        MenuPosition.Horizontal horizontal;
        List L;
        Object obj;
        Object obj2;
        Object m32;
        int intValue;
        MenuPosition.Vertical vertical;
        List L2;
        Object m33;
        int intValue2;
        boolean z4;
        boolean z5;
        MenuPosition.Horizontal[] horizontalArr = new MenuPosition.Horizontal[3];
        horizontalArr[0] = this.startToAnchorStart;
        horizontalArr[1] = this.endToAnchorEnd;
        if (IntOffset.m6172getXimpl(intRect.m6195getCenternOccac()) < IntSize.m6214getWidthimpl(j5) / 2) {
            horizontal = this.leftToWindowLeft;
        } else {
            horizontal = this.rightToWindowRight;
        }
        horizontalArr[2] = horizontal;
        L = kotlin.collections.w.L(horizontalArr);
        ArrayList arrayList = new ArrayList(L.size());
        int size = L.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(Integer.valueOf(((MenuPosition.Horizontal) L.get(i5)).mo1550position95KtPRI(intRect, j5, IntSize.m6214getWidthimpl(j6), layoutDirection)));
        }
        int size2 = arrayList.size();
        int i6 = 0;
        while (true) {
            obj = null;
            if (i6 < size2) {
                obj2 = arrayList.get(i6);
                int intValue3 = ((Number) obj2).intValue();
                if (intValue3 >= 0 && intValue3 + IntSize.m6214getWidthimpl(j6) <= IntSize.m6214getWidthimpl(j5)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    break;
                }
                i6++;
            } else {
                obj2 = null;
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            intValue = num.intValue();
        } else {
            m32 = kotlin.collections.e0.m3(arrayList);
            intValue = ((Number) m32).intValue();
        }
        MenuPosition.Vertical[] verticalArr = new MenuPosition.Vertical[4];
        verticalArr[0] = this.topToAnchorBottom;
        verticalArr[1] = this.bottomToAnchorTop;
        verticalArr[2] = this.centerToAnchorTop;
        if (IntOffset.m6173getYimpl(intRect.m6195getCenternOccac()) < IntSize.m6213getHeightimpl(j5) / 2) {
            vertical = this.topToWindowTop;
        } else {
            vertical = this.bottomToWindowBottom;
        }
        verticalArr[3] = vertical;
        L2 = kotlin.collections.w.L(verticalArr);
        ArrayList arrayList2 = new ArrayList(L2.size());
        int size3 = L2.size();
        for (int i7 = 0; i7 < size3; i7++) {
            arrayList2.add(Integer.valueOf(((MenuPosition.Vertical) L2.get(i7)).mo1551positionJVtK1S4(intRect, j5, IntSize.m6213getHeightimpl(j6))));
        }
        int size4 = arrayList2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                break;
            }
            Object obj3 = arrayList2.get(i8);
            int intValue4 = ((Number) obj3).intValue();
            if (intValue4 >= this.verticalMargin && intValue4 + IntSize.m6213getHeightimpl(j6) <= IntSize.m6213getHeightimpl(j5) - this.verticalMargin) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                obj = obj3;
                break;
            }
            i8++;
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            intValue2 = num2.intValue();
        } else {
            m33 = kotlin.collections.e0.m3(arrayList2);
            intValue2 = ((Number) m33).intValue();
        }
        long IntOffset = IntOffsetKt.IntOffset(intValue, intValue2);
        this.onPositionCalculated.invoke(intRect, IntRectKt.m6204IntRectVbeCjmY(IntOffset, j6));
        return IntOffset;
    }

    /* renamed from: component1-RKDOV3M, reason: not valid java name */
    public final long m1863component1RKDOV3M() {
        return this.contentOffset;
    }

    @p4.l
    public final Density component2() {
        return this.density;
    }

    public final int component3() {
        return this.verticalMargin;
    }

    @p4.l
    public final v3.p<IntRect, IntRect, r2> component4() {
        return this.onPositionCalculated;
    }

    @p4.l
    /* renamed from: copy-uVxBXkw, reason: not valid java name */
    public final DropdownMenuPositionProvider m1864copyuVxBXkw(long j5, @p4.l Density density, int i5, @p4.l v3.p<? super IntRect, ? super IntRect, r2> pVar) {
        return new DropdownMenuPositionProvider(j5, density, i5, pVar, null);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
        return DpOffset.m6104equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && kotlin.jvm.internal.l0.g(this.density, dropdownMenuPositionProvider.density) && this.verticalMargin == dropdownMenuPositionProvider.verticalMargin && kotlin.jvm.internal.l0.g(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    /* renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m1865getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    @p4.l
    public final Density getDensity() {
        return this.density;
    }

    @p4.l
    public final v3.p<IntRect, IntRect, r2> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    public int hashCode() {
        return (((((DpOffset.m6109hashCodeimpl(this.contentOffset) * 31) + this.density.hashCode()) * 31) + Integer.hashCode(this.verticalMargin)) * 31) + this.onPositionCalculated.hashCode();
    }

    @p4.l
    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m6112toStringimpl(this.contentOffset)) + ", density=" + this.density + ", verticalMargin=" + this.verticalMargin + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j5, Density density, int i5, v3.p pVar, int i6, kotlin.jvm.internal.w wVar) {
        this(j5, density, (i6 & 4) != 0 ? density.mo298roundToPx0680j_4(MenuKt.getMenuVerticalMargin()) : i5, (i6 & 8) != 0 ? AnonymousClass2.INSTANCE : pVar, null);
    }
}
