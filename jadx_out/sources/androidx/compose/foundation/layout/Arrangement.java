package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b:\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005KLMNOB\t\b\u0002¢\u0006\u0004\bJ\u00100J/\u0010\t\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0082\bJ\u001a\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u000f\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0015H\u0007J/\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\"\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b \u0010!J/\u0010$\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b#\u0010\u001eJ/\u0010&\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b%\u0010\u001eJ/\u0010(\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b'\u0010\u001eJ/\u0010*\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b)\u0010\u001eR \u0010+\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R \u00101\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010,\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010.R \u00104\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u00100\u001a\u0004\b6\u00107R \u00109\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u00105\u0012\u0004\b;\u00100\u001a\u0004\b:\u00107R \u0010<\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u00100\u001a\u0004\b>\u0010?R \u0010A\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010=\u0012\u0004\bC\u00100\u001a\u0004\bB\u0010?R \u0010D\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010=\u0012\u0004\bF\u00100\u001a\u0004\bE\u0010?R \u0010G\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bG\u0010=\u0012\u0004\bI\u00100\u001a\u0004\bH\u0010?\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006P"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement;", "", "", "", "reversed", "Lkotlin/Function2;", "", "Lkotlin/r2;", "action", "forEachIndexed", "Landroidx/compose/ui/unit/Dp;", "space", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy-0680j_4", "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy", "Landroidx/compose/ui/Alignment$Horizontal;", "alignment", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "spacedBy-D5KLDUw", "(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "aligned", "totalSize", "size", "outPosition", "reverseInput", "placeRightOrBottom$foundation_layout_release", "(I[I[IZ)V", "placeRightOrBottom", "placeLeftOrTop$foundation_layout_release", "([I[IZ)V", "placeLeftOrTop", "placeCenter$foundation_layout_release", "placeCenter", "placeSpaceEvenly$foundation_layout_release", "placeSpaceEvenly", "placeSpaceBetween$foundation_layout_release", "placeSpaceBetween", "placeSpaceAround$foundation_layout_release", "placeSpaceAround", "Start", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getStart", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getStart$annotations", "()V", "End", "getEnd", "getEnd$annotations", "Top", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getTop", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getTop$annotations", "Bottom", "getBottom", "getBottom$annotations", "Center", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "getCenter", "()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "getCenter$annotations", "SpaceEvenly", "getSpaceEvenly", "getSpaceEvenly$annotations", "SpaceBetween", "getSpaceBetween", "getSpaceBetween$annotations", "SpaceAround", "getSpaceAround", "getSpaceAround$annotations", "<init>", "Absolute", "Horizontal", "HorizontalOrVertical", "SpacedAligned", "Vertical", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,715:1\n706#1,2:721\n709#1,5:726\n706#1,2:731\n709#1,5:736\n706#1,2:744\n709#1,5:749\n706#1,2:757\n709#1,5:762\n706#1,2:770\n709#1,5:775\n706#1,2:783\n709#1,5:788\n154#2:716\n154#2:717\n13032#3,3:718\n13674#3,3:723\n13674#3,3:733\n13032#3,3:741\n13674#3,3:746\n13032#3,3:754\n13674#3,3:759\n13032#3,3:767\n13674#3,3:772\n13032#3,3:780\n13674#3,3:785\n13674#3,3:793\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n*L\n619#1:721,2\n619#1:726,5\n627#1:731,2\n627#1:736,5\n641#1:744,2\n641#1:749,5\n656#1:757,2\n656#1:762,5\n680#1:770,2\n680#1:775,5\n699#1:783,2\n699#1:788,5\n355#1:716\n367#1:717\n617#1:718,3\n619#1:723,3\n627#1:733,3\n639#1:741,3\n641#1:746,3\n653#1:754,3\n656#1:759,3\n670#1:767,3\n680#1:772,3\n692#1:780,3\n699#1:785,3\n707#1:793,3\n*E\n"})
/* loaded from: classes.dex */
public final class Arrangement {
    public static final int $stable = 0;

    @l
    public static final Arrangement INSTANCE = new Arrangement();

    @l
    private static final Horizontal Start = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Start$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@l Density density, int i5, @l int[] iArr, @l LayoutDirection layoutDirection, @l int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i5, iArr, iArr2, true);
            }
        }

        @l
        public String toString() {
            return "Arrangement#Start";
        }
    };

    @l
    private static final Horizontal End = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$End$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@l Density density, int i5, @l int[] iArr, @l LayoutDirection layoutDirection, @l int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i5, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, true);
            }
        }

        @l
        public String toString() {
            return "Arrangement#End";
        }
    };

    @l
    private static final Vertical Top = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Top$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@l Density density, int i5, @l int[] iArr, @l int[] iArr2) {
            Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
        }

        @l
        public String toString() {
            return "Arrangement#Top";
        }
    };

    @l
    private static final Vertical Bottom = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Bottom$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@l Density density, int i5, @l int[] iArr, @l int[] iArr2) {
            Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i5, iArr, iArr2, false);
        }

        @l
        public String toString() {
            return "Arrangement#Bottom";
        }
    };

    @l
    private static final HorizontalOrVertical Center = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$Center$1
        private final float spacing = Dp.m6044constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@l Density density, int i5, @l int[] iArr, @l LayoutDirection layoutDirection, @l int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i5, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i5, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
        public float mo468getSpacingD9Ej5fM() {
            return this.spacing;
        }

        @l
        public String toString() {
            return "Arrangement#Center";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@l Density density, int i5, @l int[] iArr, @l int[] iArr2) {
            Arrangement.INSTANCE.placeCenter$foundation_layout_release(i5, iArr, iArr2, false);
        }
    };

    @l
    private static final HorizontalOrVertical SpaceEvenly = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceEvenly$1
        private final float spacing = Dp.m6044constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@l Density density, int i5, @l int[] iArr, @l LayoutDirection layoutDirection, @l int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i5, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i5, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo468getSpacingD9Ej5fM() {
            return this.spacing;
        }

        @l
        public String toString() {
            return "Arrangement#SpaceEvenly";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@l Density density, int i5, @l int[] iArr, @l int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i5, iArr, iArr2, false);
        }
    };

    @l
    private static final HorizontalOrVertical SpaceBetween = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceBetween$1
        private final float spacing = Dp.m6044constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@l Density density, int i5, @l int[] iArr, @l LayoutDirection layoutDirection, @l int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i5, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i5, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo468getSpacingD9Ej5fM() {
            return this.spacing;
        }

        @l
        public String toString() {
            return "Arrangement#SpaceBetween";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@l Density density, int i5, @l int[] iArr, @l int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i5, iArr, iArr2, false);
        }
    };

    @l
    private static final HorizontalOrVertical SpaceAround = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceAround$1
        private final float spacing = Dp.m6044constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@l Density density, int i5, @l int[] iArr, @l LayoutDirection layoutDirection, @l int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i5, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i5, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo468getSpacingD9Ej5fM() {
            return this.spacing;
        }

        @l
        public String toString() {
            return "Arrangement#SpaceAround";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@l Density density, int i5, @l int[] iArr, @l int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i5, iArr, iArr2, false);
        }
    };

    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!J\"\u0010\u001a\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020#H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010$R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Absolute;", "", "()V", "Center", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getCenter$annotations", "getCenter", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Left", "getLeft$annotations", "getLeft", "Right", "getRight$annotations", "getRight", "SpaceAround", "getSpaceAround$annotations", "getSpaceAround", "SpaceBetween", "getSpaceBetween$annotations", "getSpaceBetween", "SpaceEvenly", "getSpaceEvenly$annotations", "getSpaceEvenly", "aligned", "alignment", "Landroidx/compose/ui/Alignment$Horizontal;", "spacedBy", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "space", "Landroidx/compose/ui/unit/Dp;", "spacedBy-0680j_4", "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy-D5KLDUw", "(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    @r1({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n154#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n*L\n556#1:716\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Absolute {
        public static final int $stable = 0;

        @l
        public static final Absolute INSTANCE = new Absolute();

        @l
        private static final Horizontal Left = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Left$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(@l Density density, int i5, @l int[] iArr, @l LayoutDirection layoutDirection, @l int[] iArr2) {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
            }

            @l
            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        };

        @l
        private static final Horizontal Center = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Center$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(@l Density density, int i5, @l int[] iArr, @l LayoutDirection layoutDirection, @l int[] iArr2) {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i5, iArr, iArr2, false);
            }

            @l
            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        };

        @l
        private static final Horizontal Right = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Right$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(@l Density density, int i5, @l int[] iArr, @l LayoutDirection layoutDirection, @l int[] iArr2) {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i5, iArr, iArr2, false);
            }

            @l
            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        };

        @l
        private static final Horizontal SpaceBetween = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceBetween$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(@l Density density, int i5, @l int[] iArr, @l LayoutDirection layoutDirection, @l int[] iArr2) {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i5, iArr, iArr2, false);
            }

            @l
            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        };

        @l
        private static final Horizontal SpaceEvenly = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceEvenly$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(@l Density density, int i5, @l int[] iArr, @l LayoutDirection layoutDirection, @l int[] iArr2) {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i5, iArr, iArr2, false);
            }

            @l
            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        };

        @l
        private static final Horizontal SpaceAround = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceAround$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(@l Density density, int i5, @l int[] iArr, @l LayoutDirection layoutDirection, @l int[] iArr2) {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i5, iArr, iArr2, false);
            }

            @l
            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        };

        private Absolute() {
        }

        @Stable
        public static /* synthetic */ void getCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getLeft$annotations() {
        }

        @Stable
        public static /* synthetic */ void getRight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceAround$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceBetween$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceEvenly$annotations() {
        }

        @Stable
        @l
        public final Horizontal aligned(@l Alignment.Horizontal horizontal) {
            return new SpacedAligned(Dp.m6044constructorimpl(0), false, new Arrangement$Absolute$aligned$1(horizontal), null);
        }

        @l
        public final Horizontal getCenter() {
            return Center;
        }

        @l
        public final Horizontal getLeft() {
            return Left;
        }

        @l
        public final Horizontal getRight() {
            return Right;
        }

        @l
        public final Horizontal getSpaceAround() {
            return SpaceAround;
        }

        @l
        public final Horizontal getSpaceBetween() {
            return SpaceBetween;
        }

        @l
        public final Horizontal getSpaceEvenly() {
            return SpaceEvenly;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Stable
        @l
        /* renamed from: spacedBy-0680j_4, reason: not valid java name */
        public final HorizontalOrVertical m465spacedBy0680j_4(float f5) {
            return new SpacedAligned(f5, false, null, 0 == true ? 1 : 0);
        }

        @Stable
        @l
        /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
        public final Horizontal m466spacedByD5KLDUw(float f5, @l Alignment.Horizontal horizontal) {
            return new SpacedAligned(f5, false, new Arrangement$Absolute$spacedBy$1(horizontal), null);
        }

        @Stable
        @l
        /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
        public final Vertical m467spacedByD5KLDUw(float f5, @l Alignment.Vertical vertical) {
            return new SpacedAligned(f5, false, new Arrangement$Absolute$spacedBy$2(vertical), null);
        }
    }

    @Stable
    @i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&R\u001a\u0010\u000f\u001a\u00020\f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "", "Landroidx/compose/ui/unit/Density;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "Lkotlin/r2;", "arrange", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n154#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n*L\n51#1:716\n*E\n"})
    /* loaded from: classes.dex */
    public interface Horizontal {

        @i0(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class DefaultImpls {
            @Deprecated
            /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m470getSpacingD9Ej5fM(@l Horizontal horizontal) {
                return Horizontal.super.mo468getSpacingD9Ej5fM();
            }
        }

        void arrange(@l Density density, int i5, @l int[] iArr, @l LayoutDirection layoutDirection, @l int[] iArr2);

        /* renamed from: getSpacing-D9Ej5fM */
        default float mo468getSpacingD9Ej5fM() {
            return Dp.m6044constructorimpl(0);
        }
    }

    @Stable
    @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "spacing", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n154#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n*L\n108#1:716\n*E\n"})
    /* loaded from: classes.dex */
    public interface HorizontalOrVertical extends Horizontal, Vertical {

        @i0(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class DefaultImpls {
            @Deprecated
            /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m472getSpacingD9Ej5fM(@l HorizontalOrVertical horizontalOrVertical) {
                return HorizontalOrVertical.super.mo468getSpacingD9Ej5fM();
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        default float mo468getSpacingD9Ej5fM() {
            return Dp.m6044constructorimpl(0);
        }
    }

    @Stable
    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&R\u001a\u0010\r\u001a\u00020\n8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Vertical;", "", "Landroidx/compose/ui/unit/Density;", "", "totalSize", "", "sizes", "outPositions", "Lkotlin/r2;", "arrange", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n154#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n*L\n80#1:716\n*E\n"})
    /* loaded from: classes.dex */
    public interface Vertical {

        @i0(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class DefaultImpls {
            @Deprecated
            /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m478getSpacingD9Ej5fM(@l Vertical vertical) {
                return Vertical.super.mo468getSpacingD9Ej5fM();
            }
        }

        void arrange(@l Density density, int i5, @l int[] iArr, @l int[] iArr2);

        /* renamed from: getSpacing-D9Ej5fM */
        default float mo468getSpacingD9Ej5fM() {
            return Dp.m6044constructorimpl(0);
        }
    }

    private Arrangement() {
    }

    private final void forEachIndexed(int[] iArr, boolean z4, p<? super Integer, ? super Integer, r2> pVar) {
        if (!z4) {
            int length = iArr.length;
            int i5 = 0;
            int i6 = 0;
            while (i5 < length) {
                pVar.invoke(Integer.valueOf(i6), Integer.valueOf(iArr[i5]));
                i5++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                pVar.invoke(Integer.valueOf(length2), Integer.valueOf(iArr[length2]));
            } else {
                return;
            }
        }
    }

    @Stable
    public static /* synthetic */ void getBottom$annotations() {
    }

    @Stable
    public static /* synthetic */ void getCenter$annotations() {
    }

    @Stable
    public static /* synthetic */ void getEnd$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceAround$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceBetween$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceEvenly$annotations() {
    }

    @Stable
    public static /* synthetic */ void getStart$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTop$annotations() {
    }

    @Stable
    @l
    public final Horizontal aligned(@l Alignment.Horizontal horizontal) {
        return new SpacedAligned(Dp.m6044constructorimpl(0), true, new Arrangement$aligned$1(horizontal), null);
    }

    @l
    public final Vertical getBottom() {
        return Bottom;
    }

    @l
    public final HorizontalOrVertical getCenter() {
        return Center;
    }

    @l
    public final Horizontal getEnd() {
        return End;
    }

    @l
    public final HorizontalOrVertical getSpaceAround() {
        return SpaceAround;
    }

    @l
    public final HorizontalOrVertical getSpaceBetween() {
        return SpaceBetween;
    }

    @l
    public final HorizontalOrVertical getSpaceEvenly() {
        return SpaceEvenly;
    }

    @l
    public final Horizontal getStart() {
        return Start;
    }

    @l
    public final Vertical getTop() {
        return Top;
    }

    public final void placeCenter$foundation_layout_release(int i5, @l int[] iArr, @l int[] iArr2, boolean z4) {
        int L0;
        int L02;
        int i6 = 0;
        int i7 = 0;
        for (int i8 : iArr) {
            i7 += i8;
        }
        float f5 = (i5 - i7) / 2;
        if (!z4) {
            int length = iArr.length;
            int i9 = 0;
            while (i6 < length) {
                int i10 = iArr[i6];
                L02 = kotlin.math.d.L0(f5);
                iArr2[i9] = L02;
                f5 += i10;
                i6++;
                i9++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i11 = iArr[length2];
                L0 = kotlin.math.d.L0(f5);
                iArr2[length2] = L0;
                f5 += i11;
            } else {
                return;
            }
        }
    }

    public final void placeLeftOrTop$foundation_layout_release(@l int[] iArr, @l int[] iArr2, boolean z4) {
        int i5 = 0;
        if (!z4) {
            int length = iArr.length;
            int i6 = 0;
            int i7 = 0;
            while (i5 < length) {
                int i8 = iArr[i5];
                iArr2[i6] = i7;
                i7 += i8;
                i5++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i9 = iArr[length2];
                iArr2[length2] = i5;
                i5 += i9;
            } else {
                return;
            }
        }
    }

    public final void placeRightOrBottom$foundation_layout_release(int i5, @l int[] iArr, @l int[] iArr2, boolean z4) {
        int i6 = 0;
        int i7 = 0;
        for (int i8 : iArr) {
            i7 += i8;
        }
        int i9 = i5 - i7;
        if (!z4) {
            int length = iArr.length;
            int i10 = 0;
            while (i6 < length) {
                int i11 = iArr[i6];
                iArr2[i10] = i9;
                i9 += i11;
                i6++;
                i10++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i12 = iArr[length2];
                iArr2[length2] = i9;
                i9 += i12;
            } else {
                return;
            }
        }
    }

    public final void placeSpaceAround$foundation_layout_release(int i5, @l int[] iArr, @l int[] iArr2, boolean z4) {
        boolean z5;
        float f5;
        int L0;
        int L02;
        int i6 = 0;
        int i7 = 0;
        for (int i8 : iArr) {
            i7 += i8;
        }
        if (iArr.length == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            f5 = (i5 - i7) / iArr.length;
        } else {
            f5 = 0.0f;
        }
        float f6 = f5 / 2;
        if (!z4) {
            int length = iArr.length;
            int i9 = 0;
            while (i6 < length) {
                int i10 = iArr[i6];
                L02 = kotlin.math.d.L0(f6);
                iArr2[i9] = L02;
                f6 += i10 + f5;
                i6++;
                i9++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i11 = iArr[length2];
            L0 = kotlin.math.d.L0(f6);
            iArr2[length2] = L0;
            f6 += i11 + f5;
        }
    }

    public final void placeSpaceBetween$foundation_layout_release(int i5, @l int[] iArr, @l int[] iArr2, boolean z4) {
        boolean z5;
        int ue;
        float f5;
        int L0;
        int L02;
        int i6 = 0;
        if (iArr.length == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return;
        }
        int i7 = 0;
        for (int i8 : iArr) {
            i7 += i8;
        }
        ue = kotlin.collections.p.ue(iArr);
        float max = (i5 - i7) / Math.max(ue, 1);
        if (z4 && iArr.length == 1) {
            f5 = max;
        } else {
            f5 = 0.0f;
        }
        if (!z4) {
            int length = iArr.length;
            int i9 = 0;
            while (i6 < length) {
                int i10 = iArr[i6];
                L02 = kotlin.math.d.L0(f5);
                iArr2[i9] = L02;
                f5 += i10 + max;
                i6++;
                i9++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i11 = iArr[length2];
            L0 = kotlin.math.d.L0(f5);
            iArr2[length2] = L0;
            f5 += i11 + max;
        }
    }

    public final void placeSpaceEvenly$foundation_layout_release(int i5, @l int[] iArr, @l int[] iArr2, boolean z4) {
        int L0;
        int L02;
        int i6 = 0;
        int i7 = 0;
        for (int i8 : iArr) {
            i7 += i8;
        }
        float length = (i5 - i7) / (iArr.length + 1);
        if (!z4) {
            int length2 = iArr.length;
            float f5 = length;
            int i9 = 0;
            while (i6 < length2) {
                int i10 = iArr[i6];
                L02 = kotlin.math.d.L0(f5);
                iArr2[i9] = L02;
                f5 += i10 + length;
                i6++;
                i9++;
            }
            return;
        }
        float f6 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i11 = iArr[length3];
            L0 = kotlin.math.d.L0(f6);
            iArr2[length3] = L0;
            f6 += i11 + length;
        }
    }

    @Stable
    @l
    /* renamed from: spacedBy-0680j_4, reason: not valid java name */
    public final HorizontalOrVertical m462spacedBy0680j_4(float f5) {
        return new SpacedAligned(f5, true, Arrangement$spacedBy$1.INSTANCE, null);
    }

    @Stable
    @l
    /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final Horizontal m463spacedByD5KLDUw(float f5, @l Alignment.Horizontal horizontal) {
        return new SpacedAligned(f5, true, new Arrangement$spacedBy$2(horizontal), null);
    }

    @Stable
    @l
    /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final Vertical m464spacedByD5KLDUw(float f5, @l Alignment.Vertical vertical) {
        return new SpacedAligned(f5, false, new Arrangement$spacedBy$3(vertical), null);
    }

    @Stable
    @l
    public final Vertical aligned(@l Alignment.Vertical vertical) {
        return new SpacedAligned(Dp.m6044constructorimpl(0), false, new Arrangement$aligned$2(vertical), null);
    }

    @i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014¢\u0006\u0004\b*\u0010+J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J$\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0016\u0010\u0011\u001a\u00020\u000eHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\u001d\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u00122\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003R\u001d\u0010\u0016\u001a\u00020\u000e8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b#\u0010$R+\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b&\u0010'R \u0010(\u001a\u00020\u000e8\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u0010\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/ui/unit/Density;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "Lkotlin/r2;", "arrange", "", "toString", "Landroidx/compose/ui/unit/Dp;", "component1-D9Ej5fM", "()F", "component1", "", "component2", "Lkotlin/Function2;", "component3", "space", "rtlMirror", "alignment", "copy-8Feqmps", "(FZLv3/p;)Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;", "copy", TTDownloadField.TT_HASHCODE, "", "other", "equals", "F", "getSpace-D9Ej5fM", "Z", "getRtlMirror", "()Z", "Lv3/p;", "getAlignment", "()Lv3/p;", "spacing", "getSpacing-D9Ej5fM", "<init>", "(FZLv3/p;Lkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    @Immutable
    @r1({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n+ 2 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,715:1\n706#2,2:716\n709#2,5:721\n13674#3,3:718\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n*L\n586#1:716,2\n586#1:721,5\n586#1:718,3\n*E\n"})
    /* loaded from: classes.dex */
    public static final class SpacedAligned implements HorizontalOrVertical {
        public static final int $stable = 0;

        @m
        private final p<Integer, LayoutDirection, Integer> alignment;
        private final boolean rtlMirror;
        private final float space;
        private final float spacing;

        /* JADX WARN: Multi-variable type inference failed */
        private SpacedAligned(float f5, boolean z4, p<? super Integer, ? super LayoutDirection, Integer> pVar) {
            this.space = f5;
            this.rtlMirror = z4;
            this.alignment = pVar;
            this.spacing = f5;
        }

        public /* synthetic */ SpacedAligned(float f5, boolean z4, p pVar, w wVar) {
            this(f5, z4, pVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-8Feqmps$default, reason: not valid java name */
        public static /* synthetic */ SpacedAligned m473copy8Feqmps$default(SpacedAligned spacedAligned, float f5, boolean z4, p pVar, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = spacedAligned.space;
            }
            if ((i5 & 2) != 0) {
                z4 = spacedAligned.rtlMirror;
            }
            if ((i5 & 4) != 0) {
                pVar = spacedAligned.alignment;
            }
            return spacedAligned.m475copy8Feqmps(f5, z4, pVar);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@l Density density, int i5, @l int[] iArr, @l LayoutDirection layoutDirection, @l int[] iArr2) {
            int i6;
            int i7;
            if (iArr.length == 0) {
                return;
            }
            int mo298roundToPx0680j_4 = density.mo298roundToPx0680j_4(this.space);
            boolean z4 = this.rtlMirror && layoutDirection == LayoutDirection.Rtl;
            Arrangement arrangement = Arrangement.INSTANCE;
            if (!z4) {
                int length = iArr.length;
                int i8 = 0;
                i6 = 0;
                i7 = 0;
                int i9 = 0;
                while (i8 < length) {
                    int i10 = iArr[i8];
                    int min = Math.min(i6, i5 - i10);
                    iArr2[i9] = min;
                    int min2 = Math.min(mo298roundToPx0680j_4, (i5 - min) - i10);
                    int i11 = iArr2[i9] + i10 + min2;
                    i8++;
                    i9++;
                    i7 = min2;
                    i6 = i11;
                }
            } else {
                i6 = 0;
                i7 = 0;
                for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                    int i12 = iArr[length2];
                    int min3 = Math.min(i6, i5 - i12);
                    iArr2[length2] = min3;
                    i7 = Math.min(mo298roundToPx0680j_4, (i5 - min3) - i12);
                    i6 = iArr2[length2] + i12 + i7;
                }
            }
            int i13 = i6 - i7;
            p<Integer, LayoutDirection, Integer> pVar = this.alignment;
            if (pVar == null || i13 >= i5) {
                return;
            }
            int intValue = pVar.invoke(Integer.valueOf(i5 - i13), layoutDirection).intValue();
            int length3 = iArr2.length;
            for (int i14 = 0; i14 < length3; i14++) {
                iArr2[i14] = iArr2[i14] + intValue;
            }
        }

        /* renamed from: component1-D9Ej5fM, reason: not valid java name */
        public final float m474component1D9Ej5fM() {
            return this.space;
        }

        public final boolean component2() {
            return this.rtlMirror;
        }

        @m
        public final p<Integer, LayoutDirection, Integer> component3() {
            return this.alignment;
        }

        @l
        /* renamed from: copy-8Feqmps, reason: not valid java name */
        public final SpacedAligned m475copy8Feqmps(float f5, boolean z4, @m p<? super Integer, ? super LayoutDirection, Integer> pVar) {
            return new SpacedAligned(f5, z4, pVar, null);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpacedAligned)) {
                return false;
            }
            SpacedAligned spacedAligned = (SpacedAligned) obj;
            return Dp.m6049equalsimpl0(this.space, spacedAligned.space) && this.rtlMirror == spacedAligned.rtlMirror && l0.g(this.alignment, spacedAligned.alignment);
        }

        @m
        public final p<Integer, LayoutDirection, Integer> getAlignment() {
            return this.alignment;
        }

        public final boolean getRtlMirror() {
            return this.rtlMirror;
        }

        /* renamed from: getSpace-D9Ej5fM, reason: not valid java name */
        public final float m476getSpaceD9Ej5fM() {
            return this.space;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo468getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public int hashCode() {
            int m6050hashCodeimpl = ((Dp.m6050hashCodeimpl(this.space) * 31) + Boolean.hashCode(this.rtlMirror)) * 31;
            p<Integer, LayoutDirection, Integer> pVar = this.alignment;
            return m6050hashCodeimpl + (pVar == null ? 0 : pVar.hashCode());
        }

        @l
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.rtlMirror ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) Dp.m6055toStringimpl(this.space));
            sb.append(", ");
            sb.append(this.alignment);
            sb.append(')');
            return sb.toString();
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@l Density density, int i5, @l int[] iArr, @l int[] iArr2) {
            arrange(density, i5, iArr, LayoutDirection.Ltr, iArr2);
        }
    }
}
