package androidx.room.util;

import androidx.annotation.RestrictTo;
import java.nio.ByteBuffer;
import java.util.UUID;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import u3.h;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001¨\u0006\u0006"}, d2 = {"convertByteToUUID", "Ljava/util/UUID;", "bytes", "", "convertUUIDToByte", "uuid", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@h(name = "UUIDUtil")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class UUIDUtil {
    @l
    public static final UUID convertByteToUUID(@l byte[] bytes) {
        l0.p(bytes, "bytes");
        ByteBuffer wrap = ByteBuffer.wrap(bytes);
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    @l
    public static final byte[] convertUUIDToByte(@l UUID uuid) {
        l0.p(uuid, "uuid");
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        byte[] array = wrap.array();
        l0.o(array, "buffer.array()");
        return array;
    }
}
