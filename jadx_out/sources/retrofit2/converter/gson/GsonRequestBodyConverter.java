package retrofit2.converter.gson;

import com.google.gson.f;
import com.google.gson.stream.JsonWriter;
import com.google.gson.x;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.l;
import retrofit2.Converter;

/* loaded from: classes4.dex */
final class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.get("application/json; charset=UTF-8");
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final x<T> adapter;
    private final f gson;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GsonRequestBodyConverter(f fVar, x<T> xVar) {
        this.gson = fVar;
        this.adapter = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ RequestBody convert(Object obj) throws IOException {
        return convert((GsonRequestBodyConverter<T>) obj);
    }

    @Override // retrofit2.Converter
    public RequestBody convert(T t5) throws IOException {
        l lVar = new l();
        JsonWriter w4 = this.gson.w(new OutputStreamWriter(lVar.x0(), UTF_8));
        this.adapter.i(w4, t5);
        w4.close();
        return RequestBody.create(MEDIA_TYPE, lVar.m0());
    }
}
