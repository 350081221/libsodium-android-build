.class public final Lcom/tendcloud/tenddata/ac;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/tendcloud/tenddata/ao;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const-class v0, Lcom/tendcloud/tenddata/ac;

    monitor-enter v0

    const/4 v1, 0x0

    .line 14
    :try_start_0
    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 15
    sget-object v2, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v2, p0}, Lcom/tendcloud/tenddata/ao;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 16
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 17
    monitor-exit v0

    return-object v1

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static a(Landroid/app/Activity;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 21
    :try_start_0
    invoke-static {p0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 22
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1}, Lcom/tendcloud/tenddata/ao;->a(Landroid/app/Activity;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 18
    :try_start_0
    invoke-static {p0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 19
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V
    .locals 2

    const-class v0, Lcom/tendcloud/tenddata/ac;

    monitor-enter v0

    .line 1
    :try_start_0
    invoke-static {p0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 2
    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v1, p0, p1}, Lcom/tendcloud/tenddata/ao;->a(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 3
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 4
    :goto_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;DLjava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "D",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 44
    :try_start_0
    invoke-static {p0, p5}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 45
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p4

    move-wide v4, p2

    move-object v6, p5

    invoke-interface/range {v0 .. v6}, Lcom/tendcloud/tenddata/ao;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;DLcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 24
    :try_start_0
    invoke-static {p0, p2}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 25
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2}, Lcom/tendcloud/tenddata/ao;->a(Landroid/content/Context;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 2

    const-class v0, Lcom/tendcloud/tenddata/ac;

    monitor-enter v0

    .line 5
    :try_start_0
    invoke-static {p0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 6
    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v1, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 7
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 8
    :goto_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 7

    const-class v0, Lcom/tendcloud/tenddata/ac;

    monitor-enter v0

    .line 9
    :try_start_0
    invoke-static {p0, p4}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 10
    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-interface/range {v1 .. v6}, Lcom/tendcloud/tenddata/ao;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 11
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 12
    :goto_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;DLcom/tendcloud/tenddata/a;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;D",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 41
    :try_start_0
    invoke-static {p0, p6}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 42
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    move-object v7, p6

    invoke-interface/range {v0 .. v7}, Lcom/tendcloud/tenddata/ao;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;DLcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 35
    :try_start_0
    invoke-static {p0, p4}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 36
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-interface/range {v0 .. v5}, Lcom/tendcloud/tenddata/ao;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 38
    :try_start_0
    invoke-static {p0, p5}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 39
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-interface/range {v0 .. v6}, Lcom/tendcloud/tenddata/ao;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    const-string v0, "null"

    .line 33
    invoke-static {p0, p1, v0, p2, p3}, Lcom/tendcloud/tenddata/ac;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 34
    invoke-static/range {v0 .. v5}, Lcom/tendcloud/tenddata/ac;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/Throwable;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 53
    :try_start_0
    invoke-static {p0, p2}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 54
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2}, Lcom/tendcloud/tenddata/ao;->a(Landroid/content/Context;Ljava/lang/Throwable;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Lcom/tendcloud/tenddata/TalkingDataOrder;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 101
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 102
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1}, Lcom/tendcloud/tenddata/ao;->a(Lcom/tendcloud/tenddata/TalkingDataOrder;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 103
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Lcom/tendcloud/tenddata/TalkingDataOrder;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 95
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 96
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2}, Lcom/tendcloud/tenddata/ao;->a(Lcom/tendcloud/tenddata/TalkingDataOrder;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 97
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Lcom/tendcloud/tenddata/TalkingDataOrder;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 89
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 90
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->a(Lcom/tendcloud/tenddata/TalkingDataOrder;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 91
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Lcom/tendcloud/tenddata/TalkingDataOrder;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tendcloud/tenddata/TalkingDataOrder;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 98
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 99
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->a(Lcom/tendcloud/tenddata/TalkingDataOrder;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 100
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Lcom/tendcloud/tenddata/TalkingDataProfile;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 65
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 66
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1}, Lcom/tendcloud/tenddata/ao;->a(Lcom/tendcloud/tenddata/TalkingDataProfile;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 67
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Lcom/tendcloud/tenddata/TalkingDataSearch;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 119
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 120
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1}, Lcom/tendcloud/tenddata/ao;->a(Lcom/tendcloud/tenddata/TalkingDataSearch;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 121
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Lcom/tendcloud/tenddata/TalkingDataSharingFilter;Lcom/tendcloud/tenddata/a;)V
    .locals 0

    .line 128
    sput-object p0, Lcom/tendcloud/tenddata/ab;->u:Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

    return-void
.end method

.method public static a(Lcom/tendcloud/tenddata/TalkingDataShoppingCart;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 116
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 117
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1}, Lcom/tendcloud/tenddata/ao;->a(Lcom/tendcloud/tenddata/TalkingDataShoppingCart;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 118
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Lcom/tendcloud/tenddata/a;Ljava/lang/String;)V
    .locals 7

    .line 47
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p0}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 48
    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    sget-object v2, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v4, ""

    const/4 v5, 0x0

    move-object v3, p1

    move-object v6, p0

    invoke-interface/range {v1 .. v6}, Lcom/tendcloud/tenddata/ao;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;ILjava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 92
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 93
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;ILjava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 94
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 7

    .line 86
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p4}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 87
    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-interface/range {v1 .. v6}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 88
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 59
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 60
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 61
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 71
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 72
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 73
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/tendcloud/tenddata/TalkingDataProfile;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 74
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p4}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 75
    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-interface/range {v1 .. v6}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 76
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/tendcloud/tenddata/TalkingDataProfile;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 62
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 63
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 64
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 30
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 31
    sget-object p1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {p1, p0}, Lcom/tendcloud/tenddata/ao;->removeGlobalKV(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/tendcloud/tenddata/af$ProfileType;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 56
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 57
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->b(Ljava/lang/String;Lcom/tendcloud/tenddata/af$ProfileType;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 58
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 27
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 28
    sget-object p2, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {p2, p0, p1}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 8

    .line 80
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p5}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 81
    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-interface/range {v1 .. v7}, Lcom/tendcloud/tenddata/ao;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 82
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/tendcloud/tenddata/a;)V
    .locals 10

    .line 83
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    move-object/from16 v9, p7

    invoke-static {v0, v9}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 84
    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move/from16 v8, p6

    move-object/from16 v9, p7

    invoke-interface/range {v1 .. v9}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 85
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 68
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 69
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 70
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/tendcloud/tenddata/a;)V
    .locals 8

    .line 104
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p5}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 105
    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move-object v7, p5

    invoke-interface/range {v1 .. v7}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 106
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 107
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p6}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 108
    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move-object v7, p5

    move-object v8, p6

    invoke-interface/range {v1 .. v8}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Map;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 109
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/tendcloud/tenddata/a;)V
    .locals 7

    .line 110
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p4}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 111
    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    invoke-interface/range {v1 .. v6}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 112
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 113
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p5}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 114
    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-interface/range {v1 .. v7}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 115
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 77
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 78
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 79
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 122
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 123
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->b(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 124
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(Ljava/util/Map;Lcom/tendcloud/tenddata/TDGenerateUrl;Lcom/tendcloud/tenddata/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/TDGenerateUrl;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 125
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 126
    sget-object p2, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {p2, p0, p1}, Lcom/tendcloud/tenddata/ao;->a(Ljava/util/Map;Lcom/tendcloud/tenddata/TDGenerateUrl;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 127
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a(ZLcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 50
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 51
    sget-object p1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {p1, p0}, Lcom/tendcloud/tenddata/ao;->c(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 52
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a()Z
    .locals 1

    .line 13
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    return v0
.end method

.method public static b(Landroid/content/Context;)I
    .locals 0

    .line 10
    invoke-static {p0}, Lcom/tendcloud/tenddata/k;->c(Landroid/content/Context;)I

    move-result p0

    return p0
.end method

.method public static b()Landroid/content/Context;
    .locals 1

    .line 2
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0}, Lcom/tendcloud/tenddata/ao;->d()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/tendcloud/tenddata/ab;->a(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/app/Activity;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 3
    :try_start_0
    invoke-static {p0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 4
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1}, Lcom/tendcloud/tenddata/ao;->b(Landroid/app/Activity;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 6
    :try_start_0
    invoke-static {p0, p2}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 7
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2}, Lcom/tendcloud/tenddata/ao;->b(Landroid/content/Context;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    const/4 v0, 0x0

    .line 9
    invoke-static {p0, p1, p2, v0, p3}, Lcom/tendcloud/tenddata/ac;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static b(Ljava/lang/String;ILjava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 20
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 21
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->b(Ljava/lang/String;ILjava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static b(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 11
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 12
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static b(Ljava/lang/String;Lcom/tendcloud/tenddata/af$ProfileType;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 14
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 15
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/af$ProfileType;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 8

    .line 17
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p5}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 18
    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-interface/range {v1 .. v7}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 23
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 24
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2}, Lcom/tendcloud/tenddata/ao;->b(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 26
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 27
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static c(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/tendcloud/tenddata/ab;->b(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static c()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    :try_start_0
    sput-boolean v0, Lcom/tendcloud/tenddata/h;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    const-string v0, ""

    .line 4
    invoke-static {p0, p1, v0, p2}, Lcom/tendcloud/tenddata/ac;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static c(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 5
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 6
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1}, Lcom/tendcloud/tenddata/ao;->b(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 8
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 9
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2}, Lcom/tendcloud/tenddata/ao;->c(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static declared-synchronized d(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;
    .locals 2

    const-class v0, Lcom/tendcloud/tenddata/ac;

    monitor-enter v0

    .line 1
    :try_start_0
    invoke-static {p0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 2
    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v1, p0, p1}, Lcom/tendcloud/tenddata/ao;->b(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 3
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 4
    monitor-exit v0

    const/4 p0, 0x0

    return-object p0

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static d(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 5
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 6
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1}, Lcom/tendcloud/tenddata/ao;->c(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 8
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 9
    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2}, Lcom/tendcloud/tenddata/ao;->d(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static declared-synchronized e(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;
    .locals 2

    .line 1
    const-class v0, Lcom/tendcloud/tenddata/ac;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    .line 8
    .line 9
    invoke-interface {v1, p0, p1}, Lcom/tendcloud/tenddata/ao;->e(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    monitor-exit v0

    .line 14
    return-object p0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 17
    .line 18
    .line 19
    monitor-exit v0

    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0

    .line 22
    :catchall_1
    move-exception p0

    .line 23
    monitor-exit v0

    .line 24
    throw p0
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

.method private static declared-synchronized f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V
    .locals 0

    .line 1
    const-class p1, Lcom/tendcloud/tenddata/ac;

    .line 2
    .line 3
    monitor-enter p1

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sput-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 11
    .line 12
    :cond_0
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 13
    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    const-string p0, "Init failed Context is null "

    .line 17
    .line 18
    invoke-static {p0}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    monitor-exit p1

    .line 22
    return-void

    .line 23
    :cond_1
    :try_start_1
    sget-object p0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    .line 24
    .line 25
    if-nez p0, :cond_2

    .line 26
    .line 27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/tendcloud/tenddata/zz;->a()Lcom/tendcloud/tenddata/zz;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    sput-object p0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    .line 36
    :cond_2
    monitor-exit p1

    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    monitor-exit p1

    .line 40
    throw p0
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

.method public static setConfig(Lcom/tendcloud/tenddata/TalkingDataSDKConfig;)V
    .locals 0

    invoke-static {p0}, Lcom/tendcloud/tenddata/ab;->setCofig(Lcom/tendcloud/tenddata/TalkingDataSDKConfig;)V

    return-void
.end method

.method public static declared-synchronized setConfigurationDisable(I)V
    .locals 1

    .line 1
    const-class v0, Lcom/tendcloud/tenddata/ac;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/ab;->setConfigurationDisable(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    goto :goto_0

    .line 8
    :catchall_0
    move-exception p0

    .line 9
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 10
    .line 11
    .line 12
    :goto_0
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_1
    move-exception p0

    .line 15
    monitor-exit v0

    .line 16
    throw p0
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
.end method

.method public static setProfileId(Ljava/lang/String;)V
    .locals 0

    .line 1
    :try_start_0
    sput-object p0, Lcom/tendcloud/tenddata/ab;->r:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :catchall_0
    move-exception p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 6
    .line 7
    .line 8
    :goto_0
    return-void
    .line 9
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method
