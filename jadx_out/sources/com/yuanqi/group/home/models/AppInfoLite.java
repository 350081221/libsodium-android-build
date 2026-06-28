package com.yuanqi.group.home.models;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class AppInfoLite implements Parcelable {
    public static final Parcelable.Creator<AppInfoLite> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public String f14003a;

    /* renamed from: b, reason: collision with root package name */
    public String f14004b;

    /* renamed from: c, reason: collision with root package name */
    public String f14005c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14006d;

    /* renamed from: e, reason: collision with root package name */
    public double f14007e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f14008f;

    /* renamed from: g, reason: collision with root package name */
    public int f14009g;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<AppInfoLite> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppInfoLite createFromParcel(Parcel parcel) {
            return new AppInfoLite(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppInfoLite[] newArray(int i5) {
            return new AppInfoLite[i5];
        }
    }

    public AppInfoLite(c cVar) {
        this(cVar.f14012a, cVar.f14013b, String.valueOf(cVar.f14016e), cVar.f14014c, cVar.f14019h, cVar.f14020i, cVar.f14017f);
    }

    public Uri a() {
        if (this.f14006d) {
            return Uri.parse("package:" + this.f14003a);
        }
        return Uri.fromFile(new File(this.f14004b));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "AppInfoLite{packageName='" + this.f14003a + "', path='" + this.f14004b + "', label='" + this.f14005c + "', dynamic=" + this.f14006d + ", targetSdkVersion=" + this.f14007e + ", requestedPermissions=" + Arrays.toString(this.f14008f) + ", cloneNum=" + this.f14009g + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f14003a);
        parcel.writeString(this.f14004b);
        parcel.writeString(this.f14005c);
        parcel.writeByte(this.f14006d ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.f14007e);
        parcel.writeInt(this.f14009g);
        parcel.writeStringArray(this.f14008f);
    }

    public AppInfoLite(String str, String str2, String str3, boolean z4, int i5, String[] strArr, int i6) {
        this.f14003a = str;
        this.f14004b = str2;
        this.f14005c = str3;
        this.f14006d = z4;
        this.f14007e = i5;
        this.f14008f = strArr;
        this.f14009g = i6;
    }

    public AppInfoLite(String str, String str2, String str3, boolean z4, String[] strArr) {
        this.f14003a = str;
        this.f14004b = str2;
        this.f14005c = str3;
        this.f14006d = z4;
        this.f14008f = strArr;
    }

    protected AppInfoLite(Parcel parcel) {
        this.f14003a = parcel.readString();
        this.f14004b = parcel.readString();
        this.f14005c = parcel.readString();
        this.f14006d = parcel.readByte() != 0;
        this.f14007e = parcel.readDouble();
        this.f14009g = parcel.readInt();
        this.f14008f = parcel.createStringArray();
    }
}
