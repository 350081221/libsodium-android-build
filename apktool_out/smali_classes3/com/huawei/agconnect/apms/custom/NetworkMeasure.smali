.class public Lcom/huawei/agconnect/apms/custom/NetworkMeasure;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final fgh:Lcom/huawei/agconnect/apms/log/AgentLog;


# instance fields
.field public abc:Lcom/huawei/agconnect/apms/xwv;

.field public volatile bcd:Z

.field public cde:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public def:Ljava/lang/String;

.field public efg:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->fgh:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->cde:Ljava/util/Map;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->bcd:Z

    .line 13
    .line 14
    new-instance v0, Lcom/huawei/agconnect/apms/xwv;

    .line 15
    .line 16
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/xwv;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->abc:Lcom/huawei/agconnect/apms/xwv;

    .line 20
    .line 21
    iput-object p1, p0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->def:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p2, p0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->efg:Ljava/lang/String;

    .line 24
    .line 25
    return-void
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


# virtual methods
.method public getProperties()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->cde:Ljava/util/Map;

    return-object v0
.end method

.method public getProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->fgh:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 4
    .line 5
    const-string v0, "can\'t get a property because the property name is null."

    .line 6
    .line 7
    invoke-interface {p1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string p1, ""

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->cde:Ljava/util/Map;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Ljava/lang/String;

    .line 24
    .line 25
    return-object p1
    .line 26
    .line 27
.end method

.method public putProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/util/AbstractMap$SimpleEntry;

    .line 9
    .line 10
    invoke-direct {v0, p1, p2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/huawei/agconnect/apms/x1;->abc(Ljava/util/Map$Entry;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "%s, can not set property \'%s\' with value \'%s\'."

    .line 18
    .line 19
    const/4 v2, 0x3

    .line 20
    const/4 v3, 0x2

    .line 21
    const/4 v4, 0x1

    .line 22
    const/4 v5, 0x0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    sget-object v6, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->fgh:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 26
    .line 27
    sget-object v7, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 28
    .line 29
    new-array v2, v2, [Ljava/lang/Object;

    .line 30
    .line 31
    aput-object v0, v2, v5

    .line 32
    .line 33
    aput-object p1, v2, v4

    .line 34
    .line 35
    aput-object p2, v2, v3

    .line 36
    .line 37
    invoke-static {v7, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-interface {v6, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->bcd:Z

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    sget-object v0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->fgh:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 50
    .line 51
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 52
    .line 53
    new-array v2, v3, [Ljava/lang/Object;

    .line 54
    .line 55
    aput-object p1, v2, v5

    .line 56
    .line 57
    aput-object p2, v2, v4

    .line 58
    .line 59
    const-string p1, "networkMeasure has already been stopped, can not set property \'%s\' with value \'%s\'."

    .line 60
    .line 61
    invoke-static {v1, p1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-interface {v0, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->cde:Ljava/util/Map;

    .line 70
    .line 71
    invoke-static {v0, p1}, Lcom/huawei/agconnect/apms/x1;->abc(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    sget-object v6, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->fgh:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 78
    .line 79
    sget-object v7, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 80
    .line 81
    new-array v2, v2, [Ljava/lang/Object;

    .line 82
    .line 83
    aput-object v0, v2, v5

    .line 84
    .line 85
    aput-object p1, v2, v4

    .line 86
    .line 87
    aput-object p2, v2, v3

    .line 88
    .line 89
    invoke-static {v7, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-interface {v6, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_3
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->cde:Ljava/util/Map;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    return-void
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method public removeProperty(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->bcd:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    sget-object p1, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->fgh:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 13
    .line 14
    const-string v0, "can\'t remove a property from a networkMeasure which has been stopped."

    .line 15
    .line 16
    invoke-interface {p1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->cde:Ljava/util/Map;

    .line 21
    .line 22
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
.end method

.method public setBytesReceived(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->abc:Lcom/huawei/agconnect/apms/xwv;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/huawei/agconnect/apms/xwv;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Lcom/huawei/agconnect/apms/fed;->abc(J)V

    .line 8
    .line 9
    .line 10
    :cond_0
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

.method public setBytesSent(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->abc:Lcom/huawei/agconnect/apms/xwv;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/huawei/agconnect/apms/xwv;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Lcom/huawei/agconnect/apms/fed;->bcd(J)V

    .line 8
    .line 9
    .line 10
    :cond_0
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

.method public setContentType(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->abc:Lcom/huawei/agconnect/apms/xwv;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/huawei/agconnect/apms/xwv;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-object p1, v0, Lcom/huawei/agconnect/apms/fed;->efg:Ljava/lang/String;

    .line 8
    .line 9
    :cond_0
    return-void
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

.method public setStatusCode(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->abc:Lcom/huawei/agconnect/apms/xwv;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/huawei/agconnect/apms/xwv;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iput p1, v0, Lcom/huawei/agconnect/apms/fed;->jkl:I

    .line 14
    .line 15
    :cond_0
    return-void
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

.method public start()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Lcom/huawei/agconnect/apms/fed;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/fed;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->def:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/fed;->def(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->efg:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/fed;->bcd(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->abc:Lcom/huawei/agconnect/apms/xwv;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lcom/huawei/agconnect/apms/xwv;->abc(Lcom/huawei/agconnect/apms/fed;)V

    .line 26
    .line 27
    .line 28
    return-void
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

.method public stop()V
    .locals 10

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->abc:Lcom/huawei/agconnect/apms/xwv;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->cde:Ljava/util/Map;

    .line 11
    .line 12
    iget-object v2, v0, Lcom/huawei/agconnect/apms/xwv;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    sget-object v0, Lcom/huawei/agconnect/apms/xwv;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 18
    .line 19
    const-string v1, "network Trace has not been started so unable to stop."

    .line 20
    .line 21
    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    goto/16 :goto_2

    .line 25
    .line 26
    :cond_1
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    sget-object v1, Lcom/huawei/agconnect/apms/xwv;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 33
    .line 34
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 35
    .line 36
    new-array v4, v3, [Ljava/lang/Object;

    .line 37
    .line 38
    iget-object v0, v0, Lcom/huawei/agconnect/apms/xwv;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 39
    .line 40
    iget-object v0, v0, Lcom/huawei/agconnect/apms/fed;->bcd:Ljava/lang/String;

    .line 41
    .line 42
    const/4 v5, 0x0

    .line 43
    aput-object v0, v4, v5

    .line 44
    .line 45
    const-string v0, "network Trace \'%s\' has already stopped, should not stop again."

    .line 46
    .line 47
    invoke-static {v2, v0, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-interface {v1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    invoke-static {}, Lcom/huawei/agconnect/apms/v1;->jkl()Lcom/huawei/agconnect/apms/v1;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2, v0}, Lcom/huawei/agconnect/apms/v1;->bcd(Lcom/huawei/agconnect/apms/u1;)V

    .line 60
    .line 61
    .line 62
    invoke-static {}, Lcom/huawei/agconnect/apms/v1;->jkl()Lcom/huawei/agconnect/apms/v1;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iget-object v2, v2, Lcom/huawei/agconnect/apms/v1;->abc:Lcom/huawei/agconnect/apms/util/Session;

    .line 67
    .line 68
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/util/Session;->isSampled()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_3

    .line 73
    .line 74
    invoke-static {}, Lcom/huawei/agconnect/apms/e1;->cde()Lcom/huawei/agconnect/apms/e1;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/e1;->abc()V

    .line 79
    .line 80
    .line 81
    :cond_3
    iget-object v2, v0, Lcom/huawei/agconnect/apms/xwv;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 82
    .line 83
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/fed;->bcd()Lcom/huawei/agconnect/apms/gfe;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    if-eqz v2, :cond_5

    .line 88
    .line 89
    new-instance v4, Lcom/huawei/agconnect/apms/collect/model/event/custom/CustomHttpEvent;

    .line 90
    .line 91
    iget-object v0, v0, Lcom/huawei/agconnect/apms/xwv;->bcd:Lorg/json/JSONArray;

    .line 92
    .line 93
    new-instance v5, Lorg/json/JSONArray;

    .line 94
    .line 95
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-eqz v6, :cond_4

    .line 111
    .line 112
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    check-cast v6, Ljava/util/Map$Entry;

    .line 117
    .line 118
    new-instance v7, Lorg/json/JSONObject;

    .line 119
    .line 120
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 121
    .line 122
    .line 123
    :try_start_0
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    check-cast v8, Ljava/lang/String;

    .line 128
    .line 129
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    invoke-virtual {v7, v8, v6}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :catch_0
    move-exception v6

    .line 138
    sget-object v8, Lcom/huawei/agconnect/apms/xwv;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 139
    .line 140
    const-string v9, "getPropertyArray "

    .line 141
    .line 142
    invoke-static {v9}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    invoke-interface {v8, v6}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    :goto_1
    invoke-virtual {v5, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 161
    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_4
    invoke-direct {v4, v2, v0, v5}, Lcom/huawei/agconnect/apms/collect/model/event/custom/CustomHttpEvent;-><init>(Lcom/huawei/agconnect/apms/gfe;Lorg/json/JSONArray;Lorg/json/JSONArray;)V

    .line 165
    .line 166
    .line 167
    invoke-static {v4}, Lcom/huawei/agconnect/apms/yza;->abc(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    :cond_5
    :goto_2
    iput-boolean v3, p0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;->bcd:Z

    .line 171
    .line 172
    return-void
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method
