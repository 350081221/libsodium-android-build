package androidx.compose.material3.carousel;

import androidx.collection.FloatList;
import androidx.collection.FloatListKt;
import androidx.collection.MutableFloatList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.math.d;
import kotlin.ranges.u;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014BK\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ'\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/carousel/Strategy;", "", "defaultKeylines", "Landroidx/compose/material3/carousel/KeylineList;", "startKeylineSteps", "", "endKeylineSteps", "startShiftDistance", "", "endShiftDistance", "startShiftPoints", "Landroidx/collection/FloatList;", "endShiftPoints", "(Landroidx/compose/material3/carousel/KeylineList;Ljava/util/List;Ljava/util/List;FFLandroidx/collection/FloatList;Landroidx/collection/FloatList;)V", "getKeylineListForScrollOffset", "scrollOffset", "maxScrollOffset", "roundToNearestStep", "", "getKeylineListForScrollOffset$material3_release", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Strategy {

    @l
    private final KeylineList defaultKeylines;

    @l
    private final List<KeylineList> endKeylineSteps;
    private final float endShiftDistance;

    @l
    private final FloatList endShiftPoints;

    @l
    private final List<KeylineList> startKeylineSteps;
    private final float startShiftDistance;

    @l
    private final FloatList startShiftPoints;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001!B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J&\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J(\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0010H\u0002¨\u0006\""}, d2 = {"Landroidx/compose/material3/carousel/Strategy$Companion;", "", "()V", "create", "Landroidx/compose/material3/carousel/Strategy;", "carouselMainAxisSize", "", "keylineList", "Landroidx/compose/material3/carousel/KeylineList;", "create$material3_release", "getEndKeylineSteps", "", "defaultKeylines", "getShiftPointRange", "Landroidx/compose/material3/carousel/Strategy$Companion$ShiftPointRange;", "stepsCount", "", "shiftPoint", "Landroidx/collection/FloatList;", "interpolation", "getStartKeylineSteps", "getStepInterpolationPoints", "totalShiftDistance", "steps", "isShiftingLeft", "", "moveKeylineAndCreateShiftedKeylineList", TypedValues.TransitionType.S_FROM, "srcIndex", "dstIndex", "move", "", "Landroidx/compose/material3/carousel/Keyline;", "ShiftPointRange", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strategy.kt\nandroidx/compose/material3/carousel/Strategy$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,509:1\n1549#2:510\n1620#2,3:511\n1855#2,2:514\n*S KotlinDebug\n*F\n+ 1 Strategy.kt\nandroidx/compose/material3/carousel/Strategy$Companion\n*L\n405#1:510\n405#1:511,3\n432#1:514,2\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Companion {

        /* JADX INFO: Access modifiers changed from: private */
        @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/carousel/Strategy$Companion$ShiftPointRange;", "", "fromStepIndex", "", "toStepIndex", "steppedInterpolation", "", "(IIF)V", "getFromStepIndex", "()I", "getSteppedInterpolation", "()F", "getToStepIndex", "component1", "component2", "component3", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class ShiftPointRange {
            private final int fromStepIndex;
            private final float steppedInterpolation;
            private final int toStepIndex;

            public ShiftPointRange(int i5, int i6, float f5) {
                this.fromStepIndex = i5;
                this.toStepIndex = i6;
                this.steppedInterpolation = f5;
            }

            public static /* synthetic */ ShiftPointRange copy$default(ShiftPointRange shiftPointRange, int i5, int i6, float f5, int i7, Object obj) {
                if ((i7 & 1) != 0) {
                    i5 = shiftPointRange.fromStepIndex;
                }
                if ((i7 & 2) != 0) {
                    i6 = shiftPointRange.toStepIndex;
                }
                if ((i7 & 4) != 0) {
                    f5 = shiftPointRange.steppedInterpolation;
                }
                return shiftPointRange.copy(i5, i6, f5);
            }

            public final int component1() {
                return this.fromStepIndex;
            }

            public final int component2() {
                return this.toStepIndex;
            }

            public final float component3() {
                return this.steppedInterpolation;
            }

            @l
            public final ShiftPointRange copy(int i5, int i6, float f5) {
                return new ShiftPointRange(i5, i6, f5);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShiftPointRange)) {
                    return false;
                }
                ShiftPointRange shiftPointRange = (ShiftPointRange) obj;
                return this.fromStepIndex == shiftPointRange.fromStepIndex && this.toStepIndex == shiftPointRange.toStepIndex && Float.compare(this.steppedInterpolation, shiftPointRange.steppedInterpolation) == 0;
            }

            public final int getFromStepIndex() {
                return this.fromStepIndex;
            }

            public final float getSteppedInterpolation() {
                return this.steppedInterpolation;
            }

            public final int getToStepIndex() {
                return this.toStepIndex;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.fromStepIndex) * 31) + Integer.hashCode(this.toStepIndex)) * 31) + Float.hashCode(this.steppedInterpolation);
            }

            @l
            public String toString() {
                return "ShiftPointRange(fromStepIndex=" + this.fromStepIndex + ", toStepIndex=" + this.toStepIndex + ", steppedInterpolation=" + this.steppedInterpolation + ')';
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        private final List<KeylineList> getEndKeylineSteps(KeylineList keylineList, float f5) {
            Object m32;
            int G;
            int i5;
            ArrayList arrayList = new ArrayList();
            arrayList.add(keylineList);
            if (keylineList.isLastFocalItemAtEndOfContainer(f5)) {
                return arrayList;
            }
            int lastFocalIndex = keylineList.getLastFocalIndex();
            int lastNonAnchorIndex = keylineList.getLastNonAnchorIndex();
            int i6 = lastNonAnchorIndex - lastFocalIndex;
            if (i6 <= 0 && keylineList.getLastFocal().getCutoff() > 0.0f) {
                arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList, 0, 0, f5));
                return arrayList;
            }
            for (int i7 = 0; i7 < i6; i7++) {
                m32 = e0.m3(arrayList);
                KeylineList keylineList2 = (KeylineList) m32;
                int i8 = lastNonAnchorIndex - i7;
                G = kotlin.collections.w.G(keylineList);
                if (i8 < G) {
                    i5 = keylineList2.lastIndexBeforeFocalRangeWithSize(keylineList.get(i8 + 1).getSize()) + 1;
                } else {
                    i5 = 0;
                }
                arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList2, keylineList.getLastNonAnchorIndex(), i5, f5));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ShiftPointRange getShiftPointRange(int i5, FloatList floatList, float f5) {
            kotlin.ranges.l W1;
            float lerp;
            float f6 = floatList.get(0);
            W1 = u.W1(1, i5);
            Iterator<Integer> it = W1.iterator();
            while (it.hasNext()) {
                int nextInt = ((s0) it).nextInt();
                float f7 = floatList.get(nextInt);
                if (f5 <= f7) {
                    lerp = StrategyKt.lerp(0.0f, 1.0f, f6, f7, f5);
                    return new ShiftPointRange(nextInt - 1, nextInt, lerp);
                }
                f6 = f7;
            }
            return new ShiftPointRange(0, 0, 0.0f);
        }

        private final List<KeylineList> getStartKeylineSteps(KeylineList keylineList, float f5) {
            Object m32;
            int G;
            ArrayList arrayList = new ArrayList();
            arrayList.add(keylineList);
            if (keylineList.isFirstFocalItemAtStartOfContainer()) {
                return arrayList;
            }
            int firstNonAnchorIndex = keylineList.getFirstNonAnchorIndex();
            int firstFocalIndex = keylineList.getFirstFocalIndex() - firstNonAnchorIndex;
            if (firstFocalIndex <= 0 && keylineList.getFirstFocal().getCutoff() > 0.0f) {
                arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList, 0, 0, f5));
                return arrayList;
            }
            for (int i5 = 0; i5 < firstFocalIndex; i5++) {
                m32 = e0.m3(arrayList);
                KeylineList keylineList2 = (KeylineList) m32;
                int i6 = firstNonAnchorIndex + i5;
                G = kotlin.collections.w.G(keylineList);
                if (i6 > 0) {
                    G = keylineList2.firstIndexAfterFocalRangeWithSize(keylineList.get(i6 - 1).getSize()) - 1;
                }
                arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList2, keylineList.getFirstNonAnchorIndex(), G, f5));
            }
            return arrayList;
        }

        private final FloatList getStepInterpolationPoints(float f5, List<KeylineList> list, boolean z4) {
            boolean z5;
            kotlin.ranges.l W1;
            int Y;
            Object m32;
            Object m33;
            float unadjustedOffset;
            int G;
            float f6;
            Object y22;
            Object y23;
            MutableFloatList mutableFloatListOf = FloatListKt.mutableFloatListOf(0.0f);
            if (f5 == 0.0f) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                return mutableFloatListOf;
            }
            W1 = u.W1(1, list.size());
            Y = x.Y(W1, 10);
            ArrayList arrayList = new ArrayList(Y);
            Iterator<Integer> it = W1.iterator();
            while (it.hasNext()) {
                int nextInt = ((s0) it).nextInt();
                int i5 = nextInt - 1;
                KeylineList keylineList = list.get(i5);
                KeylineList keylineList2 = list.get(nextInt);
                if (z4) {
                    y22 = e0.y2(keylineList2);
                    float unadjustedOffset2 = ((Keyline) y22).getUnadjustedOffset();
                    y23 = e0.y2(keylineList);
                    unadjustedOffset = unadjustedOffset2 - ((Keyline) y23).getUnadjustedOffset();
                } else {
                    m32 = e0.m3(keylineList);
                    float unadjustedOffset3 = ((Keyline) m32).getUnadjustedOffset();
                    m33 = e0.m3(keylineList2);
                    unadjustedOffset = unadjustedOffset3 - ((Keyline) m33).getUnadjustedOffset();
                }
                float f7 = unadjustedOffset / f5;
                G = kotlin.collections.w.G(list);
                if (nextInt == G) {
                    f6 = 1.0f;
                } else {
                    f6 = mutableFloatListOf.get(i5) + f7;
                }
                arrayList.add(Boolean.valueOf(mutableFloatListOf.add(f6)));
            }
            return mutableFloatListOf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Keyline> move(List<Keyline> list, int i5, int i6) {
            Keyline keyline = list.get(i5);
            list.remove(i5);
            list.add(i6, keyline);
            return list;
        }

        private final KeylineList moveKeylineAndCreateShiftedKeylineList(KeylineList keylineList, int i5, int i6, float f5) {
            int i7;
            if (i5 > i6) {
                i7 = 1;
            } else {
                i7 = -1;
            }
            return KeylineKt.keylineListOf(f5, keylineList.getPivotIndex() + i7, keylineList.getPivot().getOffset() + (keylineList.get(i5).getSize() * i7), new Strategy$Companion$moveKeylineAndCreateShiftedKeylineList$1(keylineList, i5, i6));
        }

        @l
        public final Strategy create$material3_release(float f5, @l KeylineList keylineList) {
            Object m32;
            Object y22;
            Object y23;
            Object m33;
            Object m34;
            Object m35;
            List<KeylineList> startKeylineSteps = getStartKeylineSteps(keylineList, f5);
            List<KeylineList> endKeylineSteps = getEndKeylineSteps(keylineList, f5);
            m32 = e0.m3(startKeylineSteps);
            y22 = e0.y2((List) m32);
            float unadjustedOffset = ((Keyline) y22).getUnadjustedOffset();
            y23 = e0.y2(keylineList);
            float unadjustedOffset2 = unadjustedOffset - ((Keyline) y23).getUnadjustedOffset();
            m33 = e0.m3(keylineList);
            float unadjustedOffset3 = ((Keyline) m33).getUnadjustedOffset();
            m34 = e0.m3(endKeylineSteps);
            m35 = e0.m3((List) m34);
            float unadjustedOffset4 = unadjustedOffset3 - ((Keyline) m35).getUnadjustedOffset();
            return new Strategy(keylineList, startKeylineSteps, endKeylineSteps, unadjustedOffset2, unadjustedOffset4, getStepInterpolationPoints(unadjustedOffset2, startKeylineSteps, true), getStepInterpolationPoints(unadjustedOffset4, endKeylineSteps, false), null);
        }
    }

    private Strategy(KeylineList keylineList, List<KeylineList> list, List<KeylineList> list2, float f5, float f6, FloatList floatList, FloatList floatList2) {
        this.defaultKeylines = keylineList;
        this.startKeylineSteps = list;
        this.endKeylineSteps = list2;
        this.startShiftDistance = f5;
        this.endShiftDistance = f6;
        this.startShiftPoints = floatList;
        this.endShiftPoints = floatList2;
    }

    public /* synthetic */ Strategy(KeylineList keylineList, List list, List list2, float f5, float f6, FloatList floatList, FloatList floatList2, w wVar) {
        this(keylineList, list, list2, f5, f6, floatList, floatList2);
    }

    public static /* synthetic */ KeylineList getKeylineListForScrollOffset$material3_release$default(Strategy strategy, float f5, float f6, boolean z4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return strategy.getKeylineListForScrollOffset$material3_release(f5, f6, z4);
    }

    @l
    public final KeylineList getKeylineListForScrollOffset$material3_release(float f5, float f6, boolean z4) {
        float lerp;
        int L0;
        int toStepIndex;
        float f7 = this.startShiftDistance;
        float f8 = f6 - this.endShiftDistance;
        boolean z5 = false;
        if (f7 <= f5 && f5 <= f8) {
            z5 = true;
        }
        if (z5) {
            return this.defaultKeylines;
        }
        lerp = StrategyKt.lerp(1.0f, 0.0f, 0.0f, f7, f5);
        FloatList floatList = this.startShiftPoints;
        List<KeylineList> list = this.startKeylineSteps;
        if (f5 > f8) {
            lerp = StrategyKt.lerp(0.0f, 1.0f, f8, f6, f5);
            floatList = this.endShiftPoints;
            list = this.endKeylineSteps;
        }
        Companion.ShiftPointRange shiftPointRange = Companion.getShiftPointRange(list.size(), floatList, lerp);
        if (z4) {
            L0 = d.L0(shiftPointRange.getSteppedInterpolation());
            if (L0 == 0) {
                toStepIndex = shiftPointRange.getFromStepIndex();
            } else {
                toStepIndex = shiftPointRange.getToStepIndex();
            }
            return list.get(toStepIndex);
        }
        return StrategyKt.lerp(list.get(shiftPointRange.getFromStepIndex()), list.get(shiftPointRange.getToStepIndex()), shiftPointRange.getSteppedInterpolation());
    }
}
