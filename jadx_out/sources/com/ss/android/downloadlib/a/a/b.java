package com.ss.android.downloadlib.a.a;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.ss.android.downloadlib.a.a.b.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i5) {
            return new b[i5];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public int f9556a;

    /* renamed from: b, reason: collision with root package name */
    public int f9557b;

    /* renamed from: c, reason: collision with root package name */
    public String f9558c;

    /* renamed from: d, reason: collision with root package name */
    public int f9559d;

    /* renamed from: e, reason: collision with root package name */
    public String f9560e;

    /* renamed from: f, reason: collision with root package name */
    public String f9561f;

    public b() {
        this.f9558c = "";
        this.f9560e = "";
        this.f9561f = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f9556a == bVar.f9556a && this.f9557b == bVar.f9557b) {
                String str = this.f9558c;
                if (str != null) {
                    return str.equals(bVar.f9558c);
                }
                if (bVar.f9558c == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i5 = ((this.f9556a * 31) + this.f9557b) * 31;
        String str = this.f9558c;
        return i5 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f9556a);
        parcel.writeInt(this.f9557b);
        parcel.writeString(this.f9558c);
        parcel.writeString(this.f9560e);
        parcel.writeString(this.f9561f);
        parcel.writeInt(this.f9559d);
    }

    protected b(Parcel parcel) {
        this.f9558c = "";
        this.f9560e = "";
        this.f9561f = "";
        this.f9556a = parcel.readInt();
        this.f9557b = parcel.readInt();
        this.f9558c = parcel.readString();
        this.f9560e = parcel.readString();
        this.f9561f = parcel.readString();
        this.f9559d = parcel.readInt();
    }
}
