package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.InvalidationTracker;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010B\u001a\u00020\u0013\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bE\u0010FJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00102\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u00107\u001a\u0002068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010<\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\bA\u0010?¨\u0006G"}, d2 = {"Landroidx/room/MultiInstanceInvalidationClient;", "", "Lkotlin/r2;", "stop", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Landroidx/room/InvalidationTracker;", "invalidationTracker", "Landroidx/room/InvalidationTracker;", "getInvalidationTracker", "()Landroidx/room/InvalidationTracker;", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "appContext", "Landroid/content/Context;", "", "clientId", "I", "getClientId", "()I", "setClientId", "(I)V", "Landroidx/room/InvalidationTracker$Observer;", "observer", "Landroidx/room/InvalidationTracker$Observer;", "getObserver", "()Landroidx/room/InvalidationTracker$Observer;", "setObserver", "(Landroidx/room/InvalidationTracker$Observer;)V", "Landroidx/room/IMultiInstanceInvalidationService;", "service", "Landroidx/room/IMultiInstanceInvalidationService;", "getService", "()Landroidx/room/IMultiInstanceInvalidationService;", "setService", "(Landroidx/room/IMultiInstanceInvalidationService;)V", "Landroidx/room/IMultiInstanceInvalidationCallback;", "callback", "Landroidx/room/IMultiInstanceInvalidationCallback;", "getCallback", "()Landroidx/room/IMultiInstanceInvalidationCallback;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "stopped", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getStopped", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroid/content/ServiceConnection;", "serviceConnection", "Landroid/content/ServiceConnection;", "getServiceConnection", "()Landroid/content/ServiceConnection;", "Ljava/lang/Runnable;", "setUpRunnable", "Ljava/lang/Runnable;", "getSetUpRunnable", "()Ljava/lang/Runnable;", "removeObserverRunnable", "getRemoveObserverRunnable", com.umeng.analytics.pro.d.X, "Landroid/content/Intent;", "serviceIntent", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroidx/room/InvalidationTracker;Ljava/util/concurrent/Executor;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nMultiInstanceInvalidationClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiInstanceInvalidationClient.kt\nandroidx/room/MultiInstanceInvalidationClient\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,130:1\n37#2,2:131\n*S KotlinDebug\n*F\n+ 1 MultiInstanceInvalidationClient.kt\nandroidx/room/MultiInstanceInvalidationClient\n*L\n95#1:131,2\n*E\n"})
/* loaded from: classes2.dex */
public final class MultiInstanceInvalidationClient {
    private final Context appContext;

    @p4.l
    private final IMultiInstanceInvalidationCallback callback;
    private int clientId;

    @p4.l
    private final Executor executor;

    @p4.l
    private final InvalidationTracker invalidationTracker;

    @p4.l
    private final String name;
    public InvalidationTracker.Observer observer;

    @p4.l
    private final Runnable removeObserverRunnable;

    @p4.m
    private IMultiInstanceInvalidationService service;

    @p4.l
    private final ServiceConnection serviceConnection;

    @p4.l
    private final Runnable setUpRunnable;

    @p4.l
    private final AtomicBoolean stopped;

