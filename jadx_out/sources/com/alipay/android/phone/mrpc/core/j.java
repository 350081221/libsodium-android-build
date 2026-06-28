package com.alipay.android.phone.mrpc.core;

import com.efs.sdk.base.Constants;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.apache.http.Header;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicHeader;

/* loaded from: classes2.dex */
public final class j extends a {

    /* renamed from: g, reason: collision with root package name */
    public g f2722g;

    public j(g gVar, Method method, int i5, String str, byte[] bArr, boolean z4) {
        super(method, i5, str, bArr, URLEncodedUtils.CONTENT_TYPE, z4);
        this.f2722g = gVar;
    }

    @Override // com.alipay.android.phone.mrpc.core.v
    public final Object a() {
        o oVar = new o(this.f2722g.a());
        oVar.a(this.f2691b);
        oVar.a(this.f2694e);
        oVar.a(this.f2695f);
        oVar.a("id", String.valueOf(this.f2693d));
        oVar.a("operationType", this.f2692c);
        oVar.a(Constants.CP_GZIP, String.valueOf(this.f2722g.d()));
        oVar.a(new BasicHeader("uuid", UUID.randomUUID().toString()));
        List<Header> b5 = this.f2722g.c().b();
        if (b5 != null && !b5.isEmpty()) {
            Iterator<Header> it = b5.iterator();
            while (it.hasNext()) {
                oVar.a(it.next());
            }
        }
        Thread.currentThread().getId();
        oVar.toString();
        try {
            u uVar = this.f2722g.b().a(oVar).get();
            if (uVar != null) {
                return uVar.b();
            }
            throw new RpcException((Integer) 9, "response is null");
        } catch (InterruptedException e5) {
            throw new RpcException(13, "", e5);
        } catch (CancellationException e6) {
            throw new RpcException(13, "", e6);
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (cause == null || !(cause instanceof HttpException)) {
                throw new RpcException(9, "", e7);
            }
            HttpException httpException = (HttpException) cause;
            int code = httpException.getCode();
            switch (code) {
                case 1:
                    code = 2;
                    break;
                case 2:
                    code = 3;
                    break;
                case 3:
                    code = 4;
                    break;
                case 4:
                    code = 5;
                    break;
                case 5:
                    code = 6;
                    break;
                case 6:
                    code = 7;
                    break;
                case 7:
                    code = 8;
                    break;
                case 8:
                    code = 15;
                    break;
                case 9:
                    code = 16;
                    break;
            }
            throw new RpcException(Integer.valueOf(code), httpException.getMsg());
        }
    }
}
