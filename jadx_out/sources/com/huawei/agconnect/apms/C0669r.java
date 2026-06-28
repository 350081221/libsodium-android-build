package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.collect.model.event.network.HttpEvent;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.http.StreamAllocation;
import java.io.IOException;

/* renamed from: com.huawei.agconnect.apms.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0669r implements Callback {
    public fed abc;
    public Callback bcd;

    public C0669r(Callback callback, fed fedVar) {
        this.bcd = callback;
        this.abc = fedVar;
    }

    public final void abc() {
        Object obj;
        u uVar = new u();
        if ((uVar.abc() == 2 && uVar.bcd() >= 7) && (obj = this.abc.lkj) != null && (obj instanceof Call)) {
            StreamAllocation callEngineGetStreamAllocation = Internal.instance.callEngineGetStreamAllocation((Call) obj);
            if (callEngineGetStreamAllocation.connection() == null || callEngineGetStreamAllocation.connection().socket == null || callEngineGetStreamAllocation.connection().socket.getInetAddress() == null) {
                return;
            }
            this.abc.cde(callEngineGetStreamAllocation.connection().socket.getInetAddress().getHostAddress());
        }
    }

    public void onFailure(Request request, IOException iOException) {
        try {
            abc(iOException);
        } catch (Throwable th) {
            this.abc.qpo = x1.abc();
            abc(new Exception(th));
        }
        this.bcd.onFailure(request, iOException);
    }

    public void onResponse(Response response) throws IOException {
        try {
            abc();
            if (!this.abc.ijk()) {
                response = t.abc(this.abc, response);
            }
        } catch (Throwable th) {
            this.abc.qpo = x1.abc();
            abc(new Exception(th));
        }
        this.bcd.onResponse(response.newBuilder().body(new w(response.body(), this.abc)).build());
    }

    public void abc(Exception exc) {
        gfe bcd;
        fed fedVar = this.abc;
        edc.abc(fedVar, exc);
        if (fedVar.ijk() || fedVar.fgh() || (bcd = fedVar.bcd()) == null) {
            return;
        }
        HttpEvent httpEvent = new HttpEvent(bcd, x1.abc());
        fedVar.abc(true);
        yza.abc(httpEvent);
    }
}
