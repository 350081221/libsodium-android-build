package androidx.compose.material;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.i0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/material/SnackbarData;", "", "Lkotlin/r2;", "performAction", "dismiss", "", "getMessage", "()Ljava/lang/String;", CrashHianalyticsData.MESSAGE, "getActionLabel", "actionLabel", "Landroidx/compose/material/SnackbarDuration;", "getDuration", "()Landroidx/compose/material/SnackbarDuration;", "duration", "material_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface SnackbarData {
    void dismiss();

    @m
    String getActionLabel();

    @l
    SnackbarDuration getDuration();

    @l
    String getMessage();

    void performAction();
}
