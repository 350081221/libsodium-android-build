package org.ccil.cowan.tagsoup.jaxp;

import java.util.HashMap;
import java.util.LinkedHashMap;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

/* loaded from: classes4.dex */
public class c extends SAXParserFactory {

    /* renamed from: a, reason: collision with root package name */
    private d f21234a = null;

    /* renamed from: b, reason: collision with root package name */
    private HashMap f21235b = null;

    private d a() {
        if (this.f21234a == null) {
            this.f21234a = new d();
        }
        return this.f21234a;
    }

    @Override // javax.xml.parsers.SAXParserFactory
    public boolean getFeature(String str) throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException {
        return a().a(str);
    }

    @Override // javax.xml.parsers.SAXParserFactory
    public SAXParser newSAXParser() throws ParserConfigurationException {
        try {
            return d.b(this.f21235b);
        } catch (SAXException e5) {
            throw new ParserConfigurationException(e5.getMessage());
        }
    }

    @Override // javax.xml.parsers.SAXParserFactory
    public void setFeature(String str, boolean z4) throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException {
        Boolean bool;
        a().c(str, z4);
        if (this.f21235b == null) {
            this.f21235b = new LinkedHashMap();
        }
        HashMap hashMap = this.f21235b;
        if (z4) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        hashMap.put(str, bool);
    }
}
