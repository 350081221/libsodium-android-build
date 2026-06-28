package v;

import com.alipay.tscenter.biz.rpc.report.general.DataReportService;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;

/* loaded from: classes2.dex */
public class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataReportRequest f22573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f22574b;

    public b(c cVar, DataReportRequest dataReportRequest) {
        this.f22574b = cVar;
        this.f22573a = dataReportRequest;
    }

    @Override // java.lang.Runnable
    public void run() {
        DataReportResult dataReportResult;
        DataReportResult dataReportResult2;
        DataReportService dataReportService;
        try {
            dataReportService = this.f22574b.f22579c;
            DataReportResult unused = c.f22576e = dataReportService.reportData(this.f22573a);
        } catch (Throwable th) {
            DataReportResult unused2 = c.f22576e = new DataReportResult();
            dataReportResult = c.f22576e;
            dataReportResult.success = false;
            dataReportResult2 = c.f22576e;
            dataReportResult2.resultCode = "static data rpc upload error, " + f1.a.a(th);
            f1.a.a(th);
        }
    }
}
