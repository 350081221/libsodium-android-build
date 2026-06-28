.class public Lcom/tendcloud/tenddata/dd;
.super Lcom/tendcloud/tenddata/cy;
.source "SourceFile"


# static fields
.field public static a:Lcom/tendcloud/tenddata/dc; = null

.field private static final c:Ljava/lang/String; = "type"

.field private static final d:Ljava/lang/String; = "deviceId"

.field private static final e:Ljava/lang/String; = "runtimeConfig"

.field private static final f:Ljava/lang/String; = "hardwareConfig"

.field private static final g:Ljava/lang/String; = "softwareConfig"


# instance fields
.field private h:Lcom/tendcloud/tenddata/de;

.field private i:Lcom/tendcloud/tenddata/db;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/cy;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/tendcloud/tenddata/de;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/tendcloud/tenddata/de;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/tendcloud/tenddata/dd;->h:Lcom/tendcloud/tenddata/de;

    .line 10
    .line 11
    new-instance v0, Lcom/tendcloud/tenddata/db;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/tendcloud/tenddata/db;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/tendcloud/tenddata/dd;->i:Lcom/tendcloud/tenddata/db;

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/tendcloud/tenddata/dd;->d()V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
.end method

.method private d()V
    .locals 2

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    const-string v1, "mobile"

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/tendcloud/tenddata/dc;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/tendcloud/tenddata/dc;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/tendcloud/tenddata/dd;->a:Lcom/tendcloud/tenddata/dc;

    .line 14
    .line 15
    const-string v1, "deviceId"

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/cy;->b()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0, v1, v0}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Lcom/tendcloud/tenddata/dg;

    .line 25
    .line 26
    invoke-direct {v0}, Lcom/tendcloud/tenddata/dg;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v1, "runtimeConfig"

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/cy;->b()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0, v1, v0}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/tendcloud/tenddata/dd;->i:Lcom/tendcloud/tenddata/db;

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/cy;->b()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "hardwareConfig"

    .line 45
    .line 46
    invoke-virtual {p0, v1, v0}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lcom/tendcloud/tenddata/dd;->h:Lcom/tendcloud/tenddata/de;

    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/cy;->b()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v1, "softwareConfig"

    .line 56
    .line 57
    invoke-virtual {p0, v1, v0}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-void
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


# virtual methods
.method public a()Lcom/tendcloud/tenddata/de;
    .locals 1

    iget-object v0, p0, Lcom/tendcloud/tenddata/dd;->h:Lcom/tendcloud/tenddata/de;

    return-object v0
.end method

.method public c()Lcom/tendcloud/tenddata/db;
    .locals 1

    iget-object v0, p0, Lcom/tendcloud/tenddata/dd;->i:Lcom/tendcloud/tenddata/db;

    return-object v0
.end method
