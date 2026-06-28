package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.android.live.base.api.push.ILivePush;
import com.umeng.analytics.pro.bi;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

@kotlin.i0(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0001H\u0016J\b\u0010\u0011\u001a\u00020\u0001H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001eH\u0016J \u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001bH\u0016J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#H\u0016J \u0010\u001a\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001bH\u0016J\u0018\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020$2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010%\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020$H\u0016J\u0010\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u001bH\u0016J\u0010\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u0010*\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u0010+\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u001bH\u0016J\u0010\u0010-\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u001bH\u0016J\u0010\u0010.\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u0010/\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u001bH\u0016J\u0010\u00102\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u001bH\u0016J\u0018\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u000206H\u0016J(\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001b2\u0006\u00105\u001a\u000206H\u0016J\u0010\u00109\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u0019H\u0016J \u00109\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001bH\u0016J\u0010\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u001bH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lokio/RealBufferedSink;", "Lokio/BufferedSink;", "sink", "Lokio/Sink;", "(Lokio/Sink;)V", "buffer", "Lokio/Buffer;", "getBuffer$annotations", "()V", "getBuffer", "()Lokio/Buffer;", "bufferField", "closed", "", ILivePush.ClickType.CLOSE, "", "emit", "emitCompleteSegments", "flush", "isOpen", "outputStream", "Ljava/io/OutputStream;", m0.a.Z, "Lokio/Timeout;", "toString", "", "write", "", "source", "Ljava/nio/ByteBuffer;", "", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "", "byteString", "Lokio/ByteString;", "Lokio/Source;", "writeAll", "writeByte", "b", "writeDecimalLong", "v", "writeHexadecimalUnsignedLong", "writeInt", "i", "writeIntLe", "writeLong", "writeLongLe", "writeShort", bi.aE, "writeShortLe", "writeString", TypedValues.Custom.S_STRING, "charset", "Ljava/nio/charset/Charset;", "beginIndex", "endIndex", "writeUtf8", "writeUtf8CodePoint", "codePoint", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 2 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n51#1:146\n51#1:152\n51#1:157\n51#1:162\n51#1:167\n51#1:172\n51#1:175\n51#1:176\n51#1:180\n51#1:185\n51#1:188\n51#1:192\n51#1:201\n51#1:210\n51#1:215\n51#1:220\n51#1:225\n51#1:230\n51#1:235\n51#1:240\n51#1:245\n51#1:250\n51#1:255\n51#1:261\n51#1:267\n51#1:279\n34#2:143\n35#2:145\n36#2,2:147\n40#2:149\n41#2:151\n42#2:153\n50#2:154\n51#2:156\n52#2:158\n56#2:159\n57#2:161\n58#2:163\n66#2:164\n67#2:166\n68#2:168\n72#2:169\n73#2:171\n74#2:173\n78#2:177\n79#2:179\n80#2:181\n88#2:182\n89#2:184\n90#2:186\n94#2,3:189\n97#2,5:193\n105#2,3:198\n108#2,5:202\n116#2:207\n117#2:209\n118#2:211\n122#2:212\n123#2:214\n124#2:216\n128#2:217\n129#2:219\n130#2:221\n134#2:222\n135#2:224\n136#2:226\n140#2:227\n141#2:229\n142#2:231\n146#2:232\n147#2:234\n148#2:236\n152#2:237\n153#2:239\n154#2:241\n158#2:242\n159#2:244\n160#2:246\n164#2:247\n165#2:249\n166#2:251\n170#2:252\n171#2:254\n172#2,2:256\n177#2:258\n178#2:260\n179#2,2:262\n184#2:264\n185#2:266\n186#2,4:268\n192#2,7:272\n199#2,16:280\n216#2:296\n218#2:297\n1#3:144\n1#3:150\n1#3:155\n1#3:160\n1#3:165\n1#3:170\n1#3:174\n1#3:178\n1#3:183\n1#3:187\n1#3:208\n1#3:213\n1#3:218\n1#3:223\n1#3:228\n1#3:233\n1#3:238\n1#3:243\n1#3:248\n1#3:253\n1#3:259\n1#3:265\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n55#1:146\n56#1:152\n58#1:157\n59#1:162\n61#1:167\n63#1:172\n67#1:175\n78#1:176\n82#1:180\n84#1:185\n88#1:188\n93#1:192\n94#1:201\n95#1:210\n96#1:215\n97#1:220\n98#1:225\n99#1:230\n100#1:235\n101#1:240\n102#1:245\n103#1:250\n104#1:255\n105#1:261\n134#1:267\n138#1:279\n55#1:143\n55#1:145\n55#1:147,2\n56#1:149\n56#1:151\n56#1:153\n58#1:154\n58#1:156\n58#1:158\n59#1:159\n59#1:161\n59#1:163\n61#1:164\n61#1:166\n61#1:168\n63#1:169\n63#1:171\n63#1:173\n82#1:177\n82#1:179\n82#1:181\n84#1:182\n84#1:184\n84#1:186\n93#1:189,3\n93#1:193,5\n94#1:198,3\n94#1:202,5\n95#1:207\n95#1:209\n95#1:211\n96#1:212\n96#1:214\n96#1:216\n97#1:217\n97#1:219\n97#1:221\n98#1:222\n98#1:224\n98#1:226\n99#1:227\n99#1:229\n99#1:231\n100#1:232\n100#1:234\n100#1:236\n101#1:237\n101#1:239\n101#1:241\n102#1:242\n102#1:244\n102#1:246\n103#1:247\n103#1:249\n103#1:251\n104#1:252\n104#1:254\n104#1:256,2\n105#1:258\n105#1:260\n105#1:262,2\n134#1:264\n134#1:266\n134#1:268,4\n138#1:272,7\n138#1:280,16\n139#1:296\n140#1:297\n55#1:144\n56#1:150\n58#1:155\n59#1:160\n61#1:165\n63#1:170\n82#1:178\n84#1:183\n95#1:208\n96#1:213\n97#1:218\n98#1:223\n99#1:228\n100#1:233\n101#1:238\n102#1:243\n103#1:248\n104#1:253\n105#1:259\n134#1:265\n*E\n"})
/* loaded from: classes4.dex */
public final class g1 implements m {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    @u3.e
    public final l1 f20914a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    @u3.e
    public final l f20915b;

    /* renamed from: c, reason: collision with root package name */
    @u3.e
    public boolean f20916c;

    public g1(@p4.l l1 sink) {
        kotlin.jvm.internal.l0.p(sink, "sink");
        this.f20914a = sink;
        this.f20915b = new l();
    }

    public static /* synthetic */ void a() {
    }

    @Override // okio.m
    @p4.l
    public m C(@p4.l String string) {
        kotlin.jvm.internal.l0.p(string, "string");
        if (!this.f20916c) {
            this.f20915b.C(string);
            return x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.m
    @p4.l
    public m F(@p4.l String string, int i5, int i6) {
        kotlin.jvm.internal.l0.p(string, "string");
        if (!this.f20916c) {
            this.f20915b.F(string, i5, i6);
            return x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.m
    public long G(@p4.l n1 source) {
        kotlin.jvm.internal.l0.p(source, "source");
        long j5 = 0;
        while (true) {
            long read = source.read(this.f20915b, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (read != -1) {
                j5 += read;
                x();
            } else {
                return j5;
            }
        }
    }

    @Override // okio.m
    @p4.l
    public m S(@p4.l String string, int i5, int i6, @p4.l Charset charset) {
        kotlin.jvm.internal.l0.p(string, "string");
        kotlin.jvm.internal.l0.p(charset, "charset");
        if (!this.f20916c) {
            this.f20915b.S(string, i5, i6, charset);
            return x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.m
    @p4.l
    public m V(long j5) {
        if (!this.f20916c) {
            this.f20915b.V(j5);
            return x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.m
    @p4.l
    public m Z(@p4.l n byteString, int i5, int i6) {
        kotlin.jvm.internal.l0.p(byteString, "byteString");
        if (!this.f20916c) {
            this.f20915b.Z(byteString, i5, i6);
            return x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.l1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f20916c) {
            try {
                if (this.f20915b.M0() > 0) {
                    l1 l1Var = this.f20914a;
                    l lVar = this.f20915b;
                    l1Var.write(lVar, lVar.M0());
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f20914a.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f20916c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // okio.m
    @p4.l
    public m d0(int i5) {
        if (!this.f20916c) {
            this.f20915b.d0(i5);
            return x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.m
    @p4.l
    public l f() {
        return this.f20915b;
    }

    @Override // okio.m, okio.l1, java.io.Flushable
    public void flush() {
        if (!this.f20916c) {
            if (this.f20915b.M0() > 0) {
                l1 l1Var = this.f20914a;
                l lVar = this.f20915b;
                l1Var.write(lVar, lVar.M0());
            }
            this.f20914a.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.m
    @p4.l
    public l g() {
        return this.f20915b;
    }

    @Override // okio.m
    @p4.l
    public m h0(int i5) {
        if (!this.f20916c) {
            this.f20915b.h0(i5);
            return x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f20916c;
    }

    @Override // okio.m
    @p4.l
    public m k() {
        if (!this.f20916c) {
            long M0 = this.f20915b.M0();
            if (M0 > 0) {
                this.f20914a.write(this.f20915b, M0);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.m
    @p4.l
    public m l(int i5) {
        if (!this.f20916c) {
            this.f20915b.l(i5);
            return x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.m
    @p4.l
    public m l0(long j5) {
        if (!this.f20916c) {
            this.f20915b.l0(j5);
            return x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.m
    @p4.l
    public m n(long j5) {
        if (!this.f20916c) {
            this.f20915b.n(j5);
            return x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.m
    @p4.l
    public m n0(@p4.l String string, @p4.l Charset charset) {
        kotlin.jvm.internal.l0.p(string, "string");
        kotlin.jvm.internal.l0.p(charset, "charset");
        if (!this.f20916c) {
            this.f20915b.n0(string, charset);
            return x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.m
    @p4.l
    public m o0(@p4.l n1 source, long j5) {
        kotlin.jvm.internal.l0.p(source, "source");
        while (j5 > 0) {
            long read = source.read(this.f20915b, j5);
            if (read != -1) {
                j5 -= read;
                x();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    @Override // okio.l1
    @p4.l
    public p1 timeout() {
        return this.f20914a.timeout();
    }

    @p4.l
    public String toString() {
        return "buffer(" + this.f20914a + ')';
    }

    @Override // okio.m
    @p4.l
    public m v0(@p4.l n byteString) {
        kotlin.jvm.internal.l0.p(byteString, "byteString");
        if (!this.f20916c) {
            this.f20915b.v0(byteString);
            return x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@p4.l ByteBuffer source) {
        kotlin.jvm.internal.l0.p(source, "source");
        if (!this.f20916c) {
            int write = this.f20915b.write(source);
            x();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.m
    @p4.l
    public m writeByte(int i5) {
        if (!this.f20916c) {
            this.f20915b.writeByte(i5);
            return x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.m
    @p4.l
    public m writeInt(int i5) {
        if (!this.f20916c) {
            this.f20915b.writeInt(i5);
            return x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.m
    @p4.l
    public m writeLong(long j5) {
        if (!this.f20916c) {
            this.f20915b.writeLong(j5);
            return x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.m
    @p4.l
    public m writeShort(int i5) {
        if (!this.f20916c) {
            this.f20915b.writeShort(i5);
            return x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.m
    @p4.l
    public m x() {
        if (!this.f20916c) {
            long h5 = this.f20915b.h();
            if (h5 > 0) {
                this.f20914a.write(this.f20915b, h5);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.m
    @p4.l
    public OutputStream x0() {
        return new a();
    }

    @kotlin.i0(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH\u0016¨\u0006\u000e"}, d2 = {"okio/RealBufferedSink$outputStream$1", "Ljava/io/OutputStream;", ILivePush.ClickType.CLOSE, "", "flush", "toString", "", "write", "data", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "byteCount", "b", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink$outputStream$1\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n1#1,142:1\n51#2:143\n51#2:144\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink$outputStream$1\n*L\n111#1:143\n117#1:144\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            g1.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            g1 g1Var = g1.this;
            if (!g1Var.f20916c) {
                g1Var.flush();
            }
        }

        @p4.l
        public String toString() {
            return g1.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i5) {
            g1 g1Var = g1.this;
            if (!g1Var.f20916c) {
                g1Var.f20915b.writeByte((byte) i5);
                g1.this.x();
                return;
            }
            throw new IOException("closed");
        }

        @Override // java.io.OutputStream
        public void write(@p4.l byte[] data, int i5, int i6) {
            kotlin.jvm.internal.l0.p(data, "data");
            g1 g1Var = g1.this;
            if (!g1Var.f20916c) {
                g1Var.f20915b.write(data, i5, i6);
                g1.this.x();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // okio.l1
    public void write(@p4.l l source, long j5) {
        kotlin.jvm.internal.l0.p(source, "source");
        if (!this.f20916c) {
            this.f20915b.write(source, j5);
            x();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.m
    @p4.l
    public m write(@p4.l byte[] source) {
        kotlin.jvm.internal.l0.p(source, "source");
        if (!this.f20916c) {
            this.f20915b.write(source);
            return x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.m
    @p4.l
    public m write(@p4.l byte[] source, int i5, int i6) {
        kotlin.jvm.internal.l0.p(source, "source");
        if (!this.f20916c) {
            this.f20915b.write(source, i5, i6);
            return x();
        }
        throw new IllegalStateException("closed".toString());
    }
}
