package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "", CrashHianalyticsData.TIME, "", "dataPoint", "", "(JF)V", "getDataPoint", "()F", "setDataPoint", "(F)V", "getTime", "()J", "setTime", "(J)V", "component1", "component2", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DataPointAtTime {
    public static final int $stable = 8;
    private float dataPoint;
    private long time;

    public DataPointAtTime(long j5, float f5) {
        this.time = j5;
        this.dataPoint = f5;
    }

    public static /* synthetic */ DataPointAtTime copy$default(DataPointAtTime dataPointAtTime, long j5, float f5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = dataPointAtTime.time;
        }
        if ((i5 & 2) != 0) {
            f5 = dataPointAtTime.dataPoint;
        }
        return dataPointAtTime.copy(j5, f5);
    }

    public final long component1() {
        return this.time;
    }

    public final float component2() {
        return this.dataPoint;
    }

    @l
    public final DataPointAtTime copy(long j5, float f5) {
        return new DataPointAtTime(j5, f5);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataPointAtTime)) {
            return false;
        }
        DataPointAtTime dataPointAtTime = (DataPointAtTime) obj;
        return this.time == dataPointAtTime.time && Float.compare(this.dataPoint, dataPointAtTime.dataPoint) == 0;
    }

    public final float getDataPoint() {
        return this.dataPoint;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + Float.hashCode(this.dataPoint);
    }

    public final void setDataPoint(float f5) {
        this.dataPoint = f5;
    }

    public final void setTime(long j5) {
        this.time = j5;
    }

    @l
    public String toString() {
        return "DataPointAtTime(time=" + this.time + ", dataPoint=" + this.dataPoint + ')';
    }
}
