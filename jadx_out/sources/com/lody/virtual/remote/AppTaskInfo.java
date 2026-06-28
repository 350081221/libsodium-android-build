package com.lody.virtual.remote;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class AppTaskInfo implements Parcelable {
    public static final Parcelable.Creator<AppTaskInfo> CREATOR = new Parcelable.Creator<AppTaskInfo>() { // from class: com.lody.virtual.remote.AppTaskInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AppTaskInfo createFromParcel(Parcel parcel) {
            return new AppTaskInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AppTaskInfo[] newArray(int i5) {
            return new AppTaskInfo[i5];
        }
    };
    public ComponentName baseActivity;
    public Intent baseIntent;
    public int taskId;
    public ComponentName topActivity;

    public AppTaskInfo(int i5, Intent intent, ComponentName componentName, ComponentName componentName2) {
        this.taskId = i5;
        this.baseIntent = intent;
        this.baseActivity = componentName;
        this.topActivity = componentName2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.taskId);
        parcel.writeParcelable(this.baseIntent, i5);
        parcel.writeParcelable(this.baseActivity, i5);
        parcel.writeParcelable(this.topActivity, i5);
    }

    protected AppTaskInfo(Parcel parcel) {
        this.taskId = parcel.readInt();
        this.baseIntent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.baseActivity = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
        this.topActivity = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
    }
}
