package okhttp3;

import androidx.autofill.HintConstants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import okio.n;
import p4.l;
import u3.i;
import u3.m;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lokhttp3/Credentials;", "", "()V", "basic", "", HintConstants.AUTOFILL_HINT_USERNAME, HintConstants.AUTOFILL_HINT_PASSWORD, "charset", "Ljava/nio/charset/Charset;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Credentials {

    @l
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    @l
    @i
    @m
    public static final String basic(@l String username, @l String password) {
        l0.p(username, "username");
        l0.p(password, "password");
        return basic$default(username, password, null, 4, null);
    }

    @l
    @i
    @m
    public static final String basic(@l String username, @l String password, @l Charset charset) {
        l0.p(username, "username");
        l0.p(password, "password");
        l0.p(charset, "charset");
        return "Basic " + n.Companion.j(username + ':' + password, charset).base64();
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset ISO_8859_1, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            ISO_8859_1 = StandardCharsets.ISO_8859_1;
            l0.o(ISO_8859_1, "ISO_8859_1");
        }
        return basic(str, str2, ISO_8859_1);
    }
}
