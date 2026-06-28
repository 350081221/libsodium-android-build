package org.repackage.com.meizu.flyme.openidsdk;

import android.text.TextUtils;

/* loaded from: classes4.dex */
class SupportInfo {

    /* renamed from: a, reason: collision with root package name */
    String f22110a;

    /* renamed from: b, reason: collision with root package name */
    Boolean f22111b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z4) {
        this.f22111b = Boolean.valueOf(z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f22111b != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals(this.f22110a, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        this.f22110a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        Boolean bool = this.f22111b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
