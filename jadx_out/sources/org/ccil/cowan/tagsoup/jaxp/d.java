package org.ccil.cowan.tagsoup.jaxp;

import java.util.Map;
import javax.xml.parsers.SAXParser;
import org.ccil.cowan.tagsoup.l;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

/* loaded from: classes4.dex */
public class d extends SAXParser {

    /* renamed from: a, reason: collision with root package name */
    final l f21236a = new l();

    public static d b(Map map) throws SAXException {
        d dVar = new d();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                dVar.c((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            }
        }
        return dVar;
    }

    public boolean a(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
        return this.f21236a.getFeature(str);
    }

    public void c(String str, boolean z4) throws SAXNotRecognizedException, SAXNotSupportedException {
        this.f21236a.setFeature(str, z4);
    }

    @Override // javax.xml.parsers.SAXParser
    public Parser getParser() throws SAXException {
        return new b(this.f21236a);
    }

    @Override // javax.xml.parsers.SAXParser
    public Object getProperty(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
        return this.f21236a.getProperty(str);
    }

    @Override // javax.xml.parsers.SAXParser
    public XMLReader getXMLReader() {
        return this.f21236a;
    }

    @Override // javax.xml.parsers.SAXParser
    public boolean isNamespaceAware() {
        try {
            return this.f21236a.getFeature(l.O);
        } catch (SAXException e5) {
            throw new RuntimeException(e5.getMessage());
        }
    }

    @Override // javax.xml.parsers.SAXParser
    public boolean isValidating() {
        try {
            return this.f21236a.getFeature(l.Z);
        } catch (SAXException e5) {
            throw new RuntimeException(e5.getMessage());
        }
    }

    @Override // javax.xml.parsers.SAXParser
    public void setProperty(String str, Object obj) throws SAXNotRecognizedException, SAXNotSupportedException {
        this.f21236a.setProperty(str, obj);
    }
}
