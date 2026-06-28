package org.ccil.cowan.tagsoup.jaxp;

import java.io.IOException;
import java.util.Locale;
import org.xml.sax.AttributeList;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.DocumentHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

/* loaded from: classes4.dex */
public class b implements Parser {

    /* renamed from: a, reason: collision with root package name */
    final XMLReader f21230a;

    /* loaded from: classes4.dex */
    static final class a implements AttributeList {

        /* renamed from: a, reason: collision with root package name */
        Attributes f21231a;

        public void a(Attributes attributes) {
            this.f21231a = attributes;
        }

        @Override // org.xml.sax.AttributeList
        public int getLength() {
            return this.f21231a.getLength();
        }

        @Override // org.xml.sax.AttributeList
        public String getName(int i5) {
            String qName = this.f21231a.getQName(i5);
            if (qName == null) {
                return this.f21231a.getLocalName(i5);
            }
            return qName;
        }

        @Override // org.xml.sax.AttributeList
        public String getType(int i5) {
            return this.f21231a.getType(i5);
        }

        @Override // org.xml.sax.AttributeList
        public String getValue(int i5) {
            return this.f21231a.getValue(i5);
        }

        @Override // org.xml.sax.AttributeList
        public String getType(String str) {
            return this.f21231a.getType(str);
        }

        @Override // org.xml.sax.AttributeList
        public String getValue(String str) {
            return this.f21231a.getValue(str);
        }
    }

    /* renamed from: org.ccil.cowan.tagsoup.jaxp.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0639b implements ContentHandler {

        /* renamed from: a, reason: collision with root package name */
        final DocumentHandler f21232a;

        /* renamed from: b, reason: collision with root package name */
        final a f21233b = new a();

        C0639b(DocumentHandler documentHandler) {
            this.f21232a = documentHandler;
        }

        @Override // org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i5, int i6) throws SAXException {
            this.f21232a.characters(cArr, i5, i6);
        }

        @Override // org.xml.sax.ContentHandler
        public void endDocument() throws SAXException {
            this.f21232a.endDocument();
        }

        @Override // org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            if (str3 != null) {
                str2 = str3;
            }
            this.f21232a.endElement(str2);
        }

        @Override // org.xml.sax.ContentHandler
        public void endPrefixMapping(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] cArr, int i5, int i6) throws SAXException {
            this.f21232a.ignorableWhitespace(cArr, i5, i6);
        }

        @Override // org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) throws SAXException {
            this.f21232a.processingInstruction(str, str2);
        }

        @Override // org.xml.sax.ContentHandler
        public void setDocumentLocator(Locator locator) {
            this.f21232a.setDocumentLocator(locator);
        }

        @Override // org.xml.sax.ContentHandler
        public void skippedEntity(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void startDocument() throws SAXException {
            this.f21232a.startDocument();
        }

        @Override // org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            if (str3 != null) {
                str2 = str3;
            }
            this.f21233b.a(attributes);
            this.f21232a.startElement(str2, this.f21233b);
        }

        @Override // org.xml.sax.ContentHandler
        public void startPrefixMapping(String str, String str2) {
        }
    }

    public b(XMLReader xMLReader) {
        this.f21230a = xMLReader;
    }

    @Override // org.xml.sax.Parser
    public void parse(InputSource inputSource) throws SAXException {
        try {
            this.f21230a.parse(inputSource);
        } catch (IOException e5) {
            throw new SAXException(e5);
        }
    }

    @Override // org.xml.sax.Parser
    public void setDTDHandler(DTDHandler dTDHandler) {
        this.f21230a.setDTDHandler(dTDHandler);
    }

    @Override // org.xml.sax.Parser
    public void setDocumentHandler(DocumentHandler documentHandler) {
        this.f21230a.setContentHandler(new C0639b(documentHandler));
    }

    @Override // org.xml.sax.Parser
    public void setEntityResolver(EntityResolver entityResolver) {
        this.f21230a.setEntityResolver(entityResolver);
    }

    @Override // org.xml.sax.Parser
    public void setErrorHandler(ErrorHandler errorHandler) {
        this.f21230a.setErrorHandler(errorHandler);
    }

    @Override // org.xml.sax.Parser
    public void setLocale(Locale locale) throws SAXException {
        throw new SAXNotSupportedException("TagSoup does not implement setLocale() method");
    }

    @Override // org.xml.sax.Parser
    public void parse(String str) throws SAXException {
        try {
            this.f21230a.parse(str);
        } catch (IOException e5) {
            throw new SAXException(e5);
        }
    }
}
