package okhttp3;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¨\u0006\u000b"}, d2 = {"Lokhttp3/Callback;", "", "Lokhttp3/Call;", NotificationCompat.CATEGORY_CALL, "Ljava/io/IOException;", "e", "Lkotlin/r2;", "onFailure", "Lokhttp3/Response;", "response", "onResponse", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface Callback {
    void onFailure(@l Call call, @l IOException iOException);

    void onResponse(@l Call call, @l Response response) throws IOException;
}
