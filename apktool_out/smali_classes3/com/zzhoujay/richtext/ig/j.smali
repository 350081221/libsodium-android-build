.class Lcom/zzhoujay/richtext/ig/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zzhoujay/richtext/ig/j$d;,
        Lcom/zzhoujay/richtext/ig/j$b;,
        Lcom/zzhoujay/richtext/ig/j$e;,
        Lcom/zzhoujay/richtext/ig/j$f;,
        Lcom/zzhoujay/richtext/ig/j$c;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/zzhoujay/richtext/ig/j$e;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/zzhoujay/richtext/ig/j$c;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lcom/zzhoujay/richtext/ig/j$a;

    invoke-direct {v0, p0}, Lcom/zzhoujay/richtext/ig/j$a;-><init>(Lcom/zzhoujay/richtext/ig/j;)V

    iput-object v0, p0, Lcom/zzhoujay/richtext/ig/j;->b:Lcom/zzhoujay/richtext/ig/j$c;

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/zzhoujay/richtext/ig/j;->a:Ljava/util/HashMap;

    return-void
.end method

.method synthetic constructor <init>(Lcom/zzhoujay/richtext/ig/j$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zzhoujay/richtext/ig/j;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/zzhoujay/richtext/ig/j;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lcom/zzhoujay/richtext/ig/j;->a:Ljava/util/HashMap;

    return-object p0
.end method

.method private static c()Ljava/util/concurrent/ExecutorService;
    .locals 1

    invoke-static {}, Lcom/zzhoujay/richtext/ig/j$b;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method static d()Lcom/zzhoujay/richtext/ig/j;
    .locals 1

    invoke-static {}, Lcom/zzhoujay/richtext/ig/j$d;->a()Lcom/zzhoujay/richtext/ig/j;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method b(Lcom/zzhoujay/richtext/c;Lcom/zzhoujay/richtext/ig/i;Lcom/zzhoujay/richtext/ig/d;)Lcom/zzhoujay/richtext/ig/e;
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/richtext/c;->g()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/zzhoujay/richtext/ig/j;->a:Ljava/util/HashMap;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-object v2, p0, Lcom/zzhoujay/richtext/ig/j;->a:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lcom/zzhoujay/richtext/ig/j$e;

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    new-instance v2, Lcom/zzhoujay/richtext/ig/j$e;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/zzhoujay/richtext/c;->k()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object v3, p0, Lcom/zzhoujay/richtext/ig/j;->b:Lcom/zzhoujay/richtext/ig/j$c;

    .line 25
    .line 26
    invoke-direct {v2, p1, v0, p2, v3}, Lcom/zzhoujay/richtext/ig/j$e;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/zzhoujay/richtext/ig/i;Lcom/zzhoujay/richtext/ig/j$c;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/zzhoujay/richtext/ig/j;->a:Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-static {}, Lcom/zzhoujay/richtext/ig/j;->c()Ljava/util/concurrent/ExecutorService;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {v2, p1, p3}, Lcom/zzhoujay/richtext/ig/j$e;->a(Lcom/zzhoujay/richtext/ig/j$e;Ljava/util/concurrent/ExecutorService;Lcom/zzhoujay/richtext/ig/d;)Lcom/zzhoujay/richtext/ig/e;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    monitor-exit v1

    .line 43
    return-object p1

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    throw p1
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
.end method
