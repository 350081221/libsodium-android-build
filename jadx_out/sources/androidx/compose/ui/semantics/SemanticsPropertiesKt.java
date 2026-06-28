package androidx.compose.ui.semantics;

import androidx.autofill.HintConstants;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.navigation.compose.DialogNavigator;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.lody.virtual.client.hook.providers.DownloadProviderHook;
import com.umeng.analytics.pro.d;
import java.util.List;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.x0;
import kotlin.k;
import kotlin.r2;
import kotlin.reflect.o;
import kotlin.v;
import p4.l;
import p4.m;
import t0.b;
import v3.a;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000Ä\u0001\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a:\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007H\u0000\u001a-\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u0005\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0082\b\u001a\n\u0010\u000f\u001a\u00020\u000e*\u00020\r\u001a\n\u0010\u0010\u001a\u00020\u000e*\u00020\r\u001a\f\u0010\u0011\u001a\u00020\u000e*\u00020\rH\u0007\u001a\n\u0010\u0012\u001a\u00020\u000e*\u00020\r\u001a\n\u0010\u0013\u001a\u00020\u000e*\u00020\r\u001a\n\u0010\u0014\u001a\u00020\u000e*\u00020\r\u001a\u0012\u0010\u0016\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0003\u001a\u001e\u0010\u001b\u001a\u00020\u000e*\u00020\r2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017\u001a\n\u0010\u001c\u001a\u00020\u000e*\u00020\r\u001a2\u0010!\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u001a\u0010 \u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017\u001a&\u0010#\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"\u001a&\u0010$\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"\u001aP\u0010)\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000328\u0010 \u001a4\u0012\u0013\u0012\u00110%¢\u0006\f\b&\u0012\b\b\u0004\u0012\u0004\b\b('\u0012\u0013\u0012\u00110%¢\u0006\f\b&\u0012\b\b\u0004\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u001a*\u0010*\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\n0\u0017\u001a,\u0010+\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017\u001a,\u0010-\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017\u001a,\u0010.\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017\u001a,\u0010/\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017\u001a&\u00100\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"\u001a,\u00101\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017\u001a8\u00106\u001a\u00020\u000e*\u00020\r2\u0006\u00103\u001a\u0002022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a(\u00107\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"H\u0007\u001ae\u0010<\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032M\u0010 \u001aI\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b&\u0012\b\b\u0004\u0012\u0004\b\b(9\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b&\u0012\b\b\u0004\u0012\u0004\b\b(:\u0012\u0013\u0012\u00110\n¢\u0006\f\b&\u0012\b\b\u0004\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020\n\u0018\u000108\u001a&\u0010=\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"\u001a&\u0010>\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"\u001a&\u0010?\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"\u001a&\u0010@\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"\u001a&\u0010A\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"\u001a&\u0010B\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"\u001a&\u0010C\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"\u001a&\u0010D\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"\u001a&\u0010E\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"\u001a&\u0010F\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"\u001a&\u0010G\u001a\u00020\u000e*\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"\"(\u0010M\u001a\u00020\u0003*\u00020\r2\u0006\u0010H\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L\"/\u0010S\u001a\u00020\u0003*\u00020\r2\u0006\u0010N\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bO\u0010J\"\u0004\bP\u0010L*\u0004\bQ\u0010R\"/\u0010Z\u001a\u00020T*\u00020\r2\u0006\u0010N\u001a\u00020T8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X*\u0004\bY\u0010R\"/\u0010^\u001a\u00020\u0003*\u00020\r2\u0006\u0010N\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b[\u0010J\"\u0004\b\\\u0010L*\u0004\b]\u0010R\"/\u0010e\u001a\u00020_*\u00020\r2\u0006\u0010N\u001a\u00020_8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b`\u0010a\"\u0004\bb\u0010c*\u0004\bd\u0010R\"/\u0010k\u001a\u00020\n*\u00020\r2\u0006\u0010N\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bf\u0010g\"\u0004\bh\u0010i*\u0004\bj\u0010R\"5\u0010l\u001a\u00020\n*\u00020\r2\u0006\u0010N\u001a\u00020\n8F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bn\u0010o\u001a\u0004\bl\u0010g\"\u0004\bm\u0010i*\u0004\bp\u0010R\"/\u0010q\u001a\u00020\n*\u00020\r2\u0006\u0010N\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bq\u0010g\"\u0004\br\u0010i*\u0004\bs\u0010R\"/\u0010y\u001a\u00020%*\u00020\r2\u0006\u0010N\u001a\u00020%8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bt\u0010u\"\u0004\bv\u0010w*\u0004\bx\u0010R\"0\u0010\u0080\u0001\u001a\u00020z*\u00020\r2\u0006\u0010N\u001a\u00020z8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~*\u0004\b\u007f\u0010R\"3\u0010\u0084\u0001\u001a\u00020z*\u00020\r2\u0006\u0010N\u001a\u00020z8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0081\u0001\u0010|\"\u0005\b\u0082\u0001\u0010~*\u0005\b\u0083\u0001\u0010R\"5\u0010\u0089\u0001\u001a\u00030\u0085\u0001*\u00020\r2\u0007\u0010N\u001a\u00030\u0085\u00018F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0086\u0001\u0010a\"\u0005\b\u0087\u0001\u0010c*\u0005\b\u0088\u0001\u0010R\"3\u0010\u008d\u0001\u001a\u00020\u0003*\u00020\r2\u0006\u0010N\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u008a\u0001\u0010J\"\u0005\b\u008b\u0001\u0010L*\u0005\b\u008c\u0001\u0010R\",\u0010\u0091\u0001\u001a\u00020,*\u00020\r2\u0006\u0010H\u001a\u00020,8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0005\b-\u0010\u0090\u0001\"4\u0010\u0094\u0001\u001a\u00020,*\u00020\r2\u0006\u0010N\u001a\u00020,8F@FX\u0086\u008e\u0002¢\u0006\u0016\u001a\u0006\b\u0092\u0001\u0010\u008f\u0001\"\u0005\b.\u0010\u0090\u0001*\u0005\b\u0093\u0001\u0010R\"3\u0010\u0095\u0001\u001a\u00020\n*\u00020\r2\u0006\u0010N\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0095\u0001\u0010g\"\u0005\b\u0096\u0001\u0010i*\u0005\b\u0097\u0001\u0010R\"5\u0010\u009b\u0001\u001a\u00020,*\u00020\r2\u0006\u0010N\u001a\u00020,8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0098\u0001\u0010\u008f\u0001\"\u0006\b\u0099\u0001\u0010\u0090\u0001*\u0005\b\u009a\u0001\u0010R\"7\u0010¢\u0001\u001a\u00030\u009c\u0001*\u00020\r2\u0007\u0010N\u001a\u00030\u009c\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001*\u0005\b¡\u0001\u0010R\":\u0010§\u0001\u001a\u000202*\u00020\r2\u0006\u0010N\u001a\u0002028G@GX\u0087\u008e\u0002¢\u0006\u001c\u0012\u0005\b¥\u0001\u0010o\u001a\u0005\b£\u0001\u0010a\"\u0005\b¤\u0001\u0010c*\u0005\b¦\u0001\u0010R\"3\u0010«\u0001\u001a\u00020\n*\u00020\r2\u0006\u0010N\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b¨\u0001\u0010g\"\u0005\b©\u0001\u0010i*\u0005\bª\u0001\u0010R\"7\u0010²\u0001\u001a\u00030¬\u0001*\u00020\r2\u0007\u0010N\u001a\u00030¬\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001*\u0005\b±\u0001\u0010R\"7\u0010¹\u0001\u001a\u00030³\u0001*\u00020\r2\u0007\u0010N\u001a\u00030³\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001*\u0005\b¸\u0001\u0010R\"7\u0010À\u0001\u001a\u00030º\u0001*\u00020\r2\u0007\u0010N\u001a\u00030º\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001*\u0005\b¿\u0001\u0010R\"E\u0010È\u0001\u001a\n\u0012\u0005\u0012\u00030Â\u00010Á\u0001*\u00020\r2\u000e\u0010N\u001a\n\u0012\u0005\u0012\u00030Â\u00010Á\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001*\u0005\bÇ\u0001\u0010R\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006É\u0001"}, d2 = {"T", "throwSemanticsGetNotSupported", "()Ljava/lang/Object;", "", "name", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "AccessibilityKey", "Lkotlin/Function2;", "mergePolicy", "Lkotlin/v;", "", "Landroidx/compose/ui/semantics/AccessibilityAction;", "ActionPropertyKey", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "heading", "disabled", "invisibleToUser", "popup", DialogNavigator.NAME, HintConstants.AUTOFILL_HINT_PASSWORD, DownloadProviderHook.COLUMN_DESCRIPTION, d.U, "Lkotlin/Function1;", "", "", "mapping", "indexForKey", "selectableGroup", TTDownloadField.TT_LABEL, "", "Landroidx/compose/ui/text/TextLayoutResult;", "action", "getTextLayoutResult", "Lkotlin/Function0;", "onClick", "onLongClick", "", "Lkotlin/v0;", "x", "y", "scrollBy", "scrollToIndex", "setProgress", "Landroidx/compose/ui/text/AnnotatedString;", "setText", "setTextSubstitution", "showTextSubstitution", "clearTextSubstitution", "insertTextAtCursor", "Landroidx/compose/ui/text/input/ImeAction;", "imeActionType", "onImeAction-9UiTYpY", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;ILjava/lang/String;Lv3/a;)V", "onImeAction", "performImeAction", "Lkotlin/Function3;", "startIndex", "endIndex", "relativeToOriginalText", "setSelection", "copyText", "cutText", "pasteText", "expand", "collapse", "dismiss", "requestFocus", "pageUp", "pageDown", "pageLeft", "pageRight", b.f22420d, "getContentDescription", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", "setContentDescription", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;)V", "contentDescription", "<set-?>", "getStateDescription", "setStateDescription", "getStateDescription$delegate", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/Object;", "stateDescription", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "getProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "setProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ProgressBarRangeInfo;)V", "getProgressBarRangeInfo$delegate", "progressBarRangeInfo", "getPaneTitle", "setPaneTitle", "getPaneTitle$delegate", "paneTitle", "Landroidx/compose/ui/semantics/LiveRegionMode;", "getLiveRegion", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", "setLiveRegion-hR3wRGc", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;I)V", "getLiveRegion$delegate", "liveRegion", "getFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", "setFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V", "getFocused$delegate", "focused", "isContainer", "setContainer", "isContainer$annotations", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "isContainer$delegate", "isTraversalGroup", "setTraversalGroup", "isTraversalGroup$delegate", "getTraversalIndex", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", "setTraversalIndex", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;F)V", "getTraversalIndex$delegate", "traversalIndex", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "getHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", "setHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ScrollAxisRange;)V", "getHorizontalScrollAxisRange$delegate", "horizontalScrollAxisRange", "getVerticalScrollAxisRange", "setVerticalScrollAxisRange", "getVerticalScrollAxisRange$delegate", "verticalScrollAxisRange", "Landroidx/compose/ui/semantics/Role;", "getRole", "setRole-kuIjeqM", "getRole$delegate", "role", "getTestTag", "setTestTag", "getTestTag$delegate", "testTag", "getText", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/text/AnnotatedString;)V", "text", "getTextSubstitution", "getTextSubstitution$delegate", "textSubstitution", "isShowingTextSubstitution", "setShowingTextSubstitution", "isShowingTextSubstitution$delegate", "getEditableText", "setEditableText", "getEditableText$delegate", "editableText", "Landroidx/compose/ui/text/TextRange;", "getTextSelectionRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", "setTextSelectionRange-FDrldGo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;J)V", "getTextSelectionRange$delegate", "textSelectionRange", "getImeAction", "setImeAction-4L7nppU", "getImeAction$annotations", "getImeAction$delegate", "imeAction", "getSelected", "setSelected", "getSelected$delegate", "selected", "Landroidx/compose/ui/semantics/CollectionInfo;", "getCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", "setCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionInfo;)V", "getCollectionInfo$delegate", "collectionInfo", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "getCollectionItemInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", "setCollectionItemInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionItemInfo;)V", "getCollectionItemInfo$delegate", "collectionItemInfo", "Landroidx/compose/ui/state/ToggleableState;", "getToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", "setToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/state/ToggleableState;)V", "getToggleableState$delegate", "toggleableState", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "getCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", "setCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/util/List;)V", "getCustomActions$delegate", "customActions", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SemanticsPropertiesKt {
    static final /* synthetic */ o<Object>[] $$delegatedProperties = {l1.k(new x0(SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), l1.k(new x0(SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), l1.k(new x0(SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), l1.k(new x0(SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), l1.k(new x0(SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), l1.k(new x0(SemanticsPropertiesKt.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), l1.k(new x0(SemanticsPropertiesKt.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), l1.k(new x0(SemanticsPropertiesKt.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1)), l1.k(new x0(SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), l1.k(new x0(SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), l1.k(new x0(SemanticsPropertiesKt.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), l1.k(new x0(SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), l1.k(new x0(SemanticsPropertiesKt.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), l1.k(new x0(SemanticsPropertiesKt.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), l1.k(new x0(SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), l1.k(new x0(SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), l1.k(new x0(SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), l1.k(new x0(SemanticsPropertiesKt.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), l1.k(new x0(SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), l1.k(new x0(SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), l1.k(new x0(SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), l1.k(new x0(SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};

    static {
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        semanticsProperties.getStateDescription();
        semanticsProperties.getProgressBarRangeInfo();
        semanticsProperties.getPaneTitle();
        semanticsProperties.getLiveRegion();
        semanticsProperties.getFocused();
        semanticsProperties.getIsTraversalGroup();
        semanticsProperties.getIsTraversalGroup();
        semanticsProperties.getTraversalIndex();
        semanticsProperties.getHorizontalScrollAxisRange();
        semanticsProperties.getVerticalScrollAxisRange();
        semanticsProperties.getRole();
        semanticsProperties.getTestTag();
        semanticsProperties.getTextSubstitution();
        semanticsProperties.getIsShowingTextSubstitution();
        semanticsProperties.getEditableText();
        semanticsProperties.getTextSelectionRange();
        semanticsProperties.getImeAction();
        semanticsProperties.getSelected();
        semanticsProperties.getCollectionInfo();
        semanticsProperties.getCollectionItemInfo();
        semanticsProperties.getToggleableState();
        SemanticsActions.INSTANCE.getCustomActions();
    }

    @l
    public static final <T> SemanticsPropertyKey<T> AccessibilityKey(@l String str) {
        return new SemanticsPropertyKey<>(str, true);
    }

    private static final <T extends v<? extends Boolean>> SemanticsPropertyKey<AccessibilityAction<T>> ActionPropertyKey(String str) {
        return AccessibilityKey(str, SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE);
    }

    public static final void clearTextSubstitution(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getClearTextSubstitution(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void clearTextSubstitution$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        clearTextSubstitution(semanticsPropertyReceiver, str, aVar);
    }

    public static final void collapse(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCollapse(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void collapse$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        collapse(semanticsPropertyReceiver, str, aVar);
    }

    public static final void copyText(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCopyText(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void copyText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        copyText(semanticsPropertyReceiver, str, aVar);
    }

    public static final void cutText(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCutText(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void cutText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        cutText(semanticsPropertyReceiver, str, aVar);
    }

    public static final void dialog(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIsDialog(), r2.f19517a);
    }

    public static final void disabled(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getDisabled(), r2.f19517a);
    }

    public static final void dismiss(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getDismiss(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void dismiss$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        dismiss(semanticsPropertyReceiver, str, aVar);
    }

    public static final void error(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getError(), str);
    }

    public static final void expand(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getExpand(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void expand$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        expand(semanticsPropertyReceiver, str, aVar);
    }

    @l
    public static final CollectionInfo getCollectionInfo(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getCollectionInfo().getValue(semanticsPropertyReceiver, $$delegatedProperties[18]);
    }

    @l
    public static final CollectionItemInfo getCollectionItemInfo(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getCollectionItemInfo().getValue(semanticsPropertyReceiver, $$delegatedProperties[19]);
    }

    @l
    public static final String getContentDescription(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return (String) throwSemanticsGetNotSupported();
    }

    @l
    public static final List<CustomAccessibilityAction> getCustomActions(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsActions.INSTANCE.getCustomActions().getValue(semanticsPropertyReceiver, $$delegatedProperties[21]);
    }

    @l
    public static final AnnotatedString getEditableText(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getEditableText().getValue(semanticsPropertyReceiver, $$delegatedProperties[14]);
    }

    public static final boolean getFocused(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getFocused().getValue(semanticsPropertyReceiver, $$delegatedProperties[4]).booleanValue();
    }

    @l
    public static final ScrollAxisRange getHorizontalScrollAxisRange(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange().getValue(semanticsPropertyReceiver, $$delegatedProperties[8]);
    }

    @k(message = "Pass the ImeAction to onImeAction instead.")
    public static final int getImeAction(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getImeAction().getValue(semanticsPropertyReceiver, $$delegatedProperties[16]).m5712unboximpl();
    }

    @k(message = "Pass the ImeAction to onImeAction instead.")
    public static /* synthetic */ void getImeAction$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    public static final int getLiveRegion(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getLiveRegion().getValue(semanticsPropertyReceiver, $$delegatedProperties[3]).m5363unboximpl();
    }

    @l
    public static final String getPaneTitle(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getPaneTitle().getValue(semanticsPropertyReceiver, $$delegatedProperties[2]);
    }

    @l
    public static final ProgressBarRangeInfo getProgressBarRangeInfo(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getProgressBarRangeInfo().getValue(semanticsPropertyReceiver, $$delegatedProperties[1]);
    }

    public static final int getRole(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getRole().getValue(semanticsPropertyReceiver, $$delegatedProperties[10]).m5372unboximpl();
    }

    public static final boolean getSelected(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getSelected().getValue(semanticsPropertyReceiver, $$delegatedProperties[17]).booleanValue();
    }

    @l
    public static final String getStateDescription(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getStateDescription().getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    @l
    public static final String getTestTag(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getTestTag().getValue(semanticsPropertyReceiver, $$delegatedProperties[11]);
    }

    @l
    public static final AnnotatedString getText(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return (AnnotatedString) throwSemanticsGetNotSupported();
    }

    public static final void getTextLayoutResult(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m v3.l<? super List<TextLayoutResult>, Boolean> lVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getGetTextLayoutResult(), new AccessibilityAction(str, lVar));
    }

    public static /* synthetic */ void getTextLayoutResult$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        getTextLayoutResult(semanticsPropertyReceiver, str, lVar);
    }

    public static final long getTextSelectionRange(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getTextSelectionRange().getValue(semanticsPropertyReceiver, $$delegatedProperties[15]).m5549unboximpl();
    }

    @l
    public static final AnnotatedString getTextSubstitution(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getTextSubstitution().getValue(semanticsPropertyReceiver, $$delegatedProperties[12]);
    }

    @l
    public static final ToggleableState getToggleableState(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getToggleableState().getValue(semanticsPropertyReceiver, $$delegatedProperties[20]);
    }

    public static final float getTraversalIndex(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getTraversalIndex().getValue(semanticsPropertyReceiver, $$delegatedProperties[7]).floatValue();
    }

    @l
    public static final ScrollAxisRange getVerticalScrollAxisRange(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getVerticalScrollAxisRange().getValue(semanticsPropertyReceiver, $$delegatedProperties[9]);
    }

    public static final void heading(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getHeading(), r2.f19517a);
    }

    public static final void indexForKey(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @l v3.l<Object, Integer> lVar) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIndexForKey(), lVar);
    }

    public static final void insertTextAtCursor(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m v3.l<? super AnnotatedString, Boolean> lVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getInsertTextAtCursor(), new AccessibilityAction(str, lVar));
    }

    public static /* synthetic */ void insertTextAtCursor$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        insertTextAtCursor(semanticsPropertyReceiver, str, lVar);
    }

    @ExperimentalComposeUiApi
    public static final void invisibleToUser(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getInvisibleToUser(), r2.f19517a);
    }

    public static final boolean isContainer(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getIsTraversalGroup().getValue(semanticsPropertyReceiver, $$delegatedProperties[5]).booleanValue();
    }

    @k(message = "Use `isTraversalGroup` instead.", replaceWith = @b1(expression = "isTraversalGroup", imports = {}))
    public static /* synthetic */ void isContainer$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    public static final boolean isShowingTextSubstitution(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getIsShowingTextSubstitution().getValue(semanticsPropertyReceiver, $$delegatedProperties[13]).booleanValue();
    }

    public static final boolean isTraversalGroup(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getIsTraversalGroup().getValue(semanticsPropertyReceiver, $$delegatedProperties[6]).booleanValue();
    }

    public static final void onClick(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnClick(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void onClick$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        onClick(semanticsPropertyReceiver, str, aVar);
    }

    /* renamed from: onImeAction-9UiTYpY */
    public static final void m5385onImeAction9UiTYpY(@l SemanticsPropertyReceiver semanticsPropertyReceiver, int i5, @m String str, @m a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getImeAction(), ImeAction.m5706boximpl(i5));
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnImeAction(), new AccessibilityAction(str, aVar));
    }

    /* renamed from: onImeAction-9UiTYpY$default */
    public static /* synthetic */ void m5386onImeAction9UiTYpY$default(SemanticsPropertyReceiver semanticsPropertyReceiver, int i5, String str, a aVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            str = null;
        }
        m5385onImeAction9UiTYpY(semanticsPropertyReceiver, i5, str, aVar);
    }

    public static final void onLongClick(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnLongClick(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void onLongClick$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        onLongClick(semanticsPropertyReceiver, str, aVar);
    }

    public static final void pageDown(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageDown(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void pageDown$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        pageDown(semanticsPropertyReceiver, str, aVar);
    }

    public static final void pageLeft(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageLeft(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void pageLeft$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        pageLeft(semanticsPropertyReceiver, str, aVar);
    }

    public static final void pageRight(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageRight(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void pageRight$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        pageRight(semanticsPropertyReceiver, str, aVar);
    }

    public static final void pageUp(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageUp(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void pageUp$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        pageUp(semanticsPropertyReceiver, str, aVar);
    }

    public static final void password(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getPassword(), r2.f19517a);
    }

    public static final void pasteText(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPasteText(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void pasteText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        pasteText(semanticsPropertyReceiver, str, aVar);
    }

    @k(level = kotlin.m.ERROR, message = "Use `SemanticsPropertyReceiver.onImeAction` instead.", replaceWith = @b1(expression = "onImeAction(imeActionType = ImeAction.Default, label = label, action = action)", imports = {"androidx.compose.ui.semantics.onImeAction", "androidx.compose.ui.text.input.ImeAction"}))
    public static final void performImeAction(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnImeAction(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void performImeAction$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        performImeAction(semanticsPropertyReceiver, str, aVar);
    }

    public static final void popup(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIsPopup(), r2.f19517a);
    }

    public static final void requestFocus(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getRequestFocus(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void requestFocus$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        requestFocus(semanticsPropertyReceiver, str, aVar);
    }

    public static final void scrollBy(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m p<? super Float, ? super Float, Boolean> pVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getScrollBy(), new AccessibilityAction(str, pVar));
    }

    public static /* synthetic */ void scrollBy$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        scrollBy(semanticsPropertyReceiver, str, pVar);
    }

    public static final void scrollToIndex(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @l v3.l<? super Integer, Boolean> lVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getScrollToIndex(), new AccessibilityAction(str, lVar));
    }

    public static /* synthetic */ void scrollToIndex$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        scrollToIndex(semanticsPropertyReceiver, str, lVar);
    }

    public static final void selectableGroup(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getSelectableGroup(), r2.f19517a);
    }

    public static final void setCollectionInfo(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @l CollectionInfo collectionInfo) {
        SemanticsProperties.INSTANCE.getCollectionInfo().setValue(semanticsPropertyReceiver, $$delegatedProperties[18], collectionInfo);
    }

    public static final void setCollectionItemInfo(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @l CollectionItemInfo collectionItemInfo) {
        SemanticsProperties.INSTANCE.getCollectionItemInfo().setValue(semanticsPropertyReceiver, $$delegatedProperties[19], collectionItemInfo);
    }

    public static final void setContainer(@l SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z4) {
        SemanticsProperties.INSTANCE.getIsTraversalGroup().setValue(semanticsPropertyReceiver, $$delegatedProperties[5], Boolean.valueOf(z4));
    }

    public static final void setContentDescription(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str) {
        List k5;
        SemanticsPropertyKey<List<String>> contentDescription = SemanticsProperties.INSTANCE.getContentDescription();
        k5 = kotlin.collections.v.k(str);
        semanticsPropertyReceiver.set(contentDescription, k5);
    }

    public static final void setCustomActions(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @l List<CustomAccessibilityAction> list) {
        SemanticsActions.INSTANCE.getCustomActions().setValue(semanticsPropertyReceiver, $$delegatedProperties[21], list);
    }

    public static final void setEditableText(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @l AnnotatedString annotatedString) {
        SemanticsProperties.INSTANCE.getEditableText().setValue(semanticsPropertyReceiver, $$delegatedProperties[14], annotatedString);
    }

    public static final void setFocused(@l SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z4) {
        SemanticsProperties.INSTANCE.getFocused().setValue(semanticsPropertyReceiver, $$delegatedProperties[4], Boolean.valueOf(z4));
    }

    public static final void setHorizontalScrollAxisRange(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @l ScrollAxisRange scrollAxisRange) {
        SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange().setValue(semanticsPropertyReceiver, $$delegatedProperties[8], scrollAxisRange);
    }

    @k(message = "Pass the ImeAction to onImeAction instead.")
    /* renamed from: setImeAction-4L7nppU */
    public static final void m5387setImeAction4L7nppU(@l SemanticsPropertyReceiver semanticsPropertyReceiver, int i5) {
        SemanticsProperties.INSTANCE.getImeAction().setValue(semanticsPropertyReceiver, $$delegatedProperties[16], ImeAction.m5706boximpl(i5));
    }

    /* renamed from: setLiveRegion-hR3wRGc */
    public static final void m5388setLiveRegionhR3wRGc(@l SemanticsPropertyReceiver semanticsPropertyReceiver, int i5) {
        SemanticsProperties.INSTANCE.getLiveRegion().setValue(semanticsPropertyReceiver, $$delegatedProperties[3], LiveRegionMode.m5357boximpl(i5));
    }

    public static final void setPaneTitle(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str) {
        SemanticsProperties.INSTANCE.getPaneTitle().setValue(semanticsPropertyReceiver, $$delegatedProperties[2], str);
    }

    public static final void setProgress(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m v3.l<? super Float, Boolean> lVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetProgress(), new AccessibilityAction(str, lVar));
    }

    public static /* synthetic */ void setProgress$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        setProgress(semanticsPropertyReceiver, str, lVar);
    }

    public static final void setProgressBarRangeInfo(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @l ProgressBarRangeInfo progressBarRangeInfo) {
        SemanticsProperties.INSTANCE.getProgressBarRangeInfo().setValue(semanticsPropertyReceiver, $$delegatedProperties[1], progressBarRangeInfo);
    }

    /* renamed from: setRole-kuIjeqM */
    public static final void m5389setRolekuIjeqM(@l SemanticsPropertyReceiver semanticsPropertyReceiver, int i5) {
        SemanticsProperties.INSTANCE.getRole().setValue(semanticsPropertyReceiver, $$delegatedProperties[10], Role.m5366boximpl(i5));
    }

    public static final void setSelected(@l SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z4) {
        SemanticsProperties.INSTANCE.getSelected().setValue(semanticsPropertyReceiver, $$delegatedProperties[17], Boolean.valueOf(z4));
    }

    public static final void setSelection(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m q<? super Integer, ? super Integer, ? super Boolean, Boolean> qVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetSelection(), new AccessibilityAction(str, qVar));
    }

    public static /* synthetic */ void setSelection$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, q qVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        setSelection(semanticsPropertyReceiver, str, qVar);
    }

    public static final void setShowingTextSubstitution(@l SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z4) {
        SemanticsProperties.INSTANCE.getIsShowingTextSubstitution().setValue(semanticsPropertyReceiver, $$delegatedProperties[13], Boolean.valueOf(z4));
    }

    public static final void setStateDescription(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str) {
        SemanticsProperties.INSTANCE.getStateDescription().setValue(semanticsPropertyReceiver, $$delegatedProperties[0], str);
    }

    public static final void setTestTag(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str) {
        SemanticsProperties.INSTANCE.getTestTag().setValue(semanticsPropertyReceiver, $$delegatedProperties[11], str);
    }

    public static final void setText(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @l AnnotatedString annotatedString) {
        List k5;
        SemanticsPropertyKey<List<AnnotatedString>> text = SemanticsProperties.INSTANCE.getText();
        k5 = kotlin.collections.v.k(annotatedString);
        semanticsPropertyReceiver.set(text, k5);
    }

    public static /* synthetic */ void setText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        setText(semanticsPropertyReceiver, str, lVar);
    }

    /* renamed from: setTextSelectionRange-FDrldGo */
    public static final void m5390setTextSelectionRangeFDrldGo(@l SemanticsPropertyReceiver semanticsPropertyReceiver, long j5) {
        SemanticsProperties.INSTANCE.getTextSelectionRange().setValue(semanticsPropertyReceiver, $$delegatedProperties[15], TextRange.m5533boximpl(j5));
    }

    public static final void setTextSubstitution(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @l AnnotatedString annotatedString) {
        SemanticsProperties.INSTANCE.getTextSubstitution().setValue(semanticsPropertyReceiver, $$delegatedProperties[12], annotatedString);
    }

    public static /* synthetic */ void setTextSubstitution$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        setTextSubstitution(semanticsPropertyReceiver, str, lVar);
    }

    public static final void setToggleableState(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @l ToggleableState toggleableState) {
        SemanticsProperties.INSTANCE.getToggleableState().setValue(semanticsPropertyReceiver, $$delegatedProperties[20], toggleableState);
    }

    public static final void setTraversalGroup(@l SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z4) {
        SemanticsProperties.INSTANCE.getIsTraversalGroup().setValue(semanticsPropertyReceiver, $$delegatedProperties[6], Boolean.valueOf(z4));
    }

    public static final void setTraversalIndex(@l SemanticsPropertyReceiver semanticsPropertyReceiver, float f5) {
        SemanticsProperties.INSTANCE.getTraversalIndex().setValue(semanticsPropertyReceiver, $$delegatedProperties[7], Float.valueOf(f5));
    }

    public static final void setVerticalScrollAxisRange(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @l ScrollAxisRange scrollAxisRange) {
        SemanticsProperties.INSTANCE.getVerticalScrollAxisRange().setValue(semanticsPropertyReceiver, $$delegatedProperties[9], scrollAxisRange);
    }

    public static final void showTextSubstitution(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m v3.l<? super Boolean, Boolean> lVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getShowTextSubstitution(), new AccessibilityAction(str, lVar));
    }

    public static /* synthetic */ void showTextSubstitution$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        showTextSubstitution(semanticsPropertyReceiver, str, lVar);
    }

    public static final <T> T throwSemanticsGetNotSupported() {
        throw new UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }

    @l
    public static final <T> SemanticsPropertyKey<T> AccessibilityKey(@l String str, @l p<? super T, ? super T, ? extends T> pVar) {
        return new SemanticsPropertyKey<>(str, true, pVar);
    }

    public static final void setText(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m v3.l<? super AnnotatedString, Boolean> lVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetText(), new AccessibilityAction(str, lVar));
    }

    public static final void setTextSubstitution(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @m String str, @m v3.l<? super AnnotatedString, Boolean> lVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetTextSubstitution(), new AccessibilityAction(str, lVar));
    }
}
