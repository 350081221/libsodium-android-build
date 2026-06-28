.class public final Lkotlinx/coroutines/scheduling/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/coroutines/scheduling/a$a;,
        Lkotlinx/coroutines/scheduling/a$b;,
        Lkotlinx/coroutines/scheduling/a$c;,
        Lkotlinx/coroutines/scheduling/a$d;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u00035$\u000fB+\u0012\u0006\u00107\u001a\u00020\n\u0012\u0006\u00108\u001a\u00020\n\u0012\u0008\u0008\u0002\u00109\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010;\u001a\u000202\u00a2\u0006\u0004\u0008Q\u0010RJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\u0008\u001a\u0008\u0018\u00010\u0007R\u00020\u0000H\u0002J\u0014\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007R\u00020\u0000H\u0002J\u0011\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0082\u0008J\u0011\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0082\u0008J\t\u0010\u0010\u001a\u00020\nH\u0082\u0008J\t\u0010\u0011\u001a\u00020\nH\u0082\u0008J\t\u0010\u0012\u001a\u00020\u000cH\u0082\u0008J\t\u0010\u0014\u001a\u00020\u0013H\u0082\u0008J\t\u0010\u0015\u001a\u00020\u0005H\u0082\u0008J\t\u0010\u0016\u001a\u00020\u000cH\u0082\u0008J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u0012\u0010\u001a\u001a\u00020\u00052\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u0002J\u0008\u0010\u001b\u001a\u00020\u0005H\u0002J\u0008\u0010\u001c\u001a\u00020\nH\u0002J$\u0010\u001e\u001a\u0004\u0018\u00010\u0003*\u0008\u0018\u00010\u0007R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\u000e\u0010\u001f\u001a\u0008\u0018\u00010\u0007R\u00020\u0000H\u0002J\"\u0010\"\u001a\u00020\u00132\n\u0010\t\u001a\u00060\u0007R\u00020\u00002\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\nJ\u0012\u0010#\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007R\u00020\u0000J\u0011\u0010$\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0086\u0008J\u0014\u0010(\u001a\u00020\u00132\n\u0010\'\u001a\u00060%j\u0002`&H\u0016J\u0008\u0010)\u001a\u00020\u0013H\u0016J\u000e\u0010+\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u000cJ&\u0010/\u001a\u00020\u00132\n\u0010,\u001a\u00060%j\u0002`&2\u0008\u0008\u0002\u0010.\u001a\u00020-2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u0005J\u001a\u00100\u001a\u00020\u00032\n\u0010,\u001a\u00060%j\u0002`&2\u0006\u0010.\u001a\u00020-J\u0006\u00101\u001a\u00020\u0013J\u0008\u00103\u001a\u000202H\u0016J\u000e\u00104\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003R\u0014\u00107\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u0014\u00108\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u00106R\u0014\u00109\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010\u0012R\u0014\u0010;\u001a\u0002028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010:R\u0014\u0010?\u001a\u00020<8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R\u0014\u0010A\u001a\u00020<8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010>R\u001e\u0010E\u001a\u000c\u0012\u0008\u0012\u00060\u0007R\u00020\u00000B8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010DR\u0015\u0010G\u001a\u00020\n8\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00086\u0010FR\u0015\u0010I\u001a\u00020\n8\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008H\u0010FR\u0011\u0010J\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008J\u0010KR\u000b\u0010M\u001a\u00020L8\u0002X\u0082\u0004R\u000b\u0010O\u001a\u00020N8\u0002X\u0082\u0004R\u000b\u0010P\u001a\u00020N8\u0002X\u0082\u0004\u00a8\u0006S"
    }
    d2 = {
        "Lkotlinx/coroutines/scheduling/a;",
        "Ljava/util/concurrent/Executor;",
        "Ljava/io/Closeable;",
        "Lkotlinx/coroutines/scheduling/k;",
        "task",
        "",
        "b",
        "Lkotlinx/coroutines/scheduling/a$c;",
        "a0",
        "worker",
        "",
        "P",
        "",
        "state",
        "m",
        "d",
        "M",
        "q",
        "J",
        "Lkotlin/r2;",
        "p",
        "D0",
        "i0",
        "stateSnapshot",
        "skipUnpark",
        "t0",
        "E0",
        "G0",
        "h",
        "tailDispatch",
        "C0",
        "o",
        "oldIndex",
        "newIndex",
        "f0",
        "b0",
        "c",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "command",
        "execute",
        "close",
        "timeout",
        "r0",
        "block",
        "Lkotlinx/coroutines/scheduling/l;",
        "taskContext",
        "y",
        "j",
        "A0",
        "",
        "toString",
        "p0",
        "a",
        "I",
        "corePoolSize",
        "maxPoolSize",
        "idleWorkerKeepAliveNs",
        "Ljava/lang/String;",
        "schedulerName",
        "Lkotlinx/coroutines/scheduling/f;",
        "e",
        "Lkotlinx/coroutines/scheduling/f;",
        "globalCpuQueue",
        "f",
        "globalBlockingQueue",
        "Lkotlinx/coroutines/internal/o0;",
        "g",
        "Lkotlinx/coroutines/internal/o0;",
        "workers",
        "()I",
        "createdWorkers",
        "H",
        "availableCpuPermits",
        "isTerminated",
        "()Z",
        "Lkotlinx/atomicfu/AtomicBoolean;",
        "_isTerminated",
        "Lkotlinx/atomicfu/AtomicLong;",
        "controlState",
        "parkedWorkersStack",
        "<init>",
        "(IIJLjava/lang/String;)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 7 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n1#1,1033:1\n285#1:1036\n283#1:1037\n283#1:1038\n285#1:1039\n280#1:1045\n281#1,5:1046\n291#1:1052\n283#1:1053\n284#1:1054\n283#1:1060\n284#1:1061\n280#1:1062\n288#1:1063\n283#1:1064\n283#1:1067\n284#1:1068\n285#1:1069\n90#2:1034\n90#2:1051\n1#3:1035\n28#4,4:1040\n28#4,4:1055\n20#5:1044\n20#5:1059\n87#6:1065\n610#7:1066\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n*L\n281#1:1036\n288#1:1037\n289#1:1038\n298#1:1039\n347#1:1045\n375#1:1046,5\n398#1:1052\n445#1:1053\n446#1:1054\n482#1:1060\n483#1:1061\n489#1:1062\n498#1:1063\n498#1:1064\n576#1:1067\n577#1:1068\n578#1:1069\n119#1:1034\n395#1:1051\n347#1:1040,4\n478#1:1055,4\n347#1:1044\n478#1:1059\n515#1:1065\n522#1:1066\n*E\n"
    }
