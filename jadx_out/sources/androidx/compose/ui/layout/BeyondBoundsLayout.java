package androidx.compose.ui.layout;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import t0.b;
import u3.f;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0002\f\rJ=\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0019\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0002\b\u0007H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout;", "", "T", "Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/u;", "block", "layout-o7g1Pn8", "(ILv3/l;)Ljava/lang/Object;", "layout", "BeyondBoundsScope", "LayoutDirection", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface BeyondBoundsLayout {

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "", "hasMoreContent", "", "getHasMoreContent", "()Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface BeyondBoundsScope {
        boolean getHasMoreContent();
    }

    @f
    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "", b.f22420d, "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class LayoutDirection {
        private final int value;

        @l
        public static final Companion Companion = new Companion(null);
        private static final int Before = m4976constructorimpl(1);
        private static final int After = m4976constructorimpl(2);
        private static final int Left = m4976constructorimpl(3);
        private static final int Right = m4976constructorimpl(4);
        private static final int Above = m4976constructorimpl(5);
        private static final int Below = m4976constructorimpl(6);

        @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection$Companion;", "", "()V", "Above", "Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "getAbove-hoxUOeE", "()I", "I", "After", "getAfter-hoxUOeE", "Before", "getBefore-hoxUOeE", "Below", "getBelow-hoxUOeE", "Left", "getLeft-hoxUOeE", "Right", "getRight-hoxUOeE", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }

            /* renamed from: getAbove-hoxUOeE, reason: not valid java name */
            public final int m4982getAbovehoxUOeE() {
                return LayoutDirection.Above;
            }

            /* renamed from: getAfter-hoxUOeE, reason: not valid java name */
            public final int m4983getAfterhoxUOeE() {
                return LayoutDirection.After;
            }

            /* renamed from: getBefore-hoxUOeE, reason: not valid java name */
            public final int m4984getBeforehoxUOeE() {
                return LayoutDirection.Before;
            }

            /* renamed from: getBelow-hoxUOeE, reason: not valid java name */
            public final int m4985getBelowhoxUOeE() {
                return LayoutDirection.Below;
            }

            /* renamed from: getLeft-hoxUOeE, reason: not valid java name */
            public final int m4986getLefthoxUOeE() {
                return LayoutDirection.Left;
            }

            /* renamed from: getRight-hoxUOeE, reason: not valid java name */
            public final int m4987getRighthoxUOeE() {
                return LayoutDirection.Right;
            }
        }

        private /* synthetic */ LayoutDirection(int i5) {
            this.value = i5;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ LayoutDirection m4975boximpl(int i5) {
            return new LayoutDirection(i5);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m4976constructorimpl(int i5) {
            return i5;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m4977equalsimpl(int i5, Object obj) {
            return (obj instanceof LayoutDirection) && i5 == ((LayoutDirection) obj).m4981unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4978equalsimpl0(int i5, int i6) {
            return i5 == i6;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m4979hashCodeimpl(int i5) {
            return Integer.hashCode(i5);
        }

        @l
        /* renamed from: toString-impl, reason: not valid java name */
        public static String m4980toStringimpl(int i5) {
            if (m4978equalsimpl0(i5, Before)) {
                return "Before";
            }
            if (m4978equalsimpl0(i5, After)) {
                return "After";
            }
            if (m4978equalsimpl0(i5, Left)) {
                return "Left";
            }
            if (m4978equalsimpl0(i5, Right)) {
                return "Right";
            }
            if (m4978equalsimpl0(i5, Above)) {
                return "Above";
            }
            if (m4978equalsimpl0(i5, Below)) {
                return "Below";
            }
            return "invalid LayoutDirection";
        }

        public boolean equals(Object obj) {
            return m4977equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m4979hashCodeimpl(this.value);
        }

        @l
        public String toString() {
            return m4980toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m4981unboximpl() {
            return this.value;
        }
    }

    @m
    /* renamed from: layout-o7g1Pn8 */
    <T> T mo713layouto7g1Pn8(int i5, @l v3.l<? super BeyondBoundsScope, ? extends T> lVar);
}
