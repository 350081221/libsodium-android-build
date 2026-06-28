package kotlin.time;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import kotlin.a1;
import kotlin.b1;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.ranges.u;
import kotlin.text.f0;
import kotlin.v2;

@g1(version = "1.6")
@u3.f
@v2(markerClass = {l.class})
@i0(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087@\u0018\u0000 ¦\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002¦\u0001B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u0003H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u001b\u0010I\u001a\u00020\t2\u0006\u0010J\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u001e\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u001e\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010QJ\u001b\u0010M\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u001a\u0010T\u001a\u00020U2\b\u0010J\u001a\u0004\u0018\u00010VHÖ\u0003¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bZ\u0010\rJ\r\u0010[\u001a\u00020U¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020UH\u0002¢\u0006\u0004\b_\u0010]J\u000f\u0010`\u001a\u00020UH\u0002¢\u0006\u0004\ba\u0010]J\r\u0010b\u001a\u00020U¢\u0006\u0004\bc\u0010]J\r\u0010d\u001a\u00020U¢\u0006\u0004\be\u0010]J\r\u0010f\u001a\u00020U¢\u0006\u0004\bg\u0010]J\u001b\u0010h\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bi\u0010jJ\u001b\u0010k\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bl\u0010jJ\u001e\u0010m\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bn\u0010PJ\u001e\u0010m\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bn\u0010QJ\u009d\u0001\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2u\u0010q\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(u\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0rH\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010{J\u0088\u0001\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2`\u0010q\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0|H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010}Js\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2K\u0010q\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0~H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010\u007fJ`\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p27\u0010q\u001a3\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0\u0080\u0001H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0005\bz\u0010\u0081\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u000f2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0019\u0010\u0086\u0001\u001a\u00020\t2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00030\u008a\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0019\u0010\u008d\u0001\u001a\u00020\u00032\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0011\u0010\u0090\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0091\u0001\u0010\u0005J\u0011\u0010\u0092\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0093\u0001\u0010\u0005J\u0013\u0010\u0094\u0001\u001a\u00030\u008a\u0001H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u008c\u0001J%\u0010\u0094\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0083\u0001\u001a\u00020=2\t\b\u0002\u0010\u0096\u0001\u001a\u00020\t¢\u0006\u0006\b\u0095\u0001\u0010\u0097\u0001J!\u0010\u0098\u0001\u001a\u00020\u00002\u0007\u0010\u0083\u0001\u001a\u00020=H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0099\u0001\u0010\u008f\u0001J\u0018\u0010\u009a\u0001\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0005\b\u009b\u0001\u0010\u0005JK\u0010\u009c\u0001\u001a\u00030\u009d\u0001*\b0\u009e\u0001j\u0003`\u009f\u00012\u0007\u0010 \u0001\u001a\u00020\t2\u0007\u0010¡\u0001\u001a\u00020\t2\u0007\u0010¢\u0001\u001a\u00020\t2\b\u0010\u0083\u0001\u001a\u00030\u008a\u00012\u0007\u0010£\u0001\u001a\u00020UH\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001R\u0017\u0010\u0006\u001a\u00020\u00008Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\u0012R\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u0005R\u0011\u0010'\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010\u0005R\u0011\u0010)\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010\u0005R\u0011\u0010+\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010\u0005R\u0011\u0010-\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010\u0005R\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u0005R\u0011\u00101\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b2\u0010\u0005R\u001a\u00103\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b4\u0010\u000b\u001a\u0004\b5\u0010\rR\u001a\u00106\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b7\u0010\u000b\u001a\u0004\b8\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b:\u0010\u000b\u001a\u0004\b;\u0010\rR\u0014\u0010<\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0015\u0010@\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\rR\u0014\u0010B\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006§\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "absoluteValue", "getAbsoluteValue-UwyO8pc", "hoursComponent", "", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "(J)I", "inDays", "", "getInDays$annotations", "getInDays-impl", "(J)D", "inHours", "getInHours$annotations", "getInHours-impl", "inMicroseconds", "getInMicroseconds$annotations", "getInMicroseconds-impl", "inMilliseconds", "getInMilliseconds$annotations", "getInMilliseconds-impl", "inMinutes", "getInMinutes$annotations", "getInMinutes-impl", "inNanoseconds", "getInNanoseconds$annotations", "getInNanoseconds-impl", "inSeconds", "getInSeconds$annotations", "getInSeconds-impl", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "inWholeSeconds", "getInWholeSeconds-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unitDiscriminator", "getUnitDiscriminator-impl", t0.b.f22420d, "getValue-impl", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "compareTo", "other", "compareTo-LRDsOJo", "(JJ)I", "div", "scale", "div-UwyO8pc", "(JD)J", "(JI)J", "div-LRDsOJo", "(JJ)D", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "isFinite", "isFinite-impl", "(J)Z", "isInMillis", "isInMillis-impl", "isInNanos", "isInNanos-impl", "isInfinite", "isInfinite-impl", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "minus", "minus-LRDsOJo", "(JJ)J", "plus", "plus-LRDsOJo", "times", "times-UwyO8pc", "toComponents", "T", "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toDouble", "unit", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "toIsoString", "", "toIsoString-impl", "(J)Ljava/lang/String;", "toLong", "toLong-impl", "(JLkotlin/time/DurationUnit;)J", "toLongMilliseconds", "toLongMilliseconds-impl", "toLongNanoseconds", "toLongNanoseconds-impl", "toString", "toString-impl", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "truncateTo", "truncateTo-UwyO8pc$kotlin_stdlib", "unaryMinus", "unaryMinus-UwyO8pc", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1495:1\n38#1:1496\n38#1:1497\n38#1:1498\n38#1:1499\n38#1:1500\n683#1,2:1501\n700#1,2:1510\n163#2,6:1503\n1#3:1509\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n39#1:1496\n40#1:1497\n458#1:1498\n478#1:1499\n662#1:1500\n979#1:1501,2\n1070#1:1510,2\n1021#1:1503,6\n*E\n"})
/* loaded from: classes4.dex */
public final class e implements Comparable<e> {

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    public static final a f19812b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f19813c = m(0);

