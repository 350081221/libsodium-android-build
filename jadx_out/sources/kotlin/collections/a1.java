package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u1;
import kotlin.r2;
import kotlin.v2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000~\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010(\n\u0002\u0010)\n\u0002\u0010'\n\u0002\b\n\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0017\u001a`\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u00052%\b\u0001\u0010\u0006\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001aX\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032%\b\u0001\u0010\u0006\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a\u001e\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\u001a1\u0010\f\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\rj\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003`\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0087\b\u001a_\u0010\f\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\rj\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003`\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011¢\u0006\u0002\u0010\u0012\u001a1\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0014j\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003`\u0015\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0087\b\u001a_\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0014j\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003`\u0015\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011¢\u0006\u0002\u0010\u0016\u001a!\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0087\b\u001aO\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011¢\u0006\u0002\u0010\u0018\u001a!\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0087\b\u001aO\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011¢\u0006\u0002\u0010\u0018\u001a*\u0010\u001a\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001bH\u0087\n¢\u0006\u0002\u0010\u001c\u001a*\u0010\u001d\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001bH\u0087\n¢\u0006\u0002\u0010\u001c\u001a9\u0010\u001e\u001a\u00020\u001f\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b \"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010!\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\"\u001a1\u0010#\u001a\u00020\u001f\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b *\u000e\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0002\b\u00030\u00012\u0006\u0010!\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\"\u001a7\u0010$\u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0002\"\t\b\u0001\u0010\u0003¢\u0006\u0002\b *\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010%\u001a\u0002H\u0003H\u0087\b¢\u0006\u0002\u0010\"\u001aV\u0010&\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u00020\u001f0\u0007H\u0086\bø\u0001\u0000\u001aJ\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u001f0\u0007H\u0086\bø\u0001\u0000\u001aV\u0010)\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u00020\u001f0\u0007H\u0086\bø\u0001\u0000\u001aq\u0010*\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010,\u001a\u0002H+2\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u00020\u001f0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010-\u001aq\u0010.\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010,\u001a\u0002H+2\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u00020\u001f0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010-\u001aJ\u0010/\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u001f0\u0007H\u0086\bø\u0001\u0000\u001a;\u00100\u001a\u0004\u0018\u0001H\u0003\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b \"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010!\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u00101\u001aC\u00102\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010!\u001a\u0002H\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u0002H\u000304H\u0087\bø\u0001\u0000¢\u0006\u0002\u00105\u001aC\u00106\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010!\u001a\u0002H\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u0002H\u000304H\u0080\bø\u0001\u0000¢\u0006\u0002\u00105\u001aC\u00107\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b2\u0006\u0010!\u001a\u0002H\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u0002H\u000304H\u0086\bø\u0001\u0000¢\u0006\u0002\u00105\u001a1\u00108\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010!\u001a\u0002H\u0002H\u0007¢\u0006\u0002\u00101\u001a?\u00109\u001a\u0002H:\"\u0014\b\u0000\u0010+*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0001*\u0002H:\"\u0004\b\u0001\u0010:*\u0002H+2\f\u00103\u001a\b\u0012\u0004\u0012\u0002H:04H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010;\u001a'\u0010<\u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\b\u001a:\u0010=\u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a9\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b0?\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\n\u001a<\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030A0@\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\bH\u0087\n¢\u0006\u0002\bB\u001a\\\u0010C\u001a\u000e\u0012\u0004\u0012\u0002H:\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010:*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010D\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u0002H:0\u0007H\u0086\bø\u0001\u0000\u001aw\u0010E\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010:\"\u0018\b\u0003\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H:\u0012\u0006\b\u0000\u0012\u0002H\u00030\b*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010,\u001a\u0002H+2\u001e\u0010D\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u0002H:0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010-\u001a\\\u0010F\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H:0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010:*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010D\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u0002H:0\u0007H\u0086\bø\u0001\u0000\u001aw\u0010G\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010:\"\u0018\b\u0003\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H:0\b*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010,\u001a\u0002H+2\u001e\u0010D\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u0002H:0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010-\u001a@\u0010H\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010!\u001a\u0002H\u0002H\u0087\u0002¢\u0006\u0002\u0010I\u001aH\u0010H\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u000e\u0010J\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0010H\u0087\u0002¢\u0006\u0002\u0010K\u001aA\u0010H\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00020LH\u0087\u0002\u001aA\u0010H\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00020MH\u0087\u0002\u001a2\u0010N\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b2\u0006\u0010!\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010O\u001a:\u0010N\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b2\u000e\u0010J\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0010H\u0087\n¢\u0006\u0002\u0010P\u001a3\u0010N\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b2\f\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00020LH\u0087\n\u001a3\u0010N\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b2\f\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00020MH\u0087\n\u001a0\u0010Q\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0000\u001a3\u0010R\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001H\u0087\b\u001aT\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001a\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010H\u0086\u0002¢\u0006\u0002\u0010T\u001aG\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011H\u0086\u0002\u001aM\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110LH\u0086\u0002\u001aI\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0014\u0010V\u001a\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0086\u0002\u001aM\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110MH\u0086\u0002\u001aJ\u0010W\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u001a\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010H\u0087\n¢\u0006\u0002\u0010X\u001a=\u0010W\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011H\u0087\n\u001aC\u0010W\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110LH\u0087\n\u001a=\u0010W\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\n\u001aC\u0010W\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110MH\u0087\n\u001aG\u0010Y\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u001a\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010¢\u0006\u0002\u0010X\u001a@\u0010Y\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110L\u001a@\u0010Y\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110M\u001a;\u0010Z\u001a\u0004\u0018\u0001H\u0003\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b \"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b2\u0006\u0010!\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u00101\u001a:\u0010[\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b2\u0006\u0010!\u001a\u0002H\u00022\u0006\u0010%\u001a\u0002H\u0003H\u0087\n¢\u0006\u0002\u0010\\\u001a;\u0010]\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010¢\u0006\u0002\u0010\u0018\u001aQ\u0010]\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u00102\u0006\u0010,\u001a\u0002H+¢\u0006\u0002\u0010^\u001a4\u0010]\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110L\u001aO\u0010]\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110L2\u0006\u0010,\u001a\u0002H+¢\u0006\u0002\u0010_\u001a2\u0010]\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007\u001aM\u0010]\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010,\u001a\u0002H+H\u0007¢\u0006\u0002\u0010`\u001a4\u0010]\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110M\u001aO\u0010]\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110M2\u0006\u0010,\u001a\u0002H+¢\u0006\u0002\u0010a\u001a2\u0010b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007\u001a1\u0010c\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001bH\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006d"}, d2 = {"buildMap", "", "K", "V", "capacity", "", "builderAction", "Lkotlin/Function1;", "", "", "Lkotlin/ExtensionFunctionType;", "emptyMap", "hashMapOf", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Ljava/util/HashMap;", "linkedMapOf", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "([Lkotlin/Pair;)Ljava/util/LinkedHashMap;", "mapOf", "([Lkotlin/Pair;)Ljava/util/Map;", "mutableMapOf", "component1", "", "(Ljava/util/Map$Entry;)Ljava/lang/Object;", "component2", "contains", "", "Lkotlin/internal/OnlyInputTypes;", DatabaseFileArchive.COLUMN_KEY, "(Ljava/util/Map;Ljava/lang/Object;)Z", "containsKey", "containsValue", t0.b.f22420d, "filter", "predicate", "filterKeys", "filterNot", "filterNotTo", "M", "destination", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "filterTo", "filterValues", "get", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "getOrElse", "defaultValue", "Lkotlin/Function0;", "(Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrElseNullable", "getOrPut", "getValue", "ifEmpty", "R", "(Ljava/util/Map;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "isNullOrEmpty", "iterator", "", "", "", "mutableIterator", "mapKeys", "transform", "mapKeysTo", "mapValues", "mapValuesTo", "minus", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;", "keys", "(Ljava/util/Map;[Ljava/lang/Object;)Ljava/util/Map;", "", "Lkotlin/sequences/Sequence;", "minusAssign", "(Ljava/util/Map;Ljava/lang/Object;)V", "(Ljava/util/Map;[Ljava/lang/Object;)V", "optimizeReadOnlyMap", "orEmpty", "plus", "(Ljava/util/Map;[Lkotlin/Pair;)Ljava/util/Map;", "pair", "map", "plusAssign", "(Ljava/util/Map;[Lkotlin/Pair;)V", "putAll", "remove", "set", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)V", "toMap", "([Lkotlin/Pair;Ljava/util/Map;)Ljava/util/Map;", "(Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "(Lkotlin/sequences/Sequence;Ljava/util/Map;)Ljava/util/Map;", "toMutableMap", "toPair", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
@kotlin.jvm.internal.r1({"SMAP\nMaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,804:1\n403#1:814\n414#1:819\n511#1,6:824\n536#1,6:830\n1#2:805\n1238#3,4:806\n1238#3,4:810\n1238#3,4:815\n1238#3,4:820\n*S KotlinDebug\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n453#1:814\n468#1:819\n526#1:824,6\n551#1:830,6\n403#1:806,4\n414#1:810,4\n453#1:815,4\n468#1:820,4\n*E\n"})
/* loaded from: classes3.dex */
public class a1 extends z0 {
    @p4.l
    public static final <K, V> Map<K, V> A(@p4.l Map<? extends K, ? extends V> map, @p4.l v3.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @kotlin.internal.f
    private static final <K, V> void A0(Map<K, V> map, K k5, V v4) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        map.put(k5, v4);
    }

    @p4.l
    public static final <K, V> Map<K, V> B(@p4.l Map<? extends K, ? extends V> map, @p4.l v3.l<? super K, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry.getKey()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @p4.l
    public static <K, V> Map<K, V> B0(@p4.l Iterable<? extends kotlin.u0<? extends K, ? extends V>> iterable) {
        Map<K, V> z4;
        kotlin.u0<? extends K, ? extends V> next;
        Map<K, V> k5;
        int j5;
        kotlin.jvm.internal.l0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    j5 = z0.j(collection.size());
                    return C0(iterable, new LinkedHashMap(j5));
                }
                if (iterable instanceof List) {
                    next = (kotlin.u0<? extends K, ? extends V>) ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                k5 = z0.k(next);
                return k5;
            }
            z4 = z();
            return z4;
        }
        return k0(C0(iterable, new LinkedHashMap()));
    }

    @p4.l
    public static final <K, V> Map<K, V> C(@p4.l Map<? extends K, ? extends V> map, @p4.l v3.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!predicate.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @p4.l
    public static final <K, V, M extends Map<? super K, ? super V>> M C0(@p4.l Iterable<? extends kotlin.u0<? extends K, ? extends V>> iterable, @p4.l M destination) {
        kotlin.jvm.internal.l0.p(iterable, "<this>");
        kotlin.jvm.internal.l0.p(destination, "destination");
        w0(destination, iterable);
        return destination;
    }

    @p4.l
    public static final <K, V, M extends Map<? super K, ? super V>> M D(@p4.l Map<? extends K, ? extends V> map, @p4.l M destination, @p4.l v3.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(destination, "destination");
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!predicate.invoke(entry).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    @p4.l
    @kotlin.g1(version = "1.1")
    public static <K, V> Map<K, V> D0(@p4.l Map<? extends K, ? extends V> map) {
        Map<K, V> z4;
        Map<K, V> J0;
        kotlin.jvm.internal.l0.p(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                J0 = J0(map);
                return J0;
            }
            return z0.o(map);
        }
        z4 = z();
        return z4;
    }

    @p4.l
    public static final <K, V, M extends Map<? super K, ? super V>> M E(@p4.l Map<? extends K, ? extends V> map, @p4.l M destination, @p4.l v3.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(destination, "destination");
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    @p4.l
    @kotlin.g1(version = "1.1")
    public static final <K, V, M extends Map<? super K, ? super V>> M E0(@p4.l Map<? extends K, ? extends V> map, @p4.l M destination) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(destination, "destination");
        destination.putAll(map);
        return destination;
    }

    @p4.l
    public static final <K, V> Map<K, V> F(@p4.l Map<? extends K, ? extends V> map, @p4.l v3.l<? super V, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @p4.l
    public static final <K, V> Map<K, V> F0(@p4.l kotlin.sequences.m<? extends kotlin.u0<? extends K, ? extends V>> mVar) {
        kotlin.jvm.internal.l0.p(mVar, "<this>");
        return k0(G0(mVar, new LinkedHashMap()));
    }

    @kotlin.internal.f
    private static final <K, V> V G(Map<? extends K, ? extends V> map, K k5) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        return map.get(k5);
    }

    @p4.l
    public static final <K, V, M extends Map<? super K, ? super V>> M G0(@p4.l kotlin.sequences.m<? extends kotlin.u0<? extends K, ? extends V>> mVar, @p4.l M destination) {
        kotlin.jvm.internal.l0.p(mVar, "<this>");
        kotlin.jvm.internal.l0.p(destination, "destination");
        x0(destination, mVar);
        return destination;
    }

    @kotlin.internal.f
    private static final <K, V> V H(Map<K, ? extends V> map, K k5, v3.a<? extends V> defaultValue) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(defaultValue, "defaultValue");
        V v4 = map.get(k5);
        if (v4 == null) {
            return defaultValue.invoke();
        }
        return v4;
    }

    @p4.l
    public static <K, V> Map<K, V> H0(@p4.l kotlin.u0<? extends K, ? extends V>[] u0VarArr) {
        Map<K, V> z4;
        Map<K, V> k5;
        int j5;
        kotlin.jvm.internal.l0.p(u0VarArr, "<this>");
        int length = u0VarArr.length;
        if (length != 0) {
            if (length != 1) {
                j5 = z0.j(u0VarArr.length);
                return I0(u0VarArr, new LinkedHashMap(j5));
            }
            k5 = z0.k(u0VarArr[0]);
            return k5;
        }
        z4 = z();
        return z4;
    }

    public static final <K, V> V I(@p4.l Map<K, ? extends V> map, K k5, @p4.l v3.a<? extends V> defaultValue) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(defaultValue, "defaultValue");
        V v4 = map.get(k5);
        if (v4 == null && !map.containsKey(k5)) {
            return defaultValue.invoke();
        }
        return v4;
    }

    @p4.l
    public static final <K, V, M extends Map<? super K, ? super V>> M I0(@p4.l kotlin.u0<? extends K, ? extends V>[] u0VarArr, @p4.l M destination) {
        kotlin.jvm.internal.l0.p(u0VarArr, "<this>");
        kotlin.jvm.internal.l0.p(destination, "destination");
        y0(destination, u0VarArr);
        return destination;
    }

    public static final <K, V> V J(@p4.l Map<K, V> map, K k5, @p4.l v3.a<? extends V> defaultValue) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(defaultValue, "defaultValue");
        V v4 = map.get(k5);
        if (v4 == null) {
            V invoke = defaultValue.invoke();
            map.put(k5, invoke);
            return invoke;
        }
        return v4;
    }

    @p4.l
    @kotlin.g1(version = "1.1")
    public static <K, V> Map<K, V> J0(@p4.l Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        return new LinkedHashMap(map);
    }

    @kotlin.g1(version = "1.1")
    public static <K, V> V K(@p4.l Map<K, ? extends V> map, K k5) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        return (V) y0.a(map, k5);
    }

    @kotlin.internal.f
    private static final <K, V> kotlin.u0<K, V> K0(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.l0.p(entry, "<this>");
        return new kotlin.u0<>(entry.getKey(), entry.getValue());
    }

    @kotlin.g1(version = "1.1")
    @kotlin.internal.f
    private static final <K, V> HashMap<K, V> L() {
        return new HashMap<>();
    }

    @p4.l
    public static <K, V> HashMap<K, V> M(@p4.l kotlin.u0<? extends K, ? extends V>... pairs) {
        int j5;
        kotlin.jvm.internal.l0.p(pairs, "pairs");
        j5 = z0.j(pairs.length);
        HashMap<K, V> hashMap = new HashMap<>(j5);
        y0(hashMap, pairs);
        return hashMap;
    }

    /* JADX WARN: Incorrect types in method signature: <M::Ljava/util/Map<**>;:TR;R:Ljava/lang/Object;>(TM;Lv3/a<+TR;>;)TR; */
    @kotlin.g1(version = "1.3")
    @kotlin.internal.f
    private static final Object N(Map map, v3.a defaultValue) {
        kotlin.jvm.internal.l0.p(defaultValue, "defaultValue");
        if (map.isEmpty()) {
            return defaultValue.invoke();
        }
        return map;
    }

    @kotlin.internal.f
    private static final <K, V> boolean O(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        return !map.isEmpty();
    }

    @kotlin.g1(version = "1.3")
    @kotlin.internal.f
    private static final <K, V> boolean P(Map<? extends K, ? extends V> map) {
        return map == null || map.isEmpty();
    }

    @kotlin.internal.f
    private static final <K, V> Iterator<Map.Entry<K, V>> Q(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        return map.entrySet().iterator();
    }

    @kotlin.g1(version = "1.1")
    @kotlin.internal.f
    private static final <K, V> LinkedHashMap<K, V> R() {
        return new LinkedHashMap<>();
    }

    @p4.l
    public static final <K, V> LinkedHashMap<K, V> S(@p4.l kotlin.u0<? extends K, ? extends V>... pairs) {
        int j5;
        kotlin.jvm.internal.l0.p(pairs, "pairs");
        j5 = z0.j(pairs.length);
        return (LinkedHashMap) I0(pairs, new LinkedHashMap(j5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    public static final <K, V, R> Map<R, V> T(@p4.l Map<? extends K, ? extends V> map, @p4.l v3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        int j5;
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(transform, "transform");
        j5 = z0.j(map.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(j5);
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(transform.invoke(entry), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    public static final <K, V, R, M extends Map<? super R, ? super V>> M U(@p4.l Map<? extends K, ? extends V> map, @p4.l M destination, @p4.l v3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(destination, "destination");
        kotlin.jvm.internal.l0.p(transform, "transform");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            destination.put(transform.invoke(entry), entry.getValue());
        }
        return destination;
    }

    @kotlin.internal.f
    private static final <K, V> Map<K, V> V() {
        Map<K, V> z4;
        z4 = z();
        return z4;
    }

    @p4.l
    public static <K, V> Map<K, V> W(@p4.l kotlin.u0<? extends K, ? extends V>... pairs) {
        Map<K, V> z4;
        int j5;
        kotlin.jvm.internal.l0.p(pairs, "pairs");
        if (pairs.length > 0) {
            j5 = z0.j(pairs.length);
            return I0(pairs, new LinkedHashMap(j5));
        }
        z4 = z();
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    public static final <K, V, R> Map<K, R> X(@p4.l Map<? extends K, ? extends V> map, @p4.l v3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        int j5;
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(transform, "transform");
        j5 = z0.j(map.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(j5);
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(entry.getKey(), transform.invoke(entry));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    public static final <K, V, R, M extends Map<? super K, ? super R>> M Y(@p4.l Map<? extends K, ? extends V> map, @p4.l M destination, @p4.l v3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(destination, "destination");
        kotlin.jvm.internal.l0.p(transform, "transform");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            destination.put(entry.getKey(), transform.invoke(entry));
        }
        return destination;
    }

    @p4.l
    @kotlin.g1(version = "1.1")
    public static final <K, V> Map<K, V> Z(@p4.l Map<? extends K, ? extends V> map, @p4.l Iterable<? extends K> keys) {
        Map J0;
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(keys, "keys");
        J0 = J0(map);
        b0.E0(J0.keySet(), keys);
        return k0(J0);
    }

    @p4.l
    @kotlin.g1(version = "1.1")
    public static final <K, V> Map<K, V> a0(@p4.l Map<? extends K, ? extends V> map, K k5) {
        Map J0;
        kotlin.jvm.internal.l0.p(map, "<this>");
        J0 = J0(map);
        J0.remove(k5);
        return k0(J0);
    }

    @p4.l
    @kotlin.g1(version = "1.1")
    public static final <K, V> Map<K, V> b0(@p4.l Map<? extends K, ? extends V> map, @p4.l kotlin.sequences.m<? extends K> keys) {
        Map J0;
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(keys, "keys");
        J0 = J0(map);
        b0.G0(J0.keySet(), keys);
        return k0(J0);
    }

    @p4.l
    @kotlin.g1(version = "1.1")
    public static final <K, V> Map<K, V> c0(@p4.l Map<? extends K, ? extends V> map, @p4.l K[] keys) {
        Map J0;
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(keys, "keys");
        J0 = J0(map);
        b0.H0(J0.keySet(), keys);
        return k0(J0);
    }

    @kotlin.g1(version = "1.1")
    @kotlin.internal.f
    private static final <K, V> void d0(Map<K, V> map, Iterable<? extends K> keys) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(keys, "keys");
        b0.E0(map.keySet(), keys);
    }

    @kotlin.g1(version = "1.1")
    @kotlin.internal.f
    private static final <K, V> void e0(Map<K, V> map, K k5) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        map.remove(k5);
    }

    @kotlin.g1(version = "1.1")
    @kotlin.internal.f
    private static final <K, V> void f0(Map<K, V> map, kotlin.sequences.m<? extends K> keys) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(keys, "keys");
        b0.G0(map.keySet(), keys);
    }

    @kotlin.g1(version = "1.1")
    @kotlin.internal.f
    private static final <K, V> void g0(Map<K, V> map, K[] keys) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(keys, "keys");
        b0.H0(map.keySet(), keys);
    }

    @u3.h(name = "mutableIterator")
    @kotlin.internal.f
    private static final <K, V> Iterator<Map.Entry<K, V>> h0(Map<K, V> map) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        return map.entrySet().iterator();
    }

    @kotlin.g1(version = "1.1")
    @kotlin.internal.f
    private static final <K, V> Map<K, V> i0() {
        return new LinkedHashMap();
    }

    @p4.l
    public static <K, V> Map<K, V> j0(@p4.l kotlin.u0<? extends K, ? extends V>... pairs) {
        int j5;
        kotlin.jvm.internal.l0.p(pairs, "pairs");
        j5 = z0.j(pairs.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(j5);
        y0(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    public static final <K, V> Map<K, V> k0(@p4.l Map<K, ? extends V> map) {
        Map<K, V> z4;
        kotlin.jvm.internal.l0.p(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size == 1) {
                return z0.o(map);
            }
            return map;
        }
        z4 = z();
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <K, V> Map<K, V> l0(Map<K, ? extends V> map) {
        Map<K, V> z4;
        if (map != 0) {
            return map;
        }
        z4 = z();
        return z4;
    }

    @p4.l
    public static final <K, V> Map<K, V> m0(@p4.l Map<? extends K, ? extends V> map, @p4.l Iterable<? extends kotlin.u0<? extends K, ? extends V>> pairs) {
        Map<K, V> B0;
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(pairs, "pairs");
        if (map.isEmpty()) {
            B0 = B0(pairs);
            return B0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        w0(linkedHashMap, pairs);
        return linkedHashMap;
    }

    @p4.l
    public static <K, V> Map<K, V> n0(@p4.l Map<? extends K, ? extends V> map, @p4.l Map<? extends K, ? extends V> map2) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    @p4.l
    public static final <K, V> Map<K, V> o0(@p4.l Map<? extends K, ? extends V> map, @p4.l kotlin.u0<? extends K, ? extends V> pair) {
        Map<K, V> k5;
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(pair, "pair");
        if (map.isEmpty()) {
            k5 = z0.k(pair);
            return k5;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
        return linkedHashMap;
    }

    @p4.l
    public static final <K, V> Map<K, V> p0(@p4.l Map<? extends K, ? extends V> map, @p4.l kotlin.sequences.m<? extends kotlin.u0<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        x0(linkedHashMap, pairs);
        return k0(linkedHashMap);
    }

    @p4.l
    public static final <K, V> Map<K, V> q0(@p4.l Map<? extends K, ? extends V> map, @p4.l kotlin.u0<? extends K, ? extends V>[] pairs) {
        Map<K, V> H0;
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(pairs, "pairs");
        if (map.isEmpty()) {
            H0 = H0(pairs);
            return H0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        y0(linkedHashMap, pairs);
        return linkedHashMap;
    }

    @kotlin.internal.f
    private static final <K, V> void r0(Map<? super K, ? super V> map, Iterable<? extends kotlin.u0<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(pairs, "pairs");
        w0(map, pairs);
    }

    @kotlin.g1(version = "1.6")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final <K, V> Map<K, V> s(int i5, @kotlin.b v3.l<? super Map<K, V>, r2> builderAction) {
        Map h5;
        Map<K, V> d5;
        kotlin.jvm.internal.l0.p(builderAction, "builderAction");
        h5 = z0.h(i5);
        builderAction.invoke(h5);
        d5 = z0.d(h5);
        return d5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <K, V> void s0(Map<? super K, ? super V> map, Map<K, ? extends V> map2) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(map2, "map");
        map.putAll(map2);
    }

    @kotlin.g1(version = "1.6")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final <K, V> Map<K, V> t(@kotlin.b v3.l<? super Map<K, V>, r2> builderAction) {
        Map g5;
        Map<K, V> d5;
        kotlin.jvm.internal.l0.p(builderAction, "builderAction");
        g5 = z0.g();
        builderAction.invoke(g5);
        d5 = z0.d(g5);
        return d5;
    }

    @kotlin.internal.f
    private static final <K, V> void t0(Map<? super K, ? super V> map, kotlin.u0<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(pair, "pair");
        map.put(pair.getFirst(), pair.getSecond());
    }

    @kotlin.internal.f
    private static final <K, V> K u(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.l0.p(entry, "<this>");
        return entry.getKey();
    }

    @kotlin.internal.f
    private static final <K, V> void u0(Map<? super K, ? super V> map, kotlin.sequences.m<? extends kotlin.u0<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(pairs, "pairs");
        x0(map, pairs);
    }

    @kotlin.internal.f
    private static final <K, V> V v(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.l0.p(entry, "<this>");
        return entry.getValue();
    }

    @kotlin.internal.f
    private static final <K, V> void v0(Map<? super K, ? super V> map, kotlin.u0<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(pairs, "pairs");
        y0(map, pairs);
    }

    @kotlin.internal.f
    private static final <K, V> boolean w(Map<? extends K, ? extends V> map, K k5) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        return map.containsKey(k5);
    }

    public static <K, V> void w0(@p4.l Map<? super K, ? super V> map, @p4.l Iterable<? extends kotlin.u0<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(pairs, "pairs");
        for (kotlin.u0<? extends K, ? extends V> u0Var : pairs) {
            map.put(u0Var.component1(), u0Var.component2());
        }
    }

    @kotlin.internal.f
    private static final <K> boolean x(Map<? extends K, ?> map, K k5) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        return map.containsKey(k5);
    }

    public static <K, V> void x0(@p4.l Map<? super K, ? super V> map, @p4.l kotlin.sequences.m<? extends kotlin.u0<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(pairs, "pairs");
        for (kotlin.u0<? extends K, ? extends V> u0Var : pairs) {
            map.put(u0Var.component1(), u0Var.component2());
        }
    }

    @kotlin.internal.f
    private static final <K, V> boolean y(Map<K, ? extends V> map, V v4) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        return map.containsValue(v4);
    }

    public static <K, V> void y0(@p4.l Map<? super K, ? super V> map, @p4.l kotlin.u0<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(pairs, "pairs");
        for (kotlin.u0<? extends K, ? extends V> u0Var : pairs) {
            map.put(u0Var.component1(), u0Var.component2());
        }
    }

    @p4.l
    public static <K, V> Map<K, V> z() {
        i0 i0Var = i0.INSTANCE;
        kotlin.jvm.internal.l0.n(i0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return i0Var;
    }

    @kotlin.internal.f
    private static final <K, V> V z0(Map<? extends K, V> map, K k5) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        return (V) u1.k(map).remove(k5);
    }
}
