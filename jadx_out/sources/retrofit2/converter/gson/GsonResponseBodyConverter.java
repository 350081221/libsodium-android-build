package retrofit2.converter.gson;

import com.google.gson.f;
import com.google.gson.m;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.x;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: classes4.dex */
final class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final x<T> adapter;
    private final f gson;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GsonResponseBodyConverter(f fVar, x<T> xVar) {
        this.gson = fVar;
        this.adapter = xVar;
    }

    @Override // retrofit2.Converter
    public T convert(ResponseBody responseBody) throws IOException {
        JsonReader v4 = this.gson.v(responseBody.charStream());
        try {
            T e5 = this.adapter.e(v4);
            if (v4.peek() == JsonToken.END_DOCUMENT) {
                return e5;
            }
            throw new m("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
