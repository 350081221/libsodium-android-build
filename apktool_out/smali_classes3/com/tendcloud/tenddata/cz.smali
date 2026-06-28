.class public Lcom/tendcloud/tenddata/cz;
.super Lcom/tendcloud/tenddata/cy;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String; = "TalkingData"

.field public static final c:Ljava/lang/String; = "SaaS"

.field public static final d:I = 0x0

.field public static final e:I = 0x1

.field public static final f:I = 0x2

.field public static final g:I = 0x3

.field public static final h:I = 0x4

.field public static final i:I = 0x5

.field public static final j:I = 0x6

.field public static final k:I = 0x7

.field public static final l:I = 0x8

.field private static n:Ljava/lang/String; = ""

.field private static o:I = 0x4


# instance fields
.field private final m:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/cy;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Android"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tendcloud/tenddata/cz;->m:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v1, 0x5

    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "version"

    .line 14
    .line 15
    invoke-virtual {p0, v2, v1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "minorVersion"

    .line 24
    .line 25
    invoke-virtual {p0, v2, v1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const/16 v1, 0x1c

    .line 29
    .line 30
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "build"

    .line 35
    .line 36
    invoke-virtual {p0, v2, v1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    const-string v1, "2596"

    .line 40
    .line 41
    invoke-static {v1}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_0

    .line 46
    .line 47
    :try_start_0
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    const-string v2, "jobNum"

    .line 52
    .line 53
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {p0, v2, v1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    :catchall_0
    :cond_0
    const-string v1, "partner"

    .line 61
    .line 62
    const-string v2, "SaaS"

    .line 63
    .line 64
    invoke-virtual {p0, v1, v2}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    const-string v1, "platform"

    .line 68
    .line 69
    invoke-virtual {p0, v1, v0}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const-string v0, "type"

    .line 73
    .line 74
    const-string v1, "TalkingData"

    .line 75
    .line 76
    invoke-virtual {p0, v0, v1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    const-string v0, "framework"

    .line 80
    .line 81
    sget-object v1, Lcom/tendcloud/tenddata/cz;->n:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {p0, v0, v1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    sget v0, Lcom/tendcloud/tenddata/cz;->o:I

    .line 87
    .line 88
    if-lez v0, :cond_1

    .line 89
    .line 90
    const-string v1, "from"

    .line 91
    .line 92
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {p0, v1, v0}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_1
    return-void
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/cz;->n:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/tendcloud/tenddata/cy;->b:Lorg/json/JSONObject;

    const-string v1, "features"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    goto :goto_0

    .line 4
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/cy;->b:Lorg/json/JSONObject;

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 6
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    :try_start_1
    const-string v3, "name"

    .line 7
    invoke-virtual {v2, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "version"

    .line 8
    invoke-virtual {v2, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "minorVersion"

    .line 9
    invoke-virtual {v2, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 10
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 12
    :goto_1
    invoke-virtual {p0, v1, v0}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public setFrameWork(Ljava/lang/String;)V
    .locals 0

    sput-object p1, Lcom/tendcloud/tenddata/cz;->n:Ljava/lang/String;

    return-void
.end method

.method public setRule(I)V
    .locals 1

    .line 1
    const-string v0, "rule"

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, v0, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
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
