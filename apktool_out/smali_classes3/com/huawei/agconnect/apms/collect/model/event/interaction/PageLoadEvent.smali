.class public Lcom/huawei/agconnect/apms/collect/model/event/interaction/PageLoadEvent;
.super Lcom/huawei/agconnect/apms/collect/model/event/Event;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/agconnect/apms/collect/model/event/interaction/PageLoadEvent$PageLoadType;
    }
.end annotation


# instance fields
.field public loadTime:J

.field public pageLoadInfo:Lcom/huawei/agconnect/apms/l0;

.field public viewName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/huawei/agconnect/apms/l0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/huawei/agconnect/apms/collect/model/event/Event;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p2, Lcom/huawei/agconnect/apms/l0;->def:Lcom/huawei/agconnect/apms/c;

    .line 5
    .line 6
    iget-wide v0, v0, Lcom/huawei/agconnect/apms/c;->abc:J

    .line 7
    .line 8
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/Event;->timestamp:J

    .line 9
    .line 10
    iput-object p1, p0, Lcom/huawei/agconnect/apms/collect/model/event/interaction/PageLoadEvent;->viewName:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p2}, Lcom/huawei/agconnect/apms/l0;->bcd()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/interaction/PageLoadEvent;->loadTime:J

    .line 17
    .line 18
    iput-object p2, p0, Lcom/huawei/agconnect/apms/collect/model/event/interaction/PageLoadEvent;->pageLoadInfo:Lcom/huawei/agconnect/apms/l0;

    .line 19
    .line 20
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getRuntimeEnvInformation()Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcom/huawei/agconnect/apms/collect/model/event/Event;->runtimeEnvInformation:Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;

    .line 25
    .line 26
    return-void
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

.method private isSlowInteraction(JJ)I
    .locals 2

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/ghi;->def()Lcom/huawei/agconnect/apms/ghi;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/ghi;->bcd()J

    .line 6
    .line 7
    .line 8
    const-wide/16 v0, 0x3e8

    .line 9
    .line 10
    cmp-long p1, p1, v0

    .line 11
    .line 12
    if-ltz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    :cond_0
    invoke-static {}, Lcom/huawei/agconnect/apms/ghi;->def()Lcom/huawei/agconnect/apms/ghi;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/ghi;->cde()J

    .line 21
    .line 22
    .line 23
    const-wide/16 p1, 0xbb8

    .line 24
    .line 25
    cmp-long p1, p3, p1

    .line 26
    .line 27
    if-ltz p1, :cond_1

    .line 28
    .line 29
    const/4 p1, 0x2

    .line 30
    return p1

    .line 31
    :cond_1
    const/4 p1, 0x0

    .line 32
    return p1
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


# virtual methods
.method public asJsonArray()Lorg/json/JSONArray;
    .locals 5

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/Event;->runtimeEnvInformation:Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->asJsonArray()Lorg/json/JSONArray;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 13
    .line 14
    .line 15
    iget-wide v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/Event;->timestamp:J

    .line 16
    .line 17
    invoke-static {v1, v2, v0}, Lcom/huawei/agconnect/apms/abc;->abc(JLorg/json/JSONArray;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/interaction/PageLoadEvent;->viewName:Ljava/lang/String;

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    const-string v1, "null"

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 27
    .line 28
    .line 29
    iget-wide v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/interaction/PageLoadEvent;->loadTime:J

    .line 30
    .line 31
    invoke-static {v1, v2, v0}, Lcom/huawei/agconnect/apms/abc;->abc(JLorg/json/JSONArray;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/interaction/PageLoadEvent;->pageLoadInfo:Lcom/huawei/agconnect/apms/l0;

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/l0;->abc()J

    .line 37
    .line 38
    .line 39
    move-result-wide v1

    .line 40
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {v1}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/Number;)Ljava/lang/Number;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 49
    .line 50
    .line 51
    iget-wide v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/interaction/PageLoadEvent;->loadTime:J

    .line 52
    .line 53
    iget-object v3, p0, Lcom/huawei/agconnect/apms/collect/model/event/interaction/PageLoadEvent;->pageLoadInfo:Lcom/huawei/agconnect/apms/l0;

    .line 54
    .line 55
    invoke-virtual {v3}, Lcom/huawei/agconnect/apms/l0;->abc()J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    invoke-direct {p0, v1, v2, v3, v4}, Lcom/huawei/agconnect/apms/collect/model/event/interaction/PageLoadEvent;->isSlowInteraction(JJ)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 64
    .line 65
    .line 66
    if-lez v1, :cond_1

    .line 67
    .line 68
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/interaction/PageLoadEvent;->pageLoadInfo:Lcom/huawei/agconnect/apms/l0;

    .line 69
    .line 70
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/l0;->asJsonObject()Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    goto :goto_0

    .line 75
    :cond_1
    new-instance v1, Lorg/json/JSONObject;

    .line 76
    .line 77
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 78
    .line 79
    .line 80
    :goto_0
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 81
    .line 82
    .line 83
    return-object v0
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
