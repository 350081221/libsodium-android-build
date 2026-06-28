.class public Lcom/umeng/commonsdk/config/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/commonsdk/config/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "Config"

    .line 2
    .line 3
    if-eqz p1, :cond_4

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-gtz v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    const-wide/16 v3, -0x1

    .line 17
    .line 18
    cmp-long v3, v1, v3

    .line 19
    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    const-string p1, "--->>> SensitiveFieldHandler: handleConfigItem: invalid config value."

    .line 23
    .line 24
    invoke-static {v0, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v4, "--->>> CollectFieldJudgment: handleConfigItem: item : "

    .line 34
    .line 35
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {v0, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    if-eqz p2, :cond_3

    .line 49
    .line 50
    instance-of p1, p2, Lcom/umeng/commonsdk/config/b;

    .line 51
    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    :goto_0
    :try_start_1
    array-length v0, p3

    .line 56
    if-ge p1, v0, :cond_3

    .line 57
    .line 58
    aget-object v0, p3, p1

    .line 59
    .line 60
    invoke-static {v0}, Lcom/umeng/commonsdk/config/d;->a(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_2

    .line 65
    .line 66
    invoke-static {v1, v2, p1}, Lcom/umeng/commonsdk/config/a;->a(JI)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    move-object v4, p2

    .line 75
    check-cast v4, Lcom/umeng/commonsdk/config/b;

    .line 76
    .line 77
    invoke-virtual {v4, v0, v3}, Lcom/umeng/commonsdk/config/b;->a(Ljava/lang/String;Ljava/lang/Boolean;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    .line 79
    .line 80
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    :cond_3
    return-void

    .line 84
    :catchall_1
    const-string p1, "--->>> SensitiveFieldHandler: handleConfigItem: parseLong exception."

    .line 85
    .line 86
    invoke-static {v0, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_4
    :goto_1
    return-void
    .line 90
.end method
