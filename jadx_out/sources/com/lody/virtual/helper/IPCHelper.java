package com.lody.virtual.helper;

import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class IPCHelper<S extends IInterface> {
    private S mInterface;

    /* loaded from: classes3.dex */
    public interface Callable<S, R> {
        R call(S s5) throws RemoteException;
    }

    /* loaded from: classes3.dex */
    public interface CallableVoid<S> {
        void call(S s5) throws RemoteException;
    }

    public <R> R call(Callable<S, R> callable) {
        for (int i5 = 0; i5 <= 2; i5++) {
            S s5 = this.mInterface;
            if (s5 == null || s5.asBinder().isBinderAlive()) {
                this.mInterface = getInterface();
            }
            try {
                return callable.call(this.mInterface);
            } catch (RemoteException e5) {
                e5.printStackTrace();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean callBoolean(Callable<S, Boolean> callable) {
        Boolean bool = (Boolean) call(callable);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public void callVoid(final CallableVoid<S> callableVoid) {
        call(new Callable<S, Void>() { // from class: com.lody.virtual.helper.IPCHelper.1
            @Override // com.lody.virtual.helper.IPCHelper.Callable
            public Void call(S s5) throws RemoteException {
                callableVoid.call(s5);
                return null;
            }
        });
    }

    public abstract S getInterface();
}