    public MultiInstanceInvalidationClient(@p4.l Context context, @p4.l String name, @p4.l Intent serviceIntent, @p4.l InvalidationTracker invalidationTracker, @p4.l Executor executor) {
        l0.p(context, "context");
        l0.p(name, "name");
        l0.p(serviceIntent, "serviceIntent");
        l0.p(invalidationTracker, "invalidationTracker");
        l0.p(executor, "executor");
        this.name = name;
        this.invalidationTracker = invalidationTracker;
        this.executor = executor;
        Context applicationContext = context.getApplicationContext();
        this.appContext = applicationContext;
        this.callback = new MultiInstanceInvalidationClient$callback$1(this);
        this.stopped = new AtomicBoolean(false);
        ServiceConnection serviceConnection = new ServiceConnection() { // from class: androidx.room.MultiInstanceInvalidationClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(@p4.l ComponentName name2, @p4.l IBinder service) {
                l0.p(name2, "name");
                l0.p(service, "service");
                MultiInstanceInvalidationClient.this.setService(IMultiInstanceInvalidationService.Stub.asInterface(service));
                MultiInstanceInvalidationClient.this.getExecutor().execute(MultiInstanceInvalidationClient.this.getSetUpRunnable());
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(@p4.l ComponentName name2) {
                l0.p(name2, "name");
                MultiInstanceInvalidationClient.this.getExecutor().execute(MultiInstanceInvalidationClient.this.getRemoveObserverRunnable());
                MultiInstanceInvalidationClient.this.setService(null);
            }
        };
        this.serviceConnection = serviceConnection;
        this.setUpRunnable = new Runnable() { // from class: androidx.room.d
            @Override // java.lang.Runnable
            public final void run() {
                MultiInstanceInvalidationClient.setUpRunnable$lambda$1(MultiInstanceInvalidationClient.this);
            }
        };
        this.removeObserverRunnable = new Runnable() { // from class: androidx.room.e
            @Override // java.lang.Runnable
            public final void run() {
                MultiInstanceInvalidationClient.removeObserverRunnable$lambda$2(MultiInstanceInvalidationClient.this);
            }
        };
        setObserver(new InvalidationTracker.Observer((String[]) invalidationTracker.getTableIdLookup$room_runtime_release().keySet().toArray(new String[0])) { // from class: androidx.room.MultiInstanceInvalidationClient.1
            @Override // androidx.room.InvalidationTracker.Observer
            public boolean isRemote$room_runtime_release() {
                return true;
            }

            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(@p4.l Set<String> tables) {
                l0.p(tables, "tables");
                if (MultiInstanceInvalidationClient.this.getStopped().get()) {
                    return;
                }
                try {
                    IMultiInstanceInvalidationService service = MultiInstanceInvalidationClient.this.getService();
                    if (service != null) {
                        service.broadcastInvalidation(MultiInstanceInvalidationClient.this.getClientId(), (String[]) tables.toArray(new String[0]));
                    }
                } catch (RemoteException e5) {
                    Log.w(Room.LOG_TAG, "Cannot broadcast invalidation", e5);
                }
            }
        });
        applicationContext.bindService(serviceIntent, serviceConnection, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeObserverRunnable$lambda$2(MultiInstanceInvalidationClient this$0) {
        l0.p(this$0, "this$0");
        this$0.invalidationTracker.removeObserver(this$0.getObserver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpRunnable$lambda$1(MultiInstanceInvalidationClient this$0) {
        l0.p(this$0, "this$0");
        try {
            IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this$0.service;
            if (iMultiInstanceInvalidationService != null) {
                this$0.clientId = iMultiInstanceInvalidationService.registerCallback(this$0.callback, this$0.name);
                this$0.invalidationTracker.addObserver(this$0.getObserver());
            }
        } catch (RemoteException e5) {
            Log.w(Room.LOG_TAG, "Cannot register multi-instance invalidation callback", e5);
        }
    }

    @p4.l
    public final IMultiInstanceInvalidationCallback getCallback() {
        return this.callback;
    }

    public final int getClientId() {
        return this.clientId;
    }

    @p4.l
    public final Executor getExecutor() {
        return this.executor;
    }

    @p4.l
    public final InvalidationTracker getInvalidationTracker() {
        return this.invalidationTracker;
    }

    @p4.l
    public final String getName() {
        return this.name;
    }

    @p4.l
    public final InvalidationTracker.Observer getObserver() {
        InvalidationTracker.Observer observer = this.observer;
        if (observer != null) {
            return observer;
        }
        l0.S("observer");
        return null;
    }

    @p4.l
    public final Runnable getRemoveObserverRunnable() {
        return this.removeObserverRunnable;
    }

    @p4.m
    public final IMultiInstanceInvalidationService getService() {
        return this.service;
    }

    @p4.l
    public final ServiceConnection getServiceConnection() {
        return this.serviceConnection;
    }

    @p4.l
    public final Runnable getSetUpRunnable() {
        return this.setUpRunnable;
    }

    @p4.l
    public final AtomicBoolean getStopped() {
        return this.stopped;
    }

    public final void setClientId(int i5) {
        this.clientId = i5;
    }

    public final void setObserver(@p4.l InvalidationTracker.Observer observer) {
        l0.p(observer, "<set-?>");
        this.observer = observer;
    }

    public final void setService(@p4.m IMultiInstanceInvalidationService iMultiInstanceInvalidationService) {
        this.service = iMultiInstanceInvalidationService;
    }

    public final void stop() {
        if (this.stopped.compareAndSet(false, true)) {
            this.invalidationTracker.removeObserver(getObserver());
            try {
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this.service;
                if (iMultiInstanceInvalidationService != null) {
                    iMultiInstanceInvalidationService.unregisterCallback(this.callback, this.clientId);
                }
            } catch (RemoteException e5) {
                Log.w(Room.LOG_TAG, "Cannot unregister multi-instance invalidation callback", e5);
            }
            this.appContext.unbindService(this.serviceConnection);
        }
    }
}
