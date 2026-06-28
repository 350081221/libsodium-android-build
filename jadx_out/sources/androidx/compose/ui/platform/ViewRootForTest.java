package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.node.RootForTest;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bg\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\b\u0010\u0003\u001a\u00020\u0002H&R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/ViewRootForTest;", "Landroidx/compose/ui/node/RootForTest;", "Lkotlin/r2;", "invalidateDescendants", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "", "isLifecycleInResumedState", "()Z", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@VisibleForTesting
/* loaded from: classes.dex */
public interface ViewRootForTest extends RootForTest {

    @p4.l
    public static final Companion Companion = Companion.$$INSTANCE;

    @kotlin.i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\fR6\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/ViewRootForTest$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/ViewRootForTest;", "Lkotlin/r2;", "onViewCreatedCallback", "Lv3/l;", "getOnViewCreatedCallback", "()Lv3/l;", "setOnViewCreatedCallback", "(Lv3/l;)V", "getOnViewCreatedCallback$annotations", "()V", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @p4.m
        private static v3.l<? super ViewRootForTest, r2> onViewCreatedCallback;

        private Companion() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getOnViewCreatedCallback$annotations() {
        }

        @p4.m
        public final v3.l<ViewRootForTest, r2> getOnViewCreatedCallback() {
            return onViewCreatedCallback;
        }

        public final void setOnViewCreatedCallback(@p4.m v3.l<? super ViewRootForTest, r2> lVar) {
            onViewCreatedCallback = lVar;
        }
    }

    boolean getHasPendingMeasureOrLayout();

    @p4.l
    View getView();

    void invalidateDescendants();

    boolean isLifecycleInResumedState();
}
