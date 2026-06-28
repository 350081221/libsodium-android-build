package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import com.huawei.agconnect.apms.collect.model.event.interaction.ForeAndBackgroundEvent;
import com.lody.virtual.server.pm.parser.PackageParserEx;

@kotlin.i0(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B©\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0006\b\u0088\u0002\u0010\u0089\u0002Bó\u0001\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0006\b\u0088\u0002\u0010\u008a\u0002Jø\u0002\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(J´\u0002\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\b\u0010-\u001a\u00020,H\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b1\u00100R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b2\u00100R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b3\u00100R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b4\u00100R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b5\u00100R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b6\u00100R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b7\u00100R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b8\u00100R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b9\u00100R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b:\u00100R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b;\u00100R\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b<\u00100R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b=\u00100R\u001d\u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b>\u00100R\u001d\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010.\u001a\u0004\b?\u00100R\u001d\u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010.\u001a\u0004\b@\u00100R\u001d\u0010\u0014\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010.\u001a\u0004\bA\u00100R\u001d\u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010.\u001a\u0004\bB\u00100R\u001d\u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010.\u001a\u0004\bC\u00100R\u001d\u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010.\u001a\u0004\bD\u00100R\u001d\u0010\u0018\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010.\u001a\u0004\bE\u00100R\u001d\u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010.\u001a\u0004\bF\u00100R\u001d\u0010\u001a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010.\u001a\u0004\bG\u00100R\u001d\u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010.\u001a\u0004\bH\u00100R\u001d\u0010\u001c\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010.\u001a\u0004\bI\u00100R\u001d\u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010.\u001a\u0004\bJ\u00100R\u001d\u0010\u001e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\bK\u00100R\u001d\u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\bL\u00100R\u001d\u0010 \u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010.\u001a\u0004\bM\u00100R\u001d\u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\bN\u00100R\u001d\u0010\"\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\bO\u00100R\u001d\u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\bP\u00100R\u001d\u0010$\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010.\u001a\u0004\bQ\u00100R\u001d\u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\bR\u00100R\u001d\u0010&\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010.\u001a\u0004\bS\u00100R$\u0010U\u001a\u0004\u0018\u00010T8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010[\u001a\u0004\u0018\u00010T8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010V\u001a\u0004\b\\\u0010X\"\u0004\b]\u0010ZR$\u0010^\u001a\u0004\u0018\u00010T8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b^\u0010V\u001a\u0004\b_\u0010X\"\u0004\b`\u0010ZR$\u0010a\u001a\u0004\u0018\u00010T8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010V\u001a\u0004\bb\u0010X\"\u0004\bc\u0010ZR$\u0010d\u001a\u0004\u0018\u00010T8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bd\u0010V\u001a\u0004\be\u0010X\"\u0004\bf\u0010ZR$\u0010h\u001a\u0004\u0018\u00010g8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010n\u001a\u0004\u0018\u00010g8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u0010i\u001a\u0004\bo\u0010k\"\u0004\bp\u0010mR$\u0010q\u001a\u0004\u0018\u00010g8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bq\u0010i\u001a\u0004\br\u0010k\"\u0004\bs\u0010mR$\u0010u\u001a\u0004\u0018\u00010t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR$\u0010{\u001a\u0004\u0018\u00010t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b{\u0010v\u001a\u0004\b|\u0010x\"\u0004\b}\u0010zR%\u0010~\u001a\u0004\u0018\u00010t8\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\b~\u0010v\u001a\u0004\b\u007f\u0010x\"\u0005\b\u0080\u0001\u0010zR(\u0010\u0081\u0001\u001a\u0004\u0018\u00010t8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010v\u001a\u0005\b\u0082\u0001\u0010x\"\u0005\b\u0083\u0001\u0010zR,\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R,\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u0086\u0001\u001a\u0006\b\u008c\u0001\u0010\u0088\u0001\"\u0006\b\u008d\u0001\u0010\u008a\u0001R,\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u0086\u0001\u001a\u0006\b\u008f\u0001\u0010\u0088\u0001\"\u0006\b\u0090\u0001\u0010\u008a\u0001R4\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0000@\u0000X\u0080\u000e¢\u0006 \n\u0006\b\u0092\u0001\u0010\u0093\u0001\u0012\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R4\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0000@\u0000X\u0080\u000e¢\u0006 \n\u0006\b\u009a\u0001\u0010\u0093\u0001\u0012\u0006\b\u009d\u0001\u0010\u0099\u0001\u001a\u0006\b\u009b\u0001\u0010\u0095\u0001\"\u0006\b\u009c\u0001\u0010\u0097\u0001R4\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0000@\u0000X\u0080\u000e¢\u0006 \n\u0006\b\u009e\u0001\u0010\u0093\u0001\u0012\u0006\b¡\u0001\u0010\u0099\u0001\u001a\u0006\b\u009f\u0001\u0010\u0095\u0001\"\u0006\b \u0001\u0010\u0097\u0001R4\u0010¢\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0000@\u0000X\u0080\u000e¢\u0006 \n\u0006\b¢\u0001\u0010\u0093\u0001\u0012\u0006\b¥\u0001\u0010\u0099\u0001\u001a\u0006\b£\u0001\u0010\u0095\u0001\"\u0006\b¤\u0001\u0010\u0097\u0001R,\u0010§\u0001\u001a\u0005\u0018\u00010¦\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R4\u0010®\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0000@\u0000X\u0080\u000e¢\u0006 \n\u0006\b®\u0001\u0010¯\u0001\u0012\u0006\b´\u0001\u0010\u0099\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R,\u0010¶\u0001\u001a\u0005\u0018\u00010µ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¶\u0001\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R,\u0010½\u0001\u001a\u0005\u0018\u00010¼\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R,\u0010Ä\u0001\u001a\u0005\u0018\u00010Ã\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R,\u0010Ë\u0001\u001a\u0005\u0018\u00010Ê\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R,\u0010Ò\u0001\u001a\u0005\u0018\u00010Ñ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R4\u0010Ù\u0001\u001a\u0005\u0018\u00010Ø\u00018\u0000@\u0000X\u0080\u000e¢\u0006 \n\u0006\bÙ\u0001\u0010Ú\u0001\u0012\u0006\bß\u0001\u0010\u0099\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001R,\u0010á\u0001\u001a\u0005\u0018\u00010à\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bá\u0001\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001R,\u0010è\u0001\u001a\u0005\u0018\u00010ç\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bè\u0001\u0010é\u0001\u001a\u0006\bê\u0001\u0010ë\u0001\"\u0006\bì\u0001\u0010í\u0001R,\u0010ï\u0001\u001a\u0005\u0018\u00010î\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bï\u0001\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001\"\u0006\bó\u0001\u0010ô\u0001R,\u0010õ\u0001\u001a\u0005\u0018\u00010î\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bõ\u0001\u0010ð\u0001\u001a\u0006\bö\u0001\u0010ò\u0001\"\u0006\b÷\u0001\u0010ô\u0001R4\u0010ù\u0001\u001a\u0005\u0018\u00010ø\u00018\u0000@\u0000X\u0080\u000e¢\u0006 \n\u0006\bù\u0001\u0010ú\u0001\u0012\u0006\bÿ\u0001\u0010\u0099\u0001\u001a\u0006\bû\u0001\u0010ü\u0001\"\u0006\bý\u0001\u0010þ\u0001R4\u0010\u0081\u0002\u001a\u0005\u0018\u00010\u0080\u00028\u0000@\u0000X\u0080\u000e¢\u0006 \n\u0006\b\u0081\u0002\u0010\u0082\u0002\u0012\u0006\b\u0087\u0002\u0010\u0099\u0001\u001a\u0006\b\u0083\u0002\u0010\u0084\u0002\"\u0006\b\u0085\u0002\u0010\u0086\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008b\u0002"}, d2 = {"Landroidx/compose/material3/ColorScheme;", "", "Landroidx/compose/ui/graphics/Color;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", ForeAndBackgroundEvent.BACKGROUND, "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", com.umeng.analytics.pro.d.U, "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceDim", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "copy-C-Xl9yA", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "copy", "copy-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "", "toString", "J", "getPrimary-0d7_KjU", "()J", "getOnPrimary-0d7_KjU", "getPrimaryContainer-0d7_KjU", "getOnPrimaryContainer-0d7_KjU", "getInversePrimary-0d7_KjU", "getSecondary-0d7_KjU", "getOnSecondary-0d7_KjU", "getSecondaryContainer-0d7_KjU", "getOnSecondaryContainer-0d7_KjU", "getTertiary-0d7_KjU", "getOnTertiary-0d7_KjU", "getTertiaryContainer-0d7_KjU", "getOnTertiaryContainer-0d7_KjU", "getBackground-0d7_KjU", "getOnBackground-0d7_KjU", "getSurface-0d7_KjU", "getOnSurface-0d7_KjU", "getSurfaceVariant-0d7_KjU", "getOnSurfaceVariant-0d7_KjU", "getSurfaceTint-0d7_KjU", "getInverseSurface-0d7_KjU", "getInverseOnSurface-0d7_KjU", "getError-0d7_KjU", "getOnError-0d7_KjU", "getErrorContainer-0d7_KjU", "getOnErrorContainer-0d7_KjU", "getOutline-0d7_KjU", "getOutlineVariant-0d7_KjU", "getScrim-0d7_KjU", "getSurfaceBright-0d7_KjU", "getSurfaceDim-0d7_KjU", "getSurfaceContainer-0d7_KjU", "getSurfaceContainerHigh-0d7_KjU", "getSurfaceContainerHighest-0d7_KjU", "getSurfaceContainerLow-0d7_KjU", "getSurfaceContainerLowest-0d7_KjU", "Landroidx/compose/material3/ButtonColors;", "defaultButtonColorsCached", "Landroidx/compose/material3/ButtonColors;", "getDefaultButtonColorsCached$material3_release", "()Landroidx/compose/material3/ButtonColors;", "setDefaultButtonColorsCached$material3_release", "(Landroidx/compose/material3/ButtonColors;)V", "defaultElevatedButtonColorsCached", "getDefaultElevatedButtonColorsCached$material3_release", "setDefaultElevatedButtonColorsCached$material3_release", "defaultFilledTonalButtonColorsCached", "getDefaultFilledTonalButtonColorsCached$material3_release", "setDefaultFilledTonalButtonColorsCached$material3_release", "defaultOutlinedButtonColorsCached", "getDefaultOutlinedButtonColorsCached$material3_release", "setDefaultOutlinedButtonColorsCached$material3_release", "defaultTextButtonColorsCached", "getDefaultTextButtonColorsCached$material3_release", "setDefaultTextButtonColorsCached$material3_release", "Landroidx/compose/material3/CardColors;", "defaultCardColorsCached", "Landroidx/compose/material3/CardColors;", "getDefaultCardColorsCached$material3_release", "()Landroidx/compose/material3/CardColors;", "setDefaultCardColorsCached$material3_release", "(Landroidx/compose/material3/CardColors;)V", "defaultElevatedCardColorsCached", "getDefaultElevatedCardColorsCached$material3_release", "setDefaultElevatedCardColorsCached$material3_release", "defaultOutlinedCardColorsCached", "getDefaultOutlinedCardColorsCached$material3_release", "setDefaultOutlinedCardColorsCached$material3_release", "Landroidx/compose/material3/ChipColors;", "defaultAssistChipColorsCached", "Landroidx/compose/material3/ChipColors;", "getDefaultAssistChipColorsCached$material3_release", "()Landroidx/compose/material3/ChipColors;", "setDefaultAssistChipColorsCached$material3_release", "(Landroidx/compose/material3/ChipColors;)V", "defaultElevatedAssistChipColorsCached", "getDefaultElevatedAssistChipColorsCached$material3_release", "setDefaultElevatedAssistChipColorsCached$material3_release", "defaultSuggestionChipColorsCached", "getDefaultSuggestionChipColorsCached$material3_release", "setDefaultSuggestionChipColorsCached$material3_release", "defaultElevatedSuggestionChipColorsCached", "getDefaultElevatedSuggestionChipColorsCached$material3_release", "setDefaultElevatedSuggestionChipColorsCached$material3_release", "Landroidx/compose/material3/SelectableChipColors;", "defaultFilterChipColorsCached", "Landroidx/compose/material3/SelectableChipColors;", "getDefaultFilterChipColorsCached$material3_release", "()Landroidx/compose/material3/SelectableChipColors;", "setDefaultFilterChipColorsCached$material3_release", "(Landroidx/compose/material3/SelectableChipColors;)V", "defaultElevatedFilterChipColorsCached", "getDefaultElevatedFilterChipColorsCached$material3_release", "setDefaultElevatedFilterChipColorsCached$material3_release", "defaultInputChipColorsCached", "getDefaultInputChipColorsCached$material3_release", "setDefaultInputChipColorsCached$material3_release", "Landroidx/compose/material3/TopAppBarColors;", "defaultTopAppBarColorsCached", "Landroidx/compose/material3/TopAppBarColors;", "getDefaultTopAppBarColorsCached$material3_release", "()Landroidx/compose/material3/TopAppBarColors;", "setDefaultTopAppBarColorsCached$material3_release", "(Landroidx/compose/material3/TopAppBarColors;)V", "getDefaultTopAppBarColorsCached$material3_release$annotations", "()V", "defaultCenterAlignedTopAppBarColorsCached", "getDefaultCenterAlignedTopAppBarColorsCached$material3_release", "setDefaultCenterAlignedTopAppBarColorsCached$material3_release", "getDefaultCenterAlignedTopAppBarColorsCached$material3_release$annotations", "defaultMediumTopAppBarColorsCached", "getDefaultMediumTopAppBarColorsCached$material3_release", "setDefaultMediumTopAppBarColorsCached$material3_release", "getDefaultMediumTopAppBarColorsCached$material3_release$annotations", "defaultLargeTopAppBarColorsCached", "getDefaultLargeTopAppBarColorsCached$material3_release", "setDefaultLargeTopAppBarColorsCached$material3_release", "getDefaultLargeTopAppBarColorsCached$material3_release$annotations", "Landroidx/compose/material3/CheckboxColors;", "defaultCheckboxColorsCached", "Landroidx/compose/material3/CheckboxColors;", "getDefaultCheckboxColorsCached$material3_release", "()Landroidx/compose/material3/CheckboxColors;", "setDefaultCheckboxColorsCached$material3_release", "(Landroidx/compose/material3/CheckboxColors;)V", "Landroidx/compose/material3/DatePickerColors;", "defaultDatePickerColorsCached", "Landroidx/compose/material3/DatePickerColors;", "getDefaultDatePickerColorsCached$material3_release", "()Landroidx/compose/material3/DatePickerColors;", "setDefaultDatePickerColorsCached$material3_release", "(Landroidx/compose/material3/DatePickerColors;)V", "getDefaultDatePickerColorsCached$material3_release$annotations", "Landroidx/compose/material3/IconButtonColors;", "defaultIconButtonColorsCached", "Landroidx/compose/material3/IconButtonColors;", "getDefaultIconButtonColorsCached$material3_release", "()Landroidx/compose/material3/IconButtonColors;", "setDefaultIconButtonColorsCached$material3_release", "(Landroidx/compose/material3/IconButtonColors;)V", "Landroidx/compose/material3/MenuItemColors;", "defaultMenuItemColorsCached", "Landroidx/compose/material3/MenuItemColors;", "getDefaultMenuItemColorsCached$material3_release", "()Landroidx/compose/material3/MenuItemColors;", "setDefaultMenuItemColorsCached$material3_release", "(Landroidx/compose/material3/MenuItemColors;)V", "Landroidx/compose/material3/NavigationBarItemColors;", "defaultNavigationBarItemColorsCached", "Landroidx/compose/material3/NavigationBarItemColors;", "getDefaultNavigationBarItemColorsCached$material3_release", "()Landroidx/compose/material3/NavigationBarItemColors;", "setDefaultNavigationBarItemColorsCached$material3_release", "(Landroidx/compose/material3/NavigationBarItemColors;)V", "Landroidx/compose/material3/NavigationRailItemColors;", "defaultNavigationRailItemColorsCached", "Landroidx/compose/material3/NavigationRailItemColors;", "getDefaultNavigationRailItemColorsCached$material3_release", "()Landroidx/compose/material3/NavigationRailItemColors;", "setDefaultNavigationRailItemColorsCached$material3_release", "(Landroidx/compose/material3/NavigationRailItemColors;)V", "Landroidx/compose/material3/RadioButtonColors;", "defaultRadioButtonColorsCached", "Landroidx/compose/material3/RadioButtonColors;", "getDefaultRadioButtonColorsCached$material3_release", "()Landroidx/compose/material3/RadioButtonColors;", "setDefaultRadioButtonColorsCached$material3_release", "(Landroidx/compose/material3/RadioButtonColors;)V", "Landroidx/compose/material3/SegmentedButtonColors;", "defaultSegmentedButtonColorsCached", "Landroidx/compose/material3/SegmentedButtonColors;", "getDefaultSegmentedButtonColorsCached$material3_release", "()Landroidx/compose/material3/SegmentedButtonColors;", "setDefaultSegmentedButtonColorsCached$material3_release", "(Landroidx/compose/material3/SegmentedButtonColors;)V", "getDefaultSegmentedButtonColorsCached$material3_release$annotations", "Landroidx/compose/material3/SliderColors;", "defaultSliderColorsCached", "Landroidx/compose/material3/SliderColors;", "getDefaultSliderColorsCached$material3_release", "()Landroidx/compose/material3/SliderColors;", "setDefaultSliderColorsCached$material3_release", "(Landroidx/compose/material3/SliderColors;)V", "Landroidx/compose/material3/SwitchColors;", "defaultSwitchColorsCached", "Landroidx/compose/material3/SwitchColors;", "getDefaultSwitchColorsCached$material3_release", "()Landroidx/compose/material3/SwitchColors;", "setDefaultSwitchColorsCached$material3_release", "(Landroidx/compose/material3/SwitchColors;)V", "Landroidx/compose/material3/TextFieldColors;", "defaultOutlinedTextFieldColorsCached", "Landroidx/compose/material3/TextFieldColors;", "getDefaultOutlinedTextFieldColorsCached$material3_release", "()Landroidx/compose/material3/TextFieldColors;", "setDefaultOutlinedTextFieldColorsCached$material3_release", "(Landroidx/compose/material3/TextFieldColors;)V", "defaultTextFieldColorsCached", "getDefaultTextFieldColorsCached$material3_release", "setDefaultTextFieldColorsCached$material3_release", "Landroidx/compose/material3/TimePickerColors;", "defaultTimePickerColorsCached", "Landroidx/compose/material3/TimePickerColors;", "getDefaultTimePickerColorsCached$material3_release", "()Landroidx/compose/material3/TimePickerColors;", "setDefaultTimePickerColorsCached$material3_release", "(Landroidx/compose/material3/TimePickerColors;)V", "getDefaultTimePickerColorsCached$material3_release$annotations", "Landroidx/compose/material3/RichTooltipColors;", "defaultRichTooltipColorsCached", "Landroidx/compose/material3/RichTooltipColors;", "getDefaultRichTooltipColorsCached$material3_release", "()Landroidx/compose/material3/RichTooltipColors;", "setDefaultRichTooltipColorsCached$material3_release", "(Landroidx/compose/material3/RichTooltipColors;)V", "getDefaultRichTooltipColorsCached$material3_release$annotations", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/w;)V", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class ColorScheme {
    public static final int $stable = 0;
    private final long background;

    @p4.m
    private ChipColors defaultAssistChipColorsCached;

    @p4.m
    private ButtonColors defaultButtonColorsCached;

    @p4.m
    private CardColors defaultCardColorsCached;

    @p4.m
    private TopAppBarColors defaultCenterAlignedTopAppBarColorsCached;

    @p4.m
    private CheckboxColors defaultCheckboxColorsCached;

    @p4.m
    private DatePickerColors defaultDatePickerColorsCached;

    @p4.m
    private ChipColors defaultElevatedAssistChipColorsCached;

    @p4.m
    private ButtonColors defaultElevatedButtonColorsCached;

    @p4.m
    private CardColors defaultElevatedCardColorsCached;

    @p4.m
    private SelectableChipColors defaultElevatedFilterChipColorsCached;

    @p4.m
    private ChipColors defaultElevatedSuggestionChipColorsCached;

    @p4.m
    private ButtonColors defaultFilledTonalButtonColorsCached;

    @p4.m
    private SelectableChipColors defaultFilterChipColorsCached;

    @p4.m
    private IconButtonColors defaultIconButtonColorsCached;

    @p4.m
    private SelectableChipColors defaultInputChipColorsCached;

    @p4.m
    private TopAppBarColors defaultLargeTopAppBarColorsCached;

    @p4.m
    private TopAppBarColors defaultMediumTopAppBarColorsCached;

    @p4.m
    private MenuItemColors defaultMenuItemColorsCached;

    @p4.m
    private NavigationBarItemColors defaultNavigationBarItemColorsCached;

    @p4.m
    private NavigationRailItemColors defaultNavigationRailItemColorsCached;

    @p4.m
    private ButtonColors defaultOutlinedButtonColorsCached;

    @p4.m
    private CardColors defaultOutlinedCardColorsCached;

    @p4.m
    private TextFieldColors defaultOutlinedTextFieldColorsCached;

    @p4.m
    private RadioButtonColors defaultRadioButtonColorsCached;

    @p4.m
    private RichTooltipColors defaultRichTooltipColorsCached;

    @p4.m
    private SegmentedButtonColors defaultSegmentedButtonColorsCached;

    @p4.m
    private SliderColors defaultSliderColorsCached;

    @p4.m
    private ChipColors defaultSuggestionChipColorsCached;

    @p4.m
    private SwitchColors defaultSwitchColorsCached;

    @p4.m
    private ButtonColors defaultTextButtonColorsCached;

    @p4.m
    private TextFieldColors defaultTextFieldColorsCached;

    @p4.m
    private TimePickerColors defaultTimePickerColorsCached;

    @p4.m
    private TopAppBarColors defaultTopAppBarColorsCached;
    private final long error;
    private final long errorContainer;
    private final long inverseOnSurface;
    private final long inversePrimary;
    private final long inverseSurface;
    private final long onBackground;
    private final long onError;
    private final long onErrorContainer;
    private final long onPrimary;
    private final long onPrimaryContainer;
    private final long onSecondary;
    private final long onSecondaryContainer;
    private final long onSurface;
    private final long onSurfaceVariant;
    private final long onTertiary;
    private final long onTertiaryContainer;
    private final long outline;
    private final long outlineVariant;
    private final long primary;
    private final long primaryContainer;
    private final long scrim;
    private final long secondary;
    private final long secondaryContainer;
    private final long surface;
    private final long surfaceBright;
    private final long surfaceContainer;
    private final long surfaceContainerHigh;
    private final long surfaceContainerHighest;
    private final long surfaceContainerLow;
    private final long surfaceContainerLowest;
    private final long surfaceDim;
    private final long surfaceTint;
    private final long surfaceVariant;
    private final long tertiary;
    private final long tertiaryContainer;

    private ColorScheme(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40) {
        this.primary = j5;
        this.onPrimary = j6;
        this.primaryContainer = j7;
        this.onPrimaryContainer = j8;
        this.inversePrimary = j9;
        this.secondary = j10;
        this.onSecondary = j11;
        this.secondaryContainer = j12;
        this.onSecondaryContainer = j13;
        this.tertiary = j14;
        this.onTertiary = j15;
        this.tertiaryContainer = j16;
        this.onTertiaryContainer = j17;
        this.background = j18;
        this.onBackground = j19;
        this.surface = j20;
        this.onSurface = j21;
        this.surfaceVariant = j22;
        this.onSurfaceVariant = j23;
        this.surfaceTint = j24;
        this.inverseSurface = j25;
        this.inverseOnSurface = j26;
        this.error = j27;
        this.onError = j28;
        this.errorContainer = j29;
        this.onErrorContainer = j30;
        this.outline = j31;
        this.outlineVariant = j32;
        this.scrim = j33;
        this.surfaceBright = j34;
        this.surfaceDim = j35;
        this.surfaceContainer = j36;
        this.surfaceContainerHigh = j37;
        this.surfaceContainerHighest = j38;
        this.surfaceContainerLow = j39;
        this.surfaceContainerLowest = j40;
    }

    public /* synthetic */ ColorScheme(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, kotlin.jvm.internal.w wVar) {
        this(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40);
    }

    public /* synthetic */ ColorScheme(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, kotlin.jvm.internal.w wVar) {
        this(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33);
    }

    /* renamed from: copy-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1678copyCXl9yA$default(ColorScheme colorScheme, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, int i5, int i6, Object obj) {
        return colorScheme.m1680copyCXl9yA((i5 & 1) != 0 ? colorScheme.primary : j5, (i5 & 2) != 0 ? colorScheme.onPrimary : j6, (i5 & 4) != 0 ? colorScheme.primaryContainer : j7, (i5 & 8) != 0 ? colorScheme.onPrimaryContainer : j8, (i5 & 16) != 0 ? colorScheme.inversePrimary : j9, (i5 & 32) != 0 ? colorScheme.secondary : j10, (i5 & 64) != 0 ? colorScheme.onSecondary : j11, (i5 & 128) != 0 ? colorScheme.secondaryContainer : j12, (i5 & 256) != 0 ? colorScheme.onSecondaryContainer : j13, (i5 & 512) != 0 ? colorScheme.tertiary : j14, (i5 & 1024) != 0 ? colorScheme.onTertiary : j15, (i5 & 2048) != 0 ? colorScheme.tertiaryContainer : j16, (i5 & 4096) != 0 ? colorScheme.onTertiaryContainer : j17, (i5 & 8192) != 0 ? colorScheme.background : j18, (i5 & 16384) != 0 ? colorScheme.onBackground : j19, (i5 & 32768) != 0 ? colorScheme.surface : j20, (i5 & 65536) != 0 ? colorScheme.onSurface : j21, (i5 & 131072) != 0 ? colorScheme.surfaceVariant : j22, (i5 & 262144) != 0 ? colorScheme.onSurfaceVariant : j23, (i5 & 524288) != 0 ? colorScheme.surfaceTint : j24, (i5 & 1048576) != 0 ? colorScheme.inverseSurface : j25, (i5 & 2097152) != 0 ? colorScheme.inverseOnSurface : j26, (i5 & 4194304) != 0 ? colorScheme.error : j27, (i5 & 8388608) != 0 ? colorScheme.onError : j28, (i5 & 16777216) != 0 ? colorScheme.errorContainer : j29, (i5 & 33554432) != 0 ? colorScheme.onErrorContainer : j30, (i5 & 67108864) != 0 ? colorScheme.outline : j31, (i5 & PackageParserEx.GET_SIGNING_CERTIFICATES) != 0 ? colorScheme.outlineVariant : j32, (i5 & 268435456) != 0 ? colorScheme.scrim : j33, (i5 & 536870912) != 0 ? colorScheme.surfaceBright : j34, (i5 & 1073741824) != 0 ? colorScheme.surfaceDim : j35, (i5 & Integer.MIN_VALUE) != 0 ? colorScheme.surfaceContainer : j36, (i6 & 1) != 0 ? colorScheme.surfaceContainerHigh : j37, (i6 & 2) != 0 ? colorScheme.surfaceContainerHighest : j38, (i6 & 4) != 0 ? colorScheme.surfaceContainerLow : j39, (i6 & 8) != 0 ? colorScheme.surfaceContainerLowest : j40);
    }

    public static /* synthetic */ void getDefaultCenterAlignedTopAppBarColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultDatePickerColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultLargeTopAppBarColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultMediumTopAppBarColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultRichTooltipColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultSegmentedButtonColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultTimePickerColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultTopAppBarColorsCached$material3_release$annotations() {
    }

    @p4.l
    /* renamed from: copy-C-Xl9yA, reason: not valid java name */
    public final ColorScheme m1680copyCXl9yA(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40) {
        return new ColorScheme(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, null);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* renamed from: copy-G1PFc-w, reason: not valid java name */
    public final /* synthetic */ ColorScheme m1681copyG1PFcw(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33) {
        return m1678copyCXl9yA$default(this, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m1682getBackground0d7_KjU() {
        return this.background;
    }

    @p4.m
    public final ChipColors getDefaultAssistChipColorsCached$material3_release() {
        return this.defaultAssistChipColorsCached;
    }

    @p4.m
    public final ButtonColors getDefaultButtonColorsCached$material3_release() {
        return this.defaultButtonColorsCached;
    }

    @p4.m
    public final CardColors getDefaultCardColorsCached$material3_release() {
        return this.defaultCardColorsCached;
    }

    @p4.m
    public final TopAppBarColors getDefaultCenterAlignedTopAppBarColorsCached$material3_release() {
        return this.defaultCenterAlignedTopAppBarColorsCached;
    }

    @p4.m
    public final CheckboxColors getDefaultCheckboxColorsCached$material3_release() {
        return this.defaultCheckboxColorsCached;
    }

    @p4.m
    public final DatePickerColors getDefaultDatePickerColorsCached$material3_release() {
        return this.defaultDatePickerColorsCached;
    }

    @p4.m
    public final ChipColors getDefaultElevatedAssistChipColorsCached$material3_release() {
        return this.defaultElevatedAssistChipColorsCached;
    }

    @p4.m
    public final ButtonColors getDefaultElevatedButtonColorsCached$material3_release() {
        return this.defaultElevatedButtonColorsCached;
    }

    @p4.m
    public final CardColors getDefaultElevatedCardColorsCached$material3_release() {
        return this.defaultElevatedCardColorsCached;
    }

    @p4.m
    public final SelectableChipColors getDefaultElevatedFilterChipColorsCached$material3_release() {
        return this.defaultElevatedFilterChipColorsCached;
    }

    @p4.m
    public final ChipColors getDefaultElevatedSuggestionChipColorsCached$material3_release() {
        return this.defaultElevatedSuggestionChipColorsCached;
    }

    @p4.m
    public final ButtonColors getDefaultFilledTonalButtonColorsCached$material3_release() {
        return this.defaultFilledTonalButtonColorsCached;
    }

    @p4.m
    public final SelectableChipColors getDefaultFilterChipColorsCached$material3_release() {
        return this.defaultFilterChipColorsCached;
    }

    @p4.m
    public final IconButtonColors getDefaultIconButtonColorsCached$material3_release() {
        return this.defaultIconButtonColorsCached;
    }

    @p4.m
    public final SelectableChipColors getDefaultInputChipColorsCached$material3_release() {
        return this.defaultInputChipColorsCached;
    }

    @p4.m
    public final TopAppBarColors getDefaultLargeTopAppBarColorsCached$material3_release() {
        return this.defaultLargeTopAppBarColorsCached;
    }

    @p4.m
    public final TopAppBarColors getDefaultMediumTopAppBarColorsCached$material3_release() {
        return this.defaultMediumTopAppBarColorsCached;
    }

    @p4.m
    public final MenuItemColors getDefaultMenuItemColorsCached$material3_release() {
        return this.defaultMenuItemColorsCached;
    }

    @p4.m
    public final NavigationBarItemColors getDefaultNavigationBarItemColorsCached$material3_release() {
        return this.defaultNavigationBarItemColorsCached;
    }

    @p4.m
    public final NavigationRailItemColors getDefaultNavigationRailItemColorsCached$material3_release() {
        return this.defaultNavigationRailItemColorsCached;
    }

    @p4.m
    public final ButtonColors getDefaultOutlinedButtonColorsCached$material3_release() {
        return this.defaultOutlinedButtonColorsCached;
    }

    @p4.m
    public final CardColors getDefaultOutlinedCardColorsCached$material3_release() {
        return this.defaultOutlinedCardColorsCached;
    }

    @p4.m
    public final TextFieldColors getDefaultOutlinedTextFieldColorsCached$material3_release() {
        return this.defaultOutlinedTextFieldColorsCached;
    }

    @p4.m
    public final RadioButtonColors getDefaultRadioButtonColorsCached$material3_release() {
        return this.defaultRadioButtonColorsCached;
    }

    @p4.m
    public final RichTooltipColors getDefaultRichTooltipColorsCached$material3_release() {
        return this.defaultRichTooltipColorsCached;
    }

    @p4.m
    public final SegmentedButtonColors getDefaultSegmentedButtonColorsCached$material3_release() {
        return this.defaultSegmentedButtonColorsCached;
    }

    @p4.m
    public final SliderColors getDefaultSliderColorsCached$material3_release() {
        return this.defaultSliderColorsCached;
    }

    @p4.m
    public final ChipColors getDefaultSuggestionChipColorsCached$material3_release() {
        return this.defaultSuggestionChipColorsCached;
    }

    @p4.m
    public final SwitchColors getDefaultSwitchColorsCached$material3_release() {
        return this.defaultSwitchColorsCached;
    }

    @p4.m
    public final ButtonColors getDefaultTextButtonColorsCached$material3_release() {
        return this.defaultTextButtonColorsCached;
    }

    @p4.m
    public final TextFieldColors getDefaultTextFieldColorsCached$material3_release() {
        return this.defaultTextFieldColorsCached;
    }

    @p4.m
    public final TimePickerColors getDefaultTimePickerColorsCached$material3_release() {
        return this.defaultTimePickerColorsCached;
    }

    @p4.m
    public final TopAppBarColors getDefaultTopAppBarColorsCached$material3_release() {
        return this.defaultTopAppBarColorsCached;
    }

    /* renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m1683getError0d7_KjU() {
        return this.error;
    }

    /* renamed from: getErrorContainer-0d7_KjU, reason: not valid java name */
    public final long m1684getErrorContainer0d7_KjU() {
        return this.errorContainer;
    }

    /* renamed from: getInverseOnSurface-0d7_KjU, reason: not valid java name */
    public final long m1685getInverseOnSurface0d7_KjU() {
        return this.inverseOnSurface;
    }

    /* renamed from: getInversePrimary-0d7_KjU, reason: not valid java name */
    public final long m1686getInversePrimary0d7_KjU() {
        return this.inversePrimary;
    }

    /* renamed from: getInverseSurface-0d7_KjU, reason: not valid java name */
    public final long m1687getInverseSurface0d7_KjU() {
        return this.inverseSurface;
    }

    /* renamed from: getOnBackground-0d7_KjU, reason: not valid java name */
    public final long m1688getOnBackground0d7_KjU() {
        return this.onBackground;
    }

    /* renamed from: getOnError-0d7_KjU, reason: not valid java name */
    public final long m1689getOnError0d7_KjU() {
        return this.onError;
    }

    /* renamed from: getOnErrorContainer-0d7_KjU, reason: not valid java name */
    public final long m1690getOnErrorContainer0d7_KjU() {
        return this.onErrorContainer;
    }

    /* renamed from: getOnPrimary-0d7_KjU, reason: not valid java name */
    public final long m1691getOnPrimary0d7_KjU() {
        return this.onPrimary;
    }

    /* renamed from: getOnPrimaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1692getOnPrimaryContainer0d7_KjU() {
        return this.onPrimaryContainer;
    }

    /* renamed from: getOnSecondary-0d7_KjU, reason: not valid java name */
    public final long m1693getOnSecondary0d7_KjU() {
        return this.onSecondary;
    }

    /* renamed from: getOnSecondaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1694getOnSecondaryContainer0d7_KjU() {
        return this.onSecondaryContainer;
    }

    /* renamed from: getOnSurface-0d7_KjU, reason: not valid java name */
    public final long m1695getOnSurface0d7_KjU() {
        return this.onSurface;
    }

    /* renamed from: getOnSurfaceVariant-0d7_KjU, reason: not valid java name */
    public final long m1696getOnSurfaceVariant0d7_KjU() {
        return this.onSurfaceVariant;
    }

    /* renamed from: getOnTertiary-0d7_KjU, reason: not valid java name */
    public final long m1697getOnTertiary0d7_KjU() {
        return this.onTertiary;
    }

    /* renamed from: getOnTertiaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1698getOnTertiaryContainer0d7_KjU() {
        return this.onTertiaryContainer;
    }

    /* renamed from: getOutline-0d7_KjU, reason: not valid java name */
    public final long m1699getOutline0d7_KjU() {
        return this.outline;
    }

    /* renamed from: getOutlineVariant-0d7_KjU, reason: not valid java name */
    public final long m1700getOutlineVariant0d7_KjU() {
        return this.outlineVariant;
    }

    /* renamed from: getPrimary-0d7_KjU, reason: not valid java name */
    public final long m1701getPrimary0d7_KjU() {
        return this.primary;
    }

    /* renamed from: getPrimaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1702getPrimaryContainer0d7_KjU() {
        return this.primaryContainer;
    }

    /* renamed from: getScrim-0d7_KjU, reason: not valid java name */
    public final long m1703getScrim0d7_KjU() {
        return this.scrim;
    }

    /* renamed from: getSecondary-0d7_KjU, reason: not valid java name */
    public final long m1704getSecondary0d7_KjU() {
        return this.secondary;
    }

    /* renamed from: getSecondaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1705getSecondaryContainer0d7_KjU() {
        return this.secondaryContainer;
    }

    /* renamed from: getSurface-0d7_KjU, reason: not valid java name */
    public final long m1706getSurface0d7_KjU() {
        return this.surface;
    }

    /* renamed from: getSurfaceBright-0d7_KjU, reason: not valid java name */
    public final long m1707getSurfaceBright0d7_KjU() {
        return this.surfaceBright;
    }

    /* renamed from: getSurfaceContainer-0d7_KjU, reason: not valid java name */
    public final long m1708getSurfaceContainer0d7_KjU() {
        return this.surfaceContainer;
    }

    /* renamed from: getSurfaceContainerHigh-0d7_KjU, reason: not valid java name */
    public final long m1709getSurfaceContainerHigh0d7_KjU() {
        return this.surfaceContainerHigh;
    }

    /* renamed from: getSurfaceContainerHighest-0d7_KjU, reason: not valid java name */
    public final long m1710getSurfaceContainerHighest0d7_KjU() {
        return this.surfaceContainerHighest;
    }

    /* renamed from: getSurfaceContainerLow-0d7_KjU, reason: not valid java name */
    public final long m1711getSurfaceContainerLow0d7_KjU() {
        return this.surfaceContainerLow;
    }

    /* renamed from: getSurfaceContainerLowest-0d7_KjU, reason: not valid java name */
    public final long m1712getSurfaceContainerLowest0d7_KjU() {
        return this.surfaceContainerLowest;
    }

    /* renamed from: getSurfaceDim-0d7_KjU, reason: not valid java name */
    public final long m1713getSurfaceDim0d7_KjU() {
        return this.surfaceDim;
    }

    /* renamed from: getSurfaceTint-0d7_KjU, reason: not valid java name */
    public final long m1714getSurfaceTint0d7_KjU() {
        return this.surfaceTint;
    }

    /* renamed from: getSurfaceVariant-0d7_KjU, reason: not valid java name */
    public final long m1715getSurfaceVariant0d7_KjU() {
        return this.surfaceVariant;
    }

    /* renamed from: getTertiary-0d7_KjU, reason: not valid java name */
    public final long m1716getTertiary0d7_KjU() {
        return this.tertiary;
    }

    /* renamed from: getTertiaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1717getTertiaryContainer0d7_KjU() {
        return this.tertiaryContainer;
    }

    public final void setDefaultAssistChipColorsCached$material3_release(@p4.m ChipColors chipColors) {
        this.defaultAssistChipColorsCached = chipColors;
    }

    public final void setDefaultButtonColorsCached$material3_release(@p4.m ButtonColors buttonColors) {
        this.defaultButtonColorsCached = buttonColors;
    }

    public final void setDefaultCardColorsCached$material3_release(@p4.m CardColors cardColors) {
        this.defaultCardColorsCached = cardColors;
    }

    public final void setDefaultCenterAlignedTopAppBarColorsCached$material3_release(@p4.m TopAppBarColors topAppBarColors) {
        this.defaultCenterAlignedTopAppBarColorsCached = topAppBarColors;
    }

    public final void setDefaultCheckboxColorsCached$material3_release(@p4.m CheckboxColors checkboxColors) {
        this.defaultCheckboxColorsCached = checkboxColors;
    }

    public final void setDefaultDatePickerColorsCached$material3_release(@p4.m DatePickerColors datePickerColors) {
        this.defaultDatePickerColorsCached = datePickerColors;
    }

    public final void setDefaultElevatedAssistChipColorsCached$material3_release(@p4.m ChipColors chipColors) {
        this.defaultElevatedAssistChipColorsCached = chipColors;
    }

    public final void setDefaultElevatedButtonColorsCached$material3_release(@p4.m ButtonColors buttonColors) {
        this.defaultElevatedButtonColorsCached = buttonColors;
    }

    public final void setDefaultElevatedCardColorsCached$material3_release(@p4.m CardColors cardColors) {
        this.defaultElevatedCardColorsCached = cardColors;
    }

    public final void setDefaultElevatedFilterChipColorsCached$material3_release(@p4.m SelectableChipColors selectableChipColors) {
        this.defaultElevatedFilterChipColorsCached = selectableChipColors;
    }

    public final void setDefaultElevatedSuggestionChipColorsCached$material3_release(@p4.m ChipColors chipColors) {
        this.defaultElevatedSuggestionChipColorsCached = chipColors;
    }

    public final void setDefaultFilledTonalButtonColorsCached$material3_release(@p4.m ButtonColors buttonColors) {
        this.defaultFilledTonalButtonColorsCached = buttonColors;
    }

    public final void setDefaultFilterChipColorsCached$material3_release(@p4.m SelectableChipColors selectableChipColors) {
        this.defaultFilterChipColorsCached = selectableChipColors;
    }

    public final void setDefaultIconButtonColorsCached$material3_release(@p4.m IconButtonColors iconButtonColors) {
        this.defaultIconButtonColorsCached = iconButtonColors;
    }

    public final void setDefaultInputChipColorsCached$material3_release(@p4.m SelectableChipColors selectableChipColors) {
        this.defaultInputChipColorsCached = selectableChipColors;
    }

    public final void setDefaultLargeTopAppBarColorsCached$material3_release(@p4.m TopAppBarColors topAppBarColors) {
        this.defaultLargeTopAppBarColorsCached = topAppBarColors;
    }

    public final void setDefaultMediumTopAppBarColorsCached$material3_release(@p4.m TopAppBarColors topAppBarColors) {
        this.defaultMediumTopAppBarColorsCached = topAppBarColors;
    }

    public final void setDefaultMenuItemColorsCached$material3_release(@p4.m MenuItemColors menuItemColors) {
        this.defaultMenuItemColorsCached = menuItemColors;
    }

    public final void setDefaultNavigationBarItemColorsCached$material3_release(@p4.m NavigationBarItemColors navigationBarItemColors) {
        this.defaultNavigationBarItemColorsCached = navigationBarItemColors;
    }

    public final void setDefaultNavigationRailItemColorsCached$material3_release(@p4.m NavigationRailItemColors navigationRailItemColors) {
        this.defaultNavigationRailItemColorsCached = navigationRailItemColors;
    }

    public final void setDefaultOutlinedButtonColorsCached$material3_release(@p4.m ButtonColors buttonColors) {
        this.defaultOutlinedButtonColorsCached = buttonColors;
    }

    public final void setDefaultOutlinedCardColorsCached$material3_release(@p4.m CardColors cardColors) {
        this.defaultOutlinedCardColorsCached = cardColors;
    }

    public final void setDefaultOutlinedTextFieldColorsCached$material3_release(@p4.m TextFieldColors textFieldColors) {
        this.defaultOutlinedTextFieldColorsCached = textFieldColors;
    }

    public final void setDefaultRadioButtonColorsCached$material3_release(@p4.m RadioButtonColors radioButtonColors) {
        this.defaultRadioButtonColorsCached = radioButtonColors;
    }

    public final void setDefaultRichTooltipColorsCached$material3_release(@p4.m RichTooltipColors richTooltipColors) {
        this.defaultRichTooltipColorsCached = richTooltipColors;
    }

    public final void setDefaultSegmentedButtonColorsCached$material3_release(@p4.m SegmentedButtonColors segmentedButtonColors) {
        this.defaultSegmentedButtonColorsCached = segmentedButtonColors;
    }

    public final void setDefaultSliderColorsCached$material3_release(@p4.m SliderColors sliderColors) {
        this.defaultSliderColorsCached = sliderColors;
    }

    public final void setDefaultSuggestionChipColorsCached$material3_release(@p4.m ChipColors chipColors) {
        this.defaultSuggestionChipColorsCached = chipColors;
    }

    public final void setDefaultSwitchColorsCached$material3_release(@p4.m SwitchColors switchColors) {
        this.defaultSwitchColorsCached = switchColors;
    }

    public final void setDefaultTextButtonColorsCached$material3_release(@p4.m ButtonColors buttonColors) {
        this.defaultTextButtonColorsCached = buttonColors;
    }

    public final void setDefaultTextFieldColorsCached$material3_release(@p4.m TextFieldColors textFieldColors) {
        this.defaultTextFieldColorsCached = textFieldColors;
    }

    public final void setDefaultTimePickerColorsCached$material3_release(@p4.m TimePickerColors timePickerColors) {
        this.defaultTimePickerColorsCached = timePickerColors;
    }

    public final void setDefaultTopAppBarColorsCached$material3_release(@p4.m TopAppBarColors topAppBarColors) {
        this.defaultTopAppBarColorsCached = topAppBarColors;
    }

    @p4.l
    public String toString() {
        return "ColorScheme(primary=" + ((Object) Color.m3742toStringimpl(this.primary)) + "onPrimary=" + ((Object) Color.m3742toStringimpl(this.onPrimary)) + "primaryContainer=" + ((Object) Color.m3742toStringimpl(this.primaryContainer)) + "onPrimaryContainer=" + ((Object) Color.m3742toStringimpl(this.onPrimaryContainer)) + "inversePrimary=" + ((Object) Color.m3742toStringimpl(this.inversePrimary)) + "secondary=" + ((Object) Color.m3742toStringimpl(this.secondary)) + "onSecondary=" + ((Object) Color.m3742toStringimpl(this.onSecondary)) + "secondaryContainer=" + ((Object) Color.m3742toStringimpl(this.secondaryContainer)) + "onSecondaryContainer=" + ((Object) Color.m3742toStringimpl(this.onSecondaryContainer)) + "tertiary=" + ((Object) Color.m3742toStringimpl(this.tertiary)) + "onTertiary=" + ((Object) Color.m3742toStringimpl(this.onTertiary)) + "tertiaryContainer=" + ((Object) Color.m3742toStringimpl(this.tertiaryContainer)) + "onTertiaryContainer=" + ((Object) Color.m3742toStringimpl(this.onTertiaryContainer)) + "background=" + ((Object) Color.m3742toStringimpl(this.background)) + "onBackground=" + ((Object) Color.m3742toStringimpl(this.onBackground)) + "surface=" + ((Object) Color.m3742toStringimpl(this.surface)) + "onSurface=" + ((Object) Color.m3742toStringimpl(this.onSurface)) + "surfaceVariant=" + ((Object) Color.m3742toStringimpl(this.surfaceVariant)) + "onSurfaceVariant=" + ((Object) Color.m3742toStringimpl(this.onSurfaceVariant)) + "surfaceTint=" + ((Object) Color.m3742toStringimpl(this.surfaceTint)) + "inverseSurface=" + ((Object) Color.m3742toStringimpl(this.inverseSurface)) + "inverseOnSurface=" + ((Object) Color.m3742toStringimpl(this.inverseOnSurface)) + "error=" + ((Object) Color.m3742toStringimpl(this.error)) + "onError=" + ((Object) Color.m3742toStringimpl(this.onError)) + "errorContainer=" + ((Object) Color.m3742toStringimpl(this.errorContainer)) + "onErrorContainer=" + ((Object) Color.m3742toStringimpl(this.onErrorContainer)) + "outline=" + ((Object) Color.m3742toStringimpl(this.outline)) + "outlineVariant=" + ((Object) Color.m3742toStringimpl(this.outlineVariant)) + "scrim=" + ((Object) Color.m3742toStringimpl(this.scrim)) + "surfaceBright=" + ((Object) Color.m3742toStringimpl(this.surfaceBright)) + "surfaceDim=" + ((Object) Color.m3742toStringimpl(this.surfaceDim)) + "surfaceContainer=" + ((Object) Color.m3742toStringimpl(this.surfaceContainer)) + "surfaceContainerHigh=" + ((Object) Color.m3742toStringimpl(this.surfaceContainerHigh)) + "surfaceContainerHighest=" + ((Object) Color.m3742toStringimpl(this.surfaceContainerHighest)) + "surfaceContainerLow=" + ((Object) Color.m3742toStringimpl(this.surfaceContainerLow)) + "surfaceContainerLowest=" + ((Object) Color.m3742toStringimpl(this.surfaceContainerLowest)) + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private ColorScheme(long r75, long r77, long r79, long r81, long r83, long r85, long r87, long r89, long r91, long r93, long r95, long r97, long r99, long r101, long r103, long r105, long r107, long r109, long r111, long r113, long r115, long r117, long r119, long r121, long r123, long r125, long r127, long r129, long r131) {
        /*
            r74 = this;
            r0 = r74
            r1 = r75
            r3 = r77
            r5 = r79
            r7 = r81
            r9 = r83
            r11 = r85
            r13 = r87
            r15 = r89
            r17 = r91
            r19 = r93
            r21 = r95
            r23 = r97
            r25 = r99
            r27 = r101
            r29 = r103
            r31 = r105
            r33 = r107
            r35 = r109
            r37 = r111
            r39 = r113
            r41 = r115
            r43 = r117
            r45 = r119
            r47 = r121
            r49 = r123
            r51 = r125
            r53 = r127
            r55 = r129
            r57 = r131
            androidx.compose.ui.graphics.Color$Companion r71 = androidx.compose.ui.graphics.Color.Companion
            long r59 = r71.m3770getUnspecified0d7_KjU()
            long r61 = r71.m3770getUnspecified0d7_KjU()
            long r63 = r71.m3770getUnspecified0d7_KjU()
            long r65 = r71.m3770getUnspecified0d7_KjU()
            long r67 = r71.m3770getUnspecified0d7_KjU()
            long r69 = r71.m3770getUnspecified0d7_KjU()
            long r71 = r71.m3770getUnspecified0d7_KjU()
            r73 = 0
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ColorScheme.<init>(long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long):void");
    }
}
