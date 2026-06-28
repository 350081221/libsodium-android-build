package v;

import android.content.Context;
import com.alipay.android.phone.mrpc.core.aa;
import com.alipay.android.phone.mrpc.core.h;
import com.alipay.android.phone.mrpc.core.w;
import com.alipay.tscenter.biz.rpc.deviceFp.BugTrackMessageService;
import com.alipay.tscenter.biz.rpc.report.general.DataReportService;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import com.lody.virtual.server.content.SyncStorageEngine;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c implements a {

    /* renamed from: d, reason: collision with root package name */
    public static c f22575d;

    /* renamed from: e, reason: collision with root package name */
    public static DataReportResult f22576e;

    /* renamed from: a, reason: collision with root package name */
    public w f22577a;

    /* renamed from: b, reason: collision with root package name */
    public BugTrackMessageService f22578b;

    /* renamed from: c, reason: collision with root package name */
    public DataReportService f22579c;

    public c(Context context, String str) {
        this.f22577a = null;
        this.f22578b = null;
        this.f22579c = null;
        aa aaVar = new aa();
        aaVar.a(str);
        h hVar = new h(context);
        this.f22577a = hVar;
        this.f22578b = (BugTrackMessageService) hVar.a(BugTrackMessageService.class, aaVar);
        this.f22579c = (DataReportService) this.f22577a.a(DataReportService.class, aaVar);
    }

    public static synchronized c e(Context context, String str) {
        c cVar;
        synchronized (c.class) {
            if (f22575d == null) {
                f22575d = new c(context, str);
            }
            cVar = f22575d;
        }
        return cVar;
    }

    @Override // v.a
    public DataReportResult a(DataReportRequest dataReportRequest) {
        if (dataReportRequest == null) {
            return null;
        }
        if (this.f22579c != null) {
            f22576e = null;
            new Thread(new b(this, dataReportRequest)).start();
            for (int i5 = x.a.f22626a; f22576e == null && i5 >= 0; i5 -= 50) {
                Thread.sleep(50L);
            }
        }
        return f22576e;
    }

    @Override // v.a
    public boolean logCollect(String str) {
        BugTrackMessageService bugTrackMessageService;
        String str2;
        if (f1.a.c(str) || (bugTrackMessageService = this.f22578b) == null) {
            return false;
        }
        try {
            str2 = bugTrackMessageService.logCollect(f1.a.j(str));
        } catch (Throwable unused) {
            str2 = null;
        }
        if (f1.a.c(str2)) {
            return false;
        }
        return ((Boolean) new JSONObject(str2).get(SyncStorageEngine.MESG_SUCCESS)).booleanValue();
    }
}
