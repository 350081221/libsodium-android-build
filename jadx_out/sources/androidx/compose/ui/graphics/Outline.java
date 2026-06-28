package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import org.apache.http.cookie.ClientCookie;

@kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/Outline;", "", "()V", "bounds", "Landroidx/compose/ui/geometry/Rect;", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "Generic", "Rectangle", "Rounded", "Landroidx/compose/ui/graphics/Outline$Generic;", "Landroidx/compose/ui/graphics/Outline$Rectangle;", "Landroidx/compose/ui/graphics/Outline$Rounded;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Outline {

    @kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/Outline$Generic;", "Landroidx/compose/ui/graphics/Outline;", ClientCookie.PATH_ATTR, "Landroidx/compose/ui/graphics/Path;", "(Landroidx/compose/ui/graphics/Path;)V", "bounds", "Landroidx/compose/ui/geometry/Rect;", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "getPath", "()Landroidx/compose/ui/graphics/Path;", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Generic extends Outline {

        @p4.l
        private final Path path;

        public Generic(@p4.l Path path) {
            super(null);
            this.path = path;
        }

        public boolean equals(@p4.m Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Generic) && kotlin.jvm.internal.l0.g(this.path, ((Generic) obj).path)) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.ui.graphics.Outline
        @p4.l
        public Rect getBounds() {
            return this.path.getBounds();
        }

        @p4.l
        public final Path getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.path.hashCode();
        }
    }

    @kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/Outline$Rectangle;", "Landroidx/compose/ui/graphics/Outline;", "rect", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/geometry/Rect;)V", "bounds", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "getRect", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class Rectangle extends Outline {

        @p4.l
        private final Rect rect;

        public Rectangle(@p4.l Rect rect) {
            super(null);
            this.rect = rect;
        }

        public boolean equals(@p4.m Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Rectangle) && kotlin.jvm.internal.l0.g(this.rect, ((Rectangle) obj).rect)) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.ui.graphics.Outline
        @p4.l
        public Rect getBounds() {
            return this.rect;
        }

        @p4.l
        public final Rect getRect() {
            return this.rect;
        }

        public int hashCode() {
            return this.rect.hashCode();
        }
    }

    @kotlin.i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/Outline$Rounded;", "Landroidx/compose/ui/graphics/Outline;", "roundRect", "Landroidx/compose/ui/geometry/RoundRect;", "(Landroidx/compose/ui/geometry/RoundRect;)V", "bounds", "Landroidx/compose/ui/geometry/Rect;", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "getRoundRect", "()Landroidx/compose/ui/geometry/RoundRect;", "roundRectPath", "Landroidx/compose/ui/graphics/Path;", "getRoundRectPath$ui_graphics_release", "()Landroidx/compose/ui/graphics/Path;", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    @kotlin.jvm.internal.r1({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/Outline$Rounded\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1#2:307\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Rounded extends Outline {

        @p4.l
        private final RoundRect roundRect;

        @p4.m
        private final Path roundRectPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Rounded(@p4.l RoundRect roundRect) {
            super(0 == true ? 1 : 0);
            Path path = null;
            this.roundRect = roundRect;
            if (!OutlineKt.access$hasSameCornerRadius(roundRect)) {
                path = AndroidPath_androidKt.Path();
                path.addRoundRect(roundRect);
            }
            this.roundRectPath = path;
        }

        public boolean equals(@p4.m Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Rounded) && kotlin.jvm.internal.l0.g(this.roundRect, ((Rounded) obj).roundRect)) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.ui.graphics.Outline
        @p4.l
        public Rect getBounds() {
            return RoundRectKt.getBoundingRect(this.roundRect);
        }

        @p4.l
        public final RoundRect getRoundRect() {
            return this.roundRect;
        }

        @p4.m
        public final Path getRoundRectPath$ui_graphics_release() {
            return this.roundRectPath;
        }

        public int hashCode() {
            return this.roundRect.hashCode();
        }
    }

    private Outline() {
    }

    public /* synthetic */ Outline(kotlin.jvm.internal.w wVar) {
        this();
    }

    @p4.l
    public abstract Rect getBounds();
}
