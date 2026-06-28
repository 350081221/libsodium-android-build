.class public Lcom/bytedance/pangle/service/a/a;
.super Lcom/bytedance/pangle/e$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/pangle/service/a/a$a;,
        Lcom/bytedance/pangle/service/a/a$b;
    }
.end annotation


# static fields
.field private static volatile c:Lcom/bytedance/pangle/service/a/a;


# instance fields
.field public final a:Landroid/os/Handler;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/content/ComponentName;",
            "Landroid/os/IBinder;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/content/ComponentName;",
            "Lcom/bytedance/pangle/service/a/a$b;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/bytedance/pangle/service/a/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bytedance/pangle/service/a/a$a<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/content/ComponentName;",
            "Lcom/bytedance/pangle/service/a;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Landroid/content/ComponentName;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Landroid/content/ComponentName;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/e$a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/pangle/service/a/a;->d:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/bytedance/pangle/service/a/a;->e:Ljava/util/HashMap;

    .line 17
    .line 18
    new-instance v0, Lcom/bytedance/pangle/service/a/a$a;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lcom/bytedance/pangle/service/a/a$a;-><init>(Lcom/bytedance/pangle/service/a/a;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/bytedance/pangle/service/a/a;->f:Lcom/bytedance/pangle/service/a/a$a;

    .line 24
    .line 25
    new-instance v0, Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/bytedance/pangle/service/a/a;->g:Ljava/util/HashMap;

    .line 31
    .line 32
    new-instance v0, Ljava/util/HashSet;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lcom/bytedance/pangle/service/a/a;->h:Ljava/util/HashSet;

    .line 38
    .line 39
    new-instance v0, Ljava/util/HashSet;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/bytedance/pangle/service/a/a;->i:Ljava/util/HashSet;

    .line 45
    .line 46
    new-instance v0, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lcom/bytedance/pangle/service/a/a;->b:Ljava/util/List;

    .line 52
    .line 53
    new-instance v0, Landroid/os/Handler;

    .line 54
    .line 55
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, Lcom/bytedance/pangle/service/a/a;->a:Landroid/os/Handler;

    .line 63
    .line 64
    return-void
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

.method static synthetic a(Lcom/bytedance/pangle/service/a/a;Landroid/content/Intent;Ljava/lang/String;)Landroid/content/ComponentName;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/bytedance/pangle/service/a/a;->c(Landroid/content/Intent;Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a(Lcom/bytedance/pangle/service/a/a;Lcom/bytedance/pangle/g;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/bytedance/pangle/service/a/a;->b(Lcom/bytedance/pangle/g;)V

    return-void
.end method

.method private declared-synchronized a(Landroid/content/Intent;Lcom/bytedance/pangle/g;Ljava/lang/String;)Z
    .locals 3

    monitor-enter p0

    .line 19
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    .line 20
    iget-object v1, p0, Lcom/bytedance/pangle/service/a/a;->g:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 21
    invoke-static {p1, p3}, Lcom/bytedance/pangle/service/a/a;->d(Landroid/content/Intent;Ljava/lang/String;)Lcom/bytedance/pangle/service/a;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p3, :cond_0

    .line 22
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    .line 23
    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/bytedance/pangle/service/a/a;->g:Ljava/util/HashMap;

    invoke-virtual {v1, v0, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    :cond_1
    iget-object p3, p0, Lcom/bytedance/pangle/service/a/a;->g:Ljava/util/HashMap;

    invoke-virtual {p3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/bytedance/pangle/service/a;

    .line 25
    iget-object v1, p0, Lcom/bytedance/pangle/service/a/a;->d:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 26
    iget-object v1, p0, Lcom/bytedance/pangle/service/a/a;->d:Ljava/util/HashMap;

    invoke-interface {p3, p1}, Lcom/bytedance/pangle/service/a;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;

    move-result-object p3

    invoke-virtual {v1, v0, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    :cond_2
    iget-object p3, p0, Lcom/bytedance/pangle/service/a/a;->d:Ljava/util/HashMap;

    invoke-virtual {p3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/os/IBinder;

    if-eqz p3, :cond_4

    .line 28
    iget-object v1, p0, Lcom/bytedance/pangle/service/a/a;->e:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 29
    iget-object v1, p0, Lcom/bytedance/pangle/service/a/a;->e:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/pangle/service/a/a$b;

    invoke-virtual {v1, p2}, Lcom/bytedance/pangle/service/a/a$b;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 30
    iget-object v1, p0, Lcom/bytedance/pangle/service/a/a;->e:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/pangle/service/a/a$b;

    invoke-virtual {v1, p2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 31
    iget-object v1, p0, Lcom/bytedance/pangle/service/a/a;->f:Lcom/bytedance/pangle/service/a/a$a;

    invoke-virtual {v1, p2, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    invoke-interface {p2, v0, p3}, Lcom/bytedance/pangle/g;->a(Landroid/content/ComponentName;Landroid/os/IBinder;)V

    goto :goto_0

    .line 33
    :cond_3
    new-instance v1, Lcom/bytedance/pangle/service/a/a$b;

    invoke-direct {v1, p0}, Lcom/bytedance/pangle/service/a/a$b;-><init>(Lcom/bytedance/pangle/service/a/a;)V

    .line 34
    invoke-virtual {v1, p2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 35
    iget-object v2, p0, Lcom/bytedance/pangle/service/a/a;->e:Ljava/util/HashMap;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    iget-object v1, p0, Lcom/bytedance/pangle/service/a/a;->f:Lcom/bytedance/pangle/service/a/a$a;

    invoke-virtual {v1, p2, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    invoke-interface {p2, v0, p3}, Lcom/bytedance/pangle/g;->a(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    :cond_4
    :goto_0
    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic a(Lcom/bytedance/pangle/service/a/a;Landroid/content/Intent;Lcom/bytedance/pangle/g;Ljava/lang/String;)Z
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/bytedance/pangle/service/a/a;->a(Landroid/content/Intent;Lcom/bytedance/pangle/g;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static b()Lcom/bytedance/pangle/service/a/a;
    .locals 2

    .line 1
    sget-object v0, Lcom/bytedance/pangle/service/a/a;->c:Lcom/bytedance/pangle/service/a/a;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/bytedance/pangle/service/a/a;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/bytedance/pangle/service/a/a;->c:Lcom/bytedance/pangle/service/a/a;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/bytedance/pangle/service/a/a;

    invoke-direct {v1}, Lcom/bytedance/pangle/service/a/a;-><init>()V

    sput-object v1, Lcom/bytedance/pangle/service/a/a;->c:Lcom/bytedance/pangle/service/a/a;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/bytedance/pangle/service/a/a;->c:Lcom/bytedance/pangle/service/a/a;

    return-object v0
.end method

.method private declared-synchronized b(Lcom/bytedance/pangle/g;)V
    .locals 4

    monitor-enter p0

    .line 15
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/pangle/service/a/a;->e:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ComponentName;

    .line 16
    iget-object v2, p0, Lcom/bytedance/pangle/service/a/a;->e:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/bytedance/pangle/service/a/a$b;

    .line 17
    invoke-virtual {v2, p1}, Lcom/bytedance/pangle/service/a/a$b;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 18
    invoke-virtual {v2, p1}, Lcom/bytedance/pangle/service/a/a$b;->remove(Ljava/lang/Object;)Z

    .line 19
    iget-object v0, p0, Lcom/bytedance/pangle/service/a/a;->f:Lcom/bytedance/pangle/service/a/a$a;

    invoke-virtual {v0, p1}, Lcom/bytedance/pangle/service/a/a$a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Intent;

    .line 20
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 21
    iget-object v0, p0, Lcom/bytedance/pangle/service/a/a;->e:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    iget-object v0, p0, Lcom/bytedance/pangle/service/a/a;->g:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bytedance/pangle/service/a;

    if-eqz v0, :cond_1

    .line 23
    invoke-interface {v0, p1}, Lcom/bytedance/pangle/service/a;->onUnbind(Landroid/content/Intent;)Z

    .line 24
    :cond_1
    invoke-direct {p0, v1}, Lcom/bytedance/pangle/service/a/a;->b(Landroid/content/ComponentName;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    monitor-exit p0

    return-void

    .line 26
    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private b(Landroid/content/ComponentName;)Z
    .locals 2

    .line 10
    iget-object v0, p0, Lcom/bytedance/pangle/service/a/a;->h:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 11
    iget-object v0, p0, Lcom/bytedance/pangle/service/a/a;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 12
    invoke-direct {p0, p1}, Lcom/bytedance/pangle/service/a/a;->c(Landroid/content/ComponentName;)V

    return v1

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/bytedance/pangle/service/a/a;->i:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bytedance/pangle/service/a/a;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 14
    invoke-direct {p0, p1}, Lcom/bytedance/pangle/service/a/a;->c(Landroid/content/ComponentName;)V

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private declared-synchronized c(Landroid/content/Intent;Ljava/lang/String;)Landroid/content/ComponentName;
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/bytedance/pangle/service/a/a;->g:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 3
    invoke-static {p1, p2}, Lcom/bytedance/pangle/service/a/a;->d(Landroid/content/Intent;Ljava/lang/String;)Lcom/bytedance/pangle/service/a;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_0

    .line 4
    monitor-exit p0

    return-object v0

    .line 5
    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/bytedance/pangle/service/a/a;->g:Ljava/util/HashMap;

    invoke-virtual {v1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    iget-object p2, p0, Lcom/bytedance/pangle/service/a/a;->h:Ljava/util/HashSet;

    invoke-virtual {p2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 7
    :cond_1
    iget-object p2, p0, Lcom/bytedance/pangle/service/a/a;->g:Ljava/util/HashMap;

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/bytedance/pangle/service/a;

    if-eqz p2, :cond_2

    const/4 v1, 0x0

    .line 8
    invoke-interface {p2, p1, v1, v1}, Lcom/bytedance/pangle/service/a;->onStartCommand(Landroid/content/Intent;II)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    :cond_2
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private c(Landroid/content/ComponentName;)V
    .locals 2

    .line 10
    iget-object v0, p0, Lcom/bytedance/pangle/service/a/a;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bytedance/pangle/service/a;

    .line 11
    iget-object v1, p0, Lcom/bytedance/pangle/service/a/a;->i:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 12
    iget-object v1, p0, Lcom/bytedance/pangle/service/a/a;->d:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    iget-object v1, p0, Lcom/bytedance/pangle/service/a/a;->h:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    if-eqz v0, :cond_0

    .line 14
    invoke-interface {v0}, Lcom/bytedance/pangle/service/a;->onDestroy()V

    :cond_0
    return-void
.end method

.method private static d(Landroid/content/Intent;Ljava/lang/String;)Lcom/bytedance/pangle/service/a;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/bytedance/pangle/service/a/a;->e(Landroid/content/Intent;Ljava/lang/String;)Lcom/bytedance/pangle/service/a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, Lcom/bytedance/pangle/service/a;->onCreate()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object p0
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
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method private static e(Landroid/content/Intent;Ljava/lang/String;)Lcom/bytedance/pangle/service/a;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {}, Lcom/bytedance/pangle/plugin/PluginManager;->getInstance()Lcom/bytedance/pangle/plugin/PluginManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lcom/bytedance/pangle/plugin/PluginManager;->getPlugin(Ljava/lang/String;)Lcom/bytedance/pangle/plugin/Plugin;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :try_start_0
    invoke-static {p1}, Lcom/bytedance/pangle/Zeus;->loadPlugin(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 17
    :try_start_1
    iget-object v1, v0, Lcom/bytedance/pangle/plugin/Plugin;->mClassLoader:Lcom/bytedance/pangle/PluginClassLoader;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {v1, p0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lcom/bytedance/pangle/service/a;

    .line 32
    .line 33
    invoke-interface {p0, v0}, Lcom/bytedance/pangle/service/a;->attach(Lcom/bytedance/pangle/plugin/Plugin;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :catch_0
    move-exception p0

    .line 38
    goto :goto_0

    .line 39
    :catch_1
    move-exception p0

    .line 40
    const/4 p1, 0x0

    .line 41
    :goto_0
    const-string v0, "newServiceInstance failed! loadPlugin = "

    .line 42
    .line 43
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v0, "Zeus/service_pangle"

    .line 52
    .line 53
    invoke-static {v0, p1, p0}, Lcom/bytedance/pangle/log/ZeusLogger;->errReport(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    return-object p0
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
.end method


# virtual methods
.method public final a(Landroid/content/Intent;Ljava/lang/String;)Landroid/content/ComponentName;
    .locals 2

    .line 4
    invoke-static {}, Lcom/bytedance/pangle/Zeus;->hasInit()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/bytedance/pangle/service/a/a;->c(Landroid/content/Intent;Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object p1

    return-object p1

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/bytedance/pangle/service/a/a;->a:Landroid/os/Handler;

    new-instance v1, Lcom/bytedance/pangle/service/a/a$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/bytedance/pangle/service/a/a$1;-><init>(Lcom/bytedance/pangle/service/a/a;Landroid/content/Intent;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/bytedance/pangle/service/a/a;->b:Ljava/util/List;

    new-instance v1, Lcom/bytedance/pangle/service/a/a$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/bytedance/pangle/service/a/a$2;-><init>(Lcom/bytedance/pangle/service/a/a;Landroid/content/Intent;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    :goto_0
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/bytedance/pangle/g;)V
    .locals 2

    .line 39
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 40
    invoke-direct {p0, p1}, Lcom/bytedance/pangle/service/a/a;->b(Lcom/bytedance/pangle/g;)V

    return-void

    .line 41
    :cond_0
    iget-object v0, p0, Lcom/bytedance/pangle/service/a/a;->a:Landroid/os/Handler;

    new-instance v1, Lcom/bytedance/pangle/service/a/a$6;

    invoke-direct {v1, p0, p1}, Lcom/bytedance/pangle/service/a/a$6;-><init>(Lcom/bytedance/pangle/service/a/a;Lcom/bytedance/pangle/g;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final declared-synchronized a(Landroid/content/ComponentName;)Z
    .locals 1

    monitor-enter p0

    .line 10
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/pangle/service/a/a;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 11
    iget-object v0, p0, Lcom/bytedance/pangle/service/a/a;->i:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 12
    invoke-direct {p0, p1}, Lcom/bytedance/pangle/service/a/a;->b(Landroid/content/ComponentName;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    .line 13
    :cond_0
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final a(Landroid/content/Intent;Lcom/bytedance/pangle/g;ILjava/lang/String;)Z
    .locals 8

    .line 14
    invoke-static {}, Lcom/bytedance/pangle/Zeus;->hasInit()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 15
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 16
    invoke-direct {p0, p1, p2, p4}, Lcom/bytedance/pangle/service/a/a;->a(Landroid/content/Intent;Lcom/bytedance/pangle/g;Ljava/lang/String;)Z

    move-result p1

    return p1

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/bytedance/pangle/service/a/a;->a:Landroid/os/Handler;

    new-instance v7, Lcom/bytedance/pangle/service/a/a$4;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/bytedance/pangle/service/a/a$4;-><init>(Lcom/bytedance/pangle/service/a/a;Landroid/content/Intent;Lcom/bytedance/pangle/g;ILjava/lang/String;)V

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 18
    :cond_1
    iget-object v0, p0, Lcom/bytedance/pangle/service/a/a;->b:Ljava/util/List;

    new-instance v7, Lcom/bytedance/pangle/service/a/a$5;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/bytedance/pangle/service/a/a$5;-><init>(Lcom/bytedance/pangle/service/a/a;Landroid/content/Intent;Lcom/bytedance/pangle/g;ILjava/lang/String;)V

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final b(Landroid/content/Intent;Ljava/lang/String;)Z
    .locals 1

    .line 7
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    if-ne p2, v0, :cond_0

    .line 8
    invoke-static {}, Lcom/bytedance/pangle/service/a/a;->b()Lcom/bytedance/pangle/service/a/a;

    move-result-object p2

    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/bytedance/pangle/service/a/a;->a(Landroid/content/ComponentName;)Z

    goto :goto_0

    .line 9
    :cond_0
    iget-object p2, p0, Lcom/bytedance/pangle/service/a/a;->a:Landroid/os/Handler;

    new-instance v0, Lcom/bytedance/pangle/service/a/a$3;

    invoke-direct {v0, p0, p1}, Lcom/bytedance/pangle/service/a/a$3;-><init>(Lcom/bytedance/pangle/service/a/a;Landroid/content/Intent;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    const/4 p1, 0x1

    return p1
.end method
