.class public Lcom/umeng/analytics/pro/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/pro/r$a;
    }
.end annotation


# static fields
.field private static final a:I = 0x0

.field private static final b:I = 0x1

.field private static final c:I = 0x2

.field private static final d:I = 0x3


# instance fields
.field private final e:J


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0xea60

    .line 3
    iput-wide v0, p0, Lcom/umeng/analytics/pro/r;->e:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/umeng/analytics/pro/r$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/umeng/analytics/pro/r;-><init>()V

    return-void
.end method

.method public static a()Lcom/umeng/analytics/pro/r;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/r$a;->a:Lcom/umeng/analytics/pro/r;

    return-object v0
.end method

.method private a(Lorg/json/JSONObject;Z)V
    .locals 2

    if-nez p2, :cond_0

    const-string p2, "sessions"

    .line 3
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    :cond_0
    const-string p2, "active_user"

    .line 5
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    :cond_1
    const-string v0, "error"

    .line 7
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    :cond_2
    const-string v0, "ekv"

    .line 9
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 10
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    :cond_3
    const-string v0, "gkv"

    .line 11
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 12
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    :cond_4
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 14
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    :cond_5
    const-string p2, "userlevel"

    .line 15
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 16
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    :cond_6
    return-void
.end method

.method private b()Lorg/json/JSONArray;
    .locals 7

    .line 23
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 24
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 25
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const-string v4, "id"

    .line 26
    invoke-static {}, Lcom/umeng/analytics/pro/y;->a()Lcom/umeng/analytics/pro/y;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v6}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getAppContext(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/umeng/analytics/pro/y;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "start_time"

    .line 27
    invoke-virtual {v3, v4, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v4, "end_time"

    const-wide/32 v5, 0xea60

    add-long/2addr v1, v5

    .line 28
    invoke-virtual {v3, v4, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "duration"

    .line 29
    invoke-virtual {v3, v1, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 30
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method private c()Lorg/json/JSONArray;
    .locals 7

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    new-instance v3, Lorg/json/JSONObject;

    .line 11
    .line 12
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v4, "id"

    .line 16
    .line 17
    invoke-static {}, Lcom/umeng/analytics/pro/y;->a()Lcom/umeng/analytics/pro/y;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    const/4 v6, 0x0

    .line 22
    invoke-static {v6}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getAppContext(Landroid/content/Context;)Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    invoke-virtual {v5, v6}, Lcom/umeng/analytics/pro/y;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 31
    .line 32
    .line 33
    const-string v4, "start_time"

    .line 34
    .line 35
    invoke-virtual {v3, v4, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    :catch_0
    return-object v0
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


# virtual methods
.method public a(Landroid/content/Context;)I
    .locals 2

    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "defcon"

    invoke-static {p1, v1, v0}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public a(Lorg/json/JSONObject;Landroid/content/Context;)V
    .locals 4

    .line 17
    invoke-virtual {p0, p2}, Lcom/umeng/analytics/pro/r;->a(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    .line 18
    invoke-direct {p0, p1, v2}, Lcom/umeng/analytics/pro/r;->a(Lorg/json/JSONObject;Z)V

    .line 19
    invoke-static {p2}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object p1

    invoke-virtual {p1, v1, v2}, Lcom/umeng/analytics/pro/i;->b(ZZ)V

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    const-string v0, "sessions"

    .line 20
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    :try_start_0
    invoke-direct {p0}, Lcom/umeng/analytics/pro/r;->b()Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    :catch_0
    invoke-direct {p0, p1, v2}, Lcom/umeng/analytics/pro/r;->a(Lorg/json/JSONObject;Z)V

    .line 23
    invoke-static {p2}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object p1

    invoke-virtual {p1, v1, v2}, Lcom/umeng/analytics/pro/i;->b(ZZ)V

    goto :goto_0

    :cond_1
    const/4 v3, 0x3

    if-ne v0, v3, :cond_2

    .line 24
    invoke-direct {p0, p1, v1}, Lcom/umeng/analytics/pro/r;->a(Lorg/json/JSONObject;Z)V

    .line 25
    invoke-static {p2}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object p1

    invoke-virtual {p1, v1, v2}, Lcom/umeng/analytics/pro/i;->b(ZZ)V

    :cond_2
    :goto_0
    return-void
.end method

.method public b(Lorg/json/JSONObject;Landroid/content/Context;)V
    .locals 8

    const-string v0, "_$pp"

    const-string v1, "_$sp"

    .line 1
    invoke-virtual {p0, p2}, Lcom/umeng/analytics/pro/r;->a(Landroid/content/Context;)I

    move-result v2

    const/4 v3, 0x0

    const-string v4, "sessions"

    const-string v5, "active_user"

    const/4 v6, 0x1

    if-ne v2, v6, :cond_4

    .line 2
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    :cond_0
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 5
    :try_start_0
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_3

    .line 7
    invoke-virtual {p1, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 8
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 9
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    :cond_1
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 11
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 12
    :catch_0
    :cond_3
    invoke-static {p2}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object p1

    invoke-virtual {p1, v3, v6}, Lcom/umeng/analytics/pro/i;->a(ZZ)V

    goto :goto_1

    :cond_4
    const/4 v0, 0x2

    if-ne v2, v0, :cond_7

    .line 13
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 14
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    :cond_5
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 16
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    :cond_6
    :try_start_1
    invoke-direct {p0}, Lcom/umeng/analytics/pro/r;->c()Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {p1, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 18
    :catch_1
    invoke-static {p2}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object p1

    invoke-virtual {p1, v3, v6}, Lcom/umeng/analytics/pro/i;->a(ZZ)V

    goto :goto_1

    :cond_7
    const/4 v0, 0x3

    if-ne v2, v0, :cond_9

    .line 19
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 20
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    :cond_8
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    invoke-static {p2}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object p1

    invoke-virtual {p1, v3, v6}, Lcom/umeng/analytics/pro/i;->a(ZZ)V

    :cond_9
    :goto_1
    return-void
.end method
