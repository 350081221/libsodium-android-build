package okhttp3;

import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import u3.e;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u000b"}, d2 = {"Lokhttp3/CookieJar;", "", "Lokhttp3/HttpUrl;", "url", "", "Lokhttp3/Cookie;", "cookies", "Lkotlin/r2;", "saveFromResponse", "loadForRequest", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface CookieJar {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @l
    @e
    public static final CookieJar NO_COOKIES = new Companion.NoCookies();

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/CookieJar$Companion;", "", "()V", "NO_COOKIES", "Lokhttp3/CookieJar;", "NoCookies", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lokhttp3/CookieJar$Companion$NoCookies;", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "", "Lokhttp3/Cookie;", "cookies", "Lkotlin/r2;", "saveFromResponse", "loadForRequest", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
        /* loaded from: classes4.dex */
        private static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            @l
            public List<Cookie> loadForRequest(@l HttpUrl url) {
                List<Cookie> E;
                l0.p(url, "url");
                E = w.E();
                return E;
            }

            @Override // okhttp3.CookieJar
            public void saveFromResponse(@l HttpUrl url, @l List<Cookie> cookies) {
                l0.p(url, "url");
                l0.p(cookies, "cookies");
            }
        }

        private Companion() {
        }
    }

    @l
    List<Cookie> loadForRequest(@l HttpUrl httpUrl);

    void saveFromResponse(@l HttpUrl httpUrl, @l List<Cookie> list);
}
