package org.ccil.cowan.tagsoup;

import java.io.PrintWriter;
import java.io.Writer;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.ext.LexicalHandler;

/* loaded from: classes4.dex */
public class j implements m, ContentHandler, LexicalHandler {

    /* renamed from: c, reason: collision with root package name */
    private static char[] f21227c = new char[1];

    /* renamed from: a, reason: collision with root package name */
    private PrintWriter f21228a;

    /* renamed from: b, reason: collision with root package name */
    private String f21229b;

    public j(Writer writer) {
        if (writer instanceof PrintWriter) {
            this.f21228a = (PrintWriter) writer;
        } else {
            this.f21228a = new PrintWriter(writer);
        }
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void a(char[] cArr, int i5, int i6) throws SAXException {
        this.f21228a.print('?');
        this.f21228a.write(cArr, i5, i6);
        this.f21228a.write(32);
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void b(char[] cArr, int i5, int i6) throws SAXException {
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void c(char[] cArr, int i5, int i6) throws SAXException {
        g(cArr, i5, i6);
    }

    @Override // org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i5, int i6) throws SAXException {
        g(cArr, i5, i6);
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void comment(char[] cArr, int i5, int i6) throws SAXException {
        n(cArr, i5, i6);
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void d(char[] cArr, int i5, int i6) throws SAXException {
        this.f21228a.println(this.f21229b);
        this.f21229b = null;
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void e(char[] cArr, int i5, int i6) throws SAXException {
        this.f21228a.write(cArr, i5, i6);
        this.f21228a.println();
        this.f21229b = null;
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endCDATA() throws SAXException {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endDTD() throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        this.f21228a.close();
    }

    @Override // org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        if (str3.length() != 0) {
            str2 = str3;
        }
        this.f21228a.print(')');
        this.f21228a.println(str2);
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endEntity(String str) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) throws SAXException {
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void f(char[] cArr, int i5, int i6) throws SAXException {
        this.f21228a.print('(');
        this.f21228a.write(cArr, i5, i6);
        this.f21228a.println();
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void g(char[] cArr, int i5, int i6) throws SAXException {
        if (i6 == 0) {
            return;
        }
        int i7 = i6 + i5;
        boolean z4 = false;
        while (i5 < i7) {
            if (cArr[i5] == '\n') {
                if (z4) {
                    this.f21228a.println();
                }
                this.f21228a.println("-\\n");
                z4 = false;
            } else {
                if (!z4) {
                    this.f21228a.print('-');
                }
                char c5 = cArr[i5];
                if (c5 != '\t') {
                    if (c5 != '\\') {
                        this.f21228a.print(c5);
                    } else {
                        this.f21228a.print("\\\\");
                    }
                } else {
                    this.f21228a.print("\\t");
                }
                z4 = true;
            }
            i5++;
        }
        if (z4) {
            this.f21228a.println();
        }
    }

    @Override // org.ccil.cowan.tagsoup.m
    public int h() {
        return 0;
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void i(char[] cArr, int i5, int i6) throws SAXException {
        this.f21228a.println("!");
    }

    @Override // org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i5, int i6) throws SAXException {
        characters(cArr, i5, i6);
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void j(char[] cArr, int i5, int i6) throws SAXException {
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void k(char[] cArr, int i5, int i6) throws SAXException {
        this.f21228a.close();
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void l(char[] cArr, int i5, int i6) throws SAXException {
        this.f21228a.write(cArr, i5, i6);
        this.f21228a.println();
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void m(char[] cArr, int i5, int i6) throws SAXException {
        this.f21228a.print(')');
        this.f21228a.write(cArr, i5, i6);
        this.f21228a.println();
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void n(char[] cArr, int i5, int i6) throws SAXException {
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void o(char[] cArr, int i5, int i6) throws SAXException {
        this.f21228a.print('A');
        this.f21228a.write(cArr, i5, i6);
        this.f21228a.print(' ');
        this.f21229b = new String(cArr, i5, i6);
    }

    @Override // org.ccil.cowan.tagsoup.m
    public void p(char[] cArr, int i5, int i6) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
        this.f21228a.print('?');
        this.f21228a.print(str);
        this.f21228a.print(' ');
        this.f21228a.println(str2);
    }

    @Override // org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
    }

    @Override // org.xml.sax.ContentHandler
    public void skippedEntity(String str) throws SAXException {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startCDATA() throws SAXException {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startDTD(String str, String str2, String str3) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        if (str3.length() != 0) {
            str2 = str3;
        }
        this.f21228a.print('(');
        this.f21228a.println(str2);
        int length = attributes.getLength();
        for (int i5 = 0; i5 < length; i5++) {
            String qName = attributes.getQName(i5);
            if (qName.length() == 0) {
                qName = attributes.getLocalName(i5);
            }
            this.f21228a.print('A');
            this.f21228a.print(qName);
            this.f21228a.print(' ');
            this.f21228a.println(attributes.getValue(i5));
        }
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startEntity(String str) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) throws SAXException {
    }
}
