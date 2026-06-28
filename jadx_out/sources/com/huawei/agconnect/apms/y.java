package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.collect.model.event.network.HttpEvent;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes3.dex */
public class y implements Call {
    public fed abc;
    public Request bcd;
    public Call cde;

    public y(Request request, Call call, fed fedVar) {
        this.bcd = request;
        this.cde = call;
        this.abc = fedVar;
    }

    public final fed abc() {
        if (this.abc == null) {
            this.abc = new fed();
        }
        b0.abc(this.abc, this.bcd);
        return this.abc;
    }

    @Override // okhttp3.Call
    public void cancel() {
        this.cde.cancel();
    }

    @Override // okhttp3.Call
    public void enqueue(Callback callback) {
        abc();
        this.abc.cde(System.currentTimeMillis());
        this.cde.enqueue(new z(callback, this.abc));
    }

    @Override // okhttp3.Call
    public Response execute() throws IOException {
        gfe bcd;
        abc();
        this.abc.cde(System.currentTimeMillis());
        try {
            Response execute = this.cde.execute();
            if (!abc().ijk()) {
                b0.abc(abc(), execute);
            }
            return execute.newBuilder().body(new e0(execute.body(), this.abc)).build();
        } catch (IOException e5) {
            fed abc = abc();
            abc.abc(e5.toString());
            if (!abc.ijk() && !abc.fgh() && (bcd = abc.bcd()) != null) {
                abc.abc(true);
                yza.abc(new HttpEvent(bcd, x1.abc()));
            }
            throw e5;
        }
    }

    @Override // okhttp3.Call
    public boolean isCanceled() {
        return this.cde.isCanceled();
    }

    @Override // okhttp3.Call
    public boolean isExecuted() {
        return this.cde.isExecuted();
    }

    @Override // okhttp3.Call
    public Request request() {
        return this.cde.request();
    }

    @Override // okhttp3.Call
    public okio.p1 timeout() {
        return this.cde.timeout();
    }

    @Override // okhttp3.Call
    public Call clone() {
        return this.cde.clone();
    }
}
