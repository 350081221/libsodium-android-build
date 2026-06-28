package androidx.compose.runtime;

import androidx.collection.MutableIntIntMap;
import androidx.compose.runtime.GroupKind;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.changelist.FixupList;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IntMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.a1;
import kotlin.collections.a0;
import kotlin.collections.o;
import kotlin.collections.w;
import kotlin.coroutines.g;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.q1;
import kotlin.r2;
import kotlin.u0;
import kotlin.y;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0080\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\f\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015*\u0002\u0097\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0004î\u0002ï\u0002BY\u0012\f\u0010Ý\u0001\u001a\u0007\u0012\u0002\b\u00030Ü\u0001\u0012\b\u0010á\u0001\u001a\u00030·\u0001\u0012\b\u0010ä\u0001\u001a\u00030ã\u0001\u0012\u000f\u0010è\u0001\u001a\n\u0012\u0005\u0012\u00030ç\u00010æ\u0001\u0012\b\u0010ë\u0001\u001a\u00030ê\u0001\u0012\b\u0010í\u0001\u001a\u00030ê\u0001\u0012\u0007\u0010î\u0001\u001a\u00020T¢\u0006\u0006\bì\u0002\u0010í\u0002J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000fH\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0002J\u001a\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0002J6\u0010\"\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010#H\u0002J\u0018\u0010(\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0019H\u0002J\u0010\u0010)\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010*\u001a\u00020\u0002H\u0002J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0002J\u0018\u0010.\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0002J(\u00102\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0002J\u0010\u00103\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\u0018\u00105\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006H\u0002J\b\u00106\u001a\u00020\u0002H\u0002J \u0010:\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006H\u0002J\u0018\u0010<\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0002J \u0010>\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0002J\u0014\u0010@\u001a\u00020\u0006*\u00020?2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\b\u0010A\u001a\u00020\u0002H\u0002J\b\u0010B\u001a\u00020\u0002H\u0002J2\u0010H\u001a\u00020\u00022\u000e\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0C2\u0006\u0010E\u001a\u00020\u000f2\b\u0010F\u001a\u0004\u0018\u00010\t2\u0006\u0010G\u001a\u00020\u0019H\u0002J$\u0010M\u001a\u00020\u00022\u001a\u0010L\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020K\u0012\u0006\u0012\u0004\u0018\u00010K0J0IH\u0002J,\u0010R\u001a\u00028\u0000\"\u0004\b\u0000\u0010N2\u0006\u0010O\u001a\u00020?2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000PH\u0082\b¢\u0006\u0004\bR\u0010SJk\u0010Z\u001a\u00028\u0000\"\u0004\b\u0000\u0010N2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010T2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010T2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00062\"\b\u0002\u0010Y\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020W\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010X0J0I2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000PH\u0002¢\u0006\u0004\bZ\u0010[J@\u0010_\u001a\u00020\u00022\u001a\u0010]\u001a\u0016\u0012\u0004\u0012\u00020W\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010X0\\2\u0013\u0010D\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010P¢\u0006\u0002\b^H\u0002¢\u0006\u0004\b_\u0010`J\u0016\u0010a\u001a\u0004\u0018\u00010\t*\u00020?2\u0006\u0010+\u001a\u00020\u0006H\u0002J\b\u0010b\u001a\u00020\u0002H\u0002J\b\u0010c\u001a\u00020\u0002H\u0002J\u0010\u0010f\u001a\u00020\u00022\u0006\u0010e\u001a\u00020dH\u0002J\b\u0010g\u001a\u00020\u0002H\u0002J\u0010\u0010i\u001a\u00020\u00022\u0006\u0010h\u001a\u00020\u0006H\u0002J\b\u0010j\u001a\u00020\u0002H\u0002J\b\u0010k\u001a\u00020\u0002H\u0002J\b\u0010l\u001a\u00020\u0002H\u0002J$\u0010n\u001a\u00020\u00022\u0006\u0010m\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010p\u001a\u00020\u00022\u0006\u0010o\u001a\u00020\u0006H\u0002J$\u0010q\u001a\u00020\u00022\u0006\u0010m\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010r\u001a\u00020\u00022\u0006\u0010m\u001a\u00020\u0006H\u0002J\u0010\u0010s\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J\b\u0010t\u001a\u00020\u0002H\u0017J\b\u0010u\u001a\u00020\u0002H\u0017J\b\u0010v\u001a\u00020\u0002H\u0017J\u001a\u0010w\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017J\b\u0010x\u001a\u00020\u0002H\u0017J\u000f\u0010{\u001a\u00020\u0002H\u0000¢\u0006\u0004\by\u0010zJ\b\u0010|\u001a\u00020\u0002H\u0016J\u000f\u0010~\u001a\u00020\u0002H\u0000¢\u0006\u0004\b}\u0010zJ\u0010\u0010\u0080\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u007f\u0010zJ\u0012\u0010\u0083\u0001\u001a\u00020\u0019H\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\t\u0010\u0084\u0001\u001a\u00020\u0002H\u0016J\t\u0010\u0085\u0001\u001a\u00020\u0002H\u0016J\u001f\u0010\u0088\u0001\u001a\u00020\u0002\"\u0005\b\u0000\u0010\u0086\u00012\r\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000PH\u0016J\t\u0010\u0089\u0001\u001a\u00020\u0002H\u0016J\t\u0010\u008a\u0001\u001a\u00020\u0002H\u0016J\u001b\u0010\u008b\u0001\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\t\u0010\u008c\u0001\u001a\u00020\u0002H\u0016J\t\u0010\u008d\u0001\u001a\u00020\u0002H\u0016J\t\u0010\u008e\u0001\u001a\u00020\u0002H\u0016J\u0007\u0010\u008f\u0001\u001a\u00020\u0002J\u0007\u0010\u0090\u0001\u001a\u00020\u0002J\u0012\u0010\u0092\u0001\u001a\u00020\u00022\u0007\u0010\u0091\u0001\u001a\u00020\u0006H\u0016JI\u0010\u0096\u0001\u001a\u00020\u0002\"\u0005\b\u0000\u0010\u0093\u0001\"\u0005\b\u0001\u0010\u0086\u00012\u0006\u0010\r\u001a\u00028\u00002\u001f\u0010Q\u001a\u001b\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0094\u0001¢\u0006\u0003\b\u0095\u0001H\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001f\u0010\u009a\u0001\u001a\u00020\t2\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u0099\u0001\u001a\u0004\u0018\u00010\tH\u0017J\u000b\u0010\u009b\u0001\u001a\u0004\u0018\u00010\tH\u0001J\u000b\u0010\u009c\u0001\u001a\u0004\u0018\u00010\tH\u0001J\u0013\u0010\u009d\u0001\u001a\u00020\u00192\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0017J\u0013\u0010\u009e\u0001\u001a\u00020\u00192\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0017J\u0012\u0010\u009d\u0001\u001a\u00020\u00192\u0007\u0010\r\u001a\u00030\u009f\u0001H\u0017J\u0012\u0010\u009d\u0001\u001a\u00020\u00192\u0007\u0010\r\u001a\u00030 \u0001H\u0017J\u0012\u0010\u009d\u0001\u001a\u00020\u00192\u0007\u0010\r\u001a\u00030¡\u0001H\u0017J\u0011\u0010\u009d\u0001\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u0019H\u0017J\u0012\u0010\u009d\u0001\u001a\u00020\u00192\u0007\u0010\r\u001a\u00030¢\u0001H\u0017J\u0012\u0010\u009d\u0001\u001a\u00020\u00192\u0007\u0010\r\u001a\u00030£\u0001H\u0017J\u0012\u0010\u009d\u0001\u001a\u00020\u00192\u0007\u0010\r\u001a\u00030¤\u0001H\u0017J\u0011\u0010\u009d\u0001\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u0006H\u0017J1\u0010¦\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u0086\u00012\u0007\u0010¥\u0001\u001a\u00020\u00192\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000PH\u0087\b¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0013\u0010¨\u0001\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0001J\u0013\u0010©\u0001\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0001J\u0018\u0010«\u0001\u001a\u00020\u00022\r\u0010ª\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020PH\u0016J\u0016\u0010\u00ad\u0001\u001a\u00020\u00022\u000b\u0010\r\u001a\u0007\u0012\u0002\b\u00030¬\u0001H\u0017J\t\u0010®\u0001\u001a\u00020\u0002H\u0017J)\u0010±\u0001\u001a\u00020\u00022\u0015\u0010°\u0001\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030¬\u00010¯\u0001H\u0017¢\u0006\u0006\b±\u0001\u0010²\u0001J\t\u0010³\u0001\u001a\u00020\u0002H\u0017J(\u0010µ\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u0086\u00012\r\u0010\u0007\u001a\t\u0012\u0004\u0012\u00028\u00000´\u0001H\u0017¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\n\u0010¸\u0001\u001a\u00030·\u0001H\u0016J&\u0010½\u0001\u001a\u00020\u00192\u0007\u0010¹\u0001\u001a\u00020W2\t\u0010º\u0001\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u0012\u0010À\u0001\u001a\u00020\u0006H\u0001¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\t\u0010Á\u0001\u001a\u00020\u0002H\u0017J\t\u0010Â\u0001\u001a\u00020\u0002H\u0017J\u0012\u0010Ã\u0001\u001a\u00020\u00022\u0007\u0010\u009d\u0001\u001a\u00020\u0019H\u0017J\u0011\u0010Ä\u0001\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J\f\u0010Æ\u0001\u001a\u0005\u0018\u00010Å\u0001H\u0017J\u001f\u0010Ç\u0001\u001a\u00020\u00022\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030C2\b\u0010F\u001a\u0004\u0018\u00010\tH\u0017J%\u0010È\u0001\u001a\u00020\u00022\u001a\u0010L\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020K\u0012\u0006\u0012\u0004\u0018\u00010K0J0IH\u0017J\u0013\u0010Ê\u0001\u001a\u00020\u00022\b\u0010Ê\u0001\u001a\u00030É\u0001H\u0017J\u001b\u0010Ë\u0001\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010Ê\u0001\u001a\u00030É\u0001H\u0017J\t\u0010Ì\u0001\u001a\u00020\u0002H\u0017J\t\u0010Í\u0001\u001a\u00020\u0002H\u0016J@\u0010Ï\u0001\u001a\u00020\u00022\u001a\u0010]\u001a\u0016\u0012\u0004\u0012\u00020W\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010X0\\2\u0011\u0010D\u001a\r\u0012\u0004\u0012\u00020\u00020P¢\u0006\u0002\b^H\u0000¢\u0006\u0005\bÎ\u0001\u0010`J \u0010Ò\u0001\u001a\u00020\u00022\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00020PH\u0000¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J.\u0010Õ\u0001\u001a\u00020\u00192\u001a\u0010]\u001a\u0016\u0012\u0004\u0012\u00020W\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010X0\\H\u0000¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J\u0011\u0010×\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0005\bÖ\u0001\u0010zJ\u000b\u0010Ø\u0001\u001a\u0004\u0018\u00010\tH\u0016J\u0013\u0010Ù\u0001\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016J\u0013\u0010Û\u0001\u001a\u00020\u00022\b\u0010¹\u0001\u001a\u00030Ú\u0001H\u0016R$\u0010Ý\u0001\u001a\u0007\u0012\u0002\b\u00030Ü\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÝ\u0001\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001R\u0018\u0010á\u0001\u001a\u00030·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R\u0018\u0010ä\u0001\u001a\u00030ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u001f\u0010è\u0001\u001a\n\u0012\u0005\u0012\u00030ç\u00010æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bè\u0001\u0010é\u0001R\u001a\u0010ë\u0001\u001a\u00030ê\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u001a\u0010í\u0001\u001a\u00030ê\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bí\u0001\u0010ì\u0001R\u001f\u0010î\u0001\u001a\u00020T8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bî\u0001\u0010ï\u0001\u001a\u0006\bð\u0001\u0010ñ\u0001R \u0010ó\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010#0ò\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bó\u0001\u0010ô\u0001R\u001b\u0010õ\u0001\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0001\u0010ö\u0001R\u0019\u0010÷\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b÷\u0001\u0010ø\u0001R\u001a\u0010ú\u0001\u001a\u00030ù\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R\u0019\u0010ü\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bü\u0001\u0010ø\u0001R\u001a\u0010ý\u0001\u001a\u00030ù\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bý\u0001\u0010û\u0001R\u001c\u0010ÿ\u0001\u001a\u0005\u0018\u00010þ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÿ\u0001\u0010\u0080\u0002R\u001c\u0010\u0082\u0002\u001a\u0005\u0018\u00010\u0081\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R\u0019\u0010\u0083\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0002R\u0019\u0010\u0085\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0002\u0010\u0084\u0002R\u0019\u0010\u0086\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0084\u0002R\u001d\u0010Y\u001a\n\u0012\u0005\u0012\u00030\u0088\u00020\u0087\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bY\u0010\u0089\u0002R\u0018\u0010\u008a\u0002\u001a\u00030ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0002\u0010û\u0001R\u0019\u0010\u008b\u0002\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u008c\u0002R\"\u0010\u008e\u0002\u001a\u000b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u008d\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u008f\u0002R\u0019\u0010\u0090\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u0084\u0002R\u0018\u0010\u0091\u0002\u001a\u00030ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0002\u0010û\u0001R\u0019\u0010\u0092\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0002\u0010\u0084\u0002R\u0019\u0010\u0093\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0002\u0010ø\u0001R\u0019\u0010\u0094\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0002\u0010ø\u0001R\u0019\u0010\u0095\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0002\u0010ø\u0001R\u0019\u0010\u0096\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0002\u0010\u0084\u0002R\u0018\u0010\u0098\u0002\u001a\u00030\u0097\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0002\u0010\u0099\u0002R\u001e\u0010\u009a\u0002\u001a\t\u0012\u0004\u0012\u00020W0ò\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0002\u0010ô\u0001R*\u0010\u009c\u0002\u001a\u00020\u00192\u0007\u0010\u009b\u0002\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u009c\u0002\u0010\u0084\u0002\u001a\u0006\b\u009d\u0002\u0010\u0082\u0001R*\u0010\u009e\u0002\u001a\u00020\u00192\u0007\u0010\u009b\u0002\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u009e\u0002\u0010\u0084\u0002\u001a\u0006\b\u009f\u0002\u0010\u0082\u0001R'\u0010O\u001a\u00020?8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bO\u0010 \u0002\u001a\u0006\b¡\u0002\u0010¢\u0002\"\u0006\b£\u0002\u0010¤\u0002R*\u0010¥\u0002\u001a\u00030ã\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¥\u0002\u0010å\u0001\u001a\u0006\b¦\u0002\u0010§\u0002\"\u0006\b¨\u0002\u0010©\u0002R\u001a\u0010«\u0002\u001a\u00030ª\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0002\u0010¬\u0002R\u0019\u0010\u00ad\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0002\u0010\u0084\u0002R\u001b\u0010®\u0002\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0002\u0010\u008c\u0002R,\u0010¯\u0002\u001a\u0005\u0018\u00010ê\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¯\u0002\u0010ì\u0001\u001a\u0006\b°\u0002\u0010±\u0002\"\u0006\b²\u0002\u0010³\u0002R\u0018\u0010µ\u0002\u001a\u00030´\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0002\u0010¶\u0002R\u0019\u0010·\u0002\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0002\u0010¸\u0002R\u001a\u0010º\u0002\u001a\u00030¹\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0002\u0010»\u0002R/\u0010'\u001a\u00020\u00192\u0007\u0010\u009b\u0002\u001a\u00020\u00198\u0016@RX\u0097\u000e¢\u0006\u0016\n\u0005\b'\u0010\u0084\u0002\u0012\u0005\b½\u0002\u0010z\u001a\u0006\b¼\u0002\u0010\u0082\u0001R1\u0010¾\u0002\u001a\u00020\u00062\u0007\u0010\u009b\u0002\u001a\u00020\u00068\u0016@RX\u0097\u000e¢\u0006\u0017\n\u0006\b¾\u0002\u0010ø\u0001\u0012\u0005\bÀ\u0002\u0010z\u001a\u0006\b¿\u0002\u0010¿\u0001R\u0019\u0010Á\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0002\u0010\u0084\u0002R\u0019\u0010Â\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0002\u0010\u0084\u0002R\u0018\u0010Ã\u0002\u001a\u00030ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0002\u0010û\u0001R\u001d\u0010Æ\u0002\u001a\u0004\u0018\u00010\t*\u00020?8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÄ\u0002\u0010Å\u0002R\u0017\u0010È\u0002\u001a\u00020\u00198@X\u0080\u0004¢\u0006\b\u001a\u0006\bÇ\u0002\u0010\u0082\u0001R\u0017\u0010Ê\u0002\u001a\u00020\u00198@X\u0080\u0004¢\u0006\b\u001a\u0006\bÉ\u0002\u0010\u0082\u0001R\u0018\u0010Î\u0002\u001a\u00030Ë\u00028WX\u0096\u0004¢\u0006\b\u001a\u0006\bÌ\u0002\u0010Í\u0002R\u001e\u0010Ñ\u0002\u001a\u00020\u00198VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÐ\u0002\u0010z\u001a\u0006\bÏ\u0002\u0010\u0082\u0001R\u001e\u0010Ô\u0002\u001a\u00020\u00198VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÓ\u0002\u0010z\u001a\u0006\bÒ\u0002\u0010\u0082\u0001R\u0017\u0010Ö\u0002\u001a\u00020\u00068VX\u0096\u0004¢\u0006\b\u001a\u0006\bÕ\u0002\u0010¿\u0001R\u0018\u0010Ú\u0002\u001a\u00030×\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bØ\u0002\u0010Ù\u0002R\u0018\u0010Þ\u0002\u001a\u00030Û\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bÜ\u0002\u0010Ý\u0002R\u0017\u0010à\u0002\u001a\u00020\u00068@X\u0080\u0004¢\u0006\b\u001a\u0006\bß\u0002\u0010¿\u0001R\u0019\u0010ã\u0002\u001a\u0004\u0018\u00010W8@X\u0080\u0004¢\u0006\b\u001a\u0006\bá\u0002\u0010â\u0002R\u0014\u0010å\u0002\u001a\u00020\u00198F¢\u0006\b\u001a\u0006\bä\u0002\u0010\u0082\u0001R\u001a\u0010è\u0002\u001a\u0005\u0018\u00010Ú\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bæ\u0002\u0010ç\u0002R\u0019\u0010ë\u0002\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\b\u001a\u0006\bé\u0002\u0010ê\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006ð\u0002"}, d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "Lkotlin/r2;", "startRoot", "endRoot", "abortRoot", "", DatabaseFileArchive.COLUMN_KEY, "startGroup", "", "dataKey", "endGroup", "skipGroup", b.f22420d, "updateSlot", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "currentCompositionLocalScope", "group", "parentScope", "currentProviders", "updateProviderMapGroup", "providers", "recordProviderUpdate", "ensureWriter", "createFreshInsertTable", "", "isNode", "data", "startReaderGroup", "objectKey", "Landroidx/compose/runtime/GroupKind;", "kind", "start-BaiHCIY", "(ILjava/lang/Object;ILjava/lang/Object;)V", "start", "Landroidx/compose/runtime/Pending;", "newPending", "enterGroup", "expectedNodeCount", "inserting", "exitGroup", "end", "recomposeToGroupEnd", "index", "insertedGroupVirtualIndex", "newCount", "updateNodeCountOverrides", "groupLocation", "recomposeGroup", "recomposeIndex", "nodeIndexOf", "updatedNodeCount", "count", "updateNodeCount", "clearUpdatedNodeCounts", "oldGroup", "newGroup", "commonRoot", "recordUpsAndDowns", "nearestCommonRoot", "doRecordDownsFor", "recomposeKey", "compoundKeyOf", "Landroidx/compose/runtime/SlotReader;", "groupCompoundKeyPart", "skipReaderToGroupEnd", "addRecomposeScope", "Landroidx/compose/runtime/MovableContent;", "content", "locals", "parameter", TTDownloadField.TT_FORCE, "invokeMovableContentLambda", "", "Lkotlin/u0;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContentGuarded", "R", "reader", "Lkotlin/Function0;", "block", "withReader", "(Landroidx/compose/runtime/SlotReader;Lv3/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/ControlledComposition;", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "invalidations", "recomposeMovableContent", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ControlledComposition;Ljava/lang/Integer;Ljava/util/List;Lv3/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "invalidationsRequested", "Landroidx/compose/runtime/Composable;", "doCompose", "(Landroidx/compose/runtime/collection/IdentityArrayMap;Lv3/p;)V", "nodeAt", "validateNodeExpected", "validateNodeNotExpected", "Landroidx/compose/runtime/Anchor;", "anchor", "recordInsert", "recordDelete", "groupBeingRemoved", "reportFreeMovableContent", "reportAllMovableContent", "finalizeCompose", "cleanUpCompose", "groupKey", "updateCompoundKeyWhenWeEnterGroup", "keyHash", "updateCompoundKeyWhenWeEnterGroupKeyHash", "updateCompoundKeyWhenWeExitGroup", "updateCompoundKeyWhenWeExitGroupKeyHash", "startReplaceableGroup", "endReplaceableGroup", "startDefaults", "endDefaults", "startMovableGroup", "endMovableGroup", "changesApplied$runtime_release", "()V", "changesApplied", "collectParameterInformation", "dispose$runtime_release", "dispose", "deactivate$runtime_release", "deactivate", "forceRecomposeScopes$runtime_release", "()Z", "forceRecomposeScopes", "startNode", "startReusableNode", "T", "factory", "createNode", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "disableReusing", "enableReusing", "startReuseFromRoot", "endReuseFromRoot", "marker", "endToMarker", "V", "Lkotlin/Function2;", "Lkotlin/u;", "apply", "(Ljava/lang/Object;Lv3/p;)V", "left", "right", "joinKey", "nextSlot", "nextSlotForCache", "changed", "changedInstance", "", "", "", "", "", "", "invalid", "cache", "(ZLv3/a;)Ljava/lang/Object;", "updateValue", "updateCachedValue", "effect", "recordSideEffect", "Landroidx/compose/runtime/ProvidedValue;", "startProvider", "endProvider", "", "values", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "Landroidx/compose/runtime/CompositionLocal;", "consume", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "Landroidx/compose/runtime/CompositionContext;", "buildContext", "scope", "instance", "tryImminentInvalidation$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "tryImminentInvalidation", "parentKey$runtime_release", "()I", "parentKey", "skipCurrentGroup", "skipToGroupEnd", "deactivateToEndGroup", "startRestartGroup", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "insertMovableContent", "insertMovableContentReferences", "", "sourceInformation", "sourceInformationMarkerStart", "sourceInformationMarkerEnd", "disableSourceInformation", "composeContent$runtime_release", "composeContent", "prepareCompose$runtime_release", "(Lv3/a;)V", "prepareCompose", "recompose$runtime_release", "(Landroidx/compose/runtime/collection/IdentityArrayMap;)Z", "recompose", "verifyConsistent$runtime_release", "verifyConsistent", "rememberedValue", "updateRememberedValue", "Landroidx/compose/runtime/RecomposeScope;", "recordUsed", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/SlotTable;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "", "Landroidx/compose/runtime/RememberObserver;", "abandonSet", "Ljava/util/Set;", "Landroidx/compose/runtime/changelist/ChangeList;", "changes", "Landroidx/compose/runtime/changelist/ChangeList;", "lateChanges", "composition", "Landroidx/compose/runtime/ControlledComposition;", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/Stack;", "pendingStack", "Landroidx/compose/runtime/Stack;", "pending", "Landroidx/compose/runtime/Pending;", "nodeIndex", "I", "Landroidx/compose/runtime/IntStack;", "nodeIndexStack", "Landroidx/compose/runtime/IntStack;", "groupNodeCount", "groupNodeCountStack", "", "nodeCountOverrides", "[I", "Landroidx/collection/MutableIntIntMap;", "nodeCountVirtualOverrides", "Landroidx/collection/MutableIntIntMap;", "Z", "forciblyRecompose", "nodeExpected", "", "Landroidx/compose/runtime/Invalidation;", "Ljava/util/List;", "entersStack", "parentProvider", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "Landroidx/compose/runtime/collection/IntMap;", "providerUpdates", "Landroidx/compose/runtime/collection/IntMap;", "providersInvalid", "providersInvalidStack", "reusing", "reusingGroup", "childrenComposing", "compositionToken", "sourceInformationEnabled", "androidx/compose/runtime/ComposerImpl$derivedStateObserver$1", "derivedStateObserver", "Landroidx/compose/runtime/ComposerImpl$derivedStateObserver$1;", "invalidateStack", "<set-?>", "isComposing", "isComposing$runtime_release", "isDisposed", "isDisposed$runtime_release", "Landroidx/compose/runtime/SlotReader;", "getReader$runtime_release", "()Landroidx/compose/runtime/SlotReader;", "setReader$runtime_release", "(Landroidx/compose/runtime/SlotReader;)V", "insertTable", "getInsertTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "setInsertTable$runtime_release", "(Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/SlotWriter;", "writer", "Landroidx/compose/runtime/SlotWriter;", "writerHasAProvider", "providerCache", "deferredChanges", "getDeferredChanges$runtime_release", "()Landroidx/compose/runtime/changelist/ChangeList;", "setDeferredChanges$runtime_release", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "changeListWriter", "Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "insertAnchor", "Landroidx/compose/runtime/Anchor;", "Landroidx/compose/runtime/changelist/FixupList;", "insertFixups", "Landroidx/compose/runtime/changelist/FixupList;", "getInserting", "getInserting$annotations", "compoundKeyHash", "getCompoundKeyHash", "getCompoundKeyHash$annotations", "startedGroup", "implicitRootStart", "startedGroups", "getNode", "(Landroidx/compose/runtime/SlotReader;)Ljava/lang/Object;", "node", "getAreChildrenComposing$runtime_release", "areChildrenComposing", "getHasPendingChanges$runtime_release", "hasPendingChanges", "Lkotlin/coroutines/g;", "getApplyCoroutineContext", "()Lkotlin/coroutines/g;", "applyCoroutineContext", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "getSkipping", "getSkipping$annotations", "skipping", "getCurrentMarker", "currentMarker", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "Landroidx/compose/runtime/CompositionLocalMap;", "getCurrentCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "currentCompositionLocalMap", "getChangeCount$runtime_release", "changeCount", "getCurrentRecomposeScope$runtime_release", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "currentRecomposeScope", "getHasInvalidations", "hasInvalidations", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScope", "getRecomposeScopeIdentity", "()Ljava/lang/Object;", "recomposeScopeIdentity", "<init>", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/ControlledComposition;)V", "CompositionContextHolder", "CompositionContextImpl", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 4 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n+ 7 Composer.kt\nandroidx/compose/runtime/GroupKind\n+ 8 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n+ 9 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 10 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 11 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 12 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n+ 13 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 14 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 15 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4197:1\n3157#1,8:4256\n3166#1,3:4279\n1#2:4198\n150#3,8:4199\n150#3,8:4244\n150#3,4:4252\n155#3,3:4282\n150#3,4:4348\n155#3,3:4360\n46#4,5:4207\n46#4,3:4321\n50#4:4327\n4178#5,5:4212\n4178#5,5:4217\n4178#5,5:4226\n4178#5,5:4231\n4178#5,5:4301\n4178#5,5:4306\n4178#5,5:4311\n4178#5,5:4316\n4178#5,5:4338\n4178#5,5:4343\n4178#5,5:4363\n75#6:4222\n4100#7:4223\n4101#7:4224\n26#8:4225\n26#8:4368\n22#8:4369\n180#9,4:4236\n180#9,4:4264\n190#9,8:4268\n185#9,3:4276\n185#9,3:4286\n180#9,8:4352\n33#10,4:4240\n38#10:4285\n33#10,4:4289\n38#10:4300\n82#10,3:4370\n33#10,4:4373\n85#10,2:4377\n38#10:4379\n87#10:4380\n108#11,7:4293\n153#12,3:4324\n157#12:4328\n388#13,6:4329\n394#13,2:4336\n48#14:4335\n1855#15,2:4381\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n3120#1:4256,8\n3120#1:4279,3\n1313#1:4199,8\n3061#1:4244,8\n3119#1:4252,4\n3119#1:4282,3\n3497#1:4348,4\n3497#1:4360,3\n1565#1:4207,5\n3276#1:4321,3\n3276#1:4327\n1638#1:4212,5\n1651#1:4217,5\n2843#1:4226,5\n2856#1:4231,5\n3234#1:4301,5\n3239#1:4306,5\n3255#1:4311,5\n3275#1:4316,5\n3335#1:4338,5\n3342#1:4343,5\n3509#1:4363,5\n2020#1:4222\n2214#1:4223\n2238#1:4224\n2766#1:4225\n3689#1:4368\n3705#1:4369\n3038#1:4236,4\n3125#1:4264,4\n3126#1:4268,8\n3125#1:4276,3\n3038#1:4286,3\n3499#1:4352,8\n3040#1:4240,4\n3040#1:4285\n3184#1:4289,4\n3184#1:4300\n3408#1:4370,3\n3408#1:4373,4\n3408#1:4377,2\n3408#1:4379\n3408#1:4380\n3186#1:4293,7\n3279#1:4324,3\n3279#1:4328\n3299#1:4329,6\n3299#1:4336,2\n3299#1:4335\n3440#1:4381,2\n*E\n"})
/* loaded from: classes.dex */
public final class ComposerImpl implements Composer {
    public static final int $stable = 8;

