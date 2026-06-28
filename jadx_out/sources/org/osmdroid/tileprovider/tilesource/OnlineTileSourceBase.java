package org.osmdroid.tileprovider.tilesource;

import java.util.concurrent.Semaphore;

/* loaded from: classes4.dex */
public abstract class OnlineTileSourceBase extends a {
    private final String[] mBaseUrls;
    private final Semaphore mSemaphore;
    private final j mTileSourcePolicy;

    public OnlineTileSourceBase(String str, int i5, int i6, int i7, String str2, String[] strArr) {
        this(str, i5, i6, i7, str2, strArr, null);
    }

    public void acquire() throws InterruptedException {
        Semaphore semaphore = this.mSemaphore;
        if (semaphore == null) {
            return;
        }
        semaphore.acquire();
    }

    public String getBaseUrl() {
        String[] strArr = this.mBaseUrls;
        if (strArr != null && strArr.length > 0) {
            return strArr[this.random.nextInt(strArr.length)];
        }
        return "";
    }

    public j getTileSourcePolicy() {
        return this.mTileSourcePolicy;
    }

    public abstract String getTileURLString(long j5);

    public void release() {
        Semaphore semaphore = this.mSemaphore;
        if (semaphore == null) {
            return;
        }
        semaphore.release();
    }

    public OnlineTileSourceBase(String str, int i5, int i6, int i7, String str2, String[] strArr, String str3) {
        this(str, i5, i6, i7, str2, strArr, str3, new j());
    }

    public OnlineTileSourceBase(String str, int i5, int i6, int i7, String str2, String[] strArr, String str3, j jVar) {
        super(str, i5, i6, i7, str2, str3);
        this.mBaseUrls = strArr;
        this.mTileSourcePolicy = jVar;
        if (jVar.i() > 0) {
            this.mSemaphore = new Semaphore(jVar.i(), true);
        } else {
            this.mSemaphore = null;
        }
    }
}
