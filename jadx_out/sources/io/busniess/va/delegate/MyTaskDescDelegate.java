package io.busniess.va.delegate;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import com.lody.virtual.client.hook.delegate.TaskDescriptionDelegate;
import com.lody.virtual.os.VUserManager;

@TargetApi(21)
/* loaded from: classes3.dex */
public class MyTaskDescDelegate implements TaskDescriptionDelegate {
    @Override // com.lody.virtual.client.hook.delegate.TaskDescriptionDelegate
    public ActivityManager.TaskDescription getTaskDescription(ActivityManager.TaskDescription taskDescription) {
        String str;
        if (taskDescription == null) {
            return null;
        }
        String str2 = " (" + (VUserManager.get().getUserHandle() + 1) + ")";
        if (taskDescription.getLabel() != null) {
            str = taskDescription.getLabel();
        } else {
            str = "";
        }
        if (!str.endsWith(str2)) {
            return new ActivityManager.TaskDescription(taskDescription.getLabel() + str2, taskDescription.getIcon(), taskDescription.getPrimaryColor());
        }
        return taskDescription;
    }
}