    @l
    private final Set<RememberObserver> abandonSet;

    @l
    private final Applier<?> applier;

    @l
    private final ComposerChangeListWriter changeListWriter;

    @l
    private ChangeList changes;
    private int childrenComposing;

    @l
    private final ControlledComposition composition;
    private int compositionToken;
    private int compoundKeyHash;

    @m
    private ChangeList deferredChanges;
    private boolean forceRecomposeScopes;
    private boolean forciblyRecompose;
    private int groupNodeCount;
    private boolean implicitRootStart;

    @l
    private Anchor insertAnchor;

    @l
    private FixupList insertFixups;

    @l
    private SlotTable insertTable;
    private boolean inserting;
    private boolean isComposing;
    private boolean isDisposed;

    @l
    private ChangeList lateChanges;

    @m
    private int[] nodeCountOverrides;

    @m
    private MutableIntIntMap nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;

    @l
    private final CompositionContext parentContext;

    @m
    private Pending pending;

    @m
    private PersistentCompositionLocalMap providerCache;

    @m
    private IntMap<PersistentCompositionLocalMap> providerUpdates;
    private boolean providersInvalid;

    @l
    private SlotReader reader;
    private boolean reusing;

    @l
    private final SlotTable slotTable;
    private boolean sourceInformationEnabled;
    private boolean startedGroup;

