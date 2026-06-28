package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.d0;
import io.reactivex.rxjava3.core.p0;
import io.reactivex.rxjava3.core.x0;
import io.reactivex.rxjava3.internal.operators.maybe.q1;
import io.reactivex.rxjava3.internal.operators.single.b1;
import java.util.Objects;

/* loaded from: classes3.dex */
final class w {
    private w() {
        throw new IllegalStateException("No instances!");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> boolean a(Object obj, m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> oVar, io.reactivex.rxjava3.core.f fVar) {
        io.reactivex.rxjava3.core.i iVar;
        if (obj instanceof m3.s) {
            try {
                a1.a aVar = (Object) ((m3.s) obj).get();
                if (aVar != null) {
                    io.reactivex.rxjava3.core.i apply = oVar.apply(aVar);
                    Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                    iVar = apply;
                } else {
                    iVar = null;
                }
                if (iVar == null) {
                    io.reactivex.rxjava3.internal.disposables.d.complete(fVar);
                } else {
                    iVar.a(fVar);
                }
                return true;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.internal.disposables.d.error(th, fVar);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, R> boolean b(Object obj, m3.o<? super T, ? extends d0<? extends R>> oVar, p0<? super R> p0Var) {
        d0<? extends R> d0Var;
        if (obj instanceof m3.s) {
            try {
                a1.a aVar = (Object) ((m3.s) obj).get();
                if (aVar != null) {
                    d0<? extends R> apply = oVar.apply(aVar);
                    Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                    d0Var = apply;
                } else {
                    d0Var = null;
                }
                if (d0Var == null) {
                    io.reactivex.rxjava3.internal.disposables.d.complete(p0Var);
                } else {
                    d0Var.a(q1.I8(p0Var));
                }
                return true;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.internal.disposables.d.error(th, p0Var);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, R> boolean c(Object obj, m3.o<? super T, ? extends x0<? extends R>> oVar, p0<? super R> p0Var) {
        x0<? extends R> x0Var;
        if (obj instanceof m3.s) {
            try {
                a1.a aVar = (Object) ((m3.s) obj).get();
                if (aVar != null) {
                    x0<? extends R> apply = oVar.apply(aVar);
                    Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                    x0Var = apply;
                } else {
                    x0Var = null;
                }
                if (x0Var == null) {
                    io.reactivex.rxjava3.internal.disposables.d.complete(p0Var);
                } else {
                    x0Var.a(b1.I8(p0Var));
                }
                return true;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.internal.disposables.d.error(th, p0Var);
                return true;
            }
        }
        return false;
    }
}
