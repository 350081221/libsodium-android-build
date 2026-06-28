.class public Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation$abc;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "abc"
.end annotation


# static fields
.field public static final abc:Ljava/lang/Class;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "okhttp3.RealCall"

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    goto :goto_0

    .line 8
    :catch_0
    :try_start_1
    const-class v0, Lokhttp3/internal/connection/RealCall;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catch_1
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->access$000()Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "cannot found target class, some network metrics cannot be collected."

    .line 16
    .line 17
    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->access$000()Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "enhance network metrics initialization succeeded."

    .line 28
    .line 29
    invoke-interface {v1, v2}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    sput-object v0, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation$abc;->abc:Ljava/lang/Class;

    .line 33
    .line 34
    return-void
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
