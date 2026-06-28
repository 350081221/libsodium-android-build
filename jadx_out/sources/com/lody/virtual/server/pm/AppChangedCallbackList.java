package com.lody.virtual.server.pm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class AppChangedCallbackList {
    private static final AppChangedCallbackList sInstance = new AppChangedCallbackList();
    private List<IAppChangedCallback> mList = new ArrayList(2);

    public static AppChangedCallbackList get() {
        return sInstance;
    }

    void notifyCallbacks(boolean z4) {
        Iterator<IAppChangedCallback> it = this.mList.iterator();
        while (it.hasNext()) {
            it.next().onCallback(z4);
        }
    }

    public void register(IAppChangedCallback iAppChangedCallback) {
        this.mList.add(iAppChangedCallback);
    }

    public void unregister(IAppChangedCallback iAppChangedCallback) {
        this.mList.remove(iAppChangedCallback);
    }
}
