package t;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public File f22406a;

    /* renamed from: b, reason: collision with root package name */
    public b0.a f22407b;

    public b(String str, b0.a aVar) {
        this.f22406a = null;
        this.f22407b = null;
        this.f22406a = new File(str);
        this.f22407b = aVar;
    }

    public static String a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "id");
            jSONObject.put(com.umeng.analytics.pro.d.U, str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        File file = this.f22406a;
        if (file == null) {
            return;
        }
        if (file.exists() && this.f22406a.isDirectory() && this.f22406a.list().length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : this.f22406a.list()) {
                arrayList.add(str);
            }
            Collections.sort(arrayList);
            String str2 = (String) arrayList.get(arrayList.size() - 1);
            int size = arrayList.size();
            if (str2.equals(new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log")) {
                if (arrayList.size() < 2) {
                    return;
                }
                str2 = (String) arrayList.get(arrayList.size() - 2);
                size--;
            }
            if (!this.f22407b.logCollect(a(f1.b.a(this.f22406a.getAbsolutePath(), str2)))) {
                size--;
            }
            for (int i5 = 0; i5 < size; i5++) {
                new File(this.f22406a, (String) arrayList.get(i5)).delete();
            }
        }
    }

    public final void b() {
        new Thread(new c(this)).start();
    }
}
