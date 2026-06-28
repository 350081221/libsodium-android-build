package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0015\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\r\u001a\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValues;", "", "calculateBottomPadding", "Landroidx/compose/ui/unit/Dp;", "calculateBottomPadding-D9Ej5fM", "()F", "calculateLeftPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateRightPadding", "calculateRightPadding-u2uoSUM", "calculateTopPadding", "calculateTopPadding-D9Ej5fM", "Absolute", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PaddingValues {
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    float mo503calculateBottomPaddingD9Ej5fM();

    /* renamed from: calculateLeftPadding-u2uoSUM */
    float mo504calculateLeftPaddingu2uoSUM(@l LayoutDirection layoutDirection);

    /* renamed from: calculateRightPadding-u2uoSUM */
    float mo505calculateRightPaddingu2uoSUM(@l LayoutDirection layoutDirection);

    /* renamed from: calculateTopPadding-D9Ej5fM */
    float mo506calculateTopPaddingD9Ej5fM();

    @i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u0006J\u0015\u0010\u000e\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\tJ\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016R \u0010\u0017\u001a\u00020\u00048\u0002X\u0083\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u00020\u00048\u0002X\u0083\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u0012\u0004\b\u001c\u0010\u001aR \u0010\u001d\u001a\u00020\u00048\u0002X\u0083\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u0012\u0004\b\u001e\u0010\u001aR \u0010\u001f\u001a\u00020\u00048\u0002X\u0083\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u0012\u0004\b \u0010\u001a\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValues$Absolute;", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Dp;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateLeftPadding", "calculateTopPadding-D9Ej5fM", "()F", "calculateTopPadding", "calculateRightPadding-u2uoSUM", "calculateRightPadding", "calculateBottomPadding-D9Ej5fM", "calculateBottomPadding", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "left", "F", "getLeft-D9Ej5fM$annotations", "()V", "top", "getTop-D9Ej5fM$annotations", "right", "getRight-D9Ej5fM$annotations", "bottom", "getBottom-D9Ej5fM$annotations", "<init>", "(FFFFLkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    @Immutable
    @r1({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValues$Absolute\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,467:1\n154#2:468\n154#2:469\n154#2:470\n154#2:471\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValues$Absolute\n*L\n207#1:468\n209#1:469\n211#1:470\n213#1:471\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Absolute implements PaddingValues {
        public static final int $stable = 0;
        private final float bottom;
        private final float left;
        private final float right;
        private final float top;

        private Absolute(float f5, float f6, float f7, float f8) {
            this.left = f5;
            this.top = f6;
            this.right = f7;
            this.bottom = f8;
        }

        public /* synthetic */ Absolute(float f5, float f6, float f7, float f8, w wVar) {
            this(f5, f6, f7, f8);
        }

        @Stable
        /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m566getBottomD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m567getLeftD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m568getRightD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m569getTopD9Ej5fM$annotations() {
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateBottomPadding-D9Ej5fM */
        public float mo503calculateBottomPaddingD9Ej5fM() {
            return this.bottom;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateLeftPadding-u2uoSUM */
        public float mo504calculateLeftPaddingu2uoSUM(@l LayoutDirection layoutDirection) {
            return this.left;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateRightPadding-u2uoSUM */
        public float mo505calculateRightPaddingu2uoSUM(@l LayoutDirection layoutDirection) {
            return this.right;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateTopPadding-D9Ej5fM */
        public float mo506calculateTopPaddingD9Ej5fM() {
            return this.top;
        }

        public boolean equals(@m Object obj) {
            if (!(obj instanceof Absolute)) {
                return false;
            }
            Absolute absolute = (Absolute) obj;
            if (!Dp.m6049equalsimpl0(this.left, absolute.left) || !Dp.m6049equalsimpl0(this.top, absolute.top) || !Dp.m6049equalsimpl0(this.right, absolute.right) || !Dp.m6049equalsimpl0(this.bottom, absolute.bottom)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((((Dp.m6050hashCodeimpl(this.left) * 31) + Dp.m6050hashCodeimpl(this.top)) * 31) + Dp.m6050hashCodeimpl(this.right)) * 31) + Dp.m6050hashCodeimpl(this.bottom);
        }

        @l
        public String toString() {
            return "PaddingValues.Absolute(left=" + ((Object) Dp.m6055toStringimpl(this.left)) + ", top=" + ((Object) Dp.m6055toStringimpl(this.top)) + ", right=" + ((Object) Dp.m6055toStringimpl(this.right)) + ", bottom=" + ((Object) Dp.m6055toStringimpl(this.bottom)) + ')';
        }

        public /* synthetic */ Absolute(float f5, float f6, float f7, float f8, int i5, w wVar) {
            this((i5 & 1) != 0 ? Dp.m6044constructorimpl(0) : f5, (i5 & 2) != 0 ? Dp.m6044constructorimpl(0) : f6, (i5 & 4) != 0 ? Dp.m6044constructorimpl(0) : f7, (i5 & 8) != 0 ? Dp.m6044constructorimpl(0) : f8, null);
        }
    }
}
