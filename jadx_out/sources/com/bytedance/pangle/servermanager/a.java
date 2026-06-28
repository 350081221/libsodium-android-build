package com.bytedance.pangle.servermanager;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.bytedance.pangle.servermanager.a.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ a[] newArray(int i5) {
            return new a[i5];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    final IBinder f4573a;

    a(Parcel parcel) {
        this.f4573a = parcel.readStrongBinder();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeStrongBinder(this.f4573a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(IBinder iBinder) {
        this.f4573a = iBinder;
    }
}
