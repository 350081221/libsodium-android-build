package s2;

import android.content.pm.PackageInfo;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private final Set<String> f22367a;

    public a(String... strArr) {
        HashSet hashSet = new HashSet();
        this.f22367a = hashSet;
        Collections.addAll(hashSet, strArr);
    }

    public abstract boolean a(PackageInfo packageInfo);
}
