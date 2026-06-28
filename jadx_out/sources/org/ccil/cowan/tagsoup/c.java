package org.ccil.cowan.tagsoup;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Hashtable;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.ext.LexicalHandler;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    static Hashtable f21136a;

    /* renamed from: b, reason: collision with root package name */
    private static l f21137b;

    /* renamed from: c, reason: collision with root package name */
    private static h f21138c;

    /* renamed from: d, reason: collision with root package name */
    private static String f21139d;

    static {
        Hashtable hashtable = new Hashtable();
        f21136a = hashtable;
        Boolean bool = Boolean.FALSE;
        hashtable.put("--nocdata", bool);
        f21136a.put("--files", bool);
        f21136a.put("--reuse", bool);
        f21136a.put("--nons", bool);
        f21136a.put("--nobogons", bool);
        f21136a.put("--any", bool);
        f21136a.put("--emptybogons", bool);
        f21136a.put("--norootbogons", bool);
        f21136a.put("--pyxin", bool);
        f21136a.put("--lexical", bool);
        f21136a.put("--pyx", bool);
        f21136a.put("--html", bool);
        f21136a.put("--method=", bool);
        f21136a.put("--doctype-public=", bool);
        f21136a.put("--doctype-system=", bool);
        f21136a.put("--output-encoding=", bool);
        f21136a.put("--omit-xml-declaration", bool);
        f21136a.put("--encoding=", bool);
        f21136a.put("--help", bool);
        f21136a.put("--version", bool);
        f21136a.put("--nodefaults", bool);
        f21136a.put("--nocolons", bool);
        f21136a.put("--norestart", bool);
        f21136a.put("--ignorable", bool);
        f21137b = null;
        f21138c = null;
        f21139d = null;
    }

    private static ContentHandler a(Writer writer) {
        String str;
        String str2;
        String str3;
        if (d(f21136a, "--pyx")) {
            return new j(writer);
        }
        p pVar = new p(writer);
        if (d(f21136a, "--html")) {
            pVar.u("method", "html");
            pVar.u(p.B, "yes");
        }
        if (d(f21136a, "--method=") && (str3 = (String) f21136a.get("--method=")) != null) {
            pVar.u("method", str3);
        }
        if (d(f21136a, "--doctype-public=") && (str2 = (String) f21136a.get("--doctype-public=")) != null) {
            pVar.u(p.f21286v, str2);
        }
        if (d(f21136a, "--doctype-system=") && (str = (String) f21136a.get("--doctype-system=")) != null) {
            pVar.u(p.f21287w, str);
        }
        if (d(f21136a, "--output-encoding=")) {
            String str4 = (String) f21136a.get("--output-encoding=");
            f21139d = str4;
            if (str4 != null) {
                pVar.u(p.f21288x, str4);
            }
        }
        if (d(f21136a, "--omit-xml-declaration")) {
            pVar.u(p.B, "yes");
        }
        pVar.v(f21138c.g(), "");
        return pVar;
    }

    private static void b() {
        System.err.print("usage: java -jar tagsoup-*.jar ");
        System.err.print(" [ ");
        Enumeration keys = f21136a.keys();
        boolean z4 = true;
        while (keys.hasMoreElements()) {
            if (!z4) {
                System.err.print("| ");
            }
            String str = (String) keys.nextElement();
            System.err.print(str);
            if (str.endsWith(ContainerUtils.KEY_VALUE_DELIMITER)) {
                System.err.print("?");
            }
            System.err.print(" ");
            z4 = false;
        }
        System.err.println("]*");
    }

    private static int c(Hashtable hashtable, String[] strArr) {
        String str;
        int i5 = 0;
        while (i5 < strArr.length) {
            String str2 = strArr[i5];
            if (str2.charAt(0) != '-') {
                break;
            }
            int indexOf = str2.indexOf(61);
            if (indexOf != -1) {
                int i6 = indexOf + 1;
                str = str2.substring(i6, str2.length());
                str2 = str2.substring(0, i6);
            } else {
                str = null;
            }
            if (hashtable.containsKey(str2)) {
                if (str == null) {
                    hashtable.put(str2, Boolean.TRUE);
                } else {
                    hashtable.put(str2, str);
                }
            } else {
                System.err.print("Unknown option ");
                System.err.println(str2);
                System.exit(1);
            }
            i5++;
        }
        return i5;
    }

    private static boolean d(Hashtable hashtable, String str) {
        if (Boolean.getBoolean(str) || hashtable.get(str) != Boolean.FALSE) {
            return true;
        }
        return false;
    }

    public static void e(String[] strArr) throws IOException, SAXException {
        String stringBuffer;
        int c5 = c(f21136a, strArr);
        if (d(f21136a, "--help")) {
            b();
            return;
        }
        if (d(f21136a, "--version")) {
            System.err.println("TagSoup version 1.2.1");
            return;
        }
        if (strArr.length == c5) {
            f("", System.out);
            return;
        }
        if (d(f21136a, "--files")) {
            while (c5 < strArr.length) {
                String str = strArr[c5];
                int lastIndexOf = str.lastIndexOf(46);
                if (lastIndexOf == -1) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(str);
                    stringBuffer2.append(".xhtml");
                    stringBuffer = stringBuffer2.toString();
                } else if (str.endsWith(".xhtml")) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append(str);
                    stringBuffer3.append("_");
                    stringBuffer = stringBuffer3.toString();
                } else {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append(str.substring(0, lastIndexOf));
                    stringBuffer4.append(".xhtml");
                    stringBuffer = stringBuffer4.toString();
                }
                PrintStream printStream = System.err;
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("src: ");
                stringBuffer5.append(str);
                stringBuffer5.append(" dst: ");
                stringBuffer5.append(stringBuffer);
                printStream.println(stringBuffer5.toString());
                f(str, new FileOutputStream(stringBuffer));
                c5++;
            }
            return;
        }
        while (c5 < strArr.length) {
            PrintStream printStream2 = System.err;
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("src: ");
            stringBuffer6.append(strArr[c5]);
            printStream2.println(stringBuffer6.toString());
            f(strArr[c5], System.out);
            c5++;
        }
    }

    private static void f(String str, OutputStream outputStream) throws IOException, SAXException {
        l lVar;
        OutputStreamWriter outputStreamWriter;
        String str2;
        if (d(f21136a, "--reuse")) {
            if (f21137b == null) {
                f21137b = new l();
            }
            lVar = f21137b;
        } else {
            lVar = new l();
        }
        h hVar = new h();
        f21138c = hVar;
        lVar.setProperty(l.f21251n0, hVar);
        if (d(f21136a, "--nocdata")) {
            lVar.setFeature(l.f21248k0, false);
        }
        if (d(f21136a, "--nons") || d(f21136a, "--html")) {
            lVar.setFeature(l.O, false);
        }
        if (d(f21136a, "--nobogons")) {
            lVar.setFeature(l.f21241d0, true);
        }
        if (d(f21136a, "--any")) {
            lVar.setFeature(l.f21242e0, false);
        } else if (d(f21136a, "--emptybogons")) {
            lVar.setFeature(l.f21242e0, true);
        }
        if (d(f21136a, "--norootbogons")) {
            lVar.setFeature(l.f21243f0, false);
        }
        if (d(f21136a, "--nodefaults")) {
            lVar.setFeature(l.f21244g0, false);
        }
        if (d(f21136a, "--nocolons")) {
            lVar.setFeature(l.f21245h0, true);
        }
        if (d(f21136a, "--norestart")) {
            lVar.setFeature(l.f21246i0, false);
        }
        if (d(f21136a, "--ignorable")) {
            lVar.setFeature(l.f21247j0, true);
        }
        if (d(f21136a, "--pyxin")) {
            lVar.setProperty(l.f21250m0, new i());
        }
        if (f21139d == null) {
            outputStreamWriter = new OutputStreamWriter(outputStream);
        } else {
            outputStreamWriter = new OutputStreamWriter(outputStream, f21139d);
        }
        ContentHandler a5 = a(outputStreamWriter);
        lVar.setContentHandler(a5);
        if (d(f21136a, "--lexical") && (a5 instanceof LexicalHandler)) {
            lVar.setProperty(l.f21249l0, a5);
        }
        InputSource inputSource = new InputSource();
        if (str != "") {
            inputSource.setSystemId(str);
        } else {
            inputSource.setByteStream(System.in);
        }
        if (d(f21136a, "--encoding=") && (str2 = (String) f21136a.get("--encoding=")) != null) {
            inputSource.setEncoding(str2);
        }
        lVar.parse(inputSource);
    }
}
