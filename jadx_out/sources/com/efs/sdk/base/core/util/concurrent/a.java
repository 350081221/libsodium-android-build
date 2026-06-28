package com.efs.sdk.base.core.util.concurrent;

import android.os.HandlerThread;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static HandlerThread f6647a;

    static {
        HandlerThread handlerThread = new HandlerThread("efs-base", 10);
        f6647a = handlerThread;
        handlerThread.start();
    }
}
