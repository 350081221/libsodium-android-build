package com.moji4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
class a {

    /* renamed from: c, reason: collision with root package name */
    private static final String f9323c = "/romaji_to_katakana.csv";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9324d = "/romaji_to_hiragana.csv";

    /* renamed from: e, reason: collision with root package name */
    private static final String f9325e = "/kana_to_romaji.csv";

    /* renamed from: f, reason: collision with root package name */
    private static a f9326f;

    /* renamed from: g, reason: collision with root package name */
    private static a f9327g;

    /* renamed from: h, reason: collision with root package name */
    private static a f9328h;

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f9329a;

    /* renamed from: b, reason: collision with root package name */
    private int f9330b;

    private a(Map<String, String> map) {
        this.f9329a = map;
        for (String str : map.keySet()) {
            if (str.length() > this.f9330b) {
                this.f9330b = str.length();
            }
        }
    }

    private static a a(String str) {
        try {
            InputStream openStream = a.class.getResource(str).openStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openStream));
                TreeMap treeMap = new TreeMap();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    int indexOf = readLine.indexOf(44);
                    treeMap.put(readLine.substring(0, indexOf), readLine.substring(indexOf + 1));
                }
                a aVar = new a(treeMap);
                if (openStream != null) {
                    openStream.close();
                }
                return aVar;
            } finally {
            }
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static synchronized a c() {
        a aVar;
        synchronized (a.class) {
            if (f9328h == null) {
                f9328h = a(f9325e);
            }
            aVar = f9328h;
        }
        return aVar;
    }

    public static synchronized a e() {
        a aVar;
        synchronized (a.class) {
            if (f9327g == null) {
                f9327g = a(f9324d);
            }
            aVar = f9327g;
        }
        return aVar;
    }

    public static synchronized a f() {
        a aVar;
        synchronized (a.class) {
            if (f9326f == null) {
                f9326f = a(f9323c);
            }
            aVar = f9326f;
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b(String str) {
        return this.f9329a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f9330b;
    }
}
