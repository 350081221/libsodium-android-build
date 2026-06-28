package com.huawei.agconnect.credential.obs;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.BackendService;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.hmf.tasks.Task;
import com.lody.virtual.helper.utils.ACache;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7878a = "AGCHost";

    /* renamed from: b, reason: collision with root package name */
    private static final l f7879b = new l();

    /* renamed from: c, reason: collision with root package name */
    private Map<String, List<s>> f7880c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private Map<String, s> f7881d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private AtomicBoolean f7882e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private String f7883f;

    /* renamed from: g, reason: collision with root package name */
    private HandlerThread f7884g;

    /* renamed from: h, reason: collision with root package name */
    private Handler f7885h;

    private l() {
        HandlerThread handlerThread = new HandlerThread("subThread");
        this.f7884g = handlerThread;
        handlerThread.start();
        this.f7885h = new Handler(this.f7884g.getLooper());
    }

    public static final l a() {
        return f7879b;
    }

    private String a(AGConnectInstance aGConnectInstance, List<ae> list) {
        for (ae aeVar : list) {
            if (aeVar.a().equalsIgnoreCase(aGConnectInstance.getOptions().getRoutePolicy().getRouteName())) {
                return aeVar.b();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i5, String str) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(13, i5);
        long time = calendar.getTime().getTime();
        s sVar = this.f7881d.get(str);
        if (sVar != null) {
            sVar.validTime = time;
        }
        Logger.i(f7878a, "updateTTL:" + time);
        s.a(str, time);
    }

    private void a(final AGConnectInstance aGConnectInstance, long j5) {
        if (this.f7882e.get() || !a(j5)) {
            return;
        }
        this.f7882e.set(true);
        this.f7885h.postDelayed(new Runnable() { // from class: com.huawei.agconnect.credential.obs.l.1
            @Override // java.lang.Runnable
            public void run() {
                Logger.i(l.f7878a, "getCachedHostAsync#start");
                ag agVar = new ag(aGConnectInstance);
                agVar.a(l.this.f7883f);
                BackendService.sendRequest(agVar, 1, ah.class, new BackendService.Options.Builder().app(aGConnectInstance).clientToken(false).build()).f(com.huawei.hmf.tasks.l.b(), new com.huawei.hmf.tasks.g<ah>() { // from class: com.huawei.agconnect.credential.obs.l.1.1
                    @Override // com.huawei.hmf.tasks.g
                    public void onComplete(Task<ah> task) {
                        int nextInt = new Random().nextInt(172801) + ACache.TIME_DAY;
                        Logger.i(l.f7878a, "default ttl=" + nextInt);
                        if (task.v()) {
                            ah r5 = task.r();
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            l.this.a(aGConnectInstance, r5);
                            try {
                                nextInt = Integer.parseInt(r5.d());
                            } catch (NumberFormatException unused) {
                                Logger.i(l.f7878a, "parse ttl failed, use default instead");
                            }
                        }
                        AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                        l.this.a(nextInt, aGConnectInstance.getIdentifier());
                    }
                });
            }
        }, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AGConnectInstance aGConnectInstance, ah ahVar) {
        String a5 = a(aGConnectInstance, ahVar.b());
        String a6 = a(aGConnectInstance, ahVar.c());
        Logger.d(f7878a, "cached main host:" + a5);
        Logger.d(f7878a, "cached backup host:" + a6);
        String identifier = aGConnectInstance.getIdentifier();
        if (TextUtils.isEmpty(a5) || TextUtils.isEmpty(a6)) {
            this.f7881d.remove(identifier);
            s.c(identifier);
        } else {
            s sVar = new s(a5, a6);
            this.f7881d.put(identifier, sVar);
            sVar.a(identifier);
        }
    }

    private boolean a(long j5) {
        return Calendar.getInstance().getTime().after(new Date(j5));
    }

    private s b(String str) {
        return s.b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<s> a(AGConnectInstance aGConnectInstance) {
        long j5;
        List<s> asList;
        List<s> list;
        long j6;
        String identifier = aGConnectInstance.getIdentifier();
        if (this.f7880c.containsKey(identifier)) {
            list = this.f7880c.get(identifier);
            j6 = 0;
        } else {
            s sVar = new s(aGConnectInstance.getOptions().getString("agcgw/url"), aGConnectInstance.getOptions().getString("agcgw/backurl"));
            s sVar2 = this.f7881d.get(identifier);
            if (sVar2 != null) {
                j5 = sVar2.validTime;
                asList = Arrays.asList(sVar2, sVar);
            } else {
                s b5 = b(identifier);
                j5 = b5.validTime;
                if (b5.g()) {
                    this.f7881d.put(identifier, b5);
                    asList = Arrays.asList(b5, sVar);
                } else {
                    asList = Collections.singletonList(sVar);
                }
            }
            this.f7880c.put(identifier, asList);
            list = asList;
            j6 = j5;
        }
        a(aGConnectInstance, j6);
        return list;
    }

    public void a(String str) {
        if ("agconnect-credential".equals(str)) {
            return;
        }
        this.f7883f = str;
    }
}
