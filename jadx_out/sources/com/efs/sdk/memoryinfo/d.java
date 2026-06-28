package com.efs.sdk.memoryinfo;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/* loaded from: classes2.dex */
final class d implements UMMemoryMonitorApi {
    private boolean A;

    /* renamed from: u, reason: collision with root package name */
    private boolean f6732u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f6733v = true;

    /* renamed from: w, reason: collision with root package name */
    private b f6734w;

    /* renamed from: x, reason: collision with root package name */
    private WeakReference<Activity> f6735x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f6736y;

    /* renamed from: z, reason: collision with root package name */
    private int f6737z;

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final String getCurrentActivity() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f6735x;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            return "";
        }
        return activity.getClass().getName();
    }

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final boolean isEnable() {
        b bVar;
        if (!this.f6733v || (bVar = this.f6734w) == null || !bVar.f6710b) {
            return false;
        }
        return true;
    }

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final boolean isForeground() {
        return this.f6736y;
    }

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final void onActivityResumed(Activity activity) {
        if (!this.f6733v) {
            return;
        }
        this.f6735x = new WeakReference<>(activity);
    }

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final void onActivityStarted(Activity activity) {
        if (!this.f6733v || activity == null) {
            return;
        }
        if (this.A) {
            this.A = false;
            return;
        }
        int i5 = this.f6737z + 1;
        this.f6737z = i5;
        if (i5 == 1) {
            this.f6736y = true;
        }
    }

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final void onActivityStopped(Activity activity) {
        if (!this.f6733v || activity == null) {
            return;
        }
        if (activity.isChangingConfigurations()) {
            this.A = true;
            return;
        }
        int i5 = this.f6737z - 1;
        this.f6737z = i5;
        if (i5 == 0) {
            this.f6736y = false;
        }
    }

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final void setEnable(boolean z4) {
        this.f6733v = z4;
    }

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final void start(Context context, EfsReporter efsReporter) {
        if ((!this.f6733v && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) || this.f6732u) {
            return;
        }
        this.f6732u = true;
        final b bVar = new b(context, efsReporter);
        this.f6734w = bVar;
        bVar.f6709a.getAllSdkConfig(new String[]{"apm_memperf_sampling_rate", "apm_memperf_collect_interval", "apm_memperf_collect_max_period_sec"}, new IConfigCallback() { // from class: com.efs.sdk.memoryinfo.b.1

            /* renamed from: com.efs.sdk.memoryinfo.b$1$1 */
            /* loaded from: classes2.dex */
            final class HandlerC01431 extends Handler {

                /* renamed from: d */
                final /* synthetic */ HandlerThread f6712d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                HandlerC01431(Looper looper, HandlerThread handlerThread) {
                    super(looper);
                    r3 = handlerThread;
                }

                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    super.handleMessage(message);
                    if (message.what == 1) {
                        try {
                            r3.quit();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }

            /* renamed from: com.efs.sdk.memoryinfo.b$1$2 */
            /* loaded from: classes2.dex */
            final class AnonymousClass2 implements Runnable {

                /* renamed from: f */
                final /* synthetic */ Handler f6715f;

                /* renamed from: g */
                final /* synthetic */ int f6716g;

                /* renamed from: h */
                final /* synthetic */ int f6717h;

                AnonymousClass2(Handler handler, int i5, int i6) {
                    r2 = handler;
                    r3 = i5;
                    r4 = i6;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        String uuid = UUID.randomUUID().toString();
                        String lowerCase = UMUtils.MD5(Process.myPid() + uuid).toLowerCase();
                        b bVar = b.this;
                        Handler handler = r2;
                        handler.post(new Runnable() { // from class: com.efs.sdk.memoryinfo.b.2

                            /* renamed from: f */
                            final /* synthetic */ Handler f6719f;

                            /* renamed from: i */
                            final /* synthetic */ long f6720i;

                            /* renamed from: j */
                            final /* synthetic */ int f6721j;

                            /* renamed from: k */
                            final /* synthetic */ e f6722k;

                            /* renamed from: l */
                            final /* synthetic */ String f6723l;

                            /* renamed from: m */
                            final /* synthetic */ int f6724m;

                            AnonymousClass2(long j5, int i5, Handler handler2, e eVar, String lowerCase2, int i6) {
                                r2 = j5;
                                r4 = i5;
                                r5 = handler2;
                                r6 = eVar;
                                r7 = lowerCase2;
                                r8 = i6;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                if (SystemClock.elapsedRealtime() - r2 > r4 * 1000) {
                                    r5.sendEmptyMessage(1);
                                    return;
                                }
                                try {
                                    b.a(b.this, r6, r7);
                                } catch (Throwable th) {
                                    f.a("collect ", th);
                                }
                                r5.postDelayed(this, r8 * 1000);
                            }
                        });
                    } catch (Throwable unused) {
                        r2.sendEmptyMessage(1);
                    }
                }
            }

            public AnonymousClass1() {
            }

            @Override // com.efs.sdk.base.observer.IConfigCallback
            public final void onChange(Map<String, Object> map) {
                Object obj;
                boolean z4;
                Object obj2;
                Object obj3;
                try {
                    if (b.this.f6710b || (obj = map.get("apm_memperf_sampling_rate")) == null) {
                        return;
                    }
                    int parseInt = Integer.parseInt(obj.toString());
                    if (parseInt == 0 || (parseInt != 100 && !SamplingWhiteListUtil.isHitWL() && new Random().nextInt(100) > parseInt)) {
                        z4 = false;
                        if ((z4 && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) || (obj2 = map.get("apm_memperf_collect_interval")) == null || (obj3 = map.get("apm_memperf_collect_max_period_sec")) == null) {
                            return;
                        }
                        int parseInt2 = Integer.parseInt(obj2.toString());
                        int parseInt3 = Integer.parseInt(obj3.toString());
                        HandlerThread handlerThread = new HandlerThread("mem-info");
                        handlerThread.start();
                        HandlerC01431 handlerC01431 = new Handler(handlerThread.getLooper()) { // from class: com.efs.sdk.memoryinfo.b.1.1

                            /* renamed from: d */
                            final /* synthetic */ HandlerThread f6712d;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            HandlerC01431(Looper looper, HandlerThread handlerThread2) {
                                super(looper);
                                r3 = handlerThread2;
                            }

                            @Override // android.os.Handler
                            public final void handleMessage(Message message) {
                                super.handleMessage(message);
                                if (message.what == 1) {
                                    try {
                                        r3.quit();
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        };
                        handlerC01431.post(new Runnable() { // from class: com.efs.sdk.memoryinfo.b.1.2

                            /* renamed from: f */
                            final /* synthetic */ Handler f6715f;

                            /* renamed from: g */
                            final /* synthetic */ int f6716g;

                            /* renamed from: h */
                            final /* synthetic */ int f6717h;

                            AnonymousClass2(Handler handlerC014312, int parseInt22, int parseInt32) {
                                r2 = handlerC014312;
                                r3 = parseInt22;
                                r4 = parseInt32;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    String uuid = UUID.randomUUID().toString();
                                    String lowerCase2 = UMUtils.MD5(Process.myPid() + uuid).toLowerCase();
                                    b bVar2 = b.this;
                                    Handler handler2 = r2;
                                    handler2.post(new Runnable() { // from class: com.efs.sdk.memoryinfo.b.2

                                        /* renamed from: f */
                                        final /* synthetic */ Handler f6719f;

                                        /* renamed from: i */
                                        final /* synthetic */ long f6720i;

                                        /* renamed from: j */
                                        final /* synthetic */ int f6721j;

                                        /* renamed from: k */
                                        final /* synthetic */ e f6722k;

                                        /* renamed from: l */
                                        final /* synthetic */ String f6723l;

                                        /* renamed from: m */
                                        final /* synthetic */ int f6724m;

                                        AnonymousClass2(long j5, int i5, Handler handler22, e eVar, String lowerCase22, int i6) {
                                            r2 = j5;
                                            r4 = i5;
                                            r5 = handler22;
                                            r6 = eVar;
                                            r7 = lowerCase22;
                                            r8 = i6;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            if (SystemClock.elapsedRealtime() - r2 > r4 * 1000) {
                                                r5.sendEmptyMessage(1);
                                                return;
                                            }
                                            try {
                                                b.a(b.this, r6, r7);
                                            } catch (Throwable th) {
                                                f.a("collect ", th);
                                            }
                                            r5.postDelayed(this, r8 * 1000);
                                        }
                                    });
                                } catch (Throwable unused) {
                                    r2.sendEmptyMessage(1);
                                }
                            }
                        });
                        b.this.f6710b = true;
                    }
                    z4 = true;
                    if (z4) {
                    }
                    int parseInt22 = Integer.parseInt(obj2.toString());
                    int parseInt32 = Integer.parseInt(obj3.toString());
                    HandlerThread handlerThread2 = new HandlerThread("mem-info");
                    handlerThread2.start();
                    Handler handlerC014312 = new Handler(handlerThread2.getLooper()) { // from class: com.efs.sdk.memoryinfo.b.1.1

                        /* renamed from: d */
                        final /* synthetic */ HandlerThread f6712d;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        HandlerC01431(Looper looper, HandlerThread handlerThread22) {
                            super(looper);
                            r3 = handlerThread22;
                        }

                        @Override // android.os.Handler
                        public final void handleMessage(Message message) {
                            super.handleMessage(message);
                            if (message.what == 1) {
                                try {
                                    r3.quit();
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    };
                    handlerC014312.post(new Runnable() { // from class: com.efs.sdk.memoryinfo.b.1.2

                        /* renamed from: f */
                        final /* synthetic */ Handler f6715f;

                        /* renamed from: g */
                        final /* synthetic */ int f6716g;

                        /* renamed from: h */
                        final /* synthetic */ int f6717h;

                        AnonymousClass2(Handler handlerC0143122, int parseInt222, int parseInt322) {
                            r2 = handlerC0143122;
                            r3 = parseInt222;
                            r4 = parseInt322;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                String uuid = UUID.randomUUID().toString();
                                String lowerCase22 = UMUtils.MD5(Process.myPid() + uuid).toLowerCase();
                                b bVar2 = b.this;
                                Handler handler22 = r2;
                                handler22.post(new Runnable() { // from class: com.efs.sdk.memoryinfo.b.2

                                    /* renamed from: f */
                                    final /* synthetic */ Handler f6719f;

                                    /* renamed from: i */
                                    final /* synthetic */ long f6720i;

                                    /* renamed from: j */
                                    final /* synthetic */ int f6721j;

                                    /* renamed from: k */
                                    final /* synthetic */ e f6722k;

                                    /* renamed from: l */
                                    final /* synthetic */ String f6723l;

                                    /* renamed from: m */
                                    final /* synthetic */ int f6724m;

                                    AnonymousClass2(long j5, int i5, Handler handler222, e eVar, String lowerCase222, int i6) {
                                        r2 = j5;
                                        r4 = i5;
                                        r5 = handler222;
                                        r6 = eVar;
                                        r7 = lowerCase222;
                                        r8 = i6;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        if (SystemClock.elapsedRealtime() - r2 > r4 * 1000) {
                                            r5.sendEmptyMessage(1);
                                            return;
                                        }
                                        try {
                                            b.a(b.this, r6, r7);
                                        } catch (Throwable th) {
                                            f.a("collect ", th);
                                        }
                                        r5.postDelayed(this, r8 * 1000);
                                    }
                                });
                            } catch (Throwable unused) {
                                r2.sendEmptyMessage(1);
                            }
                        }
                    });
                    b.this.f6710b = true;
                } catch (Throwable th) {
                    f.a("collect ", th);
                }
            }
        });
    }
}
