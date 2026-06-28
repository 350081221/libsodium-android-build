package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.LayoutDirection;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.w;
import kotlin.y;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 22\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0002:\u00012B/\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b0\u00101J\u0016\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\u00020\u0004*\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0012\u001a\u00020\u0004*\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0006J=\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\n\u001a\u00020\u00032\u0019\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0014¢\u0006\u0002\b\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocal;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "", "isForward-4vf7U8o", "(I)Z", "isForward", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "currentInterval", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "addNextInterval-FR3nfPY", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "addNextInterval", "hasMoreContent-FR3nfPY", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;I)Z", "hasMoreContent", "isOppositeToOrientation-4vf7U8o", "isOppositeToOrientation", "T", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/u;", "block", "layout-o7g1Pn8", "(ILv3/l;)Ljava/lang/Object;", "layout", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "reverseLayout", "Z", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", DatabaseFileArchive.COLUMN_KEY, "getValue", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", b.f22420d, "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;ZLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/gestures/Orientation;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsModifierLocal implements ModifierLocalProvider<BeyondBoundsLayout>, BeyondBoundsLayout {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1 emptyBeyondBoundsScope = new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1
        private final boolean hasMoreContent;

        @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
        public boolean getHasMoreContent() {
            return this.hasMoreContent;
        }
    };

    @l
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    @l
    private final LayoutDirection layoutDirection;

    @l
    private final Orientation orientation;
    private final boolean reverseLayout;

    @l
    private final LazyLayoutBeyondBoundsState state;

    @i0(d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocal$Companion;", "", "()V", "emptyBeyondBoundsScope", "androidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LazyLayoutBeyondBoundsModifierLocal(@l LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, @l LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z4, @l LayoutDirection layoutDirection, @l Orientation orientation) {
        this.state = lazyLayoutBeyondBoundsState;
        this.beyondBoundsInfo = lazyLayoutBeyondBoundsInfo;
        this.reverseLayout = z4;
        this.layoutDirection = layoutDirection;
        this.orientation = orientation;
    }

    /* renamed from: addNextInterval-FR3nfPY, reason: not valid java name */
    private final LazyLayoutBeyondBoundsInfo.Interval m709addNextIntervalFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i5) {
        int start = interval.getStart();
        int end = interval.getEnd();
        if (m711isForward4vf7U8o(i5)) {
            end++;
        } else {
            start--;
        }
        return this.beyondBoundsInfo.addInterval(start, end);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hasMoreContent-FR3nfPY, reason: not valid java name */
    public final boolean m710hasMoreContentFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i5) {
        if (m712isOppositeToOrientation4vf7U8o(i5)) {
            return false;
        }
        if (m711isForward4vf7U8o(i5)) {
            if (interval.getEnd() >= this.state.getItemCount() - 1) {
                return false;
            }
        } else if (interval.getStart() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: isForward-4vf7U8o, reason: not valid java name */
    private final boolean m711isForward4vf7U8o(int i5) {
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.Companion;
        if (BeyondBoundsLayout.LayoutDirection.m4978equalsimpl0(i5, companion.m4984getBeforehoxUOeE())) {
            return false;
        }
        if (!BeyondBoundsLayout.LayoutDirection.m4978equalsimpl0(i5, companion.m4983getAfterhoxUOeE())) {
            if (BeyondBoundsLayout.LayoutDirection.m4978equalsimpl0(i5, companion.m4982getAbovehoxUOeE())) {
                return this.reverseLayout;
            }
            if (BeyondBoundsLayout.LayoutDirection.m4978equalsimpl0(i5, companion.m4985getBelowhoxUOeE())) {
                if (this.reverseLayout) {
                    return false;
                }
            } else if (BeyondBoundsLayout.LayoutDirection.m4978equalsimpl0(i5, companion.m4986getLefthoxUOeE())) {
                int i6 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
                if (i6 != 1) {
                    if (i6 == 2) {
                        if (this.reverseLayout) {
                            return false;
                        }
                    } else {
                        throw new j0();
                    }
                } else {
                    return this.reverseLayout;
                }
            } else if (BeyondBoundsLayout.LayoutDirection.m4978equalsimpl0(i5, companion.m4987getRighthoxUOeE())) {
                int i7 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
                if (i7 != 1) {
                    if (i7 == 2) {
                        return this.reverseLayout;
                    }
                    throw new j0();
                }
                if (this.reverseLayout) {
                    return false;
                }
            } else {
                LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
                throw new y();
            }
        }
        return true;
    }

    /* renamed from: isOppositeToOrientation-4vf7U8o, reason: not valid java name */
    private final boolean m712isOppositeToOrientation4vf7U8o(int i5) {
        boolean m4978equalsimpl0;
        boolean m4978equalsimpl02;
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.Companion;
        boolean z4 = true;
        if (BeyondBoundsLayout.LayoutDirection.m4978equalsimpl0(i5, companion.m4982getAbovehoxUOeE())) {
            m4978equalsimpl0 = true;
        } else {
            m4978equalsimpl0 = BeyondBoundsLayout.LayoutDirection.m4978equalsimpl0(i5, companion.m4985getBelowhoxUOeE());
        }
        if (m4978equalsimpl0) {
            if (this.orientation == Orientation.Horizontal) {
                return true;
            }
        } else {
            if (BeyondBoundsLayout.LayoutDirection.m4978equalsimpl0(i5, companion.m4986getLefthoxUOeE())) {
                m4978equalsimpl02 = true;
            } else {
                m4978equalsimpl02 = BeyondBoundsLayout.LayoutDirection.m4978equalsimpl0(i5, companion.m4987getRighthoxUOeE());
            }
            if (m4978equalsimpl02) {
                if (this.orientation == Orientation.Vertical) {
                    return true;
                }
            } else {
                if (!BeyondBoundsLayout.LayoutDirection.m4978equalsimpl0(i5, companion.m4984getBeforehoxUOeE())) {
                    z4 = BeyondBoundsLayout.LayoutDirection.m4978equalsimpl0(i5, companion.m4983getAfterhoxUOeE());
                }
                if (!z4) {
                    LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
                    throw new y();
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @l
    public ProvidableModifierLocal<BeyondBoundsLayout> getKey() {
        return BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @l
    public BeyondBoundsLayout getValue() {
        return this;
    }

    @Override // androidx.compose.ui.layout.BeyondBoundsLayout
    @m
    /* renamed from: layout-o7g1Pn8, reason: not valid java name */
    public <T> T mo713layouto7g1Pn8(final int i5, @l v3.l<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> lVar) {
        int firstPlacedIndex;
        if (this.state.getItemCount() > 0 && this.state.getHasVisibleItems()) {
            if (m711isForward4vf7U8o(i5)) {
                firstPlacedIndex = this.state.getLastPlacedIndex();
            } else {
                firstPlacedIndex = this.state.getFirstPlacedIndex();
            }
            final k1.h hVar = new k1.h();
            hVar.element = (T) this.beyondBoundsInfo.addInterval(firstPlacedIndex, firstPlacedIndex);
            T t5 = null;
            while (t5 == null && m710hasMoreContentFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) hVar.element, i5)) {
                T t6 = (T) m709addNextIntervalFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) hVar.element, i5);
                this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) hVar.element);
                hVar.element = t6;
                this.state.remeasure();
                t5 = lVar.invoke(new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$layout$2
                    @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
                    public boolean getHasMoreContent() {
                        boolean m710hasMoreContentFR3nfPY;
                        m710hasMoreContentFR3nfPY = LazyLayoutBeyondBoundsModifierLocal.this.m710hasMoreContentFR3nfPY(hVar.element, i5);
                        return m710hasMoreContentFR3nfPY;
                    }
                });
            }
            this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) hVar.element);
            this.state.remeasure();
            return t5;
        }
        return lVar.invoke(emptyBeyondBoundsScope);
    }
}
