.class public final Lcom/huawei/hms/analytics/as;
.super Lcom/huawei/hms/analytics/aq;
.source "SourceFile"


# static fields
.field private static final ijk:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/hms/analytics/as;->ijk:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "global_v2"

    const-string v1, "def_evt_params"

    invoke-direct {p0, p1, v0, v1}, Lcom/huawei/hms/analytics/aq;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private lmn(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/ax;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    new-instance v0, Lcom/huawei/hms/analytics/df;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/df;-><init>()V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hms/analytics/ax;

    :try_start_0
    sget-object v1, Lcom/huawei/hms/analytics/as;->ijk:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v2, v0, Lcom/huawei/hms/analytics/ax;->lmn:Ljava/lang/String;

    iget-object v0, v0, Lcom/huawei/hms/analytics/ax;->klm:Ljava/lang/Object;

    invoke-virtual {p0, v2, v0}, Lcom/huawei/hms/analytics/as;->lmn(Ljava/lang/String;Ljava/lang/Object;)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    const-string v0, "DefEvtParam"

    const-string v1, "addParam exception"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final lmn()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/aq;->ijk()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hms/analytics/bo;->lmn()Lcom/huawei/hms/analytics/bo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hms/analytics/bo;->klm()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/aq;->lmn(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/huawei/hms/analytics/aq;->lmn(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "DefEvtParam"

    const-string v1, "cache evt params is error"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/aq;->hij()V

    :cond_0
    :goto_0
    invoke-super {p0}, Lcom/huawei/hms/analytics/aq;->lmn()V

    return-void
.end method

.method public final lmn(Landroid/os/Bundle;)V
    .locals 7

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/aq;->ghi()V

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/os/BaseBundle;->size()I

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "DefEvtParam"

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v5, 0x100

    if-gt v4, v5, :cond_7

    sget-object v4, Lcom/huawei/hms/analytics/am;->klm:Ljava/util/regex/Pattern;

    invoke-virtual {v4, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_3

    iget-object v3, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    invoke-static {v4}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-le v6, v5, :cond_4

    goto :goto_1

    :cond_4
    if-nez v1, :cond_5

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_5
    new-instance v3, Lcom/huawei/hms/analytics/ax;

    invoke-direct {v3, v2, v4}, Lcom/huawei/hms/analytics/ax;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    :goto_1
    const-string v2, "defEvtParams value check failed! pls check value type or length"

    goto :goto_3

    :cond_7
    :goto_2
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "defEvtParams key check failed! key= "

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_3
    invoke-static {v3, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_8
    invoke-direct {p0, v1}, Lcom/huawei/hms/analytics/as;->lmn(Ljava/util/List;)V

    invoke-static {}, Lcom/huawei/hms/analytics/bo;->lmn()Lcom/huawei/hms/analytics/bo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/bo;->klm()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/aq;->fgh()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/hms/analytics/aq;->klm(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/huawei/hms/analytics/aq;->lmn(Ljava/lang/String;)V

    return-void
.end method

.method public final lmn(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    if-nez v0, :cond_1

    if-nez p2, :cond_1

    return-void

    :cond_1
    if-nez p2, :cond_2

    iget-object p2, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    const/16 v0, 0x64

    invoke-virtual {p0, v0}, Lcom/huawei/hms/analytics/aq;->lmn(I)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void
.end method
