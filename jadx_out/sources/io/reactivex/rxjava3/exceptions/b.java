package io.reactivex.rxjava3.exceptions;

import io.reactivex.rxjava3.internal.util.k;

/* loaded from: classes3.dex */
public final class b {
    private b() {
        throw new IllegalStateException("No instances!");
    }

    @l3.f
    public static RuntimeException a(@l3.f Throwable th) {
        throw k.i(th);
    }

    public static void b(@l3.f Throwable th) {
        if (!(th instanceof VirtualMachineError)) {
            if (!(th instanceof ThreadDeath)) {
                if (!(th instanceof LinkageError)) {
                    return;
                } else {
                    throw ((LinkageError) th);
                }
            }
            throw ((ThreadDeath) th);
        }
        throw ((VirtualMachineError) th);
    }
}
