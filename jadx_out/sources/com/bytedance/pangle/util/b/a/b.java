package com.bytedance.pangle.util.b.a;

import com.bytedance.pangle.util.b.b.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes2.dex */
public final class b {
    public static void a(d dVar, ByteArrayOutputStream byteArrayOutputStream) {
        List<com.bytedance.pangle.util.b.b.c> list;
        com.bytedance.pangle.util.b.b.a aVar = dVar.f4637a;
        if (aVar != null && (list = aVar.f4624a) != null && list.size() > 0) {
            for (com.bytedance.pangle.util.b.b.c cVar : dVar.f4637a.f4624a) {
                c cVar2 = dVar.f4639c;
                if (cVar != null) {
                    byte[] bArr = {0, 0};
                    cVar2.a((OutputStream) byteArrayOutputStream, 33639248);
                    cVar2.a(byteArrayOutputStream, 0);
                    cVar2.a(byteArrayOutputStream, 0);
                    cVar2.a(byteArrayOutputStream, 0);
                    cVar2.a(byteArrayOutputStream, cVar.f4627a);
                    cVar2.a(byteArrayOutputStream, 2081);
                    cVar2.a(byteArrayOutputStream, 545);
                    cVar2.a((OutputStream) byteArrayOutputStream, (int) cVar.f4628b);
                    cVar2.a((OutputStream) byteArrayOutputStream, (int) cVar.f4629c);
                    cVar2.a((OutputStream) byteArrayOutputStream, (int) cVar.f4630d);
                    byte[] bArr2 = new byte[0];
                    String str = cVar.f4634h;
                    if (str != null && str.trim().length() > 0) {
                        bArr2 = cVar.f4634h.getBytes(Charset.forName("UTF-8"));
                    }
                    cVar2.a(byteArrayOutputStream, bArr2.length);
                    int i5 = cVar.f4632f;
                    cVar2.a(byteArrayOutputStream, i5);
                    cVar2.a(byteArrayOutputStream, 0);
                    byteArrayOutputStream.write(bArr);
                    byteArrayOutputStream.write(bArr);
                    byteArrayOutputStream.write(bArr);
                    byteArrayOutputStream.write(bArr);
                    cVar2.a((OutputStream) byteArrayOutputStream, (int) cVar.f4635i);
                    if (bArr2.length > 0) {
                        byteArrayOutputStream.write(bArr2);
                    }
                    if (i5 > 0) {
                        byteArrayOutputStream.write(new byte[i5]);
                    }
                } else {
                    throw new IOException("input parameters is null, cannot write local file header");
                }
            }
        }
    }
}
