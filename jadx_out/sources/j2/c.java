package j2;

import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public class c {
    public static XmlPullParser a() throws XmlPullParserException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        return newPullParser;
    }
}
