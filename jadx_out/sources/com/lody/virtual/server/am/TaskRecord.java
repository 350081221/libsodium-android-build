package com.lody.virtual.server.am;

import android.content.ComponentName;
import android.content.Intent;
import com.lody.virtual.remote.AppTaskInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
class TaskRecord {
    public final List<ActivityRecord> activities = new ArrayList();
    public String affinity;
    public int taskId;
    public Intent taskRoot;
    public int userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TaskRecord(int i5, int i6, String str, Intent intent) {
        this.taskId = i5;
        this.userId = i6;
        this.affinity = str;
        this.taskRoot = intent;
    }

    public void finish() {
        synchronized (this.activities) {
            Iterator<ActivityRecord> it = this.activities.iterator();
            while (it.hasNext()) {
                it.next().marked = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppTaskInfo getAppTaskInfo() {
        int size = this.activities.size();
        if (size <= 0) {
            return null;
        }
        ComponentName componentName = this.activities.get(size - 1).component;
        int i5 = this.taskId;
        Intent intent = this.taskRoot;
        return new AppTaskInfo(i5, intent, intent.getComponent(), componentName);
    }

    ActivityRecord getRootActivityRecord() {
        synchronized (this.activities) {
            for (int i5 = 0; i5 < this.activities.size(); i5++) {
                ActivityRecord activityRecord = this.activities.get(i5);
                if (!activityRecord.started || !activityRecord.marked) {
                    return activityRecord;
                }
            }
            return null;
        }
    }

    public ActivityRecord getTopActivityRecord() {
        return getTopActivityRecord(false);
    }

    public boolean isFinishing() {
        synchronized (this.activities) {
            for (ActivityRecord activityRecord : this.activities) {
                if (activityRecord.started && !activityRecord.marked) {
                    return false;
                }
            }
            return true;
        }
    }

    public ActivityRecord getTopActivityRecord(boolean z4) {
        synchronized (this.activities) {
            if (this.activities.isEmpty()) {
                return null;
            }
            for (int size = this.activities.size() - 1; size >= 0; size--) {
                ActivityRecord activityRecord = this.activities.get(size);
                if (activityRecord.started) {
                    if (!z4 && activityRecord.marked) {
                    }
                    return activityRecord;
                }
            }
            return null;
        }
    }
}
