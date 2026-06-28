.class public Lcom/tendcloud/tenddata/bn;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/bn$a;
    }
.end annotation


# static fields
.field private static volatile a:Lcom/tendcloud/tenddata/bn;


# instance fields
.field private b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object v0

    invoke-static {}, Lcom/tendcloud/tenddata/bn;->a()Lcom/tendcloud/tenddata/bn;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/z;->register(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    iput-object v0, p0, Lcom/tendcloud/tenddata/bn;->b:Ljava/util/HashMap;

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
.end method

.method public static a()Lcom/tendcloud/tenddata/bn;
    .locals 2

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/bn;->a:Lcom/tendcloud/tenddata/bn;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/tendcloud/tenddata/bp;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/bn;->a:Lcom/tendcloud/tenddata/bn;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/tendcloud/tenddata/bn;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/bn;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/bn;->a:Lcom/tendcloud/tenddata/bn;

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
    sget-object v0, Lcom/tendcloud/tenddata/bn;->a:Lcom/tendcloud/tenddata/bn;

    return-object v0
.end method

.method private final a(JLjava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 8

    const/4 v0, 0x1

    .line 15
    sput-boolean v0, Lcom/tendcloud/tenddata/zz;->c:Z

    .line 16
    iget-object v0, p0, Lcom/tendcloud/tenddata/bn;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "onPageBegin being called!  pagename: "

    if-eqz p4, :cond_1

    .line 17
    :try_start_0
    invoke-virtual {p4}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", refer: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    goto :goto_0

    .line 19
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    :goto_0
    if-eqz p3, :cond_2

    .line 20
    new-instance v0, Lcom/tendcloud/tenddata/bn$a;

    const/4 v7, 0x0

    move-object v1, v0

    move-object v2, p0

    move-wide v3, p1

    move-object v5, p4

    move-object v6, p3

    invoke-direct/range {v1 .. v7}, Lcom/tendcloud/tenddata/bn$a;-><init>(Lcom/tendcloud/tenddata/bn;JLjava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/bn$1;)V

    .line 21
    iget-object p1, p0, Lcom/tendcloud/tenddata/bn;->b:Ljava/util/HashMap;

    invoke-virtual {p1, p3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    new-instance p1, Lcom/tendcloud/tenddata/bv;

    invoke-direct {p1}, Lcom/tendcloud/tenddata/bv;-><init>()V

    const-string p2, "page"

    .line 23
    iput-object p2, p1, Lcom/tendcloud/tenddata/bv;->b:Ljava/lang/String;

    const-string p2, "enter"

    .line 24
    iput-object p2, p1, Lcom/tendcloud/tenddata/bv;->c:Ljava/lang/String;

    .line 25
    new-instance p2, Ljava/util/TreeMap;

    invoke-direct {p2}, Ljava/util/TreeMap;-><init>()V

    const-string p3, "startTime"

    .line 26
    invoke-static {v0}, Lcom/tendcloud/tenddata/bn$a;->access$100(Lcom/tendcloud/tenddata/bn$a;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p4

    invoke-interface {p2, p3, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p3, "duration"

    const/4 p4, 0x0

    .line 27
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p2, p3, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p3, "name"

    .line 28
    invoke-static {v0}, Lcom/tendcloud/tenddata/bn$a;->access$200(Lcom/tendcloud/tenddata/bn$a;)Ljava/lang/String;

    move-result-object p4

    invoke-interface {p2, p3, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p3, "from"

    .line 29
    invoke-static {v0}, Lcom/tendcloud/tenddata/bn$a;->access$300(Lcom/tendcloud/tenddata/bn$a;)Ljava/lang/String;

    move-result-object p4

    invoke-interface {p2, p3, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    iput-object p2, p1, Lcom/tendcloud/tenddata/bv;->d:Ljava/util/Map;

    .line 31
    iput-object p5, p1, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    .line 32
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_2
    return-void
.end method

.method private final a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 8

    .line 33
    iget-object v0, p0, Lcom/tendcloud/tenddata/bn;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 34
    :cond_0
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onPageEnd being called! pageName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 35
    iget-object v0, p0, Lcom/tendcloud/tenddata/bn;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tendcloud/tenddata/bn$a;

    if-eqz v0, :cond_1

    .line 36
    new-instance v1, Lcom/tendcloud/tenddata/bv;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/bv;-><init>()V

    const-string v2, "page"

    .line 37
    iput-object v2, v1, Lcom/tendcloud/tenddata/bv;->b:Ljava/lang/String;

    const-string v2, "leave"

    .line 38
    iput-object v2, v1, Lcom/tendcloud/tenddata/bv;->c:Ljava/lang/String;

    .line 39
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0}, Lcom/tendcloud/tenddata/bn$a;->access$400(Lcom/tendcloud/tenddata/bn$a;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    long-to-double v2, v2

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double/2addr v2, v4

    .line 40
    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    .line 41
    new-instance v4, Ljava/util/TreeMap;

    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    const-string v5, "startTime"

    .line 42
    invoke-static {v0}, Lcom/tendcloud/tenddata/bn$a;->access$400(Lcom/tendcloud/tenddata/bn$a;)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "name"

    .line 43
    invoke-interface {v4, v5, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "from"

    .line 44
    invoke-static {v0}, Lcom/tendcloud/tenddata/bn$a;->access$500(Lcom/tendcloud/tenddata/bn$a;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "duration"

    .line 45
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v4, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    iput-object v4, v1, Lcom/tendcloud/tenddata/bv;->d:Ljava/util/Map;

    .line 47
    iput-object p2, v1, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    .line 48
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object p2

    invoke-virtual {p2, v1}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V

    .line 49
    :cond_1
    sget-boolean p2, Lcom/tendcloud/tenddata/ab;->H:Z

    if-eqz p2, :cond_2

    .line 50
    invoke-static {p1}, Lcom/tendcloud/tenddata/i;->setLastActivity(Ljava/lang/String;)V

    .line 51
    :cond_2
    sput-object p1, Lcom/tendcloud/tenddata/ab;->I:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private a(Ljava/util/HashMap;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    const-string v0, "apiType"

    .line 7
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "service"

    .line 8
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/tendcloud/tenddata/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x4

    const-string v2, "pageName"

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    :try_start_1
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 10
    invoke-direct {p0, p1, v7}, Lcom/tendcloud/tenddata/bn;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    goto :goto_0

    .line 11
    :cond_1
    sget-object v0, Lcom/tendcloud/tenddata/ab;->I:Ljava/lang/String;

    if-nez v0, :cond_2

    invoke-static {}, Lcom/tendcloud/tenddata/i;->d()Ljava/lang/String;

    move-result-object v0

    :cond_2
    move-object v6, v0

    const-string v0, "occurTime"

    .line 12
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    .line 13
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    move-object v2, p0

    .line 14
    invoke-direct/range {v2 .. v7}, Lcom/tendcloud/tenddata/bn;->a(JLjava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :goto_0
    return-void
.end method


# virtual methods
.method public final onTDEBEventPage(Lcom/tendcloud/tenddata/zz$a;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v1, "apiType"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x4

    .line 23
    if-eq v0, v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x5

    .line 26
    if-eq v0, v1, :cond_1

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 30
    .line 31
    const-string v1, "occurTime"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    iget-object p1, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/bn;->a(Ljava/util/HashMap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    :catchall_0
    :cond_2
    :goto_0
    return-void
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
