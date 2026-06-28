package t;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static String f22409a = "";

    /* renamed from: b, reason: collision with root package name */
    public static String f22410b = "";

    /* renamed from: c, reason: collision with root package name */
    public static String f22411c = "";

    public static synchronized void a(String str) {
        synchronized (d.class) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            d(arrayList);
        }
    }

    public static synchronized void b(String str, String str2, String str3) {
        synchronized (d.class) {
            f22409a = str;
            f22410b = str2;
            f22411c = str3;
        }
    }

    public static synchronized void c(Throwable th) {
        String str;
        synchronized (d.class) {
            ArrayList arrayList = new ArrayList();
            if (th != null) {
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                str = stringWriter.toString();
            } else {
                str = "";
            }
            arrayList.add(str);
            d(arrayList);
        }
    }

    public static synchronized void d(List<String> list) {
        synchronized (d.class) {
            if (!f1.a.c(f22410b) && !f1.a.c(f22411c)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(f22411c);
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    stringBuffer.append(", " + it.next());
                }
                stringBuffer.append("\n");
                try {
                    File file = new File(f22409a);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file2 = new File(f22409a, f22410b);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    FileWriter fileWriter = ((long) stringBuffer.length()) + file2.length() <= 51200 ? new FileWriter(file2, true) : new FileWriter(file2);
                    fileWriter.write(stringBuffer.toString());
                    fileWriter.flush();
                    fileWriter.close();
                } catch (Exception unused) {
                }
            }
        }
    }
}
