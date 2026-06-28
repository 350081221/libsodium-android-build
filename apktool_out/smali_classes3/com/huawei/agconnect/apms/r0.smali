.class public Lcom/huawei/agconnect/apms/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static abc:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/huawei/agconnect/apms/p0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/agconnect/apms/r0;->abc:Ljava/util/Map;

    return-void
.end method

.method public static abc(Ljava/lang/String;Lcom/huawei/agconnect/apms/q0;)Landroid/os/MessageQueue$IdleHandler;
    .locals 1

    .line 1
    new-instance v0, Lcom/huawei/agconnect/apms/p0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/huawei/agconnect/apms/p0;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/huawei/agconnect/apms/p0;->abc(Lcom/huawei/agconnect/apms/q0;)V

    .line 7
    .line 8
    .line 9
    sget-object p1, Lcom/huawei/agconnect/apms/r0;->abc:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {p1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-object v0
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