.end annotation


# static fields
.field public static final h:Lkotlinx/coroutines/scheduling/a$a;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final k:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final l:Lkotlinx/coroutines/internal/t0;
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/e;
    .end annotation
.end field

.field private static final m:I = -0x1

.field private static final n:I = 0x0

.field private static final o:I = 0x1

.field private static final p:I = 0x15

.field private static final q:J = 0x1fffffL

.field private static final r:J = 0x3ffffe00000L

.field private static final s:I = 0x2a

.field private static final t:J = 0x7ffffc0000000000L

.field public static final u:I = 0x1

.field public static final v:I = 0x1ffffe

.field private static final w:J = 0x1fffffL

.field private static final x:J = -0x200000L

.field private static final y:J = 0x200000L


# instance fields
.field private volatile _isTerminated:I
    .annotation runtime Lu3/w;
    .end annotation
.end field

.field public final a:I
    .annotation build Lu3/e;
    .end annotation
.end field

.field public final b:I
    .annotation build Lu3/e;
    .end annotation
.end field

.field public final c:J
    .annotation build Lu3/e;
    .end annotation
.end field

.field private volatile controlState:J
    .annotation runtime Lu3/w;
    .end annotation
.end field

.field public final d:Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/e;
    .end annotation
.end field

.field public final e:Lkotlinx/coroutines/scheduling/f;
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/e;
    .end annotation
.end field

.field public final f:Lkotlinx/coroutines/scheduling/f;
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/e;
    .end annotation
.end field

.field public final g:Lkotlinx/coroutines/internal/o0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/internal/o0<",
            "Lkotlinx/coroutines/scheduling/a$c;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/e;
    .end annotation
.end field

