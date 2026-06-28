package com.ss.android.socialbase.downloader.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public class c implements Parcelable, Comparable {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: com.ss.android.socialbase.downloader.model.c.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i5) {
            return new c[i5];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final String f11127a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11128b;

    public c(String str, String str2) {
        this.f11127a = str;
        this.f11128b = str2;
    }

    public String a() {
        return this.f11127a;
    }

    public String b() {
        return this.f11128b;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof c)) {
            return 1;
        }
        c cVar = (c) obj;
        if (TextUtils.equals(this.f11127a, cVar.a())) {
            return 0;
        }
        String str = this.f11127a;
        if (str == null) {
            return -1;
        }
        int compareTo = str.compareTo(cVar.a());
        if (compareTo > 0) {
            return 1;
        }
        if (compareTo >= 0) {
            return 0;
        }
        return -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (TextUtils.equals(this.f11127a, cVar.f11127a) && TextUtils.equals(this.f11128b, cVar.f11128b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f11127a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11128b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "HttpHeader{name='" + this.f11127a + "', value='" + this.f11128b + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f11127a);
        parcel.writeString(this.f11128b);
    }

    protected c(Parcel parcel) {
        this.f11127a = parcel.readString();
        this.f11128b = parcel.readString();
    }
}
