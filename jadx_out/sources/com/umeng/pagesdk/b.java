package com.umeng.pagesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f13547a = false;

    /* renamed from: b, reason: collision with root package name */
    private static Context f13548b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0253b f13549c;

    /* renamed from: d, reason: collision with root package name */
    private BroadcastReceiver f13550d;

    /* loaded from: classes3.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f13552a = new b(0);
    }

    /* renamed from: com.umeng.pagesdk.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0253b {
        void a(com.umeng.pagesdk.a aVar);
    }

    private b() {
        this.f13550d = new BroadcastReceiver() { // from class: com.umeng.pagesdk.b.1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                try {
                    if (intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
                        int i5 = 0;
                        int intExtra = intent.getIntExtra("level", 0);
                        int intExtra2 = intent.getIntExtra("voltage", 0);
                        int intExtra3 = intent.getIntExtra("temperature", 0);
                        int intExtra4 = intent.getIntExtra("status", 0);
                        int i6 = -1;
                        if (intExtra4 != 1) {
                            if (intExtra4 == 2) {
                                i6 = 1;
                            } else if (intExtra4 == 4) {
                                i6 = 0;
                            } else if (intExtra4 == 5) {
                                i6 = 2;
                            }
                        }
                        int intExtra5 = intent.getIntExtra("plugged", 0);
                        if (intExtra5 == 1) {
                            i5 = 1;
                        } else if (intExtra5 == 2) {
                            i5 = 2;
                        }
                        com.umeng.pagesdk.a aVar = new com.umeng.pagesdk.a();
                        aVar.f13541a = intExtra;
                        aVar.f13542b = intExtra2;
                        aVar.f13544d = i6;
                        aVar.f13543c = intExtra3;
                        aVar.f13545e = i5;
                        aVar.f13546f = System.currentTimeMillis();
                        if (b.this.f13549c != null) {
                            b.this.f13549c.a(aVar);
                        }
                        b.this.b();
                    }
                } catch (Throwable unused) {
                }
            }
        };
    }

    /* synthetic */ b(byte b5) {
        this();
    }

    public static b a(Context context) {
        if (f13548b == null && context != null) {
            f13548b = context.getApplicationContext();
        }
        return a.f13552a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b() {
        try {
            f13548b.unregisterReceiver(this.f13550d);
            f13547a = false;
        } catch (Throwable unused) {
        }
    }

    public final synchronized com.umeng.pagesdk.a a() {
        com.umeng.pagesdk.a aVar;
        int i5;
        int intExtra;
        int intExtra2;
        int intExtra3;
        int i6;
        com.umeng.pagesdk.a aVar2 = null;
        try {
            Intent registerReceiver = f13548b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            i5 = 0;
            intExtra = registerReceiver.getIntExtra("level", 0);
            intExtra2 = registerReceiver.getIntExtra("voltage", 0);
            intExtra3 = registerReceiver.getIntExtra("temperature", 0);
            int intExtra4 = registerReceiver.getIntExtra("status", 0);
            i6 = -1;
            if (intExtra4 != 1) {
                if (intExtra4 == 2) {
                    i6 = 1;
                } else if (intExtra4 == 4) {
                    i6 = 0;
                } else if (intExtra4 == 5) {
                    i6 = 2;
                }
            }
            int intExtra5 = registerReceiver.getIntExtra("plugged", 0);
            if (intExtra5 == 1) {
                i5 = 1;
            } else if (intExtra5 == 2) {
                i5 = 2;
            }
            aVar = new com.umeng.pagesdk.a();
        } catch (Throwable unused) {
        }
        try {
            aVar.f13541a = intExtra;
            aVar.f13542b = intExtra2;
            aVar.f13544d = i6;
            aVar.f13543c = intExtra3;
            aVar.f13545e = i5;
            aVar.f13546f = System.currentTimeMillis();
        } catch (Throwable unused2) {
            aVar2 = aVar;
            aVar = aVar2;
            return aVar;
        }
        return aVar;
    }

    public final synchronized void a(InterfaceC0253b interfaceC0253b) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            f13548b.registerReceiver(this.f13550d, intentFilter);
            f13547a = true;
            this.f13549c = interfaceC0253b;
        } catch (Throwable unused) {
        }
    }
}
