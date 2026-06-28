package com.ss.android.socialbase.downloader.f;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f10806a;

    /* renamed from: b, reason: collision with root package name */
    private int f10807b;

    private n(JSONObject jSONObject) {
        this.f10806a = jSONObject;
    }

    private int p() {
        return this.f10806a.optInt("url_balance", 2);
    }

    public void a(int i5) {
        this.f10807b = b(i5);
    }

    public boolean b() {
        return p() > 0;
    }

    public boolean c() {
        return p() == 1;
    }

    public int d() {
        return this.f10806a.optInt("buffer_count", 512);
    }

    public int e() {
        return this.f10806a.optInt("buffer_size", 8192);
    }

    public boolean f() {
        return this.f10806a.optInt("segment_mode", 1) == 0;
    }

    public long g() {
        long optInt = this.f10806a.optInt("segment_min_kb", 512) * 1024;
        return optInt < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH ? PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH : optInt;
    }

    public long h() {
        long optInt = this.f10806a.optInt("segment_min_init_mb", 10) * 1048576;
        if (optInt < 5242880) {
            return 5242880L;
        }
        return optInt;
    }

    public long i() {
        long optInt = this.f10806a.optInt("segment_max_kb", 0) * 1048576;
        if (optInt < g()) {
            return -1L;
        }
        return optInt;
    }

    public long j() {
        long optInt = this.f10806a.optInt("connect_timeout", -1);
        if (optInt >= 2000) {
            return optInt;
        }
        return -1L;
    }

    public long k() {
        long optInt = this.f10806a.optInt("read_timeout", -1);
        if (optInt >= 4000) {
            return optInt;
        }
        return -1L;
    }

    public int l() {
        return this.f10806a.optInt("ip_strategy", 0);
    }

    public float m() {
        return (float) this.f10806a.optDouble("main_ratio", 0.0d);
    }

    public int n() {
        return this.f10806a.optInt("ratio_segment", 0);
    }

    public float o() {
        return Math.min(Math.max(0.0f, (float) this.f10806a.optDouble("poor_speed_ratio", 0.0d)), 1.0f);
    }

    private int b(int i5) {
        int optInt = this.f10806a.optInt("thread_count", 4);
        if (optInt > 16) {
            optInt = 16;
        }
        if (optInt > 0) {
            return p() == 1 ? Math.min(optInt, i5) : optInt;
        }
        if (p() > 0) {
            return i5;
        }
        return 1;
    }

    public int a() {
        return this.f10807b;
    }

    @NonNull
    public static n a(@NonNull JSONObject jSONObject) {
        return new n(jSONObject);
    }
}
