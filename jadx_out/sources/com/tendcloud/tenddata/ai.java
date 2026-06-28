package com.tendcloud.tenddata;

import java.net.URL;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes3.dex */
public class ai {

    /* renamed from: a, reason: collision with root package name */
    static final Queue<String> f11383a;

    static {
        LinkedList linkedList = new LinkedList();
        f11383a = linkedList;
        linkedList.add(aa.f11326c);
        linkedList.add(aa.f11327d);
        linkedList.add(aa.f11328e);
    }

    public static URL a(URL url, String str) {
        return o.b() ? url : new URL(url.getProtocol(), str, url.getPort(), url.getFile());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str) {
        Queue<String> queue = f11383a;
        if (queue.contains(str)) {
            h.eForInternal("host existed...");
        } else {
            queue.add(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a() {
        return f11383a.poll();
    }
}
