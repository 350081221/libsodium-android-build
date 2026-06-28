.class public Landroidx/collection/LruCache;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0016\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0008\u0008\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0011\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008,\u0010-J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0012\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0001\u0010\t\u001a\u00020\u0006H\u0016J\u001a\u0010\u000c\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0017\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\rJ1\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00012\u0008\u0010\u0015\u001a\u0004\u0018\u00018\u0001H\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\u0008\u0018\u0010\rJ\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u0014\u00a2\u0006\u0004\u0008\u0019\u0010\u0008J\u0006\u0010\u001a\u001a\u00020\nJ\u0006\u0010\u001b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\u001c\u001a\u00020\u0006J\u0006\u0010\u001d\u001a\u00020\u0006J\u0006\u0010\u001e\u001a\u00020\u0006J\u0006\u0010\u001f\u001a\u00020\u0006J\u0006\u0010 \u001a\u00020\u0006J\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!J\u0008\u0010$\u001a\u00020#H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010%R \u0010\'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010%R\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010%R\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010%R\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010%R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010%R\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010%\u00a8\u0006."
    }
    d2 = {
        "Landroidx/collection/LruCache;",
        "",
        "K",
        "V",
        "key",
        "value",
        "",
        "safeSizeOf",
        "(Ljava/lang/Object;Ljava/lang/Object;)I",
        "maxSize",
        "Lkotlin/r2;",
        "resize",
        "get",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "put",
        "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
        "trimToSize",
        "remove",
        "",
        "evicted",
        "oldValue",
        "newValue",
        "entryRemoved",
        "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V",
        "create",
        "sizeOf",
        "evictAll",
        "size",
        "hitCount",
        "missCount",
        "createCount",
        "putCount",
        "evictionCount",
        "",
        "snapshot",
        "",
        "toString",
        "I",
        "Landroidx/collection/internal/LruHashMap;",
        "map",
        "Landroidx/collection/internal/LruHashMap;",
        "Landroidx/collection/internal/Lock;",
        "lock",
        "Landroidx/collection/internal/Lock;",
        "<init>",
        "(I)V",
        "collection"
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
        "SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LockExt.kt\nandroidx/collection/internal/LockExtKt\n+ 4 Lock.jvm.kt\nandroidx/collection/internal/Lock\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,355:1\n1#2:356\n23#3,3:357\n23#3,3:361\n23#3,3:365\n23#3,3:369\n23#3,3:373\n23#3,3:377\n23#3,3:381\n23#3,3:385\n23#3,3:389\n23#3,3:393\n23#3,3:397\n23#3,3:401\n23#3,3:405\n23#3,3:409\n23#3,3:415\n26#4:360\n26#4:364\n26#4:368\n26#4:372\n26#4:376\n26#4:380\n26#4:384\n26#4:388\n26#4:392\n26#4:396\n26#4:400\n26#4:404\n26#4:408\n26#4:412\n26#4:418\n1855#5,2:413\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCache\n*L\n65#1:357,3\n78#1:361,3\n95#1:365,3\n122#1:369,3\n151#1:373,3\n180#1:377,3\n255#1:381,3\n262#1:385,3\n268#1:389,3\n274#1:393,3\n279#1:397,3\n284#1:401,3\n289#1:405,3\n299#1:409,3\n308#1:415,3\n65#1:360\n78#1:364\n95#1:368\n122#1:372\n151#1:376\n180#1:380\n255#1:384\n262#1:388\n268#1:392\n274#1:396\n279#1:400\n284#1:404\n289#1:408\n299#1:412\n308#1:418\n300#1:413,2\n*E\n"
    }
.end annotation


# instance fields
.field private createCount:I

.field private evictionCount:I

.field private hitCount:I

.field private final lock:Landroidx/collection/internal/Lock;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final map:Landroidx/collection/internal/LruHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/internal/LruHashMap<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private maxSize:I

.field private missCount:I

.field private putCount:I

.field private size:I


