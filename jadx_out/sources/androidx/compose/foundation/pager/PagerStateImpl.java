package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B%\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0012\u0010\u0013R.\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/pager/PagerStateImpl;", "Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/runtime/MutableState;", "Lkotlin/Function0;", "", "pageCountState", "Landroidx/compose/runtime/MutableState;", "getPageCountState", "()Landroidx/compose/runtime/MutableState;", "setPageCountState", "(Landroidx/compose/runtime/MutableState;)V", "getPageCount", "()I", "pageCount", "initialPage", "", "initialPageOffsetFraction", "updatedPageCount", "<init>", "(IFLv3/a;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class PagerStateImpl extends PagerState {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final Saver<PagerStateImpl, ?> Saver = ListSaverKt.listSaver(PagerStateImpl$Companion$Saver$1.INSTANCE, PagerStateImpl$Companion$Saver$2.INSTANCE);

    @l
    private MutableState<v3.a<Integer>> pageCountState;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/pager/PagerStateImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/pager/PagerStateImpl;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Saver<PagerStateImpl, ?> getSaver() {
            return PagerStateImpl.Saver;
        }
    }

    public PagerStateImpl(int i5, float f5, @l v3.a<Integer> aVar) {
        super(i5, f5);
        MutableState<v3.a<Integer>> mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(aVar, null, 2, null);
        this.pageCountState = mutableStateOf$default;
    }

    @Override // androidx.compose.foundation.pager.PagerState
    public int getPageCount() {
        return this.pageCountState.getValue().invoke().intValue();
    }

    @l
    public final MutableState<v3.a<Integer>> getPageCountState() {
        return this.pageCountState;
    }

    public final void setPageCountState(@l MutableState<v3.a<Integer>> mutableState) {
        this.pageCountState = mutableState;
    }
}
