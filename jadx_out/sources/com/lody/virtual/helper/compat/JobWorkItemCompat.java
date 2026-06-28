package com.lody.virtual.helper.compat;

import android.annotation.TargetApi;
import android.app.job.JobWorkItem;
import android.content.Intent;
import com.lody.virtual.helper.utils.ComponentUtils;

@TargetApi(26)
/* loaded from: classes3.dex */
public class JobWorkItemCompat {
    public static JobWorkItem parse(JobWorkItem jobWorkItem) {
        Intent intent;
        if (jobWorkItem != null) {
            if (mirror.android.app.job.JobWorkItem.getIntent.call(jobWorkItem, new Object[0]).hasExtra("_VA_|_intent_")) {
                return jobWorkItem;
            }
            intent = jobWorkItem.getIntent();
            Intent intent2 = ComponentUtils.parseIntentSenderInfo(intent, false).intent;
            ComponentUtils.unpackFillIn(intent2, JobWorkItemCompat.class.getClassLoader());
            JobWorkItem jobWorkItem2 = (JobWorkItem) mirror.android.app.job.JobWorkItem.ctor.newInstance(intent2);
            mirror.android.app.job.JobWorkItem.mWorkId.set(jobWorkItem2, mirror.android.app.job.JobWorkItem.mWorkId.get(jobWorkItem));
            mirror.android.app.job.JobWorkItem.mGrants.set(jobWorkItem2, mirror.android.app.job.JobWorkItem.mGrants.get(jobWorkItem));
            mirror.android.app.job.JobWorkItem.mDeliveryCount.set(jobWorkItem2, mirror.android.app.job.JobWorkItem.mDeliveryCount.get(jobWorkItem));
            return jobWorkItem2;
        }
        return null;
    }

    public static JobWorkItem redirect(int i5, JobWorkItem jobWorkItem, String str) {
        if (jobWorkItem != null) {
            Intent call = mirror.android.app.job.JobWorkItem.getIntent.call(jobWorkItem, new Object[0]);
            if (call.hasExtra("_VA_|_intent_")) {
                return jobWorkItem;
            }
            JobWorkItem jobWorkItem2 = (JobWorkItem) mirror.android.app.job.JobWorkItem.ctor.newInstance(ComponentUtils.getProxyIntentSenderIntent(i5, 4, str, call));
            mirror.android.app.job.JobWorkItem.mWorkId.set(jobWorkItem2, mirror.android.app.job.JobWorkItem.mWorkId.get(jobWorkItem));
            mirror.android.app.job.JobWorkItem.mGrants.set(jobWorkItem2, mirror.android.app.job.JobWorkItem.mGrants.get(jobWorkItem));
            mirror.android.app.job.JobWorkItem.mDeliveryCount.set(jobWorkItem2, mirror.android.app.job.JobWorkItem.mDeliveryCount.get(jobWorkItem));
            return jobWorkItem2;
        }
        return null;
    }
}
