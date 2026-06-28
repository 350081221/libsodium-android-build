package com.tendcloud.tenddata;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tendcloud.tenddata.m;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: e, reason: collision with root package name */
    public static final Parcelable.Creator<f> f11705e = new Parcelable.Creator<f>() { // from class: com.tendcloud.tenddata.f.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public f createFromParcel(Parcel parcel) {
            try {
                return new f(parcel);
            } catch (Throwable unused) {
                return null;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public f[] newArray(int i5) {
            try {
                return new f[i5];
            } catch (Throwable unused) {
                return null;
            }
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public boolean f11706a;

    /* renamed from: b, reason: collision with root package name */
    public int f11707b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11708c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11709d;

    /* renamed from: f, reason: collision with root package name */
    private final m.a f11710f;

    public f(int i5) {
        this.f11709d = i5;
        this.f11708c = a(i5);
        m.a aVar = m.a.get(i5);
        this.f11710f = aVar;
        m.d d5 = d();
        if (aVar != null) {
            try {
                m.b group = aVar.getGroup("cpuacct");
                String str = aVar.getGroup(com.umeng.analytics.pro.bi.f12277w).group;
                if (str != null) {
                    this.f11706a = !str.contains("bg_non_interactive");
                    if (group.group.split("/").length > 1) {
                        this.f11707b = Integer.parseInt(group.group.split("/")[1].replace("uid_", ""));
                    } else if (d5 != null) {
                        this.f11707b = d5.getUid();
                    }
                } else if (d5 != null) {
                    this.f11707b = d5.getUid();
                }
            } catch (Throwable unused) {
                if (d5 != null) {
                    this.f11707b = d5.getUid();
                }
            }
        }
    }

    public String a() {
        try {
            return this.f11708c.split(":")[0];
        } catch (Throwable unused) {
            return "";
        }
    }

    public String b() {
        try {
            if (this.f11708c.split(":").length > 1) {
                return ":" + this.f11708c.split(":")[1];
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public m.a c() {
        return this.f11710f;
    }

    public final m.d d() {
        try {
            return m.d.get(this.f11709d);
        } catch (Throwable unused) {
            return null;
        }
    }

    public m.c e() {
        try {
            return m.c.get(this.f11709d);
        } catch (Throwable unused) {
            return null;
        }
    }

    static String a(int i5) {
        String str = null;
        try {
            str = m.readFile(String.format("/proc/%d/cmdline", Integer.valueOf(i5))).trim();
            if (TextUtils.isEmpty(str)) {
                return m.c.get(i5).getComm();
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    protected f(Parcel parcel) {
        this.f11708c = parcel.readString();
        this.f11709d = parcel.readInt();
        this.f11710f = (m.a) parcel.readParcelable(m.a.class.getClassLoader());
        this.f11706a = parcel.readByte() != 0;
    }
}
