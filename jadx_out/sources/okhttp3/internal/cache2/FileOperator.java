package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/cache2/FileOperator;", "", "", "pos", "Lokio/l;", "source", "byteCount", "Lkotlin/r2;", "write", "sink", "read", "Ljava/nio/channels/FileChannel;", "fileChannel", "Ljava/nio/channels/FileChannel;", "<init>", "(Ljava/nio/channels/FileChannel;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class FileOperator {

    @l
    private final FileChannel fileChannel;

    public FileOperator(@l FileChannel fileChannel) {
        l0.p(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long j5, @l okio.l sink, long j6) {
        l0.p(sink, "sink");
        if (j6 >= 0) {
            while (j6 > 0) {
                long transferTo = this.fileChannel.transferTo(j5, j6, sink);
                j5 += transferTo;
                j6 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void write(long j5, @l okio.l source, long j6) throws IOException {
        l0.p(source, "source");
        if (j6 >= 0 && j6 <= source.M0()) {
            while (j6 > 0) {
                long transferFrom = this.fileChannel.transferFrom(source, j5, j6);
                j5 += transferFrom;
                j6 -= transferFrom;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
