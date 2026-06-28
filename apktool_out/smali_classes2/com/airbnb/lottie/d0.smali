.class public Lcom/airbnb/lottie/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation


# static fields
.field private static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/airbnb/lottie/f1<",
            "Lcom/airbnb/lottie/k;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/airbnb/lottie/g1;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:[B

.field private static final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/airbnb/lottie/d0;->a:Ljava/util/Map;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashSet;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/airbnb/lottie/d0;->b:Ljava/util/Set;

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    new-array v0, v0, [B

    .line 17
    .line 18
    fill-array-data v0, :array_0

    .line 19
    .line 20
    .line 21
    sput-object v0, Lcom/airbnb/lottie/d0;->c:[B

    .line 22
    .line 23
    const/4 v0, 0x3

    .line 24
    new-array v0, v0, [B

    .line 25
    .line 26
    fill-array-data v0, :array_1

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/airbnb/lottie/d0;->d:[B

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :array_0
    .array-data 1
        0x50t
        0x4bt
        0x3t
        0x4t
    .end array-data

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    :array_1
    .array-data 1
        0x1ft
        -0x75t
        0x8t
    .end array-data
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
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A(Ljava/io/InputStream;Ljava/lang/String;Z)Lcom/airbnb/lottie/f1;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/airbnb/lottie/f1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/airbnb/lottie/l;

    invoke-direct {v0, p0, p1, p2}, Lcom/airbnb/lottie/l;-><init>(Ljava/io/InputStream;Ljava/lang/String;Z)V

    new-instance v1, Lcom/airbnb/lottie/u;

    invoke-direct {v1, p2, p0}, Lcom/airbnb/lottie/u;-><init>(ZLjava/io/InputStream;)V

    invoke-static {p1, v0, v1}, Lcom/airbnb/lottie/d0;->r(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lcom/airbnb/lottie/f1;

    move-result-object p0

    return-object p0
.end method

.method public static A0(Lcom/airbnb/lottie/g1;)V
    .locals 1

    sget-object v0, Lcom/airbnb/lottie/d0;->b:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public static B(Ljava/io/InputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/d1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lcom/airbnb/lottie/d0;->C(Ljava/io/InputStream;Ljava/lang/String;Z)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method public static C(Ljava/io/InputStream;Ljava/lang/String;Z)Lcom/airbnb/lottie/d1;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/airbnb/lottie/d1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Lokio/y0;->u(Ljava/io/InputStream;)Lokio/n1;

    move-result-object p0

    invoke-static {p0}, Lokio/y0;->e(Lokio/n1;)Lokio/BufferedSource;

    move-result-object p0

    invoke-static {p0}, Lcom/airbnb/lottie/parser/moshi/c;->A(Lokio/BufferedSource;)Lcom/airbnb/lottie/parser/moshi/c;

    move-result-object p0

    invoke-static {p0, p1, p2}, Lcom/airbnb/lottie/d0;->F(Lcom/airbnb/lottie/parser/moshi/c;Ljava/lang/String;Z)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method public static D(Lcom/airbnb/lottie/parser/moshi/c;Ljava/lang/String;)Lcom/airbnb/lottie/f1;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/parser/moshi/c;",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/f1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/airbnb/lottie/z;

    invoke-direct {v0, p0, p1}, Lcom/airbnb/lottie/z;-><init>(Lcom/airbnb/lottie/parser/moshi/c;Ljava/lang/String;)V

    new-instance v1, Lcom/airbnb/lottie/a0;

    invoke-direct {v1, p0}, Lcom/airbnb/lottie/a0;-><init>(Lcom/airbnb/lottie/parser/moshi/c;)V

    invoke-static {p1, v0, v1}, Lcom/airbnb/lottie/d0;->r(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lcom/airbnb/lottie/f1;

    move-result-object p0

    return-object p0
.end method

.method public static E(Lcom/airbnb/lottie/parser/moshi/c;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/parser/moshi/c;",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/d1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lcom/airbnb/lottie/d0;->F(Lcom/airbnb/lottie/parser/moshi/c;Ljava/lang/String;Z)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method public static F(Lcom/airbnb/lottie/parser/moshi/c;Ljava/lang/String;Z)Lcom/airbnb/lottie/d1;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/parser/moshi/c;",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/airbnb/lottie/d1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/airbnb/lottie/d0;->G(Lcom/airbnb/lottie/parser/moshi/c;Ljava/lang/String;Z)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method private static G(Lcom/airbnb/lottie/parser/moshi/c;Ljava/lang/String;Z)Lcom/airbnb/lottie/d1;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/parser/moshi/c;",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/airbnb/lottie/d1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/airbnb/lottie/model/g;->c()Lcom/airbnb/lottie/model/g;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lcom/airbnb/lottie/model/g;->b(Ljava/lang/String;)Lcom/airbnb/lottie/k;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    if-eqz v0, :cond_2

    .line 14
    .line 15
    new-instance p1, Lcom/airbnb/lottie/d1;

    .line 16
    .line 17
    invoke-direct {p1, v0}, Lcom/airbnb/lottie/d1;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    invoke-static {p0}, Lcom/airbnb/lottie/utils/l;->c(Ljava/io/Closeable;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-object p1

    .line 26
    :cond_2
    :try_start_1
    invoke-static {p0}, Lcom/airbnb/lottie/parser/w;->a(Lcom/airbnb/lottie/parser/moshi/c;)Lcom/airbnb/lottie/k;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz p1, :cond_3

    .line 31
    .line 32
    invoke-static {}, Lcom/airbnb/lottie/model/g;->c()Lcom/airbnb/lottie/model/g;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1, p1, v0}, Lcom/airbnb/lottie/model/g;->d(Ljava/lang/String;Lcom/airbnb/lottie/k;)V

    .line 37
    .line 38
    .line 39
    :cond_3
    new-instance p1, Lcom/airbnb/lottie/d1;

    .line 40
    .line 41
    invoke-direct {p1, v0}, Lcom/airbnb/lottie/d1;-><init>(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    .line 44
    if-eqz p2, :cond_4

    .line 45
    .line 46
    invoke-static {p0}, Lcom/airbnb/lottie/utils/l;->c(Ljava/io/Closeable;)V

    .line 47
    .line 48
    .line 49
    :cond_4
    return-object p1

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_1

    .line 52
    :catch_0
    move-exception p1

    .line 53
    :try_start_2
    new-instance v0, Lcom/airbnb/lottie/d1;

    .line 54
    .line 55
    invoke-direct {v0, p1}, Lcom/airbnb/lottie/d1;-><init>(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 56
    .line 57
    .line 58
    if-eqz p2, :cond_5

    .line 59
    .line 60
    invoke-static {p0}, Lcom/airbnb/lottie/utils/l;->c(Ljava/io/Closeable;)V

    .line 61
    .line 62
    .line 63
    :cond_5
    return-object v0

    .line 64
    :goto_1
    if-eqz p2, :cond_6

    .line 65
    .line 66
    invoke-static {p0}, Lcom/airbnb/lottie/utils/l;->c(Ljava/io/Closeable;)V

    .line 67
    .line 68
    .line 69
    :cond_6
    throw p1
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
.end method

.method public static H(Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/f1;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/f1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/airbnb/lottie/m;

    invoke-direct {v0, p0, p1}, Lcom/airbnb/lottie/m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    invoke-static {p1, v0, p0}, Lcom/airbnb/lottie/d0;->r(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lcom/airbnb/lottie/f1;

    move-result-object p0

    return-object p0
.end method

.method public static I(Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/d1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lokio/y0;->u(Ljava/io/InputStream;)Lokio/n1;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lokio/y0;->e(Lokio/n1;)Lokio/BufferedSource;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Lcom/airbnb/lottie/parser/moshi/c;->A(Lokio/BufferedSource;)Lcom/airbnb/lottie/parser/moshi/c;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0, p1}, Lcom/airbnb/lottie/d0;->E(Lcom/airbnb/lottie/parser/moshi/c;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
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
.end method

.method public static J(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/d1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p1}, Lcom/airbnb/lottie/d0;->I(Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method public static K(Landroid/content/Context;I)Lcom/airbnb/lottie/f1;
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/RawRes;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I)",
            "Lcom/airbnb/lottie/f1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/airbnb/lottie/d0;->x0(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/airbnb/lottie/d0;->L(Landroid/content/Context;ILjava/lang/String;)Lcom/airbnb/lottie/f1;

    move-result-object p0

    return-object p0
.end method

.method public static L(Landroid/content/Context;ILjava/lang/String;)Lcom/airbnb/lottie/f1;
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/RawRes;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/f1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    new-instance v1, Lcom/airbnb/lottie/t;

    .line 11
    .line 12
    invoke-direct {v1, v0, p0, p1, p2}, Lcom/airbnb/lottie/t;-><init>(Ljava/lang/ref/WeakReference;Landroid/content/Context;ILjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    invoke-static {p2, v1, p0}, Lcom/airbnb/lottie/d0;->r(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lcom/airbnb/lottie/f1;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
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
.end method

.method public static M(Landroid/content/Context;I)Lcom/airbnb/lottie/d1;
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/RawRes;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I)",
            "Lcom/airbnb/lottie/d1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/airbnb/lottie/d0;->x0(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/airbnb/lottie/d0;->N(Landroid/content/Context;ILjava/lang/String;)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method public static N(Landroid/content/Context;ILjava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/RawRes;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/d1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-static {}, Lcom/airbnb/lottie/model/g;->c()Lcom/airbnb/lottie/model/g;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p2}, Lcom/airbnb/lottie/model/g;->b(Ljava/lang/String;)Lcom/airbnb/lottie/k;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    new-instance p0, Lcom/airbnb/lottie/d1;

    .line 16
    .line 17
    invoke-direct {p0, v0}, Lcom/airbnb/lottie/d1;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Lokio/y0;->u(Ljava/io/InputStream;)Lokio/n1;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, Lokio/y0;->e(Lokio/n1;)Lokio/BufferedSource;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, Lcom/airbnb/lottie/d0;->d0(Lokio/BufferedSource;)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    new-instance v0, Ljava/util/zip/ZipInputStream;

    .line 48
    .line 49
    invoke-interface {p1}, Lokio/BufferedSource;->z0()Ljava/io/InputStream;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-direct {v0, p1}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0, v0, p2}, Lcom/airbnb/lottie/d0;->W(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_2
    invoke-static {p1}, Lcom/airbnb/lottie/d0;->b0(Lokio/BufferedSource;)Ljava/lang/Boolean;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result p0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 69
    if-eqz p0, :cond_3

    .line 70
    .line 71
    :try_start_1
    new-instance p0, Ljava/util/zip/GZIPInputStream;

    .line 72
    .line 73
    invoke-interface {p1}, Lokio/BufferedSource;->z0()Ljava/io/InputStream;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {p0, p1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0, p2}, Lcom/airbnb/lottie/d0;->B(Ljava/io/InputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    .line 81
    .line 82
    .line 83
    move-result-object p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 84
    return-object p0

    .line 85
    :catch_0
    move-exception p0

    .line 86
    :try_start_2
    new-instance p1, Lcom/airbnb/lottie/d1;

    .line 87
    .line 88
    invoke-direct {p1, p0}, Lcom/airbnb/lottie/d1;-><init>(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    return-object p1

    .line 92
    :cond_3
    invoke-interface {p1}, Lokio/BufferedSource;->z0()Ljava/io/InputStream;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {p0, p2}, Lcom/airbnb/lottie/d0;->B(Ljava/io/InputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    .line 97
    .line 98
    .line 99
    move-result-object p0
    :try_end_2
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    .line 100
    return-object p0

    .line 101
    :catch_1
    move-exception p0

    .line 102
    new-instance p1, Lcom/airbnb/lottie/d1;

    .line 103
    .line 104
    invoke-direct {p1, p0}, Lcom/airbnb/lottie/d1;-><init>(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    return-object p1
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public static O(Landroid/content/Context;Ljava/lang/String;)Lcom/airbnb/lottie/f1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/f1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "url_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/airbnb/lottie/d0;->P(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/f1;

    move-result-object p0

    return-object p0
.end method

.method public static P(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/f1;
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/f1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/airbnb/lottie/b0;

    invoke-direct {v0, p0, p1, p2}, Lcom/airbnb/lottie/b0;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    invoke-static {p2, v0, p0}, Lcom/airbnb/lottie/d0;->r(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lcom/airbnb/lottie/f1;

    move-result-object p0

    return-object p0
.end method

.method public static Q(Landroid/content/Context;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 0
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/d1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1, p1}, Lcom/airbnb/lottie/d0;->R(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method public static R(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/d1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-static {}, Lcom/airbnb/lottie/model/g;->c()Lcom/airbnb/lottie/model/g;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p2}, Lcom/airbnb/lottie/model/g;->b(Ljava/lang/String;)Lcom/airbnb/lottie/k;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    new-instance p0, Lcom/airbnb/lottie/d1;

    .line 16
    .line 17
    invoke-direct {p0, v0}, Lcom/airbnb/lottie/d1;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-static {p0}, Lcom/airbnb/lottie/f;->i(Landroid/content/Context;)Lcom/airbnb/lottie/network/h;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p0, p1, p2}, Lcom/airbnb/lottie/network/h;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-eqz p2, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/airbnb/lottie/d1;->b()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    invoke-static {}, Lcom/airbnb/lottie/model/g;->c()Lcom/airbnb/lottie/model/g;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0}, Lcom/airbnb/lottie/d1;->b()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lcom/airbnb/lottie/k;

    .line 46
    .line 47
    invoke-virtual {p1, p2, v0}, Lcom/airbnb/lottie/model/g;->d(Ljava/lang/String;Lcom/airbnb/lottie/k;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    return-object p0
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
.end method

.method public static S(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lcom/airbnb/lottie/f1;
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/zip/ZipInputStream;",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/f1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/airbnb/lottie/v;

    invoke-direct {v0, p0, p1, p2}, Lcom/airbnb/lottie/v;-><init>(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)V

    new-instance p0, Lcom/airbnb/lottie/w;

    invoke-direct {p0, p1}, Lcom/airbnb/lottie/w;-><init>(Ljava/util/zip/ZipInputStream;)V

    invoke-static {p2, v0, p0}, Lcom/airbnb/lottie/d0;->r(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lcom/airbnb/lottie/f1;

    move-result-object p0

    return-object p0
.end method

.method public static T(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;Z)Lcom/airbnb/lottie/f1;
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/zip/ZipInputStream;",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/airbnb/lottie/f1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/airbnb/lottie/x;

    invoke-direct {v0, p0, p1, p2}, Lcom/airbnb/lottie/x;-><init>(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    new-instance p0, Lcom/airbnb/lottie/y;

    invoke-direct {p0, p1}, Lcom/airbnb/lottie/y;-><init>(Ljava/util/zip/ZipInputStream;)V

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {p2, v0, p0}, Lcom/airbnb/lottie/d0;->r(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lcom/airbnb/lottie/f1;

    move-result-object p0

    return-object p0
.end method

.method public static U(Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lcom/airbnb/lottie/f1;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/zip/ZipInputStream;",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/f1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0, p0, p1}, Lcom/airbnb/lottie/d0;->S(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lcom/airbnb/lottie/f1;

    move-result-object p0

    return-object p0
.end method

.method public static V(Ljava/util/zip/ZipInputStream;Ljava/lang/String;Z)Lcom/airbnb/lottie/f1;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/zip/ZipInputStream;",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/airbnb/lottie/f1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0, p0, p1, p2}, Lcom/airbnb/lottie/d0;->T(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;Z)Lcom/airbnb/lottie/f1;

    move-result-object p0

    return-object p0
.end method

.method public static W(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/zip/ZipInputStream;",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/d1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lcom/airbnb/lottie/d0;->X(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;Z)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method public static X(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;Z)Lcom/airbnb/lottie/d1;
    .locals 0
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/zip/ZipInputStream;",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/airbnb/lottie/d1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p0, p1, p2}, Lcom/airbnb/lottie/d0;->a0(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lcom/airbnb/lottie/utils/l;->c(Ljava/io/Closeable;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object p0

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    if-eqz p3, :cond_1

    .line 13
    .line 14
    invoke-static {p1}, Lcom/airbnb/lottie/utils/l;->c(Ljava/io/Closeable;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    throw p0
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
.end method

.method public static Y(Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/zip/ZipInputStream;",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/d1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lcom/airbnb/lottie/d0;->Z(Ljava/util/zip/ZipInputStream;Ljava/lang/String;Z)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method public static Z(Ljava/util/zip/ZipInputStream;Ljava/lang/String;Z)Lcom/airbnb/lottie/d1;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/zip/ZipInputStream;",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/airbnb/lottie/d1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0, p0, p1, p2}, Lcom/airbnb/lottie/d0;->X(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;Z)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 0

    invoke-static {p0, p1}, Lcom/airbnb/lottie/d0;->o0(Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method private static a0(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 12
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/zip/ZipInputStream;",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/d1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    move-object v3, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/airbnb/lottie/model/g;->c()Lcom/airbnb/lottie/model/g;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3, p2}, Lcom/airbnb/lottie/model/g;->b(Ljava/lang/String;)Lcom/airbnb/lottie/k;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    :goto_0
    if-eqz v3, :cond_1

    .line 25
    .line 26
    new-instance p0, Lcom/airbnb/lottie/d1;

    .line 27
    .line 28
    invoke-direct {p0, v3}, Lcom/airbnb/lottie/d1;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_1
    invoke-virtual {p1}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    move-object v4, v2

    .line 37
    :goto_1
    const/4 v5, 0x1

    .line 38
    const/4 v6, 0x0

    .line 39
    if-eqz v3, :cond_b

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    const-string v8, "__MACOSX"

    .line 46
    .line 47
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    if-eqz v8, :cond_2

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/util/zip/ZipInputStream;->closeEntry()V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_7

    .line 57
    .line 58
    :cond_2
    invoke-virtual {v3}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    const-string v9, "manifest.json"

    .line 63
    .line 64
    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    if-eqz v8, :cond_3

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/util/zip/ZipInputStream;->closeEntry()V

    .line 71
    .line 72
    .line 73
    goto/16 :goto_7

    .line 74
    .line 75
    :cond_3
    invoke-virtual {v3}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    const-string v8, ".json"

    .line 80
    .line 81
    invoke-virtual {v3, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_4

    .line 86
    .line 87
    invoke-static {p1}, Lokio/y0;->u(Ljava/io/InputStream;)Lokio/n1;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-static {v3}, Lokio/y0;->e(Lokio/n1;)Lokio/BufferedSource;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-static {v3}, Lcom/airbnb/lottie/parser/moshi/c;->A(Lokio/BufferedSource;)Lcom/airbnb/lottie/parser/moshi/c;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-static {v3, v2, v6}, Lcom/airbnb/lottie/d0;->G(Lcom/airbnb/lottie/parser/moshi/c;Ljava/lang/String;Z)Lcom/airbnb/lottie/d1;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {v3}, Lcom/airbnb/lottie/d1;->b()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    move-object v4, v3

    .line 108
    check-cast v4, Lcom/airbnb/lottie/k;

    .line 109
    .line 110
    goto/16 :goto_7

    .line 111
    .line 112
    :cond_4
    const-string v3, ".png"

    .line 113
    .line 114
    invoke-virtual {v7, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 115
    .line 116
    .line 117
    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 118
    const-string v8, "/"

    .line 119
    .line 120
    if-nez v3, :cond_a

    .line 121
    .line 122
    :try_start_1
    const-string v3, ".webp"

    .line 123
    .line 124
    invoke-virtual {v7, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-nez v3, :cond_a

    .line 129
    .line 130
    const-string v3, ".jpg"

    .line 131
    .line 132
    invoke-virtual {v7, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-nez v3, :cond_a

    .line 137
    .line 138
    const-string v3, ".jpeg"

    .line 139
    .line 140
    invoke-virtual {v7, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-eqz v3, :cond_5

    .line 145
    .line 146
    goto/16 :goto_6

    .line 147
    .line 148
    :cond_5
    const-string v3, ".ttf"

    .line 149
    .line 150
    invoke-virtual {v7, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-nez v3, :cond_7

    .line 155
    .line 156
    const-string v3, ".otf"

    .line 157
    .line 158
    invoke-virtual {v7, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    if-eqz v3, :cond_6

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_6
    invoke-virtual {p1}, Ljava/util/zip/ZipInputStream;->closeEntry()V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_7

    .line 169
    .line 170
    :cond_7
    :goto_2
    invoke-virtual {v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    array-length v7, v3

    .line 175
    sub-int/2addr v7, v5

    .line 176
    aget-object v3, v3, v7

    .line 177
    .line 178
    const-string v5, "\\."

    .line 179
    .line 180
    invoke-virtual {v3, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    aget-object v5, v5, v6

    .line 185
    .line 186
    new-instance v7, Ljava/io/File;

    .line 187
    .line 188
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    invoke-direct {v7, v8, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    new-instance v8, Ljava/io/FileOutputStream;

    .line 196
    .line 197
    invoke-direct {v8, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 198
    .line 199
    .line 200
    :try_start_2
    new-instance v8, Ljava/io/FileOutputStream;

    .line 201
    .line 202
    invoke-direct {v8, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 203
    .line 204
    .line 205
    const/16 v9, 0x1000

    .line 206
    .line 207
    :try_start_3
    new-array v9, v9, [B

    .line 208
    .line 209
    :goto_3
    invoke-virtual {p1, v9}, Ljava/io/InputStream;->read([B)I

    .line 210
    .line 211
    .line 212
    move-result v10

    .line 213
    const/4 v11, -0x1

    .line 214
    if-eq v10, v11, :cond_8

    .line 215
    .line 216
    invoke-virtual {v8, v9, v6, v10}, Ljava/io/OutputStream;->write([BII)V

    .line 217
    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_8
    invoke-virtual {v8}, Ljava/io/OutputStream;->flush()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 221
    .line 222
    .line 223
    :try_start_4
    invoke-virtual {v8}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 224
    .line 225
    .line 226
    goto :goto_5

    .line 227
    :catchall_0
    move-exception v6

    .line 228
    :try_start_5
    invoke-virtual {v8}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 229
    .line 230
    .line 231
    goto :goto_4

    .line 232
    :catchall_1
    move-exception v8

    .line 233
    :try_start_6
    invoke-virtual {v6, v8}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 234
    .line 235
    .line 236
    :goto_4
    throw v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 237
    :catchall_2
    move-exception v6

    .line 238
    :try_start_7
    new-instance v8, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 241
    .line 242
    .line 243
    const-string v9, "Unable to save font "

    .line 244
    .line 245
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    const-string v9, " to the temporary file: "

    .line 252
    .line 253
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    const-string v3, ". "

    .line 260
    .line 261
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    invoke-static {v3, v6}, Lcom/airbnb/lottie/utils/f;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 269
    .line 270
    .line 271
    :goto_5
    invoke-static {v7}, Landroid/graphics/Typeface;->createFromFile(Ljava/io/File;)Landroid/graphics/Typeface;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    .line 276
    .line 277
    .line 278
    move-result v6

    .line 279
    if-nez v6, :cond_9

    .line 280
    .line 281
    new-instance v6, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 284
    .line 285
    .line 286
    const-string v8, "Failed to delete temp font file "

    .line 287
    .line 288
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v7

    .line 295
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    const-string v7, "."

    .line 299
    .line 300
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    invoke-static {v6}, Lcom/airbnb/lottie/utils/f;->e(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    :cond_9
    invoke-interface {v1, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    goto :goto_7

    .line 314
    :cond_a
    :goto_6
    invoke-virtual {v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    array-length v6, v3

    .line 319
    sub-int/2addr v6, v5

    .line 320
    aget-object v3, v3, v6

    .line 321
    .line 322
    invoke-static {p1}, Lcom/huawei/agconnect/apms/instrument/BitmapFactoryInstrumentation;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    invoke-interface {v0, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    :goto_7
    invoke-virtual {p1}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    .line 330
    .line 331
    .line 332
    move-result-object v3
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1

    .line 333
    goto/16 :goto_1

    .line 334
    .line 335
    :cond_b
    if-nez v4, :cond_c

    .line 336
    .line 337
    new-instance p0, Lcom/airbnb/lottie/d1;

    .line 338
    .line 339
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 340
    .line 341
    const-string p2, "Unable to parse composition"

    .line 342
    .line 343
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    invoke-direct {p0, p1}, Lcom/airbnb/lottie/d1;-><init>(Ljava/lang/Throwable;)V

    .line 347
    .line 348
    .line 349
    return-object p0

    .line 350
    :cond_c
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    :cond_d
    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 359
    .line 360
    .line 361
    move-result p1

    .line 362
    if-eqz p1, :cond_e

    .line 363
    .line 364
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object p1

    .line 368
    check-cast p1, Ljava/util/Map$Entry;

    .line 369
    .line 370
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v3

    .line 374
    check-cast v3, Ljava/lang/String;

    .line 375
    .line 376
    invoke-static {v4, v3}, Lcom/airbnb/lottie/d0;->t(Lcom/airbnb/lottie/k;Ljava/lang/String;)Lcom/airbnb/lottie/y0;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    if-eqz v3, :cond_d

    .line 381
    .line 382
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object p1

    .line 386
    check-cast p1, Landroid/graphics/Bitmap;

    .line 387
    .line 388
    invoke-virtual {v3}, Lcom/airbnb/lottie/y0;->g()I

    .line 389
    .line 390
    .line 391
    move-result v7

    .line 392
    invoke-virtual {v3}, Lcom/airbnb/lottie/y0;->e()I

    .line 393
    .line 394
    .line 395
    move-result v8

    .line 396
    invoke-static {p1, v7, v8}, Lcom/airbnb/lottie/utils/l;->m(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    .line 397
    .line 398
    .line 399
    move-result-object p1

    .line 400
    invoke-virtual {v3, p1}, Lcom/airbnb/lottie/y0;->i(Landroid/graphics/Bitmap;)V

    .line 401
    .line 402
    .line 403
    goto :goto_8

    .line 404
    :cond_e
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 405
    .line 406
    .line 407
    move-result-object p0

    .line 408
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 409
    .line 410
    .line 411
    move-result-object p0

    .line 412
    :cond_f
    :goto_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 413
    .line 414
    .line 415
    move-result p1

    .line 416
    if-eqz p1, :cond_12

    .line 417
    .line 418
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object p1

    .line 422
    check-cast p1, Ljava/util/Map$Entry;

    .line 423
    .line 424
    invoke-virtual {v4}, Lcom/airbnb/lottie/k;->g()Ljava/util/Map;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    move v3, v6

    .line 437
    :cond_10
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 438
    .line 439
    .line 440
    move-result v7

    .line 441
    if-eqz v7, :cond_11

    .line 442
    .line 443
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v7

    .line 447
    check-cast v7, Lcom/airbnb/lottie/model/c;

    .line 448
    .line 449
    invoke-virtual {v7}, Lcom/airbnb/lottie/model/c;->b()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v8

    .line 453
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v9

    .line 457
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result v8

    .line 461
    if-eqz v8, :cond_10

    .line 462
    .line 463
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    check-cast v3, Landroid/graphics/Typeface;

    .line 468
    .line 469
    invoke-virtual {v7, v3}, Lcom/airbnb/lottie/model/c;->f(Landroid/graphics/Typeface;)V

    .line 470
    .line 471
    .line 472
    move v3, v5

    .line 473
    goto :goto_a

    .line 474
    :cond_11
    if-nez v3, :cond_f

    .line 475
    .line 476
    new-instance v1, Ljava/lang/StringBuilder;

    .line 477
    .line 478
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 479
    .line 480
    .line 481
    const-string v3, "Parsed font for "

    .line 482
    .line 483
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 484
    .line 485
    .line 486
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object p1

    .line 490
    check-cast p1, Ljava/lang/String;

    .line 491
    .line 492
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    const-string p1, " however it was not found in the animation."

    .line 496
    .line 497
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object p1

    .line 504
    invoke-static {p1}, Lcom/airbnb/lottie/utils/f;->e(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    goto :goto_9

    .line 508
    :cond_12
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 509
    .line 510
    .line 511
    move-result p0

    .line 512
    if-eqz p0, :cond_15

    .line 513
    .line 514
    invoke-virtual {v4}, Lcom/airbnb/lottie/k;->j()Ljava/util/Map;

    .line 515
    .line 516
    .line 517
    move-result-object p0

    .line 518
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 519
    .line 520
    .line 521
    move-result-object p0

    .line 522
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 523
    .line 524
    .line 525
    move-result-object p0

    .line 526
    :cond_13
    :goto_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 527
    .line 528
    .line 529
    move-result p1

    .line 530
    if-eqz p1, :cond_15

    .line 531
    .line 532
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object p1

    .line 536
    check-cast p1, Ljava/util/Map$Entry;

    .line 537
    .line 538
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object p1

    .line 542
    check-cast p1, Lcom/airbnb/lottie/y0;

    .line 543
    .line 544
    if-nez p1, :cond_14

    .line 545
    .line 546
    return-object v2

    .line 547
    :cond_14
    invoke-virtual {p1}, Lcom/airbnb/lottie/y0;->d()Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    .line 552
    .line 553
    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 554
    .line 555
    .line 556
    iput-boolean v5, v1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 557
    .line 558
    const/16 v3, 0xa0

    .line 559
    .line 560
    iput v3, v1, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 561
    .line 562
    const-string v3, "data:"

    .line 563
    .line 564
    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 565
    .line 566
    .line 567
    move-result v3

    .line 568
    if-eqz v3, :cond_13

    .line 569
    .line 570
    const-string v3, "base64,"

    .line 571
    .line 572
    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 573
    .line 574
    .line 575
    move-result v3

    .line 576
    if-lez v3, :cond_13

    .line 577
    .line 578
    const/16 v3, 0x2c

    .line 579
    .line 580
    :try_start_8
    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(I)I

    .line 581
    .line 582
    .line 583
    move-result v3

    .line 584
    add-int/2addr v3, v5

    .line 585
    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    invoke-static {v0, v6}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 590
    .line 591
    .line 592
    move-result-object v0
    :try_end_8
    .catch Ljava/lang/IllegalArgumentException; {:try_start_8 .. :try_end_8} :catch_0

    .line 593
    array-length v3, v0

    .line 594
    invoke-static {v0, v6, v3, v1}, Lcom/huawei/agconnect/apms/instrument/BitmapFactoryInstrumentation;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    invoke-virtual {p1, v0}, Lcom/airbnb/lottie/y0;->i(Landroid/graphics/Bitmap;)V

    .line 599
    .line 600
    .line 601
    goto :goto_b

    .line 602
    :catch_0
    move-exception p0

    .line 603
    const-string p1, "data URL did not have correct base64 format."

    .line 604
    .line 605
    invoke-static {p1, p0}, Lcom/airbnb/lottie/utils/f;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 606
    .line 607
    .line 608
    return-object v2

    .line 609
    :cond_15
    if-eqz p2, :cond_16

    .line 610
    .line 611
    invoke-static {}, Lcom/airbnb/lottie/model/g;->c()Lcom/airbnb/lottie/model/g;

    .line 612
    .line 613
    .line 614
    move-result-object p0

    .line 615
    invoke-virtual {p0, p2, v4}, Lcom/airbnb/lottie/model/g;->d(Ljava/lang/String;Lcom/airbnb/lottie/k;)V

    .line 616
    .line 617
    .line 618
    :cond_16
    new-instance p0, Lcom/airbnb/lottie/d1;

    .line 619
    .line 620
    invoke-direct {p0, v4}, Lcom/airbnb/lottie/d1;-><init>(Ljava/lang/Object;)V

    .line 621
    .line 622
    .line 623
    return-object p0

    .line 624
    :catch_1
    move-exception p0

    .line 625
    new-instance p1, Lcom/airbnb/lottie/d1;

    .line 626
    .line 627
    invoke-direct {p1, p0}, Lcom/airbnb/lottie/d1;-><init>(Ljava/lang/Throwable;)V

    .line 628
    .line 629
    .line 630
    return-object p1
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
.end method

.method public static synthetic b(Lcom/airbnb/lottie/parser/moshi/c;)V
    .locals 0

    invoke-static {p0}, Lcom/airbnb/lottie/d0;->m0(Lcom/airbnb/lottie/parser/moshi/c;)V

    return-void
.end method

.method private static b0(Lokio/BufferedSource;)Ljava/lang/Boolean;
    .locals 1

    sget-object v0, Lcom/airbnb/lottie/d0;->d:[B

    invoke-static {p0, v0}, Lcom/airbnb/lottie/d0;->v0(Lokio/BufferedSource;[B)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/airbnb/lottie/d0;->g0(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method private static c0(Landroid/content/Context;)Z
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p0, p0, 0x30

    const/16 v0, 0x20

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static synthetic d(Ljava/lang/ref/WeakReference;Landroid/content/Context;ILjava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/airbnb/lottie/d0;->p0(Ljava/lang/ref/WeakReference;Landroid/content/Context;ILjava/lang/String;)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method private static d0(Lokio/BufferedSource;)Ljava/lang/Boolean;
    .locals 1

    sget-object v0, Lcom/airbnb/lottie/d0;->c:[B

    invoke-static {p0, v0}, Lcom/airbnb/lottie/d0;->v0(Lokio/BufferedSource;[B)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/airbnb/lottie/k;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/airbnb/lottie/d0;->e0(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/airbnb/lottie/k;)V

    return-void
.end method

.method private static synthetic e0(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/airbnb/lottie/k;)V
    .locals 0

    .line 1
    sget-object p2, Lcom/airbnb/lottie/d0;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p2, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p2}, Ljava/util/Map;->size()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    invoke-static {p0}, Lcom/airbnb/lottie/d0;->w0(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
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
.end method

.method public static synthetic f(Ljava/io/InputStream;Ljava/lang/String;Z)Lcom/airbnb/lottie/d1;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/airbnb/lottie/d0;->k0(Ljava/io/InputStream;Ljava/lang/String;Z)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic f0(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    sget-object p2, Lcom/airbnb/lottie/d0;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p2, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p2}, Ljava/util/Map;->size()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    invoke-static {p0}, Lcom/airbnb/lottie/d0;->w0(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
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
.end method

.method public static synthetic g(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/airbnb/lottie/d0;->f0(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static synthetic g0(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/airbnb/lottie/d0;->x(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/airbnb/lottie/d0;->r0(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic h0(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/airbnb/lottie/d0;->J(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/util/zip/ZipInputStream;)V
    .locals 0

    invoke-static {p0}, Lcom/airbnb/lottie/d0;->u0(Ljava/util/zip/ZipInputStream;)V

    return-void
.end method

.method private static synthetic i0(Ljava/io/InputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/airbnb/lottie/d0;->B(Ljava/io/InputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/io/InputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 0

    invoke-static {p0, p1}, Lcom/airbnb/lottie/d0;->i0(Ljava/io/InputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic j0(Ljava/io/InputStream;)V
    .locals 0

    invoke-static {p0}, Lcom/airbnb/lottie/utils/l;->c(Ljava/io/Closeable;)V

    return-void
.end method

.method public static synthetic k(ZLjava/io/InputStream;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/airbnb/lottie/d0;->l0(ZLjava/io/InputStream;)V

    return-void
.end method

.method private static synthetic k0(Ljava/io/InputStream;Ljava/lang/String;Z)Lcom/airbnb/lottie/d1;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/airbnb/lottie/d0;->C(Ljava/io/InputStream;Ljava/lang/String;Z)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/airbnb/lottie/parser/moshi/c;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 0

    invoke-static {p0, p1}, Lcom/airbnb/lottie/d0;->n0(Lcom/airbnb/lottie/parser/moshi/c;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic l0(ZLjava/io/InputStream;)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {p1}, Lcom/airbnb/lottie/utils/l;->c(Ljava/io/Closeable;)V

    :cond_0
    return-void
.end method

.method public static synthetic m(Ljava/util/zip/ZipInputStream;)V
    .locals 0

    invoke-static {p0}, Lcom/airbnb/lottie/d0;->s0(Ljava/util/zip/ZipInputStream;)V

    return-void
.end method

.method private static synthetic m0(Lcom/airbnb/lottie/parser/moshi/c;)V
    .locals 0

    invoke-static {p0}, Lcom/airbnb/lottie/utils/l;->c(Ljava/io/Closeable;)V

    return-void
.end method

.method public static synthetic n(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/airbnb/lottie/d0;->q0(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic n0(Lcom/airbnb/lottie/parser/moshi/c;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/airbnb/lottie/d0;->E(Lcom/airbnb/lottie/parser/moshi/c;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/airbnb/lottie/d0;->t0(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic o0(Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/airbnb/lottie/d0;->I(Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 0

    invoke-static {p0, p1}, Lcom/airbnb/lottie/d0;->h0(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic p0(Ljava/lang/ref/WeakReference;Landroid/content/Context;ILjava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroid/content/Context;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    move-object p1, p0

    .line 10
    :cond_0
    invoke-static {p1, p2, p3}, Lcom/airbnb/lottie/d0;->N(Landroid/content/Context;ILjava/lang/String;)Lcom/airbnb/lottie/d1;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
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
.end method

.method public static synthetic q(Ljava/io/InputStream;)V
    .locals 0

    invoke-static {p0}, Lcom/airbnb/lottie/d0;->j0(Ljava/io/InputStream;)V

    return-void
.end method

.method private static synthetic q0(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/airbnb/lottie/f;->i(Landroid/content/Context;)Lcom/airbnb/lottie/network/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0, p1, p2}, Lcom/airbnb/lottie/network/h;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/airbnb/lottie/d1;->b()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-static {}, Lcom/airbnb/lottie/model/g;->c()Lcom/airbnb/lottie/model/g;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0}, Lcom/airbnb/lottie/d1;->b()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lcom/airbnb/lottie/k;

    .line 26
    .line 27
    invoke-virtual {p1, p2, v0}, Lcom/airbnb/lottie/model/g;->d(Ljava/lang/String;Lcom/airbnb/lottie/k;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-object p0
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
.end method

.method private static r(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lcom/airbnb/lottie/f1;
    .locals 3
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/Callable<",
            "Lcom/airbnb/lottie/d1<",
            "Lcom/airbnb/lottie/k;",
            ">;>;",
            "Ljava/lang/Runnable;",
            ")",
            "Lcom/airbnb/lottie/f1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    move-object v1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Lcom/airbnb/lottie/model/g;->c()Lcom/airbnb/lottie/model/g;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1, p0}, Lcom/airbnb/lottie/model/g;->b(Ljava/lang/String;)Lcom/airbnb/lottie/k;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    if-eqz v1, :cond_1

    .line 15
    .line 16
    new-instance v0, Lcom/airbnb/lottie/f1;

    .line 17
    .line 18
    invoke-direct {v0, v1}, Lcom/airbnb/lottie/f1;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    if-eqz p0, :cond_2

    .line 22
    .line 23
    sget-object v1, Lcom/airbnb/lottie/d0;->a:Ljava/util/Map;

    .line 24
    .line 25
    invoke-interface {v1, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lcom/airbnb/lottie/f1;

    .line 36
    .line 37
    :cond_2
    if-eqz v0, :cond_4

    .line 38
    .line 39
    if-eqz p2, :cond_3

    .line 40
    .line 41
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 42
    .line 43
    .line 44
    :cond_3
    return-object v0

    .line 45
    :cond_4
    new-instance p2, Lcom/airbnb/lottie/f1;

    .line 46
    .line 47
    invoke-direct {p2, p1}, Lcom/airbnb/lottie/f1;-><init>(Ljava/util/concurrent/Callable;)V

    .line 48
    .line 49
    .line 50
    if-eqz p0, :cond_5

    .line 51
    .line 52
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 56
    .line 57
    .line 58
    new-instance v1, Lcom/airbnb/lottie/p;

    .line 59
    .line 60
    invoke-direct {v1, p0, p1}, Lcom/airbnb/lottie/p;-><init>(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, v1}, Lcom/airbnb/lottie/f1;->d(Lcom/airbnb/lottie/z0;)Lcom/airbnb/lottie/f1;

    .line 64
    .line 65
    .line 66
    new-instance v1, Lcom/airbnb/lottie/q;

    .line 67
    .line 68
    invoke-direct {v1, p0, p1}, Lcom/airbnb/lottie/q;-><init>(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, v1}, Lcom/airbnb/lottie/f1;->c(Lcom/airbnb/lottie/z0;)Lcom/airbnb/lottie/f1;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-nez p1, :cond_5

    .line 79
    .line 80
    sget-object p1, Lcom/airbnb/lottie/d0;->a:Ljava/util/Map;

    .line 81
    .line 82
    invoke-interface {p1, p0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    const/4 p1, 0x1

    .line 90
    if-ne p0, p1, :cond_5

    .line 91
    .line 92
    invoke-static {v0}, Lcom/airbnb/lottie/d0;->w0(Z)V

    .line 93
    .line 94
    .line 95
    :cond_5
    return-object p2
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
.end method

.method private static synthetic r0(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/airbnb/lottie/d0;->W(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method public static s(Landroid/content/Context;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/airbnb/lottie/d0;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/airbnb/lottie/model/g;->c()Lcom/airbnb/lottie/model/g;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/airbnb/lottie/model/g;->a()V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lcom/airbnb/lottie/f;->h(Landroid/content/Context;)Lcom/airbnb/lottie/network/g;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/airbnb/lottie/network/g;->a()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
    .line 23
    .line 24
.end method

.method private static synthetic s0(Ljava/util/zip/ZipInputStream;)V
    .locals 0

    invoke-static {p0}, Lcom/airbnb/lottie/utils/l;->c(Ljava/io/Closeable;)V

    return-void
.end method

.method private static t(Lcom/airbnb/lottie/k;Ljava/lang/String;)Lcom/airbnb/lottie/y0;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/airbnb/lottie/k;->j()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcom/airbnb/lottie/y0;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/airbnb/lottie/y0;->d()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_1
    const/4 p0, 0x0

    .line 37
    return-object p0
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
.end method

.method private static synthetic t0(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/airbnb/lottie/d0;->W(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    move-result-object p0

    return-object p0
.end method

.method public static u(Landroid/content/Context;Ljava/lang/String;)Lcom/airbnb/lottie/f1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/f1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "asset_"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {p0, p1, v0}, Lcom/airbnb/lottie/d0;->v(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/f1;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
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
.end method

.method private static synthetic u0(Ljava/util/zip/ZipInputStream;)V
    .locals 0

    invoke-static {p0}, Lcom/airbnb/lottie/utils/l;->c(Ljava/io/Closeable;)V

    return-void
.end method

.method public static v(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/f1;
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/f1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Lcom/airbnb/lottie/s;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1, p2}, Lcom/airbnb/lottie/s;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    invoke-static {p2, v0, p0}, Lcom/airbnb/lottie/d0;->r(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lcom/airbnb/lottie/f1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
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
.end method

.method private static v0(Lokio/BufferedSource;[B)Ljava/lang/Boolean;
    .locals 4

    .line 1
    :try_start_0
    invoke-interface {p0}, Lokio/BufferedSource;->peek()Lokio/BufferedSource;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p1

    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    if-ge v1, v0, :cond_1

    .line 8
    .line 9
    aget-byte v2, p1, v1

    .line 10
    .line 11
    invoke-interface {p0}, Lokio/BufferedSource;->readByte()B

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eq v3, v2, :cond_0

    .line 16
    .line 17
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-interface {p0}, Lokio/n1;->close()V

    .line 24
    .line 25
    .line 26
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    return-object p0

    .line 29
    :catch_0
    move-exception p0

    .line 30
    const-string p1, "Failed to check zip file header"

    .line 31
    .line 32
    invoke-static {p1, p0}, Lcom/airbnb/lottie/utils/f;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 36
    .line 37
    return-object p0

    .line 38
    :catch_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 39
    .line 40
    return-object p0
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
.end method

.method public static w(Landroid/content/Context;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 2
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/d1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "asset_"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {p0, p1, v0}, Lcom/airbnb/lottie/d0;->x(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
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
.end method

.method private static w0(Z)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    sget-object v1, Lcom/airbnb/lottie/d0;->b:Ljava/util/Set;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-ge v1, v2, :cond_0

    .line 14
    .line 15
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lcom/airbnb/lottie/g1;

    .line 20
    .line 21
    invoke-interface {v2, p0}, Lcom/airbnb/lottie/g1;->a(Z)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
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
.end method

.method public static x(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/d1;
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/d1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-static {}, Lcom/airbnb/lottie/model/g;->c()Lcom/airbnb/lottie/model/g;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p2}, Lcom/airbnb/lottie/model/g;->b(Ljava/lang/String;)Lcom/airbnb/lottie/k;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    new-instance p0, Lcom/airbnb/lottie/d1;

    .line 16
    .line 17
    invoke-direct {p0, v0}, Lcom/airbnb/lottie/d1;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Lokio/y0;->u(Ljava/io/InputStream;)Lokio/n1;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, Lokio/y0;->e(Lokio/n1;)Lokio/BufferedSource;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, Lcom/airbnb/lottie/d0;->d0(Lokio/BufferedSource;)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    new-instance v0, Ljava/util/zip/ZipInputStream;

    .line 48
    .line 49
    invoke-interface {p1}, Lokio/BufferedSource;->z0()Ljava/io/InputStream;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-direct {v0, p1}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0, v0, p2}, Lcom/airbnb/lottie/d0;->W(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_2
    invoke-static {p1}, Lcom/airbnb/lottie/d0;->b0(Lokio/BufferedSource;)Ljava/lang/Boolean;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-eqz p0, :cond_3

    .line 70
    .line 71
    new-instance p0, Ljava/util/zip/GZIPInputStream;

    .line 72
    .line 73
    invoke-interface {p1}, Lokio/BufferedSource;->z0()Ljava/io/InputStream;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {p0, p1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0, p2}, Lcom/airbnb/lottie/d0;->B(Ljava/io/InputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :cond_3
    invoke-interface {p1}, Lokio/BufferedSource;->z0()Ljava/io/InputStream;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p0, p2}, Lcom/airbnb/lottie/d0;->B(Ljava/io/InputStream;Ljava/lang/String;)Lcom/airbnb/lottie/d1;

    .line 90
    .line 91
    .line 92
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    return-object p0

    .line 94
    :catch_0
    move-exception p0

    .line 95
    new-instance p1, Lcom/airbnb/lottie/d1;

    .line 96
    .line 97
    invoke-direct {p1, p0}, Lcom/airbnb/lottie/d1;-><init>(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    return-object p1
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
.end method

.method private static x0(Landroid/content/Context;I)Ljava/lang/String;
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/RawRes;
        .end annotation
    .end param

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "rawRes"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lcom/airbnb/lottie/d0;->c0(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "_night_"

    goto :goto_0

    :cond_0
    const-string p0, "_day_"

    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static y(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/airbnb/lottie/f1;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/f1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lcom/airbnb/lottie/c0;

    invoke-direct {v0, p0, p1}, Lcom/airbnb/lottie/c0;-><init>(Lorg/json/JSONObject;Ljava/lang/String;)V

    const/4 p0, 0x0

    invoke-static {p1, v0, p0}, Lcom/airbnb/lottie/d0;->r(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lcom/airbnb/lottie/f1;

    move-result-object p0

    return-object p0
.end method

.method public static y0(Lcom/airbnb/lottie/g1;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/airbnb/lottie/d0;->b:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/airbnb/lottie/d0;->a:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-interface {p0, v0}, Lcom/airbnb/lottie/g1;->a(Z)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static z(Ljava/io/InputStream;Ljava/lang/String;)Lcom/airbnb/lottie/f1;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "Ljava/lang/String;",
            ")",
            "Lcom/airbnb/lottie/f1<",
            "Lcom/airbnb/lottie/k;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/airbnb/lottie/n;

    invoke-direct {v0, p0, p1}, Lcom/airbnb/lottie/n;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    new-instance v1, Lcom/airbnb/lottie/o;

    invoke-direct {v1, p0}, Lcom/airbnb/lottie/o;-><init>(Ljava/io/InputStream;)V

    invoke-static {p1, v0, v1}, Lcom/airbnb/lottie/d0;->r(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lcom/airbnb/lottie/f1;

    move-result-object p0

    return-object p0
.end method

.method public static z0(I)V
    .locals 1

    invoke-static {}, Lcom/airbnb/lottie/model/g;->c()Lcom/airbnb/lottie/model/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/airbnb/lottie/model/g;->e(I)V

    return-void
.end method
