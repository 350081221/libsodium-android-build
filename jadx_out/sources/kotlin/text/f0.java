package kotlin.text;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.swift.sandhook.annotation.MethodReflectParams;
import com.tendcloud.tenddata.cq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.b1;
import kotlin.collections.s0;
import kotlin.g1;
import kotlin.jvm.internal.r1;
import kotlin.q1;
import kotlin.t0;
import kotlin.u0;
import kotlin.v2;

@kotlin.i0(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010\u0011\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001f\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086\u0002\u001a\u001f\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086\u0002\u001a\u0015\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0087\n\u001a\u0018\u0010\u0017\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u0018\u0010\u0018\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001c\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a:\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001aE\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0002\b!\u001a:\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010#\u001a\u00020\u0010*\u00020\u00022\u0006\u0010$\u001a\u00020\u0006\u001a7\u0010%\u001a\u0002H&\"\f\b\u0000\u0010'*\u00020\u0002*\u0002H&\"\u0004\b\u0001\u0010&*\u0002H'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H&0)H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010*\u001a7\u0010+\u001a\u0002H&\"\f\b\u0000\u0010'*\u00020\u0002*\u0002H&\"\u0004\b\u0001\u0010&*\u0002H'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H&0)H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010*\u001a&\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a;\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0002\b.\u001a&\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u00100\u001a\u00020\u0006*\u00020\u00022\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a,\u00100\u001a\u00020\u0006*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\r\u00103\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a\r\u00104\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a\r\u00105\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a \u00106\u001a\u00020\u0010*\u0004\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a \u00107\u001a\u00020\u0010*\u0004\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u00108\u001a\u000209*\u00020\u0002H\u0086\u0002\u001a&\u0010:\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u0010:\u001a\u00020\u0006*\u00020\u00022\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u0010;\u001a\u00020\u0006*\u00020\u00022\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a,\u0010;\u001a\u00020\u0006*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u0002\u001a\u0010\u0010>\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u0002\u001a\u0015\u0010@\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0087\f\u001a\u000f\u0010A\u001a\u00020\r*\u0004\u0018\u00010\rH\u0087\b\u001a\u001c\u0010B\u001a\u00020\u0002*\u00020\u00022\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010B\u001a\u00020\r*\u00020\r2\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010E\u001a\u00020\u0002*\u00020\u00022\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010E\u001a\u00020\r*\u00020\r2\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001aG\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010=*\u00020\u00022\u000e\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010J\u001a=\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010=*\u00020\u00022\u0006\u0010G\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0002\bI\u001a4\u0010K\u001a\u00020\u0010*\u00020\u00022\u0006\u0010L\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010M\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\u0012\u0010N\u001a\u00020\u0002*\u00020\u00022\u0006\u0010O\u001a\u00020\u0002\u001a\u0012\u0010N\u001a\u00020\r*\u00020\r2\u0006\u0010O\u001a\u00020\u0002\u001a\u001a\u0010P\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006\u001a\u0012\u0010P\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u001d\u0010P\u001a\u00020\r*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010P\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u0001H\u0087\b\u001a\u0012\u0010R\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010R\u001a\u00020\r*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010S\u001a\u00020\u0002*\u00020\u00022\u0006\u0010T\u001a\u00020\u0002\u001a\u001a\u0010S\u001a\u00020\u0002*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010S\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u0002\u001a\u001a\u0010S\u001a\u00020\r*\u00020\r2\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a.\u0010U\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0014\b\b\u0010V\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u00020WH\u0087\bø\u0001\u0000\u001a\u001d\u0010U\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\rH\u0087\b\u001a$\u0010Z\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010Z\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010\\\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010\\\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010]\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010]\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010^\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010^\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001d\u0010_\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\rH\u0087\b\u001a)\u0010`\u001a\u00020\r*\u00020\r2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140WH\u0087\bø\u0001\u0000¢\u0006\u0002\ba\u001a)\u0010`\u001a\u00020\r*\u00020\r2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020WH\u0087\bø\u0001\u0000¢\u0006\u0002\bb\u001a\"\u0010c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u0002\u001a\u001a\u0010c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020\u0002\u001a%\u0010c\u001a\u00020\r*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u0002H\u0087\b\u001a\u001d\u0010c\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020\u0002H\u0087\b\u001a=\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0012\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H\"\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010e\u001a0\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\n\u0010G\u001a\u000202\"\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u001a/\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0006\u0010T\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0002\bf\u001a%\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0087\b\u001a=\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\u0012\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H\"\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010h\u001a0\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\n\u0010G\u001a\u000202\"\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u001a%\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0087\b\u001a\u001c\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a$\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010j\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u001d\u0010j\u001a\u00020\u0002*\u00020\r2\u0006\u0010k\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\u0006H\u0087\b\u001a\u001f\u0010m\u001a\u00020\r*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020\u0006H\u0087\b\u001a\u0012\u0010m\u001a\u00020\r*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u0012\u0010m\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u0001\u001a\u001c\u0010n\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010n\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010o\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010o\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010p\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010p\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010q\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010q\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\f\u0010r\u001a\u00020\u0010*\u00020\rH\u0007\u001a\u0013\u0010s\u001a\u0004\u0018\u00010\u0010*\u00020\rH\u0007¢\u0006\u0002\u0010t\u001a\n\u0010u\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010u\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010u\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010u\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010u\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010u\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\u001a\n\u0010w\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010w\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010w\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010w\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010w\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010w\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\u001a\n\u0010x\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010x\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010x\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010x\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010x\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010x\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006y"}, d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "lastIndex", "", "getLastIndex", "(Ljava/lang/CharSequence;)I", "requireNonNegativeLimit", "", "limit", "commonPrefixWith", "", "other", "ignoreCase", "", "commonSuffixWith", "contains", MethodReflectParams.CHAR, "", "regex", "Lkotlin/text/Regex;", "contentEqualsIgnoreCaseImpl", "contentEqualsImpl", "endsWith", "suffix", "findAnyOf", "Lkotlin/Pair;", "strings", "", "startIndex", "last", "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", "hasSurrogatePairAt", "index", "ifBlank", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ifEmpty", "indexOf", "endIndex", "indexOf$StringsKt__StringsKt", TypedValues.Custom.S_STRING, "indexOfAny", "chars", "", "isEmpty", "isNotBlank", "isNotEmpty", "isNullOrBlank", "isNullOrEmpty", "iterator", "Lkotlin/collections/CharIterator;", "lastIndexOf", "lastIndexOfAny", "lineSequence", "Lkotlin/sequences/Sequence;", "lines", "", "matches", "orEmpty", "padEnd", cq.a.LENGTH, "padChar", "padStart", "rangesDelimitedBy", "delimiters", "", "rangesDelimitedBy$StringsKt__StringsKt", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "regionMatchesImpl", "thisOffset", "otherOffset", "removePrefix", "prefix", "removeRange", "range", "removeSuffix", "removeSurrounding", "delimiter", "replace", "transform", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "replacement", "replaceAfter", "missingDelimiterValue", "replaceAfterLast", "replaceBefore", "replaceBeforeLast", "replaceFirst", "replaceFirstChar", "replaceFirstCharWithChar", "replaceFirstCharWithCharSequence", "replaceRange", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "startsWith", "subSequence", "start", "end", "substring", "substringAfter", "substringAfterLast", "substringBefore", "substringBeforeLast", "toBooleanStrict", "toBooleanStrictOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "trim", "predicate", "trimEnd", "trimStart", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@r1({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n79#1,22:1487\n113#1,5:1509\n130#1,5:1514\n79#1,22:1519\n107#1:1541\n79#1,22:1542\n113#1,5:1564\n124#1:1569\n113#1,5:1570\n130#1,5:1575\n141#1:1580\n130#1,5:1581\n79#1,22:1586\n113#1,5:1608\n130#1,5:1613\n12554#2,2:1618\n12554#2,2:1620\n288#3,2:1622\n288#3,2:1624\n1549#3:1627\n1620#3,3:1628\n1549#3:1631\n1620#3,3:1632\n1#4:1626\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n107#1:1487,22\n124#1:1509,5\n141#1:1514,5\n146#1:1519,22\n151#1:1541\n151#1:1542,22\n156#1:1564,5\n161#1:1569\n161#1:1570,5\n166#1:1575,5\n171#1:1580\n171#1:1581,5\n176#1:1586,22\n187#1:1608,5\n198#1:1613,5\n940#1:1618,2\n964#1:1620,2\n1003#1:1622,2\n1009#1:1624,2\n1309#1:1627\n1309#1:1628,3\n1334#1:1631\n1334#1:1632,3\n*E\n"})
/* loaded from: classes4.dex */
public class f0 extends e0 {

    @kotlin.i0(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"kotlin/text/StringsKt__StringsKt$iterator$1", "Lkotlin/collections/CharIterator;", "index", "", "hasNext", "", "nextChar", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.collections.t {

        /* renamed from: a */
        private int f19712a;

        /* renamed from: b */
        final /* synthetic */ CharSequence f19713b;

        a(CharSequence charSequence) {
            this.f19713b = charSequence;
        }

        @Override // kotlin.collections.t
        public char b() {
            CharSequence charSequence = this.f19713b;
            int i5 = this.f19712a;
            this.f19712a = i5 + 1;
            return charSequence.charAt(i5);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19712a < this.f19713b.length();
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "currentIndex", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.n0 implements v3.p<CharSequence, Integer, u0<? extends Integer, ? extends Integer>> {
        final /* synthetic */ char[] $delimiters;
        final /* synthetic */ boolean $ignoreCase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(char[] cArr, boolean z4) {
            super(2);
            this.$delimiters = cArr;
            this.$ignoreCase = z4;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ u0<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return invoke(charSequence, num.intValue());
        }

        @p4.m
        public final u0<Integer, Integer> invoke(@p4.l CharSequence $receiver, int i5) {
            kotlin.jvm.internal.l0.p($receiver, "$this$$receiver");
            int r32 = f0.r3($receiver, this.$delimiters, i5, this.$ignoreCase);
            if (r32 < 0) {
                return null;
            }
            return q1.a(Integer.valueOf(r32), 1);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "currentIndex", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.n0 implements v3.p<CharSequence, Integer, u0<? extends Integer, ? extends Integer>> {
        final /* synthetic */ List<String> $delimitersList;
        final /* synthetic */ boolean $ignoreCase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<String> list, boolean z4) {
            super(2);
            this.$delimitersList = list;
            this.$ignoreCase = z4;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ u0<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return invoke(charSequence, num.intValue());
        }

        @p4.m
        public final u0<Integer, Integer> invoke(@p4.l CharSequence $receiver, int i5) {
            kotlin.jvm.internal.l0.p($receiver, "$this$$receiver");
            u0 b32 = f0.b3($receiver, this.$delimitersList, i5, this.$ignoreCase, false);
            if (b32 != null) {
                return q1.a(b32.getFirst(), Integer.valueOf(((String) b32.getSecond()).length()));
            }
            return null;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/ranges/IntRange;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.n0 implements v3.l<kotlin.ranges.l, String> {
        final /* synthetic */ CharSequence $this_splitToSequence;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CharSequence charSequence) {
            super(1);
            this.$this_splitToSequence = charSequence;
        }

        @Override // v3.l
        @p4.l
        public final String invoke(@p4.l kotlin.ranges.l it) {
            kotlin.jvm.internal.l0.p(it, "it");
            return f0.h5(this.$this_splitToSequence, it);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/ranges/IntRange;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.n0 implements v3.l<kotlin.ranges.l, String> {
        final /* synthetic */ CharSequence $this_splitToSequence;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CharSequence charSequence) {
            super(1);
            this.$this_splitToSequence = charSequence;
        }

        @Override // v3.l
        @p4.l
        public final String invoke(@p4.l kotlin.ranges.l it) {
            kotlin.jvm.internal.l0.p(it, "it");
            return f0.h5(this.$this_splitToSequence, it);
        }
    }

    public static final int A3(@p4.l CharSequence charSequence, char c5, int i5, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        if (!z4 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c5, i5);
        }
        return F3(charSequence, new char[]{c5}, i5, z4);
    }

    @p4.l
    public static final String A4(@p4.l String str, @p4.l String delimiter, @p4.l String replacement, @p4.l String missingDelimiterValue) {
        int D3;
        CharSequence G4;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(delimiter, "delimiter");
        kotlin.jvm.internal.l0.p(replacement, "replacement");
        kotlin.jvm.internal.l0.p(missingDelimiterValue, "missingDelimiterValue");
        D3 = D3(str, delimiter, 0, false, 6, null);
        if (D3 != -1) {
            G4 = G4(str, 0, D3, replacement);
            return G4.toString();
        }
        return missingDelimiterValue;
    }

    @g1(version = "1.5")
    public static final boolean A5(@p4.l String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        if (kotlin.jvm.internal.l0.g(str, "true")) {
            return true;
        }
        if (kotlin.jvm.internal.l0.g(str, "false")) {
            return false;
        }
        throw new IllegalArgumentException("The string doesn't represent a boolean value: " + str);
    }

    public static final int B3(@p4.l CharSequence charSequence, @p4.l String string, int i5, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(string, "string");
        if (!z4 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(string, i5);
        }
        return m3(charSequence, string, i5, 0, z4, true);
    }

    public static /* synthetic */ String B4(String str, char c5, String str2, String str3, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str3 = str;
        }
        return z4(str, c5, str2, str3);
    }

    @g1(version = "1.5")
    @p4.m
    public static final Boolean B5(@p4.l String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        if (kotlin.jvm.internal.l0.g(str, "true")) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.l0.g(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static /* synthetic */ int C3(CharSequence charSequence, char c5, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = g3(charSequence);
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        return A3(charSequence, c5, i5, z4);
    }

    public static /* synthetic */ String C4(String str, String str2, String str3, String str4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str4 = str;
        }
        return A4(str, str2, str3, str4);
    }

    @p4.l
    public static CharSequence C5(@p4.l CharSequence charSequence) {
        int i5;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i6 = 0;
        boolean z4 = false;
        while (i6 <= length) {
            if (!z4) {
                i5 = i6;
            } else {
                i5 = length;
            }
            boolean r5 = kotlin.text.d.r(charSequence.charAt(i5));
            if (!z4) {
                if (!r5) {
                    z4 = true;
                } else {
                    i6++;
                }
            } else {
                if (!r5) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i6, length + 1);
    }

    public static /* synthetic */ int D3(CharSequence charSequence, String str, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = g3(charSequence);
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        return B3(charSequence, str, i5, z4);
    }

    @kotlin.internal.f
    private static final String D4(CharSequence charSequence, r regex, String replacement) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(regex, "regex");
        kotlin.jvm.internal.l0.p(replacement, "replacement");
        return regex.replaceFirst(charSequence, replacement);
    }

    @p4.l
    public static final CharSequence D5(@p4.l CharSequence charSequence, @p4.l v3.l<? super Character, Boolean> predicate) {
        int i5;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        int i6 = 0;
        boolean z4 = false;
        while (i6 <= length) {
            if (!z4) {
                i5 = i6;
            } else {
                i5 = length;
            }
            boolean booleanValue = predicate.invoke(Character.valueOf(charSequence.charAt(i5))).booleanValue();
            if (!z4) {
                if (!booleanValue) {
                    z4 = true;
                } else {
                    i6++;
                }
            } else {
                if (!booleanValue) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i6, length + 1);
    }

    public static final int E3(@p4.l CharSequence charSequence, @p4.l Collection<String> strings, int i5, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(strings, "strings");
        u0<Integer, String> b32 = b3(charSequence, strings, i5, z4, true);
        if (b32 != null) {
            return b32.getFirst().intValue();
        }
        return -1;
    }

    @u3.h(name = "replaceFirstCharWithChar")
    @g1(version = "1.5")
    @t0
    @v2(markerClass = {kotlin.r.class})
    @kotlin.internal.f
    private static final String E4(String str, v3.l<? super Character, Character> transform) {
        boolean z4;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(transform, "transform");
        if (str.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            char charValue = transform.invoke(Character.valueOf(str.charAt(0))).charValue();
            String substring = str.substring(1);
            kotlin.jvm.internal.l0.o(substring, "this as java.lang.String).substring(startIndex)");
            return charValue + substring;
        }
        return str;
    }

    @p4.l
    public static final CharSequence E5(@p4.l CharSequence charSequence, @p4.l char... chars) {
        int i5;
        boolean n8;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(chars, "chars");
        int length = charSequence.length() - 1;
        int i6 = 0;
        boolean z4 = false;
        while (i6 <= length) {
            if (!z4) {
                i5 = i6;
            } else {
                i5 = length;
            }
            n8 = kotlin.collections.p.n8(chars, charSequence.charAt(i5));
            if (!z4) {
                if (!n8) {
                    z4 = true;
                } else {
                    i6++;
                }
            } else {
                if (!n8) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i6, length + 1);
    }

    public static final int F3(@p4.l CharSequence charSequence, @p4.l char[] chars, int i5, boolean z4) {
        int g32;
        int B;
        char Vs;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(chars, "chars");
        if (!z4 && chars.length == 1 && (charSequence instanceof String)) {
            Vs = kotlin.collections.p.Vs(chars);
            return ((String) charSequence).lastIndexOf(Vs, i5);
        }
        g32 = g3(charSequence);
        for (B = kotlin.ranges.u.B(i5, g32); -1 < B; B--) {
            char charAt = charSequence.charAt(B);
            int length = chars.length;
            boolean z5 = false;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (kotlin.text.e.J(chars[i6], charAt, z4)) {
                    z5 = true;
                    break;
                }
                i6++;
            }
            if (z5) {
                return B;
            }
        }
        return -1;
    }

    @u3.h(name = "replaceFirstCharWithCharSequence")
    @g1(version = "1.5")
    @t0
    @v2(markerClass = {kotlin.r.class})
    @kotlin.internal.f
    private static final String F4(String str, v3.l<? super Character, ? extends CharSequence> transform) {
        boolean z4;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(transform, "transform");
        if (str.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) transform.invoke(Character.valueOf(str.charAt(0))));
            String substring = str.substring(1);
            kotlin.jvm.internal.l0.o(substring, "this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            return sb.toString();
        }
        return str;
    }

    @kotlin.internal.f
    private static final String F5(String str) {
        CharSequence C5;
        kotlin.jvm.internal.l0.p(str, "<this>");
        C5 = C5(str);
        return C5.toString();
    }

    public static /* synthetic */ int G3(CharSequence charSequence, Collection collection, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = g3(charSequence);
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        return E3(charSequence, collection, i5, z4);
    }

    @p4.l
    public static CharSequence G4(@p4.l CharSequence charSequence, int i5, int i6, @p4.l CharSequence replacement) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(replacement, "replacement");
        if (i6 >= i5) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i5);
            kotlin.jvm.internal.l0.o(sb, "this.append(value, startIndex, endIndex)");
            sb.append(replacement);
            sb.append(charSequence, i6, charSequence.length());
            kotlin.jvm.internal.l0.o(sb, "this.append(value, startIndex, endIndex)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i6 + ") is less than start index (" + i5 + ").");
    }

    @p4.l
    public static final String G5(@p4.l String str, @p4.l v3.l<? super Character, Boolean> predicate) {
        int i5;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        int length = str.length() - 1;
        int i6 = 0;
        boolean z4 = false;
        while (i6 <= length) {
            if (!z4) {
                i5 = i6;
            } else {
                i5 = length;
            }
            boolean booleanValue = predicate.invoke(Character.valueOf(str.charAt(i5))).booleanValue();
            if (!z4) {
                if (!booleanValue) {
                    z4 = true;
                } else {
                    i6++;
                }
            } else {
                if (!booleanValue) {
                    break;
                }
                length--;
            }
        }
        return str.subSequence(i6, length + 1).toString();
    }

    public static /* synthetic */ int H3(CharSequence charSequence, char[] cArr, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = g3(charSequence);
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        return F3(charSequence, cArr, i5, z4);
    }

    @p4.l
    public static final CharSequence H4(@p4.l CharSequence charSequence, @p4.l kotlin.ranges.l range, @p4.l CharSequence replacement) {
        CharSequence G4;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(range, "range");
        kotlin.jvm.internal.l0.p(replacement, "replacement");
        G4 = G4(charSequence, range.getStart().intValue(), range.getEndInclusive().intValue() + 1, replacement);
        return G4;
    }

    @p4.l
    public static final String H5(@p4.l String str, @p4.l char... chars) {
        int i5;
        boolean n8;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(chars, "chars");
        int length = str.length() - 1;
        int i6 = 0;
        boolean z4 = false;
        while (i6 <= length) {
            if (!z4) {
                i5 = i6;
            } else {
                i5 = length;
            }
            n8 = kotlin.collections.p.n8(chars, str.charAt(i5));
            if (!z4) {
                if (!n8) {
                    z4 = true;
                } else {
                    i6++;
                }
            } else {
                if (!n8) {
                    break;
                }
                length--;
            }
        }
        return str.subSequence(i6, length + 1).toString();
    }

    @p4.l
    public static final kotlin.sequences.m<String> I3(@p4.l CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        return X4(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    @kotlin.internal.f
    private static final String I4(String str, int i5, int i6, CharSequence replacement) {
        CharSequence G4;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(replacement, "replacement");
        G4 = G4(str, i5, i6, replacement);
        return G4.toString();
    }

    @p4.l
    public static final CharSequence I5(@p4.l CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (!kotlin.text.d.r(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
        }
        return "";
    }

    @p4.l
    public static final List<String> J3(@p4.l CharSequence charSequence) {
        List<String> c32;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        c32 = kotlin.sequences.u.c3(I3(charSequence));
        return c32;
    }

    @kotlin.internal.f
    private static final String J4(String str, kotlin.ranges.l range, CharSequence replacement) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(range, "range");
        kotlin.jvm.internal.l0.p(replacement, "replacement");
        return H4(str, range, replacement).toString();
    }

    @p4.l
    public static final CharSequence J5(@p4.l CharSequence charSequence, @p4.l v3.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i5 = length - 1;
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i5 >= 0) {
                length = i5;
            } else {
                return "";
            }
        }
    }

    @kotlin.internal.f
    private static final boolean K3(CharSequence charSequence, r regex) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(regex, "regex");
        return regex.matches(charSequence);
    }

    public static final void K4(int i5) {
        if (i5 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i5).toString());
    }

    @p4.l
    public static final CharSequence K5(@p4.l CharSequence charSequence, @p4.l char... chars) {
        boolean n8;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(chars, "chars");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                n8 = kotlin.collections.p.n8(chars, charSequence.charAt(length));
                if (!n8) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
        }
        return "";
    }

    @p4.l
    public static final String L2(@p4.l CharSequence charSequence, @p4.l CharSequence other, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        int min = Math.min(charSequence.length(), other.length());
        int i5 = 0;
        while (i5 < min && kotlin.text.e.J(charSequence.charAt(i5), other.charAt(i5), z4)) {
            i5++;
        }
        int i6 = i5 - 1;
        if (h3(charSequence, i6) || h3(other, i6)) {
            i5--;
        }
        return charSequence.subSequence(0, i5).toString();
    }

    @kotlin.internal.f
    private static final String L3(String str) {
        return str == null ? "" : str;
    }

    @kotlin.internal.f
    private static final List<String> L4(CharSequence charSequence, r regex, int i5) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(regex, "regex");
        return regex.split(charSequence, i5);
    }

    @kotlin.internal.f
    private static final String L5(String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return I5(str).toString();
    }

    public static /* synthetic */ String M2(CharSequence charSequence, CharSequence charSequence2, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return L2(charSequence, charSequence2, z4);
    }

    @p4.l
    public static final CharSequence M3(@p4.l CharSequence charSequence, int i5, char c5) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        if (i5 >= 0) {
            if (i5 <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(i5);
            sb.append(charSequence);
            s0 it = new kotlin.ranges.l(1, i5 - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.nextInt();
                sb.append(c5);
            }
            return sb;
        }
        throw new IllegalArgumentException("Desired length " + i5 + " is less than zero.");
    }

    @p4.l
    public static final List<String> M4(@p4.l CharSequence charSequence, @p4.l char[] delimiters, boolean z4, int i5) {
        Iterable N;
        int Y;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return O4(charSequence, String.valueOf(delimiters[0]), z4, i5);
        }
        N = kotlin.sequences.u.N(W3(charSequence, delimiters, 0, z4, i5, 2, null));
        Y = kotlin.collections.x.Y(N, 10);
        ArrayList arrayList = new ArrayList(Y);
        Iterator it = N.iterator();
        while (it.hasNext()) {
            arrayList.add(h5(charSequence, (kotlin.ranges.l) it.next()));
        }
        return arrayList;
    }

    @p4.l
    public static final String M5(@p4.l String str, @p4.l v3.l<? super Character, Boolean> predicate) {
        CharSequence charSequence;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (!predicate.invoke(Character.valueOf(str.charAt(length))).booleanValue()) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    @p4.l
    public static final String N2(@p4.l CharSequence charSequence, @p4.l CharSequence other, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        int length = charSequence.length();
        int min = Math.min(length, other.length());
        int i5 = 0;
        while (i5 < min && kotlin.text.e.J(charSequence.charAt((length - i5) - 1), other.charAt((r1 - i5) - 1), z4)) {
            i5++;
        }
        if (h3(charSequence, (length - i5) - 1) || h3(other, (r1 - i5) - 1)) {
            i5--;
        }
        return charSequence.subSequence(length - i5, length).toString();
    }

    @p4.l
    public static final String N3(@p4.l String str, int i5, char c5) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return M3(str, i5, c5).toString();
    }

    @p4.l
    public static final List<String> N4(@p4.l CharSequence charSequence, @p4.l String[] delimiters, boolean z4, int i5) {
        Iterable N;
        int Y;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(delimiters, "delimiters");
        boolean z5 = true;
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                z5 = false;
            }
            if (!z5) {
                return O4(charSequence, str, z4, i5);
            }
        }
        N = kotlin.sequences.u.N(X3(charSequence, delimiters, 0, z4, i5, 2, null));
        Y = kotlin.collections.x.Y(N, 10);
        ArrayList arrayList = new ArrayList(Y);
        Iterator it = N.iterator();
        while (it.hasNext()) {
            arrayList.add(h5(charSequence, (kotlin.ranges.l) it.next()));
        }
        return arrayList;
    }

    @p4.l
    public static final String N5(@p4.l String str, @p4.l char... chars) {
        CharSequence charSequence;
        boolean n8;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(chars, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                n8 = kotlin.collections.p.n8(chars, str.charAt(length));
                if (!n8) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static /* synthetic */ String O2(CharSequence charSequence, CharSequence charSequence2, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return N2(charSequence, charSequence2, z4);
    }

    public static /* synthetic */ CharSequence O3(CharSequence charSequence, int i5, char c5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            c5 = ' ';
        }
        return M3(charSequence, i5, c5);
    }

    private static final List<String> O4(CharSequence charSequence, String str, boolean z4, int i5) {
        List<String> k5;
        boolean z5;
        K4(i5);
        int i6 = 0;
        int l32 = l3(charSequence, str, 0, z4);
        if (l32 != -1 && i5 != 1) {
            if (i5 > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            int i7 = 10;
            if (z5) {
                i7 = kotlin.ranges.u.B(i5, 10);
            }
            ArrayList arrayList = new ArrayList(i7);
            do {
                arrayList.add(charSequence.subSequence(i6, l32).toString());
                i6 = str.length() + l32;
                if (z5 && arrayList.size() == i5 - 1) {
                    break;
                }
                l32 = l3(charSequence, str, i6, z4);
            } while (l32 != -1);
            arrayList.add(charSequence.subSequence(i6, charSequence.length()).toString());
            return arrayList;
        }
        k5 = kotlin.collections.v.k(charSequence.toString());
        return k5;
    }

    @p4.l
    public static final CharSequence O5(@p4.l CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        int length = charSequence.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (!kotlin.text.d.r(charSequence.charAt(i5))) {
                return charSequence.subSequence(i5, charSequence.length());
            }
        }
        return "";
    }

    public static final boolean P2(@p4.l CharSequence charSequence, char c5, boolean z4) {
        int o32;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        o32 = o3(charSequence, c5, 0, z4, 2, null);
        if (o32 >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String P3(String str, int i5, char c5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            c5 = ' ';
        }
        return N3(str, i5, c5);
    }

    static /* synthetic */ List P4(CharSequence charSequence, r regex, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(regex, "regex");
        return regex.split(charSequence, i5);
    }

    @p4.l
    public static final CharSequence P5(@p4.l CharSequence charSequence, @p4.l v3.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        int length = charSequence.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i5))).booleanValue()) {
                return charSequence.subSequence(i5, charSequence.length());
            }
        }
        return "";
    }

    public static boolean Q2(@p4.l CharSequence charSequence, @p4.l CharSequence other, boolean z4) {
        int p32;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        if (other instanceof String) {
            p32 = p3(charSequence, (String) other, 0, z4, 2, null);
            if (p32 >= 0) {
                return true;
            }
        } else if (n3(charSequence, other, 0, charSequence.length(), z4, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    @p4.l
    public static final CharSequence Q3(@p4.l CharSequence charSequence, int i5, char c5) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        if (i5 >= 0) {
            if (i5 <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(i5);
            s0 it = new kotlin.ranges.l(1, i5 - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.nextInt();
                sb.append(c5);
            }
            sb.append(charSequence);
            return sb;
        }
        throw new IllegalArgumentException("Desired length " + i5 + " is less than zero.");
    }

    public static /* synthetic */ List Q4(CharSequence charSequence, char[] cArr, boolean z4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z4 = false;
        }
        if ((i6 & 4) != 0) {
            i5 = 0;
        }
        return M4(charSequence, cArr, z4, i5);
    }

    @p4.l
    public static final CharSequence Q5(@p4.l CharSequence charSequence, @p4.l char... chars) {
        boolean n8;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(chars, "chars");
        int length = charSequence.length();
        for (int i5 = 0; i5 < length; i5++) {
            n8 = kotlin.collections.p.n8(chars, charSequence.charAt(i5));
            if (!n8) {
                return charSequence.subSequence(i5, charSequence.length());
            }
        }
        return "";
    }

    @kotlin.internal.f
    private static final boolean R2(CharSequence charSequence, r regex) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(regex, "regex");
        return regex.containsMatchIn(charSequence);
    }

    @p4.l
    public static String R3(@p4.l String str, int i5, char c5) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return Q3(str, i5, c5).toString();
    }

    public static /* synthetic */ List R4(CharSequence charSequence, String[] strArr, boolean z4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z4 = false;
        }
        if ((i6 & 4) != 0) {
            i5 = 0;
        }
        return N4(charSequence, strArr, z4, i5);
    }

    @kotlin.internal.f
    private static final String R5(String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return O5(str).toString();
    }

    public static /* synthetic */ boolean S2(CharSequence charSequence, char c5, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return P2(charSequence, c5, z4);
    }

    public static /* synthetic */ CharSequence S3(CharSequence charSequence, int i5, char c5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            c5 = ' ';
        }
        return Q3(charSequence, i5, c5);
    }

    @g1(version = "1.6")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final kotlin.sequences.m<String> S4(CharSequence charSequence, r regex, int i5) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(regex, "regex");
        return regex.splitToSequence(charSequence, i5);
    }

    @p4.l
    public static final String S5(@p4.l String str, @p4.l v3.l<? super Character, Boolean> predicate) {
        CharSequence charSequence;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        int length = str.length();
        int i5 = 0;
        while (true) {
            if (i5 < length) {
                if (!predicate.invoke(Character.valueOf(str.charAt(i5))).booleanValue()) {
                    charSequence = str.subSequence(i5, str.length());
                    break;
                }
                i5++;
            } else {
                charSequence = "";
                break;
            }
        }
        return charSequence.toString();
    }

    public static /* synthetic */ boolean T2(CharSequence charSequence, CharSequence charSequence2, boolean z4, int i5, Object obj) {
        boolean Q2;
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        Q2 = Q2(charSequence, charSequence2, z4);
        return Q2;
    }

    public static /* synthetic */ String T3(String str, int i5, char c5, int i6, Object obj) {
        String R3;
        if ((i6 & 2) != 0) {
            c5 = ' ';
        }
        R3 = R3(str, i5, c5);
        return R3;
    }

    @p4.l
    public static final kotlin.sequences.m<String> T4(@p4.l CharSequence charSequence, @p4.l char[] delimiters, boolean z4, int i5) {
        kotlin.sequences.m<String> k12;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(delimiters, "delimiters");
        k12 = kotlin.sequences.u.k1(W3(charSequence, delimiters, 0, z4, i5, 2, null), new e(charSequence));
        return k12;
    }

    @p4.l
    public static final String T5(@p4.l String str, @p4.l char... chars) {
        CharSequence charSequence;
        boolean n8;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(chars, "chars");
        int length = str.length();
        int i5 = 0;
        while (true) {
            if (i5 < length) {
                n8 = kotlin.collections.p.n8(chars, str.charAt(i5));
                if (!n8) {
                    charSequence = str.subSequence(i5, str.length());
                    break;
                }
                i5++;
            } else {
                charSequence = "";
                break;
            }
        }
        return charSequence.toString();
    }

    public static final boolean U2(@p4.m CharSequence charSequence, @p4.m CharSequence charSequence2) {
        boolean K1;
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            K1 = e0.K1((String) charSequence, (String) charSequence2, true);
            return K1;
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (!kotlin.text.e.J(charSequence.charAt(i5), charSequence2.charAt(i5), true)) {
                return false;
            }
        }
        return true;
    }

    private static final kotlin.sequences.m<kotlin.ranges.l> U3(CharSequence charSequence, char[] cArr, int i5, boolean z4, int i6) {
        K4(i6);
        return new h(charSequence, i5, i6, new b(cArr, z4));
    }

    @p4.l
    public static final kotlin.sequences.m<String> U4(@p4.l CharSequence charSequence, @p4.l String[] delimiters, boolean z4, int i5) {
        kotlin.sequences.m<String> k12;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(delimiters, "delimiters");
        k12 = kotlin.sequences.u.k1(X3(charSequence, delimiters, 0, z4, i5, 2, null), new d(charSequence));
        return k12;
    }

    public static final boolean V2(@p4.m CharSequence charSequence, @p4.m CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return kotlin.jvm.internal.l0.g(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (charSequence.charAt(i5) != charSequence2.charAt(i5)) {
                return false;
            }
        }
        return true;
    }

    private static final kotlin.sequences.m<kotlin.ranges.l> V3(CharSequence charSequence, String[] strArr, int i5, boolean z4, int i6) {
        List t5;
        K4(i6);
        t5 = kotlin.collections.o.t(strArr);
        return new h(charSequence, i5, i6, new c(t5, z4));
    }

    static /* synthetic */ kotlin.sequences.m V4(CharSequence charSequence, r regex, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(regex, "regex");
        return regex.splitToSequence(charSequence, i5);
    }

    public static final boolean W2(@p4.l CharSequence charSequence, char c5, boolean z4) {
        int g32;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        if (charSequence.length() > 0) {
            g32 = g3(charSequence);
            if (kotlin.text.e.J(charSequence.charAt(g32), c5, z4)) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ kotlin.sequences.m W3(CharSequence charSequence, char[] cArr, int i5, boolean z4, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            z4 = false;
        }
        if ((i7 & 8) != 0) {
            i6 = 0;
        }
        return U3(charSequence, cArr, i5, z4, i6);
    }

    public static /* synthetic */ kotlin.sequences.m W4(CharSequence charSequence, char[] cArr, boolean z4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z4 = false;
        }
        if ((i6 & 4) != 0) {
            i5 = 0;
        }
        return T4(charSequence, cArr, z4, i5);
    }

    public static final boolean X2(@p4.l CharSequence charSequence, @p4.l CharSequence suffix, boolean z4) {
        boolean J1;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(suffix, "suffix");
        if (!z4 && (charSequence instanceof String) && (suffix instanceof String)) {
            J1 = e0.J1((String) charSequence, (String) suffix, false, 2, null);
            return J1;
        }
        return Y3(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z4);
    }

    static /* synthetic */ kotlin.sequences.m X3(CharSequence charSequence, String[] strArr, int i5, boolean z4, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            z4 = false;
        }
        if ((i7 & 8) != 0) {
            i6 = 0;
        }
        return V3(charSequence, strArr, i5, z4, i6);
    }

    public static /* synthetic */ kotlin.sequences.m X4(CharSequence charSequence, String[] strArr, boolean z4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z4 = false;
        }
        if ((i6 & 4) != 0) {
            i5 = 0;
        }
        return U4(charSequence, strArr, z4, i5);
    }

    public static /* synthetic */ boolean Y2(CharSequence charSequence, char c5, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return W2(charSequence, c5, z4);
    }

    public static final boolean Y3(@p4.l CharSequence charSequence, int i5, @p4.l CharSequence other, int i6, int i7, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        if (i6 < 0 || i5 < 0 || i5 > charSequence.length() - i7 || i6 > other.length() - i7) {
            return false;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            if (!kotlin.text.e.J(charSequence.charAt(i5 + i8), other.charAt(i6 + i8), z4)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean Y4(@p4.l CharSequence charSequence, char c5, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        if (charSequence.length() <= 0 || !kotlin.text.e.J(charSequence.charAt(0), c5, z4)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean Z2(CharSequence charSequence, CharSequence charSequence2, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return X2(charSequence, charSequence2, z4);
    }

    @p4.l
    public static final CharSequence Z3(@p4.l CharSequence charSequence, @p4.l CharSequence prefix) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        if (d5(charSequence, prefix, false, 2, null)) {
            return charSequence.subSequence(prefix.length(), charSequence.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final boolean Z4(@p4.l CharSequence charSequence, @p4.l CharSequence prefix, int i5, boolean z4) {
        boolean r22;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        if (!z4 && (charSequence instanceof String) && (prefix instanceof String)) {
            r22 = e0.r2((String) charSequence, (String) prefix, i5, false, 4, null);
            return r22;
        }
        return Y3(charSequence, i5, prefix, 0, prefix.length(), z4);
    }

    @p4.m
    public static final u0<Integer, String> a3(@p4.l CharSequence charSequence, @p4.l Collection<String> strings, int i5, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(strings, "strings");
        return b3(charSequence, strings, i5, z4, false);
    }

    @p4.l
    public static String a4(@p4.l String str, @p4.l CharSequence prefix) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        if (d5(str, prefix, false, 2, null)) {
            String substring = str.substring(prefix.length());
            kotlin.jvm.internal.l0.o(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str;
    }

    public static final boolean a5(@p4.l CharSequence charSequence, @p4.l CharSequence prefix, boolean z4) {
        boolean s22;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        if (!z4 && (charSequence instanceof String) && (prefix instanceof String)) {
            s22 = e0.s2((String) charSequence, (String) prefix, false, 2, null);
            return s22;
        }
        return Y3(charSequence, 0, prefix, 0, prefix.length(), z4);
    }

    public static final u0<Integer, String> b3(CharSequence charSequence, Collection<String> collection, int i5, boolean z4, boolean z5) {
        int g32;
        int B;
        kotlin.ranges.j k02;
        Object obj;
        Object obj2;
        boolean b22;
        int u4;
        Object c5;
        int D3;
        if (!z4 && collection.size() == 1) {
            c5 = kotlin.collections.e0.c5(collection);
            String str = (String) c5;
            if (!z5) {
                D3 = p3(charSequence, str, i5, false, 4, null);
            } else {
                D3 = D3(charSequence, str, i5, false, 4, null);
            }
            if (D3 < 0) {
                return null;
            }
            return q1.a(Integer.valueOf(D3), str);
        }
        if (!z5) {
            u4 = kotlin.ranges.u.u(i5, 0);
            k02 = new kotlin.ranges.l(u4, charSequence.length());
        } else {
            g32 = g3(charSequence);
            B = kotlin.ranges.u.B(i5, g32);
            k02 = kotlin.ranges.u.k0(B, 0);
        }
        if (charSequence instanceof String) {
            int e5 = k02.e();
            int g5 = k02.g();
            int i6 = k02.i();
            if ((i6 > 0 && e5 <= g5) || (i6 < 0 && g5 <= e5)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            String str2 = (String) obj2;
                            b22 = e0.b2(str2, 0, (String) charSequence, e5, str2.length(), z4);
                            if (b22) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 != null) {
                        return q1.a(Integer.valueOf(e5), str3);
                    }
                    if (e5 == g5) {
                        break;
                    }
                    e5 += i6;
                }
            }
        } else {
            int e6 = k02.e();
            int g6 = k02.g();
            int i7 = k02.i();
            if ((i7 > 0 && e6 <= g6) || (i7 < 0 && g6 <= e6)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            String str4 = (String) obj;
                            if (Y3(str4, 0, charSequence, e6, str4.length(), z4)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 != null) {
                        return q1.a(Integer.valueOf(e6), str5);
                    }
                    if (e6 == g6) {
                        break;
                    }
                    e6 += i7;
                }
            }
        }
        return null;
    }

    @p4.l
    public static final CharSequence b4(@p4.l CharSequence charSequence, int i5, int i6) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        if (i6 >= i5) {
            if (i6 == i5) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(charSequence.length() - (i6 - i5));
            sb.append(charSequence, 0, i5);
            kotlin.jvm.internal.l0.o(sb, "this.append(value, startIndex, endIndex)");
            sb.append(charSequence, i6, charSequence.length());
            kotlin.jvm.internal.l0.o(sb, "this.append(value, startIndex, endIndex)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i6 + ") is less than start index (" + i5 + ").");
    }

    public static /* synthetic */ boolean b5(CharSequence charSequence, char c5, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return Y4(charSequence, c5, z4);
    }

    public static /* synthetic */ u0 c3(CharSequence charSequence, Collection collection, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        return a3(charSequence, collection, i5, z4);
    }

    @p4.l
    public static final CharSequence c4(@p4.l CharSequence charSequence, @p4.l kotlin.ranges.l range) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(range, "range");
        return b4(charSequence, range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
    }

    public static /* synthetic */ boolean c5(CharSequence charSequence, CharSequence charSequence2, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        return Z4(charSequence, charSequence2, i5, z4);
    }

    @p4.m
    public static final u0<Integer, String> d3(@p4.l CharSequence charSequence, @p4.l Collection<String> strings, int i5, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(strings, "strings");
        return b3(charSequence, strings, i5, z4, true);
    }

    @kotlin.internal.f
    private static final String d4(String str, int i5, int i6) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return b4(str, i5, i6).toString();
    }

    public static /* synthetic */ boolean d5(CharSequence charSequence, CharSequence charSequence2, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return a5(charSequence, charSequence2, z4);
    }

    public static /* synthetic */ u0 e3(CharSequence charSequence, Collection collection, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = g3(charSequence);
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        return d3(charSequence, collection, i5, z4);
    }

    @kotlin.internal.f
    private static final String e4(String str, kotlin.ranges.l range) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(range, "range");
        return c4(str, range).toString();
    }

    @p4.l
    public static final CharSequence e5(@p4.l CharSequence charSequence, @p4.l kotlin.ranges.l range) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
    }

    @p4.l
    public static final kotlin.ranges.l f3(@p4.l CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        return new kotlin.ranges.l(0, charSequence.length() - 1);
    }

    @p4.l
    public static final CharSequence f4(@p4.l CharSequence charSequence, @p4.l CharSequence suffix) {
        boolean Z2;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(suffix, "suffix");
        Z2 = Z2(charSequence, suffix, false, 2, null);
        if (Z2) {
            return charSequence.subSequence(0, charSequence.length() - suffix.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @kotlin.k(message = "Use parameters named startIndex and endIndex.", replaceWith = @b1(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    @kotlin.internal.f
    private static final CharSequence f5(String str, int i5, int i6) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return str.subSequence(i5, i6);
    }

    public static int g3(@p4.l CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    @p4.l
    public static String g4(@p4.l String str, @p4.l CharSequence suffix) {
        boolean Z2;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(suffix, "suffix");
        Z2 = Z2(str, suffix, false, 2, null);
        if (Z2) {
            String substring = str.substring(0, str.length() - suffix.length());
            kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    @kotlin.internal.f
    private static final String g5(CharSequence charSequence, int i5, int i6) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        return charSequence.subSequence(i5, i6).toString();
    }

    public static final boolean h3(@p4.l CharSequence charSequence, int i5) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        if (!new kotlin.ranges.l(0, charSequence.length() - 2).l(i5) || !Character.isHighSurrogate(charSequence.charAt(i5)) || !Character.isLowSurrogate(charSequence.charAt(i5 + 1))) {
            return false;
        }
        return true;
    }

    @p4.l
    public static final CharSequence h4(@p4.l CharSequence charSequence, @p4.l CharSequence delimiter) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(delimiter, "delimiter");
        return i4(charSequence, delimiter, delimiter);
    }

    @p4.l
    public static final String h5(@p4.l CharSequence charSequence, @p4.l kotlin.ranges.l range) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.3")
    @kotlin.internal.f
    private static final <C extends CharSequence & R, R> R i3(C c5, v3.a<? extends R> defaultValue) {
        boolean S1;
        kotlin.jvm.internal.l0.p(defaultValue, "defaultValue");
        S1 = e0.S1(c5);
        if (S1) {
            return defaultValue.invoke();
        }
        return c5;
    }

    @p4.l
    public static final CharSequence i4(@p4.l CharSequence charSequence, @p4.l CharSequence prefix, @p4.l CharSequence suffix) {
        boolean Z2;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        kotlin.jvm.internal.l0.p(suffix, "suffix");
        if (charSequence.length() >= prefix.length() + suffix.length() && d5(charSequence, prefix, false, 2, null)) {
            Z2 = Z2(charSequence, suffix, false, 2, null);
            if (Z2) {
                return charSequence.subSequence(prefix.length(), charSequence.length() - suffix.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @p4.l
    public static String i5(@p4.l String str, @p4.l kotlin.ranges.l range) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(range, "range");
        String substring = str.substring(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
        kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.3")
    @kotlin.internal.f
    private static final <C extends CharSequence & R, R> R j3(C c5, v3.a<? extends R> defaultValue) {
        boolean z4;
        kotlin.jvm.internal.l0.p(defaultValue, "defaultValue");
        if (c5.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return defaultValue.invoke();
        }
        return c5;
    }

    @p4.l
    public static String j4(@p4.l String str, @p4.l CharSequence delimiter) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(delimiter, "delimiter");
        return k4(str, delimiter, delimiter);
    }

    static /* synthetic */ String j5(CharSequence charSequence, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = charSequence.length();
        }
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        return charSequence.subSequence(i5, i6).toString();
    }

    public static final int k3(@p4.l CharSequence charSequence, char c5, int i5, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        if (!z4 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c5, i5);
        }
        return r3(charSequence, new char[]{c5}, i5, z4);
    }

    @p4.l
    public static final String k4(@p4.l String str, @p4.l CharSequence prefix, @p4.l CharSequence suffix) {
        boolean Z2;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        kotlin.jvm.internal.l0.p(suffix, "suffix");
        if (str.length() >= prefix.length() + suffix.length() && d5(str, prefix, false, 2, null)) {
            Z2 = Z2(str, suffix, false, 2, null);
            if (Z2) {
                String substring = str.substring(prefix.length(), str.length() - suffix.length());
                kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
            return str;
        }
        return str;
    }

    @p4.l
    public static final String k5(@p4.l String str, char c5, @p4.l String missingDelimiterValue) {
        int o32;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(missingDelimiterValue, "missingDelimiterValue");
        o32 = o3(str, c5, 0, false, 6, null);
        if (o32 != -1) {
            String substring = str.substring(o32 + 1, str.length());
            kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static final int l3(@p4.l CharSequence charSequence, @p4.l String string, int i5, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(string, "string");
        if (!z4 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i5);
        }
        return n3(charSequence, string, i5, charSequence.length(), z4, false, 16, null);
    }

    @kotlin.internal.f
    private static final String l4(CharSequence charSequence, r regex, String replacement) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(regex, "regex");
        kotlin.jvm.internal.l0.p(replacement, "replacement");
        return regex.replace(charSequence, replacement);
    }

    @p4.l
    public static final String l5(@p4.l String str, @p4.l String delimiter, @p4.l String missingDelimiterValue) {
        int p32;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(delimiter, "delimiter");
        kotlin.jvm.internal.l0.p(missingDelimiterValue, "missingDelimiterValue");
        p32 = p3(str, delimiter, 0, false, 6, null);
        if (p32 != -1) {
            String substring = str.substring(p32 + delimiter.length(), str.length());
            kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return missingDelimiterValue;
    }

    private static final int m3(CharSequence charSequence, CharSequence charSequence2, int i5, int i6, boolean z4, boolean z5) {
        int g32;
        int B;
        int u4;
        kotlin.ranges.j k02;
        boolean b22;
        int u5;
        int B2;
        if (!z5) {
            u5 = kotlin.ranges.u.u(i5, 0);
            B2 = kotlin.ranges.u.B(i6, charSequence.length());
            k02 = new kotlin.ranges.l(u5, B2);
        } else {
            g32 = g3(charSequence);
            B = kotlin.ranges.u.B(i5, g32);
            u4 = kotlin.ranges.u.u(i6, 0);
            k02 = kotlin.ranges.u.k0(B, u4);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int e5 = k02.e();
            int g5 = k02.g();
            int i7 = k02.i();
            if ((i7 <= 0 || e5 > g5) && (i7 >= 0 || g5 > e5)) {
                return -1;
            }
            while (true) {
                b22 = e0.b2((String) charSequence2, 0, (String) charSequence, e5, charSequence2.length(), z4);
                if (b22) {
                    return e5;
                }
                if (e5 != g5) {
                    e5 += i7;
                } else {
                    return -1;
                }
            }
        } else {
            int e6 = k02.e();
            int g6 = k02.g();
            int i8 = k02.i();
            if ((i8 > 0 && e6 <= g6) || (i8 < 0 && g6 <= e6)) {
                while (!Y3(charSequence2, 0, charSequence, e6, charSequence2.length(), z4)) {
                    if (e6 != g6) {
                        e6 += i8;
                    } else {
                        return -1;
                    }
                }
                return e6;
            }
            return -1;
        }
    }

    @kotlin.internal.f
    private static final String m4(CharSequence charSequence, r regex, v3.l<? super p, ? extends CharSequence> transform) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(regex, "regex");
        kotlin.jvm.internal.l0.p(transform, "transform");
        return regex.replace(charSequence, transform);
    }

    public static /* synthetic */ String m5(String str, char c5, String str2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str2 = str;
        }
        return k5(str, c5, str2);
    }

    static /* synthetic */ int n3(CharSequence charSequence, CharSequence charSequence2, int i5, int i6, boolean z4, boolean z5, int i7, Object obj) {
        if ((i7 & 16) != 0) {
            z5 = false;
        }
        return m3(charSequence, charSequence2, i5, i6, z4, z5);
    }

    @p4.l
    public static final String n4(@p4.l String str, char c5, @p4.l String replacement, @p4.l String missingDelimiterValue) {
        int o32;
        CharSequence G4;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(replacement, "replacement");
        kotlin.jvm.internal.l0.p(missingDelimiterValue, "missingDelimiterValue");
        o32 = o3(str, c5, 0, false, 6, null);
        if (o32 != -1) {
            G4 = G4(str, o32 + 1, str.length(), replacement);
            return G4.toString();
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ String n5(String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str3 = str;
        }
        return l5(str, str2, str3);
    }

    public static /* synthetic */ int o3(CharSequence charSequence, char c5, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        return k3(charSequence, c5, i5, z4);
    }

    @p4.l
    public static final String o4(@p4.l String str, @p4.l String delimiter, @p4.l String replacement, @p4.l String missingDelimiterValue) {
        int p32;
        CharSequence G4;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(delimiter, "delimiter");
        kotlin.jvm.internal.l0.p(replacement, "replacement");
        kotlin.jvm.internal.l0.p(missingDelimiterValue, "missingDelimiterValue");
        p32 = p3(str, delimiter, 0, false, 6, null);
        if (p32 != -1) {
            G4 = G4(str, p32 + delimiter.length(), str.length(), replacement);
            return G4.toString();
        }
        return missingDelimiterValue;
    }

    @p4.l
    public static String o5(@p4.l String str, char c5, @p4.l String missingDelimiterValue) {
        int C3;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(missingDelimiterValue, "missingDelimiterValue");
        C3 = C3(str, c5, 0, false, 6, null);
        if (C3 != -1) {
            String substring = str.substring(C3 + 1, str.length());
            kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ int p3(CharSequence charSequence, String str, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        return l3(charSequence, str, i5, z4);
    }

    public static /* synthetic */ String p4(String str, char c5, String str2, String str3, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str3 = str;
        }
        return n4(str, c5, str2, str3);
    }

    @p4.l
    public static final String p5(@p4.l String str, @p4.l String delimiter, @p4.l String missingDelimiterValue) {
        int D3;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(delimiter, "delimiter");
        kotlin.jvm.internal.l0.p(missingDelimiterValue, "missingDelimiterValue");
        D3 = D3(str, delimiter, 0, false, 6, null);
        if (D3 != -1) {
            String substring = str.substring(D3 + delimiter.length(), str.length());
            kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static final int q3(@p4.l CharSequence charSequence, @p4.l Collection<String> strings, int i5, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(strings, "strings");
        u0<Integer, String> b32 = b3(charSequence, strings, i5, z4, false);
        if (b32 != null) {
            return b32.getFirst().intValue();
        }
        return -1;
    }

    public static /* synthetic */ String q4(String str, String str2, String str3, String str4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str4 = str;
        }
        return o4(str, str2, str3, str4);
    }

    public static /* synthetic */ String q5(String str, char c5, String str2, int i5, Object obj) {
        String o5;
        if ((i5 & 2) != 0) {
            str2 = str;
        }
        o5 = o5(str, c5, str2);
        return o5;
    }

    public static final int r3(@p4.l CharSequence charSequence, @p4.l char[] chars, int i5, boolean z4) {
        int u4;
        int g32;
        boolean z5;
        char Vs;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(chars, "chars");
        if (!z4 && chars.length == 1 && (charSequence instanceof String)) {
            Vs = kotlin.collections.p.Vs(chars);
            return ((String) charSequence).indexOf(Vs, i5);
        }
        u4 = kotlin.ranges.u.u(i5, 0);
        g32 = g3(charSequence);
        s0 it = new kotlin.ranges.l(u4, g32).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            char charAt = charSequence.charAt(nextInt);
            int length = chars.length;
            int i6 = 0;
            while (true) {
                if (i6 < length) {
                    if (kotlin.text.e.J(chars[i6], charAt, z4)) {
                        z5 = true;
                        break;
                    }
                    i6++;
                } else {
                    z5 = false;
                    break;
                }
            }
            if (z5) {
                return nextInt;
            }
        }
        return -1;
    }

    @p4.l
    public static final String r4(@p4.l String str, char c5, @p4.l String replacement, @p4.l String missingDelimiterValue) {
        int C3;
        CharSequence G4;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(replacement, "replacement");
        kotlin.jvm.internal.l0.p(missingDelimiterValue, "missingDelimiterValue");
        C3 = C3(str, c5, 0, false, 6, null);
        if (C3 != -1) {
            G4 = G4(str, C3 + 1, str.length(), replacement);
            return G4.toString();
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ String r5(String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str3 = str;
        }
        return p5(str, str2, str3);
    }

    public static /* synthetic */ int s3(CharSequence charSequence, Collection collection, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        return q3(charSequence, collection, i5, z4);
    }

    @p4.l
    public static final String s4(@p4.l String str, @p4.l String delimiter, @p4.l String replacement, @p4.l String missingDelimiterValue) {
        int D3;
        CharSequence G4;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(delimiter, "delimiter");
        kotlin.jvm.internal.l0.p(replacement, "replacement");
        kotlin.jvm.internal.l0.p(missingDelimiterValue, "missingDelimiterValue");
        D3 = D3(str, delimiter, 0, false, 6, null);
        if (D3 != -1) {
            G4 = G4(str, D3 + delimiter.length(), str.length(), replacement);
            return G4.toString();
        }
        return missingDelimiterValue;
    }

    @p4.l
    public static final String s5(@p4.l String str, char c5, @p4.l String missingDelimiterValue) {
        int o32;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(missingDelimiterValue, "missingDelimiterValue");
        o32 = o3(str, c5, 0, false, 6, null);
        if (o32 != -1) {
            String substring = str.substring(0, o32);
            kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ int t3(CharSequence charSequence, char[] cArr, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        return r3(charSequence, cArr, i5, z4);
    }

    public static /* synthetic */ String t4(String str, char c5, String str2, String str3, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str3 = str;
        }
        return r4(str, c5, str2, str3);
    }

    @p4.l
    public static final String t5(@p4.l String str, @p4.l String delimiter, @p4.l String missingDelimiterValue) {
        int p32;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(delimiter, "delimiter");
        kotlin.jvm.internal.l0.p(missingDelimiterValue, "missingDelimiterValue");
        p32 = p3(str, delimiter, 0, false, 6, null);
        if (p32 != -1) {
            String substring = str.substring(0, p32);
            kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return missingDelimiterValue;
    }

    @kotlin.internal.f
    private static final boolean u3(CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String u4(String str, String str2, String str3, String str4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str4 = str;
        }
        return s4(str, str2, str3, str4);
    }

    public static /* synthetic */ String u5(String str, char c5, String str2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str2 = str;
        }
        return s5(str, c5, str2);
    }

    @kotlin.internal.f
    private static final boolean v3(CharSequence charSequence) {
        boolean S1;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        S1 = e0.S1(charSequence);
        return !S1;
    }

    @p4.l
    public static final String v4(@p4.l String str, char c5, @p4.l String replacement, @p4.l String missingDelimiterValue) {
        int o32;
        CharSequence G4;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(replacement, "replacement");
        kotlin.jvm.internal.l0.p(missingDelimiterValue, "missingDelimiterValue");
        o32 = o3(str, c5, 0, false, 6, null);
        if (o32 != -1) {
            G4 = G4(str, 0, o32, replacement);
            return G4.toString();
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ String v5(String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str3 = str;
        }
        return t5(str, str2, str3);
    }

    @kotlin.internal.f
    private static final boolean w3(CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        if (charSequence.length() > 0) {
            return true;
        }
        return false;
    }

    @p4.l
    public static final String w4(@p4.l String str, @p4.l String delimiter, @p4.l String replacement, @p4.l String missingDelimiterValue) {
        int p32;
        CharSequence G4;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(delimiter, "delimiter");
        kotlin.jvm.internal.l0.p(replacement, "replacement");
        kotlin.jvm.internal.l0.p(missingDelimiterValue, "missingDelimiterValue");
        p32 = p3(str, delimiter, 0, false, 6, null);
        if (p32 != -1) {
            G4 = G4(str, 0, p32, replacement);
            return G4.toString();
        }
        return missingDelimiterValue;
    }

    @p4.l
    public static final String w5(@p4.l String str, char c5, @p4.l String missingDelimiterValue) {
        int C3;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(missingDelimiterValue, "missingDelimiterValue");
        C3 = C3(str, c5, 0, false, 6, null);
        if (C3 != -1) {
            String substring = str.substring(0, C3);
            kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return missingDelimiterValue;
    }

    @kotlin.internal.f
    private static final boolean x3(CharSequence charSequence) {
        boolean S1;
        if (charSequence != null) {
            S1 = e0.S1(charSequence);
            if (!S1) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String x4(String str, char c5, String str2, String str3, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str3 = str;
        }
        return v4(str, c5, str2, str3);
    }

    @p4.l
    public static final String x5(@p4.l String str, @p4.l String delimiter, @p4.l String missingDelimiterValue) {
        int D3;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(delimiter, "delimiter");
        kotlin.jvm.internal.l0.p(missingDelimiterValue, "missingDelimiterValue");
        D3 = D3(str, delimiter, 0, false, 6, null);
        if (D3 != -1) {
            String substring = str.substring(0, D3);
            kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return missingDelimiterValue;
    }

    @kotlin.internal.f
    private static final boolean y3(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static /* synthetic */ String y4(String str, String str2, String str3, String str4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str4 = str;
        }
        return w4(str, str2, str3, str4);
    }

    public static /* synthetic */ String y5(String str, char c5, String str2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str2 = str;
        }
        return w5(str, c5, str2);
    }

    @p4.l
    public static final kotlin.collections.t z3(@p4.l CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        return new a(charSequence);
    }

    @p4.l
    public static final String z4(@p4.l String str, char c5, @p4.l String replacement, @p4.l String missingDelimiterValue) {
        int C3;
        CharSequence G4;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(replacement, "replacement");
        kotlin.jvm.internal.l0.p(missingDelimiterValue, "missingDelimiterValue");
        C3 = C3(str, c5, 0, false, 6, null);
        if (C3 != -1) {
            G4 = G4(str, 0, C3, replacement);
            return G4.toString();
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ String z5(String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str3 = str;
        }
        return x5(str, str2, str3);
    }
}
