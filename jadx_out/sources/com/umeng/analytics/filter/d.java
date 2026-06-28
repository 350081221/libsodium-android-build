package com.umeng.analytics.filter;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.y1;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static final String f12106b = "Ă";

    /* renamed from: c, reason: collision with root package name */
    private MessageDigest f12108c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12110e;

    /* renamed from: a, reason: collision with root package name */
    private final String f12107a = "MD5";

    /* renamed from: d, reason: collision with root package name */
    private Set<Object> f12109d = new HashSet();

    public d(boolean z4, String str) {
        this.f12110e = z4;
        try {
            this.f12108c = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e5) {
            e5.printStackTrace();
        }
        if (str != null) {
            int i5 = 0;
            if (z4) {
                try {
                    byte[] decode = Base64.decode(str.getBytes(), 0);
                    while (i5 < decode.length / 4) {
                        int i6 = i5 * 4;
                        this.f12109d.add(Integer.valueOf(((decode[i6 + 0] & y1.f19838d) << 24) + ((decode[i6 + 1] & y1.f19838d) << 16) + ((decode[i6 + 2] & y1.f19838d) << 8) + (decode[i6 + 3] & y1.f19838d)));
                        i5++;
                    }
                    return;
                } catch (IllegalArgumentException e6) {
                    e6.printStackTrace();
                    return;
                }
            }
            String[] split = str.split(f12106b);
            int length = split.length;
            while (i5 < length) {
                this.f12109d.add(split[i5]);
                i5++;
            }
        }
    }

    private Integer c(String str) {
        try {
            this.f12108c.update(str.getBytes());
            byte[] digest = this.f12108c.digest();
            return Integer.valueOf(((digest[0] & y1.f19838d) << 24) + ((digest[1] & y1.f19838d) << 16) + ((digest[2] & y1.f19838d) << 8) + (digest[3] & y1.f19838d));
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public boolean a(String str) {
        if (this.f12110e) {
            return this.f12109d.contains(c(str));
        }
        return this.f12109d.contains(str);
    }

    public void b(String str) {
        if (this.f12110e) {
            this.f12109d.add(c(str));
        } else {
            this.f12109d.add(str);
        }
    }

    public String toString() {
        if (this.f12110e) {
            byte[] bArr = new byte[this.f12109d.size() * 4];
            Iterator<Object> it = this.f12109d.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((-16777216) & intValue) >> 24);
                int i7 = i6 + 1;
                bArr[i6] = (byte) ((16711680 & intValue) >> 16);
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((65280 & intValue) >> 8);
                i5 = i8 + 1;
                bArr[i8] = (byte) (intValue & 255);
            }
            return new String(Base64.encode(bArr, 0));
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : this.f12109d) {
            if (sb.length() > 0) {
                sb.append(f12106b);
            }
            sb.append(obj.toString());
        }
        return sb.toString();
    }

    public void a() {
        StringBuilder sb = new StringBuilder();
        Iterator<Object> it = this.f12109d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (sb.length() > 0) {
                sb.append(",");
            }
        }
        System.out.println(sb.toString());
    }
}
