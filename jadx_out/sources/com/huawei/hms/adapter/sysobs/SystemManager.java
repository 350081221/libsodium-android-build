package com.huawei.hms.adapter.sysobs;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class SystemManager {

    /* renamed from: a, reason: collision with root package name */
    public static SystemManager f8124a = new SystemManager();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f8125b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static SystemNotifier f8126c = new a();

    public static SystemManager getInstance() {
        return f8124a;
    }

    public static SystemNotifier getSystemNotifier() {
        return f8126c;
    }

    public void notifyNoticeResult(int i5) {
        f8126c.notifyNoticeObservers(i5);
    }

    public void notifyResolutionResult(Intent intent, String str) {
        f8126c.notifyObservers(intent, str);
    }

    public void notifyUpdateResult(int i5) {
        f8126c.notifyObservers(i5);
    }

    /* loaded from: classes3.dex */
    public static class a implements SystemNotifier {

        /* renamed from: a, reason: collision with root package name */
        public final List<SystemObserver> f8127a = new ArrayList();

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyNoticeObservers(int i5) {
            synchronized (SystemManager.f8125b) {
                Iterator<SystemObserver> it = this.f8127a.iterator();
                while (it.hasNext()) {
                    if (it.next().onNoticeResult(i5)) {
                        it.remove();
                    }
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(Intent intent, String str) {
            synchronized (SystemManager.f8125b) {
                Iterator<SystemObserver> it = this.f8127a.iterator();
                while (it.hasNext()) {
                    if (it.next().onSolutionResult(intent, str)) {
                        it.remove();
                    }
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void registerObserver(SystemObserver systemObserver) {
            if (systemObserver != null && !this.f8127a.contains(systemObserver)) {
                synchronized (SystemManager.f8125b) {
                    this.f8127a.add(systemObserver);
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void unRegisterObserver(SystemObserver systemObserver) {
            synchronized (SystemManager.f8125b) {
                this.f8127a.remove(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(int i5) {
            synchronized (SystemManager.f8125b) {
                Iterator<SystemObserver> it = this.f8127a.iterator();
                while (it.hasNext()) {
                    if (it.next().onUpdateResult(i5)) {
                        it.remove();
                    }
                }
            }
        }
    }
}
