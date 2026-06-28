package j2;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.ccil.cowan.tagsoup.l;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

/* loaded from: classes3.dex */
public class b {
    public static SAXParserFactory a() throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException, NullPointerException {
        SAXParserFactory newInstance = SAXParserFactory.newInstance();
        newInstance.setFeature(l.O, true);
        newInstance.setFeature(l.P, false);
        newInstance.setFeature(l.Z, false);
        newInstance.setFeature(l.Q, false);
        newInstance.setFeature(l.R, false);
        newInstance.setFeature(l.V, true);
        return newInstance;
    }
}
