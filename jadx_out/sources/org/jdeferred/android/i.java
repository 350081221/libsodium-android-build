package org.jdeferred.android;

import android.os.AsyncTask;
import java.util.concurrent.CancellationException;
import org.jdeferred.e;
import org.jdeferred.p;

/* loaded from: classes4.dex */
public abstract class i<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {

    /* renamed from: a, reason: collision with root package name */
    protected final org.slf4j.a f21552a;

    /* renamed from: b, reason: collision with root package name */
    private final org.jdeferred.impl.d<Result, Throwable, Progress> f21553b;

    /* renamed from: c, reason: collision with root package name */
    private final e.a f21554c;

    /* renamed from: d, reason: collision with root package name */
    private Throwable f21555d;

    public i() {
        this.f21552a = org.slf4j.b.f(i.class);
        this.f21553b = new org.jdeferred.impl.d<>();
        this.f21554c = e.a.DEFAULT;
    }

    protected abstract Result a(Params... paramsArr) throws Exception;

    public e.a b() {
        return this.f21554c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void c(Progress progress) {
        publishProgress(progress);
    }

    public p<Result, Throwable, Progress> d() {
        return this.f21553b.c();
    }

    @Override // android.os.AsyncTask
    protected final Result doInBackground(Params... paramsArr) {
        try {
            return a(paramsArr);
        } catch (Throwable th) {
            this.f21555d = th;
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected final void onCancelled() {
        this.f21553b.h(new CancellationException());
    }

    @Override // android.os.AsyncTask
    protected final void onPostExecute(Result result) {
        Throwable th = this.f21555d;
        if (th != null) {
            this.f21553b.h(th);
        } else {
            this.f21553b.g(result);
        }
    }

    @Override // android.os.AsyncTask
    protected final void onProgressUpdate(Progress... progressArr) {
        if (progressArr != null && progressArr.length != 0) {
            if (progressArr.length > 0) {
                this.f21552a.warn("There were multiple progress values.  Only the first one was used!");
                this.f21553b.q(progressArr[0]);
                return;
            }
            return;
        }
        this.f21553b.q(null);
    }

    @Override // android.os.AsyncTask
    protected final void onCancelled(Result result) {
        this.f21553b.h(new CancellationException());
    }

    public i(e.a aVar) {
        this.f21552a = org.slf4j.b.f(i.class);
        this.f21553b = new org.jdeferred.impl.d<>();
        this.f21554c = aVar;
    }
}
