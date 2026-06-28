package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.collect.model.event.network.HttpEvent;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* loaded from: classes3.dex */
public class z implements Callback {
    public fed abc;
    public Callback bcd;

    public z(Callback callback, fed fedVar) {
        this.abc = fedVar;
        this.bcd = callback;
    }

    public void abc(Exception exc) {
        gfe bcd;
        fed fedVar = this.abc;
        edc.abc(fedVar, exc);
        if (!fedVar.ijk() && !fedVar.fgh() && (bcd = fedVar.bcd()) != null) {
            HttpEvent httpEvent = new HttpEvent(bcd, x1.abc());
            fedVar.abc(true);
            yza.abc(httpEvent);
        }
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        try {
            abc(iOException);
        } catch (Throwable th) {
            this.abc.qpo = x1.abc();
            abc(new Exception(th));
        }
        this.bcd.onFailure(call, iOException);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) throws IOException {
        try {
            if (!this.abc.ijk()) {
                response = b0.abc(this.abc, response);
            }
        } catch (Throwable th) {
            this.abc.qpo = x1.abc();
            abc(new Exception(th));
        }
        this.bcd.onResponse(call, response.newBuilder().body(new e0(response.body(), this.abc)).build());
    }
}
