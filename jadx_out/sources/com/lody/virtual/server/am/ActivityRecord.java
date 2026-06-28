package com.lody.virtual.server.am;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ActivityRecord extends Binder {
    public ComponentName component;
    public ActivityInfo info;
    public Intent intent;
    public boolean marked;
    Bundle options;
    public ClearTaskAction pendingClearAction = ClearTaskAction.NONE;
    public PendingNewIntent pendingNewIntent;
    public ProcessRecord process;
    int requestCode;
    public IBinder resultTo;
    String resultWho;
    public boolean started;
    public TaskRecord task;
    public IBinder token;
    public int userId;

    public ActivityRecord(int i5, Intent intent, ActivityInfo activityInfo, IBinder iBinder) {
        this.userId = i5;
        this.intent = intent;
        this.info = activityInfo;
        if (activityInfo.targetActivity != null) {
            this.component = new ComponentName(activityInfo.packageName, activityInfo.targetActivity);
        } else {
            this.component = new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        this.resultTo = iBinder;
    }

    public void init(TaskRecord taskRecord, ProcessRecord processRecord, IBinder iBinder) {
        this.userId = taskRecord.userId;
        this.task = taskRecord;
        this.process = processRecord;
        this.token = iBinder;
        this.started = true;
    }
}
