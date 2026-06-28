.class final enum Lcom/lody/virtual/client/core/VirtualCore$ProcessType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/core/VirtualCore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "ProcessType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/lody/virtual/client/core/VirtualCore$ProcessType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/lody/virtual/client/core/VirtualCore$ProcessType;

.field public static final enum CHILD:Lcom/lody/virtual/client/core/VirtualCore$ProcessType;

.field public static final enum Helper:Lcom/lody/virtual/client/core/VirtualCore$ProcessType;

.field public static final enum Main:Lcom/lody/virtual/client/core/VirtualCore$ProcessType;

.field public static final enum Server:Lcom/lody/virtual/client/core/VirtualCore$ProcessType;

.field public static final enum VAppClient:Lcom/lody/virtual/client/core/VirtualCore$ProcessType;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lcom/lody/virtual/client/core/VirtualCore$ProcessType;

    .line 2
    .line 3
    const-string v1, "Server"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/core/VirtualCore$ProcessType;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/lody/virtual/client/core/VirtualCore$ProcessType;->Server:Lcom/lody/virtual/client/core/VirtualCore$ProcessType;

    .line 10
    .line 11
    new-instance v1, Lcom/lody/virtual/client/core/VirtualCore$ProcessType;

    .line 12
    .line 13
    const-string v3, "VAppClient"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lcom/lody/virtual/client/core/VirtualCore$ProcessType;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/lody/virtual/client/core/VirtualCore$ProcessType;->VAppClient:Lcom/lody/virtual/client/core/VirtualCore$ProcessType;

    .line 20
    .line 21
    new-instance v3, Lcom/lody/virtual/client/core/VirtualCore$ProcessType;

    .line 22
    .line 23
    const-string v5, "Main"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lcom/lody/virtual/client/core/VirtualCore$ProcessType;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lcom/lody/virtual/client/core/VirtualCore$ProcessType;->Main:Lcom/lody/virtual/client/core/VirtualCore$ProcessType;

    .line 30
    .line 31
    new-instance v5, Lcom/lody/virtual/client/core/VirtualCore$ProcessType;

    .line 32
    .line 33
    const-string v7, "Helper"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lcom/lody/virtual/client/core/VirtualCore$ProcessType;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lcom/lody/virtual/client/core/VirtualCore$ProcessType;->Helper:Lcom/lody/virtual/client/core/VirtualCore$ProcessType;

    .line 40
    .line 41
    new-instance v7, Lcom/lody/virtual/client/core/VirtualCore$ProcessType;

    .line 42
    .line 43
    const-string v9, "CHILD"

    .line 44
    .line 45
    const/4 v10, 0x4

    .line 46
    invoke-direct {v7, v9, v10}, Lcom/lody/virtual/client/core/VirtualCore$ProcessType;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v7, Lcom/lody/virtual/client/core/VirtualCore$ProcessType;->CHILD:Lcom/lody/virtual/client/core/VirtualCore$ProcessType;

    .line 50
    .line 51
    const/4 v9, 0x5

    .line 52
    new-array v9, v9, [Lcom/lody/virtual/client/core/VirtualCore$ProcessType;

    .line 53
    .line 54
    aput-object v0, v9, v2

    .line 55
    .line 56
    aput-object v1, v9, v4

    .line 57
    .line 58
    aput-object v3, v9, v6

    .line 59
    .line 60
    aput-object v5, v9, v8

    .line 61
    .line 62
    aput-object v7, v9, v10

    .line 63
    .line 64
    sput-object v9, Lcom/lody/virtual/client/core/VirtualCore$ProcessType;->$VALUES:[Lcom/lody/virtual/client/core/VirtualCore$ProcessType;

    .line 65
    .line 66
    return-void
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

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/lody/virtual/client/core/VirtualCore$ProcessType;
    .locals 1

    const-class v0, Lcom/lody/virtual/client/core/VirtualCore$ProcessType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/lody/virtual/client/core/VirtualCore$ProcessType;

    return-object p0
.end method

.method public static values()[Lcom/lody/virtual/client/core/VirtualCore$ProcessType;
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/core/VirtualCore$ProcessType;->$VALUES:[Lcom/lody/virtual/client/core/VirtualCore$ProcessType;

    invoke-virtual {v0}, [Lcom/lody/virtual/client/core/VirtualCore$ProcessType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/lody/virtual/client/core/VirtualCore$ProcessType;

    return-object v0
.end method
