package t0;

import android.database.ContentObserver;
import android.util.Log;

/* loaded from: classes2.dex */
public class d extends ContentObserver {

    /* renamed from: d, reason: collision with root package name */
    public static final String f22456d = "VMS_IDLG_SDK_Observer";

    /* renamed from: a, reason: collision with root package name */
    public String f22457a;

    /* renamed from: b, reason: collision with root package name */
    public int f22458b;

    /* renamed from: c, reason: collision with root package name */
    public c f22459c;

    public d(c cVar, int i5, String str) {
        super(null);
        this.f22459c = cVar;
        this.f22458b = i5;
        this.f22457a = str;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z4) {
        c cVar = this.f22459c;
        if (cVar != null) {
            cVar.e(this.f22458b, this.f22457a);
        } else {
            Log.e(f22456d, "mIdentifierIdClient is null");
        }
    }
}
