.class final Lcom/bykv/a/a/a/a/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/Bridge;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bykv/a/a/a/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/bykv/a/a/a/a/b$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bykv/a/a/a/a/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Lcom/bykv/vk/openvk/api/proto/ValueSet;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    const-class p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    if-ne p3, p1, :cond_0

    .line 4
    .line 5
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 9
    .line 10
    if-eq p3, p1, :cond_8

    .line 11
    .line 12
    const-class p1, Ljava/lang/Integer;

    .line 13
    .line 14
    if-ne p3, p1, :cond_1

    .line 15
    .line 16
    goto :goto_3

    .line 17
    :cond_1
    sget-object p1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    if-eq p3, p1, :cond_7

    .line 20
    .line 21
    const-class p1, Ljava/lang/Long;

    .line 22
    .line 23
    if-ne p3, p1, :cond_2

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    sget-object p1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 27
    .line 28
    if-eq p3, p1, :cond_6

    .line 29
    .line 30
    const-class p1, Ljava/lang/Double;

    .line 31
    .line 32
    if-ne p3, p1, :cond_3

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_3
    sget-object p1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    if-eq p3, p1, :cond_5

    .line 38
    .line 39
    const-class p1, Ljava/lang/Float;

    .line 40
    .line 41
    if-ne p3, p1, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    const/4 p1, 0x0

    .line 45
    return-object p1

    .line 46
    :cond_5
    :goto_0
    new-instance p1, Ljava/lang/Float;

    .line 47
    .line 48
    const/4 p2, 0x0

    .line 49
    invoke-direct {p1, p2}, Ljava/lang/Float;-><init>(F)V

    .line 50
    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_6
    :goto_1
    new-instance p1, Ljava/lang/Double;

    .line 54
    .line 55
    const-wide/16 p2, 0x0

    .line 56
    .line 57
    invoke-direct {p1, p2, p3}, Ljava/lang/Double;-><init>(D)V

    .line 58
    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_7
    :goto_2
    new-instance p1, Ljava/lang/Long;

    .line 62
    .line 63
    const-wide/16 p2, 0x0

    .line 64
    .line 65
    invoke-direct {p1, p2, p3}, Ljava/lang/Long;-><init>(J)V

    .line 66
    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_8
    :goto_3
    new-instance p1, Ljava/lang/Integer;

    .line 70
    .line 71
    const/4 p2, 0x0

    .line 72
    invoke-direct {p1, p2}, Ljava/lang/Integer;-><init>(I)V

    .line 73
    .line 74
    .line 75
    return-object p1
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public values()Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 1

    sget-object v0, Lcom/bykv/a/a/a/a/b;->c:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-object v0
.end method
