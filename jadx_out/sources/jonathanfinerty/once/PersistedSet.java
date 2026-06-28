package jonathanfinerty.once;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
class PersistedSet {

    /* renamed from: c, reason: collision with root package name */
    private static final String f18988c = "PersistedSetValues";

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f18989a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<String> f18990b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PersistedSet(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("PersistedSet".concat(str), 0);
        this.f18989a = sharedPreferences;
        this.f18990b = new HashSet(sharedPreferences.getStringSet(f18988c, new HashSet()));
    }

    private void e() {
        SharedPreferences.Editor edit = this.f18989a.edit();
        edit.putStringSet(f18988c, this.f18990b);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f18990b.clear();
        e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(String str) {
        return this.f18990b.contains(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(String str) {
        this.f18990b.add(str);
        e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(String str) {
        this.f18990b.remove(str);
        e();
    }
}
