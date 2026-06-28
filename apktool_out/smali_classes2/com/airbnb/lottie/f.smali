.class public Lcom/airbnb/lottie/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# static fields
.field public static a:Z = false

.field public static final b:Ljava/lang/String; = "LOTTIE"

.field private static c:Z = false

.field private static d:Z = true

.field private static e:Z = true

.field private static f:Lcom/airbnb/lottie/a;

.field private static g:Lcom/airbnb/lottie/network/f;

.field private static h:Lcom/airbnb/lottie/network/e;

.field private static volatile i:Lcom/airbnb/lottie/network/h;

.field private static volatile j:Lcom/airbnb/lottie/network/g;

.field private static k:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lcom/airbnb/lottie/utils/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/airbnb/lottie/a;->AUTOMATIC:Lcom/airbnb/lottie/a;

    sput-object v0, Lcom/airbnb/lottie/f;->f:Lcom/airbnb/lottie/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;)Ljava/io/File;
    .locals 0

    invoke-static {p0}, Lcom/airbnb/lottie/f;->g(Landroid/content/Context;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/airbnb/lottie/f;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {}, Lcom/airbnb/lottie/f;->f()Lcom/airbnb/lottie/utils/h;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p0}, Lcom/airbnb/lottie/utils/h;->a(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
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
.end method

.method public static c(Ljava/lang/String;)F
    .locals 1

    .line 1
    sget-boolean v0, Lcom/airbnb/lottie/f;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    invoke-static {}, Lcom/airbnb/lottie/f;->f()Lcom/airbnb/lottie/utils/h;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p0}, Lcom/airbnb/lottie/utils/h;->b(Ljava/lang/String;)F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static d()Lcom/airbnb/lottie/a;
    .locals 1

    sget-object v0, Lcom/airbnb/lottie/f;->f:Lcom/airbnb/lottie/a;

    return-object v0
.end method

.method public static e()Z
    .locals 1

    sget-boolean v0, Lcom/airbnb/lottie/f;->e:Z

    return v0
.end method

.method private static f()Lcom/airbnb/lottie/utils/h;
    .locals 2

    .line 1
    sget-object v0, Lcom/airbnb/lottie/f;->k:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/airbnb/lottie/utils/h;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lcom/airbnb/lottie/utils/h;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/airbnb/lottie/utils/h;-><init>()V

    .line 14
    .line 15
    .line 16
    sget-object v1, Lcom/airbnb/lottie/f;->k:Ljava/lang/ThreadLocal;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object v0
.end method

.method private static synthetic g(Landroid/content/Context;)Ljava/io/File;
    .locals 2

    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p0

    const-string v1, "lottie_network_cache"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static h(Landroid/content/Context;)Lcom/airbnb/lottie/network/g;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    sget-boolean v0, Lcom/airbnb/lottie/f;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object v0, Lcom/airbnb/lottie/f;->j:Lcom/airbnb/lottie/network/g;

    .line 12
    .line 13
    if-nez v0, :cond_3

    .line 14
    .line 15
    const-class v1, Lcom/airbnb/lottie/network/g;

    .line 16
    .line 17
    monitor-enter v1

    .line 18
    :try_start_0
    sget-object v0, Lcom/airbnb/lottie/f;->j:Lcom/airbnb/lottie/network/g;

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    new-instance v0, Lcom/airbnb/lottie/network/g;

    .line 23
    .line 24
    sget-object v2, Lcom/airbnb/lottie/f;->h:Lcom/airbnb/lottie/network/e;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    new-instance v2, Lcom/airbnb/lottie/e;

    .line 30
    .line 31
    invoke-direct {v2, p0}, Lcom/airbnb/lottie/e;-><init>(Landroid/content/Context;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-direct {v0, v2}, Lcom/airbnb/lottie/network/g;-><init>(Lcom/airbnb/lottie/network/e;)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lcom/airbnb/lottie/f;->j:Lcom/airbnb/lottie/network/g;

    .line 38
    .line 39
    :cond_2
    monitor-exit v1

    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    throw p0

    .line 44
    :cond_3
    :goto_1
    return-object v0
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

.method public static i(Landroid/content/Context;)Lcom/airbnb/lottie/network/h;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/airbnb/lottie/f;->i:Lcom/airbnb/lottie/network/h;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    const-class v1, Lcom/airbnb/lottie/network/h;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    sget-object v0, Lcom/airbnb/lottie/f;->i:Lcom/airbnb/lottie/network/h;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    new-instance v0, Lcom/airbnb/lottie/network/h;

    .line 13
    .line 14
    invoke-static {p0}, Lcom/airbnb/lottie/f;->h(Landroid/content/Context;)Lcom/airbnb/lottie/network/g;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object v2, Lcom/airbnb/lottie/f;->g:Lcom/airbnb/lottie/network/f;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v2, Lcom/airbnb/lottie/network/b;

    .line 24
    .line 25
    invoke-direct {v2}, Lcom/airbnb/lottie/network/b;-><init>()V

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-direct {v0, p0, v2}, Lcom/airbnb/lottie/network/h;-><init>(Lcom/airbnb/lottie/network/g;Lcom/airbnb/lottie/network/f;)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lcom/airbnb/lottie/f;->i:Lcom/airbnb/lottie/network/h;

    .line 32
    .line 33
    :cond_1
    monitor-exit v1

    .line 34
    goto :goto_1

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    throw p0

    .line 38
    :cond_2
    :goto_1
    return-object v0
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

.method public static j(Lcom/airbnb/lottie/network/e;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/airbnb/lottie/f;->h:Lcom/airbnb/lottie/network/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    :cond_0
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    :cond_1
    return-void

    .line 16
    :cond_2
    sput-object p0, Lcom/airbnb/lottie/f;->h:Lcom/airbnb/lottie/network/e;

    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    sput-object p0, Lcom/airbnb/lottie/f;->j:Lcom/airbnb/lottie/network/g;

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
.end method

.method public static k(Lcom/airbnb/lottie/a;)V
    .locals 0

    sput-object p0, Lcom/airbnb/lottie/f;->f:Lcom/airbnb/lottie/a;

    return-void
.end method

.method public static l(Z)V
    .locals 0

    sput-boolean p0, Lcom/airbnb/lottie/f;->e:Z

    return-void
.end method

.method public static m(Lcom/airbnb/lottie/network/f;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/airbnb/lottie/f;->g:Lcom/airbnb/lottie/network/f;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    :cond_0
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    :cond_1
    return-void

    .line 16
    :cond_2
    sput-object p0, Lcom/airbnb/lottie/f;->g:Lcom/airbnb/lottie/network/f;

    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    sput-object p0, Lcom/airbnb/lottie/f;->i:Lcom/airbnb/lottie/network/h;

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
.end method

.method public static n(Z)V
    .locals 0

    sput-boolean p0, Lcom/airbnb/lottie/f;->d:Z

    return-void
.end method

.method public static o(Z)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/airbnb/lottie/f;->c:Z

    .line 2
    .line 3
    if-ne v0, p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sput-boolean p0, Lcom/airbnb/lottie/f;->c:Z

    .line 7
    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    sget-object p0, Lcom/airbnb/lottie/f;->k:Ljava/lang/ThreadLocal;

    .line 11
    .line 12
    if-nez p0, :cond_1

    .line 13
    .line 14
    new-instance p0, Ljava/lang/ThreadLocal;

    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 17
    .line 18
    .line 19
    sput-object p0, Lcom/airbnb/lottie/f;->k:Ljava/lang/ThreadLocal;

    .line 20
    .line 21
    :cond_1
    return-void
    .line 22
    .line 23
    .line 24
.end method
