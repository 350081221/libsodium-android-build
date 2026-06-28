package androidx.compose.foundation.lazy;

import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import v3.p;
import v3.r;
import v3.s;

@i0(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a«\u0001\u0010\u0003\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022%\b\n\u0010\t\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042%\b\n\u0010\n\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000423\b\u0004\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0086\b¢\u0006\u0004\b\u0003\u0010\u0011\u001a\u0084\u0001\u0010\u0003\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022%\b\n\u0010\t\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000423\b\u0004\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0087\b¢\u0006\u0004\b\u0003\u0010\u0012\u001aê\u0001\u0010\u0016\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022:\b\n\u0010\t\u001a4\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2:\b\u0006\u0010\n\u001a4\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000b2H\b\u0004\u0010\u0010\u001aB\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a®\u0001\u0010\u0016\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022:\b\n\u0010\t\u001a4\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2H\b\u0004\u0010\u0010\u001aB\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0087\b¢\u0006\u0004\b\u0016\u0010\u0018\u001a«\u0001\u0010\u0003\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192%\b\n\u0010\t\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042%\b\n\u0010\n\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000423\b\u0004\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0086\b¢\u0006\u0004\b\u0003\u0010\u001a\u001a\u0084\u0001\u0010\u0003\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192%\b\n\u0010\t\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000423\b\u0004\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0087\b¢\u0006\u0004\b\u0003\u0010\u001b\u001aê\u0001\u0010\u0016\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192:\b\n\u0010\t\u001a4\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2:\b\u0006\u0010\n\u001a4\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000b2H\b\u0004\u0010\u0010\u001aB\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0086\b¢\u0006\u0004\b\u0016\u0010\u001c\u001a®\u0001\u0010\u0016\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192:\b\n\u0010\t\u001a4\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2H\b\u0004\u0010\u0010\u001aB\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0087\b¢\u0006\u0004\b\u0016\u0010\u001d\u001ax\u0010.\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020$2\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b.\u0010/\u001ax\u00104\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020$2\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b4\u00105\u001an\u00104\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\b\b\u0002\u0010+\u001a\u00020*2\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b4\u00106\u001an\u0010.\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*2\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b.\u00107¨\u00068"}, d2 = {"T", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "items", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "item", "", DatabaseFileArchive.COLUMN_KEY, "contentType", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "itemContent", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lv3/l;Lv3/l;Lv3/r;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lv3/l;Lv3/r;)V", "", "index", "Lkotlin/Function3;", "itemsIndexed", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lv3/p;Lv3/p;Lv3/s;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lv3/p;Lv3/s;)V", "", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lv3/l;Lv3/l;Lv3/r;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lv3/l;Lv3/r;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lv3/p;Lv3/p;Lv3/s;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lv3/p;Lv3/s;)V", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "content", "LazyRow", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLv3/l;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "LazyColumn", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLv3/l;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lv3/l;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lv3/l;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,426:1\n139#1,12:427\n174#1,12:439\n209#1,12:451\n244#1,12:463\n154#2:475\n154#2:476\n154#2:477\n154#2:478\n*S KotlinDebug\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n157#1:427,12\n192#1:439,12\n227#1:451,12\n262#1:463,12\n296#1:475\n352#1:476\n380#1:477\n406#1:478\n*E\n"})
/* loaded from: classes.dex */
public final class LazyDslKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b7  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyColumn(@p4.m androidx.compose.ui.Modifier r29, @p4.m androidx.compose.foundation.lazy.LazyListState r30, @p4.m androidx.compose.foundation.layout.PaddingValues r31, boolean r32, @p4.m androidx.compose.foundation.layout.Arrangement.Vertical r33, @p4.m androidx.compose.ui.Alignment.Horizontal r34, @p4.m androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, @p4.l v3.l<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.r2> r37, @p4.m androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, v3.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b6  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyRow(@p4.m androidx.compose.ui.Modifier r29, @p4.m androidx.compose.foundation.lazy.LazyListState r30, @p4.m androidx.compose.foundation.layout.PaddingValues r31, boolean r32, @p4.m androidx.compose.foundation.layout.Arrangement.Horizontal r33, @p4.m androidx.compose.ui.Alignment.Vertical r34, @p4.m androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, @p4.l v3.l<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.r2> r37, @p4.m androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, v3.l, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@l LazyListScope lazyListScope, @l List<? extends T> list, @m v3.l<? super T, ? extends Object> lVar, @l v3.l<? super T, ? extends Object> lVar2, @l r<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, r2> rVar) {
        lazyListScope.items(list.size(), lVar != null ? new LazyDslKt$items$2(lVar, list) : null, new LazyDslKt$items$3(lVar2, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(rVar, list)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, v3.l lVar, v3.l lVar2, r rVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            lVar = null;
        }
        if ((i5 & 4) != 0) {
            lVar2 = LazyDslKt$items$1.INSTANCE;
        }
        lazyListScope.items(list.size(), lVar != null ? new LazyDslKt$items$2(lVar, list) : null, new LazyDslKt$items$3(lVar2, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(rVar, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@l LazyListScope lazyListScope, @l List<? extends T> list, @m p<? super Integer, ? super T, ? extends Object> pVar, @l p<? super Integer, ? super T, ? extends Object> pVar2, @l s<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, r2> sVar) {
        lazyListScope.items(list.size(), pVar != null ? new LazyDslKt$itemsIndexed$2(pVar, list) : null, new LazyDslKt$itemsIndexed$3(pVar2, list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(sVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, p pVar, p pVar2, s sVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            pVar = null;
        }
        if ((i5 & 4) != 0) {
            pVar2 = LazyDslKt$itemsIndexed$1.INSTANCE;
        }
        lazyListScope.items(list.size(), pVar != null ? new LazyDslKt$itemsIndexed$2(pVar, list) : null, new LazyDslKt$itemsIndexed$3(pVar2, list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(sVar, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@l LazyListScope lazyListScope, @l T[] tArr, @m v3.l<? super T, ? extends Object> lVar, @l v3.l<? super T, ? extends Object> lVar2, @l r<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, r2> rVar) {
        lazyListScope.items(tArr.length, lVar != null ? new LazyDslKt$items$6(lVar, tArr) : null, new LazyDslKt$items$7(lVar2, tArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(rVar, tArr)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@l LazyListScope lazyListScope, @l T[] tArr, @m p<? super Integer, ? super T, ? extends Object> pVar, @l p<? super Integer, ? super T, ? extends Object> pVar2, @l s<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, r2> sVar) {
        lazyListScope.items(tArr.length, pVar != null ? new LazyDslKt$itemsIndexed$6(pVar, tArr) : null, new LazyDslKt$itemsIndexed$7(pVar2, tArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(sVar, tArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, v3.l lVar, v3.l lVar2, r rVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            lVar = null;
        }
        if ((i5 & 4) != 0) {
            lVar2 = LazyDslKt$items$5.INSTANCE;
        }
        lazyListScope.items(objArr.length, lVar != null ? new LazyDslKt$items$6(lVar, objArr) : null, new LazyDslKt$items$7(lVar2, objArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(rVar, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, p pVar, p pVar2, s sVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            pVar = null;
        }
        if ((i5 & 4) != 0) {
            pVar2 = LazyDslKt$itemsIndexed$5.INSTANCE;
        }
        lazyListScope.items(objArr.length, pVar != null ? new LazyDslKt$itemsIndexed$6(pVar, objArr) : null, new LazyDslKt$itemsIndexed$7(pVar2, objArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(sVar, objArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, v3.l lVar, r rVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            lVar = null;
        }
        lazyListScope.items(list.size(), lVar != null ? new LazyDslKt$items$2(lVar, list) : null, new LazyDslKt$items$3(LazyDslKt$items$1.INSTANCE, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(rVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, p pVar, s sVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            pVar = null;
        }
        lazyListScope.items(list.size(), pVar != null ? new LazyDslKt$itemsIndexed$2(pVar, list) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(sVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, p pVar, s sVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            pVar = null;
        }
        lazyListScope.items(objArr.length, pVar != null ? new LazyDslKt$itemsIndexed$6(pVar, objArr) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(objArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(sVar, objArr)));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00e1  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyColumn(androidx.compose.ui.Modifier r23, androidx.compose.foundation.lazy.LazyListState r24, androidx.compose.foundation.layout.PaddingValues r25, boolean r26, androidx.compose.foundation.layout.Arrangement.Vertical r27, androidx.compose.ui.Alignment.Horizontal r28, androidx.compose.foundation.gestures.FlingBehavior r29, v3.l r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, v3.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00e1  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyRow(androidx.compose.ui.Modifier r23, androidx.compose.foundation.lazy.LazyListState r24, androidx.compose.foundation.layout.PaddingValues r25, boolean r26, androidx.compose.foundation.layout.Arrangement.Horizontal r27, androidx.compose.ui.Alignment.Vertical r28, androidx.compose.foundation.gestures.FlingBehavior r29, v3.l r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, v3.l, androidx.compose.runtime.Composer, int, int):void");
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, v3.l lVar, r rVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            lVar = null;
        }
        lazyListScope.items(objArr.length, lVar != null ? new LazyDslKt$items$6(lVar, objArr) : null, new LazyDslKt$items$7(LazyDslKt$items$5.INSTANCE, objArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(rVar, objArr)));
    }
}
