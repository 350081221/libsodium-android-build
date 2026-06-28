.class public final Lcom/uyumao/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/uyumao/r;->a:Lorg/json/JSONObject;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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

.method public static synthetic a(Lcom/uyumao/r;)Lorg/json/JSONObject;
    .locals 0

    iget-object p0, p0, Lcom/uyumao/r;->a:Lorg/json/JSONObject;

    return-object p0
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/uyumao/r;->a:Lorg/json/JSONObject;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    sget-object v3, Lcom/uyumao/e;->a:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {v3}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppkey(Landroid/content/Context;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v6

    .line 12
    iget-object v0, p0, Lcom/uyumao/r;->a:Lorg/json/JSONObject;

    .line 13
    .line 14
    const-string v1, "batch"

    .line 15
    .line 16
    const/16 v2, 0x12c

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/16 v1, 0x64

    .line 23
    .line 24
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    iget-object v0, p0, Lcom/uyumao/r;->a:Lorg/json/JSONObject;

    .line 29
    .line 30
    const-string v1, "action"

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eq v4, v2, :cond_1

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    if-eq v4, v0, :cond_1

    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    new-instance v0, Lcom/uyumao/r$a;

    .line 44
    .line 45
    move-object v1, v0

    .line 46
    move-object v2, p0

    .line 47
    invoke-direct/range {v1 .. v6}, Lcom/uyumao/r$a;-><init>(Lcom/uyumao/r;Landroid/content/Context;IILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 51
    .line 52
    const-wide/16 v2, 0x0

    .line 53
    .line 54
    invoke-static {v0, v2, v3, v1}, Lcom/uyumao/s;->a(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    :catchall_0
    return-void
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
