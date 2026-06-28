package androidx.compose.animation;

import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import t0.b;
import u3.f;

@i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001#J\u0017\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦\u0004JO\u0010\u0015\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2#\b\u0002\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\r0\fH&ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014JO\u0010\u001a\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2#\b\u0002\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\r0\fH&ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u00020\u0017*\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0001\u0001$ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope;", "S", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "using", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "towards", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "animationSpec", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "offsetForFullSlide", "initialOffset", "Landroidx/compose/animation/EnterTransition;", "slideIntoContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lv3/l;)Landroidx/compose/animation/EnterTransition;", "slideIntoContainer", "targetOffset", "Landroidx/compose/animation/ExitTransition;", "slideOutOfContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lv3/l;)Landroidx/compose/animation/ExitTransition;", "slideOutOfContainer", "Landroidx/compose/animation/ExitTransition$Companion;", "getKeepUntilTransitionsFinished", "(Landroidx/compose/animation/ExitTransition$Companion;)Landroidx/compose/animation/ExitTransition;", "KeepUntilTransitionsFinished", "Landroidx/compose/ui/Alignment;", "getContentAlignment", "()Landroidx/compose/ui/Alignment;", "contentAlignment", "SlideDirection", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "animation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface AnimatedContentTransitionScope<S> extends Transition.Segment<S> {

    @f
    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "", b.f22420d, "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class SlideDirection {
        private final int value;

        @l
        public static final Companion Companion = new Companion(null);
        private static final int Left = m36constructorimpl(0);
        private static final int Right = m36constructorimpl(1);
        private static final int Up = m36constructorimpl(2);
        private static final int Down = m36constructorimpl(3);
        private static final int Start = m36constructorimpl(4);
        private static final int End = m36constructorimpl(5);

        @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection$Companion;", "", "()V", "Down", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "getDown-DKzdypw", "()I", "I", "End", "getEnd-DKzdypw", "Left", "getLeft-DKzdypw", "Right", "getRight-DKzdypw", "Start", "getStart-DKzdypw", "Up", "getUp-DKzdypw", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }

            /* renamed from: getDown-DKzdypw, reason: not valid java name */
            public final int m42getDownDKzdypw() {
                return SlideDirection.Down;
            }

            /* renamed from: getEnd-DKzdypw, reason: not valid java name */
            public final int m43getEndDKzdypw() {
                return SlideDirection.End;
            }

            /* renamed from: getLeft-DKzdypw, reason: not valid java name */
            public final int m44getLeftDKzdypw() {
                return SlideDirection.Left;
            }

            /* renamed from: getRight-DKzdypw, reason: not valid java name */
            public final int m45getRightDKzdypw() {
                return SlideDirection.Right;
            }

            /* renamed from: getStart-DKzdypw, reason: not valid java name */
            public final int m46getStartDKzdypw() {
                return SlideDirection.Start;
            }

            /* renamed from: getUp-DKzdypw, reason: not valid java name */
            public final int m47getUpDKzdypw() {
                return SlideDirection.Up;
            }
        }

        private /* synthetic */ SlideDirection(int i5) {
            this.value = i5;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ SlideDirection m35boximpl(int i5) {
            return new SlideDirection(i5);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m36constructorimpl(int i5) {
            return i5;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m37equalsimpl(int i5, Object obj) {
            return (obj instanceof SlideDirection) && i5 == ((SlideDirection) obj).m41unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m38equalsimpl0(int i5, int i6) {
            return i5 == i6;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m39hashCodeimpl(int i5) {
            return Integer.hashCode(i5);
        }

        @l
        /* renamed from: toString-impl, reason: not valid java name */
        public static String m40toStringimpl(int i5) {
            if (m38equalsimpl0(i5, Left)) {
                return "Left";
            }
            if (m38equalsimpl0(i5, Right)) {
                return "Right";
            }
            if (m38equalsimpl0(i5, Up)) {
                return "Up";
            }
            if (m38equalsimpl0(i5, Down)) {
                return "Down";
            }
            if (m38equalsimpl0(i5, Start)) {
                return "Start";
            }
            if (m38equalsimpl0(i5, End)) {
                return "End";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m37equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m39hashCodeimpl(this.value);
        }

        @l
        public String toString() {
            return m40toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m41unboximpl() {
            return this.value;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: slideIntoContainer-mOhB8PU$default, reason: not valid java name */
    static /* synthetic */ EnterTransition m31slideIntoContainermOhB8PU$default(AnimatedContentTransitionScope animatedContentTransitionScope, int i5, FiniteAnimationSpec finiteAnimationSpec, v3.l lVar, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 2) != 0) {
                finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m6163boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
            }
            if ((i6 & 4) != 0) {
                lVar = AnimatedContentTransitionScope$slideIntoContainer$1.INSTANCE;
            }
            return animatedContentTransitionScope.mo33slideIntoContainermOhB8PU(i5, finiteAnimationSpec, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideIntoContainer-mOhB8PU");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: slideOutOfContainer-mOhB8PU$default, reason: not valid java name */
    static /* synthetic */ ExitTransition m32slideOutOfContainermOhB8PU$default(AnimatedContentTransitionScope animatedContentTransitionScope, int i5, FiniteAnimationSpec finiteAnimationSpec, v3.l lVar, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 2) != 0) {
                finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m6163boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
            }
            if ((i6 & 4) != 0) {
                lVar = AnimatedContentTransitionScope$slideOutOfContainer$1.INSTANCE;
            }
            return animatedContentTransitionScope.mo34slideOutOfContainermOhB8PU(i5, finiteAnimationSpec, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideOutOfContainer-mOhB8PU");
    }

    @l
    Alignment getContentAlignment();

    @l
    default ExitTransition getKeepUntilTransitionsFinished(@l ExitTransition.Companion companion) {
        return companion.getKeepUntilTransitionsFinished$animation_release();
    }

    @l
    /* renamed from: slideIntoContainer-mOhB8PU, reason: not valid java name */
    EnterTransition mo33slideIntoContainermOhB8PU(int i5, @l FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @l v3.l<? super Integer, Integer> lVar);

    @l
    /* renamed from: slideOutOfContainer-mOhB8PU, reason: not valid java name */
    ExitTransition mo34slideOutOfContainermOhB8PU(int i5, @l FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @l v3.l<? super Integer, Integer> lVar);

    @l
    ContentTransform using(@l ContentTransform contentTransform, @m SizeTransform sizeTransform);
}
