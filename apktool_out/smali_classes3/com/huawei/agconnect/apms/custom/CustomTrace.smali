.class public Lcom/huawei/agconnect/apms/custom/CustomTrace;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/apms/u1;
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/huawei/agconnect/apms/custom/CustomTrace;",
            ">;"
        }
    .end annotation
.end field

.field public static final MAX_CUSTOM_TRACE_NAME_LENGTH:I = 0x64

.field public static final MAX_CUSTOM_TRACE_PROPERTIES:I = 0x5

.field public static final MAX_MEASURE_NAME_LENGTH:I = 0x64

.field public static final MAX_PROPERTY_KEY_LENGTH:I = 0x28

.field public static final MAX_PROPERTY_VALUE_LENGTH:I = 0x64

.field public static final NAME_RULE:Ljava/lang/String; = "^[\\u4e00-\\u9fa5_a-zA-Z0-9]+$"

.field public static final ghi:Lcom/huawei/agconnect/apms/log/AgentLog;


# instance fields
.field public abc:Ljava/lang/String;

.field public volatile bcd:Ljava/lang/Long;

.field public volatile cde:Ljava/lang/Long;

.field public def:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public efg:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/huawei/agconnect/apms/custom/TraceMeasure;",
            ">;"
        }
    .end annotation
.end field

.field public fgh:Lorg/json/JSONArray;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 6
    .line 7
    new-instance v0, Lcom/huawei/agconnect/apms/custom/CustomTrace$abc;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/custom/CustomTrace$abc;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->CREATOR:Landroid/os/Parcelable$Creator;

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

.method public synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/agconnect/apms/custom/CustomTrace$abc;)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->abc:Ljava/lang/String;

    .line 8
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p2, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->def:Ljava/util/Map;

    .line 9
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p2, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->efg:Ljava/util/Map;

    .line 10
    const-class v0, Lcom/huawei/agconnect/apms/custom/TraceMeasure;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->readMap(Ljava/util/Map;Ljava/lang/ClassLoader;)V

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->bcd:Ljava/lang/Long;

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->cde:Ljava/lang/Long;

    .line 13
    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    iput-object p1, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->fgh:Lorg/json/JSONArray;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->abc:Ljava/lang/String;

    .line 3
    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    iput-object p1, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->fgh:Lorg/json/JSONArray;

    .line 4
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->def:Ljava/util/Map;

    .line 5
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->efg:Ljava/util/Map;

    return-void
.end method

