package com.huawei.agconnect.apms.hilog.task;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TaskInfo implements Parcelable, Cloneable {
    public String desc;
    public long endTime;
    public String name;
    public long startTime;
    public long taskEndTime;
    public String taskId;
    public long taskStartTime;
    public List<String> userIdList;
    public static final AgentLog LOG = AgentLogManager.getAgentLog();
    public static final Parcelable.Creator<TaskInfo> CREATOR = new abc();

    /* loaded from: classes3.dex */
    public static class abc implements Parcelable.Creator<TaskInfo> {
        @Override // android.os.Parcelable.Creator
        public TaskInfo createFromParcel(Parcel parcel) {
            return new TaskInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public TaskInfo[] newArray(int i5) {
            return new TaskInfo[i5];
        }
    }

    public TaskInfo(String str, String str2, String str3, long j5, long j6) {
        this.taskId = str;
        this.name = str2;
        this.desc = str3;
        this.startTime = j5;
        this.endTime = j6;
    }

    public static TaskInfo fromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("taskId");
            String optString2 = jSONObject.optString("name");
            String optString3 = jSONObject.optString("desc");
            long optLong = jSONObject.optLong("start", 0L);
            long optLong2 = jSONObject.optLong("end", 0L);
            long optLong3 = jSONObject.optLong("taskStart", 0L);
            long optLong4 = jSONObject.optLong("taskEnd", 0L);
            if (TextUtils.isEmpty(optString)) {
                return null;
            }
            TaskInfo taskInfo = new TaskInfo(optString, optString2, optString3, optLong, optLong2);
            taskInfo.taskStartTime = optLong3;
            taskInfo.taskEndTime = optLong4;
            taskInfo.userIdList = new ArrayList();
            String optString4 = jSONObject.optString("userIdList");
            if (!TextUtils.isEmpty(optString4)) {
                Collections.addAll(taskInfo.userIdList, optString4.split("\\|"));
            }
            return taskInfo;
        } catch (JSONException unused) {
            LOG.warn(" JSONException while occurrence get TaskInfo");
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDesc() {
        return this.desc;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public String getName() {
        return this.name;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getTaskEndTime() {
        return this.taskEndTime;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public long getTaskStartTime() {
        return this.taskStartTime;
    }

    public boolean isValidTask(String str) {
        List<String> list = this.userIdList;
        if (list == null) {
            return false;
        }
        return list.contains(str);
    }

    public boolean isValidateTaskTime() {
        return (this.taskStartTime == 0 && this.taskEndTime == 0) ? false : true;
    }

    public boolean isValidateTime() {
        return (this.startTime == 0 && this.endTime == 0) ? false : true;
    }

    public void readFromParcel(Parcel parcel) {
        this.taskId = parcel.readString();
        this.name = parcel.readString();
        this.desc = parcel.readString();
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
        this.taskStartTime = parcel.readLong();
        this.taskEndTime = parcel.readLong();
    }

    public String toString() {
        StringBuilder abc2 = com.huawei.agconnect.apms.abc.abc("TaskInfo{taskId='");
        abc2.append(this.taskId);
        abc2.append('\'');
        abc2.append(", name='");
        abc2.append(this.name);
        abc2.append('\'');
        abc2.append(", desc='");
        abc2.append(this.desc);
        abc2.append('\'');
        abc2.append(", startTime=");
        abc2.append(this.startTime);
        abc2.append(", endTime=");
        abc2.append(this.endTime);
        abc2.append(", taskStartTime=");
        abc2.append(this.taskStartTime);
        abc2.append(", taskEndTime=");
        abc2.append(this.taskEndTime);
        abc2.append('}');
        return abc2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.taskId);
        parcel.writeString(this.name);
        parcel.writeString(this.desc);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeLong(this.taskStartTime);
        parcel.writeLong(this.taskEndTime);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public TaskInfo m6430clone() {
        TaskInfo taskInfo = new TaskInfo(this.taskId, this.name, this.desc, this.startTime, this.endTime);
        taskInfo.taskStartTime = this.taskStartTime;
        taskInfo.taskEndTime = this.taskEndTime;
        return taskInfo;
    }

    public TaskInfo(Parcel parcel) {
        this.taskId = parcel.readString();
        this.name = parcel.readString();
        this.desc = parcel.readString();
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
        this.taskStartTime = parcel.readLong();
        this.taskEndTime = parcel.readLong();
    }
}