# direct methods
.method public constructor <init>(I)V
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x1L
            to = 0x7fffffffffffffffL
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/collection/LruCache;->maxSize:I

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-lez p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move p1, v0

    .line 12
    :goto_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    new-instance p1, Landroidx/collection/internal/LruHashMap;

    .line 15
    .line 16
    const/high16 v1, 0x3f400000    # 0.75f

    .line 17
    .line 18
    invoke-direct {p1, v0, v1}, Landroidx/collection/internal/LruHashMap;-><init>(IF)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Landroidx/collection/LruCache;->map:Landroidx/collection/internal/LruHashMap;

    .line 22
    .line 23
    new-instance p1, Landroidx/collection/internal/Lock;

    .line 24
    .line 25
    invoke-direct {p1}, Landroidx/collection/internal/Lock;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Landroidx/collection/LruCache;->lock:Landroidx/collection/internal/Lock;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    const-string v0, "maxSize <= 0"

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1
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
.end method

.method private final safeSizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)I"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/collection/LruCache;->sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-eqz v1, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "Negative size: "

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const/16 p1, 0x3d

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p2
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
.end method


# virtual methods
.method protected create(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final createCount()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/collection/LruCache;->lock:Landroidx/collection/internal/Lock;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Landroidx/collection/LruCache;->createCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0

    .line 10
    throw v1
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method protected entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .param p2    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZTK;TV;TV;)V"
        }
    .end annotation

    const-string p1, "key"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "oldValue"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final evictAll()V
    .locals 1

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Landroidx/collection/LruCache;->trimToSize(I)V

    return-void
.end method

