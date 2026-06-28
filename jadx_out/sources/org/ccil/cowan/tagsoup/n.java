package org.ccil.cowan.tagsoup;

import java.io.IOException;
import java.io.Reader;
import org.xml.sax.SAXException;

/* loaded from: classes4.dex */
public interface n {
    void a(Reader reader, m mVar) throws IOException, SAXException;

    void b(String str, String str2);

    void startCDATA();
}
