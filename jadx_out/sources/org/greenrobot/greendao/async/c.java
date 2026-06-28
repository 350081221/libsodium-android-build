package org.greenrobot.greendao.async;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.greenrobot.greendao.async.b;
import org.greenrobot.greendao.query.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class c implements Runnable, Handler.Callback {

    /* renamed from: k, reason: collision with root package name */
    private static ExecutorService f21327k = Executors.newCachedThreadPool();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f21329b;

    /* renamed from: d, reason: collision with root package name */
    private volatile d f21331d;

    /* renamed from: e, reason: collision with root package name */
    private volatile d f21332e;

    /* renamed from: g, reason: collision with root package name */
    private int f21334g;

    /* renamed from: h, reason: collision with root package name */
    private int f21335h;

    /* renamed from: i, reason: collision with root package name */
    private Handler f21336i;

    /* renamed from: j, reason: collision with root package name */
    private int f21337j;

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<b> f21328a = new LinkedBlockingQueue();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f21330c = 50;

    /* renamed from: f, reason: collision with root package name */
    private volatile int f21333f = 50;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21338a;

        static {
            int[] iArr = new int[b.a.values().length];
            f21338a = iArr;
            try {
                iArr[b.a.Delete.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21338a[b.a.DeleteInTxIterable.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21338a[b.a.DeleteInTxArray.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21338a[b.a.Insert.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21338a[b.a.InsertInTxIterable.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21338a[b.a.InsertInTxArray.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21338a[b.a.InsertOrReplace.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21338a[b.a.InsertOrReplaceInTxIterable.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21338a[b.a.InsertOrReplaceInTxArray.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21338a[b.a.Update.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21338a[b.a.UpdateInTxIterable.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21338a[b.a.UpdateInTxArray.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21338a[b.a.TransactionRunnable.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21338a[b.a.TransactionCallable.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21338a[b.a.QueryList.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21338a[b.a.QueryUnique.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21338a[b.a.DeleteByKey.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f21338a[b.a.DeleteAll.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f21338a[b.a.Load.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f21338a[b.a.LoadAll.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f21338a[b.a.Count.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f21338a[b.a.Refresh.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    private void b(b bVar) {
        bVar.f21319f = System.currentTimeMillis();
        try {
            switch (a.f21338a[bVar.f21314a.ordinal()]) {
                case 1:
                    bVar.f21315b.delete(bVar.f21317d);
                    break;
                case 2:
                    bVar.f21315b.deleteInTx((Iterable<Object>) bVar.f21317d);
                    break;
                case 3:
                    bVar.f21315b.deleteInTx((Object[]) bVar.f21317d);
                    break;
                case 4:
                    bVar.f21315b.insert(bVar.f21317d);
                    break;
                case 5:
                    bVar.f21315b.insertInTx((Iterable<Object>) bVar.f21317d);
                    break;
                case 6:
                    bVar.f21315b.insertInTx((Object[]) bVar.f21317d);
                    break;
                case 7:
                    bVar.f21315b.insertOrReplace(bVar.f21317d);
                    break;
                case 8:
                    bVar.f21315b.insertOrReplaceInTx((Iterable<Object>) bVar.f21317d);
                    break;
                case 9:
                    bVar.f21315b.insertOrReplaceInTx((Object[]) bVar.f21317d);
                    break;
                case 10:
                    bVar.f21315b.update(bVar.f21317d);
                    break;
                case 11:
                    bVar.f21315b.updateInTx((Iterable<Object>) bVar.f21317d);
                    break;
                case 12:
                    bVar.f21315b.updateInTx((Object[]) bVar.f21317d);
                    break;
                case 13:
                    e(bVar);
                    break;
                case 14:
                    d(bVar);
                    break;
                case 15:
                    bVar.f21324k = ((j) bVar.f21317d).l().n();
                    break;
                case 16:
                    bVar.f21324k = ((j) bVar.f21317d).l().u();
                    break;
                case 17:
                    bVar.f21315b.deleteByKey(bVar.f21317d);
                    break;
                case 18:
                    bVar.f21315b.deleteAll();
                    break;
                case 19:
                    bVar.f21324k = bVar.f21315b.load(bVar.f21317d);
                    break;
                case 20:
                    bVar.f21324k = bVar.f21315b.loadAll();
                    break;
                case 21:
                    bVar.f21324k = Long.valueOf(bVar.f21315b.count());
                    break;
                case 22:
                    bVar.f21315b.refresh(bVar.f21317d);
                    break;
                default:
                    throw new org.greenrobot.greendao.d("Unsupported operation: " + bVar.f21314a);
            }
        } catch (Throwable th) {
            bVar.f21322i = th;
        }
        bVar.f21320g = System.currentTimeMillis();
    }

    private void c(b bVar) {
        b(bVar);
        j(bVar);
    }

    private void d(b bVar) throws Exception {
        org.greenrobot.greendao.database.a b5 = bVar.b();
        b5.beginTransaction();
        try {
            bVar.f21324k = ((Callable) bVar.f21317d).call();
            b5.setTransactionSuccessful();
        } finally {
            b5.endTransaction();
        }
    }

    private void e(b bVar) {
        org.greenrobot.greendao.database.a b5 = bVar.b();
        b5.beginTransaction();
        try {
            ((Runnable) bVar.f21317d).run();
            b5.setTransactionSuccessful();
        } finally {
            b5.endTransaction();
        }
    }

    private void j(b bVar) {
        bVar.r();
        d dVar = this.f21331d;
        if (dVar != null) {
            dVar.a(bVar);
        }
        if (this.f21332e != null) {
            if (this.f21336i == null) {
                this.f21336i = new Handler(Looper.getMainLooper(), this);
            }
            this.f21336i.sendMessage(this.f21336i.obtainMessage(1, bVar));
        }
        synchronized (this) {
            int i5 = this.f21335h + 1;
            this.f21335h = i5;
            if (i5 == this.f21334g) {
                notifyAll();
            }
        }
    }

    private void l(b bVar, b bVar2) {
        boolean z4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        arrayList.add(bVar2);
        org.greenrobot.greendao.database.a b5 = bVar.b();
        b5.beginTransaction();
        boolean z5 = false;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            try {
                b bVar3 = (b) arrayList.get(i5);
                b(bVar3);
                if (bVar3.n()) {
                    break;
                }
                z4 = true;
                if (i5 == arrayList.size() - 1) {
                    b peek = this.f21328a.peek();
                    if (i5 < this.f21330c && bVar3.p(peek)) {
                        b remove = this.f21328a.remove();
                        if (remove == peek) {
                            arrayList.add(remove);
                        } else {
                            throw new org.greenrobot.greendao.d("Internal error: peeked op did not match removed op");
                        }
                    } else {
                        b5.setTransactionSuccessful();
                        break;
                    }
                }
            } catch (Throwable th) {
                try {
                    b5.endTransaction();
                } catch (RuntimeException e5) {
                    org.greenrobot.greendao.e.g("Async transaction could not be ended, success so far was: false", e5);
                }
                throw th;
            }
        }
        z4 = false;
        try {
            b5.endTransaction();
            z5 = z4;
        } catch (RuntimeException e6) {
            org.greenrobot.greendao.e.g("Async transaction could not be ended, success so far was: " + z4, e6);
        }
        if (z5) {
            int size = arrayList.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b bVar4 = (b) it.next();
                bVar4.f21325l = size;
                j(bVar4);
            }
            return;
        }
        org.greenrobot.greendao.e.f("Reverted merged transaction because one of the operations failed. Executing operations one by one instead...");
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            b bVar5 = (b) it2.next();
            bVar5.q();
            c(bVar5);
        }
    }

    public void a(b bVar) {
        synchronized (this) {
            int i5 = this.f21337j + 1;
            this.f21337j = i5;
            bVar.f21326m = i5;
            this.f21328a.add(bVar);
            this.f21334g++;
            if (!this.f21329b) {
                this.f21329b = true;
                f21327k.execute(this);
            }
        }
    }

    public d f() {
        return this.f21331d;
    }

    public d g() {
        return this.f21332e;
    }

    public int h() {
        return this.f21330c;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        d dVar = this.f21332e;
        if (dVar != null) {
            dVar.a((b) message.obj);
            return false;
        }
        return false;
    }

    public int i() {
        return this.f21333f;
    }

    public synchronized boolean k() {
        boolean z4;
        if (this.f21334g == this.f21335h) {
            z4 = true;
        } else {
            z4 = false;
        }
        return z4;
    }

    public void m(d dVar) {
        this.f21331d = dVar;
    }

    public void n(d dVar) {
        this.f21332e = dVar;
    }

    public void o(int i5) {
        this.f21330c = i5;
    }

    public void p(int i5) {
        this.f21333f = i5;
    }

    public synchronized void q() {
        while (!k()) {
            try {
                wait();
            } catch (InterruptedException e5) {
                throw new org.greenrobot.greendao.d("Interrupted while waiting for all operations to complete", e5);
            }
        }
    }

    public synchronized boolean r(int i5) {
        if (!k()) {
            try {
                wait(i5);
            } catch (InterruptedException e5) {
                throw new org.greenrobot.greendao.d("Interrupted while waiting for all operations to complete", e5);
            }
        }
        return k();
    }

    @Override // java.lang.Runnable
    public void run() {
        b poll;
        while (true) {
            try {
                b poll2 = this.f21328a.poll(1L, TimeUnit.SECONDS);
                if (poll2 == null) {
                    synchronized (this) {
                        poll2 = this.f21328a.poll();
                        if (poll2 == null) {
                            return;
                        }
                    }
                }
                if (poll2.o() && (poll = this.f21328a.poll(this.f21333f, TimeUnit.MILLISECONDS)) != null) {
                    if (poll2.p(poll)) {
                        l(poll2, poll);
                    } else {
                        c(poll2);
                        c(poll);
                    }
                } else {
                    c(poll2);
                }
            } catch (InterruptedException e5) {
                org.greenrobot.greendao.e.m(Thread.currentThread().getName() + " was interruppted", e5);
                return;
            } finally {
                this.f21329b = false;
            }
        }
    }
}
