package androidx.compose.material3.carousel;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002JL\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J \u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\u001c\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aR\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!¨\u0006%"}, d2 = {"Landroidx/compose/material3/carousel/KeylineListScopeImpl;", "Landroidx/compose/material3/carousel/KeylineListScope;", "", "findLastFocalIndex", "pivotIndex", "", "pivotOffset", "firstFocalIndex", "lastFocalIndex", "itemMainAxisSize", "carouselMainAxisSize", "", "Landroidx/compose/material3/carousel/KeylineListScopeImpl$TmpKeyline;", "tmpKeylines", "Landroidx/compose/material3/carousel/Keyline;", "createKeylinesWithPivot", "size", TypedValues.CycleType.S_WAVE_OFFSET, "", "isCutoffLeft", "isCutoffRight", "isAnchor", "Lkotlin/r2;", "add", "Landroidx/compose/material3/carousel/KeylineList;", "createWithPivot", "Landroidx/compose/material3/carousel/CarouselAlignment;", "carouselAlignment", "createWithAlignment", "I", "focalItemSize", "F", "", "Ljava/util/List;", "<init>", "()V", "TmpKeyline", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nKeyline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Keyline.kt\nandroidx/compose/material3/carousel/KeylineListScopeImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,471:1\n1855#2,2:472\n1855#2,2:474\n*S KotlinDebug\n*F\n+ 1 Keyline.kt\nandroidx/compose/material3/carousel/KeylineListScopeImpl\n*L\n392#1:472,2\n418#1:474,2\n*E\n"})
/* loaded from: classes.dex */
final class KeylineListScopeImpl implements KeylineListScope {
    private float focalItemSize;
    private float pivotOffset;
    private int firstFocalIndex = -1;
    private int pivotIndex = -1;

    @l
    private final List<TmpKeyline> tmpKeylines = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/carousel/KeylineListScopeImpl$TmpKeyline;", "", "size", "", "isAnchor", "", "(FZ)V", "()Z", "getSize", "()F", "component1", "component2", "copy", "equals", "other", TTDownloadField.TT_HASHCODE, "", "toString", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class TmpKeyline {
        private final boolean isAnchor;
        private final float size;

        public TmpKeyline(float f5, boolean z4) {
            this.size = f5;
            this.isAnchor = z4;
        }

        public static /* synthetic */ TmpKeyline copy$default(TmpKeyline tmpKeyline, float f5, boolean z4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = tmpKeyline.size;
            }
            if ((i5 & 2) != 0) {
                z4 = tmpKeyline.isAnchor;
            }
            return tmpKeyline.copy(f5, z4);
        }

        public final float component1() {
            return this.size;
        }

        public final boolean component2() {
            return this.isAnchor;
        }

        @l
        public final TmpKeyline copy(float f5, boolean z4) {
            return new TmpKeyline(f5, z4);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TmpKeyline)) {
                return false;
            }
            TmpKeyline tmpKeyline = (TmpKeyline) obj;
            return Float.compare(this.size, tmpKeyline.size) == 0 && this.isAnchor == tmpKeyline.isAnchor;
        }

        public final float getSize() {
            return this.size;
        }

        public int hashCode() {
            return (Float.hashCode(this.size) * 31) + Boolean.hashCode(this.isAnchor);
        }

        public final boolean isAnchor() {
            return this.isAnchor;
        }

        @l
        public String toString() {
            return "TmpKeyline(size=" + this.size + ", isAnchor=" + this.isAnchor + ')';
        }
    }

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CarouselAlignment.values().length];
            try {
                iArr[CarouselAlignment.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CarouselAlignment.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CarouselAlignment.End.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<androidx.compose.material3.carousel.Keyline> createKeylinesWithPivot(int r29, float r30, int r31, int r32, float r33, float r34, java.util.List<androidx.compose.material3.carousel.KeylineListScopeImpl.TmpKeyline> r35) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.KeylineListScopeImpl.createKeylinesWithPivot(int, float, int, int, float, float, java.util.List):java.util.List");
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int findLastFocalIndex() {
        /*
            r4 = this;
            int r0 = r4.firstFocalIndex
        L2:
            java.util.List<androidx.compose.material3.carousel.KeylineListScopeImpl$TmpKeyline> r1 = r4.tmpKeylines
            int r1 = kotlin.collections.u.G(r1)
            if (r0 >= r1) goto L25
            java.util.List<androidx.compose.material3.carousel.KeylineListScopeImpl$TmpKeyline> r1 = r4.tmpKeylines
            int r2 = r0 + 1
            java.lang.Object r1 = r1.get(r2)
            androidx.compose.material3.carousel.KeylineListScopeImpl$TmpKeyline r1 = (androidx.compose.material3.carousel.KeylineListScopeImpl.TmpKeyline) r1
            float r1 = r1.getSize()
            float r3 = r4.focalItemSize
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            r1 = 1
            goto L21
        L20:
            r1 = 0
        L21:
            if (r1 == 0) goto L25
            r0 = r2
            goto L2
        L25:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.KeylineListScopeImpl.findLastFocalIndex():int");
    }

    private final boolean isCutoffLeft(float f5, float f6) {
        float f7 = f5 / 2;
        return f6 - f7 < 0.0f && f6 + f7 > 0.0f;
    }

    private final boolean isCutoffRight(float f5, float f6, float f7) {
        float f8 = f5 / 2;
        return f6 - f8 < f7 && f6 + f8 > f7;
    }

    @Override // androidx.compose.material3.carousel.KeylineListScope
    public void add(float f5, boolean z4) {
        int G;
        this.tmpKeylines.add(new TmpKeyline(f5, z4));
        if (f5 > this.focalItemSize) {
            G = w.G(this.tmpKeylines);
            this.firstFocalIndex = G;
            this.focalItemSize = f5;
        }
    }

    @l
    public final KeylineList createWithAlignment(float f5, @l CarouselAlignment carouselAlignment) {
        float f6;
        float f7;
        int findLastFocalIndex = findLastFocalIndex();
        int i5 = this.firstFocalIndex;
        int i6 = findLastFocalIndex - i5;
        this.pivotIndex = i5;
        int i7 = WhenMappings.$EnumSwitchMapping$0[carouselAlignment.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    f6 = f5 - (this.focalItemSize / 2);
                } else {
                    throw new j0();
                }
            } else {
                float f8 = 2;
                f7 = (f5 / f8) - ((this.focalItemSize / f8) * i6);
                this.pivotOffset = f7;
                return new KeylineList(createKeylinesWithPivot(this.pivotIndex, f7, this.firstFocalIndex, findLastFocalIndex, this.focalItemSize, f5, this.tmpKeylines));
            }
        } else {
            f6 = this.focalItemSize / 2;
        }
        f7 = f6;
        this.pivotOffset = f7;
        return new KeylineList(createKeylinesWithPivot(this.pivotIndex, f7, this.firstFocalIndex, findLastFocalIndex, this.focalItemSize, f5, this.tmpKeylines));
    }

    @l
    public final KeylineList createWithPivot(float f5, int i5, float f6) {
        return new KeylineList(createKeylinesWithPivot(i5, f6, this.firstFocalIndex, findLastFocalIndex(), this.focalItemSize, f5, this.tmpKeylines));
    }
}
