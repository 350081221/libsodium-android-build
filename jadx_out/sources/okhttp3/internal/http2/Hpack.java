package okhttp3.internal.http2;

import android.net.http.Headers;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k0.c;
import kotlin.collections.e0;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.internal.Util;
import okio.BufferedSource;
import okio.n;
import okio.n1;
import okio.y0;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import p4.l;
import t0.b;
import u3.e;
import u3.i;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/http2/Hpack;", "", "", "Lokio/n;", "", "nameToFirstIndex", "name", "checkLowercase", "PREFIX_4_BITS", "I", "PREFIX_5_BITS", "PREFIX_6_BITS", "PREFIX_7_BITS", "SETTINGS_HEADER_TABLE_SIZE", "SETTINGS_HEADER_TABLE_SIZE_LIMIT", "", "Lokhttp3/internal/http2/Header;", "STATIC_HEADER_TABLE", "[Lokhttp3/internal/http2/Header;", "getSTATIC_HEADER_TABLE", "()[Lokhttp3/internal/http2/Header;", "NAME_TO_FIRST_INDEX", "Ljava/util/Map;", "getNAME_TO_FIRST_INDEX", "()Ljava/util/Map;", "<init>", "()V", "Reader", "Writer", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Hpack {

    @l
    public static final Hpack INSTANCE;

    @l
    private static final Map<n, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;

    @l
    private static final Header[] STATIC_HEADER_TABLE;

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        n nVar = Header.TARGET_METHOD;
        n nVar2 = Header.TARGET_PATH;
        n nVar3 = Header.TARGET_SCHEME;
        n nVar4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{new Header(Header.TARGET_AUTHORITY, ""), new Header(nVar, HttpGet.METHOD_NAME), new Header(nVar, HttpPost.METHOD_NAME), new Header(nVar2, "/"), new Header(nVar2, "/index.html"), new Header(nVar3, "http"), new Header(nVar3, "https"), new Header(nVar4, "200"), new Header(nVar4, "204"), new Header(nVar4, "206"), new Header(nVar4, "304"), new Header(nVar4, "400"), new Header(nVar4, "404"), new Header(nVar4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header(Headers.ACCEPT_RANGES, ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header(Headers.CACHE_CONTROL, ""), new Header(Headers.CONTENT_DISPOSITION, ""), new Header(Headers.CONTENT_ENCODING, ""), new Header("content-language", ""), new Header(Headers.CONTENT_LEN, ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header(Headers.ETAG, ""), new Header("expect", ""), new Header("expires", ""), new Header(TypedValues.TransitionType.S_FROM, ""), new Header(c.f19042f, ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header(Headers.LAST_MODIFIED, ""), new Header("link", ""), new Header(Headers.LOCATION, ""), new Header("max-forwards", ""), new Header(Headers.PROXY_AUTHENTICATE, ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header(Headers.SET_COOKIE, ""), new Header("strict-transport-security", ""), new Header(Headers.TRANSFER_ENCODING, ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header(Headers.WWW_AUTHENTICATE, "")};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    private final Map<n, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i5].name)) {
                linkedHashMap.put(headerArr2[i5].name, Integer.valueOf(i5));
            }
        }
        Map<n, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        l0.o(unmodifiableMap, "unmodifiableMap(result)");
        return unmodifiableMap;
    }

    @l
    public final n checkLowercase(@l n name) throws IOException {
        boolean z4;
        l0.p(name, "name");
        int size = name.size();
        for (int i5 = 0; i5 < size; i5++) {
            byte b5 = name.getByte(i5);
            if (65 <= b5 && b5 < 91) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.utf8());
            }
        }
        return name;
    }

    @l
    public final Map<n, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    @l
    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }

    @i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010&\u001a\u00020.\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0002J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018J\u0006\u0010\u001a\u001a\u00020\u0005J\u0006\u0010\u001b\u001a\u00020\u0002J\u0016\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005J\u0006\u0010\u001f\u001a\u00020\u0010R\u0014\u0010 \u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140(8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010!R\u0016\u0010,\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b,\u0010!R\u0016\u0010-\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b-\u0010!¨\u00061"}, d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", "", "Lkotlin/r2;", "adjustDynamicTableByteCount", "clearDynamicTable", "", "bytesToRecover", "evictToRecoverBytes", "index", "readIndexedHeader", "dynamicTableIndex", "readLiteralHeaderWithoutIndexingIndexedName", "readLiteralHeaderWithoutIndexingNewName", "nameIndex", "readLiteralHeaderWithIncrementalIndexingIndexedName", "readLiteralHeaderWithIncrementalIndexingNewName", "Lokio/n;", "getName", "", "isStaticHeader", "Lokhttp3/internal/http2/Header;", "entry", "insertIntoDynamicTable", "readByte", "", "getAndResetHeaderList", "maxDynamicTableByteCount", "readHeaders", "firstByte", "prefixMask", "readInt", "readByteString", "headerTableSizeSetting", "I", "", "headerList", "Ljava/util/List;", "Lokio/BufferedSource;", "source", "Lokio/BufferedSource;", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "Lokio/n1;", "<init>", "(Lokio/n1;II)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Reader {

        @l
        @e
        public Header[] dynamicTable;

        @e
        public int dynamicTableByteCount;

        @e
        public int headerCount;

        @l
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;

        @l
        private final BufferedSource source;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @i
        public Reader(@l n1 source, int i5) {
            this(source, i5, 0, 4, null);
            l0.p(source, "source");
        }

        @i
        public Reader(@l n1 source, int i5, int i6) {
            l0.p(source, "source");
            this.headerTableSizeSetting = i5;
            this.maxDynamicTableByteCount = i6;
            this.headerList = new ArrayList();
            this.source = y0.e(source);
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        private final void adjustDynamicTableByteCount() {
            int i5 = this.maxDynamicTableByteCount;
            int i6 = this.dynamicTableByteCount;
            if (i5 < i6) {
                if (i5 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i6 - i5);
                }
            }
        }

        private final void clearDynamicTable() {
            o.V1(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int i5) {
            return this.nextHeaderIndex + 1 + i5;
        }

        private final int evictToRecoverBytes(int i5) {
            int i6;
            int i7 = 0;
            if (i5 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i6 = this.nextHeaderIndex;
                    if (length < i6 || i5 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    l0.m(header);
                    int i8 = header.hpackSize;
                    i5 -= i8;
                    this.dynamicTableByteCount -= i8;
                    this.headerCount--;
                    i7++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i6 + 1, headerArr, i6 + 1 + i7, this.headerCount);
                this.nextHeaderIndex += i7;
            }
            return i7;
        }

        private final n getName(int i5) throws IOException {
            if (isStaticHeader(i5)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i5].name;
            }
            int dynamicTableIndex = dynamicTableIndex(i5 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    Header header = headerArr[dynamicTableIndex];
                    l0.m(header);
                    return header.name;
                }
            }
            throw new IOException("Header index too large " + (i5 + 1));
        }

        private final void insertIntoDynamicTable(int i5, Header header) {
            this.headerList.add(header);
            int i6 = header.hpackSize;
            if (i5 != -1) {
                Header header2 = this.dynamicTable[dynamicTableIndex(i5)];
                l0.m(header2);
                i6 -= header2.hpackSize;
            }
            int i7 = this.maxDynamicTableByteCount;
            if (i6 > i7) {
                clearDynamicTable();
                return;
            }
            int evictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i6) - i7);
            if (i5 == -1) {
                int i8 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i8 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i9 = this.nextHeaderIndex;
                this.nextHeaderIndex = i9 - 1;
                this.dynamicTable[i9] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[i5 + dynamicTableIndex(i5) + evictToRecoverBytes] = header;
            }
            this.dynamicTableByteCount += i6;
        }

        private final boolean isStaticHeader(int i5) {
            return i5 >= 0 && i5 <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final int readByte() throws IOException {
            return Util.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int i5) throws IOException {
            if (isStaticHeader(i5)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i5]);
                return;
            }
            int dynamicTableIndex = dynamicTableIndex(i5 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    List<Header> list = this.headerList;
                    Header header = headerArr[dynamicTableIndex];
                    l0.m(header);
                    list.add(header);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i5 + 1));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i5) throws IOException {
            insertIntoDynamicTable(-1, new Header(getName(i5), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i5) throws IOException {
            this.headerList.add(new Header(getName(i5), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        @l
        public final List<Header> getAndResetHeaderList() {
            List<Header> S5;
            S5 = e0.S5(this.headerList);
            this.headerList.clear();
            return S5;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        @l
        public final n readByteString() throws IOException {
            boolean z4;
            int readByte = readByte();
            if ((readByte & 128) == 128) {
                z4 = true;
            } else {
                z4 = false;
            }
            long readInt = readInt(readByte, 127);
            if (z4) {
                okio.l lVar = new okio.l();
                Huffman.INSTANCE.decode(this.source, readInt, lVar);
                return lVar.m0();
            }
            return this.source.Y(readInt);
        }

        public final void readHeaders() throws IOException {
            while (!this.source.e0()) {
                int and = Util.and(this.source.readByte(), 255);
                if (and != 128) {
                    if ((and & 128) == 128) {
                        readIndexedHeader(readInt(and, 127) - 1);
                    } else if (and == 64) {
                        readLiteralHeaderWithIncrementalIndexingNewName();
                    } else if ((and & 64) == 64) {
                        readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(and, 63) - 1);
                    } else if ((and & 32) == 32) {
                        int readInt = readInt(and, 31);
                        this.maxDynamicTableByteCount = readInt;
                        if (readInt >= 0 && readInt <= this.headerTableSizeSetting) {
                            adjustDynamicTableByteCount();
                        } else {
                            throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                        }
                    } else if (and != 16 && and != 0) {
                        readLiteralHeaderWithoutIndexingIndexedName(readInt(and, 15) - 1);
                    } else {
                        readLiteralHeaderWithoutIndexingNewName();
                    }
                } else {
                    throw new IOException("index == 0");
                }
            }
        }

        public final int readInt(int i5, int i6) throws IOException {
            int i7 = i5 & i6;
            if (i7 < i6) {
                return i7;
            }
            int i8 = 0;
            while (true) {
                int readByte = readByte();
                if ((readByte & 128) == 0) {
                    return i6 + (readByte << i8);
                }
                i6 += (readByte & 127) << i8;
                i8 += 7;
            }
        }

        public /* synthetic */ Reader(n1 n1Var, int i5, int i6, int i7, w wVar) {
            this(n1Var, i5, (i7 & 4) != 0 ? i5 : i6);
        }
    }

    @i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0014\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\u001e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004R\u0016\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0016\u0010\u001f\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0016\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010\u0017R\u001e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070!8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u0017R\u0016\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b%\u0010\u0017R\u0016\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0017¨\u0006)"}, d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", "", "Lkotlin/r2;", "clearDynamicTable", "", "bytesToRecover", "evictToRecoverBytes", "Lokhttp3/internal/http2/Header;", "entry", "insertIntoDynamicTable", "adjustDynamicTableByteCount", "", "headerBlock", "writeHeaders", b.f22420d, "prefixMask", "bits", "writeInt", "Lokio/n;", "data", "writeByteString", "headerTableSizeSetting", "resizeHeaderTable", "I", "", "useCompression", "Z", "Lokio/l;", "out", "Lokio/l;", "smallestHeaderTableSizeSetting", "emitDynamicTableSizeUpdate", "maxDynamicTableByteCount", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "<init>", "(IZLokio/l;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Writer {

        @l
        @e
        public Header[] dynamicTable;

        @e
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;

        @e
        public int headerCount;

        @e
        public int headerTableSizeSetting;

        @e
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;

        @l
        private final okio.l out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @i
        public Writer(int i5, @l okio.l out) {
            this(i5, false, out, 2, null);
            l0.p(out, "out");
        }

        @i
        public Writer(int i5, boolean z4, @l okio.l out) {
            l0.p(out, "out");
            this.headerTableSizeSetting = i5;
            this.useCompression = z4;
            this.out = out;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i5;
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @i
        public Writer(@l okio.l out) {
            this(0, false, out, 3, null);
            l0.p(out, "out");
        }

        private final void adjustDynamicTableByteCount() {
            int i5 = this.maxDynamicTableByteCount;
            int i6 = this.dynamicTableByteCount;
            if (i5 < i6) {
                if (i5 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i6 - i5);
                }
            }
        }

        private final void clearDynamicTable() {
            o.V1(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i5) {
            int i6;
            int i7 = 0;
            if (i5 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i6 = this.nextHeaderIndex;
                    if (length < i6 || i5 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    l0.m(header);
                    i5 -= header.hpackSize;
                    int i8 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    l0.m(header2);
                    this.dynamicTableByteCount = i8 - header2.hpackSize;
                    this.headerCount--;
                    i7++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i6 + 1, headerArr, i6 + 1 + i7, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i9 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i9 + 1, i9 + 1 + i7, (Object) null);
                this.nextHeaderIndex += i7;
            }
            return i7;
        }

        private final void insertIntoDynamicTable(Header header) {
            int i5 = header.hpackSize;
            int i6 = this.maxDynamicTableByteCount;
            if (i5 > i6) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i5) - i6);
            int i7 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i7 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i8 = this.nextHeaderIndex;
            this.nextHeaderIndex = i8 - 1;
            this.dynamicTable[i8] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i5;
        }

        public final void resizeHeaderTable(int i5) {
            this.headerTableSizeSetting = i5;
            int min = Math.min(i5, 16384);
            int i6 = this.maxDynamicTableByteCount;
            if (i6 == min) {
                return;
            }
            if (min < i6) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, min);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = min;
            adjustDynamicTableByteCount();
        }

        public final void writeByteString(@l n data) throws IOException {
            l0.p(data, "data");
            if (this.useCompression) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(data) < data.size()) {
                    okio.l lVar = new okio.l();
                    huffman.encode(data, lVar);
                    n m02 = lVar.m0();
                    writeInt(m02.size(), 127, 128);
                    this.out.v0(m02);
                    return;
                }
            }
            writeInt(data.size(), 127, 0);
            this.out.v0(data);
        }

        public final void writeHeaders(@l List<Header> headerBlock) throws IOException {
            int i5;
            int i6;
            boolean z4;
            l0.p(headerBlock, "headerBlock");
            if (this.emitDynamicTableSizeUpdate) {
                int i7 = this.smallestHeaderTableSizeSetting;
                if (i7 < this.maxDynamicTableByteCount) {
                    writeInt(i7, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = headerBlock.size();
            for (int i8 = 0; i8 < size; i8++) {
                Header header = headerBlock.get(i8);
                n asciiLowercase = header.name.toAsciiLowercase();
                n nVar = header.value;
                Hpack hpack = Hpack.INSTANCE;
                Integer num = hpack.getNAME_TO_FIRST_INDEX().get(asciiLowercase);
                if (num != null) {
                    i6 = num.intValue() + 1;
                    if (2 <= i6 && i6 < 8) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        if (l0.g(hpack.getSTATIC_HEADER_TABLE()[i6 - 1].value, nVar)) {
                            i5 = i6;
                        } else if (l0.g(hpack.getSTATIC_HEADER_TABLE()[i6].value, nVar)) {
                            i6++;
                            i5 = i6;
                        }
                    }
                    i5 = i6;
                    i6 = -1;
                } else {
                    i5 = -1;
                    i6 = -1;
                }
                if (i6 == -1) {
                    int i9 = this.nextHeaderIndex + 1;
                    int length = this.dynamicTable.length;
                    while (true) {
                        if (i9 >= length) {
                            break;
                        }
                        Header header2 = this.dynamicTable[i9];
                        l0.m(header2);
                        if (l0.g(header2.name, asciiLowercase)) {
                            Header header3 = this.dynamicTable[i9];
                            l0.m(header3);
                            if (l0.g(header3.value, nVar)) {
                                i6 = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i9 - this.nextHeaderIndex);
                                break;
                            } else if (i5 == -1) {
                                i5 = (i9 - this.nextHeaderIndex) + Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length;
                            }
                        }
                        i9++;
                    }
                }
                if (i6 != -1) {
                    writeInt(i6, 127, 128);
                } else if (i5 == -1) {
                    this.out.writeByte(64);
                    writeByteString(asciiLowercase);
                    writeByteString(nVar);
                    insertIntoDynamicTable(header);
                } else if (asciiLowercase.startsWith(Header.PSEUDO_PREFIX) && !l0.g(Header.TARGET_AUTHORITY, asciiLowercase)) {
                    writeInt(i5, 15, 0);
                    writeByteString(nVar);
                } else {
                    writeInt(i5, 63, 64);
                    writeByteString(nVar);
                    insertIntoDynamicTable(header);
                }
            }
        }

        public final void writeInt(int i5, int i6, int i7) {
            if (i5 < i6) {
                this.out.writeByte(i5 | i7);
                return;
            }
            this.out.writeByte(i7 | i6);
            int i8 = i5 - i6;
            while (i8 >= 128) {
                this.out.writeByte(128 | (i8 & 127));
                i8 >>>= 7;
            }
            this.out.writeByte(i8);
        }

        public /* synthetic */ Writer(int i5, boolean z4, okio.l lVar, int i6, w wVar) {
            this((i6 & 1) != 0 ? 4096 : i5, (i6 & 2) != 0 ? true : z4, lVar);
        }
    }
}