    /* renamed from: d, reason: collision with root package name */
    private static final long f19814d = g.b(g.f19821c);

    /* renamed from: e, reason: collision with root package name */
    private static final long f19815e = g.b(-4611686018427387903L);

    /* renamed from: a, reason: collision with root package name */
    private final long f19816a;

    @i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0007J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0011J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0014J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0011J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0011J\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0014J\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0017J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0011J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0014J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0017J\u001d\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0011J\u001d\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0014J\u001d\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0017J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0011J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0014J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0017J\u001b\u00105\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b:\u00108J\u001b\u0010;\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b<J\u001b\u0010=\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b>J\u001d\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0011J\u001d\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0014J\u001d\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0017R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R%\u0010\f\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R%\u0010\f\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R%\u0010\f\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R%\u0010\u0018\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R%\u0010\u0018\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0014R%\u0010\u0018\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017R%\u0010\u001b\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R%\u0010\u001b\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0014R%\u0010\u001b\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0017R%\u0010\u001e\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0011R%\u0010\u001e\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0014R%\u0010\u001e\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0017R%\u0010!\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0011R%\u0010!\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0014R%\u0010!\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0017R%\u0010$\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b%\u0010\u000f\u001a\u0004\b&\u0010\u0011R%\u0010$\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0014R%\u0010$\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0017R%\u0010'\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u0011R%\u0010'\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010\u0014R%\u0010'\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0017\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006@"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "()V", "INFINITE", "Lkotlin/time/Duration;", "getINFINITE-UwyO8pc", "()J", "J", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "ZERO", "getZERO-UwyO8pc", "days", "", "getDays-UwyO8pc$annotations", "(D)V", "getDays-UwyO8pc", "(D)J", "", "(I)V", "(I)J", "", "(J)V", "(J)J", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "nanoseconds", "getNanoseconds-UwyO8pc$annotations", "getNanoseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "convert", t0.b.f22420d, "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "days-UwyO8pc", "hours-UwyO8pc", "microseconds-UwyO8pc", "milliseconds-UwyO8pc", "minutes-UwyO8pc", "nanoseconds-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "parseOrNull", "parseOrNull-FghU774", "seconds-UwyO8pc", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @kotlin.internal.f
        public static /* synthetic */ void A(double d5) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void B(int i5) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void C(long j5) {
        }

