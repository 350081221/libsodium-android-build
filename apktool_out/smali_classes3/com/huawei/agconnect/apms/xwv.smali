.class public Lcom/huawei/agconnect/apms/xwv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/apms/u1;


# static fields
.field public static final cde:Lcom/huawei/agconnect/apms/log/AgentLog;


# instance fields
.field public abc:Lcom/huawei/agconnect/apms/fed;

.field public bcd:Lorg/json/JSONArray;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/xwv;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/json/JSONArray;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/huawei/agconnect/apms/xwv;->bcd:Lorg/json/JSONArray;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/huawei/agconnect/apms/xwv;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 13
    .line 14
    return-void
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


# virtual methods
.method public abc(Lcom/huawei/agconnect/apms/fed;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lcom/huawei/agconnect/apms/fed;->bcd:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lcom/huawei/agconnect/apms/xwv;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 6
    .line 7
    const-string v0, "cannot start network trace, because the url is null."

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/xwv;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    sget-object p1, Lcom/huawei/agconnect/apms/xwv;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 19
    .line 20
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 21
    .line 22
    new-array v1, v1, [Ljava/lang/Object;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    iget-object v0, v0, Lcom/huawei/agconnect/apms/fed;->bcd:Ljava/lang/String;

    .line 26
    .line 27
    aput-object v0, v1, v3

    .line 28
    .line 29
    const-string v0, "Network Trace \'%s\' has already started, should not start again."

    .line 30
    .line 31
    invoke-static {v2, v0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {p1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iput-object p1, p0, Lcom/huawei/agconnect/apms/xwv;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 40
    .line 41
    iput v1, p1, Lcom/huawei/agconnect/apms/fed;->abc:I

    .line 42
    .line 43
    invoke-static {}, Lcom/huawei/agconnect/apms/v1;->jkl()Lcom/huawei/agconnect/apms/v1;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-object p1, p1, Lcom/huawei/agconnect/apms/v1;->abc:Lcom/huawei/agconnect/apms/util/Session;

    .line 48
    .line 49
    invoke-static {}, Lcom/huawei/agconnect/apms/v1;->jkl()Lcom/huawei/agconnect/apms/v1;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0, p0}, Lcom/huawei/agconnect/apms/v1;->abc(Lcom/huawei/agconnect/apms/u1;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lcom/huawei/agconnect/apms/xwv;->bcd:Lorg/json/JSONArray;

    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/util/Session;->asJsonArray()Lorg/json/JSONArray;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/util/Session;->isSampled()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_2

    .line 70
    .line 71
    invoke-static {}, Lcom/huawei/agconnect/apms/e1;->cde()Lcom/huawei/agconnect/apms/e1;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/e1;->abc()V

    .line 76
    .line 77
    .line 78
    :cond_2
    return-void
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public addNewSession(Lcom/huawei/agconnect/apms/util/Session;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/xwv;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->mno()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lcom/huawei/agconnect/apms/xwv;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/huawei/agconnect/apms/xwv;->bcd:Lorg/json/JSONArray;

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/util/Session;->asJsonArray()Lorg/json/JSONArray;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
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
