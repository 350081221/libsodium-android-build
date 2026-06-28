package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.compose.animation.core.AnimationKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.dx.io.Opcodes;
import com.bytedance.android.live.base.api.push.ILivePush;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.cx;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.y1;
import okhttp3.internal.connection.RealConnection;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

@kotlin.i0(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0090\u0001B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0000H\u0016J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0000H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0006\u0010\u0015\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\u0000J$\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\fJ \u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0000H\u0016J\b\u0010!\u001a\u00020\u0000H\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020\u0012H\u0016J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\fH\u0087\u0002¢\u0006\u0002\b+J\u0015\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\fH\u0007¢\u0006\u0002\b-J\b\u0010.\u001a\u00020/H\u0016J\u0018\u00100\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u001dH\u0002J\u000e\u00102\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u000e\u00103\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u000e\u00104\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u0010\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)H\u0016J\u0018\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020\fH\u0016J \u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\fH\u0016J\u0010\u00105\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001dH\u0016J\u0018\u00105\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\fH\u0016J\u0010\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u001dH\u0016J\u0018\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\fH\u0016J\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020#H\u0016J\u0006\u0010?\u001a\u00020\u001dJ\b\u0010@\u001a\u00020\u0019H\u0016J\b\u0010A\u001a\u00020\u0001H\u0016J\u0018\u0010B\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001dH\u0016J(\u0010B\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0010\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020FH\u0016J\u0010\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020GH\u0016J \u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020G2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010D\u001a\u00020\f2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010H\u001a\u00020\f2\u0006\u0010E\u001a\u00020IH\u0016J\u0012\u0010J\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020KH\u0007J\b\u0010M\u001a\u00020)H\u0016J\b\u0010N\u001a\u00020GH\u0016J\u0010\u0010N\u001a\u00020G2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010O\u001a\u00020\u001dH\u0016J\u0010\u0010O\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010P\u001a\u00020\fH\u0016J\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020=J\u0016\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020=2\u0006\u0010\u001b\u001a\u00020\fJ \u0010Q\u001a\u00020\u00122\u0006\u0010R\u001a\u00020=2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010S\u001a\u00020#H\u0002J\u0010\u0010T\u001a\u00020\u00122\u0006\u0010E\u001a\u00020GH\u0016J\u0018\u0010T\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010U\u001a\u00020\fH\u0016J\b\u0010V\u001a\u00020/H\u0016J\b\u0010W\u001a\u00020/H\u0016J\b\u0010X\u001a\u00020\fH\u0016J\b\u0010Y\u001a\u00020\fH\u0016J\b\u0010Z\u001a\u00020[H\u0016J\b\u0010\\\u001a\u00020[H\u0016J\u0010\u0010]\u001a\u00020\u001f2\u0006\u0010^\u001a\u00020_H\u0016J\u0018\u0010]\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010^\u001a\u00020_H\u0016J\u0012\u0010`\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020KH\u0007J\b\u0010a\u001a\u00020\u001fH\u0016J\u0010\u0010a\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010b\u001a\u00020/H\u0016J\n\u0010c\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010d\u001a\u00020\u001fH\u0016J\u0010\u0010d\u001a\u00020\u001f2\u0006\u0010e\u001a\u00020\fH\u0016J\u0010\u0010f\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010g\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010h\u001a\u00020/2\u0006\u0010i\u001a\u00020jH\u0016J\u0006\u0010k\u001a\u00020\u001dJ\u0006\u0010l\u001a\u00020\u001dJ\u0006\u0010m\u001a\u00020\u001dJ\r\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0002\bnJ\u0010\u0010o\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0006\u0010p\u001a\u00020\u001dJ\u000e\u0010p\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020/J\b\u0010q\u001a\u00020rH\u0016J\b\u0010s\u001a\u00020\u001fH\u0016J\u0015\u0010t\u001a\u00020\n2\u0006\u0010u\u001a\u00020/H\u0000¢\u0006\u0002\bvJ\u0010\u0010w\u001a\u00020/2\u0006\u0010x\u001a\u00020FH\u0016J\u0010\u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020GH\u0016J \u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020G2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010w\u001a\u00020\u00122\u0006\u0010x\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010w\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u001dH\u0016J \u0010w\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020z2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010{\u001a\u00020\f2\u0006\u0010x\u001a\u00020zH\u0016J\u0010\u0010|\u001a\u00020\u00002\u0006\u00106\u001a\u00020/H\u0016J\u0010\u0010}\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0010\u0010\u007f\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0012\u0010\u0080\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020/H\u0016J\u0012\u0010\u0082\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020/H\u0016J\u0011\u0010\u0083\u0001\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0011\u0010\u0084\u0001\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0012\u0010\u0085\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0001\u001a\u00020/H\u0016J\u0012\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0001\u001a\u00020/H\u0016J\u001a\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0006\u0010^\u001a\u00020_H\u0016J,\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0007\u0010\u008a\u0001\u001a\u00020/2\u0007\u0010\u008b\u0001\u001a\u00020/2\u0006\u0010^\u001a\u00020_H\u0016J\u001b\u0010\u008c\u0001\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\fH\u0007J\u0012\u0010\u008d\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001fH\u0016J$\u0010\u008d\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0007\u0010\u008a\u0001\u001a\u00020/2\u0007\u0010\u008b\u0001\u001a\u00020/H\u0016J\u0012\u0010\u008e\u0001\u001a\u00020\u00002\u0007\u0010\u008f\u0001\u001a\u00020/H\u0016R\u0014\u0010\u0006\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8G@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0091\u0001"}, d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "()V", "buffer", "getBuffer", "()Lokio/Buffer;", "head", "Lokio/Segment;", "<set-?>", "", "size", "()J", "setSize$okio", "(J)V", "clear", "", "clone", ILivePush.ClickType.CLOSE, "completeSegmentByteCount", "copy", "copyTo", "out", "Ljava/io/OutputStream;", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "digest", "Lokio/ByteString;", "algorithm", "", "emit", "emitCompleteSegments", "equals", "", "other", "", "exhausted", "flush", "get", "", "pos", "getByte", "index", "-deprecated_getByte", TTDownloadField.TT_HASHCODE, "", "hmac", DatabaseFileArchive.COLUMN_KEY, "hmacSha1", "hmacSha256", "hmacSha512", "indexOf", "b", "fromIndex", "toIndex", "bytes", "indexOfElement", "targetBytes", "inputStream", "Ljava/io/InputStream;", "isOpen", TTDownloadField.TT_MD5, "outputStream", "peek", "rangeEquals", "bytesOffset", "read", "sink", "Ljava/nio/ByteBuffer;", "", "readAll", "Lokio/Sink;", "readAndWriteUnsafe", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "readByte", "readByteArray", "readByteString", "readDecimalLong", "readFrom", "input", "forever", "readFully", "readHexadecimalUnsignedLong", "readInt", "readIntLe", "readLong", "readLongLe", "readShort", "", "readShortLe", "readString", "charset", "Ljava/nio/charset/Charset;", "readUnsafe", "readUtf8", "readUtf8CodePoint", "readUtf8Line", "readUtf8LineStrict", "limit", "request", "require", "select", "options", "Lokio/Options;", "sha1", "sha256", "sha512", "-deprecated_size", "skip", "snapshot", m0.a.Z, "Lokio/Timeout;", "toString", "writableSegment", "minimumCapacity", "writableSegment$okio", "write", "source", "byteString", "Lokio/Source;", "writeAll", "writeByte", "writeDecimalLong", "v", "writeHexadecimalUnsignedLong", "writeInt", "i", "writeIntLe", "writeLong", "writeLongLe", "writeShort", bi.aE, "writeShortLe", "writeString", TypedValues.Custom.S_STRING, "beginIndex", "endIndex", "writeTo", "writeUtf8", "writeUtf8CodePoint", "codePoint", "UnsafeCursor", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 Buffer.kt\nokio/internal/-Buffer\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,641:1\n89#2:642\n86#2:675\n86#2:677\n74#2:737\n74#2:763\n83#2:802\n77#2:813\n89#2:1003\n74#2:1018\n86#2:1122\n89#2:1615\n244#3,32:643\n279#3,10:678\n292#3,18:688\n414#3,2:706\n112#3:708\n416#3:709\n114#3,18:710\n313#3,9:728\n322#3,15:738\n340#3,10:753\n350#3,3:764\n348#3,25:767\n376#3,10:792\n386#3:803\n384#3,9:804\n393#3,7:814\n391#3,20:821\n682#3,60:841\n745#3,56:901\n803#3:957\n806#3:958\n807#3,6:960\n817#3,7:966\n827#3,6:973\n835#3,5:979\n867#3,6:984\n877#3:990\n878#3,11:992\n889#3,5:1004\n898#3,9:1009\n908#3,61:1019\n633#3:1080\n636#3:1081\n637#3,5:1083\n644#3:1088\n647#3,7:1089\n656#3,20:1096\n420#3:1116\n423#3,5:1117\n428#3,10:1123\n439#3,7:1133\n444#3,2:1140\n973#3:1142\n974#3,87:1144\n1064#3,48:1231\n603#3:1279\n610#3,21:1280\n1115#3,7:1301\n1125#3,7:1308\n1135#3,4:1315\n1142#3,8:1319\n1153#3,10:1327\n1166#3,14:1337\n449#3,91:1351\n543#3,40:1442\n586#3:1482\n588#3,13:1484\n1183#3:1497\n1234#3:1498\n1235#3,39:1500\n1276#3,2:1539\n1278#3,4:1542\n1285#3,3:1546\n1289#3,4:1550\n112#3:1554\n1293#3,22:1555\n114#3,18:1577\n1319#3,2:1595\n1321#3,3:1598\n112#3:1601\n1324#3,13:1602\n1337#3,13:1616\n114#3,18:1629\n1354#3,2:1647\n1357#3:1650\n112#3:1651\n1358#3,50:1652\n114#3,18:1702\n1417#3,14:1720\n1434#3,32:1734\n1469#3,12:1766\n1484#3,18:1778\n1506#3:1796\n1507#3:1798\n1512#3,34:1799\n1#4:676\n1#4:959\n1#4:991\n1#4:1082\n1#4:1143\n1#4:1483\n1#4:1499\n1#4:1541\n1#4:1549\n1#4:1597\n1#4:1649\n1#4:1797\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer\n*L\n167#1:642\n197#1:675\n235#1:677\n261#1:737\n264#1:763\n267#1:802\n267#1:813\n335#1:1003\n338#1:1018\n374#1:1122\n483#1:1615\n181#1:643,32\n252#1:678,10\n255#1:688,18\n258#1:706,2\n258#1:708\n258#1:709\n258#1:710,18\n261#1:728,9\n261#1:738,15\n264#1:753,10\n264#1:764,3\n264#1:767,25\n267#1:792,10\n267#1:803\n267#1:804,9\n267#1:814,7\n267#1:821,20\n279#1:841,60\n282#1:901,56\n284#1:957\n287#1:958\n287#1:960,6\n289#1:966,7\n292#1:973,6\n295#1:979,5\n329#1:984,6\n335#1:990\n335#1:992,11\n335#1:1004,5\n338#1:1009,9\n338#1:1019,61\n340#1:1080\n343#1:1081\n343#1:1083,5\n345#1:1088\n348#1:1089,7\n351#1:1096,20\n371#1:1116\n374#1:1117,5\n374#1:1123,10\n376#1:1133,7\n379#1:1140,2\n384#1:1142\n384#1:1144,87\n387#1:1231,48\n410#1:1279\n416#1:1280,21\n437#1:1301,7\n441#1:1308,7\n443#1:1315,4\n445#1:1319,8\n449#1:1327,10\n453#1:1337,14\n457#1:1351,91\n460#1:1442,40\n463#1:1482\n463#1:1484,13\n465#1:1497\n465#1:1498\n465#1:1500,39\n467#1:1539,2\n467#1:1542,4\n477#1:1546,3\n477#1:1550,4\n477#1:1554\n477#1:1555,22\n477#1:1577,18\n483#1:1595,2\n483#1:1598,3\n483#1:1601\n483#1:1602,13\n483#1:1616,13\n483#1:1629,18\n488#1:1647,2\n488#1:1650\n488#1:1651\n488#1:1652,50\n488#1:1702,18\n498#1:1720,14\n568#1:1734,32\n570#1:1766,12\n578#1:1778,18\n586#1:1796\n586#1:1798\n588#1:1799,34\n287#1:959\n335#1:991\n343#1:1082\n384#1:1143\n463#1:1483\n465#1:1499\n467#1:1541\n477#1:1549\n483#1:1597\n488#1:1649\n586#1:1797\n*E\n"})
/* loaded from: classes4.dex */
public final class l implements BufferedSource, m, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    @p4.m
    @u3.e
    public i1 f20987a;

    /* renamed from: b, reason: collision with root package name */
    private long f20988b;

    @kotlin.i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\bJ\u0006\u0010\u0018\u001a\u00020\bJ\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lokio/Buffer$UnsafeCursor;", "Ljava/io/Closeable;", "()V", "buffer", "Lokio/Buffer;", "data", "", "end", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "readWrite", "", "segment", "Lokio/Segment;", "getSegment$okio", "()Lokio/Segment;", "setSegment$okio", "(Lokio/Segment;)V", "start", ILivePush.ClickType.CLOSE, "", "expandBuffer", "minByteCount", "next", "resizeBuffer", "newSize", "seek", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n+ 2 Buffer.kt\nokio/internal/-Buffer\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,641:1\n1567#2:642\n1568#2:644\n1572#2:645\n1573#2,68:647\n1644#2:715\n1645#2,32:717\n1677#2,18:750\n1698#2:768\n1699#2,18:770\n1721#2:788\n1723#2,7:790\n1#3:643\n1#3:646\n1#3:716\n1#3:769\n1#3:789\n86#4:749\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n*L\n628#1:642\n628#1:644\n630#1:645\n630#1:647,68\n632#1:715\n632#1:717,32\n632#1:750,18\n634#1:768\n634#1:770,18\n637#1:788\n637#1:790,7\n628#1:643\n630#1:646\n632#1:716\n634#1:769\n637#1:789\n632#1:749\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        @p4.m
        @u3.e
        public l f20989a;

        /* renamed from: b, reason: collision with root package name */
        @u3.e
        public boolean f20990b;

        /* renamed from: c, reason: collision with root package name */
        @p4.m
        private i1 f20991c;

        /* renamed from: e, reason: collision with root package name */
        @p4.m
        @u3.e
        public byte[] f20993e;

        /* renamed from: d, reason: collision with root package name */
        @u3.e
        public long f20992d = -1;

        /* renamed from: f, reason: collision with root package name */
        @u3.e
        public int f20994f = -1;

        /* renamed from: g, reason: collision with root package name */
        @u3.e
        public int f20995g = -1;

        public final long a(int i5) {
            boolean z4;
            boolean z5 = true;
            if (i5 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (i5 > 8192) {
                    z5 = false;
                }
                if (z5) {
                    l lVar = this.f20989a;
                    if (lVar != null) {
                        if (this.f20990b) {
                            long M0 = lVar.M0();
                            i1 P0 = lVar.P0(i5);
                            int i6 = 8192 - P0.f20930c;
                            P0.f20930c = 8192;
                            long j5 = i6;
                            lVar.I0(M0 + j5);
                            j(P0);
                            this.f20992d = M0;
                            this.f20993e = P0.f20928a;
                            this.f20994f = 8192 - i6;
                            this.f20995g = 8192;
                            return j5;
                        }
                        throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
                    }
                    throw new IllegalStateException("not attached to a buffer".toString());
                }
                throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i5).toString());
            }
            throw new IllegalArgumentException(("minByteCount <= 0: " + i5).toString());
        }

        @p4.m
        public final i1 b() {
            return this.f20991c;
        }

        public final int c() {
            boolean z4;
            long j5;
            long j6 = this.f20992d;
            l lVar = this.f20989a;
            kotlin.jvm.internal.l0.m(lVar);
            if (j6 != lVar.M0()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                long j7 = this.f20992d;
                if (j7 == -1) {
                    j5 = 0;
                } else {
                    j5 = j7 + (this.f20995g - this.f20994f);
                }
                return h(j5);
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            boolean z4;
            if (this.f20989a != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                this.f20989a = null;
                j(null);
                this.f20992d = -1L;
                this.f20993e = null;
                this.f20994f = -1;
                this.f20995g = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final long d(long j5) {
            boolean z4;
            l lVar = this.f20989a;
            if (lVar != null) {
                if (this.f20990b) {
                    long M0 = lVar.M0();
                    int i5 = 1;
                    if (j5 <= M0) {
                        if (j5 >= 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            long j6 = M0 - j5;
                            while (true) {
                                if (j6 <= 0) {
                                    break;
                                }
                                i1 i1Var = lVar.f20987a;
                                kotlin.jvm.internal.l0.m(i1Var);
                                i1 i1Var2 = i1Var.f20934g;
                                kotlin.jvm.internal.l0.m(i1Var2);
                                int i6 = i1Var2.f20930c;
                                long j7 = i6 - i1Var2.f20929b;
                                if (j7 <= j6) {
                                    lVar.f20987a = i1Var2.b();
                                    j1.d(i1Var2);
                                    j6 -= j7;
                                } else {
                                    i1Var2.f20930c = i6 - ((int) j6);
                                    break;
                                }
                            }
                            j(null);
                            this.f20992d = j5;
                            this.f20993e = null;
                            this.f20994f = -1;
                            this.f20995g = -1;
                        } else {
                            throw new IllegalArgumentException(("newSize < 0: " + j5).toString());
                        }
                    } else if (j5 > M0) {
                        long j8 = j5 - M0;
                        boolean z5 = true;
                        while (j8 > 0) {
                            i1 P0 = lVar.P0(i5);
                            int min = (int) Math.min(j8, 8192 - P0.f20930c);
                            P0.f20930c += min;
                            j8 -= min;
                            if (z5) {
                                j(P0);
                                this.f20992d = M0;
                                this.f20993e = P0.f20928a;
                                int i7 = P0.f20930c;
                                this.f20994f = i7 - min;
                                this.f20995g = i7;
                                z5 = false;
                            }
                            i5 = 1;
                        }
                    }
                    lVar.I0(j5);
                    return M0;
                }
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final int h(long j5) {
            i1 i1Var;
            l lVar = this.f20989a;
            if (lVar != null) {
                if (j5 >= -1 && j5 <= lVar.M0()) {
                    if (j5 != -1 && j5 != lVar.M0()) {
                        long M0 = lVar.M0();
                        i1 i1Var2 = lVar.f20987a;
                        long j6 = 0;
                        if (b() != null) {
                            long j7 = this.f20992d;
                            int i5 = this.f20994f;
                            kotlin.jvm.internal.l0.m(b());
                            long j8 = j7 - (i5 - r9.f20929b);
                            if (j8 > j5) {
                                i1Var = i1Var2;
                                i1Var2 = b();
                                M0 = j8;
                            } else {
                                i1Var = b();
                                j6 = j8;
                            }
                        } else {
                            i1Var = i1Var2;
                        }
                        if (M0 - j5 > j5 - j6) {
                            while (true) {
                                kotlin.jvm.internal.l0.m(i1Var);
                                int i6 = i1Var.f20930c;
                                int i7 = i1Var.f20929b;
                                if (j5 < (i6 - i7) + j6) {
                                    break;
                                }
                                j6 += i6 - i7;
                                i1Var = i1Var.f20933f;
                            }
                        } else {
                            while (M0 > j5) {
                                kotlin.jvm.internal.l0.m(i1Var2);
                                i1Var2 = i1Var2.f20934g;
                                kotlin.jvm.internal.l0.m(i1Var2);
                                M0 -= i1Var2.f20930c - i1Var2.f20929b;
                            }
                            j6 = M0;
                            i1Var = i1Var2;
                        }
                        if (this.f20990b) {
                            kotlin.jvm.internal.l0.m(i1Var);
                            if (i1Var.f20931d) {
                                i1 f5 = i1Var.f();
                                if (lVar.f20987a == i1Var) {
                                    lVar.f20987a = f5;
                                }
                                i1Var = i1Var.c(f5);
                                i1 i1Var3 = i1Var.f20934g;
                                kotlin.jvm.internal.l0.m(i1Var3);
                                i1Var3.b();
                            }
                        }
                        j(i1Var);
                        this.f20992d = j5;
                        kotlin.jvm.internal.l0.m(i1Var);
                        this.f20993e = i1Var.f20928a;
                        int i8 = i1Var.f20929b + ((int) (j5 - j6));
                        this.f20994f = i8;
                        int i9 = i1Var.f20930c;
                        this.f20995g = i9;
                        return i9 - i8;
                    }
                    j(null);
                    this.f20992d = j5;
                    this.f20993e = null;
                    this.f20994f = -1;
                    this.f20995g = -1;
                    return -1;
                }
                throw new ArrayIndexOutOfBoundsException("offset=" + j5 + " > size=" + lVar.M0());
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final void j(@p4.m i1 i1Var) {
            this.f20991c = i1Var;
        }
    }

    @kotlin.i0(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH\u0016¨\u0006\u000e"}, d2 = {"okio/Buffer$outputStream$1", "Ljava/io/OutputStream;", ILivePush.ClickType.CLOSE, "", "flush", "toString", "", "write", "data", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "byteCount", "b", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class c extends OutputStream {
        c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        @p4.l
        public String toString() {
            return l.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i5) {
            l.this.writeByte(i5);
        }

        @Override // java.io.OutputStream
        public void write(@p4.l byte[] data, int i5, int i6) {
            kotlin.jvm.internal.l0.p(data, "data");
            l.this.write(data, i5, i6);
        }
    }

    public static /* synthetic */ l A(l lVar, OutputStream outputStream, long j5, long j6, int i5, Object obj) throws IOException {
        if ((i5 & 2) != 0) {
            j5 = 0;
        }
        long j7 = j5;
        if ((i5 & 4) != 0) {
            j6 = lVar.f20988b - j7;
        }
        return lVar.p(outputStream, j7, j6);
    }

    public static /* synthetic */ a A0(l lVar, a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            aVar = i.g();
        }
        return lVar.t0(aVar);
    }

    private final void E0(InputStream inputStream, long j5, boolean z4) throws IOException {
        while (true) {
            if (j5 <= 0 && !z4) {
                return;
            }
            i1 P0 = P0(1);
            int read = inputStream.read(P0.f20928a, P0.f20930c, (int) Math.min(j5, 8192 - P0.f20930c));
            if (read == -1) {
                if (P0.f20929b == P0.f20930c) {
                    this.f20987a = P0.b();
                    j1.d(P0);
                }
                if (z4) {
                    return;
                } else {
                    throw new EOFException();
                }
            }
            P0.f20930c += read;
            long j6 = read;
            this.f20988b += j6;
            j5 -= j6;
        }
    }

    public static /* synthetic */ l H(l lVar, l lVar2, long j5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j5 = 0;
        }
        return lVar.q(lVar2, j5);
    }

    public static /* synthetic */ a H0(l lVar, a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            aVar = i.g();
        }
        return lVar.G0(aVar);
    }

    public static /* synthetic */ l I(l lVar, l lVar2, long j5, long j6, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j5 = 0;
        }
        return lVar.y(lVar2, j5, j6);
    }

    private final n J(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        i1 i1Var = this.f20987a;
        if (i1Var != null) {
            byte[] bArr = i1Var.f20928a;
            int i5 = i1Var.f20929b;
            messageDigest.update(bArr, i5, i1Var.f20930c - i5);
            i1 i1Var2 = i1Var.f20933f;
            kotlin.jvm.internal.l0.m(i1Var2);
            while (i1Var2 != i1Var) {
                byte[] bArr2 = i1Var2.f20928a;
                int i6 = i1Var2.f20929b;
                messageDigest.update(bArr2, i6, i1Var2.f20930c - i6);
                i1Var2 = i1Var2.f20933f;
                kotlin.jvm.internal.l0.m(i1Var2);
            }
        }
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.l0.o(digest, "digest(...)");
        return new n(digest);
    }

    private final n a0(String str, n nVar) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(nVar.internalArray$okio(), str));
            i1 i1Var = this.f20987a;
            if (i1Var != null) {
                byte[] bArr = i1Var.f20928a;
                int i5 = i1Var.f20929b;
                mac.update(bArr, i5, i1Var.f20930c - i5);
                i1 i1Var2 = i1Var.f20933f;
                kotlin.jvm.internal.l0.m(i1Var2);
                while (i1Var2 != i1Var) {
                    byte[] bArr2 = i1Var2.f20928a;
                    int i6 = i1Var2.f20929b;
                    mac.update(bArr2, i6, i1Var2.f20930c - i6);
                    i1Var2 = i1Var2.f20933f;
                    kotlin.jvm.internal.l0.m(i1Var2);
                }
            }
            byte[] doFinal = mac.doFinal();
            kotlin.jvm.internal.l0.o(doFinal, "doFinal(...)");
            return new n(doFinal);
        } catch (InvalidKeyException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public static /* synthetic */ l i1(l lVar, OutputStream outputStream, long j5, int i5, Object obj) throws IOException {
        if ((i5 & 2) != 0) {
            j5 = lVar.f20988b;
        }
        return lVar.h1(outputStream, j5);
    }

    @Override // okio.BufferedSource
    public int B0(@p4.l b1 options) {
        kotlin.jvm.internal.l0.p(options, "options");
        int m02 = okio.internal.a.m0(this, options, false, 2, null);
        if (m02 == -1) {
            return -1;
        }
        skip(options.e()[m02].size());
        return m02;
    }

    @p4.l
    public final l C0(@p4.l InputStream input) throws IOException {
        kotlin.jvm.internal.l0.p(input, "input");
        E0(input, Long.MAX_VALUE, true);
        return this;
    }

    @Override // okio.BufferedSource
    public boolean D(long j5, @p4.l n bytes) {
        kotlin.jvm.internal.l0.p(bytes, "bytes");
        return L(j5, bytes, 0, bytes.size());
    }

    @p4.l
    public final l D0(@p4.l InputStream input, long j5) throws IOException {
        boolean z4;
        kotlin.jvm.internal.l0.p(input, "input");
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            E0(input, j5, false);
            return this;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
    }

    @p4.l
    @u3.i
    public final a F0() {
        return H0(this, null, 1, null);
    }

    @Override // okio.m
    public long G(@p4.l n1 source) throws IOException {
        kotlin.jvm.internal.l0.p(source, "source");
        long j5 = 0;
        while (true) {
            long read = source.read(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (read != -1) {
                j5 += read;
            } else {
                return j5;
            }
        }
    }

    @p4.l
    @u3.i
    public final a G0(@p4.l a unsafeCursor) {
        kotlin.jvm.internal.l0.p(unsafeCursor, "unsafeCursor");
        return okio.internal.a.F(this, unsafeCursor);
    }

    public final void I0(long j5) {
        this.f20988b = j5;
    }

    @p4.l
    public final n J0() {
        return J("SHA-1");
    }

    @Override // okio.BufferedSource
    @p4.l
    public String K() throws EOFException {
        return z(Long.MAX_VALUE);
    }

    @p4.l
    public final n K0() {
        return J("SHA-256");
    }

    @Override // okio.BufferedSource
    public boolean L(long j5, @p4.l n bytes, int i5, int i6) {
        kotlin.jvm.internal.l0.p(bytes, "bytes");
        if (j5 < 0 || i5 < 0 || i6 < 0 || M0() - j5 < i6 || bytes.size() - i5 < i6) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            if (P(i7 + j5) != bytes.getByte(i5 + i7)) {
                return false;
            }
        }
        return true;
    }

    @p4.l
    public final n L0() {
        return J("SHA-512");
    }

    @Override // okio.m
    @p4.l
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public l k() {
        return this;
    }

    @u3.h(name = "size")
    public final long M0() {
        return this.f20988b;
    }

    @Override // okio.BufferedSource
    @p4.l
    public byte[] N(long j5) throws EOFException {
        boolean z4;
        if (j5 >= 0 && j5 <= 2147483647L) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (M0() >= j5) {
                byte[] bArr = new byte[(int) j5];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j5).toString());
    }

    @p4.l
    public final n N0() {
        boolean z4;
        if (M0() <= 2147483647L) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return O0((int) M0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + M0()).toString());
    }

    @Override // okio.m
    @p4.l
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public l x() {
        return this;
    }

    @p4.l
    public final n O0(int i5) {
        if (i5 == 0) {
            return n.EMPTY;
        }
        i.e(M0(), 0L, i5);
        i1 i1Var = this.f20987a;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i5) {
            kotlin.jvm.internal.l0.m(i1Var);
            int i9 = i1Var.f20930c;
            int i10 = i1Var.f20929b;
            if (i9 != i10) {
                i7 += i9 - i10;
                i8++;
                i1Var = i1Var.f20933f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i8];
        int[] iArr = new int[i8 * 2];
        i1 i1Var2 = this.f20987a;
        int i11 = 0;
        while (i6 < i5) {
            kotlin.jvm.internal.l0.m(i1Var2);
            bArr[i11] = i1Var2.f20928a;
            i6 += i1Var2.f20930c - i1Var2.f20929b;
            iArr[i11] = Math.min(i6, i5);
            iArr[i11 + i8] = i1Var2.f20929b;
            i1Var2.f20931d = true;
            i11++;
            i1Var2 = i1Var2.f20933f;
        }
        return new k1(bArr, iArr);
    }

    @u3.h(name = "getByte")
    public final byte P(long j5) {
        i.e(M0(), j5, 1L);
        i1 i1Var = this.f20987a;
        if (i1Var != null) {
            if (M0() - j5 < j5) {
                long M0 = M0();
                while (M0 > j5) {
                    i1Var = i1Var.f20934g;
                    kotlin.jvm.internal.l0.m(i1Var);
                    M0 -= i1Var.f20930c - i1Var.f20929b;
                }
                kotlin.jvm.internal.l0.m(i1Var);
                return i1Var.f20928a[(int) ((i1Var.f20929b + j5) - M0)];
            }
            long j6 = 0;
            while (true) {
                long j7 = (i1Var.f20930c - i1Var.f20929b) + j6;
                if (j7 <= j5) {
                    i1Var = i1Var.f20933f;
                    kotlin.jvm.internal.l0.m(i1Var);
                    j6 = j7;
                } else {
                    kotlin.jvm.internal.l0.m(i1Var);
                    return i1Var.f20928a[(int) ((i1Var.f20929b + j5) - j6)];
                }
            }
        } else {
            kotlin.jvm.internal.l0.m(null);
            throw null;
        }
    }

    @p4.l
    public final i1 P0(int i5) {
        boolean z4 = true;
        if (i5 < 1 || i5 > 8192) {
            z4 = false;
        }
        if (z4) {
            i1 i1Var = this.f20987a;
            if (i1Var == null) {
                i1 e5 = j1.e();
                this.f20987a = e5;
                e5.f20934g = e5;
                e5.f20933f = e5;
                return e5;
            }
            kotlin.jvm.internal.l0.m(i1Var);
            i1 i1Var2 = i1Var.f20934g;
            kotlin.jvm.internal.l0.m(i1Var2);
            if (i1Var2.f20930c + i5 <= 8192 && i1Var2.f20932e) {
                return i1Var2;
            }
            return i1Var2.c(j1.e());
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @Override // okio.BufferedSource
    public short Q() throws EOFException {
        return i.q(readShort());
    }

    @Override // okio.m
    @p4.l
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public l v0(@p4.l n byteString) {
        kotlin.jvm.internal.l0.p(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    @Override // okio.BufferedSource
    public long R() throws EOFException {
        return i.p(readLong());
    }

    @Override // okio.m
    @p4.l
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public l Z(@p4.l n byteString, int i5, int i6) {
        kotlin.jvm.internal.l0.p(byteString, "byteString");
        byteString.write$okio(this, i5, i6);
        return this;
    }

    @Override // okio.m
    @p4.l
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public l o0(@p4.l n1 source, long j5) throws IOException {
        kotlin.jvm.internal.l0.p(source, "source");
        while (j5 > 0) {
            long read = source.read(this, j5);
            if (read != -1) {
                j5 -= read;
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    @Override // okio.BufferedSource
    public long T(@p4.l n targetBytes, long j5) {
        boolean z4;
        int i5;
        int i6;
        kotlin.jvm.internal.l0.p(targetBytes, "targetBytes");
        long j6 = 0;
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i1 i1Var = this.f20987a;
            if (i1Var == null) {
                return -1L;
            }
            if (M0() - j5 < j5) {
                j6 = M0();
                while (j6 > j5) {
                    i1Var = i1Var.f20934g;
                    kotlin.jvm.internal.l0.m(i1Var);
                    j6 -= i1Var.f20930c - i1Var.f20929b;
                }
                if (targetBytes.size() == 2) {
                    byte b5 = targetBytes.getByte(0);
                    byte b6 = targetBytes.getByte(1);
                    while (j6 < M0()) {
                        byte[] bArr = i1Var.f20928a;
                        i5 = (int) ((i1Var.f20929b + j5) - j6);
                        int i7 = i1Var.f20930c;
                        while (i5 < i7) {
                            byte b7 = bArr[i5];
                            if (b7 != b5 && b7 != b6) {
                                i5++;
                            }
                            i6 = i1Var.f20929b;
                        }
                        j6 += i1Var.f20930c - i1Var.f20929b;
                        i1Var = i1Var.f20933f;
                        kotlin.jvm.internal.l0.m(i1Var);
                        j5 = j6;
                    }
                    return -1L;
                }
                byte[] internalArray$okio = targetBytes.internalArray$okio();
                while (j6 < M0()) {
                    byte[] bArr2 = i1Var.f20928a;
                    i5 = (int) ((i1Var.f20929b + j5) - j6);
                    int i8 = i1Var.f20930c;
                    while (i5 < i8) {
                        byte b8 = bArr2[i5];
                        for (byte b9 : internalArray$okio) {
                            if (b8 == b9) {
                                i6 = i1Var.f20929b;
                            }
                        }
                        i5++;
                    }
                    j6 += i1Var.f20930c - i1Var.f20929b;
                    i1Var = i1Var.f20933f;
                    kotlin.jvm.internal.l0.m(i1Var);
                    j5 = j6;
                }
                return -1L;
            }
            while (true) {
                long j7 = (i1Var.f20930c - i1Var.f20929b) + j6;
                if (j7 > j5) {
                    break;
                }
                i1Var = i1Var.f20933f;
                kotlin.jvm.internal.l0.m(i1Var);
                j6 = j7;
            }
            if (targetBytes.size() == 2) {
                byte b10 = targetBytes.getByte(0);
                byte b11 = targetBytes.getByte(1);
                while (j6 < M0()) {
                    byte[] bArr3 = i1Var.f20928a;
                    i5 = (int) ((i1Var.f20929b + j5) - j6);
                    int i9 = i1Var.f20930c;
                    while (i5 < i9) {
                        byte b12 = bArr3[i5];
                        if (b12 != b10 && b12 != b11) {
                            i5++;
                        }
                        i6 = i1Var.f20929b;
                    }
                    j6 += i1Var.f20930c - i1Var.f20929b;
                    i1Var = i1Var.f20933f;
                    kotlin.jvm.internal.l0.m(i1Var);
                    j5 = j6;
                }
                return -1L;
            }
            byte[] internalArray$okio2 = targetBytes.internalArray$okio();
            while (j6 < M0()) {
                byte[] bArr4 = i1Var.f20928a;
                i5 = (int) ((i1Var.f20929b + j5) - j6);
                int i10 = i1Var.f20930c;
                while (i5 < i10) {
                    byte b13 = bArr4[i5];
                    for (byte b14 : internalArray$okio2) {
                        if (b13 == b14) {
                            i6 = i1Var.f20929b;
                        }
                    }
                    i5++;
                }
                j6 += i1Var.f20930c - i1Var.f20929b;
                i1Var = i1Var.f20933f;
                kotlin.jvm.internal.l0.m(i1Var);
                j5 = j6;
            }
            return -1L;
            return (i5 - i6) + j6;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j5).toString());
    }

    @Override // okio.m
    @p4.l
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public l write(@p4.l byte[] source) {
        kotlin.jvm.internal.l0.p(source, "source");
        return write(source, 0, source.length);
    }

    @Override // okio.BufferedSource
    public void U(long j5) throws EOFException {
        if (this.f20988b < j5) {
            throw new EOFException();
        }
    }

    @Override // okio.m
    @p4.l
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public l write(@p4.l byte[] source, int i5, int i6) {
        kotlin.jvm.internal.l0.p(source, "source");
        long j5 = i6;
        i.e(source.length, i5, j5);
        int i7 = i6 + i5;
        while (i5 < i7) {
            i1 P0 = P0(1);
            int min = Math.min(i7 - i5, 8192 - P0.f20930c);
            int i8 = i5 + min;
            kotlin.collections.l.v0(source, P0.f20928a, P0.f20930c, i5, i8);
            P0.f20930c += min;
            i5 = i8;
        }
        I0(M0() + j5);
        return this;
    }

    @Override // okio.m
    @p4.l
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public l writeByte(int i5) {
        i1 P0 = P0(1);
        byte[] bArr = P0.f20928a;
        int i6 = P0.f20930c;
        P0.f20930c = i6 + 1;
        bArr[i6] = (byte) i5;
        I0(M0() + 1);
        return this;
    }

    @Override // okio.BufferedSource
    public long W(byte b5) {
        return u(b5, 0L, Long.MAX_VALUE);
    }

    @Override // okio.m
    @p4.l
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public l V(long j5) {
        boolean z4;
        if (j5 == 0) {
            return writeByte(48);
        }
        int i5 = 1;
        if (j5 < 0) {
            j5 = -j5;
            if (j5 < 0) {
                return C("-9223372036854775808");
            }
            z4 = true;
        } else {
            z4 = false;
        }
        if (j5 < 100000000) {
            if (j5 < 10000) {
                if (j5 < 100) {
                    if (j5 >= 10) {
                        i5 = 2;
                    }
                } else if (j5 < 1000) {
                    i5 = 3;
                } else {
                    i5 = 4;
                }
            } else if (j5 < AnimationKt.MillisToNanos) {
                if (j5 < 100000) {
                    i5 = 5;
                } else {
                    i5 = 6;
                }
            } else if (j5 < 10000000) {
                i5 = 7;
            } else {
                i5 = 8;
            }
        } else if (j5 < 1000000000000L) {
            if (j5 < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                if (j5 < 1000000000) {
                    i5 = 9;
                } else {
                    i5 = 10;
                }
            } else if (j5 < 100000000000L) {
                i5 = 11;
            } else {
                i5 = 12;
            }
        } else if (j5 < 1000000000000000L) {
            if (j5 < 10000000000000L) {
                i5 = 13;
            } else if (j5 < 100000000000000L) {
                i5 = 14;
            } else {
                i5 = 15;
            }
        } else if (j5 < 100000000000000000L) {
            if (j5 < 10000000000000000L) {
                i5 = 16;
            } else {
                i5 = 17;
            }
        } else if (j5 < 1000000000000000000L) {
            i5 = 18;
        } else {
            i5 = 19;
        }
        if (z4) {
            i5++;
        }
        i1 P0 = P0(i5);
        byte[] bArr = P0.f20928a;
        int i6 = P0.f20930c + i5;
        while (j5 != 0) {
            long j6 = 10;
            i6--;
            bArr[i6] = okio.internal.a.g0()[(int) (j5 % j6)];
            j5 /= j6;
        }
        if (z4) {
            bArr[i6 - 1] = 45;
        }
        P0.f20930c += i5;
        I0(M0() + i5);
        return this;
    }

    @Override // okio.BufferedSource
    @p4.l
    public String X(long j5) throws EOFException {
        return u0(j5, kotlin.text.f.f19703b);
    }

    @Override // okio.m
    @p4.l
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public l l0(long j5) {
        if (j5 == 0) {
            return writeByte(48);
        }
        long j6 = (j5 >>> 1) | j5;
        long j7 = j6 | (j6 >>> 2);
        long j8 = j7 | (j7 >>> 4);
        long j9 = j8 | (j8 >>> 8);
        long j10 = j9 | (j9 >>> 16);
        long j11 = j10 | (j10 >>> 32);
        long j12 = j11 - ((j11 >>> 1) & 6148914691236517205L);
        long j13 = ((j12 >>> 2) & 3689348814741910323L) + (j12 & 3689348814741910323L);
        long j14 = ((j13 >>> 4) + j13) & 1085102592571150095L;
        long j15 = j14 + (j14 >>> 8);
        long j16 = j15 + (j15 >>> 16);
        int i5 = (int) ((((j16 & 63) + ((j16 >>> 32) & 63)) + 3) / 4);
        i1 P0 = P0(i5);
        byte[] bArr = P0.f20928a;
        int i6 = P0.f20930c;
        for (int i7 = (i6 + i5) - 1; i7 >= i6; i7--) {
            bArr[i7] = okio.internal.a.g0()[(int) (15 & j5)];
            j5 >>>= 4;
        }
        P0.f20930c += i5;
        I0(M0() + i5);
        return this;
    }

    @Override // okio.BufferedSource
    @p4.l
    public n Y(long j5) throws EOFException {
        boolean z4;
        if (j5 >= 0 && j5 <= 2147483647L) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (M0() >= j5) {
                if (j5 >= 4096) {
                    n O0 = O0((int) j5);
                    skip(j5);
                    return O0;
                }
                return new n(N(j5));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j5).toString());
    }

    @Override // okio.m
    @p4.l
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public l writeInt(int i5) {
        i1 P0 = P0(4);
        byte[] bArr = P0.f20928a;
        int i6 = P0.f20930c;
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((i5 >>> 24) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((i5 >>> 16) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i5 >>> 8) & 255);
        bArr[i9] = (byte) (i5 & 255);
        P0.f20930c = i9 + 1;
        I0(M0() + 4);
        return this;
    }

    @Override // okio.m
    @p4.l
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public l d0(int i5) {
        return writeInt(i.o(i5));
    }

    @u3.h(name = "-deprecated_getByte")
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to operator function", replaceWith = @kotlin.b1(expression = "this[index]", imports = {}))
    public final byte a(long j5) {
        return P(j5);
    }

    @Override // okio.m
    @p4.l
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public l writeLong(long j5) {
        i1 P0 = P0(8);
        byte[] bArr = P0.f20928a;
        int i5 = P0.f20930c;
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j5 >>> 56) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j5 >>> 48) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j5 >>> 40) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((j5 >>> 32) & 255);
        int i10 = i9 + 1;
        bArr[i9] = (byte) ((j5 >>> 24) & 255);
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((j5 >>> 16) & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((j5 >>> 8) & 255);
        bArr[i12] = (byte) (j5 & 255);
        P0.f20930c = i12 + 1;
        I0(M0() + 8);
        return this;
    }

    @u3.h(name = "-deprecated_size")
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @kotlin.b1(expression = "size", imports = {}))
    public final long b() {
        return this.f20988b;
    }

    @p4.l
    public final n b0(@p4.l n key) {
        kotlin.jvm.internal.l0.p(key, "key");
        return a0("HmacSHA1", key);
    }

    @Override // okio.m
    @p4.l
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public l n(long j5) {
        return writeLong(i.p(j5));
    }

    public final void c() {
        skip(M0());
    }

    @Override // okio.BufferedSource
    @p4.l
    public byte[] c0() {
        return N(M0());
    }

    @Override // okio.m
    @p4.l
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public l writeShort(int i5) {
        i1 P0 = P0(2);
        byte[] bArr = P0.f20928a;
        int i6 = P0.f20930c;
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((i5 >>> 8) & 255);
        bArr[i7] = (byte) (i5 & 255);
        P0.f20930c = i7 + 1;
        I0(M0() + 2);
        return this;
    }

    @Override // okio.n1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @p4.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public l clone() {
        return j();
    }

    @Override // okio.m
    @p4.l
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public l h0(int i5) {
        return writeShort(i.q((short) i5));
    }

    @Override // okio.BufferedSource
    public boolean e0() {
        return this.f20988b == 0;
    }

    @Override // okio.m
    @p4.l
    /* renamed from: e1, reason: merged with bridge method [inline-methods] */
    public l S(@p4.l String string, int i5, int i6, @p4.l Charset charset) {
        boolean z4;
        boolean z5;
        kotlin.jvm.internal.l0.p(string, "string");
        kotlin.jvm.internal.l0.p(charset, "charset");
        boolean z6 = true;
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i6 >= i5) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (i6 > string.length()) {
                    z6 = false;
                }
                if (z6) {
                    if (kotlin.jvm.internal.l0.g(charset, kotlin.text.f.f19703b)) {
                        return F(string, i5, i6);
                    }
                    String substring = string.substring(i5, i6);
                    kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    byte[] bytes = substring.getBytes(charset);
                    kotlin.jvm.internal.l0.o(bytes, "this as java.lang.String).getBytes(charset)");
                    return write(bytes, 0, bytes.length);
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i6 + " > " + string.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i6 + " < " + i5).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i5).toString());
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (M0() == lVar.M0()) {
                if (M0() == 0) {
                    return true;
                }
                i1 i1Var = this.f20987a;
                kotlin.jvm.internal.l0.m(i1Var);
                i1 i1Var2 = lVar.f20987a;
                kotlin.jvm.internal.l0.m(i1Var2);
                int i5 = i1Var.f20929b;
                int i6 = i1Var2.f20929b;
                long j5 = 0;
                while (j5 < M0()) {
                    long min = Math.min(i1Var.f20930c - i5, i1Var2.f20930c - i6);
                    long j6 = 0;
                    while (j6 < min) {
                        int i7 = i5 + 1;
                        int i8 = i6 + 1;
                        if (i1Var.f20928a[i5] == i1Var2.f20928a[i6]) {
                            j6++;
                            i5 = i7;
                            i6 = i8;
                        }
                    }
                    if (i5 == i1Var.f20930c) {
                        i1Var = i1Var.f20933f;
                        kotlin.jvm.internal.l0.m(i1Var);
                        i5 = i1Var.f20929b;
                    }
                    if (i6 == i1Var2.f20930c) {
                        i1Var2 = i1Var2.f20933f;
                        kotlin.jvm.internal.l0.m(i1Var2);
                        i6 = i1Var2.f20929b;
                    }
                    j5 += min;
                }
                return true;
            }
        }
        return false;
    }

    @Override // okio.BufferedSource
    @p4.l
    public l f() {
        return this;
    }

    @p4.l
    public final n f0(@p4.l n key) {
        kotlin.jvm.internal.l0.p(key, "key");
        return a0("HmacSHA256", key);
    }

    @Override // okio.m
    @p4.l
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public l n0(@p4.l String string, @p4.l Charset charset) {
        kotlin.jvm.internal.l0.p(string, "string");
        kotlin.jvm.internal.l0.p(charset, "charset");
        return S(string, 0, string.length(), charset);
    }

    @Override // okio.m, okio.l1, java.io.Flushable
    public void flush() {
    }

    @Override // okio.BufferedSource
    @p4.l
    public l g() {
        return this;
    }

    @Override // okio.BufferedSource
    public long g0() throws EOFException {
        int i5;
        String str;
        if (M0() != 0) {
            int i6 = 0;
            boolean z4 = false;
            long j5 = 0;
            long j6 = -7;
            boolean z5 = false;
            do {
                i1 i1Var = this.f20987a;
                kotlin.jvm.internal.l0.m(i1Var);
                byte[] bArr = i1Var.f20928a;
                int i7 = i1Var.f20929b;
                int i8 = i1Var.f20930c;
                while (i7 < i8) {
                    byte b5 = bArr[i7];
                    if (b5 >= 48 && b5 <= 57) {
                        int i9 = 48 - b5;
                        if (j5 >= okio.internal.a.f20937c && (j5 != okio.internal.a.f20937c || i9 >= j6)) {
                            j5 = (j5 * 10) + i9;
                        } else {
                            l writeByte = new l().V(j5).writeByte(b5);
                            if (!z4) {
                                writeByte.readByte();
                            }
                            throw new NumberFormatException("Number too large: " + writeByte.s0());
                        }
                    } else if (b5 == 45 && i6 == 0) {
                        j6--;
                        z4 = true;
                    } else {
                        z5 = true;
                        break;
                    }
                    i7++;
                    i6++;
                }
                if (i7 == i8) {
                    this.f20987a = i1Var.b();
                    j1.d(i1Var);
                } else {
                    i1Var.f20929b = i7;
                }
                if (z5) {
                    break;
                }
            } while (this.f20987a != null);
            I0(M0() - i6);
            if (z4) {
                i5 = 2;
            } else {
                i5 = 1;
            }
            if (i6 < i5) {
                if (M0() != 0) {
                    if (z4) {
                        str = "Expected a digit";
                    } else {
                        str = "Expected a digit or '-'";
                    }
                    throw new NumberFormatException(str + " but was 0x" + i.u(P(0L)));
                }
                throw new EOFException();
            }
            if (!z4) {
                return -j5;
            }
            return j5;
        }
        throw new EOFException();
    }

    @p4.l
    @u3.i
    public final l g1(@p4.l OutputStream out) throws IOException {
        kotlin.jvm.internal.l0.p(out, "out");
        return i1(this, out, 0L, 2, null);
    }

    public final long h() {
        long M0 = M0();
        if (M0 == 0) {
            return 0L;
        }
        i1 i1Var = this.f20987a;
        kotlin.jvm.internal.l0.m(i1Var);
        i1 i1Var2 = i1Var.f20934g;
        kotlin.jvm.internal.l0.m(i1Var2);
        if (i1Var2.f20930c < 8192 && i1Var2.f20932e) {
            M0 -= r3 - i1Var2.f20929b;
        }
        return M0;
    }

    @p4.l
    @u3.i
    public final l h1(@p4.l OutputStream out, long j5) throws IOException {
        kotlin.jvm.internal.l0.p(out, "out");
        i.e(this.f20988b, 0L, j5);
        i1 i1Var = this.f20987a;
        while (j5 > 0) {
            kotlin.jvm.internal.l0.m(i1Var);
            int min = (int) Math.min(j5, i1Var.f20930c - i1Var.f20929b);
            out.write(i1Var.f20928a, i1Var.f20929b, min);
            int i5 = i1Var.f20929b + min;
            i1Var.f20929b = i5;
            long j6 = min;
            this.f20988b -= j6;
            j5 -= j6;
            if (i5 == i1Var.f20930c) {
                i1 b5 = i1Var.b();
                this.f20987a = b5;
                j1.d(i1Var);
                i1Var = b5;
            }
        }
        return this;
    }

    public int hashCode() {
        i1 i1Var = this.f20987a;
        if (i1Var == null) {
            return 0;
        }
        int i5 = 1;
        do {
            int i6 = i1Var.f20930c;
            for (int i7 = i1Var.f20929b; i7 < i6; i7++) {
                i5 = (i5 * 31) + i1Var.f20928a[i7];
            }
            i1Var = i1Var.f20933f;
            kotlin.jvm.internal.l0.m(i1Var);
        } while (i1Var != this.f20987a);
        return i5;
    }

    @Override // okio.BufferedSource
    public long i(@p4.l n bytes, long j5) throws IOException {
        boolean z4;
        boolean z5;
        long j6 = j5;
        kotlin.jvm.internal.l0.p(bytes, "bytes");
        if (bytes.size() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            long j7 = 0;
            if (j6 >= 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                i1 i1Var = this.f20987a;
                if (i1Var != null) {
                    if (M0() - j6 < j6) {
                        long M0 = M0();
                        while (M0 > j6) {
                            i1Var = i1Var.f20934g;
                            kotlin.jvm.internal.l0.m(i1Var);
                            M0 -= i1Var.f20930c - i1Var.f20929b;
                        }
                        byte[] internalArray$okio = bytes.internalArray$okio();
                        byte b5 = internalArray$okio[0];
                        int size = bytes.size();
                        long M02 = (M0() - size) + 1;
                        while (M0 < M02) {
                            byte[] bArr = i1Var.f20928a;
                            long j8 = M0;
                            int min = (int) Math.min(i1Var.f20930c, (i1Var.f20929b + M02) - M0);
                            for (int i5 = (int) ((i1Var.f20929b + j6) - j8); i5 < min; i5++) {
                                if (bArr[i5] == b5 && okio.internal.a.i0(i1Var, i5 + 1, internalArray$okio, 1, size)) {
                                    return (i5 - i1Var.f20929b) + j8;
                                }
                            }
                            M0 = j8 + (i1Var.f20930c - i1Var.f20929b);
                            i1Var = i1Var.f20933f;
                            kotlin.jvm.internal.l0.m(i1Var);
                            j6 = M0;
                        }
                    } else {
                        while (true) {
                            long j9 = (i1Var.f20930c - i1Var.f20929b) + j7;
                            if (j9 > j6) {
                                break;
                            }
                            i1Var = i1Var.f20933f;
                            kotlin.jvm.internal.l0.m(i1Var);
                            j7 = j9;
                        }
                        byte[] internalArray$okio2 = bytes.internalArray$okio();
                        byte b6 = internalArray$okio2[0];
                        int size2 = bytes.size();
                        long M03 = (M0() - size2) + 1;
                        while (j7 < M03) {
                            byte[] bArr2 = i1Var.f20928a;
                            long j10 = M03;
                            int min2 = (int) Math.min(i1Var.f20930c, (i1Var.f20929b + M03) - j7);
                            for (int i6 = (int) ((i1Var.f20929b + j6) - j7); i6 < min2; i6++) {
                                if (bArr2[i6] == b6 && okio.internal.a.i0(i1Var, i6 + 1, internalArray$okio2, 1, size2)) {
                                    return (i6 - i1Var.f20929b) + j7;
                                }
                            }
                            j7 += i1Var.f20930c - i1Var.f20929b;
                            i1Var = i1Var.f20933f;
                            kotlin.jvm.internal.l0.m(i1Var);
                            j6 = j7;
                            M03 = j10;
                        }
                    }
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j6).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    @p4.l
    public final n i0(@p4.l n key) {
        kotlin.jvm.internal.l0.p(key, "key");
        return a0("HmacSHA512", key);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @p4.l
    public final l j() {
        l lVar = new l();
        if (M0() != 0) {
            i1 i1Var = this.f20987a;
            kotlin.jvm.internal.l0.m(i1Var);
            i1 d5 = i1Var.d();
            lVar.f20987a = d5;
            d5.f20934g = d5;
            d5.f20933f = d5;
            for (i1 i1Var2 = i1Var.f20933f; i1Var2 != i1Var; i1Var2 = i1Var2.f20933f) {
                i1 i1Var3 = d5.f20934g;
                kotlin.jvm.internal.l0.m(i1Var3);
                kotlin.jvm.internal.l0.m(i1Var2);
                i1Var3.c(i1Var2.d());
            }
            lVar.I0(M0());
        }
        return lVar;
    }

    @Override // okio.BufferedSource
    @p4.l
    public String j0(@p4.l Charset charset) {
        kotlin.jvm.internal.l0.p(charset, "charset");
        return u0(this.f20988b, charset);
    }

    @Override // okio.m
    @p4.l
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public l C(@p4.l String string) {
        kotlin.jvm.internal.l0.p(string, "string");
        return F(string, 0, string.length());
    }

    @Override // okio.BufferedSource
    public int k0() throws EOFException {
        int i5;
        int i6;
        int i7;
        if (M0() != 0) {
            byte P = P(0L);
            boolean z4 = false;
            if ((P & kotlin.jvm.internal.o.f19427b) == 0) {
                i5 = P & kotlin.jvm.internal.o.f19428c;
                i7 = 0;
                i6 = 1;
            } else if ((P & 224) == 192) {
                i5 = P & 31;
                i6 = 2;
                i7 = 128;
            } else if ((P & 240) == 224) {
                i5 = P & cx.f12477m;
                i6 = 3;
                i7 = 2048;
            } else if ((P & 248) == 240) {
                i5 = P & 7;
                i6 = 4;
                i7 = 65536;
            } else {
                skip(1L);
                return q1.f21023c;
            }
            long j5 = i6;
            if (M0() >= j5) {
                for (int i8 = 1; i8 < i6; i8++) {
                    long j6 = i8;
                    byte P2 = P(j6);
                    if ((P2 & 192) == 128) {
                        i5 = (i5 << 6) | (P2 & q1.f21021a);
                    } else {
                        skip(j6);
                        return q1.f21023c;
                    }
                }
                skip(j5);
                if (i5 > 1114111) {
                    return q1.f21023c;
                }
                if (55296 <= i5 && i5 < 57344) {
                    z4 = true;
                }
                if (z4 || i5 < i7) {
                    return q1.f21023c;
                }
                return i5;
            }
            throw new EOFException("size < " + i6 + ": " + M0() + " (to read code point prefixed 0x" + i.u(P) + ')');
        }
        throw new EOFException();
    }

    @Override // okio.m
    @p4.l
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public l F(@p4.l String string, int i5, int i6) {
        boolean z4;
        boolean z5;
        boolean z6;
        char charAt;
        char c5;
        boolean z7;
        kotlin.jvm.internal.l0.p(string, "string");
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i6 >= i5) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (i6 <= string.length()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    while (i5 < i6) {
                        char charAt2 = string.charAt(i5);
                        if (charAt2 < 128) {
                            i1 P0 = P0(1);
                            byte[] bArr = P0.f20928a;
                            int i7 = P0.f20930c - i5;
                            int min = Math.min(i6, 8192 - i7);
                            int i8 = i5 + 1;
                            bArr[i5 + i7] = (byte) charAt2;
                            while (true) {
                                i5 = i8;
                                if (i5 >= min || (charAt = string.charAt(i5)) >= 128) {
                                    break;
                                }
                                i8 = i5 + 1;
                                bArr[i5 + i7] = (byte) charAt;
                            }
                            int i9 = P0.f20930c;
                            int i10 = (i7 + i5) - i9;
                            P0.f20930c = i9 + i10;
                            I0(M0() + i10);
                        } else {
                            if (charAt2 < 2048) {
                                i1 P02 = P0(2);
                                byte[] bArr2 = P02.f20928a;
                                int i11 = P02.f20930c;
                                bArr2[i11] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i11 + 1] = (byte) ((charAt2 & '?') | 128);
                                P02.f20930c = i11 + 2;
                                I0(M0() + 2);
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i12 = i5 + 1;
                                if (i12 < i6) {
                                    c5 = string.charAt(i12);
                                } else {
                                    c5 = 0;
                                }
                                if (charAt2 <= 56319) {
                                    if (56320 <= c5 && c5 < 57344) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        int i13 = (((charAt2 & 1023) << 10) | (c5 & 1023)) + 65536;
                                        i1 P03 = P0(4);
                                        byte[] bArr3 = P03.f20928a;
                                        int i14 = P03.f20930c;
                                        bArr3[i14] = (byte) ((i13 >> 18) | 240);
                                        bArr3[i14 + 1] = (byte) (((i13 >> 12) & 63) | 128);
                                        bArr3[i14 + 2] = (byte) (((i13 >> 6) & 63) | 128);
                                        bArr3[i14 + 3] = (byte) ((i13 & 63) | 128);
                                        P03.f20930c = i14 + 4;
                                        I0(M0() + 4);
                                        i5 += 2;
                                    }
                                }
                                writeByte(63);
                                i5 = i12;
                            } else {
                                i1 P04 = P0(3);
                                byte[] bArr4 = P04.f20928a;
                                int i15 = P04.f20930c;
                                bArr4[i15] = (byte) ((charAt2 >> '\f') | Opcodes.SHL_INT_LIT8);
                                bArr4[i15 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i15 + 2] = (byte) ((charAt2 & '?') | 128);
                                P04.f20930c = i15 + 3;
                                I0(M0() + 3);
                            }
                            i5++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i6 + " > " + string.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i6 + " < " + i5).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i5).toString());
    }

    @Override // okio.m
    @p4.l
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public l l(int i5) {
        if (i5 < 128) {
            writeByte(i5);
        } else if (i5 < 2048) {
            i1 P0 = P0(2);
            byte[] bArr = P0.f20928a;
            int i6 = P0.f20930c;
            bArr[i6] = (byte) ((i5 >> 6) | 192);
            bArr[i6 + 1] = (byte) ((i5 & 63) | 128);
            P0.f20930c = i6 + 2;
            I0(M0() + 2);
        } else {
            boolean z4 = false;
            if (55296 <= i5 && i5 < 57344) {
                z4 = true;
            }
            if (z4) {
                writeByte(63);
            } else if (i5 < 65536) {
                i1 P02 = P0(3);
                byte[] bArr2 = P02.f20928a;
                int i7 = P02.f20930c;
                bArr2[i7] = (byte) ((i5 >> 12) | Opcodes.SHL_INT_LIT8);
                bArr2[i7 + 1] = (byte) (((i5 >> 6) & 63) | 128);
                bArr2[i7 + 2] = (byte) ((i5 & 63) | 128);
                P02.f20930c = i7 + 3;
                I0(M0() + 3);
            } else if (i5 <= 1114111) {
                i1 P03 = P0(4);
                byte[] bArr3 = P03.f20928a;
                int i8 = P03.f20930c;
                bArr3[i8] = (byte) ((i5 >> 18) | 240);
                bArr3[i8 + 1] = (byte) (((i5 >> 12) & 63) | 128);
                bArr3[i8 + 2] = (byte) (((i5 >> 6) & 63) | 128);
                bArr3[i8 + 3] = (byte) ((i5 & 63) | 128);
                P03.f20930c = i8 + 4;
                I0(M0() + 4);
            } else {
                throw new IllegalArgumentException("Unexpected code point: 0x" + i.v(i5));
            }
        }
        return this;
    }

    @p4.l
    @u3.i
    public final l m(@p4.l OutputStream out) throws IOException {
        kotlin.jvm.internal.l0.p(out, "out");
        return A(this, out, 0L, 0L, 6, null);
    }

    @Override // okio.BufferedSource
    @p4.l
    public n m0() {
        return Y(M0());
    }

    @p4.l
    @u3.i
    public final l o(@p4.l OutputStream out, long j5) throws IOException {
        kotlin.jvm.internal.l0.p(out, "out");
        return A(this, out, j5, 0L, 4, null);
    }

    @p4.l
    @u3.i
    public final l p(@p4.l OutputStream out, long j5, long j6) throws IOException {
        kotlin.jvm.internal.l0.p(out, "out");
        i.e(this.f20988b, j5, j6);
        if (j6 == 0) {
            return this;
        }
        i1 i1Var = this.f20987a;
        while (true) {
            kotlin.jvm.internal.l0.m(i1Var);
            int i5 = i1Var.f20930c;
            int i6 = i1Var.f20929b;
            if (j5 < i5 - i6) {
                break;
            }
            j5 -= i5 - i6;
            i1Var = i1Var.f20933f;
        }
        while (j6 > 0) {
            kotlin.jvm.internal.l0.m(i1Var);
            int min = (int) Math.min(i1Var.f20930c - r9, j6);
            out.write(i1Var.f20928a, (int) (i1Var.f20929b + j5), min);
            j6 -= min;
            i1Var = i1Var.f20933f;
            j5 = 0;
        }
        return this;
    }

    @p4.l
    public final n p0() {
        return J("MD5");
    }

    @Override // okio.BufferedSource
    @p4.l
    public BufferedSource peek() {
        return y0.e(new e1(this));
    }

    @p4.l
    public final l q(@p4.l l out, long j5) {
        kotlin.jvm.internal.l0.p(out, "out");
        return y(out, j5, this.f20988b - j5);
    }

    @Override // okio.BufferedSource
    public int q0() throws EOFException {
        return i.o(readInt());
    }

    @Override // okio.BufferedSource
    public long r(@p4.l n bytes) throws IOException {
        kotlin.jvm.internal.l0.p(bytes, "bytes");
        return i(bytes, 0L);
    }

    @p4.l
    @u3.i
    public final a r0() {
        return A0(this, null, 1, null);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@p4.l ByteBuffer sink) throws IOException {
        kotlin.jvm.internal.l0.p(sink, "sink");
        i1 i1Var = this.f20987a;
        if (i1Var == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), i1Var.f20930c - i1Var.f20929b);
        sink.put(i1Var.f20928a, i1Var.f20929b, min);
        int i5 = i1Var.f20929b + min;
        i1Var.f20929b = i5;
        this.f20988b -= min;
        if (i5 == i1Var.f20930c) {
            this.f20987a = i1Var.b();
            j1.d(i1Var);
        }
        return min;
    }

    @Override // okio.BufferedSource
    public byte readByte() throws EOFException {
        if (M0() != 0) {
            i1 i1Var = this.f20987a;
            kotlin.jvm.internal.l0.m(i1Var);
            int i5 = i1Var.f20929b;
            int i6 = i1Var.f20930c;
            int i7 = i5 + 1;
            byte b5 = i1Var.f20928a[i5];
            I0(M0() - 1);
            if (i7 == i6) {
                this.f20987a = i1Var.b();
                j1.d(i1Var);
            } else {
                i1Var.f20929b = i7;
            }
            return b5;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public void readFully(@p4.l byte[] sink) throws EOFException {
        kotlin.jvm.internal.l0.p(sink, "sink");
        int i5 = 0;
        while (i5 < sink.length) {
            int read = read(sink, i5, sink.length - i5);
            if (read != -1) {
                i5 += read;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // okio.BufferedSource
    public int readInt() throws EOFException {
        if (M0() >= 4) {
            i1 i1Var = this.f20987a;
            kotlin.jvm.internal.l0.m(i1Var);
            int i5 = i1Var.f20929b;
            int i6 = i1Var.f20930c;
            if (i6 - i5 < 4) {
                return ((readByte() & y1.f19838d) << 24) | ((readByte() & y1.f19838d) << 16) | ((readByte() & y1.f19838d) << 8) | (readByte() & y1.f19838d);
            }
            byte[] bArr = i1Var.f20928a;
            int i7 = i5 + 1;
            int i8 = i7 + 1;
            int i9 = ((bArr[i5] & y1.f19838d) << 24) | ((bArr[i7] & y1.f19838d) << 16);
            int i10 = i8 + 1;
            int i11 = i9 | ((bArr[i8] & y1.f19838d) << 8);
            int i12 = i10 + 1;
            int i13 = i11 | (bArr[i10] & y1.f19838d);
            I0(M0() - 4);
            if (i12 == i6) {
                this.f20987a = i1Var.b();
                j1.d(i1Var);
            } else {
                i1Var.f20929b = i12;
            }
            return i13;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public long readLong() throws EOFException {
        if (M0() >= 8) {
            i1 i1Var = this.f20987a;
            kotlin.jvm.internal.l0.m(i1Var);
            int i5 = i1Var.f20929b;
            int i6 = i1Var.f20930c;
            if (i6 - i5 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = i1Var.f20928a;
            long j5 = (bArr[i5] & 255) << 56;
            int i7 = i5 + 1 + 1 + 1;
            long j6 = j5 | ((bArr[r7] & 255) << 48) | ((bArr[r1] & 255) << 40);
            long j7 = j6 | ((bArr[i7] & 255) << 32) | ((bArr[r1] & 255) << 24);
            long j8 = j7 | ((bArr[r8] & 255) << 16);
            long j9 = j8 | ((bArr[r1] & 255) << 8);
            int i8 = i7 + 1 + 1 + 1 + 1 + 1;
            long j10 = j9 | (bArr[r8] & 255);
            I0(M0() - 8);
            if (i8 == i6) {
                this.f20987a = i1Var.b();
                j1.d(i1Var);
            } else {
                i1Var.f20929b = i8;
            }
            return j10;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public short readShort() throws EOFException {
        if (M0() >= 2) {
            i1 i1Var = this.f20987a;
            kotlin.jvm.internal.l0.m(i1Var);
            int i5 = i1Var.f20929b;
            int i6 = i1Var.f20930c;
            if (i6 - i5 < 2) {
                return (short) (((readByte() & y1.f19838d) << 8) | (readByte() & y1.f19838d));
            }
            byte[] bArr = i1Var.f20928a;
            int i7 = i5 + 1;
            int i8 = i7 + 1;
            int i9 = ((bArr[i5] & y1.f19838d) << 8) | (bArr[i7] & y1.f19838d);
            I0(M0() - 2);
            if (i8 == i6) {
                this.f20987a = i1Var.b();
                j1.d(i1Var);
            } else {
                i1Var.f20929b = i8;
            }
            return (short) i9;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public boolean request(long j5) {
        return this.f20988b >= j5;
    }

    @Override // okio.BufferedSource
    public long s(byte b5, long j5) {
        return u(b5, j5, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    @p4.l
    public String s0() {
        return u0(this.f20988b, kotlin.text.f.f19703b);
    }

    @Override // okio.BufferedSource
    public void skip(long j5) throws EOFException {
        while (j5 > 0) {
            i1 i1Var = this.f20987a;
            if (i1Var != null) {
                int min = (int) Math.min(j5, i1Var.f20930c - i1Var.f20929b);
                long j6 = min;
                I0(M0() - j6);
                j5 -= j6;
                int i5 = i1Var.f20929b + min;
                i1Var.f20929b = i5;
                if (i5 == i1Var.f20930c) {
                    this.f20987a = i1Var.b();
                    j1.d(i1Var);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // okio.BufferedSource
    public void t(@p4.l l sink, long j5) throws EOFException {
        kotlin.jvm.internal.l0.p(sink, "sink");
        if (M0() >= j5) {
            sink.write(this, j5);
        } else {
            sink.write(this, M0());
            throw new EOFException();
        }
    }

    @p4.l
    @u3.i
    public final a t0(@p4.l a unsafeCursor) {
        kotlin.jvm.internal.l0.p(unsafeCursor, "unsafeCursor");
        return okio.internal.a.s(this, unsafeCursor);
    }

    @Override // okio.n1
    @p4.l
    public p1 timeout() {
        return p1.NONE;
    }

    @p4.l
    public String toString() {
        return N0().toString();
    }

    @Override // okio.BufferedSource
    public long u(byte b5, long j5, long j6) {
        i1 i1Var;
        int i5;
        long j7 = 0;
        boolean z4 = false;
        if (0 <= j5 && j5 <= j6) {
            z4 = true;
        }
        if (z4) {
            if (j6 > M0()) {
                j6 = M0();
            }
            if (j5 == j6 || (i1Var = this.f20987a) == null) {
                return -1L;
            }
            if (M0() - j5 < j5) {
                j7 = M0();
                while (j7 > j5) {
                    i1Var = i1Var.f20934g;
                    kotlin.jvm.internal.l0.m(i1Var);
                    j7 -= i1Var.f20930c - i1Var.f20929b;
                }
                while (j7 < j6) {
                    byte[] bArr = i1Var.f20928a;
                    int min = (int) Math.min(i1Var.f20930c, (i1Var.f20929b + j6) - j7);
                    i5 = (int) ((i1Var.f20929b + j5) - j7);
                    while (i5 < min) {
                        if (bArr[i5] != b5) {
                            i5++;
                        }
                    }
                    j7 += i1Var.f20930c - i1Var.f20929b;
                    i1Var = i1Var.f20933f;
                    kotlin.jvm.internal.l0.m(i1Var);
                    j5 = j7;
                }
                return -1L;
            }
            while (true) {
                long j8 = (i1Var.f20930c - i1Var.f20929b) + j7;
                if (j8 > j5) {
                    break;
                }
                i1Var = i1Var.f20933f;
                kotlin.jvm.internal.l0.m(i1Var);
                j7 = j8;
            }
            while (j7 < j6) {
                byte[] bArr2 = i1Var.f20928a;
                int min2 = (int) Math.min(i1Var.f20930c, (i1Var.f20929b + j6) - j7);
                i5 = (int) ((i1Var.f20929b + j5) - j7);
                while (i5 < min2) {
                    if (bArr2[i5] != b5) {
                        i5++;
                    }
                }
                j7 += i1Var.f20930c - i1Var.f20929b;
                i1Var = i1Var.f20933f;
                kotlin.jvm.internal.l0.m(i1Var);
                j5 = j7;
            }
            return -1L;
            return (i5 - i1Var.f20929b) + j7;
        }
        throw new IllegalArgumentException(("size=" + M0() + " fromIndex=" + j5 + " toIndex=" + j6).toString());
    }

    @Override // okio.BufferedSource
    @p4.l
    public String u0(long j5, @p4.l Charset charset) throws EOFException {
        boolean z4;
        kotlin.jvm.internal.l0.p(charset, "charset");
        if (j5 >= 0 && j5 <= 2147483647L) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (this.f20988b >= j5) {
                if (j5 == 0) {
                    return "";
                }
                i1 i1Var = this.f20987a;
                kotlin.jvm.internal.l0.m(i1Var);
                int i5 = i1Var.f20929b;
                if (i5 + j5 > i1Var.f20930c) {
                    return new String(N(j5), charset);
                }
                int i6 = (int) j5;
                String str = new String(i1Var.f20928a, i5, i6, charset);
                int i7 = i1Var.f20929b + i6;
                i1Var.f20929b = i7;
                this.f20988b -= j5;
                if (i7 == i1Var.f20930c) {
                    this.f20987a = i1Var.b();
                    j1.d(i1Var);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j5).toString());
    }

    @Override // okio.BufferedSource
    public long v(@p4.l n targetBytes) {
        kotlin.jvm.internal.l0.p(targetBytes, "targetBytes");
        return T(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    @p4.m
    public String w() throws EOFException {
        long W = W((byte) 10);
        if (W != -1) {
            return okio.internal.a.j0(this, W);
        }
        if (M0() != 0) {
            return X(M0());
        }
        return null;
    }

    @Override // okio.BufferedSource
    public long w0(@p4.l l1 sink) throws IOException {
        kotlin.jvm.internal.l0.p(sink, "sink");
        long M0 = M0();
        if (M0 > 0) {
            sink.write(this, M0);
        }
        return M0;
    }

    @Override // okio.m
    @p4.l
    public OutputStream x0() {
        return new c();
    }

    @p4.l
    public final l y(@p4.l l out, long j5, long j6) {
        kotlin.jvm.internal.l0.p(out, "out");
        i.e(M0(), j5, j6);
        if (j6 != 0) {
            out.I0(out.M0() + j6);
            i1 i1Var = this.f20987a;
            while (true) {
                kotlin.jvm.internal.l0.m(i1Var);
                int i5 = i1Var.f20930c;
                int i6 = i1Var.f20929b;
                if (j5 < i5 - i6) {
                    break;
                }
                j5 -= i5 - i6;
                i1Var = i1Var.f20933f;
            }
            while (j6 > 0) {
                kotlin.jvm.internal.l0.m(i1Var);
                i1 d5 = i1Var.d();
                int i7 = d5.f20929b + ((int) j5);
                d5.f20929b = i7;
                d5.f20930c = Math.min(i7 + ((int) j6), d5.f20930c);
                i1 i1Var2 = out.f20987a;
                if (i1Var2 == null) {
                    d5.f20934g = d5;
                    d5.f20933f = d5;
                    out.f20987a = d5;
                } else {
                    kotlin.jvm.internal.l0.m(i1Var2);
                    i1 i1Var3 = i1Var2.f20934g;
                    kotlin.jvm.internal.l0.m(i1Var3);
                    i1Var3.c(d5);
                }
                j6 -= d5.f20930c - d5.f20929b;
                i1Var = i1Var.f20933f;
                j5 = 0;
            }
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa A[EDGE_INSN: B:41:0x00aa->B:38:0x00aa BREAK  A[LOOP:0: B:4:0x000d->B:40:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long y0() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.M0()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb4
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            okio.i1 r6 = r14.f20987a
            kotlin.jvm.internal.l0.m(r6)
            byte[] r7 = r6.f20928a
            int r8 = r6.f20929b
            int r9 = r6.f20930c
        L18:
            if (r8 >= r9) goto L96
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3f
        L27:
            r11 = 97
            if (r10 < r11) goto L34
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L34
            int r11 = r10 + (-97)
        L31:
            int r11 = r11 + 10
            goto L3f
        L34:
            r11 = 65
            if (r10 < r11) goto L77
            r11 = 70
            if (r10 > r11) goto L77
            int r11 = r10 + (-65)
            goto L31
        L3f:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4f
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4f:
            okio.l r0 = new okio.l
            r0.<init>()
            okio.l r0 = r0.l0(r4)
            okio.l r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.s0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L77:
            if (r0 == 0) goto L7b
            r1 = 1
            goto L96
        L7b:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = okio.i.u(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L96:
            if (r8 != r9) goto La2
            okio.i1 r7 = r6.b()
            r14.f20987a = r7
            okio.j1.d(r6)
            goto La4
        La2:
            r6.f20929b = r8
        La4:
            if (r1 != 0) goto Laa
            okio.i1 r6 = r14.f20987a
            if (r6 != 0) goto Ld
        Laa:
            long r1 = r14.M0()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.I0(r1)
            return r4
        Lb4:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.l.y0():long");
    }

    @Override // okio.BufferedSource
    @p4.l
    public String z(long j5) throws EOFException {
        boolean z4;
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            long j6 = Long.MAX_VALUE;
            if (j5 != Long.MAX_VALUE) {
                j6 = j5 + 1;
            }
            long u4 = u((byte) 10, 0L, j6);
            if (u4 != -1) {
                return okio.internal.a.j0(this, u4);
            }
            if (j6 < M0() && P(j6 - 1) == 13 && P(j6) == 10) {
                return okio.internal.a.j0(this, j6);
            }
            l lVar = new l();
            y(lVar, 0L, Math.min(32, M0()));
            throw new EOFException("\\n not found: limit=" + Math.min(M0(), j5) + " content=" + lVar.m0().hex() + kotlin.text.k0.F);
        }
        throw new IllegalArgumentException(("limit < 0: " + j5).toString());
    }

    @Override // okio.BufferedSource
    @p4.l
    public InputStream z0() {
        return new b();
    }

    @kotlin.i0(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"okio/Buffer$inputStream$1", "Ljava/io/InputStream;", "available", "", ILivePush.ClickType.CLOSE, "", "read", "sink", "", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "toString", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,641:1\n74#2:642\n86#2:643\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n*L\n126#1:642\n136#1:643\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(l.this.M0(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (l.this.M0() > 0) {
                return l.this.readByte() & y1.f19838d;
            }
            return -1;
        }

        @p4.l
        public String toString() {
            return l.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(@p4.l byte[] sink, int i5, int i6) {
            kotlin.jvm.internal.l0.p(sink, "sink");
            return l.this.read(sink, i5, i6);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@p4.l ByteBuffer source) throws IOException {
        kotlin.jvm.internal.l0.p(source, "source");
        int remaining = source.remaining();
        int i5 = remaining;
        while (i5 > 0) {
            i1 P0 = P0(1);
            int min = Math.min(i5, 8192 - P0.f20930c);
            source.get(P0.f20928a, P0.f20930c, min);
            i5 -= min;
            P0.f20930c += min;
        }
        this.f20988b += remaining;
        return remaining;
    }

    @Override // okio.BufferedSource
    public int read(@p4.l byte[] sink) {
        kotlin.jvm.internal.l0.p(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.l1
    public void write(@p4.l l source, long j5) {
        i1 i1Var;
        kotlin.jvm.internal.l0.p(source, "source");
        if (source != this) {
            i.e(source.M0(), 0L, j5);
            while (j5 > 0) {
                i1 i1Var2 = source.f20987a;
                kotlin.jvm.internal.l0.m(i1Var2);
                int i5 = i1Var2.f20930c;
                kotlin.jvm.internal.l0.m(source.f20987a);
                if (j5 < i5 - r2.f20929b) {
                    i1 i1Var3 = this.f20987a;
                    if (i1Var3 != null) {
                        kotlin.jvm.internal.l0.m(i1Var3);
                        i1Var = i1Var3.f20934g;
                    } else {
                        i1Var = null;
                    }
                    if (i1Var != null && i1Var.f20932e) {
                        if ((i1Var.f20930c + j5) - (i1Var.f20931d ? 0 : i1Var.f20929b) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            i1 i1Var4 = source.f20987a;
                            kotlin.jvm.internal.l0.m(i1Var4);
                            i1Var4.g(i1Var, (int) j5);
                            source.I0(source.M0() - j5);
                            I0(M0() + j5);
                            return;
                        }
                    }
                    i1 i1Var5 = source.f20987a;
                    kotlin.jvm.internal.l0.m(i1Var5);
                    source.f20987a = i1Var5.e((int) j5);
                }
                i1 i1Var6 = source.f20987a;
                kotlin.jvm.internal.l0.m(i1Var6);
                long j6 = i1Var6.f20930c - i1Var6.f20929b;
                source.f20987a = i1Var6.b();
                i1 i1Var7 = this.f20987a;
                if (i1Var7 == null) {
                    this.f20987a = i1Var6;
                    i1Var6.f20934g = i1Var6;
                    i1Var6.f20933f = i1Var6;
                } else {
                    kotlin.jvm.internal.l0.m(i1Var7);
                    i1 i1Var8 = i1Var7.f20934g;
                    kotlin.jvm.internal.l0.m(i1Var8);
                    i1Var8.c(i1Var6).a();
                }
                source.I0(source.M0() - j6);
                I0(M0() + j6);
                j5 -= j6;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @Override // okio.BufferedSource
    public int read(@p4.l byte[] sink, int i5, int i6) {
        kotlin.jvm.internal.l0.p(sink, "sink");
        i.e(sink.length, i5, i6);
        i1 i1Var = this.f20987a;
        if (i1Var == null) {
            return -1;
        }
        int min = Math.min(i6, i1Var.f20930c - i1Var.f20929b);
        byte[] bArr = i1Var.f20928a;
        int i7 = i1Var.f20929b;
        kotlin.collections.l.v0(bArr, sink, i5, i7, i7 + min);
        i1Var.f20929b += min;
        I0(M0() - min);
        if (i1Var.f20929b == i1Var.f20930c) {
            this.f20987a = i1Var.b();
            j1.d(i1Var);
        }
        return min;
    }

    @Override // okio.n1
    public long read(@p4.l l sink, long j5) {
        kotlin.jvm.internal.l0.p(sink, "sink");
        if (!(j5 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
        }
        if (M0() == 0) {
            return -1L;
        }
        if (j5 > M0()) {
            j5 = M0();
        }
        sink.write(this, j5);
        return j5;
    }
}