        private final long D(double d5) {
            return g.l0(d5, h.MINUTES);
        }

        private final long E(int i5) {
            return g.m0(i5, h.MINUTES);
        }

        private final long F(long j5) {
            return g.n0(j5, h.MINUTES);
        }

        @kotlin.internal.f
        public static /* synthetic */ void G(double d5) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void H(int i5) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void I(long j5) {
        }

        private final long K(double d5) {
            return g.l0(d5, h.NANOSECONDS);
        }

        private final long L(int i5) {
            return g.m0(i5, h.NANOSECONDS);
        }

        private final long M(long j5) {
            return g.n0(j5, h.NANOSECONDS);
        }

        @kotlin.internal.f
        public static /* synthetic */ void N(double d5) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void O(int i5) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void P(long j5) {
        }

        private final long Q(double d5) {
            return g.l0(d5, h.SECONDS);
        }

        private final long R(int i5) {
            return g.m0(i5, h.SECONDS);
        }

        private final long S(long j5) {
            return g.n0(j5, h.SECONDS);
        }

        @kotlin.internal.f
        public static /* synthetic */ void T(double d5) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void U(int i5) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void V(long j5) {
        }

        private final long e(double d5) {
            return g.l0(d5, h.DAYS);
        }

        private final long f(int i5) {
            return g.m0(i5, h.DAYS);
        }

        private final long g(long j5) {
            return g.n0(j5, h.DAYS);
        }

        @kotlin.internal.f
        public static /* synthetic */ void h(double d5) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void i(int i5) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void j(long j5) {
        }

        private final long k(double d5) {
            return g.l0(d5, h.HOURS);
        }

        private final long l(int i5) {
            return g.m0(i5, h.HOURS);
        }

        private final long m(long j5) {
            return g.n0(j5, h.HOURS);
        }

        @kotlin.internal.f
        public static /* synthetic */ void n(double d5) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void o(int i5) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void p(long j5) {
        }

        private final long r(double d5) {
            return g.l0(d5, h.MICROSECONDS);
        }

        private final long s(int i5) {
            return g.m0(i5, h.MICROSECONDS);
        }

        private final long t(long j5) {
            return g.n0(j5, h.MICROSECONDS);
        }

        @kotlin.internal.f
        public static /* synthetic */ void u(double d5) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void v(int i5) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void w(long j5) {
        }

        private final long x(double d5) {
            return g.l0(d5, h.MILLISECONDS);
        }

        private final long y(int i5) {
            return g.m0(i5, h.MILLISECONDS);
        }

        private final long z(long j5) {
            return g.n0(j5, h.MILLISECONDS);
        }

        public final long J() {
            return e.f19815e;
        }

        public final long W() {
            return e.f19813c;
        }