.field private volatile parkedWorkersStack:J
    .annotation runtime Lu3/w;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlinx/coroutines/scheduling/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lkotlinx/coroutines/scheduling/a$a;-><init>(Lkotlin/jvm/internal/w;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lkotlinx/coroutines/scheduling/a;->h:Lkotlinx/coroutines/scheduling/a$a;

    .line 8
    .line 9
    const-string v0, "parkedWorkersStack"

    .line 10
    .line 11
    const-class v1, Lkotlinx/coroutines/scheduling/a;

    .line 12
    .line 13
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lkotlinx/coroutines/scheduling/a;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 18
    .line 19
    const-string v0, "controlState"

    .line 20
    .line 21
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lkotlinx/coroutines/scheduling/a;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 26
    .line 27
    const-string v0, "_isTerminated"

    .line 28
    .line 29
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lkotlinx/coroutines/scheduling/a;->k:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 34
    .line 35
    new-instance v0, Lkotlinx/coroutines/internal/t0;

    .line 36
    .line 37
    const-string v1, "NOT_IN_STACK"

    .line 38
    .line 39
    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/t0;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lkotlinx/coroutines/scheduling/a;->l:Lkotlinx/coroutines/internal/t0;

    .line 43
    .line 44
    return-void
    .line 45
.end method

.method public constructor <init>(IIJLjava/lang/String;)V
    .locals 3
    .param p5    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lkotlinx/coroutines/scheduling/a;->a:I

    .line 3
    iput p2, p0, Lkotlinx/coroutines/scheduling/a;->b:I

    .line 4
    iput-wide p3, p0, Lkotlinx/coroutines/scheduling/a;->c:J

    .line 5
    iput-object p5, p0, Lkotlinx/coroutines/scheduling/a;->d:Ljava/lang/String;

    const/4 p5, 0x0

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    move v1, p5

    :goto_0
    if-eqz v1, :cond_7

    if-lt p2, p1, :cond_1

    move v1, v0

    goto :goto_1

    :cond_1
    move v1, p5

    :goto_1
    const-string v2, "Max pool size "

    if-eqz v1, :cond_6

    const v1, 0x1ffffe

    if-gt p2, v1, :cond_2

    move v1, v0

    goto :goto_2

    :cond_2
    move v1, p5

    :goto_2
    if-eqz v1, :cond_5

    const-wide/16 v1, 0x0

    cmp-long p2, p3, v1

    if-lez p2, :cond_3

    goto :goto_3

    :cond_3
    move v0, p5

    :goto_3
    if-eqz v0, :cond_4

    .line 6
    new-instance p2, Lkotlinx/coroutines/scheduling/f;

    invoke-direct {p2}, Lkotlinx/coroutines/scheduling/f;-><init>()V

    iput-object p2, p0, Lkotlinx/coroutines/scheduling/a;->e:Lkotlinx/coroutines/scheduling/f;

    .line 7
    new-instance p2, Lkotlinx/coroutines/scheduling/f;

    invoke-direct {p2}, Lkotlinx/coroutines/scheduling/f;-><init>()V

    iput-object p2, p0, Lkotlinx/coroutines/scheduling/a;->f:Lkotlinx/coroutines/scheduling/f;

    .line 8
    new-instance p2, Lkotlinx/coroutines/internal/o0;

    add-int/lit8 p3, p1, 0x1

    mul-int/lit8 p3, p3, 0x2

    invoke-direct {p2, p3}, Lkotlinx/coroutines/internal/o0;-><init>(I)V

    iput-object p2, p0, Lkotlinx/coroutines/scheduling/a;->g:Lkotlinx/coroutines/internal/o0;

    int-to-long p1, p1

    const/16 p3, 0x2a

    shl-long/2addr p1, p3

    .line 9
    iput-wide p1, p0, Lkotlinx/coroutines/scheduling/a;->controlState:J

    .line 10
    iput p5, p0, Lkotlinx/coroutines/scheduling/a;->_isTerminated:I

    return-void

    .line 11
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Idle worker keep alive time "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, " must be positive"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 12
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 13
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " should not exceed maximal supported number of threads 2097150"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 14
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 15
    :cond_6
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " should be greater than or equals to core pool size "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 16
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 17
    :cond_7
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Core pool size "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " should be at least 1"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 18
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public synthetic constructor <init>(IIJLjava/lang/String;ILkotlin/jvm/internal/w;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 19
    sget-wide p3, Lkotlinx/coroutines/scheduling/o;->e:J

    :cond_0
    move-wide v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    .line 20
    sget-object p5, Lkotlinx/coroutines/scheduling/o;->a:Ljava/lang/String;

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move v1, p1

    move v2, p2

    .line 21
    invoke-direct/range {v0 .. v5}, Lkotlinx/coroutines/scheduling/a;-><init>(IIJLjava/lang/String;)V

    return-void
.end method

.method public static synthetic A(Lkotlinx/coroutines/scheduling/a;Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/l;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p2, Lkotlinx/coroutines/scheduling/o;->i:Lkotlinx/coroutines/scheduling/l;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/scheduling/a;->y(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/l;Z)V

    return-void
.end method

.method private final C0(Lkotlinx/coroutines/scheduling/a$c;Lkotlinx/coroutines/scheduling/k;Z)Lkotlinx/coroutines/scheduling/k;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-object p2

    .line 4
    :cond_0
    iget-object v0, p1, Lkotlinx/coroutines/scheduling/a$c;->c:Lkotlinx/coroutines/scheduling/a$d;

    .line 5
    .line 6
    sget-object v1, Lkotlinx/coroutines/scheduling/a$d;->TERMINATED:Lkotlinx/coroutines/scheduling/a$d;

    .line 7
    .line 8
    if-ne v0, v1, :cond_1

    .line 9
    .line 10
    return-object p2

    .line 11
    :cond_1
    iget-object v0, p2, Lkotlinx/coroutines/scheduling/k;->b:Lkotlinx/coroutines/scheduling/l;

    .line 12
    .line 13
    invoke-interface {v0}, Lkotlinx/coroutines/scheduling/l;->i0()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p1, Lkotlinx/coroutines/scheduling/a$c;->c:Lkotlinx/coroutines/scheduling/a$d;

    .line 20
    .line 21
    sget-object v1, Lkotlinx/coroutines/scheduling/a$d;->BLOCKING:Lkotlinx/coroutines/scheduling/a$d;

    .line 22
    .line 23
    if-ne v0, v1, :cond_2

    .line 24
    .line 25
    return-object p2

    .line 26
    :cond_2
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p1, Lkotlinx/coroutines/scheduling/a$c;->g:Z

    .line 28
    .line 29
    iget-object p1, p1, Lkotlinx/coroutines/scheduling/a$c;->a:Lkotlinx/coroutines/scheduling/q;

    .line 30
    .line 31
    invoke-virtual {p1, p2, p3}, Lkotlinx/coroutines/scheduling/q;->a(Lkotlinx/coroutines/scheduling/k;Z)Lkotlinx/coroutines/scheduling/k;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
.end method

.method private final D0()Z
    .locals 7

    .line 1
    invoke-static {}, Lkotlinx/coroutines/scheduling/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v3

    .line 9
    const-wide v1, 0x7ffffc0000000000L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    and-long/2addr v1, v3

    .line 15
    const/16 v5, 0x2a

    .line 16
    .line 17
    shr-long/2addr v1, v5

    .line 18
    long-to-int v1, v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    return v0

    .line 23
    :cond_1
    const-wide v1, 0x40000000000L

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    sub-long v5, v3, v1

    .line 29
    .line 30
    invoke-static {}, Lkotlinx/coroutines/scheduling/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    move-object v2, p0

    .line 35
    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    return v0
    .line 43
    .line 44
    .line 45
.end method

.method private final E0(J)Z
    .locals 3

    .line 1
    const-wide/32 v0, 0x1fffff

    .line 2
    .line 3
    .line 4
    and-long/2addr v0, p1

    .line 5
    long-to-int v0, v0

    .line 6
    const-wide v1, 0x3ffffe00000L

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    and-long/2addr p1, v1

    .line 12
    const/16 v1, 0x15

    .line 13
    .line 14
    shr-long/2addr p1, v1

    .line 15
    long-to-int p1, p1

    .line 16
    sub-int/2addr v0, p1

    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-static {v0, p1}, Lkotlin/ranges/s;->u(II)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    iget v0, p0, Lkotlinx/coroutines/scheduling/a;->a:I

    .line 23
    .line 24
    if-ge p2, v0, :cond_1

    .line 25
    .line 26
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a;->h()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    const/4 v0, 0x1

    .line 31
    if-ne p2, v0, :cond_0

    .line 32
    .line 33
    iget v1, p0, Lkotlinx/coroutines/scheduling/a;->a:I

    .line 34
    .line 35
    if-le v1, v0, :cond_0

    .line 36
    .line 37
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a;->h()I

    .line 38
    .line 39
    .line 40
    :cond_0
    if-lez p2, :cond_1

    .line 41
    .line 42
    return v0

    .line 43
    :cond_1
    return p1
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method static synthetic F0(Lkotlinx/coroutines/scheduling/a;JILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    sget-object p1, Lkotlinx/coroutines/scheduling/a;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide p1

    :cond_0
    invoke-direct {p0, p1, p2}, Lkotlinx/coroutines/scheduling/a;->E0(J)Z

    move-result p0

    return p0
.end method

.method private final G0()Z
    .locals 4

    .line 1
    :cond_0
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a;->a0()Lkotlinx/coroutines/scheduling/a$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-static {}, Lkotlinx/coroutines/scheduling/a$c;->m()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, -0x1

    .line 14
    invoke-virtual {v2, v0, v3, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    return v0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method private final H()I
    .locals 4

    sget-object v0, Lkotlinx/coroutines/scheduling/a;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    const-wide v2, 0x7ffffc0000000000L

    and-long/2addr v0, v2

    const/16 v2, 0x2a

    shr-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method private final I()I
    .locals 4

    .line 1
    invoke-static {}, Lkotlinx/coroutines/scheduling/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    const-wide/32 v2, 0x1fffff

    .line 10
    .line 11
    .line 12
    and-long/2addr v0, v2

    .line 13
    long-to-int v0, v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method private final J()J
    .locals 3

    .line 1
    sget-object v0, Lkotlinx/coroutines/scheduling/a;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    const-wide/32 v1, 0x200000

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method private final M()I
    .locals 4

    sget-object v0, Lkotlinx/coroutines/scheduling/a;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->incrementAndGet(Ljava/lang/Object;)J

    move-result-wide v0

    const-wide/32 v2, 0x1fffff

    and-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method private final O(Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;Lv3/l;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "Lkotlin/r2;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    :goto_0
    invoke-virtual {p1, p3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p2, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method private final P(Lkotlinx/coroutines/scheduling/a$c;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Lkotlinx/coroutines/scheduling/a$c;->j()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    sget-object v0, Lkotlinx/coroutines/scheduling/a;->l:Lkotlinx/coroutines/internal/t0;

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    const/4 p1, -0x1

    .line 10
    return p1

    .line 11
    :cond_0
    if-nez p1, :cond_1

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    return p1

    .line 15
    :cond_1
    check-cast p1, Lkotlinx/coroutines/scheduling/a$c;

    .line 16
    .line 17
    invoke-virtual {p1}, Lkotlinx/coroutines/scheduling/a$c;->i()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    return v0

    .line 24
    :cond_2
    invoke-virtual {p1}, Lkotlinx/coroutines/scheduling/a$c;->j()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    goto :goto_0
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public static final synthetic a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/scheduling/a;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-object v0
.end method

.method private final a0()Lkotlinx/coroutines/scheduling/a$c;
    .locals 10

    .line 1
    sget-object v0, Lkotlinx/coroutines/scheduling/a;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v3

    .line 7
    const-wide/32 v1, 0x1fffff

    .line 8
    .line 9
    .line 10
    and-long/2addr v1, v3

    .line 11
    long-to-int v1, v1

    .line 12
    iget-object v2, p0, Lkotlinx/coroutines/scheduling/a;->g:Lkotlinx/coroutines/internal/o0;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Lkotlinx/coroutines/internal/o0;->b(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    move-object v7, v1

    .line 19
    check-cast v7, Lkotlinx/coroutines/scheduling/a$c;

    .line 20
    .line 21
    if-nez v7, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    return-object v0

    .line 25
    :cond_1
    const-wide/32 v1, 0x200000

    .line 26
    .line 27
    .line 28
    add-long/2addr v1, v3

    .line 29
    const-wide/32 v5, -0x200000

    .line 30
    .line 31
    .line 32
    and-long/2addr v1, v5

    .line 33
    invoke-direct {p0, v7}, Lkotlinx/coroutines/scheduling/a;->P(Lkotlinx/coroutines/scheduling/a$c;)I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-ltz v5, :cond_0

    .line 38
    .line 39
    sget-object v6, Lkotlinx/coroutines/scheduling/a;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 40
    .line 41
    int-to-long v8, v5

    .line 42
    or-long/2addr v8, v1

    .line 43
    move-object v1, v6

    .line 44
    move-object v2, p0

    .line 45
    move-wide v5, v8

    .line 46
    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    sget-object v0, Lkotlinx/coroutines/scheduling/a;->l:Lkotlinx/coroutines/internal/t0;

    .line 53
    .line 54
    invoke-virtual {v7, v0}, Lkotlinx/coroutines/scheduling/a$c;->w(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-object v7
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
.end method

.method private final b(Lkotlinx/coroutines/scheduling/k;)Z
    .locals 2

    .line 1
    iget-object v0, p1, Lkotlinx/coroutines/scheduling/k;->b:Lkotlinx/coroutines/scheduling/l;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlinx/coroutines/scheduling/l;->i0()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a;->f:Lkotlinx/coroutines/scheduling/f;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/internal/a0;->a(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a;->e:Lkotlinx/coroutines/scheduling/f;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/internal/a0;->a(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    :goto_1
    return p1
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method private final d(J)I
    .locals 2

    const-wide v0, 0x3ffffe00000L

    and-long/2addr p1, v0

    const/16 v0, 0x15

    shr-long/2addr p1, v0

    long-to-int p1, p1

    return p1
.end method

.method private final h()I
    .locals 11

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a;->g:Lkotlinx/coroutines/internal/o0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lkotlinx/coroutines/scheduling/a;->isTerminated()Z

    .line 5
    .line 6
    .line 7
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    const/4 v0, -0x1

    .line 12
    return v0

    .line 13
    :cond_0
    :try_start_1
    sget-object v1, Lkotlinx/coroutines/scheduling/a;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    const-wide/32 v4, 0x1fffff

    .line 20
    .line 21
    .line 22
    and-long v6, v2, v4

    .line 23
    .line 24
    long-to-int v6, v6

    .line 25
    const-wide v7, 0x3ffffe00000L

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    and-long/2addr v2, v7

    .line 31
    const/16 v7, 0x15

    .line 32
    .line 33
    shr-long/2addr v2, v7

    .line 34
    long-to-int v2, v2

    .line 35
    sub-int v2, v6, v2

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-static {v2, v3}, Lkotlin/ranges/s;->u(II)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    iget v7, p0, Lkotlinx/coroutines/scheduling/a;->a:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    if-lt v2, v7, :cond_1

    .line 45
    .line 46
    monitor-exit v0

    .line 47
    return v3

    .line 48
    :cond_1
    :try_start_2
    iget v7, p0, Lkotlinx/coroutines/scheduling/a;->b:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 49
    .line 50
    if-lt v6, v7, :cond_2

    .line 51
    .line 52
    monitor-exit v0

    .line 53
    return v3

    .line 54
    :cond_2
    :try_start_3
    invoke-static {}, Lkotlinx/coroutines/scheduling/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-virtual {v6, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v6

    .line 62
    and-long/2addr v6, v4

    .line 63
    long-to-int v6, v6

    .line 64
    const/4 v7, 0x1

    .line 65
    add-int/2addr v6, v7

    .line 66
    if-lez v6, :cond_3

    .line 67
    .line 68
    iget-object v8, p0, Lkotlinx/coroutines/scheduling/a;->g:Lkotlinx/coroutines/internal/o0;

    .line 69
    .line 70
    invoke-virtual {v8, v6}, Lkotlinx/coroutines/internal/o0;->b(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    if-nez v8, :cond_3

    .line 75
    .line 76
    move v8, v7

    .line 77
    goto :goto_0

    .line 78
    :cond_3
    move v8, v3

    .line 79
    :goto_0
    if-eqz v8, :cond_6

    .line 80
    .line 81
    new-instance v8, Lkotlinx/coroutines/scheduling/a$c;

    .line 82
    .line 83
    invoke-direct {v8, p0, v6}, Lkotlinx/coroutines/scheduling/a$c;-><init>(Lkotlinx/coroutines/scheduling/a;I)V

    .line 84
    .line 85
    .line 86
    iget-object v9, p0, Lkotlinx/coroutines/scheduling/a;->g:Lkotlinx/coroutines/internal/o0;

    .line 87
    .line 88
    invoke-virtual {v9, v6, v8}, Lkotlinx/coroutines/internal/o0;->c(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->incrementAndGet(Ljava/lang/Object;)J

    .line 92
    .line 93
    .line 94
    move-result-wide v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 95
    and-long/2addr v4, v9

    .line 96
    long-to-int v1, v4

    .line 97
    if-ne v6, v1, :cond_4

    .line 98
    .line 99
    move v3, v7

    .line 100
    :cond_4
    if-eqz v3, :cond_5

    .line 101
    .line 102
    add-int/2addr v2, v7

    .line 103
    monitor-exit v0

    .line 104
    invoke-virtual {v8}, Ljava/lang/Thread;->start()V

    .line 105
    .line 106
    .line 107
    return v2

    .line 108
    :cond_5
    :try_start_4
    const-string v1, "Failed requirement."

    .line 109
    .line 110
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v2

    .line 120
    :cond_6
    const-string v1, "Failed requirement."

    .line 121
    .line 122
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 132
    :catchall_0
    move-exception v1

    .line 133
    monitor-exit v0

    .line 134
    throw v1
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
.end method

.method private final i0()J
    .locals 3

    .line 1
    invoke-static {}, Lkotlinx/coroutines/scheduling/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-wide v1, 0x40000000000L

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method private final m(J)I
    .locals 2

    const-wide/32 v0, 0x1fffff

    and-long/2addr p1, v0

    long-to-int p1, p1

    return p1
.end method

.method private final o()Lkotlinx/coroutines/scheduling/a$c;
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lkotlinx/coroutines/scheduling/a$c;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Lkotlinx/coroutines/scheduling/a$c;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v2

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-static {v0}, Lkotlinx/coroutines/scheduling/a$c;->a(Lkotlinx/coroutines/scheduling/a$c;)Lkotlinx/coroutines/scheduling/a;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1, p0}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    move-object v2, v0

    .line 27
    :cond_1
    return-object v2
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method private final p()V
    .locals 3

    .line 1
    invoke-static {}, Lkotlinx/coroutines/scheduling/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-wide/32 v1, -0x200000

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method private final q()I
    .locals 4

    invoke-static {}, Lkotlinx/coroutines/scheduling/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndDecrement(Ljava/lang/Object;)J

    move-result-wide v0

    const-wide/32 v2, 0x1fffff

    and-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method private final t0(JZ)V
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a;->G0()Z

    .line 5
    .line 6
    .line 7
    move-result p3

    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    return-void

    .line 11
    :cond_1
    invoke-direct {p0, p1, p2}, Lkotlinx/coroutines/scheduling/a;->E0(J)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    return-void

    .line 18
    :cond_2
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a;->G0()Z

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method


# virtual methods
.method public final A0()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a;->G0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    const/4 v1, 0x0

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    invoke-static {p0, v2, v3, v0, v1}, Lkotlinx/coroutines/scheduling/a;->F0(Lkotlinx/coroutines/scheduling/a;JILjava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a;->G0()Z

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public final b0(Lkotlinx/coroutines/scheduling/a$c;)Z
    .locals 9
    .param p1    # Lkotlinx/coroutines/scheduling/a$c;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Lkotlinx/coroutines/scheduling/a$c;->j()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lkotlinx/coroutines/scheduling/a;->l:Lkotlinx/coroutines/internal/t0;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    sget-object v0, Lkotlinx/coroutines/scheduling/a;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 12
    .line 13
    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    const-wide/32 v1, 0x1fffff

    .line 18
    .line 19
    .line 20
    and-long/2addr v1, v3

    .line 21
    long-to-int v1, v1

    .line 22
    const-wide/32 v5, 0x200000

    .line 23
    .line 24
    .line 25
    add-long/2addr v5, v3

    .line 26
    const-wide/32 v7, -0x200000

    .line 27
    .line 28
    .line 29
    and-long/2addr v5, v7

    .line 30
    invoke-virtual {p1}, Lkotlinx/coroutines/scheduling/a$c;->i()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    iget-object v7, p0, Lkotlinx/coroutines/scheduling/a;->g:Lkotlinx/coroutines/internal/o0;

    .line 35
    .line 36
    invoke-virtual {v7, v1}, Lkotlinx/coroutines/internal/o0;->b(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {p1, v1}, Lkotlinx/coroutines/scheduling/a$c;->w(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    sget-object v1, Lkotlinx/coroutines/scheduling/a;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 44
    .line 45
    int-to-long v7, v2

    .line 46
    or-long/2addr v5, v7

    .line 47
    move-object v2, p0

    .line 48
    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    const/4 p1, 0x1

    .line 55
    return p1
    .line 56
    .line 57
    .line 58
.end method

.method public final c(J)I
    .locals 2

    const-wide v0, 0x7ffffc0000000000L

    and-long/2addr p1, v0

    const/16 v0, 0x2a

    shr-long/2addr p1, v0

    long-to-int p1, p1

    return p1
.end method

.method public close()V
    .locals 2

    const-wide/16 v0, 0x2710

    invoke-virtual {p0, v0, v1}, Lkotlinx/coroutines/scheduling/a;->r0(J)V

    return-void
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 6
    .param p1    # Ljava/lang/Runnable;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/scheduling/a;->A(Lkotlinx/coroutines/scheduling/a;Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/l;ZILjava/lang/Object;)V

    return-void
.end method

.method public final f0(Lkotlinx/coroutines/scheduling/a$c;II)V
    .locals 9
    .param p1    # Lkotlinx/coroutines/scheduling/a$c;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lkotlinx/coroutines/scheduling/a;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v3

    .line 7
    const-wide/32 v1, 0x1fffff

    .line 8
    .line 9
    .line 10
    and-long/2addr v1, v3

    .line 11
    long-to-int v1, v1

    .line 12
    const-wide/32 v5, 0x200000

    .line 13
    .line 14
    .line 15
    add-long/2addr v5, v3

    .line 16
    const-wide/32 v7, -0x200000

    .line 17
    .line 18
    .line 19
    and-long/2addr v5, v7

    .line 20
    if-ne v1, p2, :cond_2

    .line 21
    .line 22
    if-nez p3, :cond_1

    .line 23
    .line 24
    invoke-direct {p0, p1}, Lkotlinx/coroutines/scheduling/a;->P(Lkotlinx/coroutines/scheduling/a$c;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v1, p3

    .line 30
    :cond_2
    :goto_0
    if-ltz v1, :cond_0

    .line 31
    .line 32
    sget-object v2, Lkotlinx/coroutines/scheduling/a;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 33
    .line 34
    int-to-long v7, v1

    .line 35
    or-long/2addr v5, v7

    .line 36
    move-object v1, v2

    .line 37
    move-object v2, p0

    .line 38
    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    return-void
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
.end method

.method public final isTerminated()Z
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/coroutines/scheduling/a;->k:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    return v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public final j(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/l;)Lkotlinx/coroutines/scheduling/k;
    .locals 3
    .param p1    # Ljava/lang/Runnable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlinx/coroutines/scheduling/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    sget-object v0, Lkotlinx/coroutines/scheduling/o;->f:Lkotlinx/coroutines/scheduling/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/j;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    instance-of v2, p1, Lkotlinx/coroutines/scheduling/k;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    check-cast p1, Lkotlinx/coroutines/scheduling/k;

    .line 12
    .line 13
    iput-wide v0, p1, Lkotlinx/coroutines/scheduling/k;->a:J

    .line 14
    .line 15
    iput-object p2, p1, Lkotlinx/coroutines/scheduling/k;->b:Lkotlinx/coroutines/scheduling/l;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    new-instance v2, Lkotlinx/coroutines/scheduling/n;

    .line 19
    .line 20
    invoke-direct {v2, p1, v0, v1, p2}, Lkotlinx/coroutines/scheduling/n;-><init>(Ljava/lang/Runnable;JLkotlinx/coroutines/scheduling/l;)V

    .line 21
    .line 22
    .line 23
    return-object v2
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public final p0(Lkotlinx/coroutines/scheduling/k;)V
    .locals 2
    .param p1    # Lkotlinx/coroutines/scheduling/k;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lkotlinx/coroutines/c;->b()Lkotlinx/coroutines/b;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    :goto_0
    invoke-virtual {p1}, Lkotlinx/coroutines/b;->f()V

    .line 11
    .line 12
    .line 13
    goto :goto_1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v1, v0, p1}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lkotlinx/coroutines/c;->b()Lkotlinx/coroutines/b;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    :goto_1
    return-void

    .line 34
    :catchall_1
    move-exception p1

    .line 35
    invoke-static {}, Lkotlinx/coroutines/c;->b()Lkotlinx/coroutines/b;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, Lkotlinx/coroutines/b;->f()V

    .line 42
    .line 43
    .line 44
    :cond_1
    throw p1
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public final r0(J)V
    .locals 7

    .line 1
    sget-object v0, Lkotlinx/coroutines/scheduling/a;->k:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a;->o()Lkotlinx/coroutines/scheduling/a$c;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, Lkotlinx/coroutines/scheduling/a;->g:Lkotlinx/coroutines/internal/o0;

    .line 17
    .line 18
    monitor-enter v1

    .line 19
    :try_start_0
    invoke-static {}, Lkotlinx/coroutines/scheduling/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    const-wide/32 v5, 0x1fffff

    .line 28
    .line 29
    .line 30
    and-long/2addr v3, v5

    .line 31
    long-to-int v3, v3

    .line 32
    monitor-exit v1

    .line 33
    if-gt v2, v3, :cond_3

    .line 34
    .line 35
    move v1, v2

    .line 36
    :goto_0
    iget-object v4, p0, Lkotlinx/coroutines/scheduling/a;->g:Lkotlinx/coroutines/internal/o0;

    .line 37
    .line 38
    invoke-virtual {v4, v1}, Lkotlinx/coroutines/internal/o0;->b(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-static {v4}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    check-cast v4, Lkotlinx/coroutines/scheduling/a$c;

    .line 46
    .line 47
    if-eq v4, v0, :cond_2

    .line 48
    .line 49
    :goto_1
    invoke-virtual {v4}, Ljava/lang/Thread;->isAlive()Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_1

    .line 54
    .line 55
    invoke-static {v4}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4, p1, p2}, Ljava/lang/Thread;->join(J)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    iget-object v4, v4, Lkotlinx/coroutines/scheduling/a$c;->a:Lkotlinx/coroutines/scheduling/q;

    .line 63
    .line 64
    iget-object v5, p0, Lkotlinx/coroutines/scheduling/a;->f:Lkotlinx/coroutines/scheduling/f;

    .line 65
    .line 66
    invoke-virtual {v4, v5}, Lkotlinx/coroutines/scheduling/q;->g(Lkotlinx/coroutines/scheduling/f;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    if-eq v1, v3, :cond_3

    .line 70
    .line 71
    add-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/a;->f:Lkotlinx/coroutines/scheduling/f;

    .line 75
    .line 76
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/a0;->b()V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/a;->e:Lkotlinx/coroutines/scheduling/f;

    .line 80
    .line 81
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/a0;->b()V

    .line 82
    .line 83
    .line 84
    :goto_2
    if-eqz v0, :cond_4

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Lkotlinx/coroutines/scheduling/a$c;->h(Z)Lkotlinx/coroutines/scheduling/k;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-nez p1, :cond_6

    .line 91
    .line 92
    :cond_4
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/a;->e:Lkotlinx/coroutines/scheduling/f;

    .line 93
    .line 94
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/a0;->h()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, Lkotlinx/coroutines/scheduling/k;

    .line 99
    .line 100
    if-nez p1, :cond_6

    .line 101
    .line 102
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/a;->f:Lkotlinx/coroutines/scheduling/f;

    .line 103
    .line 104
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/a0;->h()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    check-cast p1, Lkotlinx/coroutines/scheduling/k;

    .line 109
    .line 110
    if-nez p1, :cond_6

    .line 111
    .line 112
    if-eqz v0, :cond_5

    .line 113
    .line 114
    sget-object p1, Lkotlinx/coroutines/scheduling/a$d;->TERMINATED:Lkotlinx/coroutines/scheduling/a$d;

    .line 115
    .line 116
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/scheduling/a$c;->z(Lkotlinx/coroutines/scheduling/a$d;)Z

    .line 117
    .line 118
    .line 119
    :cond_5
    sget-object p1, Lkotlinx/coroutines/scheduling/a;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 120
    .line 121
    const-wide/16 v0, 0x0

    .line 122
    .line 123
    invoke-virtual {p1, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->set(Ljava/lang/Object;J)V

    .line 124
    .line 125
    .line 126
    sget-object p1, Lkotlinx/coroutines/scheduling/a;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 127
    .line 128
    invoke-virtual {p1, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->set(Ljava/lang/Object;J)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_6
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/scheduling/a;->p0(Lkotlinx/coroutines/scheduling/k;)V

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :catchall_0
    move-exception p1

    .line 137
    monitor-exit v1

    .line 138
    throw p1
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
.end method

.method public toString()Ljava/lang/String;
    .locals 12
    .annotation build Lp4/l;
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lkotlinx/coroutines/scheduling/a;->g:Lkotlinx/coroutines/internal/o0;

    .line 7
    .line 8
    invoke-virtual {v1}, Lkotlinx/coroutines/internal/o0;->a()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    move v4, v2

    .line 15
    move v5, v4

    .line 16
    move v6, v5

    .line 17
    move v7, v6

    .line 18
    move v8, v3

    .line 19
    :goto_0
    if-ge v8, v1, :cond_7

    .line 20
    .line 21
    iget-object v9, p0, Lkotlinx/coroutines/scheduling/a;->g:Lkotlinx/coroutines/internal/o0;

    .line 22
    .line 23
    invoke-virtual {v9, v8}, Lkotlinx/coroutines/internal/o0;->b(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v9

    .line 27
    check-cast v9, Lkotlinx/coroutines/scheduling/a$c;

    .line 28
    .line 29
    if-nez v9, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    iget-object v10, v9, Lkotlinx/coroutines/scheduling/a$c;->a:Lkotlinx/coroutines/scheduling/q;

    .line 33
    .line 34
    invoke-virtual {v10}, Lkotlinx/coroutines/scheduling/q;->f()I

    .line 35
    .line 36
    .line 37
    move-result v10

    .line 38
    iget-object v9, v9, Lkotlinx/coroutines/scheduling/a$c;->c:Lkotlinx/coroutines/scheduling/a$d;

    .line 39
    .line 40
    sget-object v11, Lkotlinx/coroutines/scheduling/a$b;->a:[I

    .line 41
    .line 42
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    aget v9, v11, v9

    .line 47
    .line 48
    if-eq v9, v3, :cond_5

    .line 49
    .line 50
    const/4 v11, 0x2

    .line 51
    if-eq v9, v11, :cond_4

    .line 52
    .line 53
    const/4 v11, 0x3

    .line 54
    if-eq v9, v11, :cond_3

    .line 55
    .line 56
    const/4 v11, 0x4

    .line 57
    if-eq v9, v11, :cond_2

    .line 58
    .line 59
    const/4 v10, 0x5

    .line 60
    if-eq v9, v10, :cond_1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    add-int/lit8 v7, v7, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 67
    .line 68
    if-lez v10, :cond_6

    .line 69
    .line 70
    new-instance v9, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const/16 v10, 0x64

    .line 79
    .line 80
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    invoke-interface {v0, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 92
    .line 93
    new-instance v9, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const/16 v10, 0x63

    .line 102
    .line 103
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    invoke-interface {v0, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 115
    .line 116
    new-instance v9, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const/16 v10, 0x62

    .line 125
    .line 126
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    invoke-interface {v0, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 138
    .line 139
    :cond_6
    :goto_1
    add-int/lit8 v8, v8, 0x1

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_7
    sget-object v1, Lkotlinx/coroutines/scheduling/a;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 143
    .line 144
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 145
    .line 146
    .line 147
    move-result-wide v8

    .line 148
    new-instance v1, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 151
    .line 152
    .line 153
    iget-object v3, p0, Lkotlinx/coroutines/scheduling/a;->d:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    const/16 v3, 0x40

    .line 159
    .line 160
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-static {p0}, Lkotlinx/coroutines/x0;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string v3, "[Pool Size {core = "

    .line 171
    .line 172
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    iget v3, p0, Lkotlinx/coroutines/scheduling/a;->a:I

    .line 176
    .line 177
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string v3, ", max = "

    .line 181
    .line 182
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    iget v3, p0, Lkotlinx/coroutines/scheduling/a;->b:I

    .line 186
    .line 187
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    const-string v3, "}, Worker States {CPU = "

    .line 191
    .line 192
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string v2, ", blocking = "

    .line 199
    .line 200
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    const-string v2, ", parked = "

    .line 207
    .line 208
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    const-string v2, ", dormant = "

    .line 215
    .line 216
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    const-string v2, ", terminated = "

    .line 223
    .line 224
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    const-string v2, "}, running workers queues = "

    .line 231
    .line 232
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    const-string v0, ", global CPU queue size = "

    .line 239
    .line 240
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a;->e:Lkotlinx/coroutines/scheduling/f;

    .line 244
    .line 245
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/a0;->c()I

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string v0, ", global blocking queue size = "

    .line 253
    .line 254
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a;->f:Lkotlinx/coroutines/scheduling/f;

    .line 258
    .line 259
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/a0;->c()I

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    const-string v0, ", Control State {created workers= "

    .line 267
    .line 268
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    const-wide/32 v2, 0x1fffff

    .line 272
    .line 273
    .line 274
    and-long/2addr v2, v8

    .line 275
    long-to-int v0, v2

    .line 276
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    const-string v0, ", blocking tasks = "

    .line 280
    .line 281
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    const-wide v2, 0x3ffffe00000L

    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    and-long/2addr v2, v8

    .line 290
    const/16 v0, 0x15

    .line 291
    .line 292
    shr-long/2addr v2, v0

    .line 293
    long-to-int v0, v2

    .line 294
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    const-string v0, ", CPUs acquired = "

    .line 298
    .line 299
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    iget v0, p0, Lkotlinx/coroutines/scheduling/a;->a:I

    .line 303
    .line 304
    const-wide v2, 0x7ffffc0000000000L

    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    and-long/2addr v2, v8

    .line 310
    const/16 v4, 0x2a

    .line 311
    .line 312
    shr-long/2addr v2, v4

    .line 313
    long-to-int v2, v2

    .line 314
    sub-int/2addr v0, v2

    .line 315
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    const-string v0, "}]"

    .line 319
    .line 320
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    return-object v0
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
.end method

.method public final y(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/l;Z)V
    .locals 5
    .param p1    # Ljava/lang/Runnable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlinx/coroutines/scheduling/l;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Lkotlinx/coroutines/c;->b()Lkotlinx/coroutines/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lkotlinx/coroutines/b;->e()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/scheduling/a;->j(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/l;)Lkotlinx/coroutines/scheduling/k;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object p2, p1, Lkotlinx/coroutines/scheduling/k;->b:Lkotlinx/coroutines/scheduling/l;

    .line 15
    .line 16
    invoke-interface {p2}, Lkotlinx/coroutines/scheduling/l;->i0()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    const/4 v0, 0x0

    .line 21
    const/4 v1, 0x1

    .line 22
    if-ne p2, v1, :cond_1

    .line 23
    .line 24
    move p2, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move p2, v0

    .line 27
    :goto_0
    if-eqz p2, :cond_2

    .line 28
    .line 29
    sget-object v2, Lkotlinx/coroutines/scheduling/a;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 30
    .line 31
    const-wide/32 v3, 0x200000

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, p0, v3, v4}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    const-wide/16 v2, 0x0

    .line 40
    .line 41
    :goto_1
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a;->o()Lkotlinx/coroutines/scheduling/a$c;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-direct {p0, v4, p1, p3}, Lkotlinx/coroutines/scheduling/a;->C0(Lkotlinx/coroutines/scheduling/a$c;Lkotlinx/coroutines/scheduling/k;Z)Lkotlinx/coroutines/scheduling/k;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_4

    .line 50
    .line 51
    invoke-direct {p0, p1}, Lkotlinx/coroutines/scheduling/a;->b(Lkotlinx/coroutines/scheduling/k;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    new-instance p1, Ljava/util/concurrent/RejectedExecutionException;

    .line 59
    .line 60
    new-instance p2, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    iget-object p3, p0, Lkotlinx/coroutines/scheduling/a;->d:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string p3, " was terminated"

    .line 71
    .line 72
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-direct {p1, p2}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1

    .line 83
    :cond_4
    :goto_2
    if-eqz p3, :cond_5

    .line 84
    .line 85
    if-eqz v4, :cond_5

    .line 86
    .line 87
    move v0, v1

    .line 88
    :cond_5
    if-eqz p2, :cond_6

    .line 89
    .line 90
    invoke-direct {p0, v2, v3, v0}, Lkotlinx/coroutines/scheduling/a;->t0(JZ)V

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_6
    if-eqz v0, :cond_7

    .line 95
    .line 96
    return-void

    .line 97
    :cond_7
    invoke-virtual {p0}, Lkotlinx/coroutines/scheduling/a;->A0()V

    .line 98
    .line 99
    .line 100
    :goto_3
    return-void
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
.end method
