package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JX\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H&J\b\u0010\u000b\u001a\u00020\u0005H&R\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/TextToolbar;", "", "Landroidx/compose/ui/geometry/Rect;", "rect", "Lkotlin/Function0;", "Lkotlin/r2;", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "showMenu", "hide", "Landroidx/compose/ui/platform/TextToolbarStatus;", "getStatus", "()Landroidx/compose/ui/platform/TextToolbarStatus;", "status", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface TextToolbar {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ void showMenu$default(TextToolbar textToolbar, Rect rect, v3.a aVar, v3.a aVar2, v3.a aVar3, v3.a aVar4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
        }
        textToolbar.showMenu(rect, (i5 & 2) != 0 ? null : aVar, (i5 & 4) != 0 ? null : aVar2, (i5 & 8) != 0 ? null : aVar3, (i5 & 16) != 0 ? null : aVar4);
    }

    @p4.l
    TextToolbarStatus getStatus();

    void hide();

    void showMenu(@p4.l Rect rect, @p4.m v3.a<r2> aVar, @p4.m v3.a<r2> aVar2, @p4.m v3.a<r2> aVar3, @p4.m v3.a<r2> aVar4);
}
