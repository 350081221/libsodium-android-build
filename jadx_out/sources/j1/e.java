package j1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f18962a;

    /* renamed from: b, reason: collision with root package name */
    private int f18963b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<f> f18964c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private int f18965d;

    public int a() {
        return this.f18965d;
    }

    public String b() {
        return this.f18962a;
    }

    public int c() {
        return this.f18963b;
    }

    public List<f> d() {
        return this.f18964c;
    }

    public void a(int i5) {
        this.f18965d = i5;
    }

    public void b(int i5) {
        this.f18963b = i5;
    }

    public void a(String str) {
        this.f18962a = str;
    }

    public void a(ArrayList<f> arrayList) {
        this.f18964c = arrayList;
    }
}
