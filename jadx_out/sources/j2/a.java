package j2;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.ccil.cowan.tagsoup.l;

/* loaded from: classes3.dex */
public class a {
    public static DocumentBuilderFactory a() throws ParserConfigurationException, NullPointerException {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setFeature(l.O, true);
        newInstance.setFeature(l.Z, false);
        newInstance.setExpandEntityReferences(false);
        return newInstance;
    }
}