    @l
    private final IntStack startedGroups;

    @l
    private SlotWriter writer;
    private boolean writerHasAProvider;

    @l
    private final Stack<Pending> pendingStack = new Stack<>();

    @l
    private IntStack nodeIndexStack = new IntStack();

    @l
    private IntStack groupNodeCountStack = new IntStack();

    @l
    private final List<Invalidation> invalidations = new ArrayList();

    @l
    private final IntStack entersStack = new IntStack();

    @l
    private PersistentCompositionLocalMap parentProvider = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();

    @l
    private final IntStack providersInvalidStack = new IntStack();
    private int reusingGroup = -1;

    @l
    private final ComposerImpl$derivedStateObserver$1 derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.ComposerImpl$derivedStateObserver$1
        @Override // androidx.compose.runtime.DerivedStateObserver
        public void done(@l DerivedState<?> derivedState) {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.childrenComposing--;
        }

        @Override // androidx.compose.runtime.DerivedStateObserver
        public void start(@l DerivedState<?> derivedState) {
            ComposerImpl.this.childrenComposing++;
        }
    };

    @l
    private final Stack<RecomposeScopeImpl> invalidateStack = new Stack<>();

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u00060\u0006R\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u001b\u0010\b\u001a\u00060\u0006R\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextHolder;", "Landroidx/compose/runtime/ReusableRememberObserver;", "Lkotlin/r2;", "onRemembered", "onAbandoned", "onForgotten", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/ComposerImpl;", "ref", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "getRef", "()Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "<init>", "(Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class CompositionContextHolder implements ReusableRememberObserver {

        @l
        private final CompositionContextImpl ref;

        public CompositionContextHolder(@l CompositionContextImpl compositionContextImpl) {
            this.ref = compositionContextImpl;
        }

        @l
        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010J\u001a\u00020E\u0012\b\u0010M\u001a\u0004\u0018\u00010L¢\u0006\u0004\bf\u0010gJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0010\u0010\u000eJ*\u0010\u0017\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\u0002\b\u0013H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0018\u0010\u000eJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\"\u001a\u00020\u001fH\u0010¢\u0006\u0004\b \u0010!J\u000e\u0010#\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001fJ\u001d\u0010)\u001a\u00020\u00022\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0010¢\u0006\u0004\b'\u0010(J\u000f\u0010,\u001a\u00020\u0002H\u0010¢\u0006\u0004\b*\u0010+J\u000f\u0010.\u001a\u00020\u0002H\u0010¢\u0006\u0004\b-\u0010+J\u0017\u00103\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0010¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0010¢\u0006\u0004\b4\u00102J\u0019\u00109\u001a\u0004\u0018\u0001062\u0006\u00100\u001a\u00020/H\u0010¢\u0006\u0004\b7\u00108J\u001f\u0010=\u001a\u00020\u00022\u0006\u00100\u001a\u00020/2\u0006\u0010:\u001a\u000206H\u0010¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b>\u0010\u000eR\u001a\u0010A\u001a\u00020@8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010F\u001a\u00020E8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020E8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bK\u0010IR\u001c\u0010M\u001a\u0004\u0018\u00010L8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR0\u0010Q\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010(R\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020V0$8\u0006¢\u0006\f\n\u0004\bW\u0010R\u001a\u0004\bX\u0010TR+\u0010^\u001a\u00020\u001f2\u0006\u0010Y\u001a\u00020\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\"\u0010!\"\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u001a\u0010e\u001a\u00020_8PX\u0090\u0004¢\u0006\f\u0012\u0004\bd\u0010+\u001a\u0004\bc\u0010a¨\u0006h"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/CompositionContext;", "Lkotlin/r2;", "dispose", "Landroidx/compose/runtime/Composer;", "composer", "registerComposer$runtime_release", "(Landroidx/compose/runtime/Composer;)V", "registerComposer", "unregisterComposer$runtime_release", "unregisterComposer", "Landroidx/compose/runtime/ControlledComposition;", "composition", "registerComposition$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;)V", "registerComposition", "unregisterComposition$runtime_release", "unregisterComposition", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lv3/p;)V", "composeInitial", "invalidate$runtime_release", "invalidate", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "invalidateScope$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "invalidateScope", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope$runtime_release", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope", "updateCompositionLocalScope", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "recordInspectionTable$runtime_release", "(Ljava/util/Set;)V", "recordInspectionTable", "startComposing$runtime_release", "()V", "startComposing", "doneComposing$runtime_release", "doneComposing", "Landroidx/compose/runtime/MovableContentStateReference;", "reference", "insertMovableContent$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "deletedMovableContent$runtime_release", "deletedMovableContent", "Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "data", "movableContentStateReleased$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;)V", "movableContentStateReleased", "reportRemovedComposition$runtime_release", "reportRemovedComposition", "", "compoundHashKey", "I", "getCompoundHashKey$runtime_release", "()I", "", "collectingParameterInformation", "Z", "getCollectingParameterInformation$runtime_release", "()Z", "collectingSourceInformation", "getCollectingSourceInformation$runtime_release", "Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime_release", "()Landroidx/compose/runtime/CompositionObserverHolder;", "inspectionTables", "Ljava/util/Set;", "getInspectionTables", "()Ljava/util/Set;", "setInspectionTables", "Landroidx/compose/runtime/ComposerImpl;", "composers", "getComposers", "<set-?>", "compositionLocalScope$delegate", "Landroidx/compose/runtime/MutableState;", "setCompositionLocalScope", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "compositionLocalScope", "Lkotlin/coroutines/g;", "getEffectCoroutineContext", "()Lkotlin/coroutines/g;", "effectCoroutineContext", "getRecomposeCoroutineContext$runtime_release", "getRecomposeCoroutineContext$runtime_release$annotations", "recomposeCoroutineContext", "<init>", "(Landroidx/compose/runtime/ComposerImpl;IZZLandroidx/compose/runtime/CompositionObserverHolder;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,4197:1\n1855#2,2:4198\n81#3:4200\n107#3,2:4201\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n*L\n3574#1:4198,2\n3624#1:4200\n3624#1:4201,2\n*E\n"})
    /* loaded from: classes.dex */
    public final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;
        private final boolean collectingSourceInformation;

        @l
        private final Set<ComposerImpl> composers = new LinkedHashSet();

        @l
        private final MutableState compositionLocalScope$delegate = SnapshotStateKt.mutableStateOf(PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf(), SnapshotStateKt.referentialEqualityPolicy());
        private final int compoundHashKey;

        @m
        private Set<Set<CompositionData>> inspectionTables;

        @m
        private final CompositionObserverHolder observerHolder;

        public CompositionContextImpl(int i5, boolean z4, boolean z5, @m CompositionObserverHolder compositionObserverHolder) {
            this.compoundHashKey = i5;
            this.collectingParameterInformation = z4;
            this.collectingSourceInformation = z5;
            this.observerHolder = compositionObserverHolder;
        }

        private final PersistentCompositionLocalMap getCompositionLocalScope() {
            return (PersistentCompositionLocalMap) this.compositionLocalScope$delegate.getValue();
        }

        public static /* synthetic */ void getRecomposeCoroutineContext$runtime_release$annotations() {
        }

        private final void setCompositionLocalScope(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            this.compositionLocalScope$delegate.setValue(persistentCompositionLocalMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        @ComposableInferredTarget(scheme = "[0[0]]")
        public void composeInitial$runtime_release(@l ControlledComposition controlledComposition, @l p<? super Composer, ? super Integer, r2> pVar) {
            ComposerImpl.this.parentContext.composeInitial$runtime_release(controlledComposition, pVar);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void deletedMovableContent$runtime_release(@l MovableContentStateReference movableContentStateReference) {
            ComposerImpl.this.parentContext.deletedMovableContent$runtime_release(movableContentStateReference);
        }

        public final void dispose() {
            if (!this.composers.isEmpty()) {
                Set<Set<CompositionData>> set = this.inspectionTables;
                if (set != null) {
                    for (ComposerImpl composerImpl : this.composers) {
                        Iterator<Set<CompositionData>> it = set.iterator();
                        while (it.hasNext()) {
                            it.next().remove(composerImpl.slotTable);
                        }
                    }
                }
                this.composers.clear();
            }
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime_release() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingParameterInformation$runtime_release() {
            return this.collectingParameterInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingSourceInformation$runtime_release() {
            return this.collectingSourceInformation;
        }

        @l
        public final Set<ComposerImpl> getComposers() {
            return this.composers;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @l
        public PersistentCompositionLocalMap getCompositionLocalScope$runtime_release() {
            return getCompositionLocalScope();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public int getCompoundHashKey$runtime_release() {
            return this.compoundHashKey;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @l
        public g getEffectCoroutineContext() {
            return ComposerImpl.this.parentContext.getEffectCoroutineContext();
        }

        @m
        public final Set<Set<CompositionData>> getInspectionTables() {
            return this.inspectionTables;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @m
        public CompositionObserverHolder getObserverHolder$runtime_release() {
            return this.observerHolder;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @l
        public g getRecomposeCoroutineContext$runtime_release() {
            return CompositionKt.getRecomposeCoroutineContext(ComposerImpl.this.getComposition());
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void insertMovableContent$runtime_release(@l MovableContentStateReference movableContentStateReference) {
            ComposerImpl.this.parentContext.insertMovableContent$runtime_release(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime_release(@l ControlledComposition controlledComposition) {
            ComposerImpl.this.parentContext.invalidate$runtime_release(ComposerImpl.this.getComposition());
            ComposerImpl.this.parentContext.invalidate$runtime_release(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidateScope$runtime_release(@l RecomposeScopeImpl recomposeScopeImpl) {
            ComposerImpl.this.parentContext.invalidateScope$runtime_release(recomposeScopeImpl);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void movableContentStateReleased$runtime_release(@l MovableContentStateReference movableContentStateReference, @l MovableContentState movableContentState) {
            ComposerImpl.this.parentContext.movableContentStateReleased$runtime_release(movableContentStateReference, movableContentState);
        }

        @Override // androidx.compose.runtime.CompositionContext
        @m
        public MovableContentState movableContentStateResolve$runtime_release(@l MovableContentStateReference movableContentStateReference) {
            return ComposerImpl.this.parentContext.movableContentStateResolve$runtime_release(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void recordInspectionTable$runtime_release(@l Set<CompositionData> set) {
            Set set2 = this.inspectionTables;
            if (set2 == null) {
                set2 = new HashSet();
                this.inspectionTables = set2;
            }
            set2.add(set);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposer$runtime_release(@l Composer composer) {
            l0.n(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.registerComposer$runtime_release((ComposerImpl) composer);
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposition$runtime_release(@l ControlledComposition controlledComposition) {
            ComposerImpl.this.parentContext.registerComposition$runtime_release(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportRemovedComposition$runtime_release(@l ControlledComposition controlledComposition) {
            ComposerImpl.this.parentContext.reportRemovedComposition$runtime_release(controlledComposition);
        }

        public final void setInspectionTables(@m Set<Set<CompositionData>> set) {
            this.inspectionTables = set;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime_release() {
            ComposerImpl.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime_release(@l Composer composer) {
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    Set set2 = (Set) it.next();
                    l0.n(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set2.remove(((ComposerImpl) composer).slotTable);
                }
            }
            u1.a(this.composers).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime_release(@l ControlledComposition controlledComposition) {
            ComposerImpl.this.parentContext.unregisterComposition$runtime_release(controlledComposition);
        }

        public final void updateCompositionLocalScope(@l PersistentCompositionLocalMap persistentCompositionLocalMap) {
            setCompositionLocalScope(persistentCompositionLocalMap);
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [androidx.compose.runtime.ComposerImpl$derivedStateObserver$1] */
    public ComposerImpl(@l Applier<?> applier, @l CompositionContext compositionContext, @l SlotTable slotTable, @l Set<RememberObserver> set, @l ChangeList changeList, @l ChangeList changeList2, @l ControlledComposition controlledComposition) {
        this.applier = applier;
        this.parentContext = compositionContext;
        this.slotTable = slotTable;
        this.abandonSet = set;
        this.changes = changeList;
        this.lateChanges = changeList2;
        this.composition = controlledComposition;
        SlotReader openReader = slotTable.openReader();
        openReader.close();
        this.reader = openReader;
        SlotTable slotTable2 = new SlotTable();
        this.insertTable = slotTable2;
        SlotWriter openWriter = slotTable2.openWriter();
        openWriter.close();
        this.writer = openWriter;
        this.changeListWriter = new ComposerChangeListWriter(this, this.changes);
        SlotReader openReader2 = this.insertTable.openReader();
        try {
            Anchor anchor = openReader2.anchor(0);
            openReader2.close();
            this.insertAnchor = anchor;
            this.insertFixups = new FixupList();
            this.implicitRootStart = true;
            this.startedGroups = new IntStack();
        } catch (Throwable th) {
            openReader2.close();
            throw th;
        }
    }

    private final void abortRoot() {
        cleanUpCompose();
        this.pendingStack.clear();
        this.nodeIndexStack.clear();
        this.groupNodeCountStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.providerUpdates = null;
        if (!this.reader.getClosed()) {
            this.reader.close();
        }
        if (!this.writer.getClosed()) {
            this.writer.close();
        }
        this.insertFixups.clear();
        createFreshInsertTable();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
        this.reusingGroup = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        if (r0 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addRecomposeScope() {
        /*
            r4 = this;
            boolean r0 = r4.getInserting()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L24
            androidx.compose.runtime.RecomposeScopeImpl r0 = new androidx.compose.runtime.RecomposeScopeImpl
            androidx.compose.runtime.ControlledComposition r2 = r4.getComposition()
            kotlin.jvm.internal.l0.n(r2, r1)
            androidx.compose.runtime.CompositionImpl r2 = (androidx.compose.runtime.CompositionImpl) r2
            r0.<init>(r2)
            androidx.compose.runtime.Stack<androidx.compose.runtime.RecomposeScopeImpl> r1 = r4.invalidateStack
            r1.push(r0)
            r4.updateValue(r0)
            int r1 = r4.compositionToken
            r0.start(r1)
            goto L77
        L24:
            java.util.List<androidx.compose.runtime.Invalidation> r0 = r4.invalidations
            androidx.compose.runtime.SlotReader r2 = r4.reader
            int r2 = r2.getParent()
            androidx.compose.runtime.Invalidation r0 = androidx.compose.runtime.ComposerKt.access$removeLocation(r0, r2)
            androidx.compose.runtime.SlotReader r2 = r4.reader
            java.lang.Object r2 = r2.next()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            boolean r3 = kotlin.jvm.internal.l0.g(r2, r3)
            if (r3 == 0) goto L54
            androidx.compose.runtime.RecomposeScopeImpl r2 = new androidx.compose.runtime.RecomposeScopeImpl
            androidx.compose.runtime.ControlledComposition r3 = r4.getComposition()
            kotlin.jvm.internal.l0.n(r3, r1)
            androidx.compose.runtime.CompositionImpl r3 = (androidx.compose.runtime.CompositionImpl) r3
            r2.<init>(r3)
            r4.updateValue(r2)
            goto L5b
        L54:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.l0.n(r2, r1)
            androidx.compose.runtime.RecomposeScopeImpl r2 = (androidx.compose.runtime.RecomposeScopeImpl) r2
        L5b:
            if (r0 != 0) goto L69
            boolean r0 = r2.getForcedRecompose()
            r1 = 0
            if (r0 == 0) goto L67
            r2.setForcedRecompose(r1)
        L67:
            if (r0 == 0) goto L6a
        L69:
            r1 = 1
        L6a:
            r2.setRequiresRecompose(r1)
            androidx.compose.runtime.Stack<androidx.compose.runtime.RecomposeScopeImpl> r0 = r4.invalidateStack
            r0.push(r2)
            int r0 = r4.compositionToken
            r2.start(r0)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.addRecomposeScope():void");
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.changeListWriter.resetTransientState();
        this.invalidateStack.clear();
        clearUpdatedNodeCounts();
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final int compoundKeyOf(int i5, int i6, int i7) {
        if (i5 != i6) {
            int groupCompoundKeyPart = groupCompoundKeyPart(this.reader, i5);
            if (groupCompoundKeyPart == 126665345) {
                return groupCompoundKeyPart;
            }
            return Integer.rotateLeft(compoundKeyOf(this.reader.parent(i5), i6, i7), 3) ^ groupCompoundKeyPart;
        }
        return i7;
    }

    private final void createFreshInsertTable() {
        ComposerKt.runtimeCheck(this.writer.getClosed());
        SlotTable slotTable = new SlotTable();
        this.insertTable = slotTable;
        SlotWriter openWriter = slotTable.openWriter();
        openWriter.close();
        this.writer = openWriter;
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope() {
        PersistentCompositionLocalMap persistentCompositionLocalMap = this.providerCache;
        return persistentCompositionLocalMap != null ? persistentCompositionLocalMap : currentCompositionLocalScope(this.reader.getParent());
    }

    private final void doCompose(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap, p<? super Composer, ? super Integer, r2> pVar) {
        Comparator comparator;
        if (!this.isComposing) {
            Object beginSection = Trace.INSTANCE.beginSection("Compose:recompose");
            try {
                this.compositionToken = SnapshotKt.currentSnapshot().getId();
                this.providerUpdates = null;
                int size = identityArrayMap.getSize();
                for (int i5 = 0; i5 < size; i5++) {
                    Object obj = identityArrayMap.getKeys()[i5];
                    l0.n(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    IdentityArraySet identityArraySet = (IdentityArraySet) identityArrayMap.getValues()[i5];
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                    Anchor anchor = recomposeScopeImpl.getAnchor();
                    if (anchor != null) {
                        this.invalidations.add(new Invalidation(recomposeScopeImpl, anchor.getLocation$runtime_release(), identityArraySet));
                    } else {
                        return;
                    }
                }
                List<Invalidation> list = this.invalidations;
                comparator = ComposerKt.InvalidationLocationAscending;
                a0.m0(list, comparator);
                this.nodeIndex = 0;
                this.isComposing = true;
                try {
                    startRoot();
                    Object nextSlot = nextSlot();
                    if (nextSlot != pVar && pVar != null) {
                        updateValue(pVar);
                    }
                    ComposerImpl$derivedStateObserver$1 composerImpl$derivedStateObserver$1 = this.derivedStateObserver;
                    MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
                    try {
                        derivedStateObservers.add(composerImpl$derivedStateObserver$1);
                        if (pVar != null) {
                            startGroup(200, ComposerKt.getInvocation());
                            ActualJvm_jvmKt.invokeComposable(this, pVar);
                            endGroup();
                        } else if ((this.forciblyRecompose || this.providersInvalid) && nextSlot != null && !l0.g(nextSlot, Composer.Companion.getEmpty())) {
                            startGroup(200, ComposerKt.getInvocation());
                            ActualJvm_jvmKt.invokeComposable(this, (p) u1.q(nextSlot, 2));
                            endGroup();
                        } else {
                            skipCurrentGroup();
                        }
                        derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                        endRoot();
                        this.isComposing = false;
                        this.invalidations.clear();
                        createFreshInsertTable();
                        r2 r2Var = r2.f19517a;
                        return;
                    } catch (Throwable th) {
                        derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.isComposing = false;
                    this.invalidations.clear();
                    abortRoot();
                    createFreshInsertTable();
                    throw th2;
                }
            } finally {
                Trace.INSTANCE.endSection(beginSection);
            }
        }
        ComposerKt.composeRuntimeError("Reentrant composition is not supported".toString());
        throw new y();
    }

    private final void doRecordDownsFor(int i5, int i6) {
        if (i5 > 0 && i5 != i6) {
            doRecordDownsFor(this.reader.parent(i5), i6);
            if (this.reader.isNode(i5)) {
                this.changeListWriter.moveDown(nodeAt(this.reader, i5));
            }
        }
    }

    private final void end(boolean z4) {
        Set set;
        List<KeyInfo> list;
        if (getInserting()) {
            int parent = this.writer.getParent();
            updateCompoundKeyWhenWeExitGroup(this.writer.groupKey(parent), this.writer.groupObjectKey(parent), this.writer.groupAux(parent));
        } else {
            int parent2 = this.reader.getParent();
            updateCompoundKeyWhenWeExitGroup(this.reader.groupKey(parent2), this.reader.groupObjectKey(parent2), this.reader.groupAux(parent2));
        }
        int i5 = this.groupNodeCount;
        Pending pending = this.pending;
        if (pending != null && pending.getKeyInfos().size() > 0) {
            List<KeyInfo> keyInfos = pending.getKeyInfos();
            List<KeyInfo> used = pending.getUsed();
            Set fastToSet = ListUtilsKt.fastToSet(used);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = used.size();
            int size2 = keyInfos.size();
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i6 < size2) {
                KeyInfo keyInfo = keyInfos.get(i6);
                if (!fastToSet.contains(keyInfo)) {
                    this.changeListWriter.removeNode(pending.nodePositionOf(keyInfo) + pending.getStartIndex(), keyInfo.getNodes());
                    pending.updateNodeCount(keyInfo.getLocation(), 0);
                    this.changeListWriter.moveReaderRelativeTo(keyInfo.getLocation());
                    this.reader.reposition(keyInfo.getLocation());
                    recordDelete();
                    this.reader.skipGroup();
                    set = fastToSet;
                    ComposerKt.removeRange(this.invalidations, keyInfo.getLocation(), keyInfo.getLocation() + this.reader.groupSize(keyInfo.getLocation()));
                } else {
                    set = fastToSet;
                    if (!linkedHashSet.contains(keyInfo)) {
                        if (i7 >= size) {
                            fastToSet = set;
                        } else {
                            KeyInfo keyInfo2 = used.get(i7);
                            if (keyInfo2 != keyInfo) {
                                int nodePositionOf = pending.nodePositionOf(keyInfo2);
                                linkedHashSet.add(keyInfo2);
                                if (nodePositionOf != i8) {
                                    int updatedNodeCountOf = pending.updatedNodeCountOf(keyInfo2);
                                    list = used;
                                    this.changeListWriter.moveNode(pending.getStartIndex() + nodePositionOf, i8 + pending.getStartIndex(), updatedNodeCountOf);
                                    pending.registerMoveNode(nodePositionOf, i8, updatedNodeCountOf);
                                } else {
                                    list = used;
                                }
                            } else {
                                list = used;
                                i6++;
                            }
                            i7++;
                            i8 += pending.updatedNodeCountOf(keyInfo2);
                            fastToSet = set;
                            used = list;
                        }
                    }
                }
                i6++;
                fastToSet = set;
            }
            this.changeListWriter.endNodeMovement();
            if (keyInfos.size() > 0) {
                this.changeListWriter.moveReaderRelativeTo(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        int i9 = this.nodeIndex;
        while (!this.reader.isGroupEnd()) {
            int currentGroup = this.reader.getCurrentGroup();
            recordDelete();
            this.changeListWriter.removeNode(i9, this.reader.skipGroup());
            ComposerKt.removeRange(this.invalidations, currentGroup, this.reader.getCurrentGroup());
        }
        boolean inserting = getInserting();
        if (inserting) {
            if (z4) {
                this.insertFixups.endNodeInsert();
                i5 = 1;
            }
            this.reader.endEmpty();
            int parent3 = this.writer.getParent();
            this.writer.endGroup();
            if (!this.reader.getInEmpty()) {
                int insertedGroupVirtualIndex = insertedGroupVirtualIndex(parent3);
                this.writer.endInsert();
                this.writer.close();
                recordInsert(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    updateNodeCount(insertedGroupVirtualIndex, 0);
                    updateNodeCountOverrides(insertedGroupVirtualIndex, i5);
                }
            }
        } else {
            if (z4) {
                this.changeListWriter.moveUp();
            }
            this.changeListWriter.endCurrentGroup();
            int parent4 = this.reader.getParent();
            if (i5 != updatedNodeCount(parent4)) {
                updateNodeCountOverrides(parent4, i5);
            }
            if (z4) {
                i5 = 1;
            }
            this.reader.endGroup();
            this.changeListWriter.endNodeMovement();
        }
        exitGroup(i5, inserting);
    }

    private final void endGroup() {
        end(false);
    }

    private final void endRoot() {
        endGroup();
        this.parentContext.doneComposing$runtime_release();
        endGroup();
        this.changeListWriter.endRoot();
        finalizeCompose();
        this.reader.close();
        this.forciblyRecompose = false;
    }

    private final void ensureWriter() {
        if (this.writer.getClosed()) {
            SlotWriter openWriter = this.insertTable.openWriter();
            this.writer = openWriter;
            openWriter.skipToGroupEnd();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void enterGroup(boolean z4, Pending pending) {
        this.pendingStack.push(this.pending);
        this.pending = pending;
        this.nodeIndexStack.push(this.nodeIndex);
        if (z4) {
            this.nodeIndex = 0;
        }
        this.groupNodeCountStack.push(this.groupNodeCount);
        this.groupNodeCount = 0;
    }

    private final void exitGroup(int i5, boolean z4) {
        Pending pop = this.pendingStack.pop();
        if (pop != null && !z4) {
            pop.setGroupIndex(pop.getGroupIndex() + 1);
        }
        this.pending = pop;
        this.nodeIndex = this.nodeIndexStack.pop() + i5;
        this.groupNodeCount = this.groupNodeCountStack.pop() + i5;
    }

    private final void finalizeCompose() {
        this.changeListWriter.finalizeComposition();
        if (this.pendingStack.isEmpty()) {
            cleanUpCompose();
        } else {
            ComposerKt.composeRuntimeError("Start/end imbalance".toString());
            throw new y();
        }
    }

    @InternalComposeApi
    public static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getInserting$annotations() {
    }

    private final Object getNode(SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getSkipping$annotations() {
    }

    private final int groupCompoundKeyPart(SlotReader slotReader, int i5) {
        Object groupAux;
        if (slotReader.hasObjectKey(i5)) {
            Object groupObjectKey = slotReader.groupObjectKey(i5);
            if (groupObjectKey != null) {
                if (groupObjectKey instanceof Enum) {
                    return ((Enum) groupObjectKey).ordinal();
                }
                if (groupObjectKey instanceof MovableContent) {
                    return MovableContentKt.movableContentKey;
                }
                return groupObjectKey.hashCode();
            }
            return 0;
        }
        int groupKey = slotReader.groupKey(i5);
        if (groupKey == 207 && (groupAux = slotReader.groupAux(i5)) != null && !l0.g(groupAux, Composer.Companion.getEmpty())) {
            groupKey = groupAux.hashCode();
        }
        return groupKey;
    }

    private final void insertMovableContentGuarded(List<u0<MovableContentStateReference, MovableContentStateReference>> list) {
        ComposerChangeListWriter composerChangeListWriter;
        ChangeList changeList;
        SlotTable slotTable$runtime_release;
        Anchor anchor$runtime_release;
        List<? extends Object> collectNodesFrom;
        SlotReader slotReader;
        IntMap intMap;
        SlotReader slotReader2;
        int[] iArr;
        ChangeList changeList2;
        ComposerChangeListWriter composerChangeListWriter2;
        int i5;
        ChangeList changeList3;
        int i6;
        SlotTable slotTable$runtime_release2;
        SlotReader slotReader3;
        ComposerChangeListWriter composerChangeListWriter3 = this.changeListWriter;
        ChangeList changeList4 = this.lateChanges;
        ChangeList changeList5 = composerChangeListWriter3.getChangeList();
        try {
            composerChangeListWriter3.setChangeList(changeList4);
            this.changeListWriter.resetSlots();
            int size = list.size();
            int i7 = 0;
            int i8 = 0;
            while (i8 < size) {
                u0<MovableContentStateReference, MovableContentStateReference> u0Var = list.get(i8);
                MovableContentStateReference component1 = u0Var.component1();
                MovableContentStateReference component2 = u0Var.component2();
                Anchor anchor$runtime_release2 = component1.getAnchor$runtime_release();
                int anchorIndex = component1.getSlotTable$runtime_release().anchorIndex(anchor$runtime_release2);
                IntRef intRef = new IntRef(i7, 1, null);
                this.changeListWriter.determineMovableContentNodeIndex(intRef, anchor$runtime_release2);
                if (component2 == null) {
                    if (l0.g(component1.getSlotTable$runtime_release(), this.insertTable)) {
                        createFreshInsertTable();
                    }
                    SlotReader openReader = component1.getSlotTable$runtime_release().openReader();
                    try {
                        openReader.reposition(anchorIndex);
                        this.changeListWriter.moveReaderToAbsolute(anchorIndex);
                        ChangeList changeList6 = new ChangeList();
                        slotReader3 = openReader;
                        try {
                            recomposeMovableContent$default(this, null, null, null, null, new ComposerImpl$insertMovableContentGuarded$1$1$1$1(this, changeList6, openReader, component1), 15, null);
                            this.changeListWriter.includeOperationsIn(changeList6, intRef);
                            r2 r2Var = r2.f19517a;
                            slotReader3.close();
                            i5 = size;
                            composerChangeListWriter2 = composerChangeListWriter3;
                            changeList3 = changeList5;
                            i6 = i8;
                        } catch (Throwable th) {
                            th = th;
                            slotReader3.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        slotReader3 = openReader;
                    }
                } else {
                    MovableContentState movableContentStateResolve$runtime_release = this.parentContext.movableContentStateResolve$runtime_release(component2);
                    if (movableContentStateResolve$runtime_release == null || (slotTable$runtime_release = movableContentStateResolve$runtime_release.getSlotTable$runtime_release()) == null) {
                        slotTable$runtime_release = component2.getSlotTable$runtime_release();
                    }
                    if (movableContentStateResolve$runtime_release == null || (slotTable$runtime_release2 = movableContentStateResolve$runtime_release.getSlotTable$runtime_release()) == null || (anchor$runtime_release = slotTable$runtime_release2.anchor(0)) == null) {
                        anchor$runtime_release = component2.getAnchor$runtime_release();
                    }
                    collectNodesFrom = ComposerKt.collectNodesFrom(slotTable$runtime_release, anchor$runtime_release);
                    if (!collectNodesFrom.isEmpty()) {
                        this.changeListWriter.copyNodesToNewAnchorLocation(collectNodesFrom, intRef);
                        if (l0.g(component1.getSlotTable$runtime_release(), this.slotTable)) {
                            int anchorIndex2 = this.slotTable.anchorIndex(anchor$runtime_release2);
                            updateNodeCount(anchorIndex2, updatedNodeCount(anchorIndex2) + collectNodesFrom.size());
                        }
                    }
                    this.changeListWriter.copySlotTableToAnchorLocation(movableContentStateResolve$runtime_release, this.parentContext, component2, component1);
                    SlotReader openReader2 = slotTable$runtime_release.openReader();
                    try {
                        SlotReader reader$runtime_release = getReader$runtime_release();
                        int[] iArr2 = this.nodeCountOverrides;
                        IntMap intMap2 = this.providerUpdates;
                        this.nodeCountOverrides = null;
                        this.providerUpdates = null;
                        try {
                            setReader$runtime_release(openReader2);
                            int anchorIndex3 = slotTable$runtime_release.anchorIndex(anchor$runtime_release);
                            openReader2.reposition(anchorIndex3);
                            this.changeListWriter.moveReaderToAbsolute(anchorIndex3);
                            ChangeList changeList7 = new ChangeList();
                            ComposerChangeListWriter composerChangeListWriter4 = this.changeListWriter;
                            ChangeList changeList8 = composerChangeListWriter4.getChangeList();
                            try {
                                composerChangeListWriter4.setChangeList(changeList7);
                                ComposerChangeListWriter composerChangeListWriter5 = this.changeListWriter;
                                composerChangeListWriter2 = composerChangeListWriter3;
                                try {
                                    boolean implicitRootStart = composerChangeListWriter5.getImplicitRootStart();
                                    i5 = size;
                                    try {
                                        composerChangeListWriter5.setImplicitRootStart(false);
                                        ControlledComposition composition$runtime_release = component2.getComposition$runtime_release();
                                        ControlledComposition composition$runtime_release2 = component1.getComposition$runtime_release();
                                        Integer valueOf = Integer.valueOf(openReader2.getCurrentGroup());
                                        changeList3 = changeList5;
                                        changeList2 = changeList8;
                                        i6 = i8;
                                        slotReader = openReader2;
                                        iArr = iArr2;
                                        slotReader2 = reader$runtime_release;
                                        try {
                                            recomposeMovableContent(composition$runtime_release, composition$runtime_release2, valueOf, component2.getInvalidations$runtime_release(), new ComposerImpl$insertMovableContentGuarded$1$1$2$1$1$1$1(this, component1));
                                            try {
                                                composerChangeListWriter5.setImplicitRootStart(implicitRootStart);
                                                try {
                                                    composerChangeListWriter4.setChangeList(changeList2);
                                                    this.changeListWriter.includeOperationsIn(changeList7, intRef);
                                                    r2 r2Var2 = r2.f19517a;
                                                    try {
                                                        setReader$runtime_release(slotReader2);
                                                        this.nodeCountOverrides = iArr;
                                                        this.providerUpdates = intMap2;
                                                        try {
                                                            slotReader.close();
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            composerChangeListWriter = composerChangeListWriter2;
                                                            changeList = changeList3;
                                                            composerChangeListWriter.setChangeList(changeList);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        slotReader.close();
                                                        throw th;
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    intMap = intMap2;
                                                    setReader$runtime_release(slotReader2);
                                                    this.nodeCountOverrides = iArr;
                                                    this.providerUpdates = intMap;
                                                    throw th;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                intMap = intMap2;
                                                try {
                                                    composerChangeListWriter4.setChangeList(changeList2);
                                                    throw th;
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    setReader$runtime_release(slotReader2);
                                                    this.nodeCountOverrides = iArr;
                                                    this.providerUpdates = intMap;
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            intMap = intMap2;
                                            try {
                                                composerChangeListWriter5.setImplicitRootStart(implicitRootStart);
                                                throw th;
                                            } catch (Throwable th9) {
                                                th = th9;
                                                composerChangeListWriter4.setChangeList(changeList2);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        intMap = intMap2;
                                        slotReader2 = reader$runtime_release;
                                        slotReader = openReader2;
                                        changeList2 = changeList8;
                                        iArr = iArr2;
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    intMap = intMap2;
                                    slotReader2 = reader$runtime_release;
                                    slotReader = openReader2;
                                    changeList2 = changeList8;
                                    iArr = iArr2;
                                    composerChangeListWriter4.setChangeList(changeList2);
                                    throw th;
                                }
                            } catch (Throwable th12) {
                                th = th12;
                                intMap = intMap2;
                                slotReader2 = reader$runtime_release;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            intMap = intMap2;
                            slotReader2 = reader$runtime_release;
                            slotReader = openReader2;
                            iArr = iArr2;
                        }
                    } catch (Throwable th14) {
                        th = th14;
                        slotReader = openReader2;
                    }
                }
                this.changeListWriter.skipToEndOfCurrentGroup();
                i8 = i6 + 1;
                composerChangeListWriter3 = composerChangeListWriter2;
                size = i5;
                changeList5 = changeList3;
                i7 = 0;
            }
            ComposerChangeListWriter composerChangeListWriter6 = composerChangeListWriter3;
            ChangeList changeList9 = changeList5;
            this.changeListWriter.endMovableContentPlacement();
            this.changeListWriter.moveReaderToAbsolute(0);
            composerChangeListWriter6.setChangeList(changeList9);
        } catch (Throwable th15) {
            th = th15;
            composerChangeListWriter = composerChangeListWriter3;
            changeList = changeList5;
        }
    }

    private final int insertedGroupVirtualIndex(int i5) {
        return (-2) - i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        recordProviderUpdate(r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invokeMovableContentLambda(androidx.compose.runtime.MovableContent<java.lang.Object> r12, androidx.compose.runtime.PersistentCompositionLocalMap r13, java.lang.Object r14, boolean r15) {
        /*
            r11 = this;
            r0 = 126665345(0x78cc281, float:2.1179178E-34)
            r11.startMovableGroup(r0, r12)
            r11.updateSlot(r14)
            int r1 = r11.getCompoundKeyHash()
            r2 = 0
            r11.compoundKeyHash = r0     // Catch: java.lang.Throwable -> L9b
            boolean r0 = r11.getInserting()     // Catch: java.lang.Throwable -> L9b
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L1d
            androidx.compose.runtime.SlotWriter r0 = r11.writer     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.SlotWriter.markGroup$default(r0, r3, r4, r2)     // Catch: java.lang.Throwable -> L9b
        L1d:
            boolean r0 = r11.getInserting()     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L24
            goto L31
        L24:
            androidx.compose.runtime.SlotReader r0 = r11.reader     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r0 = r0.getGroupAux()     // Catch: java.lang.Throwable -> L9b
            boolean r0 = kotlin.jvm.internal.l0.g(r0, r13)     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L31
            r3 = r4
        L31:
            if (r3 == 0) goto L36
            r11.recordProviderUpdate(r13)     // Catch: java.lang.Throwable -> L9b
        L36:
            java.lang.Object r0 = androidx.compose.runtime.ComposerKt.getCompositionLocalMap()     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.GroupKind$Companion r5 = androidx.compose.runtime.GroupKind.Companion     // Catch: java.lang.Throwable -> L9b
            int r5 = r5.m3252getGroupULZAiWs()     // Catch: java.lang.Throwable -> L9b
            r6 = 202(0xca, float:2.83E-43)
            r11.m3242startBaiHCIY(r6, r0, r5, r13)     // Catch: java.lang.Throwable -> L9b
            r11.providerCache = r2     // Catch: java.lang.Throwable -> L9b
            boolean r13 = r11.getInserting()     // Catch: java.lang.Throwable -> L9b
            if (r13 == 0) goto L7b
            if (r15 != 0) goto L7b
            r11.writerHasAProvider = r4     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.SlotWriter r13 = r11.writer     // Catch: java.lang.Throwable -> L9b
            int r15 = r13.getParent()     // Catch: java.lang.Throwable -> L9b
            int r15 = r13.parent(r15)     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.Anchor r8 = r13.anchor(r15)     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.MovableContentStateReference r13 = new androidx.compose.runtime.MovableContentStateReference     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.ControlledComposition r6 = r11.getComposition()     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.SlotTable r7 = r11.insertTable     // Catch: java.lang.Throwable -> L9b
            java.util.List r9 = kotlin.collections.u.E()     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.PersistentCompositionLocalMap r10 = r11.currentCompositionLocalScope()     // Catch: java.lang.Throwable -> L9b
            r3 = r13
            r4 = r12
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.CompositionContext r12 = r11.parentContext     // Catch: java.lang.Throwable -> L9b
            r12.insertMovableContent$runtime_release(r13)     // Catch: java.lang.Throwable -> L9b
            goto L90
        L7b:
            boolean r13 = r11.providersInvalid     // Catch: java.lang.Throwable -> L9b
            r11.providersInvalid = r3     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.ComposerImpl$invokeMovableContentLambda$1 r15 = new androidx.compose.runtime.ComposerImpl$invokeMovableContentLambda$1     // Catch: java.lang.Throwable -> L9b
            r15.<init>(r12, r14)     // Catch: java.lang.Throwable -> L9b
            r12 = 316014703(0x12d6006f, float:1.3505406E-27)
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r12, r4, r15)     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.ActualJvm_jvmKt.invokeComposable(r11, r12)     // Catch: java.lang.Throwable -> L9b
            r11.providersInvalid = r13     // Catch: java.lang.Throwable -> L9b
        L90:
            r11.endGroup()
            r11.providerCache = r2
            r11.compoundKeyHash = r1
            r11.endMovableGroup()
            return
        L9b:
            r12 = move-exception
            r11.endGroup()
            r11.providerCache = r2
            r11.compoundKeyHash = r1
            r11.endMovableGroup()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda(androidx.compose.runtime.MovableContent, androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object, boolean):void");
    }

    private final Object nodeAt(SlotReader slotReader, int i5) {
        return slotReader.node(i5);
    }

    private final int nodeIndexOf(int i5, int i6, int i7, int i8) {
        int parent = this.reader.parent(i6);
        while (parent != i7 && !this.reader.isNode(parent)) {
            parent = this.reader.parent(parent);
        }
        if (this.reader.isNode(parent)) {
            i8 = 0;
        }
        if (parent == i6) {
            return i8;
        }
        int updatedNodeCount = (updatedNodeCount(parent) - this.reader.nodeCount(i6)) + i8;
        loop1: while (i8 < updatedNodeCount && parent != i5) {
            parent++;
            while (parent < i5) {
                int groupSize = this.reader.groupSize(parent) + parent;
                if (i5 >= groupSize) {
                    i8 += updatedNodeCount(parent);
                    parent = groupSize;
                }
            }
            break loop1;
        }
        return i8;
    }

    private final <R> R recomposeMovableContent(ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List<u0<RecomposeScopeImpl, IdentityArraySet<Object>>> list, v3.a<? extends R> aVar) {
        R r5;
        int i5;
        boolean z4 = this.isComposing;
        int i6 = this.nodeIndex;
        try {
            this.isComposing = true;
            this.nodeIndex = 0;
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                u0<RecomposeScopeImpl, IdentityArraySet<Object>> u0Var = list.get(i7);
                RecomposeScopeImpl component1 = u0Var.component1();
                IdentityArraySet<Object> component2 = u0Var.component2();
                if (component2 != null) {
                    Object[] values = component2.getValues();
                    int size2 = component2.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Object obj = values[i8];
                        l0.n(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        tryImminentInvalidation$runtime_release(component1, obj);
                    }
                } else {
                    tryImminentInvalidation$runtime_release(component1, null);
                }
            }
            if (controlledComposition != null) {
                if (num != null) {
                    i5 = num.intValue();
                } else {
                    i5 = -1;
                }
                r5 = (R) controlledComposition.delegateInvalidations(controlledComposition2, i5, aVar);
                if (r5 == null) {
                }
                return r5;
            }
            r5 = aVar.invoke();
            return r5;
        } finally {
            this.isComposing = z4;
            this.nodeIndex = i6;
        }
    }

    static /* synthetic */ Object recomposeMovableContent$default(ComposerImpl composerImpl, ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List list, v3.a aVar, int i5, Object obj) {
        ControlledComposition controlledComposition3;
        ControlledComposition controlledComposition4;
        Integer num2;
        if ((i5 & 1) != 0) {
            controlledComposition3 = null;
        } else {
            controlledComposition3 = controlledComposition;
        }
        if ((i5 & 2) != 0) {
            controlledComposition4 = null;
        } else {
            controlledComposition4 = controlledComposition2;
        }
        if ((i5 & 4) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i5 & 8) != 0) {
            list = w.E();
        }
        return composerImpl.recomposeMovableContent(controlledComposition3, controlledComposition4, num2, list, aVar);
    }

    private final void recomposeToGroupEnd() {
        Invalidation firstInRange;
        boolean z4 = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int groupSize = this.reader.groupSize(parent) + parent;
        int i5 = this.nodeIndex;
        int compoundKeyHash = getCompoundKeyHash();
        int i6 = this.groupNodeCount;
        firstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), groupSize);
        boolean z5 = false;
        int i7 = parent;
        while (firstInRange != null) {
            int location = firstInRange.getLocation();
            ComposerKt.removeLocation(this.invalidations, location);
            if (firstInRange.isInvalid()) {
                this.reader.reposition(location);
                int currentGroup = this.reader.getCurrentGroup();
                recordUpsAndDowns(i7, currentGroup, parent);
                this.nodeIndex = nodeIndexOf(location, currentGroup, parent, i5);
                this.compoundKeyHash = compoundKeyOf(this.reader.parent(currentGroup), parent, compoundKeyHash);
                this.providerCache = null;
                firstInRange.getScope().compose(this);
                this.providerCache = null;
                this.reader.restoreParent(parent);
                i7 = currentGroup;
                z5 = true;
            } else {
                this.invalidateStack.push(firstInRange.getScope());
                firstInRange.getScope().rereadTrackedInstances();
                this.invalidateStack.pop();
            }
            firstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), groupSize);
        }
        if (z5) {
            recordUpsAndDowns(i7, parent, parent);
            this.reader.skipToGroupEnd();
            int updatedNodeCount = updatedNodeCount(parent);
            this.nodeIndex = i5 + updatedNodeCount;
            this.groupNodeCount = i6 + updatedNodeCount;
        } else {
            skipReaderToGroupEnd();
        }
        this.compoundKeyHash = compoundKeyHash;
        this.isComposing = z4;
    }

    private final void recordDelete() {
        reportFreeMovableContent(this.reader.getCurrentGroup());
        this.changeListWriter.removeCurrentGroup();
    }

    private final void recordInsert(Anchor anchor) {
        if (this.insertFixups.isEmpty()) {
            this.changeListWriter.insertSlots(anchor, this.insertTable);
        } else {
            this.changeListWriter.insertSlots(anchor, this.insertTable, this.insertFixups);
            this.insertFixups = new FixupList();
        }
    }

    private final void recordProviderUpdate(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        IntMap<PersistentCompositionLocalMap> intMap = this.providerUpdates;
        if (intMap == null) {
            intMap = new IntMap<>(0, 1, null);
            this.providerUpdates = intMap;
        }
        intMap.set(this.reader.getCurrentGroup(), persistentCompositionLocalMap);
    }

    private final void recordUpsAndDowns(int i5, int i6, int i7) {
        int nearestCommonRootOf;
        SlotReader slotReader = this.reader;
        nearestCommonRootOf = ComposerKt.nearestCommonRootOf(slotReader, i5, i6, i7);
        while (i5 > 0 && i5 != nearestCommonRootOf) {
            if (slotReader.isNode(i5)) {
                this.changeListWriter.moveUp();
            }
            i5 = slotReader.parent(i5);
        }
        doRecordDownsFor(i6, nearestCommonRootOf);
    }

    private final void reportAllMovableContent() {
        if (this.slotTable.containsMark()) {
            ChangeList changeList = new ChangeList();
            this.deferredChanges = changeList;
            SlotReader openReader = this.slotTable.openReader();
            try {
                this.reader = openReader;
                ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
                ChangeList changeList2 = composerChangeListWriter.getChangeList();
                try {
                    composerChangeListWriter.setChangeList(changeList);
                    reportFreeMovableContent(0);
                    this.changeListWriter.releaseMovableContent();
                    composerChangeListWriter.setChangeList(changeList2);
                    r2 r2Var = r2.f19517a;
                } catch (Throwable th) {
                    composerChangeListWriter.setChangeList(changeList2);
                    throw th;
                }
            } finally {
                openReader.close();
            }
        }
    }

    private final void reportFreeMovableContent(int i5) {
        reportFreeMovableContent$reportGroup(this, i5, false, 0);
        this.changeListWriter.endNodeMovement();
    }

    private static final int reportFreeMovableContent$reportGroup(ComposerImpl composerImpl, int i5, boolean z4, int i6) {
        boolean z5;
        int i7;
        CompositionContextHolder compositionContextHolder;
        List filterToRange;
        SlotReader slotReader = composerImpl.reader;
        if (slotReader.hasMark(i5)) {
            int groupKey = slotReader.groupKey(i5);
            Object groupObjectKey = slotReader.groupObjectKey(i5);
            if (groupKey == 126665345 && (groupObjectKey instanceof MovableContent)) {
                MovableContent movableContent = (MovableContent) groupObjectKey;
                Object groupGet = slotReader.groupGet(i5, 0);
                Anchor anchor = slotReader.anchor(i5);
                filterToRange = ComposerKt.filterToRange(composerImpl.invalidations, i5, slotReader.groupSize(i5) + i5);
                ArrayList arrayList = new ArrayList(filterToRange.size());
                int size = filterToRange.size();
                for (int i8 = 0; i8 < size; i8++) {
                    Invalidation invalidation = (Invalidation) filterToRange.get(i8);
                    arrayList.add(q1.a(invalidation.getScope(), invalidation.getInstances()));
                }
                MovableContentStateReference movableContentStateReference = new MovableContentStateReference(movableContent, groupGet, composerImpl.getComposition(), composerImpl.slotTable, anchor, arrayList, composerImpl.currentCompositionLocalScope(i5));
                composerImpl.parentContext.deletedMovableContent$runtime_release(movableContentStateReference);
                composerImpl.changeListWriter.recordSlotEditing();
                composerImpl.changeListWriter.releaseMovableGroupAtCurrent(composerImpl.getComposition(), composerImpl.parentContext, movableContentStateReference);
                if (z4) {
                    composerImpl.changeListWriter.endNodeMovementAndDeleteNode(i6, i5);
                    return 0;
                }
                return slotReader.nodeCount(i5);
            }
            if (groupKey == 206 && l0.g(groupObjectKey, ComposerKt.getReference())) {
                Object groupGet2 = slotReader.groupGet(i5, 0);
                if (groupGet2 instanceof CompositionContextHolder) {
                    compositionContextHolder = (CompositionContextHolder) groupGet2;
                } else {
                    compositionContextHolder = null;
                }
                if (compositionContextHolder != null) {
                    for (ComposerImpl composerImpl2 : compositionContextHolder.getRef().getComposers()) {
                        composerImpl2.reportAllMovableContent();
                        composerImpl.parentContext.reportRemovedComposition$runtime_release(composerImpl2.getComposition());
                    }
                }
                return slotReader.nodeCount(i5);
            }
            if (slotReader.isNode(i5)) {
                return 1;
            }
            return slotReader.nodeCount(i5);
        }
        if (slotReader.containsMark(i5)) {
            int groupSize = slotReader.groupSize(i5) + i5;
            int i9 = 0;
            for (int i10 = i5 + 1; i10 < groupSize; i10 += slotReader.groupSize(i10)) {
                boolean isNode = slotReader.isNode(i10);
                if (isNode) {
                    composerImpl.changeListWriter.endNodeMovement();
                    composerImpl.changeListWriter.moveDown(slotReader.node(i10));
                }
                if (!isNode && !z4) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (isNode) {
                    i7 = 0;
                } else {
                    i7 = i6 + i9;
                }
                i9 += reportFreeMovableContent$reportGroup(composerImpl, i10, z5, i7);
                if (isNode) {
                    composerImpl.changeListWriter.endNodeMovement();
                    composerImpl.changeListWriter.moveUp();
                }
            }
            if (slotReader.isNode(i5)) {
                return 1;
            }
            return i9;
        }
        if (slotReader.isNode(i5)) {
            return 1;
        }
        return slotReader.nodeCount(i5);
    }

    private final void skipGroup() {
        this.groupNodeCount += this.reader.skipGroup();
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    /* renamed from: start-BaiHCIY, reason: not valid java name */
    private final void m3242startBaiHCIY(int i5, Object obj, int i6, Object obj2) {
        boolean z4;
        boolean z5;
        boolean z6;
        Object obj3 = obj;
        validateNodeNotExpected();
        updateCompoundKeyWhenWeEnterGroup(i5, obj, obj2);
        GroupKind.Companion companion = GroupKind.Companion;
        int i7 = 0;
        if (i6 != companion.m3252getGroupULZAiWs()) {
            z4 = true;
        } else {
            z4 = false;
        }
        Pending pending = null;
        if (getInserting()) {
            this.reader.beginEmpty();
            int currentGroup = this.writer.getCurrentGroup();
            if (z4) {
                this.writer.startNode(i5, Composer.Companion.getEmpty());
            } else if (obj2 != null) {
                SlotWriter slotWriter = this.writer;
                if (obj3 == null) {
                    obj3 = Composer.Companion.getEmpty();
                }
                slotWriter.startData(i5, obj3, obj2);
            } else {
                SlotWriter slotWriter2 = this.writer;
                if (obj3 == null) {
                    obj3 = Composer.Companion.getEmpty();
                }
                slotWriter2.startGroup(i5, obj3);
            }
            Pending pending2 = this.pending;
            if (pending2 != null) {
                KeyInfo keyInfo = new KeyInfo(i5, -1, insertedGroupVirtualIndex(currentGroup), -1, 0);
                pending2.registerInsert(keyInfo, this.nodeIndex - pending2.getStartIndex());
                pending2.recordUsed(keyInfo);
            }
            enterGroup(z4, null);
            return;
        }
        if (i6 != companion.m3253getNodeULZAiWs()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5 && this.reusing) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (this.pending == null) {
            int groupKey = this.reader.getGroupKey();
            if (!z6 && groupKey == i5 && l0.g(obj, this.reader.getGroupObjectKey())) {
                startReaderGroup(z4, obj2);
            } else {
                this.pending = new Pending(this.reader.extractKeys(), this.nodeIndex);
            }
        }
        Pending pending3 = this.pending;
        if (pending3 != null) {
            KeyInfo next = pending3.getNext(i5, obj);
            if (!z6 && next != null) {
                pending3.recordUsed(next);
                int location = next.getLocation();
                this.nodeIndex = pending3.nodePositionOf(next) + pending3.getStartIndex();
                int slotPositionOf = pending3.slotPositionOf(next);
                int groupIndex = slotPositionOf - pending3.getGroupIndex();
                pending3.registerMoveSlot(slotPositionOf, pending3.getGroupIndex());
                this.changeListWriter.moveReaderRelativeTo(location);
                this.reader.reposition(location);
                if (groupIndex > 0) {
                    this.changeListWriter.moveCurrentGroup(groupIndex);
                }
                startReaderGroup(z4, obj2);
            } else {
                this.reader.beginEmpty();
                this.inserting = true;
                this.providerCache = null;
                ensureWriter();
                this.writer.beginInsert();
                int currentGroup2 = this.writer.getCurrentGroup();
                if (z4) {
                    this.writer.startNode(i5, Composer.Companion.getEmpty());
                } else if (obj2 != null) {
                    SlotWriter slotWriter3 = this.writer;
                    if (obj3 == null) {
                        obj3 = Composer.Companion.getEmpty();
                    }
                    slotWriter3.startData(i5, obj3, obj2);
                } else {
                    SlotWriter slotWriter4 = this.writer;
                    if (obj3 == null) {
                        obj3 = Composer.Companion.getEmpty();
                    }
                    slotWriter4.startGroup(i5, obj3);
                }
                this.insertAnchor = this.writer.anchor(currentGroup2);
                KeyInfo keyInfo2 = new KeyInfo(i5, -1, insertedGroupVirtualIndex(currentGroup2), -1, 0);
                pending3.registerInsert(keyInfo2, this.nodeIndex - pending3.getStartIndex());
                pending3.recordUsed(keyInfo2);
                ArrayList arrayList = new ArrayList();
                if (!z4) {
                    i7 = this.nodeIndex;
                }
                pending = new Pending(arrayList, i7);
            }
        }
        enterGroup(z4, pending);
    }

    private final void startGroup(int i5) {
        m3242startBaiHCIY(i5, null, GroupKind.Companion.m3252getGroupULZAiWs(), null);
    }

    private final void startReaderGroup(boolean z4, Object obj) {
        if (z4) {
            this.reader.startNode();
            return;
        }
        if (obj != null && this.reader.getGroupAux() != obj) {
            this.changeListWriter.updateAuxData(obj);
        }
        this.reader.startGroup();
    }

    private final void startRoot() {
        int asInt;
        this.reader = this.slotTable.openReader();
        startGroup(100);
        this.parentContext.startComposing$runtime_release();
        this.parentProvider = this.parentContext.getCompositionLocalScope$runtime_release();
        IntStack intStack = this.providersInvalidStack;
        asInt = ComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = changed(this.parentProvider);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation$runtime_release();
        }
        if (!this.sourceInformationEnabled) {
            this.sourceInformationEnabled = this.parentContext.getCollectingSourceInformation$runtime_release();
        }
        Set<CompositionData> set = (Set) CompositionLocalMapKt.read(this.parentProvider, InspectionTablesKt.getLocalInspectionTables());
        if (set != null) {
            set.add(this.slotTable);
            this.parentContext.recordInspectionTable$runtime_release(set);
        }
        startGroup(this.parentContext.getCompoundHashKey$runtime_release());
    }

    private final void updateCompoundKeyWhenWeEnterGroup(int i5, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i5 == 207 && !l0.g(obj2, Composer.Companion.getEmpty())) {
                updateCompoundKeyWhenWeEnterGroupKeyHash(obj2.hashCode());
                return;
            } else {
                updateCompoundKeyWhenWeEnterGroupKeyHash(i5);
                return;
            }
        }
        if (obj instanceof Enum) {
            updateCompoundKeyWhenWeEnterGroupKeyHash(((Enum) obj).ordinal());
        } else {
            updateCompoundKeyWhenWeEnterGroupKeyHash(obj.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeEnterGroupKeyHash(int i5) {
        this.compoundKeyHash = i5 ^ Integer.rotateLeft(getCompoundKeyHash(), 3);
    }

    private final void updateCompoundKeyWhenWeExitGroup(int i5, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i5 == 207 && !l0.g(obj2, Composer.Companion.getEmpty())) {
                updateCompoundKeyWhenWeExitGroupKeyHash(obj2.hashCode());
                return;
            } else {
                updateCompoundKeyWhenWeExitGroupKeyHash(i5);
                return;
            }
        }
        if (obj instanceof Enum) {
            updateCompoundKeyWhenWeExitGroupKeyHash(((Enum) obj).ordinal());
        } else {
            updateCompoundKeyWhenWeExitGroupKeyHash(obj.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeExitGroupKeyHash(int i5) {
        this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(i5) ^ getCompoundKeyHash(), 3);
    }

    private final void updateNodeCount(int i5, int i6) {
        if (updatedNodeCount(i5) != i6) {
            if (i5 < 0) {
                MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
                if (mutableIntIntMap == null) {
                    mutableIntIntMap = new MutableIntIntMap(0, 1, null);
                    this.nodeCountVirtualOverrides = mutableIntIntMap;
                }
                mutableIntIntMap.set(i5, i6);
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                iArr = new int[this.reader.getSize()];
                o.T1(iArr, -1, 0, 0, 6, null);
                this.nodeCountOverrides = iArr;
            }
            iArr[i5] = i6;
        }
    }

    private final void updateNodeCountOverrides(int i5, int i6) {
        int updatedNodeCount = updatedNodeCount(i5);
        if (updatedNodeCount != i6) {
            int i7 = i6 - updatedNodeCount;
            int size = this.pendingStack.getSize() - 1;
            while (i5 != -1) {
                int updatedNodeCount2 = updatedNodeCount(i5) + i7;
                updateNodeCount(i5, updatedNodeCount2);
                int i8 = size;
                while (true) {
                    if (-1 < i8) {
                        Pending peek = this.pendingStack.peek(i8);
                        if (peek != null && peek.updateNodeCount(i5, updatedNodeCount2)) {
                            size = i8 - 1;
                            break;
                        }
                        i8--;
                    } else {
                        break;
                    }
                }
                if (i5 < 0) {
                    i5 = this.reader.getParent();
                } else if (!this.reader.isNode(i5)) {
                    i5 = this.reader.parent(i5);
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object] */
    private final PersistentCompositionLocalMap updateProviderMapGroup(PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        PersistentMap.Builder<CompositionLocal<Object>, State<? extends Object>> builder2 = persistentCompositionLocalMap.builder2();
        builder2.putAll(persistentCompositionLocalMap2);
        ?? build2 = builder2.build2();
        startGroup(204, ComposerKt.getProviderMaps());
        updateSlot(build2);
        updateSlot(persistentCompositionLocalMap2);
        endGroup();
        return build2;
    }

    private final void updateSlot(Object obj) {
        nextSlot();
        updateValue(obj);
    }

    private final int updatedNodeCount(int i5) {
        int i6;
        if (i5 < 0) {
            MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
            if (mutableIntIntMap == null || !mutableIntIntMap.contains(i5)) {
                return 0;
            }
            return mutableIntIntMap.get(i5);
        }
        int[] iArr = this.nodeCountOverrides;
        if (iArr != null && (i6 = iArr[i5]) >= 0) {
            return i6;
        }
        return this.reader.nodeCount(i5);
    }

    private final void validateNodeExpected() {
        if (this.nodeExpected) {
            this.nodeExpected = false;
        } else {
            ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw new y();
        }
    }

    private final void validateNodeNotExpected() {
        if (!this.nodeExpected) {
            return;
        }
        ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected".toString());
        throw new y();
    }

    private final <R> R withReader(SlotReader slotReader, v3.a<? extends R> aVar) {
        SlotReader reader$runtime_release = getReader$runtime_release();
        int[] iArr = this.nodeCountOverrides;
        IntMap intMap = this.providerUpdates;
        this.nodeCountOverrides = null;
        this.providerUpdates = null;
        try {
            setReader$runtime_release(slotReader);
            return aVar.invoke();
        } finally {
            kotlin.jvm.internal.i0.d(1);
            setReader$runtime_release(reader$runtime_release);
            this.nodeCountOverrides = iArr;
            this.providerUpdates = intMap;
            kotlin.jvm.internal.i0.c(1);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public <V, T> void apply(V v4, @l p<? super T, ? super V, r2> pVar) {
        if (getInserting()) {
            this.insertFixups.updateNode(v4, pVar);
        } else {
            this.changeListWriter.updateNode(v4, pVar);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @l
    public CompositionContext buildContext() {
        CompositionContextHolder compositionContextHolder;
        CompositionImpl compositionImpl;
        startGroup(206, ComposerKt.getReference());
        CompositionObserverHolder compositionObserverHolder = null;
        if (getInserting()) {
            SlotWriter.markGroup$default(this.writer, 0, 1, null);
        }
        Object nextSlot = nextSlot();
        if (nextSlot instanceof CompositionContextHolder) {
            compositionContextHolder = (CompositionContextHolder) nextSlot;
        } else {
            compositionContextHolder = null;
        }
        if (compositionContextHolder == null) {
            int compoundKeyHash = getCompoundKeyHash();
            boolean z4 = this.forceRecomposeScopes;
            boolean z5 = this.sourceInformationEnabled;
            ControlledComposition composition = getComposition();
            if (composition instanceof CompositionImpl) {
                compositionImpl = (CompositionImpl) composition;
            } else {
                compositionImpl = null;
            }
            if (compositionImpl != null) {
                compositionObserverHolder = compositionImpl.getObserverHolder$runtime_release();
            }
            compositionContextHolder = new CompositionContextHolder(new CompositionContextImpl(compoundKeyHash, z4, z5, compositionObserverHolder));
            updateValue(compositionContextHolder);
        }
        compositionContextHolder.getRef().updateCompositionLocalScope(currentCompositionLocalScope());
        endGroup();
        return compositionContextHolder.getRef();
    }

    @ComposeCompilerApi
    public final <T> T cache(boolean z4, @l v3.a<? extends T> aVar) {
        T t5 = (T) nextSlotForCache();
        if (t5 == Composer.Companion.getEmpty() || z4) {
            T invoke = aVar.invoke();
            updateCachedValue(invoke);
            return invoke;
        }
        return t5;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(@m Object obj) {
        if (l0.g(nextSlot(), obj)) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changedInstance(@m Object obj) {
        if (nextSlot() != obj) {
            updateValue(obj);
            return true;
        }
        return false;
    }

    public final void changesApplied$runtime_release() {
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.Composer
    public void collectParameterInformation() {
        this.forceRecomposeScopes = true;
        this.sourceInformationEnabled = true;
    }

    public final void composeContent$runtime_release(@l IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap, @l p<? super Composer, ? super Integer, r2> pVar) {
        if (this.changes.isEmpty()) {
            doCompose(identityArrayMap, pVar);
        } else {
            ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
            throw new y();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public <T> T consume(@l CompositionLocal<T> compositionLocal) {
        return (T) CompositionLocalMapKt.read(currentCompositionLocalScope(), compositionLocal);
    }

    @Override // androidx.compose.runtime.Composer
    public <T> void createNode(@l v3.a<? extends T> aVar) {
        validateNodeExpected();
        if (getInserting()) {
            int peek = this.nodeIndexStack.peek();
            SlotWriter slotWriter = this.writer;
            Anchor anchor = slotWriter.anchor(slotWriter.getParent());
            this.groupNodeCount++;
            this.insertFixups.createAndInsertNode(aVar, peek, anchor);
            return;
        }
        ComposerKt.composeRuntimeError("createNode() can only be called when inserting".toString());
        throw new y();
    }

    public final void deactivate$runtime_release() {
        this.invalidateStack.clear();
        this.invalidations.clear();
        this.changes.clear();
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void deactivateToEndGroup(boolean z4) {
        boolean z5;
        if (this.groupNodeCount == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            if (!getInserting()) {
                if (!z4) {
                    skipReaderToGroupEnd();
                    return;
                }
                int currentGroup = this.reader.getCurrentGroup();
                int currentEnd = this.reader.getCurrentEnd();
                this.changeListWriter.deactivateCurrentGroup();
                ComposerKt.removeRange(this.invalidations, currentGroup, currentEnd);
                this.reader.skipToGroupEnd();
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("No nodes can be emitted before calling dactivateToEndGroup".toString());
        throw new y();
    }

    @Override // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void disableSourceInformation() {
        this.sourceInformationEnabled = false;
    }

    public final void dispose$runtime_release() {
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.unregisterComposer$runtime_release(this);
            deactivate$runtime_release();
            getApplier().clear();
            this.isDisposed = true;
            r2 r2Var = r2.f19517a;
            trace.endSection(beginSection);
        } catch (Throwable th) {
            Trace.INSTANCE.endSection(beginSection);
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void enableReusing() {
        this.reusing = this.reusingGroup >= 0;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endDefaults() {
        endGroup();
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null && currentRecomposeScope$runtime_release.getUsed()) {
            currentRecomposeScope$runtime_release.setDefaultsInScope(true);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endMovableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void endNode() {
        end(true);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void endProvider() {
        boolean asBool;
        endGroup();
        endGroup();
        asBool = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providersInvalid = asBool;
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void endProviders() {
        boolean asBool;
        endGroup();
        endGroup();
        asBool = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providersInvalid = asBool;
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @m
    public ScopeUpdateScope endRestartGroup() {
        RecomposeScopeImpl recomposeScopeImpl;
        Anchor anchor;
        v3.l<Composition, r2> end;
        RecomposeScopeImpl recomposeScopeImpl2 = null;
        if (this.invalidateStack.isNotEmpty()) {
            recomposeScopeImpl = this.invalidateStack.pop();
        } else {
            recomposeScopeImpl = null;
        }
        if (recomposeScopeImpl != null) {
            recomposeScopeImpl.setRequiresRecompose(false);
        }
        if (recomposeScopeImpl != null && (end = recomposeScopeImpl.end(this.compositionToken)) != null) {
            this.changeListWriter.endCompositionScope(end, getComposition());
        }
        if (recomposeScopeImpl != null && !recomposeScopeImpl.getSkipped$runtime_release() && (recomposeScopeImpl.getUsed() || this.forceRecomposeScopes)) {
            if (recomposeScopeImpl.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                recomposeScopeImpl.setAnchor(anchor);
            }
            recomposeScopeImpl.setDefaultsInvalid(false);
            recomposeScopeImpl2 = recomposeScopeImpl;
        }
        end(false);
        return recomposeScopeImpl2;
    }

    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        end(false);
    }

    public final void endReuseFromRoot() {
        boolean z4;
        if (!this.isComposing && this.reusingGroup == 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.reusingGroup = -1;
            this.reusing = false;
            return;
        }
        throw new IllegalArgumentException("Cannot disable reuse from root if it was caused by other groups".toString());
    }

    @Override // androidx.compose.runtime.Composer
    public void endToMarker(int i5) {
        if (i5 < 0) {
            int i6 = -i5;
            SlotWriter slotWriter = this.writer;
            while (true) {
                int parent = slotWriter.getParent();
                if (parent > i6) {
                    end(slotWriter.isNode(parent));
                } else {
                    return;
                }
            }
        } else {
            if (getInserting()) {
                SlotWriter slotWriter2 = this.writer;
                while (getInserting()) {
                    end(slotWriter2.isNode(slotWriter2.getParent()));
                }
            }
            SlotReader slotReader = this.reader;
            while (true) {
                int parent2 = slotReader.getParent();
                if (parent2 > i5) {
                    end(slotReader.isNode(parent2));
                } else {
                    return;
                }
            }
        }
    }

    public final boolean forceRecomposeScopes$runtime_release() {
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = true;
            this.forciblyRecompose = true;
            return true;
        }
        return false;
    }

    @Override // androidx.compose.runtime.Composer
    @l
    public Applier<?> getApplier() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.Composer
    @l
    @p4.p
    public g getApplyCoroutineContext() {
        return this.parentContext.getEffectCoroutineContext();
    }

    public final boolean getAreChildrenComposing$runtime_release() {
        return this.childrenComposing > 0;
    }

    public final int getChangeCount$runtime_release() {
        return this.changes.getSize();
    }

    @Override // androidx.compose.runtime.Composer
    @l
    public ControlledComposition getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.runtime.Composer
    @l
    public CompositionData getCompositionData() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    @Override // androidx.compose.runtime.Composer
    @l
    public CompositionLocalMap getCurrentCompositionLocalMap() {
        return currentCompositionLocalScope();
    }

    @Override // androidx.compose.runtime.Composer
    public int getCurrentMarker() {
        return getInserting() ? -this.writer.getParent() : this.reader.getParent();
    }

    @m
    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime_release() {
        Stack<RecomposeScopeImpl> stack = this.invalidateStack;
        if (this.childrenComposing == 0 && stack.isNotEmpty()) {
            return stack.peek();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        if (!getSkipping() || this.providersInvalid) {
            return true;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        return currentRecomposeScope$runtime_release != null && currentRecomposeScope$runtime_release.getDefaultsInvalid();
    }

    @m
    public final ChangeList getDeferredChanges$runtime_release() {
        return this.deferredChanges;
    }

    public final boolean getHasInvalidations() {
        return !this.invalidations.isEmpty();
    }

    public final boolean getHasPendingChanges$runtime_release() {
        return this.changes.isNotEmpty();
    }

    @l
    public final SlotTable getInsertTable$runtime_release() {
        return this.insertTable;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    @l
    public final SlotReader getReader$runtime_release() {
        return this.reader;
    }

    @Override // androidx.compose.runtime.Composer
    @m
    public RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime_release();
    }

    @Override // androidx.compose.runtime.Composer
    @m
    public Object getRecomposeScopeIdentity() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            return currentRecomposeScope$runtime_release.getAnchor();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        boolean z4;
        if (getInserting() || this.reusing || this.providersInvalid) {
            return false;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null && !currentRecomposeScope$runtime_release.getRequiresRecompose()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 || this.forciblyRecompose) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContent(@l MovableContent<?> movableContent, @m Object obj) {
        l0.n(movableContent, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        invokeMovableContentLambda(movableContent, currentCompositionLocalScope(), obj, false);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContentReferences(@l List<u0<MovableContentStateReference, MovableContentStateReference>> list) {
        try {
            insertMovableContentGuarded(list);
            cleanUpCompose();
        } catch (Throwable th) {
            abortRoot();
            throw th;
        }
    }

    public final boolean isComposing$runtime_release() {
        return this.isComposing;
    }

    public final boolean isDisposed$runtime_release() {
        return this.isDisposed;
    }

    @Override // androidx.compose.runtime.Composer
    @l
    @ComposeCompilerApi
    public Object joinKey(@m Object obj, @m Object obj2) {
        Object key;
        key = ComposerKt.getKey(this.reader.getGroupObjectKey(), obj, obj2);
        return key == null ? new JoinedKey(obj, obj2) : key;
    }

    @a1
    @m
    public final Object nextSlot() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.Companion.getEmpty();
        }
        Object next = this.reader.next();
        if (this.reusing && !(next instanceof ReusableRememberObserver)) {
            return Composer.Companion.getEmpty();
        }
        return next;
    }

    @a1
    @m
    public final Object nextSlotForCache() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.Companion.getEmpty();
        }
        Object next = this.reader.next();
        if (this.reusing && !(next instanceof ReusableRememberObserver)) {
            return Composer.Companion.getEmpty();
        }
        if (next instanceof RememberObserverHolder) {
            return ((RememberObserverHolder) next).getWrapped();
        }
        return next;
    }

    @p4.p
    public final int parentKey$runtime_release() {
        if (getInserting()) {
            SlotWriter slotWriter = this.writer;
            return slotWriter.groupKey(slotWriter.getParent());
        }
        SlotReader slotReader = this.reader;
        return slotReader.groupKey(slotReader.getParent());
    }

    public final void prepareCompose$runtime_release(@l v3.a<r2> aVar) {
        if (!this.isComposing) {
            this.isComposing = true;
            try {
                aVar.invoke();
                return;
            } finally {
                this.isComposing = false;
            }
        }
        ComposerKt.composeRuntimeError("Preparing a composition while composing is not supported".toString());
        throw new y();
    }

    public final boolean recompose$runtime_release(@l IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap) {
        if (this.changes.isEmpty()) {
            if (!identityArrayMap.isNotEmpty() && !(!this.invalidations.isEmpty()) && !this.forciblyRecompose) {
                return false;
            }
            doCompose(identityArrayMap, null);
            return this.changes.isNotEmpty();
        }
        ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
        throw new y();
    }

    @Override // androidx.compose.runtime.Composer
    public void recordSideEffect(@l v3.a<r2> aVar) {
        this.changeListWriter.sideEffect(aVar);
    }

    @Override // androidx.compose.runtime.Composer
    public void recordUsed(@l RecomposeScope recomposeScope) {
        RecomposeScopeImpl recomposeScopeImpl = recomposeScope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) recomposeScope : null;
        if (recomposeScopeImpl == null) {
            return;
        }
        recomposeScopeImpl.setUsed(true);
    }

    @Override // androidx.compose.runtime.Composer
    @m
    public Object rememberedValue() {
        return nextSlotForCache();
    }

    public final void setDeferredChanges$runtime_release(@m ChangeList changeList) {
        this.deferredChanges = changeList;
    }

    public final void setInsertTable$runtime_release(@l SlotTable slotTable) {
        this.insertTable = slotTable;
    }

    public final void setReader$runtime_release(@l SlotReader slotReader) {
        this.reader = slotReader;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipCurrentGroup() {
        if (this.invalidations.isEmpty()) {
            skipGroup();
            return;
        }
        SlotReader slotReader = this.reader;
        int groupKey = slotReader.getGroupKey();
        Object groupObjectKey = slotReader.getGroupObjectKey();
        Object groupAux = slotReader.getGroupAux();
        updateCompoundKeyWhenWeEnterGroup(groupKey, groupObjectKey, groupAux);
        startReaderGroup(slotReader.isNode(), null);
        recomposeToGroupEnd();
        slotReader.endGroup();
        updateCompoundKeyWhenWeExitGroup(groupKey, groupObjectKey, groupAux);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipToGroupEnd() {
        boolean z4;
        if (this.groupNodeCount == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
            if (currentRecomposeScope$runtime_release != null) {
                currentRecomposeScope$runtime_release.scopeSkipped();
            }
            if (this.invalidations.isEmpty()) {
                skipReaderToGroupEnd();
                return;
            } else {
                recomposeToGroupEnd();
                return;
            }
        }
        ComposerKt.composeRuntimeError("No nodes can be emitted before calling skipAndEndGroup".toString());
        throw new y();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformation(@l String str) {
        if (getInserting() && this.sourceInformationEnabled) {
            this.writer.recordGroupSourceInformation(str);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerEnd() {
        if (getInserting() && this.sourceInformationEnabled) {
            this.writer.recordGrouplessCallSourceInformationEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerStart(int i5, @l String str) {
        if (getInserting() && this.sourceInformationEnabled) {
            this.writer.recordGrouplessCallSourceInformationStart(i5, str);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startDefaults() {
        m3242startBaiHCIY(-127, null, GroupKind.Companion.m3252getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startMovableGroup(int i5, @m Object obj) {
        m3242startBaiHCIY(i5, obj, GroupKind.Companion.m3252getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void startNode() {
        m3242startBaiHCIY(125, null, GroupKind.Companion.m3253getNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void startProvider(@l ProvidedValue<?> providedValue) {
        State<? extends Object> state;
        PersistentCompositionLocalMap putValue;
        int asInt;
        PersistentCompositionLocalMap currentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(201, ComposerKt.getProvider());
        Object rememberedValue = rememberedValue();
        if (l0.g(rememberedValue, Composer.Companion.getEmpty())) {
            state = null;
        } else {
            l0.n(rememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.Any?>");
            state = (State) rememberedValue;
        }
        CompositionLocal<?> compositionLocal = providedValue.getCompositionLocal();
        l0.n(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        State<?> updatedStateOf$runtime_release = compositionLocal.updatedStateOf$runtime_release(providedValue.getValue(), state);
        boolean z4 = true;
        boolean z5 = !l0.g(updatedStateOf$runtime_release, state);
        if (z5) {
            updateRememberedValue(updatedStateOf$runtime_release);
        }
        boolean z6 = false;
        if (getInserting()) {
            putValue = currentCompositionLocalScope.putValue(compositionLocal, updatedStateOf$runtime_release);
            this.writerHasAProvider = true;
        } else {
            SlotReader slotReader = this.reader;
            Object groupAux = slotReader.groupAux(slotReader.getCurrentGroup());
            l0.n(groupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) groupAux;
            if ((getSkipping() && !z5) || (!providedValue.getCanOverride() && CompositionLocalMapKt.contains(currentCompositionLocalScope, compositionLocal))) {
                putValue = persistentCompositionLocalMap;
            } else {
                putValue = currentCompositionLocalScope.putValue(compositionLocal, updatedStateOf$runtime_release);
            }
            if (!this.reusing && persistentCompositionLocalMap == putValue) {
                z4 = false;
            }
            z6 = z4;
        }
        if (z6 && !getInserting()) {
            recordProviderUpdate(putValue);
        }
        IntStack intStack = this.providersInvalidStack;
        asInt = ComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = z6;
        this.providerCache = putValue;
        m3242startBaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m3252getGroupULZAiWs(), putValue);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void startProviders(@l ProvidedValue<?>[] providedValueArr) {
        PersistentCompositionLocalMap updateProviderMapGroup;
        int asInt;
        PersistentCompositionLocalMap currentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(201, ComposerKt.getProvider());
        boolean z4 = true;
        boolean z5 = false;
        if (getInserting()) {
            updateProviderMapGroup = updateProviderMapGroup(currentCompositionLocalScope, CompositionLocalMapKt.updateCompositionMap$default(providedValueArr, currentCompositionLocalScope, null, 4, null));
            this.writerHasAProvider = true;
        } else {
            Object groupGet = this.reader.groupGet(0);
            l0.n(groupGet, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) groupGet;
            Object groupGet2 = this.reader.groupGet(1);
            l0.n(groupGet2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) groupGet2;
            PersistentCompositionLocalMap updateCompositionMap = CompositionLocalMapKt.updateCompositionMap(providedValueArr, currentCompositionLocalScope, persistentCompositionLocalMap2);
            if (getSkipping() && !this.reusing && l0.g(persistentCompositionLocalMap2, updateCompositionMap)) {
                skipGroup();
                updateProviderMapGroup = persistentCompositionLocalMap;
            } else {
                updateProviderMapGroup = updateProviderMapGroup(currentCompositionLocalScope, updateCompositionMap);
                if (!this.reusing && l0.g(updateProviderMapGroup, persistentCompositionLocalMap)) {
                    z4 = false;
                }
                z5 = z4;
            }
        }
        if (z5 && !getInserting()) {
            recordProviderUpdate(updateProviderMapGroup);
        }
        IntStack intStack = this.providersInvalidStack;
        asInt = ComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = z5;
        this.providerCache = updateProviderMapGroup;
        m3242startBaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m3252getGroupULZAiWs(), updateProviderMapGroup);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceableGroup(int i5) {
        m3242startBaiHCIY(i5, null, GroupKind.Companion.m3252getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @l
    @ComposeCompilerApi
    public Composer startRestartGroup(int i5) {
        m3242startBaiHCIY(i5, null, GroupKind.Companion.m3252getGroupULZAiWs(), null);
        addRecomposeScope();
        return this;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int i5, @m Object obj) {
        if (!getInserting() && this.reader.getGroupKey() == i5 && !l0.g(this.reader.getGroupAux(), obj) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrentGroup();
            this.reusing = true;
        }
        m3242startBaiHCIY(i5, null, GroupKind.Companion.m3252getGroupULZAiWs(), obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() {
        m3242startBaiHCIY(125, null, GroupKind.Companion.m3254getReusableNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    public final void startReuseFromRoot() {
        this.reusingGroup = 100;
        this.reusing = true;
    }

    public final boolean tryImminentInvalidation$runtime_release(@l RecomposeScopeImpl recomposeScopeImpl, @m Object obj) {
        Anchor anchor = recomposeScopeImpl.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.reader.getTable$runtime_release());
        if (!this.isComposing || indexFor < this.reader.getCurrentGroup()) {
            return false;
        }
        ComposerKt.insertIfMissing(this.invalidations, indexFor, recomposeScopeImpl, obj);
        return true;
    }

    @a1
    public final void updateCachedValue(@m Object obj) {
        if (obj instanceof RememberObserver) {
            if (getInserting()) {
                this.changeListWriter.remember((RememberObserver) obj);
            }
            this.abandonSet.add(obj);
            obj = new RememberObserverHolder((RememberObserver) obj);
        }
        updateValue(obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(@m Object obj) {
        updateCachedValue(obj);
    }

    @a1
    public final void updateValue(@m Object obj) {
        if (getInserting()) {
            this.writer.update(obj);
        } else {
            this.changeListWriter.updateValue(obj, this.reader.getGroupSlotIndex() - 1);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void useNode() {
        validateNodeExpected();
        if (!getInserting()) {
            Object node = getNode(this.reader);
            this.changeListWriter.moveDown(node);
            if (this.reusing && (node instanceof ComposeNodeLifecycleCallback)) {
                this.changeListWriter.useNode(node);
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("useNode() called while inserting".toString());
        throw new y();
    }

    public final void verifyConsistent$runtime_release() {
        this.insertTable.verifyWellFormed();
    }

    private final void startGroup(int i5, Object obj) {
        m3242startBaiHCIY(i5, obj, GroupKind.Companion.m3252getGroupULZAiWs(), null);
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope(int i5) {
        PersistentCompositionLocalMap persistentCompositionLocalMap;
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.groupKey(parent) == 202 && l0.g(this.writer.groupObjectKey(parent), ComposerKt.getCompositionLocalMap())) {
                    Object groupAux = this.writer.groupAux(parent);
                    l0.n(groupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) groupAux;
                    this.providerCache = persistentCompositionLocalMap2;
                    return persistentCompositionLocalMap2;
                }
                parent = this.writer.parent(parent);
            }
        }
        if (this.reader.getSize() > 0) {
            while (i5 > 0) {
                if (this.reader.groupKey(i5) == 202 && l0.g(this.reader.groupObjectKey(i5), ComposerKt.getCompositionLocalMap())) {
                    IntMap<PersistentCompositionLocalMap> intMap = this.providerUpdates;
                    if (intMap == null || (persistentCompositionLocalMap = intMap.get(i5)) == null) {
                        Object groupAux2 = this.reader.groupAux(i5);
                        l0.n(groupAux2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        persistentCompositionLocalMap = (PersistentCompositionLocalMap) groupAux2;
                    }
                    this.providerCache = persistentCompositionLocalMap;
                    return persistentCompositionLocalMap;
                }
                i5 = this.reader.parent(i5);
            }
        }
        PersistentCompositionLocalMap persistentCompositionLocalMap3 = this.parentProvider;
        this.providerCache = persistentCompositionLocalMap3;
        return persistentCompositionLocalMap3;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(char c5) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Character) && c5 == ((Character) nextSlot).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(c5));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(byte b5) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Byte) && b5 == ((Number) nextSlot).byteValue()) {
            return false;
        }
        updateValue(Byte.valueOf(b5));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(short s5) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Short) && s5 == ((Number) nextSlot).shortValue()) {
            return false;
        }
        updateValue(Short.valueOf(s5));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(boolean z4) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Boolean) && z4 == ((Boolean) nextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(z4));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(float f5) {
        Object nextSlot = nextSlot();
        if (nextSlot instanceof Float) {
            if (f5 == ((Number) nextSlot).floatValue()) {
                return false;
            }
        }
        updateValue(Float.valueOf(f5));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(long j5) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Long) && j5 == ((Number) nextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(j5));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(double d5) {
        Object nextSlot = nextSlot();
        if (nextSlot instanceof Double) {
            if (d5 == ((Number) nextSlot).doubleValue()) {
                return false;
            }
        }
        updateValue(Double.valueOf(d5));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(int i5) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Integer) && i5 == ((Number) nextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(i5));
        return true;
    }
}
