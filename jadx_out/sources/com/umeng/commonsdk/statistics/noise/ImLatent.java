package com.umeng.commonsdk.statistics.noise;

import android.content.Context;
import com.tendcloud.tenddata.ab;
import com.umeng.analytics.pro.bi;
import com.umeng.commonsdk.statistics.a;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.internal.d;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* loaded from: classes3.dex */
public class ImLatent implements d {
    private static ImLatent instanse;
    private Context context;
    private StatTracer statTracer;
    private com.umeng.commonsdk.statistics.common.d storeHelper;
    private final int _DEFAULT_HOURS = 360;
    private final int _DEFAULT_MIN_HOURS = 36;
    private final int _DEFAULT_MIN_LATENT = 1;
    private final int _DEFAULT_MAX_LATENT = 1800;
    private final long _ONE_HOURS_IN_MS = OpenStreetMapTileProviderConstants.ONE_HOUR;
    private final long _360HOURS_IN_MS = 1296000000;
    private final long _36HOURS_IN_MS = 129600000;
    private final int LATENT_MAX = ab.Y;
    private final int LATENT_WINDOW = 10;
    private long latentHour = 1296000000;
    private int latentWindow = 10;
    private long mDelay = 0;
    private long mElapsed = 0;
    private boolean mLatentActivite = false;
    private Object mLatentLock = new Object();

    private ImLatent(Context context, StatTracer statTracer) {
        this.context = context;
        this.storeHelper = com.umeng.commonsdk.statistics.common.d.a(context);
        this.statTracer = statTracer;
    }

    public static synchronized ImLatent getService(Context context, StatTracer statTracer) {
        ImLatent imLatent;
        synchronized (ImLatent.class) {
            if (instanse == null) {
                ImLatent imLatent2 = new ImLatent(context, statTracer);
                instanse = imLatent2;
                imLatent2.onImprintChanged(ImprintHandler.getImprintService(context).c());
            }
            imLatent = instanse;
        }
        return imLatent;
    }

    public long getDelayTime() {
        long j5;
        synchronized (this.mLatentLock) {
            j5 = this.mDelay;
        }
        return j5;
    }

    public long getElapsedTime() {
        return this.mElapsed;
    }

    public boolean isLatentActivite() {
        boolean z4;
        synchronized (this.mLatentLock) {
            z4 = this.mLatentActivite;
        }
        return z4;
    }

    public void latentDeactivite() {
        synchronized (this.mLatentLock) {
            this.mLatentActivite = false;
        }
    }

    @Override // com.umeng.commonsdk.statistics.internal.d
    public void onImprintChanged(ImprintHandler.a aVar) {
        int i5 = 360;
        int intValue = Integer.valueOf(aVar.a("latent_hours", String.valueOf(360))).intValue();
        if (intValue > 36) {
            i5 = intValue;
        }
        this.latentHour = i5 * OpenStreetMapTileProviderConstants.ONE_HOUR;
        int intValue2 = Integer.valueOf(aVar.a(bi.aV, "0")).intValue();
        if (intValue2 < 1 || intValue2 > 1800) {
            intValue2 = 0;
        }
        if (intValue2 == 0) {
            int i6 = a.f13246c;
            if (i6 > 0 && i6 <= 1800000) {
                this.latentWindow = i6;
                return;
            } else {
                this.latentWindow = 10;
                return;
            }
        }
        this.latentWindow = intValue2;
    }

    public boolean shouldStartLatency() {
        if (this.storeHelper.c() || this.statTracer.isFirstRequest()) {
            return false;
        }
        synchronized (this.mLatentLock) {
            if (this.mLatentActivite) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.statTracer.getLastReqTime();
            if (currentTimeMillis > this.latentHour) {
                String signature = Envelope.getSignature(this.context);
                synchronized (this.mLatentLock) {
                    this.mDelay = DataHelper.random(this.latentWindow, signature);
                    this.mElapsed = currentTimeMillis;
                    this.mLatentActivite = true;
                }
                return true;
            }
            if (currentTimeMillis <= 129600000) {
                return false;
            }
            synchronized (this.mLatentLock) {
                this.mDelay = 0L;
                this.mElapsed = currentTimeMillis;
                this.mLatentActivite = true;
            }
            return true;
        }
    }
}