.method public static getInstance(Ljava/lang/String;)Lcom/huawei/agconnect/apms/custom/CustomTrace;
    .locals 1

    new-instance v0, Lcom/huawei/agconnect/apms/custom/CustomTrace;

    invoke-direct {v0, p0}, Lcom/huawei/agconnect/apms/custom/CustomTrace;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final abc(Ljava/lang/String;)Lcom/huawei/agconnect/apms/custom/TraceMeasure;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->efg:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/agconnect/apms/custom/TraceMeasure;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/huawei/agconnect/apms/custom/TraceMeasure;

    invoke-direct {v0, p1}, Lcom/huawei/agconnect/apms/custom/TraceMeasure;-><init>(Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->efg:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public final abc()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->bcd:Ljava/lang/Long;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public addNewSession(Lcom/huawei/agconnect/apms/util/Session;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/custom/CustomTrace;->abc()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/custom/CustomTrace;->bcd()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->fgh:Lorg/json/JSONArray;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/util/Session;->asJsonArray()Lorg/json/JSONArray;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
    .line 26
    .line 27
.end method

.method public final bcd()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->cde:Ljava/lang/Long;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public finalize()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/custom/CustomTrace;->abc()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/custom/CustomTrace;->bcd()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 14
    .line 15
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    const-string v2, "customTrace \'%s\' is started but not stopped when it is destructed."

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    :try_start_1
    new-array v3, v3, [Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v4, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->abc:Ljava/lang/String;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    aput-object v4, v3, v5

    .line 26
    .line 27
    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 40
    .line 41
    .line 42
    throw v0
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

.method public getMeasure(Ljava/lang/String;)J
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v2, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->efg:Ljava/util/Map;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lcom/huawei/agconnect/apms/custom/TraceMeasure;

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/custom/TraceMeasure;->bcd()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    :cond_1
    :goto_0
    return-wide v0
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
.end method

.method public getProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcom/huawei/agconnect/apms/custom/CustomTrace;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

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
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->def:Ljava/util/Map;

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

.method public getTraceProperties()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->def:Ljava/util/Map;

    return-object v0
.end method

.method public incrementMeasure(Ljava/lang/String;J)V
    .locals 4

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
    invoke-static {p1}, Lcom/huawei/agconnect/apms/x1;->cde(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x2

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    sget-object p2, Lcom/huawei/agconnect/apms/custom/CustomTrace;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 18
    .line 19
    sget-object p3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 20
    .line 21
    new-array v3, v3, [Ljava/lang/Object;

    .line 22
    .line 23
    aput-object v0, v3, v2

    .line 24
    .line 25
    aput-object p1, v3, v1

    .line 26
    .line 27
    const-string p1, "%s, cannot increment measure \'%s\'. Measure name is invalid."

    .line 28
    .line 29
    invoke-static {p3, p1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {p2, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/custom/CustomTrace;->abc()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    sget-object p2, Lcom/huawei/agconnect/apms/custom/CustomTrace;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 44
    .line 45
    sget-object p3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 46
    .line 47
    new-array v0, v3, [Ljava/lang/Object;

    .line 48
    .line 49
    aput-object p1, v0, v2

    .line 50
    .line 51
    iget-object p1, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->abc:Ljava/lang/String;

    .line 52
    .line 53
    aput-object p1, v0, v1

    .line 54
    .line 55
    const-string p1, "cannot increment measure \'%s\' for custom trace \'%s\' which has not been started."

    .line 56
    .line 57
    invoke-static {p3, p1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-interface {p2, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/custom/CustomTrace;->bcd()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    sget-object p2, Lcom/huawei/agconnect/apms/custom/CustomTrace;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 72
    .line 73
    sget-object p3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 74
    .line 75
    new-array v0, v3, [Ljava/lang/Object;

    .line 76
    .line 77
    aput-object p1, v0, v2

    .line 78
    .line 79
    iget-object p1, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->abc:Ljava/lang/String;

    .line 80
    .line 81
    aput-object p1, v0, v1

    .line 82
    .line 83
    const-string p1, "cannot increment measure \'%s\' for custom trace \'%s\' which has been stopped."

    .line 84
    .line 85
    invoke-static {p3, p1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-interface {p2, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/apms/custom/CustomTrace;->abc(Ljava/lang/String;)Lcom/huawei/agconnect/apms/custom/TraceMeasure;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1, p2, p3}, Lcom/huawei/agconnect/apms/custom/TraceMeasure;->abc(J)V

    .line 102
    .line 103
    .line 104
    return-void
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
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

.method public putMeasure(Ljava/lang/String;J)V
    .locals 4

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
    invoke-static {p1}, Lcom/huawei/agconnect/apms/x1;->cde(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x2

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    sget-object p2, Lcom/huawei/agconnect/apms/custom/CustomTrace;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 18
    .line 19
    sget-object p3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 20
    .line 21
    new-array v3, v3, [Ljava/lang/Object;

    .line 22
    .line 23
    aput-object v0, v3, v2

    .line 24
    .line 25
    aput-object p1, v3, v1

    .line 26
    .line 27
    const-string p1, "%s, cannot set measure \'%s\'. Measure name is invalid."

    .line 28
    .line 29
    invoke-static {p3, p1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {p2, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/custom/CustomTrace;->abc()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    sget-object p2, Lcom/huawei/agconnect/apms/custom/CustomTrace;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 44
    .line 45
    sget-object p3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 46
    .line 47
    new-array v0, v3, [Ljava/lang/Object;

    .line 48
    .line 49
    aput-object p1, v0, v2

    .line 50
    .line 51
    iget-object p1, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->abc:Ljava/lang/String;

    .line 52
    .line 53
    aput-object p1, v0, v1

    .line 54
    .line 55
    const-string p1, "cannot set measure \'%s\' for custom trace \'%s\' which has not been started."

    .line 56
    .line 57
    invoke-static {p3, p1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-interface {p2, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/custom/CustomTrace;->bcd()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    sget-object p2, Lcom/huawei/agconnect/apms/custom/CustomTrace;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 72
    .line 73
    sget-object p3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 74
    .line 75
    new-array v0, v3, [Ljava/lang/Object;

    .line 76
    .line 77
    aput-object p1, v0, v2

    .line 78
    .line 79
    iget-object p1, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->abc:Ljava/lang/String;

    .line 80
    .line 81
    aput-object p1, v0, v1

    .line 82
    .line 83
    const-string p1, "cannot set measure \'%s\' for custom trace \'%s\' which has been stopped."

    .line 84
    .line 85
    invoke-static {p3, p1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-interface {p2, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/apms/custom/CustomTrace;->abc(Ljava/lang/String;)Lcom/huawei/agconnect/apms/custom/TraceMeasure;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1, p2, p3}, Lcom/huawei/agconnect/apms/custom/TraceMeasure;->bcd(J)V

    .line 102
    .line 103
    .line 104
    return-void
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
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
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/custom/CustomTrace;->bcd()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const-string v1, "%s, can not set property \'%s\' with value \'%s\'."

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    const/4 v3, 0x3

    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x1

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 21
    .line 22
    new-array v6, v5, [Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v7, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->abc:Ljava/lang/String;

    .line 25
    .line 26
    aput-object v7, v6, v4

    .line 27
    .line 28
    const-string v7, "customTrace \'%s\' has been stopped"

    .line 29
    .line 30
    invoke-static {v0, v7, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    sget-object v7, Lcom/huawei/agconnect/apms/custom/CustomTrace;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 35
    .line 36
    new-array v3, v3, [Ljava/lang/Object;

    .line 37
    .line 38
    aput-object v6, v3, v4

    .line 39
    .line 40
    aput-object p1, v3, v5

    .line 41
    .line 42
    aput-object p2, v3, v2

    .line 43
    .line 44
    invoke-static {v0, v1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {v7, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->def:Ljava/util/Map;

    .line 53
    .line 54
    invoke-static {v0, p1}, Lcom/huawei/agconnect/apms/x1;->abc(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    sget-object v6, Lcom/huawei/agconnect/apms/custom/CustomTrace;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 61
    .line 62
    sget-object v7, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 63
    .line 64
    new-array v3, v3, [Ljava/lang/Object;

    .line 65
    .line 66
    aput-object v0, v3, v4

    .line 67
    .line 68
    aput-object p1, v3, v5

    .line 69
    .line 70
    aput-object p2, v3, v2

    .line 71
    .line 72
    invoke-static {v7, v1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-interface {v6, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_2
    new-instance v0, Ljava/util/AbstractMap$SimpleEntry;

    .line 81
    .line 82
    invoke-direct {v0, p1, p2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-static {v0}, Lcom/huawei/agconnect/apms/x1;->abc(Ljava/util/Map$Entry;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-eqz v0, :cond_3

    .line 90
    .line 91
    sget-object v6, Lcom/huawei/agconnect/apms/custom/CustomTrace;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 92
    .line 93
    sget-object v7, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 94
    .line 95
    new-array v3, v3, [Ljava/lang/Object;

    .line 96
    .line 97
    aput-object v0, v3, v4

    .line 98
    .line 99
    aput-object p1, v3, v5

    .line 100
    .line 101
    aput-object p2, v3, v2

    .line 102
    .line 103
    invoke-static {v7, v1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-interface {v6, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_3
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->def:Ljava/util/Map;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    return-void
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
    if-nez p1, :cond_1

    .line 9
    .line 10
    sget-object p1, Lcom/huawei/agconnect/apms/custom/CustomTrace;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 11
    .line 12
    const-string v0, "can\'t remove a property because the property name is null."

    .line 13
    .line 14
    invoke-interface {p1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/custom/CustomTrace;->bcd()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    sget-object p1, Lcom/huawei/agconnect/apms/custom/CustomTrace;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 25
    .line 26
    const-string v0, "can\'t remove a property from a customTrace which has been stopped."

    .line 27
    .line 28
    invoke-interface {p1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->def:Ljava/util/Map;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    return-void
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

.method public start()V
    .locals 5

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
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->abc:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/huawei/agconnect/apms/x1;->def(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    sget-object v1, Lcom/huawei/agconnect/apms/custom/CustomTrace;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 17
    .line 18
    invoke-interface {v1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->bcd:Ljava/lang/Long;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    sget-object v0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 27
    .line 28
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    new-array v2, v2, [Ljava/lang/Object;

    .line 32
    .line 33
    iget-object v3, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->abc:Ljava/lang/String;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    aput-object v3, v2, v4

    .line 37
    .line 38
    const-string v3, "customTrace \'%s\' has already started, should not start again."

    .line 39
    .line 40
    invoke-static {v1, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    invoke-static {}, Lcom/huawei/agconnect/apms/v1;->jkl()Lcom/huawei/agconnect/apms/v1;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0, p0}, Lcom/huawei/agconnect/apms/v1;->abc(Lcom/huawei/agconnect/apms/u1;)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, Lcom/huawei/agconnect/apms/v1;->jkl()Lcom/huawei/agconnect/apms/v1;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v0, v0, Lcom/huawei/agconnect/apms/v1;->abc:Lcom/huawei/agconnect/apms/util/Session;

    .line 60
    .line 61
    iget-object v1, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->fgh:Lorg/json/JSONArray;

    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/util/Session;->asJsonArray()Lorg/json/JSONArray;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 68
    .line 69
    .line 70
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 71
    .line 72
    .line 73
    move-result-wide v1

    .line 74
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iput-object v1, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->bcd:Ljava/lang/Long;

    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/util/Session;->isSampled()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    invoke-static {}, Lcom/huawei/agconnect/apms/e1;->cde()Lcom/huawei/agconnect/apms/e1;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/e1;->abc()V

    .line 91
    .line 92
    .line 93
    :cond_3
    return-void
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
    .locals 15

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
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/custom/CustomTrace;->abc()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x1

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    sget-object v0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 17
    .line 18
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 19
    .line 20
    new-array v2, v2, [Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v4, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->abc:Ljava/lang/String;

    .line 23
    .line 24
    aput-object v4, v2, v1

    .line 25
    .line 26
    const-string v1, "customTrace \'%s\' has not been started so unable to stop."

    .line 27
    .line 28
    invoke-static {v3, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/custom/CustomTrace;->bcd()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    sget-object v0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 43
    .line 44
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 45
    .line 46
    new-array v2, v2, [Ljava/lang/Object;

    .line 47
    .line 48
    iget-object v4, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->abc:Ljava/lang/String;

    .line 49
    .line 50
    aput-object v4, v2, v1

    .line 51
    .line 52
    const-string v1, "customTrace \'%s\' has already stopped, should not stop again."

    .line 53
    .line 54
    invoke-static {v3, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    invoke-static {}, Lcom/huawei/agconnect/apms/v1;->jkl()Lcom/huawei/agconnect/apms/v1;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0, p0}, Lcom/huawei/agconnect/apms/v1;->bcd(Lcom/huawei/agconnect/apms/u1;)V

    .line 67
    .line 68
    .line 69
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 70
    .line 71
    .line 72
    move-result-wide v0

    .line 73
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iput-object v0, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->cde:Ljava/lang/Long;

    .line 78
    .line 79
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->cde:Ljava/lang/Long;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide v0

    .line 85
    iget-object v2, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->bcd:Ljava/lang/Long;

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 88
    .line 89
    .line 90
    move-result-wide v2

    .line 91
    sub-long v8, v0, v2

    .line 92
    .line 93
    new-instance v0, Lcom/huawei/agconnect/apms/collect/model/event/custom/CustomEvent;

    .line 94
    .line 95
    iget-object v1, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->bcd:Ljava/lang/Long;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 98
    .line 99
    .line 100
    move-result-wide v5

    .line 101
    iget-object v1, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->abc:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    iget-object v10, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->fgh:Lorg/json/JSONArray;

    .line 108
    .line 109
    new-instance v11, Lorg/json/JSONArray;

    .line 110
    .line 111
    invoke-direct {v11}, Lorg/json/JSONArray;-><init>()V

    .line 112
    .line 113
    .line 114
    iget-object v1, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->def:Ljava/util/Map;

    .line 115
    .line 116
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_3

    .line 129
    .line 130
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    check-cast v2, Ljava/util/Map$Entry;

    .line 135
    .line 136
    new-instance v3, Lorg/json/JSONObject;

    .line 137
    .line 138
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 139
    .line 140
    .line 141
    :try_start_0
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    check-cast v4, Ljava/lang/String;

    .line 146
    .line 147
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :catch_0
    move-exception v2

    .line 156
    sget-object v4, Lcom/huawei/agconnect/apms/custom/CustomTrace;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 157
    .line 158
    const-string v12, "getPropertyArray"

    .line 159
    .line 160
    invoke-static {v12}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-interface {v4, v2}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    :goto_1
    invoke-virtual {v11, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 179
    .line 180
    .line 181
    goto :goto_0

    .line 182
    :cond_3
    new-instance v12, Lorg/json/JSONArray;

    .line 183
    .line 184
    invoke-direct {v12}, Lorg/json/JSONArray;-><init>()V

    .line 185
    .line 186
    .line 187
    iget-object v1, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->efg:Ljava/util/Map;

    .line 188
    .line 189
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-eqz v2, :cond_4

    .line 202
    .line 203
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    check-cast v2, Ljava/util/Map$Entry;

    .line 208
    .line 209
    new-instance v3, Lorg/json/JSONObject;

    .line 210
    .line 211
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 212
    .line 213
    .line 214
    :try_start_1
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    check-cast v4, Lcom/huawei/agconnect/apms/custom/TraceMeasure;

    .line 219
    .line 220
    invoke-virtual {v4}, Lcom/huawei/agconnect/apms/custom/TraceMeasure;->abc()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    check-cast v2, Lcom/huawei/agconnect/apms/custom/TraceMeasure;

    .line 229
    .line 230
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/custom/TraceMeasure;->bcd()J

    .line 231
    .line 232
    .line 233
    move-result-wide v13

    .line 234
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 239
    .line 240
    .line 241
    goto :goto_3

    .line 242
    :catch_1
    move-exception v2

    .line 243
    sget-object v4, Lcom/huawei/agconnect/apms/custom/CustomTrace;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 244
    .line 245
    const-string v13, "getMeasureArray "

    .line 246
    .line 247
    invoke-static {v13}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    move-result-object v13

    .line 251
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    invoke-interface {v4, v2}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    :goto_3
    invoke-virtual {v12, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 266
    .line 267
    .line 268
    goto :goto_2

    .line 269
    :cond_4
    move-object v4, v0

    .line 270
    invoke-direct/range {v4 .. v12}, Lcom/huawei/agconnect/apms/collect/model/event/custom/CustomEvent;-><init>(JLjava/lang/String;JLorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;)V

    .line 271
    .line 272
    .line 273
    invoke-static {v0}, Lcom/huawei/agconnect/apms/yza;->abc(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    invoke-static {}, Lcom/huawei/agconnect/apms/v1;->jkl()Lcom/huawei/agconnect/apms/v1;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    iget-object v0, v0, Lcom/huawei/agconnect/apms/v1;->abc:Lcom/huawei/agconnect/apms/util/Session;

    .line 281
    .line 282
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/util/Session;->isSampled()Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-eqz v0, :cond_5

    .line 287
    .line 288
    invoke-static {}, Lcom/huawei/agconnect/apms/e1;->cde()Lcom/huawei/agconnect/apms/e1;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/e1;->abc()V

    .line 293
    .line 294
    .line 295
    :cond_5
    return-void
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

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    iget-object p2, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->abc:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->bcd:Ljava/lang/Long;

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->cde:Ljava/lang/Long;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 22
    .line 23
    .line 24
    iget-object p2, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->def:Ljava/util/Map;

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 27
    .line 28
    .line 29
    iget-object p2, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->efg:Ljava/util/Map;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 32
    .line 33
    .line 34
    iget-object p2, p0, Lcom/huawei/agconnect/apms/custom/CustomTrace;->fgh:Lorg/json/JSONArray;

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void
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
