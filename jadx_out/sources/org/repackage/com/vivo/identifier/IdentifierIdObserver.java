package org.repackage.com.vivo.identifier;

import android.database.ContentObserver;
import android.util.Log;

/* loaded from: classes4.dex */
public class IdentifierIdObserver extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22189a = "VMS_SDK_Observer";

    /* renamed from: b, reason: collision with root package name */
    private String f22190b;

    /* renamed from: c, reason: collision with root package name */
    private int f22191c;

    /* renamed from: d, reason: collision with root package name */
    private IdentifierIdClient f22192d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IdentifierIdObserver(IdentifierIdClient identifierIdClient, int i5, String str) {
        super(null);
        this.f22192d = identifierIdClient;
        this.f22191c = i5;
        this.f22190b = str;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z4) {
        IdentifierIdClient identifierIdClient = this.f22192d;
        if (identifierIdClient != null) {
            identifierIdClient.a(this.f22191c, this.f22190b);
        } else {
            Log.e(f22189a, "mIdentifierIdClient is null");
        }
    }
}