.method public final evictionCount()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/collection/LruCache;->lock:Landroidx/collection/internal/Lock;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Landroidx/collection/LruCache;->evictionCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0

    .line 10
    throw v1
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/collection/LruCache;->lock:Landroidx/collection/internal/Lock;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Landroidx/collection/LruCache;->map:Landroidx/collection/internal/LruHashMap;

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Landroidx/collection/internal/LruHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget p1, p0, Landroidx/collection/LruCache;->hitCount:I

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    iput p1, p0, Landroidx/collection/LruCache;->hitCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-object v1

    .line 25
    :cond_0
    :try_start_1
    iget v1, p0, Landroidx/collection/LruCache;->missCount:I

    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    iput v1, p0, Landroidx/collection/LruCache;->missCount:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 30
    .line 31
    monitor-exit v0

    .line 32
    invoke-virtual {p0, p1}, Landroidx/collection/LruCache;->create(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    return-object p1

    .line 40
    :cond_1
    iget-object v1, p0, Landroidx/collection/LruCache;->lock:Landroidx/collection/internal/Lock;

    .line 41
    .line 42
    monitor-enter v1

    .line 43
    :try_start_2
    iget v2, p0, Landroidx/collection/LruCache;->createCount:I

    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    iput v2, p0, Landroidx/collection/LruCache;->createCount:I

    .line 48
    .line 49
    iget-object v2, p0, Landroidx/collection/LruCache;->map:Landroidx/collection/internal/LruHashMap;

    .line 50
    .line 51
    invoke-virtual {v2, p1, v0}, Landroidx/collection/internal/LruHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    iget-object v3, p0, Landroidx/collection/LruCache;->map:Landroidx/collection/internal/LruHashMap;

    .line 58
    .line 59
    invoke-virtual {v3, p1, v2}, Landroidx/collection/internal/LruHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    iget v3, p0, Landroidx/collection/LruCache;->size:I

    .line 64
    .line 65
    invoke-direct {p0, p1, v0}, Landroidx/collection/LruCache;->safeSizeOf(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    add-int/2addr v3, v4

    .line 70
    iput v3, p0, Landroidx/collection/LruCache;->size:I

    .line 71
    .line 72
    sget-object v3, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 73
    .line 74
    :goto_0
    monitor-exit v1

    .line 75
    if-eqz v2, :cond_3

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    invoke-virtual {p0, v1, p1, v0, v2}, Landroidx/collection/LruCache;->entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    move-object v0, v2

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    iget p1, p0, Landroidx/collection/LruCache;->maxSize:I

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Landroidx/collection/LruCache;->trimToSize(I)V

    .line 86
    .line 87
    .line 88
    :goto_1
    return-object v0

    .line 89
    :catchall_0
    move-exception p1

    .line 90
    monitor-exit v1

    .line 91
    throw p1

    .line 92
    :catchall_1
    move-exception p1

    .line 93
    monitor-exit v0

    .line 94
    throw p1
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
.end method

.method public final hitCount()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/collection/LruCache;->lock:Landroidx/collection/internal/Lock;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Landroidx/collection/LruCache;->hitCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0

    .line 10
    throw v1
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public final maxSize()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/collection/LruCache;->lock:Landroidx/collection/internal/Lock;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Landroidx/collection/LruCache;->maxSize:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0

    .line 10
    throw v1
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public final missCount()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/collection/LruCache;->lock:Landroidx/collection/internal/Lock;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Landroidx/collection/LruCache;->missCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0

    .line 10
    throw v1
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string/jumbo v0, "value"

    .line 7
    .line 8
    .line 9
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Landroidx/collection/LruCache;->lock:Landroidx/collection/internal/Lock;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    iget v1, p0, Landroidx/collection/LruCache;->putCount:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    iput v1, p0, Landroidx/collection/LruCache;->putCount:I

    .line 20
    .line 21
    iget v1, p0, Landroidx/collection/LruCache;->size:I

    .line 22
    .line 23
    invoke-direct {p0, p1, p2}, Landroidx/collection/LruCache;->safeSizeOf(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    add-int/2addr v1, v2

    .line 28
    iput v1, p0, Landroidx/collection/LruCache;->size:I

    .line 29
    .line 30
    iget-object v1, p0, Landroidx/collection/LruCache;->map:Landroidx/collection/internal/LruHashMap;

    .line 31
    .line 32
    invoke-virtual {v1, p1, p2}, Landroidx/collection/internal/LruHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    iget v2, p0, Landroidx/collection/LruCache;->size:I

    .line 39
    .line 40
    invoke-direct {p0, p1, v1}, Landroidx/collection/LruCache;->safeSizeOf(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    sub-int/2addr v2, v3

    .line 45
    iput v2, p0, Landroidx/collection/LruCache;->size:I

    .line 46
    .line 47
    :cond_0
    sget-object v2, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    monitor-exit v0

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-virtual {p0, v0, p1, v1, p2}, Landroidx/collection/LruCache;->entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    iget p1, p0, Landroidx/collection/LruCache;->maxSize:I

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Landroidx/collection/LruCache;->trimToSize(I)V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    monitor-exit v0

    .line 64
    throw p1
    .line 65
.end method

.method public final putCount()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/collection/LruCache;->lock:Landroidx/collection/internal/Lock;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Landroidx/collection/LruCache;->putCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0

    .line 10
    throw v1
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/collection/LruCache;->lock:Landroidx/collection/internal/Lock;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Landroidx/collection/LruCache;->map:Landroidx/collection/internal/LruHashMap;

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Landroidx/collection/internal/LruHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget v2, p0, Landroidx/collection/LruCache;->size:I

    .line 18
    .line 19
    invoke-direct {p0, p1, v1}, Landroidx/collection/LruCache;->safeSizeOf(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    sub-int/2addr v2, v3

    .line 24
    iput v2, p0, Landroidx/collection/LruCache;->size:I

    .line 25
    .line 26
    :cond_0
    sget-object v2, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    monitor-exit v0

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-virtual {p0, v0, p1, v1, v2}, Landroidx/collection/LruCache;->entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-object v1

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    monitor-exit v0

    .line 39
    throw p1
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
.end method

.method public resize(I)V
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x1L
            to = 0x7fffffffffffffffL
        .end annotation
    .end param

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/collection/LruCache;->lock:Landroidx/collection/internal/Lock;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iput p1, p0, Landroidx/collection/LruCache;->maxSize:I

    .line 12
    .line 13
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    invoke-virtual {p0, p1}, Landroidx/collection/LruCache;->trimToSize(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    monitor-exit v0

    .line 22
    throw p1

    .line 23
    :cond_1
    const-string p1, "maxSize <= 0"

    .line 24
    .line 25
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
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
.end method

.method public final size()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/collection/LruCache;->lock:Landroidx/collection/internal/Lock;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Landroidx/collection/LruCache;->size:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0

    .line 10
    throw v1
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method protected sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)I"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "value"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final snapshot()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/collection/LruCache;->lock:Landroidx/collection/internal/Lock;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    iget-object v2, p0, Landroidx/collection/LruCache;->map:Landroidx/collection/internal/LruHashMap;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroidx/collection/internal/LruHashMap;->getEntries()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Ljava/lang/Iterable;

    .line 16
    .line 17
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/util/Map$Entry;

    .line 32
    .line 33
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    sget-object v2, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    monitor-exit v1

    .line 48
    return-object v0

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    monitor-exit v1

    .line 51
    throw v0
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
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/collection/LruCache;->lock:Landroidx/collection/internal/Lock;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Landroidx/collection/LruCache;->hitCount:I

    .line 5
    .line 6
    iget v2, p0, Landroidx/collection/LruCache;->missCount:I

    .line 7
    .line 8
    add-int/2addr v2, v1

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    mul-int/lit8 v1, v1, 0x64

    .line 12
    .line 13
    div-int/2addr v1, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v3, "LruCache[maxSize="

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget v3, p0, Landroidx/collection/LruCache;->maxSize:I

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v3, ",hits="

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget v3, p0, Landroidx/collection/LruCache;->hitCount:I

    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v3, ",misses="

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget v3, p0, Landroidx/collection/LruCache;->missCount:I

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v3, ",hitRate="

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v1, "%]"

    .line 60
    .line 61
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    monitor-exit v0

    .line 69
    return-object v1

    .line 70
    :catchall_0
    move-exception v1

    .line 71
    monitor-exit v0

    .line 72
    throw v1
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
.end method

.method public trimToSize(I)V
    .locals 6

    .line 1
    :goto_0
    iget-object v0, p0, Landroidx/collection/LruCache;->lock:Landroidx/collection/internal/Lock;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Landroidx/collection/LruCache;->size:I

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-ltz v1, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/collection/LruCache;->map:Landroidx/collection/internal/LruHashMap;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroidx/collection/internal/LruHashMap;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget v1, p0, Landroidx/collection/LruCache;->size:I

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    :cond_0
    move v1, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const/4 v1, 0x0

    .line 24
    :goto_1
    if-eqz v1, :cond_5

    .line 25
    .line 26
    iget v1, p0, Landroidx/collection/LruCache;->size:I

    .line 27
    .line 28
    if-le v1, p1, :cond_4

    .line 29
    .line 30
    iget-object v1, p0, Landroidx/collection/LruCache;->map:Landroidx/collection/internal/LruHashMap;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroidx/collection/internal/LruHashMap;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    iget-object v1, p0, Landroidx/collection/LruCache;->map:Landroidx/collection/internal/LruHashMap;

    .line 40
    .line 41
    invoke-virtual {v1}, Landroidx/collection/internal/LruHashMap;->getEntries()Ljava/util/Set;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Ljava/lang/Iterable;

    .line 46
    .line 47
    invoke-static {v1}, Lkotlin/collections/u;->B2(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Ljava/util/Map$Entry;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    if-nez v1, :cond_3

    .line 54
    .line 55
    monitor-exit v0

    .line 56
    return-void

    .line 57
    :cond_3
    :try_start_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget-object v4, p0, Landroidx/collection/LruCache;->map:Landroidx/collection/internal/LruHashMap;

    .line 66
    .line 67
    invoke-virtual {v4, v3}, Landroidx/collection/internal/LruHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    iget v4, p0, Landroidx/collection/LruCache;->size:I

    .line 71
    .line 72
    invoke-direct {p0, v3, v1}, Landroidx/collection/LruCache;->safeSizeOf(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    sub-int/2addr v4, v5

    .line 77
    iput v4, p0, Landroidx/collection/LruCache;->size:I

    .line 78
    .line 79
    iget v4, p0, Landroidx/collection/LruCache;->evictionCount:I

    .line 80
    .line 81
    add-int/2addr v4, v2

    .line 82
    iput v4, p0, Landroidx/collection/LruCache;->evictionCount:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    .line 84
    monitor-exit v0

    .line 85
    const/4 v0, 0x0

    .line 86
    invoke-virtual {p0, v2, v3, v1, v0}, Landroidx/collection/LruCache;->entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    :goto_2
    monitor-exit v0

    .line 91
    return-void

    .line 92
    :cond_5
    :try_start_2
    const-string p1, "LruCache.sizeOf() is reporting inconsistent results!"

    .line 93
    .line 94
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 104
    :catchall_0
    move-exception p1

    .line 105
    monitor-exit v0

    .line 106
    throw p1
.end method
