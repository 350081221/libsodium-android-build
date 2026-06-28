.class public final Lcom/yuanqi/master/network/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u0002H\u000c\"\u0006\u0008\u0000\u0010\u000c\u0018\u0001H\u0086\u0008\u00a2\u0006\u0002\u0010\rJ)\u0010\u000b\u001a\u0002H\u000c\"\u0004\u0008\u0000\u0010\u000c2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u0002H\u000c0\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012JO\u0010\u0013\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u000c0\u00150\u0014\"\u0004\u0008\u0000\u0010\u000c2\u0006\u0010\u0016\u001a\u00020\u00172\"\u0010\u0018\u001a\u001e\u0008\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u000c0\u00150\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u001e\u001a\n  *\u0004\u0018\u00010\u001f0\u001f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006!"
    }
    d2 = {
        "Lcom/yuanqi/master/network/ServiceCreator;",
        "",
        "()V",
        "DEBUG",
        "",
        "baseUrl",
        "",
        "lbsDataRepository",
        "loggingInterceptor",
        "Lokhttp3/logging/HttpLoggingInterceptor;",
        "tiandiMap",
        "create",
        "T",
        "()Ljava/lang/Object;",
        "serviceClass",
        "Ljava/lang/Class;",
        "type",
        "",
        "(Ljava/lang/Class;I)Ljava/lang/Object;",
        "fire",
        "Landroidx/lifecycle/LiveData;",
        "Lkotlin/Result;",
        "context",
        "Lkotlin/coroutines/CoroutineContext;",
        "block",
        "Lkotlin/Function1;",
        "Lkotlin/coroutines/Continuation;",
        "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/LiveData;",
        "getOkHttpClient",
        "Lokhttp3/OkHttpClient;",
        "getRetrofit",
        "Lretrofit2/Retrofit;",
        "kotlin.jvm.PlatformType",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcom/yuanqi/master/network/c;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final b:Z = false

.field private static final c:Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final d:Ljava/lang/String; = "https://api.tianditu.gov.cn"
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final e:Ljava/lang/String; = "http://vip.cellocation.com"
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final f:Lokhttp3/logging/HttpLoggingInterceptor;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/yuanqi/master/network/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/yuanqi/master/network/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/yuanqi/master/network/c;->a:Lcom/yuanqi/master/network/c;

    .line 7
    .line 8
    const-string v0, "https://api.yqdk.com"

    .line 9
    .line 10
    sput-object v0, Lcom/yuanqi/master/network/c;->c:Ljava/lang/String;

    .line 11
    .line 12
    new-instance v0, Lokhttp3/logging/HttpLoggingInterceptor;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v1}, Lokhttp3/logging/HttpLoggingInterceptor;-><init>(Lokhttp3/logging/HttpLoggingInterceptor$Logger;ILkotlin/jvm/internal/w;)V

    .line 17
    .line 18
    .line 19
    sget-object v1, Lokhttp3/logging/HttpLoggingInterceptor$Level;->BODY:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lokhttp3/logging/HttpLoggingInterceptor;->level(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lcom/yuanqi/master/network/c;->f:Lokhttp3/logging/HttpLoggingInterceptor;

    .line 25
    .line 26
    const/16 v0, 0x8

    .line 27
    .line 28
    sput v0, Lcom/yuanqi/master/network/c;->g:I

    .line 29
    .line 30
    return-void
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
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/yuanqi/master/network/c;->g(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result p0

    return p0
.end method

.method public static synthetic d(Lcom/yuanqi/master/network/c;Ljava/lang/Class;IILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/network/c;->c(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final f(I)Lokhttp3/OkHttpClient;
    .locals 3

    .line 1
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lw2/a;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Lw2/a;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    .line 12
    .line 13
    .line 14
    const-wide/16 v1, 0x6

    .line 15
    .line 16
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2, p1}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 19
    .line 20
    .line 21
    new-instance p1, Lw2/b;

    .line 22
    .line 23
    invoke-direct {p1}, Lw2/b;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v1, Lcom/yuanqi/master/network/b;

    .line 31
    .line 32
    invoke-direct {v1}, Lcom/yuanqi/master/network/b;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v1}, Lokhttp3/OkHttpClient$Builder;->hostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)Lokhttp3/OkHttpClient$Builder;

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->build(Lokhttp3/OkHttpClient$Builder;)Lokhttp3/OkHttpClient;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
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
.end method

.method private static final g(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method private final h(I)Lretrofit2/Retrofit;
    .locals 2

    .line 1
    new-instance v0, Lretrofit2/Retrofit$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lretrofit2/Retrofit$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-eq p1, v1, :cond_1

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    if-eq p1, v1, :cond_0

    .line 11
    .line 12
    sget-object v1, Lcom/yuanqi/master/network/c;->c:Ljava/lang/String;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v1, "http://vip.cellocation.com"

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const-string v1, "https://api.tianditu.gov.cn"

    .line 19
    .line 20
    :goto_0
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-direct {p0, p1}, Lcom/yuanqi/master/network/c;->f(I)Lokhttp3/OkHttpClient;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {v0, p1}, Lretrofit2/Retrofit$Builder;->client(Lokhttp3/OkHttpClient;)Lretrofit2/Retrofit$Builder;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {}, Lretrofit2/converter/gson/GsonConverterFactory;->create()Lretrofit2/converter/gson/GsonConverterFactory;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p1, v0}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1
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
.end method


# virtual methods
.method public final synthetic b()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()TT;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x4

    .line 2
    const-string v1, "T"

    .line 3
    .line 4
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->y(ILjava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    const/4 v1, 0x0

    .line 9
    const-class v2, Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-static {p0, v2, v3, v0, v1}, Lcom/yuanqi/master/network/c;->d(Lcom/yuanqi/master/network/c;Ljava/lang/Class;IILjava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final c(Ljava/lang/Class;I)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;I)TT;"
        }
    .end annotation

    .line 1
    const-string v0, "serviceClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p2}, Lcom/yuanqi/master/network/c;->h(I)Lretrofit2/Retrofit;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {p2, p1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
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
.end method

.method public final e(Lkotlin/coroutines/g;Lv3/l;)Landroidx/lifecycle/LiveData;
    .locals 7
    .param p1    # Lkotlin/coroutines/g;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/coroutines/g;",
            "Lv3/l<",
            "-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/d1<",
            "+TT;>;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "Landroidx/lifecycle/LiveData<",
            "Lkotlin/d1<",
            "TT;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "block"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    new-instance v4, Lcom/yuanqi/master/network/c$a;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {v4, p2, v0}, Lcom/yuanqi/master/network/c$a;-><init>(Lv3/l;Lkotlin/coroutines/d;)V

    .line 17
    .line 18
    .line 19
    const/4 v5, 0x2

    .line 20
    const/4 v6, 0x0

    .line 21
    move-object v1, p1

    .line 22
    invoke-static/range {v1 .. v6}, Landroidx/lifecycle/CoroutineLiveDataKt;->liveData$default(Lkotlin/coroutines/g;JLv3/p;ILjava/lang/Object;)Landroidx/lifecycle/LiveData;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
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
