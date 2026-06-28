package com.efs.sdk.pa.a;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.pa.PA;
import com.efs.sdk.pa.PAANRListener;
import com.efs.sdk.pa.PAMsgListener;
import com.efs.sdk.pa.a.b;
import com.efs.sdk.pa.a.g;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/* loaded from: classes2.dex */
public final class c implements PA {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6874a;

    /* renamed from: c, reason: collision with root package name */
    private e f6876c;

    /* renamed from: d, reason: collision with root package name */
    private f f6877d;

    /* renamed from: e, reason: collision with root package name */
    private a f6878e;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6881h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f6882i;

    /* renamed from: b, reason: collision with root package name */
    private Looper f6875b = Looper.myLooper();

    /* renamed from: f, reason: collision with root package name */
    private b f6879f = new b();

    /* renamed from: g, reason: collision with root package name */
    private g f6880g = new g();

    public c(boolean z4) {
        this.f6882i = z4;
    }

    @Override // com.efs.sdk.pa.PA
    public final void enableDumpToFile(String str) {
        FileOutputStream fileOutputStream;
        f fVar = this.f6877d;
        if (fVar != null && str != null && str.trim().length() != 0) {
            fVar.f6891c = str;
            if (fVar.f6892d == null) {
                try {
                    fileOutputStream = new FileOutputStream(str);
                    try {
                        fVar.f6892d = new BufferedOutputStream(fileOutputStream);
                    } catch (Exception unused) {
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                    }
                } catch (Exception unused3) {
                    fileOutputStream = null;
                }
            }
        }
    }

    @Override // com.efs.sdk.pa.PA
    public final void enableLog(boolean z4) {
        this.f6874a = z4;
        this.f6879f.f6868b = z4;
        this.f6880g.f6894b = z4;
        f fVar = this.f6877d;
        if (fVar != null) {
            fVar.f6890b = z4;
        }
    }

    @Override // com.efs.sdk.pa.PA
    public final int endCalFPS(String str) {
        if (!this.f6881h) {
            return -1;
        }
        b bVar = this.f6879f;
        int i5 = 0;
        if (str != null && str.trim().length() != 0) {
            b.a aVar = bVar.f6867a.get(str);
            if (aVar == null) {
                return 0;
            }
            View view = aVar.f6872d;
            if (view != null && aVar.f6871c != null) {
                view.getViewTreeObserver().removeOnPreDrawListener(aVar.f6871c);
            }
            bVar.f6867a.remove(str);
            int currentTimeMillis = (int) (((float) aVar.f6870b) / (((float) (System.currentTimeMillis() - aVar.f6869a)) / 1000.0f));
            if (currentTimeMillis > 0) {
                i5 = currentTimeMillis;
            }
            if (bVar.f6868b) {
                Log.e("PerformanceAnalyze", "key=" + str + ",fps=" + i5);
            }
        }
        return i5;
    }

    @Override // com.efs.sdk.pa.PA
    public final long endCalTime(String str) {
        if (!this.f6881h) {
            return -1L;
        }
        g gVar = this.f6880g;
        long j5 = 0;
        if (str != null && str.trim().length() != 0) {
            g.a aVar = gVar.f6893a.get(str);
            if (aVar == null) {
                return 0L;
            }
            gVar.f6893a.remove(str);
            j5 = System.currentTimeMillis() - aVar.f6895a;
            if (gVar.f6894b) {
                Log.e("PerformanceAnalyze", "key=" + str + ",consumeTime=" + j5);
            }
        }
        return j5;
    }

    @Override // com.efs.sdk.pa.PA
    public final void registerPAANRListener(Context context, PAANRListener pAANRListener) {
        registerPAANRListener(context, pAANRListener, 2000L);
    }

    @Override // com.efs.sdk.pa.PA
    public final void registerPAMsgListener(PAMsgListener pAMsgListener) {
        if (this.f6876c == null) {
            this.f6876c = new e();
        }
        this.f6875b.setMessageLogging(this.f6876c);
        if (this.f6877d == null) {
            this.f6877d = new f();
        }
        f fVar = this.f6877d;
        fVar.f6890b = this.f6874a;
        fVar.f6889a = pAMsgListener;
        this.f6876c.f6883a.add(fVar);
    }

    @Override // com.efs.sdk.pa.PA
    public final void start() {
        if (!this.f6882i && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
            return;
        }
        this.f6881h = true;
        e eVar = this.f6876c;
        if (eVar != null) {
            this.f6875b.setMessageLogging(eVar);
        }
        a aVar = this.f6878e;
        if (aVar != null && aVar.f6854f) {
            aVar.f6854f = false;
            aVar.f6855g.post(aVar.f6861m);
            aVar.f6858j = SystemClock.uptimeMillis();
        }
    }

    @Override // com.efs.sdk.pa.PA
    public final void startCalFPS(String str, View view) {
        if (!this.f6881h) {
            return;
        }
        b bVar = this.f6879f;
        if (str != null && str.trim().length() != 0 && view != null && bVar.f6867a.get(str) == null) {
            b.a aVar = new b.a((byte) 0);
            aVar.f6872d = view;
            b.a.AnonymousClass1 anonymousClass1 = new ViewTreeObserver.OnPreDrawListener() { // from class: com.efs.sdk.pa.a.b.a.1
                public AnonymousClass1() {
                }

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    a.this.f6870b++;
                    return true;
                }
            };
            aVar.f6871c = anonymousClass1;
            aVar.f6872d.getViewTreeObserver().addOnPreDrawListener(anonymousClass1);
            aVar.f6869a = System.currentTimeMillis();
            bVar.f6867a.put(str, aVar);
        }
    }

    @Override // com.efs.sdk.pa.PA
    public final void startCalTime(String str) {
        if (!this.f6881h) {
            return;
        }
        g gVar = this.f6880g;
        if (str != null && str.trim().length() != 0 && gVar.f6893a.get(str) == null) {
            g.a aVar = new g.a((byte) 0);
            aVar.f6895a = System.currentTimeMillis();
            gVar.f6893a.put(str, aVar);
        }
    }

    @Override // com.efs.sdk.pa.PA
    public final void stop() {
        this.f6881h = false;
        this.f6875b.setMessageLogging(null);
        a aVar = this.f6878e;
        if (aVar != null) {
            aVar.f6854f = true;
            aVar.f6855g.removeCallbacksAndMessages(null);
            aVar.f6849a = true;
        }
    }

    @Override // com.efs.sdk.pa.PA
    public final void unRegisterPAMsgListener() {
        f fVar = this.f6877d;
        if (fVar != null) {
            fVar.f6889a = null;
        }
        e eVar = this.f6876c;
        if (eVar != null) {
            eVar.f6883a.remove(fVar);
        }
    }

    @Override // com.efs.sdk.pa.PA
    public final void unregisterPAANRListener() {
    }

    @Override // com.efs.sdk.pa.PA
    public final void registerPAANRListener(Context context, PAANRListener pAANRListener, long j5) {
        registerPAANRListener(context, pAANRListener, j5, Looper.getMainLooper().getThread());
    }

    @Override // com.efs.sdk.pa.PA
    public final void registerPAANRListener(Context context, PAANRListener pAANRListener, long j5, Thread thread) {
        if (this.f6878e == null) {
            if (thread != null) {
                this.f6878e = new a((Application) context.getApplicationContext(), j5);
            } else {
                this.f6878e = new a((Application) context.getApplicationContext(), j5, false);
            }
        }
        this.f6878e.f6856h = pAANRListener;
    }
}