        @g1(version = "1.5")
        @kotlin.k(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final /* synthetic */ long X(double d5) {
            return g.l0(d5, h.HOURS);
        }

        @g1(version = "1.5")
        @kotlin.k(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final /* synthetic */ long Y(int i5) {
            return g.m0(i5, h.HOURS);
        }

        @g1(version = "1.5")
        @kotlin.k(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final /* synthetic */ long Z(long j5) {
            return g.n0(j5, h.HOURS);
        }

        @l
        public final double a(double d5, @p4.l h sourceUnit, @p4.l h targetUnit) {
            l0.p(sourceUnit, "sourceUnit");
            l0.p(targetUnit, "targetUnit");
            return j.a(d5, sourceUnit, targetUnit);
        }

        @g1(version = "1.5")
        @kotlin.k(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final /* synthetic */ long a0(double d5) {
            return g.l0(d5, h.MICROSECONDS);
        }

        @g1(version = "1.5")
        @kotlin.k(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final /* synthetic */ long b(double d5) {
            return g.l0(d5, h.DAYS);
        }

        @g1(version = "1.5")
        @kotlin.k(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final /* synthetic */ long b0(int i5) {
            return g.m0(i5, h.MICROSECONDS);
        }

        @g1(version = "1.5")
        @kotlin.k(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final /* synthetic */ long c(int i5) {
            return g.m0(i5, h.DAYS);
        }

        @g1(version = "1.5")
        @kotlin.k(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final /* synthetic */ long c0(long j5) {
            return g.n0(j5, h.MICROSECONDS);
        }

        @g1(version = "1.5")
        @kotlin.k(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final /* synthetic */ long d(long j5) {
            return g.n0(j5, h.DAYS);
        }

        @g1(version = "1.5")
        @kotlin.k(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final /* synthetic */ long d0(double d5) {
            return g.l0(d5, h.MILLISECONDS);
        }

        @g1(version = "1.5")
        @kotlin.k(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final /* synthetic */ long e0(int i5) {
            return g.m0(i5, h.MILLISECONDS);
        }

        @g1(version = "1.5")
        @kotlin.k(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final /* synthetic */ long f0(long j5) {
            return g.n0(j5, h.MILLISECONDS);
        }

        @g1(version = "1.5")
        @kotlin.k(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final /* synthetic */ long g0(double d5) {
            return g.l0(d5, h.MINUTES);
        }

        @g1(version = "1.5")
        @kotlin.k(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final /* synthetic */ long h0(int i5) {
            return g.m0(i5, h.MINUTES);
        }

        @g1(version = "1.5")
        @kotlin.k(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final /* synthetic */ long i0(long j5) {
            return g.n0(j5, h.MINUTES);
        }

        @g1(version = "1.5")
        @kotlin.k(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final /* synthetic */ long j0(double d5) {
            return g.l0(d5, h.NANOSECONDS);
        }

        @g1(version = "1.5")
        @kotlin.k(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final /* synthetic */ long k0(int i5) {
            return g.m0(i5, h.NANOSECONDS);
        }

        @g1(version = "1.5")
        @kotlin.k(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final /* synthetic */ long l0(long j5) {
            return g.n0(j5, h.NANOSECONDS);
        }

        public final long m0(@p4.l String value) {
            l0.p(value, "value");
            try {
                return g.h(value, false);
            } catch (IllegalArgumentException e5) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e5);
            }
        }

        public final long n0(@p4.l String value) {
            l0.p(value, "value");
            try {
                return g.h(value, true);
            } catch (IllegalArgumentException e5) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e5);
            }
        }

        @p4.m
        public final e o0(@p4.l String value) {
            l0.p(value, "value");
            try {
                return e.j(g.h(value, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @p4.m
        public final e p0(@p4.l String value) {
            l0.p(value, "value");
            try {
                return e.j(g.h(value, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final long q() {
            return e.f19814d;
        }

        @g1(version = "1.5")
        @kotlin.k(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final /* synthetic */ long q0(double d5) {
            return g.l0(d5, h.SECONDS);
        }

        @g1(version = "1.5")
        @kotlin.k(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final /* synthetic */ long r0(int i5) {
            return g.m0(i5, h.SECONDS);
        }

        @g1(version = "1.5")
        @kotlin.k(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final /* synthetic */ long s0(long j5) {
            return g.n0(j5, h.SECONDS);
        }
    }

    private /* synthetic */ e(long j5) {
        this.f19816a = j5;
    }

    @kotlin.k(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void B() {
    }

    @kotlin.k(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void D() {
    }

    @kotlin.k(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void F() {
    }

    @kotlin.k(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void H() {
    }

    public static final long J(long j5) {
        return r0(j5, h.DAYS);
    }

    public static final long K(long j5) {
        return r0(j5, h.HOURS);
    }

    public static final long L(long j5) {
        return r0(j5, h.MICROSECONDS);
    }

    public static final long M(long j5) {
        return (b0(j5) && a0(j5)) ? Y(j5) : r0(j5, h.MILLISECONDS);
    }

    public static final long N(long j5) {
        return r0(j5, h.MINUTES);
    }

    public static final long O(long j5) {
        long Y = Y(j5);
        if (!c0(j5)) {
            if (Y > 9223372036854L) {
                return Long.MAX_VALUE;
            }
            if (Y < -9223372036854L) {
                return Long.MIN_VALUE;
            }
            return g.f(Y);
        }
        return Y;
    }

    public static final long P(long j5) {
        return r0(j5, h.SECONDS);
    }

    @a1
    public static /* synthetic */ void Q() {
    }

    public static final int R(long j5) {
        if (d0(j5)) {
            return 0;
        }
        return (int) (N(j5) % 60);
    }

    @a1
    public static /* synthetic */ void S() {
    }

    public static final int T(long j5) {
        long Y;
        if (d0(j5)) {
            return 0;
        }
        if (b0(j5)) {
            Y = g.f(Y(j5) % 1000);
        } else {
            Y = Y(j5) % 1000000000;
        }
        return (int) Y;
    }

    @a1
    public static /* synthetic */ void U() {
    }

    public static final int V(long j5) {
        if (d0(j5)) {
            return 0;
        }
        return (int) (P(j5) % 60);
    }

    private static final h W(long j5) {
        return c0(j5) ? h.NANOSECONDS : h.MILLISECONDS;
    }

    private static final int X(long j5) {
        return ((int) j5) & 1;
    }

    private static final long Y(long j5) {
        return j5 >> 1;
    }

    public static int Z(long j5) {
        return Long.hashCode(j5);
    }

    public static final boolean a0(long j5) {
        return !d0(j5);
    }

    private static final boolean b0(long j5) {
        return (((int) j5) & 1) == 1;
    }

    private static final boolean c0(long j5) {
        return (((int) j5) & 1) == 0;
    }

    public static final boolean d0(long j5) {
        return j5 == f19814d || j5 == f19815e;
    }

    public static final boolean e0(long j5) {
        return j5 < 0;
    }

    public static final boolean f0(long j5) {
        return j5 > 0;
    }

    public static final long g0(long j5, long j6) {
        return h0(j5, y0(j6));
    }

    private static final long h(long j5, long j6, long j7) {
        long K;
        long g5 = g.g(j7);
        long j8 = j6 + g5;
        if (new kotlin.ranges.o(-4611686018426L, 4611686018426L).l(j8)) {
            return g.d(g.f(j8) + (j7 - g.f(g5)));
        }
        K = u.K(j8, -4611686018427387903L, g.f19821c);
        return g.b(K);
    }

    public static final long h0(long j5, long j6) {
        if (d0(j5)) {
            if (!a0(j6) && (j6 ^ j5) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j5;
        }
        if (d0(j6)) {
            return j6;
        }
        if ((((int) j5) & 1) == (((int) j6) & 1)) {
            long Y = Y(j5) + Y(j6);
            if (c0(j5)) {
                return g.e(Y);
            }
            return g.c(Y);
        }
        if (b0(j5)) {
            return h(j5, Y(j5), Y(j6));
        }
        return h(j5, Y(j6), Y(j5));
    }

    private static final void i(long j5, StringBuilder sb, int i5, int i6, int i7, String str, boolean z4) {
        String R3;
        boolean z5;
        sb.append(i5);
        if (i6 != 0) {
            sb.append(external.org.apache.commons.lang3.d.f15957a);
            R3 = f0.R3(String.valueOf(i6), i7, '0');
            int i8 = -1;
            int length = R3.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i9 = length - 1;
                    if (R3.charAt(length) != '0') {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        i8 = length;
                        break;
                    } else if (i9 < 0) {
                        break;
                    } else {
                        length = i9;
                    }
                }
            }
            int i10 = i8 + 1;
            if (!z4 && i10 < 3) {
                sb.append((CharSequence) R3, 0, i10);
                l0.o(sb, "this.append(value, startIndex, endIndex)");
            } else {
                sb.append((CharSequence) R3, 0, ((i10 + 2) / 3) * 3);
                l0.o(sb, "this.append(value, startIndex, endIndex)");
            }
        }
        sb.append(str);
    }

    public static final long i0(long j5, double d5) {
        int K0;
        boolean z4;
        K0 = kotlin.math.d.K0(d5);
        if (K0 == d5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return j0(j5, K0);
        }
        h W = W(j5);
        return g.l0(o0(j5, W) * d5, W);
    }

    public static final /* synthetic */ e j(long j5) {
        return new e(j5);
    }

    public static final long j0(long j5, int i5) {
        int V;
        int U;
        long L;
        int V2;
        int U2;
        long L2;
        if (d0(j5)) {
            if (i5 != 0) {
                if (i5 > 0) {
                    return j5;
                }
                return y0(j5);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i5 == 0) {
            return f19813c;
        }
        long Y = Y(j5);
        long j6 = i5;
        long j7 = Y * j6;
        if (c0(j5)) {
            if (new kotlin.ranges.o(-2147483647L, 2147483647L).l(Y)) {
                return g.d(j7);
            }
            if (j7 / j6 == Y) {
                return g.e(j7);
            }
            long g5 = g.g(Y);
            long j8 = g5 * j6;
            long g6 = g.g((Y - g.f(g5)) * j6) + j8;
            if (j8 / j6 == g5 && (g6 ^ j8) >= 0) {
                L2 = u.L(g6, new kotlin.ranges.o(-4611686018427387903L, g.f19821c));
                return g.b(L2);
            }
            V2 = kotlin.math.d.V(Y);
            U2 = kotlin.math.d.U(i5);
            if (V2 * U2 > 0) {
                return f19814d;
            }
            return f19815e;
        }
        if (j7 / j6 == Y) {
            L = u.L(j7, new kotlin.ranges.o(-4611686018427387903L, g.f19821c));
            return g.b(L);
        }
        V = kotlin.math.d.V(Y);
        U = kotlin.math.d.U(i5);
        if (V * U > 0) {
            return f19814d;
        }
        return f19815e;
    }

    public static final <T> T k0(long j5, @p4.l v3.p<? super Long, ? super Integer, ? extends T> action) {
        l0.p(action, "action");
        return action.invoke(Long.valueOf(P(j5)), Integer.valueOf(T(j5)));
    }

    public static int l(long j5, long j6) {
        long j7 = j5 ^ j6;
        if (j7 >= 0 && (((int) j7) & 1) != 0) {
            int i5 = (((int) j5) & 1) - (((int) j6) & 1);
            if (e0(j5)) {
                return -i5;
            }
            return i5;
        }
        return l0.u(j5, j6);
    }

    public static final <T> T l0(long j5, @p4.l v3.q<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        l0.p(action, "action");
        return action.invoke(Long.valueOf(N(j5)), Integer.valueOf(V(j5)), Integer.valueOf(T(j5)));
    }

    public static long m(long j5) {
        if (f.d()) {
            if (c0(j5)) {
                if (!new kotlin.ranges.o(-4611686018426999999L, g.f19820b).l(Y(j5))) {
                    throw new AssertionError(Y(j5) + " ns is out of nanoseconds range");
                }
            } else if (new kotlin.ranges.o(-4611686018427387903L, g.f19821c).l(Y(j5))) {
                if (new kotlin.ranges.o(-4611686018426L, 4611686018426L).l(Y(j5))) {
                    throw new AssertionError(Y(j5) + " ms is denormalized");
                }
            } else {
                throw new AssertionError(Y(j5) + " ms is out of milliseconds range");
            }
        }
        return j5;
    }

    public static final <T> T m0(long j5, @p4.l v3.r<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        l0.p(action, "action");
        return action.invoke(Long.valueOf(K(j5)), Integer.valueOf(R(j5)), Integer.valueOf(V(j5)), Integer.valueOf(T(j5)));
    }

    public static final double n(long j5, long j6) {
        Comparable X;
        X = kotlin.comparisons.h.X(W(j5), W(j6));
        h hVar = (h) X;
        return o0(j5, hVar) / o0(j6, hVar);
    }

    public static final <T> T n0(long j5, @p4.l v3.s<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        l0.p(action, "action");
        return action.invoke(Long.valueOf(J(j5)), Integer.valueOf(u(j5)), Integer.valueOf(R(j5)), Integer.valueOf(V(j5)), Integer.valueOf(T(j5)));
    }

    public static final long o(long j5, double d5) {
        int K0;
        boolean z4;
        K0 = kotlin.math.d.K0(d5);
        if (K0 == d5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && K0 != 0) {
            return p(j5, K0);
        }
        h W = W(j5);
        return g.l0(o0(j5, W) / d5, W);
    }

    public static final double o0(long j5, @p4.l h unit) {
        l0.p(unit, "unit");
        if (j5 == f19814d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j5 == f19815e) {
            return Double.NEGATIVE_INFINITY;
        }
        return j.a(Y(j5), W(j5), unit);
    }

    public static final long p(long j5, int i5) {
        int U;
        if (i5 == 0) {
            if (f0(j5)) {
                return f19814d;
            }
            if (e0(j5)) {
                return f19815e;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (c0(j5)) {
            return g.d(Y(j5) / i5);
        }
        if (d0(j5)) {
            U = kotlin.math.d.U(i5);
            return j0(j5, U);
        }
        long j6 = i5;
        long Y = Y(j5) / j6;
        if (new kotlin.ranges.o(-4611686018426L, 4611686018426L).l(Y)) {
            return g.d(g.f(Y) + (g.f(Y(j5) - (Y * j6)) / j6));
        }
        return g.b(Y);
    }

    public static final int p0(long j5, @p4.l h unit) {
        long K;
        l0.p(unit, "unit");
        K = u.K(r0(j5, unit), -2147483648L, 2147483647L);
        return (int) K;
    }

    public static boolean q(long j5, Object obj) {
        return (obj instanceof e) && j5 == ((e) obj).z0();
    }

    @p4.l
    public static final String q0(long j5) {
        boolean z4;
        boolean z5;
        StringBuilder sb = new StringBuilder();
        if (e0(j5)) {
            sb.append('-');
        }
        sb.append("PT");
        long s5 = s(j5);
        long K = K(s5);
        int R = R(s5);
        int V = V(s5);
        int T = T(s5);
        if (d0(j5)) {
            K = 9999999999999L;
        }
        boolean z6 = true;
        if (K != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (V == 0 && T == 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (R == 0 && (!z5 || !z4)) {
            z6 = false;
        }
        if (z4) {
            sb.append(K);
            sb.append('H');
        }
        if (z6) {
            sb.append(R);
            sb.append('M');
        }
        if (z5 || (!z4 && !z6)) {
            i(j5, sb, V, T, 9, "S", true);
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final boolean r(long j5, long j6) {
        return j5 == j6;
    }

    public static final long r0(long j5, @p4.l h unit) {
        l0.p(unit, "unit");
        if (j5 == f19814d) {
            return Long.MAX_VALUE;
        }
        if (j5 == f19815e) {
            return Long.MIN_VALUE;
        }
        return j.b(Y(j5), W(j5), unit);
    }

    public static final long s(long j5) {
        return e0(j5) ? y0(j5) : j5;
    }

    @a1
    public static /* synthetic */ void t() {
    }

    public static final int u(long j5) {
        if (d0(j5)) {
            return 0;
        }
        return (int) (K(j5) % 24);
    }

    @p4.l
    public static String u0(long j5) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (j5 == 0) {
            return "0s";
        }
        if (j5 == f19814d) {
            return "Infinity";
        }
        if (j5 == f19815e) {
            return "-Infinity";
        }
        boolean e02 = e0(j5);
        StringBuilder sb = new StringBuilder();
        if (e02) {
            sb.append('-');
        }
        long s5 = s(j5);
        long J = J(s5);
        int u4 = u(s5);
        int R = R(s5);
        int V = V(s5);
        int T = T(s5);
        int i5 = 0;
        if (J != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (u4 != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (R != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (V == 0 && T == 0) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (z4) {
            sb.append(J);
            sb.append('d');
            i5 = 1;
        }
        if (z5 || (z4 && (z6 || z7))) {
            int i6 = i5 + 1;
            if (i5 > 0) {
                sb.append(' ');
            }
            sb.append(u4);
            sb.append('h');
            i5 = i6;
        }
        if (z6 || (z7 && (z5 || z4))) {
            int i7 = i5 + 1;
            if (i5 > 0) {
                sb.append(' ');
            }
            sb.append(R);
            sb.append('m');
            i5 = i7;
        }
        if (z7) {
            int i8 = i5 + 1;
            if (i5 > 0) {
                sb.append(' ');
            }
            if (V == 0 && !z4 && !z5 && !z6) {
                if (T >= 1000000) {
                    i(j5, sb, T / 1000000, T % 1000000, 6, "ms", false);
                } else if (T >= 1000) {
                    i(j5, sb, T / 1000, T % 1000, 3, "us", false);
                } else {
                    sb.append(T);
                    sb.append("ns");
                }
            } else {
                i(j5, sb, V, T, 9, bi.aE, false);
            }
            i5 = i8;
        }
        if (e02 && i5 > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @kotlin.k(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void v() {
    }

    @p4.l
    public static final String v0(long j5, @p4.l h unit, int i5) {
        boolean z4;
        int B;
        l0.p(unit, "unit");
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            double o02 = o0(j5, unit);
            if (Double.isInfinite(o02)) {
                return String.valueOf(o02);
            }
            StringBuilder sb = new StringBuilder();
            B = u.B(i5, 12);
            sb.append(f.b(o02, B));
            sb.append(k.h(unit));
            return sb.toString();
        }
        throw new IllegalArgumentException(("decimals must be not negative, but was " + i5).toString());
    }

    public static /* synthetic */ String w0(long j5, h hVar, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return v0(j5, hVar, i5);
    }

    @kotlin.k(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void x() {
    }

    public static final long x0(long j5, @p4.l h unit) {
        l0.p(unit, "unit");
        h W = W(j5);
        if (unit.compareTo(W) > 0 && !d0(j5)) {
            return g.n0(Y(j5) - (Y(j5) % j.b(1L, unit, W)), W);
        }
        return j5;
    }

    public static final long y0(long j5) {
        return g.a(-Y(j5), ((int) j5) & 1);
    }

    @kotlin.k(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void z() {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(e eVar) {
        return k(eVar.z0());
    }

    public boolean equals(Object obj) {
        return q(this.f19816a, obj);
    }

    public int hashCode() {
        return Z(this.f19816a);
    }

    public int k(long j5) {
        return l(this.f19816a, j5);
    }

    @p4.l
    public String toString() {
        return u0(this.f19816a);
    }

    public final /* synthetic */ long z0() {
        return this.f19816a;
    }
}
