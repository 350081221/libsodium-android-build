package com.efs.sdk.net;

import android.content.Context;
import com.efs.sdk.base.EfsReporter;
import java.util.Random;

/* loaded from: classes2.dex */
public class NetConfigManager {

    /* renamed from: c, reason: collision with root package name */
    private EfsReporter f6741c;

    /* renamed from: d, reason: collision with root package name */
    private int f6742d;

    /* renamed from: e, reason: collision with root package name */
    private int f6743e;

    /* renamed from: f, reason: collision with root package name */
    private int f6744f;

    /* renamed from: g, reason: collision with root package name */
    private int f6745g;

    /* renamed from: h, reason: collision with root package name */
    private int f6746h;

    /* renamed from: i, reason: collision with root package name */
    private int f6747i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6748j;

    /* renamed from: k, reason: collision with root package name */
    private Context f6749k;

    /* renamed from: l, reason: collision with root package name */
    private int f6750l;

    /* renamed from: a, reason: collision with root package name */
    private final String f6739a = "NetConfigManager";

    /* renamed from: b, reason: collision with root package name */
    private final int f6740b = 0;

    /* renamed from: m, reason: collision with root package name */
    private boolean f6751m = false;

    /* JADX WARN: Removed duplicated region for block: B:15:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NetConfigManager(android.content.Context r20, com.efs.sdk.base.EfsReporter r21) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.net.NetConfigManager.<init>(android.content.Context, com.efs.sdk.base.EfsReporter):void");
    }

    public boolean enableTracer() {
        return this.f6748j;
    }

    public int getDataRate() {
        return this.f6747i;
    }

    public int getDayLimit() {
        return this.f6746h;
    }

    public int getExtraRateFlag() {
        return this.f6750l;
    }

    public boolean getNetRequestBodyCollectState() {
        return this.f6751m;
    }

    public void setNetRequestBodyCollectState(boolean z4) {
        this.f6751m = z4;
    }

    private static boolean a(int i5) {
        if (i5 == 0) {
            return false;
        }
        return i5 == 100 || new Random().nextInt(100) <= i5;
    }
}
