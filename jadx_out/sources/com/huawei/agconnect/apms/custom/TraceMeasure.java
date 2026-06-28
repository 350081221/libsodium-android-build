package com.huawei.agconnect.apms.custom;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public class TraceMeasure implements Parcelable {
    public static final Parcelable.Creator<TraceMeasure> CREATOR = new abc();
    public String abc;
    public AtomicLong bcd;

    /* loaded from: classes3.dex */
    public static class abc implements Parcelable.Creator<TraceMeasure> {
        @Override // android.os.Parcelable.Creator
        public TraceMeasure createFromParcel(Parcel parcel) {
            return new TraceMeasure(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public TraceMeasure[] newArray(int i5) {
            return new TraceMeasure[0];
        }
    }

    public TraceMeasure(String str) {
        this.abc = str;
        this.bcd = new AtomicLong(0L);
    }

    public void abc(long j5) {
        this.bcd.addAndGet(j5);
    }

    public long bcd() {
        return this.bcd.get();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.abc);
        parcel.writeLong(this.bcd.get());
    }

    public String abc() {
        return this.abc;
    }

    public void bcd(long j5) {
        this.bcd.set(j5);
    }

    public /* synthetic */ TraceMeasure(Parcel parcel, abc abcVar) {
        this.abc = parcel.readString();
        this.bcd = new AtomicLong(parcel.readLong());
    }
}
