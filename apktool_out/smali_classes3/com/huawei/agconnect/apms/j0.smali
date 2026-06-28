.class public final enum Lcom/huawei/agconnect/apms/j0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/huawei/agconnect/apms/j0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum bcd:Lcom/huawei/agconnect/apms/j0;

.field public static final enum cde:Lcom/huawei/agconnect/apms/j0;

.field public static final synthetic def:[Lcom/huawei/agconnect/apms/j0;


# instance fields
.field public final abc:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/huawei/agconnect/apms/j0;

    .line 2
    .line 3
    const-string v1, "queueIdle"

    .line 4
    .line 5
    const-string v2, "QUEUE_IDLE"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lcom/huawei/agconnect/apms/j0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/huawei/agconnect/apms/j0;->bcd:Lcom/huawei/agconnect/apms/j0;

    .line 12
    .line 13
    new-instance v1, Lcom/huawei/agconnect/apms/j0;

    .line 14
    .line 15
    const-string v2, "timeOut"

    .line 16
    .line 17
    const-string v4, "TIMEOUT"

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    invoke-direct {v1, v4, v5, v2}, Lcom/huawei/agconnect/apms/j0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lcom/huawei/agconnect/apms/j0;->cde:Lcom/huawei/agconnect/apms/j0;

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    new-array v2, v2, [Lcom/huawei/agconnect/apms/j0;

    .line 27
    .line 28
    aput-object v0, v2, v3

    .line 29
    .line 30
    aput-object v1, v2, v5

    .line 31
    .line 32
    sput-object v2, Lcom/huawei/agconnect/apms/j0;->def:[Lcom/huawei/agconnect/apms/j0;

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

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/huawei/agconnect/apms/j0;->abc:Ljava/lang/String;

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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/agconnect/apms/j0;
    .locals 1

    const-class v0, Lcom/huawei/agconnect/apms/j0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/huawei/agconnect/apms/j0;

    return-object p0
.end method

.method public static values()[Lcom/huawei/agconnect/apms/j0;
    .locals 1

    sget-object v0, Lcom/huawei/agconnect/apms/j0;->def:[Lcom/huawei/agconnect/apms/j0;

    invoke-virtual {v0}, [Lcom/huawei/agconnect/apms/j0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/agconnect/apms/j0;

    return-object v0
.end method
