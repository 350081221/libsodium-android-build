package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001d\u0010\u0010\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0013\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/TabPosition;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "Landroidx/compose/ui/unit/Dp;", "left", "F", "getLeft-D9Ej5fM", "()F", "width", "getWidth-D9Ej5fM", "contentWidth", "getContentWidth-D9Ej5fM", "getRight-D9Ej5fM", "right", "<init>", "(FFFLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabPosition\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1223:1\n51#2:1224\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabPosition\n*L\n971#1:1224\n*E\n"})
/* loaded from: classes.dex */
public final class TabPosition {
    public static final int $stable = 0;
    private final float contentWidth;
    private final float left;
    private final float width;

    private TabPosition(float f5, float f6, float f7) {
        this.left = f5;
        this.width = f6;
        this.contentWidth = f7;
    }

    public /* synthetic */ TabPosition(float f5, float f6, float f7, kotlin.jvm.internal.w wVar) {
        this(f5, f6, f7);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) obj;
        if (Dp.m6049equalsimpl0(this.left, tabPosition.left) && Dp.m6049equalsimpl0(this.width, tabPosition.width) && Dp.m6049equalsimpl0(this.contentWidth, tabPosition.contentWidth)) {
            return true;
        }
        return false;
    }

    /* renamed from: getContentWidth-D9Ej5fM, reason: not valid java name */
    public final float m2345getContentWidthD9Ej5fM() {
        return this.contentWidth;
    }

    /* renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m2346getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m2347getRightD9Ej5fM() {
        return Dp.m6044constructorimpl(this.left + this.width);
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m2348getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return (((Dp.m6050hashCodeimpl(this.left) * 31) + Dp.m6050hashCodeimpl(this.width)) * 31) + Dp.m6050hashCodeimpl(this.contentWidth);
    }

    @p4.l
    public String toString() {
        return "TabPosition(left=" + ((Object) Dp.m6055toStringimpl(this.left)) + ", right=" + ((Object) Dp.m6055toStringimpl(m2347getRightD9Ej5fM())) + ", width=" + ((Object) Dp.m6055toStringimpl(this.width)) + ", contentWidth=" + ((Object) Dp.m6055toStringimpl(this.contentWidth)) + ')';
    }
}
