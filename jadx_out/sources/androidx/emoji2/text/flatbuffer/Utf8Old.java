package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.Utf8Old;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public class Utf8Old extends Utf8 {
    private static final ThreadLocal<Cache> CACHE;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class Cache {
        CharSequence lastInput = null;
        ByteBuffer lastOutput = null;
        final CharsetEncoder encoder = StandardCharsets.UTF_8.newEncoder();
        final CharsetDecoder decoder = StandardCharsets.UTF_8.newDecoder();

        Cache() {
        }
    }

    static {
        final Supplier supplier = new Supplier() { // from class: androidx.emoji2.text.flatbuffer.a
            @Override // java.util.function.Supplier
            public final Object get() {
                Utf8Old.Cache lambda$static$0;
                lambda$static$0 = Utf8Old.lambda$static$0();
                return lambda$static$0;
            }
        };
        CACHE = new ThreadLocal() { // from class: androidx.emoji2.text.flatbuffer.b
            @Override // java.lang.ThreadLocal
            protected /* synthetic */ Object initialValue() {
                return supplier.get();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Cache lambda$static$0() {
        return new Cache();
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public String decodeUtf8(ByteBuffer byteBuffer, int i5, int i6) {
        CharsetDecoder charsetDecoder = CACHE.get().decoder;
        charsetDecoder.reset();
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i5);
        duplicate.limit(i5 + i6);
        try {
            return charsetDecoder.decode(duplicate).toString();
        } catch (CharacterCodingException e5) {
            throw new IllegalArgumentException("Bad encoding", e5);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        Cache cache = CACHE.get();
        if (cache.lastInput != charSequence) {
            encodedLength(charSequence);
        }
        byteBuffer.put(cache.lastOutput);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(CharSequence charSequence) {
        CharBuffer wrap;
        Cache cache = CACHE.get();
        int length = (int) (charSequence.length() * cache.encoder.maxBytesPerChar());
        ByteBuffer byteBuffer = cache.lastOutput;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            cache.lastOutput = ByteBuffer.allocate(Math.max(128, length));
        }
        cache.lastOutput.clear();
        cache.lastInput = charSequence;
        if (charSequence instanceof CharBuffer) {
            wrap = (CharBuffer) charSequence;
        } else {
            wrap = CharBuffer.wrap(charSequence);
        }
        CoderResult encode = cache.encoder.encode(wrap, cache.lastOutput, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (CharacterCodingException e5) {
                throw new IllegalArgumentException("bad character encoding", e5);
            }
        }
        cache.lastOutput.flip();
        return cache.lastOutput.remaining();
    }
}
