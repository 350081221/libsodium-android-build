package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.collect.model.event.network.HttpEvent;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;

/* loaded from: classes3.dex */
public class q extends Call {
    public fed abc;
    public Request bcd;
    public Call cde;

    public q(OkHttpClient okHttpClient, Request request, fed fedVar) {
        super(okHttpClient, request);
        boolean z4;
        u uVar = new u();
        if (uVar.abc() == 2 && uVar.bcd() >= 6) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            s.abc(okHttpClient, fedVar);
        } else {
            t.abc(request, fedVar);
        }
        this.bcd = request;
        this.cde = okHttpClient.newCall(request);
        this.abc = fedVar;
    }

    public final fed abc() {
        if (this.abc == null) {
            this.abc = new fed();
        }
        t.abc(this.abc, this.bcd);
        return this.abc;
    }

    public void cancel() {
        this.cde.cancel();
    }

    public void enqueue(Callback callback) {
        abc();
        fed fedVar = this.abc;
        Call call = this.cde;
        fedVar.lkj = call;
        call.enqueue(new C0669r(callback, fedVar));
    }

    public Response execute() throws IOException {
        gfe bcd;
        abc();
        fed fedVar = this.abc;
        Call call = this.cde;
        fedVar.lkj = call;
        try {
            Response execute = call.execute();
            if (!abc().ijk()) {
                t.abc(abc(), execute);
            }
            return execute.newBuilder().body(new w(execute.body(), this.abc)).build();
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

    public boolean isCanceled() {
        return this.cde.isCanceled();
    }

    public synchronized boolean isExecuted() {
        return this.cde.isExecuted();
    }
}
