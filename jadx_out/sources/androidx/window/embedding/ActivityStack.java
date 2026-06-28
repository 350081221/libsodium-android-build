package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0086\u0002J\u0013\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/window/embedding/ActivityStack;", "", "activities", "", "Landroid/app/Activity;", "isEmpty", "", "(Ljava/util/List;Z)V", "getActivities$window_release", "()Ljava/util/List;", "contains", "activity", "equals", "other", TTDownloadField.TT_HASHCODE, "", "toString", "", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalWindowApi
/* loaded from: classes2.dex */
public final class ActivityStack {

    @l
    private final List<Activity> activities;
    private final boolean isEmpty;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityStack(@l List<? extends Activity> activities, boolean z4) {
        l0.p(activities, "activities");
        this.activities = activities;
        this.isEmpty = z4;
    }

    public final boolean contains(@l Activity activity) {
        l0.p(activity, "activity");
        return this.activities.contains(activity);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityStack)) {
            return false;
        }
        ActivityStack activityStack = (ActivityStack) obj;
        if (!l0.g(this.activities, activityStack.activities) && this.isEmpty != activityStack.isEmpty) {
            return true;
        }
        return false;
    }

    @l
    public final List<Activity> getActivities$window_release() {
        return this.activities;
    }

    public int hashCode() {
        return ((this.isEmpty ? 1 : 0) * 31) + this.activities.hashCode();
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityStack{");
        sb.append(l0.C("activities=", getActivities$window_release()));
        sb.append("isEmpty=" + this.isEmpty + '}');
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ ActivityStack(List list, boolean z4, int i5, w wVar) {
        this(list, (i5 & 2) != 0 ? false : z4);
    }
}
