package org.ccil.cowan.tagsoup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import org.xml.sax.SAXException;

/* loaded from: classes4.dex */
public class i implements n {
    public static void c(String[] strArr) throws IOException, SAXException {
        new i().a(new InputStreamReader(System.in, "UTF-8"), new j(new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8"))));
    }

    @Override // org.ccil.cowan.tagsoup.n
    public void a(Reader reader, m mVar) throws IOException, SAXException {
        BufferedReader bufferedReader = new BufferedReader(reader);
        char[] cArr = null;
        boolean z4 = false;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                int length = readLine.length();
                if (cArr == null || cArr.length < length) {
                    cArr = new char[length];
                }
                readLine.getChars(0, length, cArr, 0);
                char c5 = cArr[0];
                if (c5 != '(') {
                    if (c5 != ')') {
                        if (c5 != '-') {
                            if (c5 != '?') {
                                if (c5 != 'A') {
                                    if (c5 == 'E') {
                                        if (z4) {
                                            mVar.p(cArr, 0, 0);
                                            z4 = false;
                                        }
                                        mVar.b(cArr, 1, length - 1);
                                    }
                                } else {
                                    int indexOf = readLine.indexOf(32);
                                    mVar.o(cArr, 1, indexOf - 1);
                                    mVar.e(cArr, indexOf + 1, (length - indexOf) - 1);
                                }
                            } else {
                                if (z4) {
                                    mVar.p(cArr, 0, 0);
                                    z4 = false;
                                }
                                mVar.l(cArr, 1, length - 1);
                            }
                        } else {
                            if (z4) {
                                mVar.p(cArr, 0, 0);
                                z4 = false;
                            }
                            if (readLine.equals("-\\n")) {
                                cArr[0] = '\n';
                                mVar.g(cArr, 0, 1);
                            } else {
                                mVar.g(cArr, 1, length - 1);
                            }
                        }
                    } else {
                        if (z4) {
                            mVar.p(cArr, 0, 0);
                            z4 = false;
                        }
                        mVar.m(cArr, 1, length - 1);
                    }
                } else {
                    if (z4) {
                        mVar.p(cArr, 0, 0);
                    }
                    mVar.f(cArr, 1, length - 1);
                    z4 = true;
                }
            } else {
                mVar.k(cArr, 0, 0);
                return;
            }
        }
    }

    @Override // org.ccil.cowan.tagsoup.n
    public void b(String str, String str2) {
    }

    @Override // org.ccil.cowan.tagsoup.n
    public void startCDATA() {
    }
}
