package androidx.compose.material3.pulltorefresh;

import androidx.annotation.FloatRange;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.i0;
import p4.l;

@Stable
@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\f\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0007R\u001c\u0010\u0015\u001a\u00020\u00108&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "", "Lkotlin/r2;", "startRefresh", "endRefresh", "", "getPositionalThreshold", "()F", "positionalThreshold", "getProgress", "progress", "", "isRefreshing", "()Z", "getVerticalOffset", "verticalOffset", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setNestedScrollConnection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "nestedScrollConnection", "material3_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public interface PullToRefreshState {
    void endRefresh();

    @l
    NestedScrollConnection getNestedScrollConnection();

    float getPositionalThreshold();

    @FloatRange(from = 0.0d)
    float getProgress();

    @FloatRange(from = 0.0d)
    float getVerticalOffset();

    boolean isRefreshing();

    void setNestedScrollConnection(@l NestedScrollConnection nestedScrollConnection);

    void startRefresh();
}
