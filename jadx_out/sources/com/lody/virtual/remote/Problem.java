package com.lody.virtual.remote;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class Problem implements Parcelable {
    public static final Parcelable.Creator<Problem> CREATOR = new Parcelable.Creator<Problem>() { // from class: com.lody.virtual.remote.Problem.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Problem createFromParcel(Parcel parcel) {
            return new Problem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Problem[] newArray(int i5) {
            return new Problem[i5];
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public Throwable f9159e;

    public Problem(Throwable th) {
        this.f9159e = th;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeSerializable(this.f9159e);
    }

    protected Problem(Parcel parcel) {
        this.f9159e = (Throwable) parcel.readSerializable();
    }
}
