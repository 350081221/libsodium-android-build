.class final Lcom/uc/crashsdk/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field private a:Z

.field private b:Z


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/uc/crashsdk/c;->a:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/uc/crashsdk/c;->b:Z

    .line 8
    .line 9
    return-void
    .line 10
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
.end method

.method private a(I)V
    .locals 3

    .line 10
    invoke-static {}, Lcom/uc/crashsdk/e;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "[LifeCycle] ignore state change while crashing"

    const-string v0, "crashsdk"

    .line 11
    invoke-static {v0, p1}, Lcom/uc/crashsdk/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    if-ne v0, p1, :cond_1

    move p1, v0

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_3

    .line 12
    invoke-static {}, Lcom/uc/crashsdk/b;->P()Ljava/util/WeakHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 13
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 14
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 15
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 16
    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v0, :cond_2

    goto :goto_1

    :cond_3
    move v0, p1

    .line 17
    :goto_1
    iget-boolean p1, p0, Lcom/uc/crashsdk/c;->a:Z

    if-eq p1, v0, :cond_4

    .line 18
    invoke-static {v0}, Lcom/uc/crashsdk/b;->b(Z)V

    .line 19
    iput-boolean v0, p0, Lcom/uc/crashsdk/c;->a:Z

    .line 20
    :cond_4
    invoke-static {}, Lcom/uc/crashsdk/b;->P()Ljava/util/WeakHashMap;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/WeakHashMap;->isEmpty()Z

    move-result p1

    .line 21
    iget-boolean v0, p0, Lcom/uc/crashsdk/c;->b:Z

    if-eq v0, p1, :cond_6

    if-eqz p1, :cond_5

    .line 22
    invoke-static {}, Lcom/uc/crashsdk/b;->w()V

    .line 23
    :cond_5
    iput-boolean p1, p0, Lcom/uc/crashsdk/c;->b:Z

    :cond_6
    return-void
.end method

.method private a(Landroid/app/Activity;I)V
    .locals 3

    const/4 v0, 0x1

    if-ne v0, p2, :cond_0

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/uc/crashsdk/b;->c(Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 2
    invoke-static {v0}, Lcom/uc/crashsdk/b;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 3
    :goto_0
    invoke-static {}, Lcom/uc/crashsdk/b;->D()V

    .line 4
    invoke-static {}, Lcom/uc/crashsdk/g;->L()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    invoke-static {}, Lcom/uc/crashsdk/b;->O()Z

    .line 6
    invoke-static {}, Lcom/uc/crashsdk/b;->P()Ljava/util/WeakHashMap;

    move-result-object v0

    monitor-enter v0

    .line 7
    :try_start_0
    invoke-static {}, Lcom/uc/crashsdk/b;->P()Ljava/util/WeakHashMap;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    invoke-direct {p0, p2}, Lcom/uc/crashsdk/c;->a(I)V

    .line 9
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    const/4 p2, 0x2

    invoke-direct {p0, p1, p2}, Lcom/uc/crashsdk/c;->a(Landroid/app/Activity;I)V

    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/uc/crashsdk/g;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/uc/crashsdk/b;->O()Z

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/uc/crashsdk/b;->P()Ljava/util/WeakHashMap;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    invoke-static {}, Lcom/uc/crashsdk/b;->P()Ljava/util/WeakHashMap;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x2

    .line 23
    invoke-direct {p0, p1}, Lcom/uc/crashsdk/c;->a(I)V

    .line 24
    .line 25
    .line 26
    monitor-exit v0

    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw p1

    .line 31
    :cond_0
    return-void
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
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, Lcom/uc/crashsdk/c;->a(Landroid/app/Activity;I)V

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/uc/crashsdk/c;->a(Landroid/app/Activity;I)V

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/uc/crashsdk/c;->a(Landroid/app/Activity;I)V

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, Lcom/uc/crashsdk/c;->a(Landroid/app/Activity;I)V

    return-void
.end method
