.class public Lcom/umeng/commonsdk/statistics/idtracking/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/commonsdk/statistics/idtracking/e$a;
    }
.end annotation


# static fields
.field public static final a:J = 0x5265c00L

.field public static b:Lcom/umeng/commonsdk/statistics/idtracking/e;

.field private static final c:Ljava/lang/String;

.field private static j:Ljava/lang/Object;


# instance fields
.field private d:Ljava/io/File;

.field private e:Lcom/umeng/commonsdk/statistics/proto/c;

.field private f:J

.field private g:J

.field private h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/umeng/commonsdk/statistics/idtracking/a;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lcom/umeng/commonsdk/statistics/idtracking/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/umeng/analytics/pro/au;->b()Lcom/umeng/analytics/pro/au;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "id"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/au;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/umeng/commonsdk/statistics/idtracking/e;->c:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v0, Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcom/umeng/commonsdk/statistics/idtracking/e;->j:Ljava/lang/Object;

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->e:Lcom/umeng/commonsdk/statistics/proto/c;

    .line 6
    .line 7
    new-instance v1, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->h:Ljava/util/Set;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->i:Lcom/umeng/commonsdk/statistics/idtracking/e$a;

    .line 15
    .line 16
    new-instance v0, Ljava/io/File;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    sget-object v2, Lcom/umeng/commonsdk/statistics/idtracking/e;->c:Ljava/lang/String;

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->d:Ljava/io/File;

    .line 28
    .line 29
    const-wide/32 v0, 0x5265c00

    .line 30
    .line 31
    .line 32
    iput-wide v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->g:J

    .line 33
    .line 34
    new-instance v0, Lcom/umeng/commonsdk/statistics/idtracking/e$a;

    .line 35
    .line 36
    invoke-direct {v0, p1}, Lcom/umeng/commonsdk/statistics/idtracking/e$a;-><init>(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->i:Lcom/umeng/commonsdk/statistics/idtracking/e$a;

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/umeng/commonsdk/statistics/idtracking/e$a;->b()V

    .line 42
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
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/idtracking/e;
    .locals 3

    const-class v0, Lcom/umeng/commonsdk/statistics/idtracking/e;

    monitor-enter v0

    .line 5
    :try_start_0
    sget-object v1, Lcom/umeng/commonsdk/statistics/idtracking/e;->b:Lcom/umeng/commonsdk/statistics/idtracking/e;

    if-nez v1, :cond_1

    .line 6
    new-instance v1, Lcom/umeng/commonsdk/statistics/idtracking/e;

    invoke-direct {v1, p0}, Lcom/umeng/commonsdk/statistics/idtracking/e;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/umeng/commonsdk/statistics/idtracking/e;->b:Lcom/umeng/commonsdk/statistics/idtracking/e;

    .line 7
    new-instance v2, Lcom/umeng/commonsdk/statistics/idtracking/f;

    invoke-direct {v2, p0}, Lcom/umeng/commonsdk/statistics/idtracking/f;-><init>(Landroid/content/Context;)V

    invoke-direct {v1, v2}, Lcom/umeng/commonsdk/statistics/idtracking/e;->a(Lcom/umeng/commonsdk/statistics/idtracking/a;)Z

    .line 8
    sget-object v1, Lcom/umeng/commonsdk/statistics/idtracking/e;->b:Lcom/umeng/commonsdk/statistics/idtracking/e;

    new-instance v2, Lcom/umeng/commonsdk/statistics/idtracking/b;

    invoke-direct {v2, p0}, Lcom/umeng/commonsdk/statistics/idtracking/b;-><init>(Landroid/content/Context;)V

    invoke-direct {v1, v2}, Lcom/umeng/commonsdk/statistics/idtracking/e;->a(Lcom/umeng/commonsdk/statistics/idtracking/a;)Z

    .line 9
    sget-object v1, Lcom/umeng/commonsdk/statistics/idtracking/e;->b:Lcom/umeng/commonsdk/statistics/idtracking/e;

    new-instance v2, Lcom/umeng/commonsdk/statistics/idtracking/j;

    invoke-direct {v2, p0}, Lcom/umeng/commonsdk/statistics/idtracking/j;-><init>(Landroid/content/Context;)V

    invoke-direct {v1, v2}, Lcom/umeng/commonsdk/statistics/idtracking/e;->a(Lcom/umeng/commonsdk/statistics/idtracking/a;)Z

    .line 10
    sget-object v1, Lcom/umeng/commonsdk/statistics/idtracking/e;->b:Lcom/umeng/commonsdk/statistics/idtracking/e;

    new-instance v2, Lcom/umeng/commonsdk/statistics/idtracking/d;

    invoke-direct {v2, p0}, Lcom/umeng/commonsdk/statistics/idtracking/d;-><init>(Landroid/content/Context;)V

    invoke-direct {v1, v2}, Lcom/umeng/commonsdk/statistics/idtracking/e;->a(Lcom/umeng/commonsdk/statistics/idtracking/a;)Z

    .line 11
    sget-object v1, Lcom/umeng/commonsdk/statistics/idtracking/e;->b:Lcom/umeng/commonsdk/statistics/idtracking/e;

    new-instance v2, Lcom/umeng/commonsdk/statistics/idtracking/c;

    invoke-direct {v2, p0}, Lcom/umeng/commonsdk/statistics/idtracking/c;-><init>(Landroid/content/Context;)V

    invoke-direct {v1, v2}, Lcom/umeng/commonsdk/statistics/idtracking/e;->a(Lcom/umeng/commonsdk/statistics/idtracking/a;)Z

    .line 12
    sget-object v1, Lcom/umeng/commonsdk/statistics/idtracking/e;->b:Lcom/umeng/commonsdk/statistics/idtracking/e;

    new-instance v2, Lcom/umeng/commonsdk/statistics/idtracking/g;

    invoke-direct {v2, p0}, Lcom/umeng/commonsdk/statistics/idtracking/g;-><init>(Landroid/content/Context;)V

    invoke-direct {v1, v2}, Lcom/umeng/commonsdk/statistics/idtracking/e;->a(Lcom/umeng/commonsdk/statistics/idtracking/a;)Z

    .line 13
    sget-object v1, Lcom/umeng/commonsdk/statistics/idtracking/e;->b:Lcom/umeng/commonsdk/statistics/idtracking/e;

    new-instance v2, Lcom/umeng/commonsdk/statistics/idtracking/i;

    invoke-direct {v2}, Lcom/umeng/commonsdk/statistics/idtracking/i;-><init>()V

    invoke-direct {v1, v2}, Lcom/umeng/commonsdk/statistics/idtracking/e;->a(Lcom/umeng/commonsdk/statistics/idtracking/a;)Z

    const-string v1, "header_device_oaid"

    .line 14
    invoke-static {v1}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 15
    sget-object v1, Lcom/umeng/commonsdk/statistics/idtracking/e;->b:Lcom/umeng/commonsdk/statistics/idtracking/e;

    new-instance v2, Lcom/umeng/commonsdk/statistics/idtracking/h;

    invoke-direct {v2, p0}, Lcom/umeng/commonsdk/statistics/idtracking/h;-><init>(Landroid/content/Context;)V

    invoke-direct {v1, v2}, Lcom/umeng/commonsdk/statistics/idtracking/e;->a(Lcom/umeng/commonsdk/statistics/idtracking/a;)Z

    .line 16
    :cond_0
    sget-object p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->b:Lcom/umeng/commonsdk/statistics/idtracking/e;

    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/idtracking/e;->f()V

    .line 17
    :cond_1
    sget-object p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->b:Lcom/umeng/commonsdk/statistics/idtracking/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized a()V
    .locals 2

    const-class v0, Lcom/umeng/commonsdk/statistics/idtracking/e;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lcom/umeng/commonsdk/statistics/idtracking/e;->b:Lcom/umeng/commonsdk/statistics/idtracking/e;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v1}, Lcom/umeng/commonsdk/statistics/idtracking/e;->e()V

    const/4 v1, 0x0

    .line 3
    sput-object v1, Lcom/umeng/commonsdk/statistics/idtracking/e;->b:Lcom/umeng/commonsdk/statistics/idtracking/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private a(Lcom/umeng/commonsdk/statistics/proto/c;)V
    .locals 2

    if-eqz p1, :cond_5

    .line 23
    iget-object v0, p1, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    if-eqz v0, :cond_5

    const-string v1, "mac"

    .line 24
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "header_device_id_mac"

    .line 25
    invoke-static {v0}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 26
    iget-object v0, p1, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    :cond_0
    iget-object v0, p1, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    const-string v1, "imei"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "header_device_id_imei"

    .line 28
    invoke-static {v0}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 29
    iget-object v0, p1, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    :cond_1
    iget-object v0, p1, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    const-string v1, "android_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "header_device_id_android_id"

    .line 31
    invoke-static {v0}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 32
    iget-object v0, p1, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    :cond_2
    iget-object v0, p1, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    const-string v1, "serial"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "header_device_id_serialNo"

    .line 34
    invoke-static {v0}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 35
    iget-object v0, p1, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    :cond_3
    iget-object v0, p1, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    const-string v1, "idfa"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "header_tracking_idfa"

    .line 37
    invoke-static {v0}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 38
    iget-object v0, p1, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    :cond_4
    iget-object v0, p1, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    const-string v1, "oaid"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "header_device_oaid"

    .line 40
    invoke-static {v0}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 41
    iget-object p1, p1, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    invoke-interface {p1, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    return-void
.end method

.method private a(Lcom/umeng/commonsdk/statistics/idtracking/a;)Z
    .locals 2

    .line 18
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->i:Lcom/umeng/commonsdk/statistics/idtracking/e$a;

    invoke-virtual {p1}, Lcom/umeng/commonsdk/statistics/idtracking/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/umeng/commonsdk/statistics/idtracking/e$a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 19
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->h:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 20
    :cond_0
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v0, :cond_1

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "invalid domain: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/umeng/commonsdk/statistics/idtracking/a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/MLog;->w(Ljava/lang/String;)V

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private b(Lcom/umeng/commonsdk/statistics/proto/c;)V
    .locals 2

    .line 13
    sget-object v0, Lcom/umeng/commonsdk/statistics/idtracking/e;->j:Ljava/lang/Object;

    monitor-enter v0

    if-eqz p1, :cond_0

    .line 14
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    :try_start_1
    invoke-direct {p0, p1}, Lcom/umeng/commonsdk/statistics/idtracking/e;->a(Lcom/umeng/commonsdk/statistics/proto/c;)V

    .line 16
    new-instance v1, Lcom/umeng/analytics/pro/ca;

    invoke-direct {v1}, Lcom/umeng/analytics/pro/ca;-><init>()V

    invoke-virtual {v1, p1}, Lcom/umeng/analytics/pro/ca;->a(Lcom/umeng/analytics/pro/br;)[B

    move-result-object p1

    .line 17
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_0

    .line 18
    :try_start_2
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->d:Ljava/io/File;

    invoke-static {v1, p1}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->writeFile(Ljava/io/File;[B)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 19
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catch_0
    move-exception p1

    .line 20
    :try_start_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 21
    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1
.end method

.method private declared-synchronized h()V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Lcom/umeng/commonsdk/statistics/proto/c;

    .line 3
    .line 4
    invoke-direct {v0}, Lcom/umeng/commonsdk/statistics/proto/c;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v1, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v2, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->h:Ljava/util/Set;

    .line 18
    .line 19
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_3

    .line 28
    .line 29
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Lcom/umeng/commonsdk/statistics/idtracking/a;

    .line 34
    .line 35
    invoke-virtual {v4}, Lcom/umeng/commonsdk/statistics/idtracking/a;->c()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-nez v5, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v4}, Lcom/umeng/commonsdk/statistics/idtracking/a;->d()Lcom/umeng/commonsdk/statistics/proto/b;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    if-eqz v5, :cond_2

    .line 47
    .line 48
    invoke-virtual {v4}, Lcom/umeng/commonsdk/statistics/idtracking/a;->b()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v4}, Lcom/umeng/commonsdk/statistics/idtracking/a;->d()Lcom/umeng/commonsdk/statistics/proto/b;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-virtual {v4}, Lcom/umeng/commonsdk/statistics/idtracking/a;->e()Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    if-eqz v5, :cond_0

    .line 64
    .line 65
    invoke-virtual {v4}, Lcom/umeng/commonsdk/statistics/idtracking/a;->e()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-nez v5, :cond_0

    .line 74
    .line 75
    invoke-virtual {v4}, Lcom/umeng/commonsdk/statistics/idtracking/a;->e()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-interface {v2, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    invoke-virtual {v0, v2}, Lcom/umeng/commonsdk/statistics/proto/c;->a(Ljava/util/List;)Lcom/umeng/commonsdk/statistics/proto/c;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1}, Lcom/umeng/commonsdk/statistics/proto/c;->a(Ljava/util/Map;)Lcom/umeng/commonsdk/statistics/proto/c;

    .line 87
    .line 88
    .line 89
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 90
    :try_start_1
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->e:Lcom/umeng/commonsdk/statistics/proto/c;

    .line 91
    .line 92
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    monitor-exit p0

    .line 94
    return-void

    .line 95
    :catchall_0
    move-exception v0

    .line 96
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 98
    :catchall_1
    move-exception v0

    .line 99
    monitor-exit p0

    .line 100
    throw v0
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method private i()Lcom/umeng/commonsdk/statistics/proto/c;
    .locals 7

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/idtracking/e;->j:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->d:Ljava/io/File;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 14
    return-object v2

    .line 15
    :cond_0
    :try_start_1
    new-instance v1, Ljava/io/FileInputStream;

    .line 16
    .line 17
    iget-object v3, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->d:Ljava/io/File;

    .line 18
    .line 19
    invoke-direct {v1, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    .line 22
    :try_start_2
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->readStreamToByteArray(Ljava/io/InputStream;)[B

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    new-instance v4, Lcom/umeng/commonsdk/statistics/proto/c;

    .line 27
    .line 28
    invoke-direct {v4}, Lcom/umeng/commonsdk/statistics/proto/c;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v5, Lcom/umeng/analytics/pro/bu;

    .line 32
    .line 33
    invoke-direct {v5}, Lcom/umeng/analytics/pro/bu;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v5, v4, v3}, Lcom/umeng/analytics/pro/bu;->a(Lcom/umeng/analytics/pro/br;[B)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 37
    .line 38
    .line 39
    :try_start_3
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->safeClose(Ljava/io/InputStream;)V

    .line 40
    .line 41
    .line 42
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 43
    return-object v4

    .line 44
    :catch_0
    move-exception v3

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v1

    .line 47
    move-object v6, v2

    .line 48
    move-object v2, v1

    .line 49
    move-object v1, v6

    .line 50
    goto :goto_1

    .line 51
    :catch_1
    move-exception v3

    .line 52
    move-object v1, v2

    .line 53
    :goto_0
    :try_start_4
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 54
    .line 55
    .line 56
    :try_start_5
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->safeClose(Ljava/io/InputStream;)V

    .line 57
    .line 58
    .line 59
    monitor-exit v0

    .line 60
    return-object v2

    .line 61
    :catchall_1
    move-exception v2

    .line 62
    :goto_1
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->safeClose(Ljava/io/InputStream;)V

    .line 63
    .line 64
    .line 65
    throw v2

    .line 66
    :catchall_2
    move-exception v1

    .line 67
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 68
    throw v1
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


# virtual methods
.method public a(J)V
    .locals 0

    .line 22
    iput-wide p1, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->g:J

    return-void
.end method

.method public declared-synchronized b()V
    .locals 6

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 2
    iget-wide v2, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->f:J

    sub-long v2, v0, v2

    iget-wide v4, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->g:J

    cmp-long v2, v2, v4

    if-ltz v2, :cond_5

    .line 3
    iget-object v2, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->h:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/umeng/commonsdk/statistics/idtracking/a;

    .line 4
    invoke-virtual {v4}, Lcom/umeng/commonsdk/statistics/idtracking/a;->c()Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {v4}, Lcom/umeng/commonsdk/statistics/idtracking/a;->a()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 6
    invoke-virtual {v4}, Lcom/umeng/commonsdk/statistics/idtracking/a;->c()Z

    move-result v3

    if-nez v3, :cond_2

    .line 7
    iget-object v3, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->i:Lcom/umeng/commonsdk/statistics/idtracking/e$a;

    invoke-virtual {v4}, Lcom/umeng/commonsdk/statistics/idtracking/a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/umeng/commonsdk/statistics/idtracking/e$a;->b(Ljava/lang/String;)V

    :cond_2
    const/4 v3, 0x1

    goto :goto_0

    :cond_3
    if-eqz v3, :cond_4

    .line 8
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/idtracking/e;->h()V

    .line 9
    iget-object v2, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->i:Lcom/umeng/commonsdk/statistics/idtracking/e$a;

    invoke-virtual {v2}, Lcom/umeng/commonsdk/statistics/idtracking/e$a;->a()V

    .line 10
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/idtracking/e;->g()V

    .line 11
    :cond_4
    iput-wide v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->f:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    :cond_5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()Lcom/umeng/commonsdk/statistics/proto/c;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->e:Lcom/umeng/commonsdk/statistics/proto/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    monitor-exit p0

    .line 8
    throw v0
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
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public declared-synchronized e()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lcom/umeng/commonsdk/statistics/idtracking/e;->b:Lcom/umeng/commonsdk/statistics/idtracking/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->h:Ljava/util/Set;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_3

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lcom/umeng/commonsdk/statistics/idtracking/a;

    .line 27
    .line 28
    invoke-virtual {v3}, Lcom/umeng/commonsdk/statistics/idtracking/a;->c()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-nez v4, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-virtual {v3}, Lcom/umeng/commonsdk/statistics/idtracking/a;->e()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    invoke-virtual {v3}, Lcom/umeng/commonsdk/statistics/idtracking/a;->e()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-nez v4, :cond_1

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    invoke-virtual {v3, v2}, Lcom/umeng/commonsdk/statistics/idtracking/a;->a(Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    goto :goto_0

    .line 57
    :cond_3
    if-eqz v2, :cond_4

    .line 58
    .line 59
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->e:Lcom/umeng/commonsdk/statistics/proto/c;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lcom/umeng/commonsdk/statistics/proto/c;->b(Z)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/idtracking/e;->g()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    .line 66
    .line 67
    :cond_4
    monitor-exit p0

    .line 68
    return-void

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    monitor-exit p0

    .line 71
    throw v0
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

.method public declared-synchronized f()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/idtracking/e;->i()Lcom/umeng/commonsdk/statistics/proto/c;

    .line 3
    .line 4
    .line 5
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    invoke-direct {p0, v0}, Lcom/umeng/commonsdk/statistics/idtracking/e;->a(Lcom/umeng/commonsdk/statistics/proto/c;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-object v2, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->h:Ljava/util/Set;

    .line 16
    .line 17
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    monitor-enter p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 25
    :try_start_2
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->e:Lcom/umeng/commonsdk/statistics/proto/c;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->h:Ljava/util/Set;

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Lcom/umeng/commonsdk/statistics/idtracking/a;

    .line 44
    .line 45
    iget-object v3, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->e:Lcom/umeng/commonsdk/statistics/proto/c;

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Lcom/umeng/commonsdk/statistics/idtracking/a;->a(Lcom/umeng/commonsdk/statistics/proto/c;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/umeng/commonsdk/statistics/idtracking/a;->c()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_1

    .line 55
    .line 56
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, Lcom/umeng/commonsdk/statistics/idtracking/a;

    .line 75
    .line 76
    iget-object v2, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->h:Ljava/util/Set;

    .line 77
    .line 78
    invoke-interface {v2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 83
    :try_start_3
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/idtracking/e;->h()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 84
    .line 85
    .line 86
    monitor-exit p0

    .line 87
    return-void

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 90
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 91
    :catchall_1
    move-exception v0

    .line 92
    monitor-exit p0

    .line 93
    throw v0
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

.method public declared-synchronized g()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/e;->e:Lcom/umeng/commonsdk/statistics/proto/c;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, v0}, Lcom/umeng/commonsdk/statistics/idtracking/e;->b(Lcom/umeng/commonsdk/statistics/proto/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    :cond_0
    monitor-exit p0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    monitor-exit p0

    .line 13
    throw v0
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
